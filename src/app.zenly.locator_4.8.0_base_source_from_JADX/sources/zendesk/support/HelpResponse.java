package zendesk.support;

import com.zendesk.util.C12010a;
import java.util.List;

class HelpResponse {
    private List<CategoryItem> categories;

    HelpResponse() {
    }

    public List<CategoryItem> getCategories() {
        return C12010a.m31632a(this.categories);
    }
}
