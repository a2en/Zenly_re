package zendesk.core;

import dagger.internal.C12021c;
import dagger.internal.Factory;

public final class CoreModule_GetBlipsProviderFactory implements Factory<BlipsProvider> {
    private final CoreModule module;

    public CoreModule_GetBlipsProviderFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static Factory<BlipsProvider> create(CoreModule coreModule) {
        return new CoreModule_GetBlipsProviderFactory(coreModule);
    }

    public BlipsProvider get() {
        BlipsProvider blipsProvider = this.module.getBlipsProvider();
        C12021c.m31671a(blipsProvider, "Cannot return null from a non-@Nullable @Provides method");
        return blipsProvider;
    }
}
