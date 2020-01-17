package zendesk.support;

import dagger.internal.C12021c;
import dagger.internal.Factory;
import javax.inject.Provider;
import zendesk.core.MemoryCache;
import zendesk.core.SessionStorage;

public final class StorageModule_ProvideRequestStorageFactory implements Factory<RequestStorage> {
    private final Provider<SessionStorage> baseStorageProvider;
    private final Provider<MemoryCache> memoryCacheProvider;
    private final StorageModule module;
    private final Provider<RequestMigrator> requestMigratorProvider;

    public StorageModule_ProvideRequestStorageFactory(StorageModule storageModule, Provider<SessionStorage> provider, Provider<RequestMigrator> provider2, Provider<MemoryCache> provider3) {
        this.module = storageModule;
        this.baseStorageProvider = provider;
        this.requestMigratorProvider = provider2;
        this.memoryCacheProvider = provider3;
    }

    public static Factory<RequestStorage> create(StorageModule storageModule, Provider<SessionStorage> provider, Provider<RequestMigrator> provider2, Provider<MemoryCache> provider3) {
        return new StorageModule_ProvideRequestStorageFactory(storageModule, provider, provider2, provider3);
    }

    public RequestStorage get() {
        RequestStorage provideRequestStorage = this.module.provideRequestStorage((SessionStorage) this.baseStorageProvider.get(), (RequestMigrator) this.requestMigratorProvider.get(), (MemoryCache) this.memoryCacheProvider.get());
        C12021c.m31671a(provideRequestStorage, "Cannot return null from a non-@Nullable @Provides method");
        return provideRequestStorage;
    }
}
