package zendesk.support;

import com.zendesk.util.C12010a;
import java.util.Collections;
import java.util.List;

class ContactUsSettings {
    private static ContactUsSettings DEFAULT = new ContactUsSettings(Collections.emptyList());
    private List<String> tags;

    ContactUsSettings(List<String> list) {
        this.tags = list;
    }

    static ContactUsSettings defaultSettings() {
        return DEFAULT;
    }

    public List<String> getTags() {
        return C12010a.m31632a(this.tags);
    }
}
