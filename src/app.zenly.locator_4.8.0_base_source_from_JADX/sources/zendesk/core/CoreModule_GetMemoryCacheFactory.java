package zendesk.core;

import dagger.internal.C12021c;
import dagger.internal.Factory;

public final class CoreModule_GetMemoryCacheFactory implements Factory<MemoryCache> {
    private final CoreModule module;

    public CoreModule_GetMemoryCacheFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static Factory<MemoryCache> create(CoreModule coreModule) {
        return new CoreModule_GetMemoryCacheFactory(coreModule);
    }

    public MemoryCache get() {
        MemoryCache memoryCache = this.module.getMemoryCache();
        C12021c.m31671a(memoryCache, "Cannot return null from a non-@Nullable @Provides method");
        return memoryCache;
    }
}
