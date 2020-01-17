package zendesk.support.guide;

import com.zendesk.logger.Logger;
import com.zendesk.service.C12008e;
import com.zendesk.service.ErrorResponse;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import zendesk.core.NetworkAware;
import zendesk.core.NetworkInfoProvider;
import zendesk.core.RetryAction;
import zendesk.support.SearchArticle;
import zendesk.support.SupportSdkSettings;

class HelpCenterPresenter implements HelpCenterMvp$Presenter, NetworkAware {
    private static final Integer NETWORK_AWARE_ID = Integer.valueOf(31);
    private static final Integer RETRY_ACTION_ID = Integer.valueOf(8642);
    /* access modifiers changed from: private */
    public HelpCenterUiConfig config;
    /* access modifiers changed from: private */
    public Set<RetryAction> internalRetryActions = new HashSet();
    /* access modifiers changed from: private */
    public SupportSdkSettings mobileSettings;
    private HelpCenterMvp$Model model;
    private NetworkInfoProvider networkInfoProvider;
    private boolean networkPreviouslyUnavailable;
    /* access modifiers changed from: private */
    public HelpCenterMvp$View view;

    class ViewSafeRetryZendeskCallback extends C12008e<List<SearchArticle>> {
        /* access modifiers changed from: private */
        public String query;

        ViewSafeRetryZendeskCallback(String str) {
            this.query = str;
        }

        public void onError(final ErrorResponse errorResponse) {
            if (HelpCenterPresenter.this.view != null) {
                HelpCenterPresenter.this.view.hideLoadingState();
                HelpCenterPresenter.this.view.showLoadArticleErrorWithRetry(HelpCenterMvp$ErrorType.ARTICLES_LOAD, new RetryAction() {
                    public void onRetry() {
                        ViewSafeRetryZendeskCallback viewSafeRetryZendeskCallback = ViewSafeRetryZendeskCallback.this;
                        HelpCenterPresenter.this.onSearchSubmit(viewSafeRetryZendeskCallback.query);
                    }
                });
                return;
            }
            HelpCenterPresenter.this.internalRetryActions.add(new RetryAction() {
                public void onRetry() {
                    ViewSafeRetryZendeskCallback.this.onError(errorResponse);
                }
            });
        }

        public void onSuccess(final List<SearchArticle> list) {
            if (HelpCenterPresenter.this.view != null) {
                HelpCenterPresenter.this.view.hideLoadingState();
                HelpCenterPresenter.this.view.showSearchResults(list, this.query);
                if (HelpCenterPresenter.this.config.isContactUsButtonVisible()) {
                    HelpCenterPresenter.this.view.showContactUsButton();
                    return;
                }
                return;
            }
            HelpCenterPresenter.this.internalRetryActions.add(new RetryAction() {
                public void onRetry() {
                    ViewSafeRetryZendeskCallback.this.onSuccess(list);
                }
            });
        }
    }

    HelpCenterPresenter(HelpCenterMvp$View helpCenterMvp$View, HelpCenterMvp$Model helpCenterMvp$Model, NetworkInfoProvider networkInfoProvider2) {
        this.view = helpCenterMvp$View;
        this.model = helpCenterMvp$Model;
        this.networkInfoProvider = networkInfoProvider2;
        this.mobileSettings = new SupportSdkSettings(null, null, null);
    }

    private void invokeRetryActions() {
        for (RetryAction onRetry : this.internalRetryActions) {
            onRetry.onRetry();
        }
        this.internalRetryActions.clear();
    }

