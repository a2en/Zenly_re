package zendesk.core;

import dagger.internal.C12021c;
import dagger.internal.Factory;

public final class CoreModule_GetSettingsProviderFactory implements Factory<SettingsProvider> {
    private final CoreModule module;

    public CoreModule_GetSettingsProviderFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static Factory<SettingsProvider> create(CoreModule coreModule) {
        return new CoreModule_GetSettingsProviderFactory(coreModule);
    }

    public SettingsProvider get() {
        SettingsProvider settingsProvider = this.module.getSettingsProvider();
        C12021c.m31671a(settingsProvider, "Cannot return null from a non-@Nullable @Provides method");
        return settingsProvider;
    }
}
