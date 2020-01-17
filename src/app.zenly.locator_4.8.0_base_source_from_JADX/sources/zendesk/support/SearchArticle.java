package zendesk.support;

import java.io.Serializable;

public class SearchArticle implements Serializable {
    private final Article mArticle;
    private final Category mCategory;
    private final Section mSection;

    public SearchArticle(Article article, Section section, Category category) {
        this.mArticle = article;
        this.mSection = section;
        this.mCategory = category;
    }

    public Article getArticle() {
        return this.mArticle;
    }

    public Category getCategory() {
        return this.mCategory;
    }

    public Section getSection() {
        return this.mSection;
    }
}
