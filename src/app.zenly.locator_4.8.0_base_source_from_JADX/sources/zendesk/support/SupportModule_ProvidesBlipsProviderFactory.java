package zendesk.support;

import dagger.internal.C12021c;
import dagger.internal.Factory;

public final class SupportModule_ProvidesBlipsProviderFactory implements Factory<SupportBlipsProvider> {
    private final SupportModule module;

    public SupportModule_ProvidesBlipsProviderFactory(SupportModule supportModule) {
        this.module = supportModule;
    }

    public static Factory<SupportBlipsProvider> create(SupportModule supportModule) {
        return new SupportModule_ProvidesBlipsProviderFactory(supportModule);
    }

    public SupportBlipsProvider get() {
        SupportBlipsProvider providesBlipsProvider = this.module.providesBlipsProvider();
        C12021c.m31671a(providesBlipsProvider, "Cannot return null from a non-@Nullable @Provides method");
        return providesBlipsProvider;
    }
}
