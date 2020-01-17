package zendesk.support;

import com.android.volley.toolbox.C8733j;
import com.zendesk.logger.Logger;
import com.zendesk.service.C12004a;
import com.zendesk.service.C12008e;
import com.zendesk.service.RetrofitZendeskCallbackAdapter;
import com.zendesk.service.RetrofitZendeskCallbackAdapter.RequestExtractor;
import com.zendesk.util.C12010a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

class ZendeskHelpCenterService {
    private final HelpCenterService helpCenterService;
    private final HelpCenterLocaleConverter localeConverter;

    ZendeskHelpCenterService(HelpCenterService helpCenterService2, HelpCenterLocaleConverter helpCenterLocaleConverter) {
        this.helpCenterService = helpCenterService2;
        this.localeConverter = helpCenterLocaleConverter;
    }

    public void deleteVote(Long l, C12008e<Void> eVar) {
        if (l == null) {
            String str = "The vote id was null, can not delete the vote";
            Logger.m31610b("ZendeskHelpCenterService", str, new Object[0]);
            if (eVar != null) {
                eVar.onError(new C12004a(str));
            }
            return;
        }
        this.helpCenterService.deleteVote(l).enqueue(new RetrofitZendeskCallbackAdapter(eVar));
    }

    public void downvoteArticle(Long l, String str, C12008e<ArticleVoteResponse> eVar) {
        if (l == null) {
            String str2 = "The article id was null, can not create down vote";
            Logger.m31610b("ZendeskHelpCenterService", str2, new Object[0]);
            if (eVar != null) {
                eVar.onError(new C12004a(str2));
            }
            return;
        }
        this.helpCenterService.downvoteArticle(l, str).enqueue(new RetrofitZendeskCallbackAdapter(eVar));
    }

    public void getArticle(Long l, Locale locale, String str, C12008e<Article> eVar) {
        this.helpCenterService.getArticle(this.localeConverter.toHelpCenterLocaleString(locale), l, str).enqueue(new RetrofitZendeskCallbackAdapter(eVar, new RequestExtractor<ArticleResponse, Article>() {
            public Article extract(ArticleResponse articleResponse) {
                return ZendeskHelpCenterService.this.matchArticleWithUsers(articleResponse.getArticle(), C12010a.m31638b(articleResponse.getUsers()));
            }
        }));
    }

    /* access modifiers changed from: 0000 */
    public void getArticlesForSection(Long l, Locale locale, String str, String str2, C12008e<List<Article>> eVar) {
        this.helpCenterService.getArticles(this.localeConverter.toHelpCenterLocaleString(locale), l, str2, str, C8733j.DEFAULT_IMAGE_TIMEOUT_MS).enqueue(new RetrofitZendeskCallbackAdapter(eVar, new RequestExtractor<ArticlesListResponse, List<Article>>() {
            public List<Article> extract(ArticlesListResponse articlesListResponse) {
                return ZendeskHelpCenterService.this.matchArticlesWithUsers(articlesListResponse.getUsers(), articlesListResponse.getArticles());
            }
        }));
    }

    public void getAttachments(Locale locale, Long l, AttachmentType attachmentType, C12008e<List<HelpCenterAttachment>> eVar) {
        if (attachmentType == null) {
            String str = "getAttachments() was called with null attachment type";
            Logger.m31610b("ZendeskHelpCenterService", str, new Object[0]);
            if (eVar != null) {
                eVar.onError(new C12004a(str));
            }
            return;
        }
        this.helpCenterService.getAttachments(this.localeConverter.toHelpCenterLocaleString(locale), l, attachmentType.getAttachmentType()).enqueue(new RetrofitZendeskCallbackAdapter(eVar, new RequestExtractor<AttachmentResponse, List<HelpCenterAttachment>>(this) {
            public List<HelpCenterAttachment> extract(AttachmentResponse attachmentResponse) {
                return attachmentResponse.getArticleAttachments();
            }
        }));
    }

    public void getCategories(Locale locale, C12008e<List<Category>> eVar) {
        this.helpCenterService.getCategories(this.localeConverter.toHelpCenterLocaleString(locale)).enqueue(new RetrofitZendeskCallbackAdapter(eVar, new RequestExtractor<CategoriesResponse, List<Category>>(this) {
            public List<Category> extract(CategoriesResponse categoriesResponse) {
                return categoriesResponse.getCategories();
            }
        }));
    }

