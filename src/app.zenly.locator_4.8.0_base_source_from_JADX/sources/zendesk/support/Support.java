package zendesk.support;

import com.zendesk.logger.Logger;
import java.util.Locale;
import zendesk.core.ActionHandlerRegistry;
import zendesk.core.AuthenticationProvider;
import zendesk.core.CoreModule;
import zendesk.core.Zendesk;
import zendesk.support.DaggerSupportSdkProvidersComponent.Builder;

public enum Support {
    INSTANCE;
    
    ActionHandlerRegistry actionHandlerRegistry;
    AuthenticationProvider authenticationProvider;
    SupportBlipsProvider blipsProvider;
    private Locale helpCenterLocaleOverride;
    private boolean initialised;
    ProviderStore providerStore;
    RequestMigrator requestMigrator;
    RequestProvider requestProvider;
    SupportModule supportModule;

    private void initApplicationScope(CoreModule coreModule, ApplicationScope applicationScope) {
        Builder builder = DaggerSupportSdkProvidersComponent.builder();
        builder.coreModule(coreModule);
        builder.providerModule(new ProviderModule());
        builder.storageModule(new StorageModule());
        builder.supportApplicationModule(new SupportApplicationModule(applicationScope));
        builder.build().inject(this);
    }

    public Locale getHelpCenterLocaleOverride() {
        return this.helpCenterLocaleOverride;
    }

    /* access modifiers changed from: 0000 */
    public SupportModule getSupportModule() {
        return this.supportModule;
    }

    public void init(Zendesk zendesk2) {
        if (zendesk2.isInitialized()) {
            Builder builder = new Builder();
            builder.zendeskTracker(new AnswersTracker());
            initApplicationScope(zendesk2.coreModule(), builder.build());
            this.initialised = true;
            return;
        }
        Logger.m31610b("ZendeskConfiguration", "Cannot use SupportSDK without initializing Zendesk. Call Zendesk.INSTANCE.init(...)", new Object[0]);
    }

    /* access modifiers changed from: 0000 */
    public boolean isAuthenticated() {
        AuthenticationProvider authenticationProvider2 = this.authenticationProvider;
        return (authenticationProvider2 == null || authenticationProvider2.getIdentity() == null) ? false : true;
    }

    public boolean isInitialized() {
        return this.initialised;
    }

    public ProviderStore provider() {
        String str = "ZendeskConfiguration";
        if (!isInitialized()) {
            Logger.m31610b(str, "Cannot get ProviderStore before SDK has been initialized. init() must be called before provider().", new Object[0]);
            return null;
        } else if (isAuthenticated()) {
            return this.providerStore;
        } else {
            Logger.m31610b(str, "Cannot get ProviderStore before an identity has been set. Zendesk.INSTANCE.setIdentity() must be called before provider().", new Object[0]);
            return null;
        }
    }
}
