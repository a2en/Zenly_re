package zendesk.core;

import dagger.internal.C12021c;
import dagger.internal.Factory;

public final class CoreModule_GetApplicationConfigurationFactory implements Factory<ApplicationConfiguration> {
    private final CoreModule module;

    public CoreModule_GetApplicationConfigurationFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static Factory<ApplicationConfiguration> create(CoreModule coreModule) {
        return new CoreModule_GetApplicationConfigurationFactory(coreModule);
    }

    public static ApplicationConfiguration proxyGetApplicationConfiguration(CoreModule coreModule) {
        return coreModule.getApplicationConfiguration();
    }

    public ApplicationConfiguration get() {
        ApplicationConfiguration applicationConfiguration = this.module.getApplicationConfiguration();
        C12021c.m31671a(applicationConfiguration, "Cannot return null from a non-@Nullable @Provides method");
        return applicationConfiguration;
    }
}
