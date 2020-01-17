package zendesk.support;

import dagger.internal.C12021c;
import dagger.internal.Factory;

public final class StorageModule_ProvideHelpCenterSessionCacheFactory implements Factory<HelpCenterSessionCache> {
    private final StorageModule module;

    public StorageModule_ProvideHelpCenterSessionCacheFactory(StorageModule storageModule) {
        this.module = storageModule;
    }

    public static Factory<HelpCenterSessionCache> create(StorageModule storageModule) {
        return new StorageModule_ProvideHelpCenterSessionCacheFactory(storageModule);
    }

    public HelpCenterSessionCache get() {
        HelpCenterSessionCache provideHelpCenterSessionCache = this.module.provideHelpCenterSessionCache();
        C12021c.m31671a(provideHelpCenterSessionCache, "Cannot return null from a non-@Nullable @Provides method");
        return provideHelpCenterSessionCache;
    }
}
