package zendesk.support.guide;

import com.zendesk.service.C12004a;
import com.zendesk.service.C12008e;
import com.zendesk.service.ErrorResponse;
import com.zendesk.util.C12017g;
import java.util.ArrayList;
import java.util.List;
import zendesk.support.Article;
import zendesk.support.ArticleItem;
import zendesk.support.HelpCenterProvider;
import zendesk.support.HelpItem;
import zendesk.support.HelpRequest.Builder;
import zendesk.support.SectionItem;

class HelpModel implements HelpMvp$Model {
    private HelpCenterProvider provider;

    HelpModel(HelpCenterProvider helpCenterProvider) {
        this.provider = helpCenterProvider;
    }

    /* access modifiers changed from: private */
    public ArticleItem convertArticle(Article article) {
        return new ArticleItem(article.getId(), article.getSectionId(), article.getTitle());
    }

    public void getArticles(List<Long> list, List<Long> list2, String[] strArr, C12008e<List<HelpItem>> eVar) {
        HelpCenterProvider helpCenterProvider = this.provider;
        Builder builder = new Builder();
        builder.withCategoryIds(list);
        builder.withSectionIds(list2);
        builder.withLabelNames(strArr);
        builder.includeCategories();
        builder.includeSections();
        helpCenterProvider.getHelp(builder.build(), eVar);
    }

    public void getArticlesForSection(SectionItem sectionItem, String[] strArr, final C12008e<List<ArticleItem>> eVar) {
        if (sectionItem == null || sectionItem.getId() == null) {
            eVar.onError(new C12004a("SectionItem or its ID was null, cannot load more articles."));
        } else {
            this.provider.getArticles(sectionItem.getId(), C12017g.m31657b(strArr), new C12008e<List<Article>>() {
                public void onError(ErrorResponse errorResponse) {
                    C12008e eVar = eVar;
                    if (eVar != null) {
                        eVar.onError(errorResponse);
                    }
                }

                public void onSuccess(List<Article> list) {
                    ArrayList arrayList = new ArrayList(list.size());
                    for (Article access$000 : list) {
                        arrayList.add(HelpModel.this.convertArticle(access$000));
                    }
                    C12008e eVar = eVar;
                    if (eVar != null) {
                        eVar.onSuccess(arrayList);
                    }
                }
            });
        }
    }
}
