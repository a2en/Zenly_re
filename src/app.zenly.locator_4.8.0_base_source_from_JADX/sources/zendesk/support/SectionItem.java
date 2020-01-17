package zendesk.support;

import com.google.gson.p315j.C11258c;
import java.util.ArrayList;
import java.util.List;

public class SectionItem implements HelpItem {
    private List<ArticleItem> articles;
    @C11258c("category_id")
    private Long categoryId;
    @C11258c("name")
    private String name;
    @C11258c("id")
    private Long sectionId;
    @C11258c("article_count")
    private int totalArticlesCount;

    public void addArticle(ArticleItem articleItem) {
        if (this.articles == null) {
            this.articles = new ArrayList();
        }
        this.articles.add(articleItem);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || SectionItem.class != obj.getClass()) {
            return false;
        }
        SectionItem sectionItem = (SectionItem) obj;
        Long l = this.sectionId;
        if (l == null ? sectionItem.sectionId != null : !l.equals(sectionItem.sectionId)) {
            return false;
        }
        Long l2 = this.categoryId;
        Long l3 = sectionItem.categoryId;
        if (l2 != null) {
            z = l2.equals(l3);
        } else if (l3 != null) {
            z = false;
        }
        return z;
    }

    public List<HelpItem> getChildren() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.articles);
        if (this.articles.size() < this.totalArticlesCount) {
            arrayList.add(new SeeAllArticlesItem(this));
        }
        return arrayList;
    }

    public Long getId() {
        return this.sectionId;
    }

    public String getName() {
        String str = this.name;
        return str == null ? "" : str;
    }

    public Long getParentId() {
        return this.categoryId;
    }

    public int getTotalArticlesCount() {
        return this.totalArticlesCount;
    }

    public int getViewType() {
        return 2;
    }

    public int hashCode() {
        Long l = this.sectionId;
        int i = 0;
        int hashCode = (l != null ? l.hashCode() : 0) * 31;
        Long l2 = this.categoryId;
        if (l2 != null) {
            i = l2.hashCode();
        }
        return hashCode + i;
    }
}
