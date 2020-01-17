package zendesk.core;

import dagger.internal.C12021c;
import dagger.internal.Factory;

public final class ZendeskApplicationModule_ProvideApplicationConfigurationFactory implements Factory<ApplicationConfiguration> {
    private final ZendeskApplicationModule module;

    public ZendeskApplicationModule_ProvideApplicationConfigurationFactory(ZendeskApplicationModule zendeskApplicationModule) {
        this.module = zendeskApplicationModule;
    }

    public static Factory<ApplicationConfiguration> create(ZendeskApplicationModule zendeskApplicationModule) {
        return new ZendeskApplicationModule_ProvideApplicationConfigurationFactory(zendeskApplicationModule);
    }

    public ApplicationConfiguration get() {
        ApplicationConfiguration provideApplicationConfiguration = this.module.provideApplicationConfiguration();
        C12021c.m31671a(provideApplicationConfiguration, "Cannot return null from a non-@Nullable @Provides method");
        return provideApplicationConfiguration;
    }
}
