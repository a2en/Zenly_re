package zendesk.core;

import android.content.Context;
import com.zendesk.logger.Logger;
import com.zendesk.util.C12017g;
import zendesk.core.DaggerZendeskApplicationComponent.Builder;

public enum Zendesk {
    INSTANCE;
    
    private ActionHandlerRegistry actionHandlerRegistry;
    private ZendeskShadow zendeskShadow;

    static boolean checkConfig(Context context, String str, String str2, String str3) {
        if (context != null) {
            if (C12017g.m31655a(str, str2, str3)) {
                return true;
            }
        }
        Object[] objArr = {context, Boolean.valueOf(C12017g.m31658b(str)), Boolean.valueOf(C12017g.m31658b(str2)), Boolean.valueOf(C12017g.m31658b(str3))};
        Logger.m31610b("Zendesk", String.format("Invalid zendesk configuration provided | Context: %b | Url: %b | Application Id: %b | OauthClientId: %b", objArr), new Object[0]);
        return false;
    }

    public ActionHandlerRegistry actionHandlerRegistry() {
        return this.actionHandlerRegistry;
    }

    public CoreModule coreModule() {
        return this.zendeskShadow.coreModule();
    }

    public void init(Context context, String str, String str2, String str3) {
        checkConfig(context, str, str2, str3);
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration(str2, str, str3);
        Builder builder = DaggerZendeskApplicationComponent.builder();
        builder.zendeskApplicationModule(new ZendeskApplicationModule(context, applicationConfiguration));
        init(builder.build(), applicationConfiguration);
    }

    public boolean isInitialized() {
        return this.zendeskShadow != null;
    }

    public void setIdentity(Identity identity) {
        if (!isInitialized()) {
            Logger.m31610b("Zendesk", "Cannot get set identity before SDK has been initialized. init() must be called before setIdentity(...).", new Object[0]);
            return;
        }
        this.zendeskShadow.setIdentity(identity);
    }

    /* access modifiers changed from: 0000 */
    public void init(ZendeskApplicationComponent zendeskApplicationComponent, ApplicationConfiguration applicationConfiguration) {
        boolean z = this.zendeskShadow != null;
        if (z) {
            this.zendeskShadow.cleanupIfNewConfig(applicationConfiguration);
        }
        ZendeskShadow zendeskShadow2 = zendeskApplicationComponent.zendeskShadow();
        zendeskShadow2.init(applicationConfiguration, z);
        this.zendeskShadow = zendeskShadow2;
    }
}
