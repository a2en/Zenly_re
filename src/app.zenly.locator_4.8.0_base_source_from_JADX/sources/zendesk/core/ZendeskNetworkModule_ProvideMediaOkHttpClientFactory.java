package zendesk.core;

import dagger.internal.C12021c;
import dagger.internal.Factory;
import javax.inject.Provider;
import okhttp3.C13325v;

public final class ZendeskNetworkModule_ProvideMediaOkHttpClientFactory implements Factory<C13325v> {
    private final Provider<ZendeskAccessInterceptor> accessInterceptorProvider;
    private final Provider<ZendeskAuthHeaderInterceptor> authHeaderInterceptorProvider;
    private final Provider<CachingInterceptor> cachingInterceptorProvider;
    private final Provider<C13325v> okHttpClientProvider;
    private final Provider<ZendeskSettingsInterceptor> settingsInterceptorProvider;
    private final Provider<ZendeskUnauthorizedInterceptor> unauthorizedInterceptorProvider;

    public ZendeskNetworkModule_ProvideMediaOkHttpClientFactory(Provider<C13325v> provider, Provider<ZendeskAccessInterceptor> provider2, Provider<ZendeskAuthHeaderInterceptor> provider3, Provider<ZendeskSettingsInterceptor> provider4, Provider<CachingInterceptor> provider5, Provider<ZendeskUnauthorizedInterceptor> provider6) {
        this.okHttpClientProvider = provider;
        this.accessInterceptorProvider = provider2;
        this.authHeaderInterceptorProvider = provider3;
        this.settingsInterceptorProvider = provider4;
        this.cachingInterceptorProvider = provider5;
        this.unauthorizedInterceptorProvider = provider6;
    }

    public static Factory<C13325v> create(Provider<C13325v> provider, Provider<ZendeskAccessInterceptor> provider2, Provider<ZendeskAuthHeaderInterceptor> provider3, Provider<ZendeskSettingsInterceptor> provider4, Provider<CachingInterceptor> provider5, Provider<ZendeskUnauthorizedInterceptor> provider6) {
        ZendeskNetworkModule_ProvideMediaOkHttpClientFactory zendeskNetworkModule_ProvideMediaOkHttpClientFactory = new ZendeskNetworkModule_ProvideMediaOkHttpClientFactory(provider, provider2, provider3, provider4, provider5, provider6);
        return zendeskNetworkModule_ProvideMediaOkHttpClientFactory;
    }

    public C13325v get() {
        C13325v provideMediaOkHttpClient = ZendeskNetworkModule.provideMediaOkHttpClient((C13325v) this.okHttpClientProvider.get(), (ZendeskAccessInterceptor) this.accessInterceptorProvider.get(), (ZendeskAuthHeaderInterceptor) this.authHeaderInterceptorProvider.get(), (ZendeskSettingsInterceptor) this.settingsInterceptorProvider.get(), (CachingInterceptor) this.cachingInterceptorProvider.get(), (ZendeskUnauthorizedInterceptor) this.unauthorizedInterceptorProvider.get());
        C12021c.m31671a(provideMediaOkHttpClient, "Cannot return null from a non-@Nullable @Provides method");
        return provideMediaOkHttpClient;
    }
}
