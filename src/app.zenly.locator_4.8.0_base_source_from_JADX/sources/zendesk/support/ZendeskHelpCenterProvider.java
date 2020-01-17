package zendesk.support;

import android.annotation.SuppressLint;
import com.zendesk.logger.Logger;
import com.zendesk.service.C12004a;
import com.zendesk.service.C12008e;
import com.zendesk.service.ErrorResponse;
import com.zendesk.util.C12010a;
import com.zendesk.util.C12014d;
import com.zendesk.util.C12017g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

class ZendeskHelpCenterProvider implements HelpCenterProvider {
    /* access modifiers changed from: private */
    public final SupportBlipsProvider blipsProvider;
    /* access modifiers changed from: private */
    public final ZendeskHelpCenterService helpCenterService;
    /* access modifiers changed from: private */
    public final HelpCenterSessionCache helpCenterSessionCache;
    private final SupportSettingsProvider settingsProvider;
    /* access modifiers changed from: private */
    public final ZendeskTracker zendeskTracker;

    ZendeskHelpCenterProvider(SupportSettingsProvider supportSettingsProvider, SupportBlipsProvider supportBlipsProvider, ZendeskHelpCenterService zendeskHelpCenterService, HelpCenterSessionCache helpCenterSessionCache2, ZendeskTracker zendeskTracker2) {
        this.settingsProvider = supportSettingsProvider;
        this.blipsProvider = supportBlipsProvider;
        this.helpCenterService = zendeskHelpCenterService;
        this.helpCenterSessionCache = helpCenterSessionCache2;
        this.zendeskTracker = zendeskTracker2;
    }

