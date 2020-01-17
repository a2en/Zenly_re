package zendesk.support;

public class SeeAllArticlesItem implements HelpItem {
    private boolean isLoading;
    private SectionItem section;

    public SeeAllArticlesItem(SectionItem sectionItem) {
        this.section = sectionItem;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || SeeAllArticlesItem.class != obj.getClass()) {
            return false;
        }
        SeeAllArticlesItem seeAllArticlesItem = (SeeAllArticlesItem) obj;
        SectionItem sectionItem = this.section;
        SectionItem sectionItem2 = seeAllArticlesItem.section;
        if (sectionItem != null) {
            z = sectionItem.equals(sectionItem2);
        } else if (sectionItem2 != null) {
            z = false;
        }
        return z;
    }

    public Long getId() {
        return this.section.getId();
    }

    public String getName() {
        return "";
    }

    public Long getParentId() {
        return this.section.getParentId();
    }

    public SectionItem getSection() {
        return this.section;
    }

    public int getViewType() {
        return 4;
    }

    public int hashCode() {
        SectionItem sectionItem = this.section;
        if (sectionItem != null) {
            return sectionItem.hashCode();
        }
        return 0;
    }

    public boolean isLoading() {
        return this.isLoading;
    }

    public void setLoading(boolean z) {
        this.isLoading = z;
    }
}
