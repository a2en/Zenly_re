package zendesk.support.guide;

import com.zendesk.logger.Logger;
import com.zendesk.service.C12008e;
import com.zendesk.service.ErrorResponse;
import com.zendesk.util.C12010a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import zendesk.core.NetworkInfoProvider;
import zendesk.core.RetryAction;
import zendesk.support.ArticleItem;
import zendesk.support.CategoryItem;
import zendesk.support.HelpItem;
import zendesk.support.SectionItem;
import zendesk.support.SeeAllArticlesItem;

class HelpAdapterPresenter implements HelpMvp$Presenter {
    private static final Integer RETRY_ACTION_ID = Integer.valueOf(5);
    private C12008e<List<HelpItem>> callback = new C12008e<List<HelpItem>>() {
        public void onError(ErrorResponse errorResponse) {
            HelpCenterMvp$ErrorType helpCenterMvp$ErrorType;
            if (C12010a.m31639b((Collection<Type>) HelpAdapterPresenter.this.helpCenterUiConfig.getCategoryIds())) {
                helpCenterMvp$ErrorType = HelpCenterMvp$ErrorType.CATEGORY_LOAD;
            } else if (C12010a.m31639b((Collection<Type>) HelpAdapterPresenter.this.helpCenterUiConfig.getSectionIds())) {
                helpCenterMvp$ErrorType = HelpCenterMvp$ErrorType.SECTION_LOAD;
            } else {
                helpCenterMvp$ErrorType = HelpCenterMvp$ErrorType.ARTICLES_LOAD;
            }
            HelpAdapterPresenter.this.contentPresenter.onErrorWithRetry(helpCenterMvp$ErrorType, new RetryAction() {
                public void onRetry() {
                    HelpAdapterPresenter.this.hasError = false;
                    HelpAdapterPresenter.this.view.showItems(HelpAdapterPresenter.this.filteredItems);
                    HelpAdapterPresenter.this.requestHelpContent();
                }
            });
            HelpAdapterPresenter.this.hasError = true;
            HelpAdapterPresenter.this.view.showItems(HelpAdapterPresenter.this.filteredItems);
        }

        public void onSuccess(List<HelpItem> list) {
            HelpAdapterPresenter.this.hasError = false;
            HelpAdapterPresenter.this.helpItems = C12010a.m31632a(list);
            if (HelpAdapterPresenter.this.helpCenterUiConfig.isCollapseCategories()) {
                HelpAdapterPresenter helpAdapterPresenter = HelpAdapterPresenter.this;
                helpAdapterPresenter.filteredItems = helpAdapterPresenter.getCollapsedCategories(helpAdapterPresenter.helpItems);
            } else {
                HelpAdapterPresenter helpAdapterPresenter2 = HelpAdapterPresenter.this;
                helpAdapterPresenter2.filteredItems = C12010a.m31632a(helpAdapterPresenter2.helpItems);
            }
            HelpAdapterPresenter helpAdapterPresenter3 = HelpAdapterPresenter.this;
            helpAdapterPresenter3.noResults = C12010a.m31635a((Collection<Type>) helpAdapterPresenter3.filteredItems);
            HelpAdapterPresenter.this.view.showItems(HelpAdapterPresenter.this.filteredItems);
            HelpAdapterPresenter.this.contentPresenter.onLoad();
        }
    };
    /* access modifiers changed from: private */
    public HelpCenterMvp$Presenter contentPresenter;
    /* access modifiers changed from: private */
    public List<HelpItem> filteredItems = new ArrayList();
    /* access modifiers changed from: private */
    public boolean hasError;
    /* access modifiers changed from: private */
    public HelpCenterUiConfig helpCenterUiConfig;
    /* access modifiers changed from: private */
    public List<HelpItem> helpItems = new ArrayList();
    private HelpMvp$Model model;
    private NetworkInfoProvider networkInfoProvider;
    /* access modifiers changed from: private */
    public boolean noResults;
    private RetryAction retryAction;
    /* access modifiers changed from: private */
    public HelpMvp$View view;

    public HelpAdapterPresenter(HelpMvp$View helpMvp$View, HelpMvp$Model helpMvp$Model, NetworkInfoProvider networkInfoProvider2, HelpCenterUiConfig helpCenterUiConfig2) {
        this.view = helpMvp$View;
        this.model = helpMvp$Model;
        this.networkInfoProvider = networkInfoProvider2;
        this.helpCenterUiConfig = helpCenterUiConfig2;
    }

    private void addItem(int i, HelpItem helpItem) {
        this.filteredItems.add(i, helpItem);
        this.view.addItem(i, helpItem);
    }

    private void collapseItem(int i) {
        if (i < getItemCount() - 1) {
            int i2 = i + 1;
            while (i2 < this.filteredItems.size() && 1 != ((HelpItem) this.filteredItems.get(i2)).getViewType()) {
                removeItem(i2);
            }
        }
    }

    private void expandItem(CategoryItem categoryItem, int i) {
        int i2 = i + 1;
        for (HelpItem helpItem : categoryItem.getSections()) {
            addItem(i2, helpItem);
            i2++;
            try {
                for (HelpItem addItem : ((SectionItem) helpItem).getChildren()) {
                    addItem(i2, addItem);
                    i2++;
                }
            } catch (ClassCastException e) {
                Logger.m31607a("HelpCenterActivity", "Error expanding item", e, new Object[0]);
            }
        }
    }

