package zendesk.core;

import dagger.internal.C12021c;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ZendeskNetworkModule_ProvideCachingInterceptorFactory implements Factory<CachingInterceptor> {
    private final Provider<BaseStorage> mediaCacheProvider;

    public ZendeskNetworkModule_ProvideCachingInterceptorFactory(Provider<BaseStorage> provider) {
        this.mediaCacheProvider = provider;
    }

    public static Factory<CachingInterceptor> create(Provider<BaseStorage> provider) {
        return new ZendeskNetworkModule_ProvideCachingInterceptorFactory(provider);
    }

    public CachingInterceptor get() {
        CachingInterceptor provideCachingInterceptor = ZendeskNetworkModule.provideCachingInterceptor((BaseStorage) this.mediaCacheProvider.get());
        C12021c.m31671a(provideCachingInterceptor, "Cannot return null from a non-@Nullable @Provides method");
        return provideCachingInterceptor;
    }
}
