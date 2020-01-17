package zendesk.support;

import dagger.internal.C12021c;
import dagger.internal.Factory;

public final class StorageModule_ProvideRequestSessionCacheFactory implements Factory<RequestSessionCache> {
    private final StorageModule module;

    public StorageModule_ProvideRequestSessionCacheFactory(StorageModule storageModule) {
        this.module = storageModule;
    }

    public static Factory<RequestSessionCache> create(StorageModule storageModule) {
        return new StorageModule_ProvideRequestSessionCacheFactory(storageModule);
    }

    public RequestSessionCache get() {
        RequestSessionCache provideRequestSessionCache = this.module.provideRequestSessionCache();
        C12021c.m31671a(provideRequestSessionCache, "Cannot return null from a non-@Nullable @Provides method");
        return provideRequestSessionCache;
    }
}