    public void init(final HelpCenterUiConfig helpCenterUiConfig) {
        this.config = helpCenterUiConfig;
        this.view.showLoadingState();
        this.model.getSettings(new C12008e<SupportSdkSettings>() {
            public void onError(ErrorResponse errorResponse) {
                String str = "HelpCenterActivity";
                Logger.m31610b(str, "Failed to get mobile settings. Cannot determine start screen.", new Object[0]);
                Logger.m31606a(str, errorResponse);
                if (HelpCenterPresenter.this.view != null) {
                    HelpCenterPresenter.this.view.hideLoadingState();
                    HelpCenterPresenter.this.view.exitActivity();
                    return;
                }
                HelpCenterPresenter.this.internalRetryActions.add(new RetryAction() {
                    public void onRetry() {
                        HelpCenterPresenter.this.view.hideLoadingState();
                        HelpCenterPresenter.this.view.exitActivity();
                    }
                });
            }

            public void onSuccess(SupportSdkSettings supportSdkSettings) {
                if (HelpCenterPresenter.this.view != null) {
                    HelpCenterPresenter.this.view.hideLoadingState();
                } else {
                    HelpCenterPresenter.this.internalRetryActions.add(new RetryAction() {
                        public void onRetry() {
                            HelpCenterPresenter.this.view.hideLoadingState();
                        }
                    });
                }
                HelpCenterPresenter.this.mobileSettings = supportSdkSettings;
                String str = "HelpCenterActivity";
                if (supportSdkSettings.isHelpCenterEnabled()) {
                    Logger.m31608a(str, "Help center is enabled. starting with Help Center", new Object[0]);
                    if (HelpCenterPresenter.this.view != null) {
                        HelpCenterPresenter.this.view.showHelp(HelpCenterPresenter.this.config);
                    } else {
                        HelpCenterPresenter.this.internalRetryActions.add(new RetryAction() {
                            public void onRetry() {
                                HelpCenterPresenter.this.view.showHelp(HelpCenterPresenter.this.config);
                            }
                        });
                    }
                    if (helpCenterUiConfig.isContactUsButtonVisible()) {
                        Logger.m31608a(str, "Saved instance states that we should show the contact FAB", new Object[0]);
                        if (HelpCenterPresenter.this.view != null) {
                            HelpCenterPresenter.this.view.showContactUsButton();
                        } else {
                            HelpCenterPresenter.this.internalRetryActions.add(new RetryAction() {
                                public void onRetry() {
                                    HelpCenterPresenter.this.view.showContactUsButton();
                                }
                            });
                        }
                    }
                } else {
                    Logger.m31608a(str, "Help center is disabled", new Object[0]);
                    if (supportSdkSettings.isConversationsEnabled()) {
                        Logger.m31608a(str, "Starting with conversations", new Object[0]);
                        if (HelpCenterPresenter.this.view != null) {
                            HelpCenterPresenter.this.view.showRequestList();
                            HelpCenterPresenter.this.view.exitActivity();
                            return;
                        }
                        HelpCenterPresenter.this.internalRetryActions.add(new RetryAction() {
                            public void onRetry() {
                                HelpCenterPresenter.this.view.showRequestList();
                                HelpCenterPresenter.this.view.exitActivity();
                            }
                        });
                        return;
                    }
                    Logger.m31608a(str, "Starting with contact", new Object[0]);
                    if (HelpCenterPresenter.this.view != null) {
                        HelpCenterPresenter.this.view.showContactZendesk();
                        HelpCenterPresenter.this.view.exitActivity();
                        return;
                    }
                    HelpCenterPresenter.this.internalRetryActions.add(new RetryAction() {
                        public void onRetry() {
                            HelpCenterPresenter.this.view.showContactZendesk();
                            HelpCenterPresenter.this.view.exitActivity();
                        }
                    });
                }
            }
        });
    }

    public void onErrorWithRetry(final HelpCenterMvp$ErrorType helpCenterMvp$ErrorType, final RetryAction retryAction) {
        HelpCenterMvp$View helpCenterMvp$View = this.view;
        if (helpCenterMvp$View == null) {
            this.internalRetryActions.add(new RetryAction() {
                public void onRetry() {
                    if (HelpCenterPresenter.this.view != null && HelpCenterPresenter.this.view.isShowingHelp()) {
                        HelpCenterPresenter.this.view.hideLoadingState();
                        HelpCenterPresenter.this.view.showLoadArticleErrorWithRetry(helpCenterMvp$ErrorType, retryAction);
                    }
                }
            });
        } else if (helpCenterMvp$View.isShowingHelp()) {
            this.view.hideLoadingState();
            this.view.showLoadArticleErrorWithRetry(helpCenterMvp$ErrorType, retryAction);
        }
    }