    public void getCategoryById(Long l, Locale locale, C12008e<Category> eVar) {
        this.helpCenterService.getCategoryById(this.localeConverter.toHelpCenterLocaleString(locale), l).enqueue(new RetrofitZendeskCallbackAdapter(eVar, new RequestExtractor<CategoryResponse, Category>(this) {
            public Category extract(CategoryResponse categoryResponse) {
                return categoryResponse.getCategory();
            }
        }));
    }

    /* access modifiers changed from: 0000 */
    public void getHelp(Locale locale, String str, String str2, String str3, int i, String str4, C12008e<HelpResponse> eVar) {
        Locale locale2 = locale;
        this.helpCenterService.getHelp(this.localeConverter.toHelpCenterLocaleString(locale), str, str2, str3, i, str4, C8733j.DEFAULT_IMAGE_TIMEOUT_MS, SortBy.CREATED_AT.getApiValue(), SortOrder.DESCENDING.getApiValue()).enqueue(new RetrofitZendeskCallbackAdapter(eVar));
    }

    public void getSectionById(Long l, Locale locale, C12008e<Section> eVar) {
        this.helpCenterService.getSectionById(this.localeConverter.toHelpCenterLocaleString(locale), l).enqueue(new RetrofitZendeskCallbackAdapter(eVar, new RequestExtractor<SectionResponse, Section>(this) {
            public Section extract(SectionResponse sectionResponse) {
                return sectionResponse.getSection();
            }
        }));
    }

    public void getSectionsForCategory(Long l, Locale locale, C12008e<List<Section>> eVar) {
        this.helpCenterService.getSections(this.localeConverter.toHelpCenterLocaleString(locale), l, C8733j.DEFAULT_IMAGE_TIMEOUT_MS).enqueue(new RetrofitZendeskCallbackAdapter(eVar, new RequestExtractor<SectionsResponse, List<Section>>(this) {
            public List<Section> extract(SectionsResponse sectionsResponse) {
                return sectionsResponse.getSections();
            }
        }));
    }

    /* access modifiers changed from: 0000 */
    public Article matchArticleWithUsers(Article article, List<User> list) {
        if (article == null) {
            return new Article();
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            User user = (User) it.next();
            if (user.getId() != null && user.getId().equals(article.getAuthorId())) {
                article.setAuthor(user);
                break;
            }
        }
        return article;
    }

    /* access modifiers changed from: 0000 */
    public List<Article> matchArticlesWithUsers(List<User> list, List<Article> list2) {
        HashMap hashMap = new HashMap();
        for (User user : list) {
            hashMap.put(user.getId(), user);
        }
        ArrayList arrayList = new ArrayList();
        for (Article article : list2) {
            User user2 = (User) hashMap.get(article.getAuthorId());
            if (user2 != null) {
                article.setAuthor(user2);
            }
            arrayList.add(article);
        }
        return arrayList;
    }

    public void searchArticles(String str, Locale locale, String str2, String str3, String str4, String str5, Integer num, Integer num2, C12008e<ArticlesSearchResponse> eVar) {
        Locale locale2 = locale;
        this.helpCenterService.searchArticles(str, this.localeConverter.toHelpCenterLocaleString(locale), str2, str3, str4, str5, num, num2).enqueue(new RetrofitZendeskCallbackAdapter(eVar));
    }

    public void submitRecordArticleView(Long l, Locale locale, RecordArticleViewRequest recordArticleViewRequest, C12008e<Void> eVar) {
        this.helpCenterService.submitRecordArticleView(l, this.localeConverter.toHelpCenterLocaleString(locale), recordArticleViewRequest).enqueue(new RetrofitZendeskCallbackAdapter(eVar));
    }

    public void upvoteArticle(Long l, String str, C12008e<ArticleVoteResponse> eVar) {
        if (l == null) {
            String str2 = "The article id was null, can not create up vote";
            Logger.m31610b("ZendeskHelpCenterService", str2, new Object[0]);
            if (eVar != null) {
                eVar.onError(new C12004a(str2));
            }
            return;
        }
        this.helpCenterService.upvoteArticle(l, str).enqueue(new RetrofitZendeskCallbackAdapter(eVar));
    }
}
