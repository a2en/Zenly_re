package zendesk.core;

import dagger.internal.C12021c;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ZendeskStorageModule_ProvideCoreSettingsStorageFactory implements Factory<CoreSettingsStorage> {
    private final Provider<SettingsStorage> settingsStorageProvider;

    public ZendeskStorageModule_ProvideCoreSettingsStorageFactory(Provider<SettingsStorage> provider) {
        this.settingsStorageProvider = provider;
    }

    public static Factory<CoreSettingsStorage> create(Provider<SettingsStorage> provider) {
        return new ZendeskStorageModule_ProvideCoreSettingsStorageFactory(provider);
    }

    public CoreSettingsStorage get() {
        CoreSettingsStorage provideCoreSettingsStorage = ZendeskStorageModule.provideCoreSettingsStorage((SettingsStorage) this.settingsStorageProvider.get());
        C12021c.m31671a(provideCoreSettingsStorage, "Cannot return null from a non-@Nullable @Provides method");
        return provideCoreSettingsStorage;
    }
}