    public void onLoad() {
        if (this.config.isContactUsButtonVisible()) {
            HelpCenterMvp$View helpCenterMvp$View = this.view;
            if (helpCenterMvp$View != null) {
                helpCenterMvp$View.showContactUsButton();
            } else {
                this.internalRetryActions.add(new RetryAction() {
                    public void onRetry() {
                        HelpCenterPresenter.this.view.showContactUsButton();
                    }
                });
            }
        }
        HelpCenterMvp$View helpCenterMvp$View2 = this.view;
        if (helpCenterMvp$View2 != null) {
            helpCenterMvp$View2.announceContentLoaded();
        }
    }

    public void onNetworkAvailable() {
        String str = "HelpCenterActivity";
        Logger.m31608a(str, "Network is available.", new Object[0]);
        if (!this.networkPreviouslyUnavailable) {
            Logger.m31608a(str, "Network was not previously unavailable, no need to dismiss Snackbar", new Object[0]);
            return;
        }
        this.networkPreviouslyUnavailable = false;
        HelpCenterMvp$View helpCenterMvp$View = this.view;
        if (helpCenterMvp$View != null) {
            helpCenterMvp$View.setSearchEnabled(true);
            this.view.dismissError();
        } else {
            this.internalRetryActions.add(new RetryAction() {
                public void onRetry() {
                    HelpCenterPresenter.this.view.dismissError();
                }
            });
        }
    }

    public void onNetworkUnavailable() {
        Logger.m31608a("HelpCenterActivity", "Network is unavailable.", new Object[0]);
        this.networkPreviouslyUnavailable = true;
        HelpCenterMvp$View helpCenterMvp$View = this.view;
        if (helpCenterMvp$View != null) {
            helpCenterMvp$View.setSearchEnabled(false);
            this.view.showNoConnectionError();
            this.view.hideLoadingState();
        }
    }

    public void onPause() {
        this.view = null;
        this.networkInfoProvider.removeNetworkAwareListener(NETWORK_AWARE_ID);
        this.networkInfoProvider.removeRetryAction(RETRY_ACTION_ID);
        this.networkInfoProvider.unregister();
    }

    public void onResume(HelpCenterMvp$View helpCenterMvp$View) {
        this.view = helpCenterMvp$View;
        this.networkInfoProvider.addNetworkAwareListener(NETWORK_AWARE_ID, this);
        this.networkInfoProvider.register();
        if (!this.networkInfoProvider.isNetworkAvailable()) {
            helpCenterMvp$View.showNoConnectionError();
            helpCenterMvp$View.hideLoadingState();
            this.networkPreviouslyUnavailable = true;
        }
        invokeRetryActions();
    }

    public void onSearchSubmit(final String str) {
        if (this.networkInfoProvider.isNetworkAvailable()) {
            this.view.dismissError();
            this.view.showLoadingState();
            this.view.clearSearchResults();
            this.model.search(this.config.getCategoryIds(), this.config.getSectionIds(), str, this.config.getLabelNames(), new ViewSafeRetryZendeskCallback(str));
            return;
        }
        this.networkInfoProvider.addRetryAction(RETRY_ACTION_ID, new RetryAction() {
            public void onRetry() {
                HelpCenterPresenter.this.onSearchSubmit(str);
            }
        });
    }

    public boolean shouldShowConversationsMenuItem() {
        return this.mobileSettings.isConversationsEnabled() && this.config.isShowConversationsMenuButton();
    }

    public boolean shouldShowSearchMenuItem() {
        return this.mobileSettings.hasHelpCenterSettings();
    }
}