    /* access modifiers changed from: private */
    public boolean checkSettingsAndVotingEnabled(C12008e<?> eVar, SupportSdkSettings supportSdkSettings) {
        if (!sanityCheckHelpCenterSettings(eVar, supportSdkSettings)) {
            if (supportSdkSettings.isHelpCenterArticleVotingEnabled()) {
                return true;
            }
            String str = "Help Center voting is disabled in your app's settings. Can not continue with the call";
            Logger.m31610b("ZendeskHelpCenterProvider", str, new Object[0]);
            if (eVar != null) {
                eVar.onError(new C12004a(str));
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public List<HelpItem> convert(HelpResponse helpResponse) {
        if (helpResponse == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (CategoryItem categoryItem : helpResponse.getCategories()) {
            arrayList.add(categoryItem);
            for (SectionItem sectionItem : categoryItem.getSections()) {
                arrayList.add(sectionItem);
                arrayList.addAll(sectionItem.getChildren());
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: 0000 */
    @SuppressLint({"UseSparseArrays"})
    public List<SearchArticle> asSearchArticleList(ArticlesResponse articlesResponse) {
        Section section;
        ArrayList arrayList = new ArrayList();
        if (articlesResponse == null) {
            return arrayList;
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        List<Article> b = C12010a.m31638b(articlesResponse.getArticles());
        List<Section> b2 = C12010a.m31638b(articlesResponse.getSections());
        List<Category> b3 = C12010a.m31638b(articlesResponse.getCategories());
        List<User> b4 = C12010a.m31638b(articlesResponse.getUsers());
        for (Section section2 : b2) {
            if (section2.getId() != null) {
                hashMap.put(section2.getId(), section2);
            }
        }
        for (Category category : b3) {
            if (category.getId() != null) {
                hashMap2.put(category.getId(), category);
            }
        }
        for (User user : b4) {
            if (user.getId() != null) {
                hashMap3.put(user.getId(), user);
            }
        }
        for (Article article : b) {
            Category category2 = null;
            String str = "ZendeskHelpCenterProvider";
            if (article.getSectionId() != null) {
                section = (Section) hashMap.get(article.getSectionId());
            } else {
                Logger.m31614d(str, "Unable to determine section as section id was null.", new Object[0]);
                section = null;
            }
            if (section == null || section.getCategoryId() == null) {
                Logger.m31614d(str, "Unable to determine category as section was null.", new Object[0]);
            } else {
                category2 = (Category) hashMap2.get(section.getCategoryId());
            }
            if (article.getAuthorId() != null) {
                article.setAuthor((User) hashMap3.get(article.getAuthorId()));
            } else {
                Logger.m31614d(str, "Unable to determine author as author id was null.", new Object[0]);
            }
            arrayList.add(new SearchArticle(article, section, category2));
        }
        return arrayList;
    }

    public void deleteVote(final Long l, final C12008e<Void> eVar) {
        if (!sanityCheck(eVar, l)) {
            this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(eVar) {
                public void onSuccess(SupportSdkSettings supportSdkSettings) {
                    if (ZendeskHelpCenterProvider.this.checkSettingsAndVotingEnabled(eVar, supportSdkSettings)) {
                        ZendeskHelpCenterProvider.this.helpCenterService.deleteVote(l, new ZendeskCallbackSuccess<Void>(eVar) {
                            public void onSuccess(Void voidR) {
                                C12008e eVar = eVar;
                                if (eVar != null) {
                                    eVar.onSuccess(voidR);
                                }
                            }
                        });
                    }
                }
            });
        }
    }

    public void downvoteArticle(final Long l, final C12008e<ArticleVote> eVar) {
        if (!sanityCheck(eVar, l)) {
            this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(eVar) {
                public void onSuccess(SupportSdkSettings supportSdkSettings) {
                    if (ZendeskHelpCenterProvider.this.checkSettingsAndVotingEnabled(eVar, supportSdkSettings)) {
                        ZendeskHelpCenterProvider.this.helpCenterService.downvoteArticle(l, "{}", new ZendeskCallbackSuccess<ArticleVoteResponse>(eVar) {
                            public void onSuccess(ArticleVoteResponse articleVoteResponse) {
                                C12008e eVar = eVar;
                                if (eVar != null) {
                                    eVar.onSuccess(articleVoteResponse.getVote());
                                }
                                ZendeskHelpCenterProvider.this.blipsProvider.articleVote(l, -1);
                            }
                        });
                    }
                }
            });
        }
    }

    public void getArticle(final Long l, final C12008e<Article> eVar) {
        if (!sanityCheck(eVar, l)) {
            this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(eVar) {
                public void onSuccess(SupportSdkSettings supportSdkSettings) {
                    if (!ZendeskHelpCenterProvider.this.sanityCheckHelpCenterSettings(eVar, supportSdkSettings)) {
                        ZendeskHelpCenterProvider.this.helpCenterService.getArticle(l, ZendeskHelpCenterProvider.this.getLocale(supportSdkSettings), "users", new ZendeskCallbackSuccess<Article>(eVar) {
                            public void onSuccess(Article article) {
                                ZendeskHelpCenterProvider.this.submitRecordArticleView(article, C12014d.m31648a(article.getLocale()), new C12008e<Void>(this) {
                                    public void onError(ErrorResponse errorResponse) {
                                        Logger.m31610b("ZendeskHelpCenterProvider", "Error submitting Help Center reporting: [reason] %s [isNetworkError] %s [status] %d", errorResponse.getReason(), Boolean.valueOf(errorResponse.isNetworkError()), Integer.valueOf(errorResponse.getStatus()));
                                    }

                                    public void onSuccess(Void voidR) {
                                    }
                                });
                                C12008e eVar = eVar;
                                if (eVar != null) {
                                    eVar.onSuccess(article);
                                }
                            }
                        });
                    }
                }
            });
        }
    }

    public void getArticles(Long l, C12008e<List<Article>> eVar) {
        getArticles(l, null, eVar);
    }

    public void getAttachments(Long l, AttachmentType attachmentType, C12008e<List<HelpCenterAttachment>> eVar) {
        if (!sanityCheck(eVar, l, attachmentType)) {
            SupportSettingsProvider supportSettingsProvider = this.settingsProvider;
            final C12008e<List<HelpCenterAttachment>> eVar2 = eVar;
            final Long l2 = l;
            final AttachmentType attachmentType2 = attachmentType;
            C1364111 r1 = new ZendeskCallbackSuccess<SupportSdkSettings>(eVar) {
                public void onSuccess(SupportSdkSettings supportSdkSettings) {
                    if (!ZendeskHelpCenterProvider.this.sanityCheckHelpCenterSettings(eVar2, supportSdkSettings)) {
                        ZendeskHelpCenterProvider.this.helpCenterService.getAttachments(ZendeskHelpCenterProvider.this.getLocale(supportSdkSettings), l2, attachmentType2, eVar2);
                    }
                }
            };
            supportSettingsProvider.getSettings(r1);
        }
    }

    public void getCategories(final C12008e<List<Category>> eVar) {
        if (!sanityCheck(eVar, new Object[0])) {
            this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(eVar) {
                public void onSuccess(SupportSdkSettings supportSdkSettings) {
                    if (!ZendeskHelpCenterProvider.this.sanityCheckHelpCenterSettings(eVar, supportSdkSettings)) {
                        ZendeskHelpCenterProvider.this.helpCenterService.getCategories(ZendeskHelpCenterProvider.this.getLocale(supportSdkSettings), eVar);
                    }
                }
            });
        }
    }

    public void getCategory(final Long l, final C12008e<Category> eVar) {
        if (!sanityCheck(eVar, l)) {
            this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(eVar) {
                public void onSuccess(SupportSdkSettings supportSdkSettings) {
                    if (!ZendeskHelpCenterProvider.this.sanityCheckHelpCenterSettings(eVar, supportSdkSettings)) {
                        ZendeskHelpCenterProvider.this.helpCenterService.getCategoryById(l, ZendeskHelpCenterProvider.this.getLocale(supportSdkSettings), eVar);
                    }
                }
            });
        }
    }

    public void getHelp(final HelpRequest helpRequest, final C12008e<List<HelpItem>> eVar) {
        this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(eVar) {
            public void onSuccess(SupportSdkSettings supportSdkSettings) {
                if (!ZendeskHelpCenterProvider.this.sanityCheckHelpCenterSettings(eVar, supportSdkSettings)) {
                    ZendeskHelpCenterProvider.this.helpCenterService.getHelp(ZendeskHelpCenterProvider.this.getLocale(supportSdkSettings), helpRequest.getCategoryIds(), helpRequest.getSectionIds(), helpRequest.getIncludes(), helpRequest.getArticlesPerPageLimit(), C12017g.m31657b(helpRequest.getLabelNames()), new ZendeskCallbackSuccess<HelpResponse>(eVar) {
                        public void onSuccess(HelpResponse helpResponse) {
                            ZendeskHelpCenterProvider.this.zendeskTracker.helpCenterLoaded();
                            C136381 r0 = C136381.this;
                            C12008e eVar = eVar;
                            if (eVar != null) {
                                eVar.onSuccess(ZendeskHelpCenterProvider.this.convert(helpResponse));
                            }
                        }
                    });
                }
            }
        });
    }

    /* access modifiers changed from: 0000 */
    public Locale getLocale(SupportSdkSettings supportSdkSettings) {
        if (Support.INSTANCE.getHelpCenterLocaleOverride() != null) {
            return Support.INSTANCE.getHelpCenterLocaleOverride();
        }
        String helpCenterLocale = supportSdkSettings != null ? supportSdkSettings.getHelpCenterLocale() : "";
        return C12017g.m31659c(helpCenterLocale) ? Locale.getDefault() : C12014d.m31648a(helpCenterLocale);
    }

    public void getSection(final Long l, final C12008e<Section> eVar) {
        if (!sanityCheck(eVar, l)) {
            this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(eVar) {
                public void onSuccess(SupportSdkSettings supportSdkSettings) {
                    if (!ZendeskHelpCenterProvider.this.sanityCheckHelpCenterSettings(eVar, supportSdkSettings)) {
                        ZendeskHelpCenterProvider.this.helpCenterService.getSectionById(l, ZendeskHelpCenterProvider.this.getLocale(supportSdkSettings), eVar);
                    }
                }
            });
        }
    }

    public void getSections(final Long l, final C12008e<List<Section>> eVar) {
        if (!sanityCheck(eVar, l)) {
            this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(eVar) {
                public void onSuccess(SupportSdkSettings supportSdkSettings) {
                    if (!ZendeskHelpCenterProvider.this.sanityCheckHelpCenterSettings(eVar, supportSdkSettings)) {
                        ZendeskHelpCenterProvider.this.helpCenterService.getSectionsForCategory(l, ZendeskHelpCenterProvider.this.getLocale(supportSdkSettings), eVar);
                    }
                }
            });
        }
    }

