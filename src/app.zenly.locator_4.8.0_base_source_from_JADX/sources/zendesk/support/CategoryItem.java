package zendesk.support;

import com.google.gson.p315j.C11258c;
import com.zendesk.util.C12010a;
import java.util.List;

public class CategoryItem implements HelpItem {
    private boolean expanded = true;
    @C11258c("id")

    /* renamed from: id */
    private Long f35189id;
    @C11258c("name")
    private String name;
    private List<SectionItem> sections;

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || CategoryItem.class != obj.getClass()) {
            return false;
        }
        CategoryItem categoryItem = (CategoryItem) obj;
        Long l = this.f35189id;
        Long l2 = categoryItem.f35189id;
        if (l != null) {
            z = l.equals(l2);
        } else if (l2 != null) {
            z = false;
        }
        return z;
    }

    public Long getId() {
        return this.f35189id;
    }

    public String getName() {
        String str = this.name;
        return str == null ? "" : str;
    }

    public Long getParentId() {
        return null;
    }

    public List<SectionItem> getSections() {
        return C12010a.m31632a(this.sections);
    }

    public int getViewType() {
        return 1;
    }

    public int hashCode() {
        Long l = this.f35189id;
        if (l != null) {
            return l.hashCode();
        }
        return 0;
    }

    public boolean isExpanded() {
        return this.expanded;
    }

    public boolean setExpanded(boolean z) {
        this.expanded = z;
        return this.expanded;
    }
}
