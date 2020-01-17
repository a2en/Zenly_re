package zendesk.core;

import dagger.internal.C12021c;
import dagger.internal.Factory;

public final class CoreModule_GetRestServiceProviderFactory implements Factory<RestServiceProvider> {
    private final CoreModule module;

    public CoreModule_GetRestServiceProviderFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static Factory<RestServiceProvider> create(CoreModule coreModule) {
        return new CoreModule_GetRestServiceProviderFactory(coreModule);
    }

    public RestServiceProvider get() {
        RestServiceProvider restServiceProvider = this.module.getRestServiceProvider();
        C12021c.m31671a(restServiceProvider, "Cannot return null from a non-@Nullable @Provides method");
        return restServiceProvider;
    }
}
