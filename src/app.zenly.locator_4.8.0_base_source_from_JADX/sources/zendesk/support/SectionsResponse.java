package zendesk.support;

import com.zendesk.util.C12010a;
import java.util.List;

class SectionsResponse {
    List<Section> sections;

    SectionsResponse() {
    }

    /* access modifiers changed from: 0000 */
    public List<Section> getSections() {
        return C12010a.m31632a(this.sections);
    }
}
