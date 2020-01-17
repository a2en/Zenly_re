package zendesk.support;

import com.zendesk.util.C12017g;
import java.util.List;

public class HelpRequest {
    private int articlesPerPageLimit;
    private String categoryIds;
    private String includes;
    private String[] labelNames;
    private String sectionIds;

    public static class Builder {
        /* access modifiers changed from: private */
        public int articlesPerSectionLimit = 5;
        /* access modifiers changed from: private */
        public String categoryIds;
        /* access modifiers changed from: private */
        public String includes;
        /* access modifiers changed from: private */
        public String[] labelNames;
        /* access modifiers changed from: private */
        public String sectionIds;

        public HelpRequest build() {
            return new HelpRequest(this);
        }

        public Builder includeCategories() {
            if (C12017g.m31659c(this.includes)) {
                this.includes = "categories";
            } else if (this.includes.equals("sections")) {
                this.includes = "categories,sections";
            }
            return this;
        }

        public Builder includeSections() {
            if (C12017g.m31659c(this.includes)) {
                this.includes = "sections";
            } else if (this.includes.equals("categories")) {
                this.includes = "categories,sections";
            }
            return this;
        }

        public Builder withCategoryIds(List<Long> list) {
            this.categoryIds = C12017g.m31656b(list);
            return this;
        }

        public Builder withLabelNames(String... strArr) {
            this.labelNames = strArr;
            return this;
        }

        public Builder withSectionIds(List<Long> list) {
            this.sectionIds = C12017g.m31656b(list);
            return this;
        }
    }

    public int getArticlesPerPageLimit() {
        return this.articlesPerPageLimit;
    }

    public String getCategoryIds() {
        return this.categoryIds;
    }

    public String getIncludes() {
        return this.includes;
    }

    public String[] getLabelNames() {
        return this.labelNames;
    }

    public String getSectionIds() {
        return this.sectionIds;
    }

    private HelpRequest(Builder builder) {
        this.categoryIds = builder.categoryIds;
        this.sectionIds = builder.sectionIds;
        this.includes = builder.includes;
        this.articlesPerPageLimit = builder.articlesPerSectionLimit;
        this.labelNames = builder.labelNames;
    }
}
