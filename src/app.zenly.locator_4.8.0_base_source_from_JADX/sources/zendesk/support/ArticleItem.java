package zendesk.support;

import com.google.gson.p315j.C11258c;

public class ArticleItem implements HelpItem {

    /* renamed from: id */
    private Long f35185id;
    private String name;
    @C11258c("section_id")
    private Long sectionId;

    public ArticleItem(Long l, Long l2, String str) {
        this.f35185id = l;
        this.sectionId = l2;
        this.name = str;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || ArticleItem.class != obj.getClass()) {
            return false;
        }
        ArticleItem articleItem = (ArticleItem) obj;
        Long l = this.f35185id;
        if (l == null ? articleItem.f35185id != null : !l.equals(articleItem.f35185id)) {
            return false;
        }
        Long l2 = this.sectionId;
        Long l3 = articleItem.sectionId;
        if (l2 != null) {
            z = l2.equals(l3);
        } else if (l3 != null) {
            z = false;
        }
        return z;
    }

    public Long getId() {
        return this.f35185id;
    }

    public String getName() {
        String str = this.name;
        return str == null ? "" : str;
    }

    public Long getParentId() {
        return this.sectionId;
    }

    public int getViewType() {
        return 3;
    }

    public int hashCode() {
        Long l = this.f35185id;
        int i = 0;
        int hashCode = (l != null ? l.hashCode() : 0) * 31;
        Long l2 = this.sectionId;
        if (l2 != null) {
            i = l2.hashCode();
        }
        return hashCode + i;
    }
}
