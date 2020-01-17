package zendesk.core;

import com.zendesk.logger.Logger;
import com.zendesk.util.C12017g;

class ApiAnonymousIdentity implements Identity {
    private static final transient String LOG_TAG = "ApiAnonymousIdentity";
    private String email;
    private String name;
    private String sdkGuid;

    ApiAnonymousIdentity(AnonymousIdentity anonymousIdentity, String str) {
        boolean c = C12017g.m31659c(str);
        String str2 = LOG_TAG;
        if (c) {
            this.sdkGuid = "";
            Logger.m31614d(str2, "SdkGuid cannot be null or empty.", new Object[0]);
        } else {
            this.sdkGuid = str;
        }
        if (anonymousIdentity == null) {
            Logger.m31614d(str2, "Identity is null.", new Object[0]);
            return;
        }
        this.email = anonymousIdentity.getEmail();
        this.name = anonymousIdentity.getName();
    }
}
