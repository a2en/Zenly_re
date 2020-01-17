package zendesk.core;

import dagger.internal.C12021c;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ZendeskStorageModule_ProvideSdkStorageFactory implements Factory<Storage> {
    private final Provider<MemoryCache> memoryCacheProvider;
    private final Provider<BaseStorage> sdkBaseStorageProvider;
    private final Provider<SessionStorage> sessionStorageProvider;
    private final Provider<SettingsStorage> settingsStorageProvider;

    public ZendeskStorageModule_ProvideSdkStorageFactory(Provider<SettingsStorage> provider, Provider<SessionStorage> provider2, Provider<BaseStorage> provider3, Provider<MemoryCache> provider4) {
        this.settingsStorageProvider = provider;
        this.sessionStorageProvider = provider2;
        this.sdkBaseStorageProvider = provider3;
        this.memoryCacheProvider = provider4;
    }

    public static Factory<Storage> create(Provider<SettingsStorage> provider, Provider<SessionStorage> provider2, Provider<BaseStorage> provider3, Provider<MemoryCache> provider4) {
        return new ZendeskStorageModule_ProvideSdkStorageFactory(provider, provider2, provider3, provider4);
    }

    public Storage get() {
        Storage provideSdkStorage = ZendeskStorageModule.provideSdkStorage((SettingsStorage) this.settingsStorageProvider.get(), (SessionStorage) this.sessionStorageProvider.get(), (BaseStorage) this.sdkBaseStorageProvider.get(), (MemoryCache) this.memoryCacheProvider.get());
        C12021c.m31671a(provideSdkStorage, "Cannot return null from a non-@Nullable @Provides method");
        return provideSdkStorage;
    }
}
