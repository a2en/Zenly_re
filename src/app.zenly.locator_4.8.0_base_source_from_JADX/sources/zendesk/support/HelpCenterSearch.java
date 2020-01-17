package zendesk.support;

import com.zendesk.util.C12010a;
import com.zendesk.util.C12017g;
import java.io.Serializable;
import java.util.List;
import java.util.Locale;

public class HelpCenterSearch implements Serializable, Cloneable {
    /* access modifiers changed from: private */
    public String categoryIds;
    /* access modifiers changed from: private */
    public String include;
    /* access modifiers changed from: private */
    public String labelNames;
    /* access modifiers changed from: private */
    public Locale locale;
    /* access modifiers changed from: private */
    public Integer page;
    /* access modifiers changed from: private */
    public Integer perPage;
    /* access modifiers changed from: private */
    public String query;
    /* access modifiers changed from: private */
    public String sectionIds;

    public static class Builder {
        private String categoryIds;
        private String[] include;
        private String[] labelNames;
        private Locale locale;
        private Integer page;
        private Integer perPage;
        private String query;
        private String sectionIds;

        public HelpCenterSearch build() {
            HelpCenterSearch helpCenterSearch = new HelpCenterSearch();
            helpCenterSearch.query = this.query;
            helpCenterSearch.locale = this.locale;
            helpCenterSearch.include = C12017g.m31657b(this.include);
            helpCenterSearch.labelNames = C12017g.m31657b(this.labelNames);
            helpCenterSearch.categoryIds = this.categoryIds;
            helpCenterSearch.sectionIds = this.sectionIds;
            helpCenterSearch.page = this.page;
            helpCenterSearch.perPage = this.perPage;
            return helpCenterSearch;
        }

        public Builder withCategoryIds(List<Long> list) {
            this.categoryIds = C12017g.m31656b(C12010a.m31632a(list));
            return this;
        }

        public Builder withLabelNames(String... strArr) {
            this.labelNames = strArr;
            return this;
        }

        public Builder withQuery(String str) {
            this.query = str;
            return this;
        }

        public Builder withSectionIds(List<Long> list) {
            this.sectionIds = C12017g.m31656b(C12010a.m31632a(list));
            return this;
        }
    }

    public String getCategoryIds() {
        return this.categoryIds;
    }

    public String getInclude() {
        return this.include;
    }

    public String getLabelNames() {
        return this.labelNames;
    }

    public Locale getLocale() {
        return this.locale;
    }

    public Integer getPage() {
        return this.page;
    }

    public Integer getPerPage() {
        return this.perPage;
    }

    public String getQuery() {
        return this.query;
    }

    public String getSectionIds() {
        return this.sectionIds;
    }

    private HelpCenterSearch() {
    }
}