    /* access modifiers changed from: private */
    public List<HelpItem> getCollapsedCategories(List<HelpItem> list) {
        ArrayList arrayList = new ArrayList();
        if (!(list == null || list.size() == 0)) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (1 == ((HelpItem) list.get(i)).getViewType()) {
                    arrayList.add(list.get(i));
                    ((CategoryItem) list.get(i)).setExpanded(false);
                }
            }
        }
        return arrayList;
    }

    private int getPaddingItemCount() {
        return this.helpCenterUiConfig.isContactUsButtonVisible() ? 1 : 0;
    }

    /* access modifiers changed from: private */
    public void loadMoreArticles(final SeeAllArticlesItem seeAllArticlesItem) {
        final SectionItem section = seeAllArticlesItem.getSection();
        final C136973 r1 = new RetryAction() {
            public void onRetry() {
                HelpAdapterPresenter.this.loadMoreArticles(seeAllArticlesItem);
            }
        };
        if (this.networkInfoProvider.isNetworkAvailable()) {
            this.model.getArticlesForSection(section, this.helpCenterUiConfig.getLabelNames(), new C12008e<List<ArticleItem>>() {
                public void onError(ErrorResponse errorResponse) {
                    HelpAdapterPresenter.this.helpItems.remove(seeAllArticlesItem);
                    Logger.m31610b("HelpCenterActivity", "Failed to load more articles", errorResponse);
                    HelpAdapterPresenter.this.contentPresenter.onErrorWithRetry(HelpCenterMvp$ErrorType.ARTICLES_LOAD, r1);
                }

                public void onSuccess(List<ArticleItem> list) {
                    int indexOf = HelpAdapterPresenter.this.helpItems.indexOf(seeAllArticlesItem);
                    int indexOf2 = HelpAdapterPresenter.this.filteredItems.indexOf(seeAllArticlesItem);
                    for (ArticleItem articleItem : list) {
                        if (!HelpAdapterPresenter.this.helpItems.contains(articleItem)) {
                            int i = indexOf + 1;
                            HelpAdapterPresenter.this.helpItems.add(indexOf, articleItem);
                            section.addArticle(articleItem);
                            if (indexOf2 != -1) {
                                HelpAdapterPresenter.this.filteredItems.add(indexOf2, articleItem);
                                HelpAdapterPresenter.this.view.addItem(indexOf2, articleItem);
                                indexOf2++;
                            }
                            indexOf = i;
                        }
                    }
                    HelpAdapterPresenter.this.helpItems.remove(seeAllArticlesItem);
                    int indexOf3 = HelpAdapterPresenter.this.filteredItems.indexOf(seeAllArticlesItem);
                    HelpAdapterPresenter.this.filteredItems.remove(seeAllArticlesItem);
                    HelpAdapterPresenter.this.view.removeItem(indexOf3);
                }
            });
            return;
        }
        this.retryAction = r1;
        this.networkInfoProvider.addRetryAction(RETRY_ACTION_ID, this.retryAction);
    }

    private void removeItem(int i) {
        this.filteredItems.remove(i);
        this.view.removeItem(i);
    }

    /* access modifiers changed from: private */
    public void requestHelpContent() {
        if (!this.networkInfoProvider.isNetworkAvailable()) {
            this.retryAction = new RetryAction() {
                public void onRetry() {
                    HelpAdapterPresenter.this.requestHelpContent();
                }
            };
            this.networkInfoProvider.addRetryAction(RETRY_ACTION_ID, this.retryAction);
        }
        this.model.getArticles(this.helpCenterUiConfig.getCategoryIds(), this.helpCenterUiConfig.getSectionIds(), this.helpCenterUiConfig.getLabelNames(), this.callback);
    }

    public HelpItem getItem(int i) {
        return (HelpItem) this.filteredItems.get(i);
    }

    public int getItemCount() {
        if (this.hasError) {
            return 0;
        }
        return Math.max(this.filteredItems.size() + getPaddingItemCount(), 1);
    }

    public HelpItem getItemForBinding(int i) {
        if (this.filteredItems.size() <= 0 || i >= this.filteredItems.size()) {
            return null;
        }
        return (HelpItem) this.filteredItems.get(i);
    }

    public int getItemViewType(int i) {
        if (this.noResults) {
            return 7;
        }
        int i2 = this.filteredItems.size() > 0 ? i == this.filteredItems.size() ? 8 : ((HelpItem) this.filteredItems.get(i)).getViewType() : 5;
        return i2;
    }

    public void onAttached() {
        this.networkInfoProvider.register();
        if (C12010a.m31635a((Collection<Type>) this.helpItems)) {
            requestHelpContent();
        }
    }

    public boolean onCategoryClick(CategoryItem categoryItem, int i) {
        if (categoryItem == null) {
            return false;
        }
        boolean expanded = categoryItem.setExpanded(!categoryItem.isExpanded());
        if (expanded) {
            expandItem(categoryItem, this.filteredItems.indexOf(categoryItem));
        } else {
            collapseItem(this.filteredItems.indexOf(categoryItem));
        }
        return expanded;
    }

    public void onDetached() {
        this.networkInfoProvider.removeRetryAction(RETRY_ACTION_ID);
        this.networkInfoProvider.unregister();
    }

    public void onSeeAllClick(SeeAllArticlesItem seeAllArticlesItem) {
        loadMoreArticles(seeAllArticlesItem);
    }

    public void setContentPresenter(HelpCenterMvp$Presenter helpCenterMvp$Presenter) {
        this.contentPresenter = helpCenterMvp$Presenter;
    }
}
