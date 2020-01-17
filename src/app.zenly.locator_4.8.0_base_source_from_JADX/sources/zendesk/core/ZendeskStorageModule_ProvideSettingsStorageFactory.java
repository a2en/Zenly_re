package zendesk.core;

import dagger.internal.C12021c;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ZendeskStorageModule_ProvideSettingsStorageFactory implements Factory<SettingsStorage> {
    private final Provider<BaseStorage> baseStorageProvider;

    public ZendeskStorageModule_ProvideSettingsStorageFactory(Provider<BaseStorage> provider) {
        this.baseStorageProvider = provider;
    }

    public static Factory<SettingsStorage> create(Provider<BaseStorage> provider) {
        return new ZendeskStorageModule_ProvideSettingsStorageFactory(provider);
    }

    public SettingsStorage get() {
        SettingsStorage provideSettingsStorage = ZendeskStorageModule.provideSettingsStorage((BaseStorage) this.baseStorageProvider.get());
        C12021c.m31671a(provideSettingsStorage, "Cannot return null from a non-@Nullable @Provides method");
        return provideSettingsStorage;
    }
}
