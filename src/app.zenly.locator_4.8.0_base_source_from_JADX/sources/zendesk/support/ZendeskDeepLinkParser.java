package zendesk.support;

import com.zendesk.util.C12010a;
import com.zendesk.util.C12017g;
import java.util.List;
import okhttp3.C13319s;

class ZendeskDeepLinkParser {
    private final List<Module> modules;
    private final String zendeskHost;

    public interface Module {
        ActionPayload parse(C13319s sVar);
    }

    ZendeskDeepLinkParser(String str, List<Module> list) {
        C13319s f = C13319s.m35127f(str);
        this.zendeskHost = f != null ? f.mo38288g() : null;
        this.modules = C12010a.m31638b(list);
    }

    public ActionPayload parse(String str) {
        if (!C12017g.m31655a(this.zendeskHost, str)) {
            return ActionPayload.invalid();
        }
        C13319s f = C13319s.m35127f(str);
        if (f == null || !f.mo38288g().equals(this.zendeskHost)) {
            return ActionPayload.invalid();
        }
        for (Module parse : this.modules) {
            ActionPayload parse2 = parse.parse(f);
            if (parse2.isValid()) {
                return parse2;
            }
        }
        return ActionPayload.invalid();
    }
}
