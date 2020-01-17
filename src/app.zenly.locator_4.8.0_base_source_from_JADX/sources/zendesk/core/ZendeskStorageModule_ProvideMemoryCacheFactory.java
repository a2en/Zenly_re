package zendesk.core;

import dagger.internal.C12021c;
import dagger.internal.Factory;

public final class ZendeskStorageModule_ProvideMemoryCacheFactory implements Factory<MemoryCache> {
    private static final ZendeskStorageModule_ProvideMemoryCacheFactory INSTANCE = new ZendeskStorageModule_ProvideMemoryCacheFactory();

    public static Factory<MemoryCache> create() {
        return INSTANCE;
    }

    public MemoryCache get() {
        MemoryCache provideMemoryCache = ZendeskStorageModule.provideMemoryCache();
        C12021c.m31671a(provideMemoryCache, "Cannot return null from a non-@Nullable @Provides method");
        return provideMemoryCache;
    }
}