    public void getSuggestedArticles(final SuggestedArticleSearch suggestedArticleSearch, final C12008e<Object> eVar) {
        if (!sanityCheck(eVar, suggestedArticleSearch)) {
            this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(eVar) {
                public void onSuccess(SupportSdkSettings supportSdkSettings) {
                    if (!ZendeskHelpCenterProvider.this.sanityCheckHelpCenterSettings(eVar, supportSdkSettings)) {
                        suggestedArticleSearch.getLocale();
                        throw null;
                    }
                }
            });
        }
    }

    public void listArticles(final ListArticleQuery listArticleQuery, final C12008e<List<SearchArticle>> eVar) {
        if (!sanityCheck(eVar, listArticleQuery)) {
            this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(eVar) {
                public void onSuccess(SupportSdkSettings supportSdkSettings) {
                    if (!ZendeskHelpCenterProvider.this.sanityCheckHelpCenterSettings(eVar, supportSdkSettings)) {
                        listArticleQuery.getInclude();
                        throw null;
                    }
                }
            });
        }
    }

    public void listArticlesFlat(final ListArticleQuery listArticleQuery, final C12008e<List<Object>> eVar) {
        if (!sanityCheck(eVar, listArticleQuery)) {
            this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(eVar) {
                public void onSuccess(SupportSdkSettings supportSdkSettings) {
                    if (!ZendeskHelpCenterProvider.this.sanityCheckHelpCenterSettings(eVar, supportSdkSettings)) {
                        listArticleQuery.getLocale();
                        throw null;
                    }
                }
            });
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean sanityCheck(C12008e<?> eVar, Object... objArr) {
        if (objArr != null) {
            boolean z = true;
            for (Object obj : objArr) {
                if (obj == null) {
                    z = false;
                }
            }
            if (!z) {
                String str = "One or more provided parameters are null.";
                Logger.m31610b("ZendeskHelpCenterProvider", str, new Object[0]);
                if (eVar != null) {
                    eVar.onError(new C12004a(str));
                }
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public boolean sanityCheckHelpCenterSettings(C12008e<?> eVar, SupportSdkSettings supportSdkSettings) {
        String str = "ZendeskHelpCenterProvider";
        if (!supportSdkSettings.hasHelpCenterSettings()) {
            String str2 = "Help Center settings are null. Can not continue with the call";
            Logger.m31610b(str, str2, new Object[0]);
            if (eVar != null) {
                eVar.onError(new C12004a(str2));
            }
            return true;
        } else if (supportSdkSettings.isHelpCenterEnabled()) {
            return false;
        } else {
            String str3 = "Help Center is disabled in your app's settings. Can not continue with the call";
            Logger.m31610b(str, str3, new Object[0]);
            if (eVar != null) {
                eVar.onError(new C12004a(str3));
            }
            return true;
        }
    }

    public void searchArticles(final HelpCenterSearch helpCenterSearch, final C12008e<List<SearchArticle>> eVar) {
        if (!sanityCheck(eVar, helpCenterSearch)) {
            this.blipsProvider.helpCenterSearch(helpCenterSearch.getQuery());
            this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(eVar) {
                public void onSuccess(SupportSdkSettings supportSdkSettings) {
                    String str;
                    String str2;
                    Locale locale;
                    if (!ZendeskHelpCenterProvider.this.sanityCheckHelpCenterSettings(eVar, supportSdkSettings)) {
                        if (C12017g.m31659c(helpCenterSearch.getInclude())) {
                            str = C12017g.m31657b("categories", "sections", "users");
                        } else {
                            str = C12017g.m31657b(helpCenterSearch.getInclude());
                        }
                        String str3 = str;
                        if (C12017g.m31659c(helpCenterSearch.getLabelNames())) {
                            str2 = null;
                        } else {
                            str2 = C12017g.m31657b(helpCenterSearch.getLabelNames());
                        }
                        String str4 = str2;
                        if (helpCenterSearch.getLocale() == null) {
                            locale = ZendeskHelpCenterProvider.this.getLocale(supportSdkSettings);
                        } else {
                            locale = helpCenterSearch.getLocale();
                        }
                        ZendeskHelpCenterProvider.this.helpCenterService.searchArticles(helpCenterSearch.getQuery(), locale, str3, str4, helpCenterSearch.getCategoryIds(), helpCenterSearch.getSectionIds(), helpCenterSearch.getPage(), helpCenterSearch.getPerPage(), new ZendeskCallbackSuccess<ArticlesSearchResponse>(eVar) {
                            public void onSuccess(ArticlesSearchResponse articlesSearchResponse) {
                                ZendeskHelpCenterProvider.this.zendeskTracker.helpCenterSearched(helpCenterSearch.getQuery());
                                ZendeskHelpCenterProvider.this.helpCenterSessionCache.setLastSearch(helpCenterSearch.getQuery(), (articlesSearchResponse == null || !C12010a.m31639b((Collection<Type>) articlesSearchResponse.getArticles())) ? 0 : articlesSearchResponse.getArticles().size());
                                List asSearchArticleList = ZendeskHelpCenterProvider.this.asSearchArticleList(articlesSearchResponse);
                                C12008e eVar = eVar;
                                if (eVar != null) {
                                    eVar.onSuccess(asSearchArticleList);
                                }
                            }
                        });
                    }
                }
            });
        }
    }

    public void submitRecordArticleView(Article article, Locale locale, C12008e<Void> eVar) {
        if (!sanityCheck(eVar, article)) {
            this.zendeskTracker.helpCenterArticleViewed();
            this.blipsProvider.articleView(article);
            SupportSettingsProvider supportSettingsProvider = this.settingsProvider;
            final C12008e<Void> eVar2 = eVar;
            final Article article2 = article;
            final Locale locale2 = locale;
            C1364916 r1 = new ZendeskCallbackSuccess<SupportSdkSettings>(eVar) {
                public void onSuccess(SupportSdkSettings supportSdkSettings) {
                    if (!ZendeskHelpCenterProvider.this.sanityCheckHelpCenterSettings(eVar2, supportSdkSettings)) {
                        ZendeskHelpCenterProvider.this.helpCenterService.submitRecordArticleView(article2.getId(), locale2, new RecordArticleViewRequest(ZendeskHelpCenterProvider.this.helpCenterSessionCache.getLastSearch(), ZendeskHelpCenterProvider.this.helpCenterSessionCache.isUniqueSearchResultClick()), new ZendeskCallbackSuccess<Void>(eVar2) {
                            public void onSuccess(Void voidR) {
                                ZendeskHelpCenterProvider.this.helpCenterSessionCache.unsetUniqueSearchResultClick();
                                C12008e eVar = eVar2;
                                if (eVar != null) {
                                    eVar.onSuccess(voidR);
                                }
                            }
                        });
                    }
                }
            };
            supportSettingsProvider.getSettings(r1);
        }
    }

    public void upvoteArticle(final Long l, final C12008e<ArticleVote> eVar) {
        if (!sanityCheck(eVar, l)) {
            this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(eVar) {
                public void onSuccess(SupportSdkSettings supportSdkSettings) {
                    if (ZendeskHelpCenterProvider.this.checkSettingsAndVotingEnabled(eVar, supportSdkSettings)) {
                        ZendeskHelpCenterProvider.this.helpCenterService.upvoteArticle(l, "{}", new ZendeskCallbackSuccess<ArticleVoteResponse>(eVar) {
                            public void onSuccess(ArticleVoteResponse articleVoteResponse) {
                                C12008e eVar = eVar;
                                if (eVar != null) {
                                    eVar.onSuccess(articleVoteResponse.getVote());
                                }
                                ZendeskHelpCenterProvider.this.blipsProvider.articleVote(l, 1);
                            }
                        });
                    }
                }
            });
        }
    }

    public void getArticles(Long l, String str, C12008e<List<Article>> eVar) {
        if (!sanityCheck(eVar, l)) {
            SupportSettingsProvider supportSettingsProvider = this.settingsProvider;
            final C12008e<List<Article>> eVar2 = eVar;
            final Long l2 = l;
            final String str2 = str;
            C136534 r1 = new ZendeskCallbackSuccess<SupportSdkSettings>(eVar) {
                public void onSuccess(SupportSdkSettings supportSdkSettings) {
                    if (!ZendeskHelpCenterProvider.this.sanityCheckHelpCenterSettings(eVar2, supportSdkSettings)) {
                        ZendeskHelpCenterProvider.this.helpCenterService.getArticlesForSection(l2, ZendeskHelpCenterProvider.this.getLocale(supportSdkSettings), "users", str2, eVar2);
                    }
                }
            };
            supportSettingsProvider.getSettings(r1);
        }
    }
}
