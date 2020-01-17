package zendesk.support;

import com.zendesk.util.C12010a;
import com.zendesk.util.C12017g;
import java.util.List;
import java.util.Map;
import okhttp3.C13319s;
import zendesk.support.ZendeskDeepLinkParser.Module;

class ViewArticleDeepLinkParser implements Module {

    static class ActionPayload {
        private final String action;
        private final Map<String, Object> payload;

        private ActionPayload(String str, Map<String, Object> map) {
            this.action = str;
            this.payload = map;
        }

        static ActionPayload invalid() {
            return new ActionPayload(null, null);
        }

        static ActionPayload valid(String str, Map<String, Object> map) {
            return new ActionPayload(str, map);
        }

        public String getAction() {
            return this.action;
        }

        public Map<String, Object> getPayload() {
            return this.payload;
        }

        public boolean isValid() {
            return C12017g.m31658b(this.action) && this.payload != null;
        }

        static ActionPayload invalid(String str) {
            return new ActionPayload(str, null);
        }
    }

    ViewArticleDeepLinkParser() {
    }

    public ActionPayload parse(C13319s sVar) {
        String str;
        List j = sVar.mo38292j();
        String str2 = "help_center_view_article";
        if (j.size() < 4 && j.size() > 5) {
            return ActionPayload.invalid(str2);
        }
        int indexOf = j.indexOf("articles");
        if ("hc".equals(j.get(0))) {
            if (indexOf == 1 || indexOf == 2) {
                if (indexOf + 2 != j.size()) {
                    return ActionPayload.invalid(str2);
                }
                String str3 = (String) j.get(indexOf + 1);
                String[] split = str3.split("-");
                if (C12010a.m31636a((Type[]) split)) {
                    return ActionPayload.invalid(str2);
                }
                try {
                    Long valueOf = Long.valueOf(Long.parseLong(split[0]));
                    StringBuilder sb = new StringBuilder(str3.length());
                    if (split.length > 1) {
                        int length = split.length;
                        for (int i = 1; i < length; i++) {
                            sb.append(split[i]);
                            sb.append(' ');
                        }
                        str = sb.toString().trim();
                    } else {
                        str = "";
                    }
                    return ActionPayload.valid(str2, ViewArticleActionHandler.data(valueOf.longValue(), str));
                } catch (NumberFormatException unused) {
                    return ActionPayload.invalid(str2);
                }
            }
        }
        return ActionPayload.invalid(str2);
    }
}
