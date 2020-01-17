package zendesk.support;

import dagger.internal.C12021c;
import dagger.internal.Factory;

public final class SupportModule_ProvidesSettingsProviderFactory implements Factory<SupportSettingsProvider> {
    private final SupportModule module;

    public SupportModule_ProvidesSettingsProviderFactory(SupportModule supportModule) {
        this.module = supportModule;
    }

    public static Factory<SupportSettingsProvider> create(SupportModule supportModule) {
        return new SupportModule_ProvidesSettingsProviderFactory(supportModule);
    }

    public SupportSettingsProvider get() {
        SupportSettingsProvider providesSettingsProvider = this.module.providesSettingsProvider();
        C12021c.m31671a(providesSettingsProvider, "Cannot return null from a non-@Nullable @Provides method");
        return providesSettingsProvider;
    }
}
