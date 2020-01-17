package zendesk.support;

import com.zendesk.util.C12010a;
import java.util.List;

class CategoriesResponse {
    private List<Category> categories;

    CategoriesResponse() {
    }

    /* access modifiers changed from: 0000 */
    public List<Category> getCategories() {
        return C12010a.m31632a(this.categories);
    }
}
