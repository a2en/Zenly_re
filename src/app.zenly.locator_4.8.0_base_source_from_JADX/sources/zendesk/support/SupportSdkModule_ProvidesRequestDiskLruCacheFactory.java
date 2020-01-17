package zendesk.support;

import dagger.internal.C12021c;
import dagger.internal.Factory;
import javax.inject.Provider;
import p333g.p369e.p370a.C12095a;
import zendesk.core.SessionStorage;

public final class SupportSdkModule_ProvidesRequestDiskLruCacheFactory implements Factory<C12095a> {
    private final SupportSdkModule module;
    private final Provider<SessionStorage> sessionStorageProvider;

    public SupportSdkModule_ProvidesRequestDiskLruCacheFactory(SupportSdkModule supportSdkModule, Provider<SessionStorage> provider) {
        this.module = supportSdkModule;
        this.sessionStorageProvider = provider;
    }

    public static Factory<C12095a> create(SupportSdkModule supportSdkModule, Provider<SessionStorage> provider) {
        return new SupportSdkModule_ProvidesRequestDiskLruCacheFactory(supportSdkModule, provider);
    }

    public C12095a get() {
        C12095a providesRequestDiskLruCache = this.module.providesRequestDiskLruCache((SessionStorage) this.sessionStorageProvider.get());
        C12021c.m31671a(providesRequestDiskLruCache, "Cannot return null from a non-@Nullable @Provides method");
        return providesRequestDiskLruCache;
    }
}
