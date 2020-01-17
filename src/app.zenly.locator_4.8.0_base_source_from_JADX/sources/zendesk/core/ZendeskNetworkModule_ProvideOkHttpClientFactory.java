package zendesk.core;

import dagger.internal.C12021c;
import dagger.internal.Factory;
import javax.inject.Provider;
import okhttp3.C13204g;
import okhttp3.C13325v;

public final class ZendeskNetworkModule_ProvideOkHttpClientFactory implements Factory<C13325v> {
    private final Provider<AcceptHeaderInterceptor> acceptHeaderInterceptorProvider;
    private final Provider<ZendeskAccessInterceptor> accessInterceptorProvider;
    private final Provider<ZendeskAuthHeaderInterceptor> authHeaderInterceptorProvider;
    private final Provider<C13204g> cacheProvider;
    private final Provider<C13325v> okHttpClientProvider;
    private final Provider<ZendeskSettingsInterceptor> settingsInterceptorProvider;
    private final Provider<ZendeskUnauthorizedInterceptor> unauthorizedInterceptorProvider;

    public ZendeskNetworkModule_ProvideOkHttpClientFactory(Provider<C13325v> provider, Provider<ZendeskAccessInterceptor> provider2, Provider<ZendeskUnauthorizedInterceptor> provider3, Provider<ZendeskAuthHeaderInterceptor> provider4, Provider<ZendeskSettingsInterceptor> provider5, Provider<AcceptHeaderInterceptor> provider6, Provider<C13204g> provider7) {
        this.okHttpClientProvider = provider;
        this.accessInterceptorProvider = provider2;
        this.unauthorizedInterceptorProvider = provider3;
        this.authHeaderInterceptorProvider = provider4;
        this.settingsInterceptorProvider = provider5;
        this.acceptHeaderInterceptorProvider = provider6;
        this.cacheProvider = provider7;
    }

    public static Factory<C13325v> create(Provider<C13325v> provider, Provider<ZendeskAccessInterceptor> provider2, Provider<ZendeskUnauthorizedInterceptor> provider3, Provider<ZendeskAuthHeaderInterceptor> provider4, Provider<ZendeskSettingsInterceptor> provider5, Provider<AcceptHeaderInterceptor> provider6, Provider<C13204g> provider7) {
        ZendeskNetworkModule_ProvideOkHttpClientFactory zendeskNetworkModule_ProvideOkHttpClientFactory = new ZendeskNetworkModule_ProvideOkHttpClientFactory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
        return zendeskNetworkModule_ProvideOkHttpClientFactory;
    }

    public C13325v get() {
        C13325v provideOkHttpClient = ZendeskNetworkModule.provideOkHttpClient((C13325v) this.okHttpClientProvider.get(), (ZendeskAccessInterceptor) this.accessInterceptorProvider.get(), (ZendeskUnauthorizedInterceptor) this.unauthorizedInterceptorProvider.get(), (ZendeskAuthHeaderInterceptor) this.authHeaderInterceptorProvider.get(), (ZendeskSettingsInterceptor) this.settingsInterceptorProvider.get(), (AcceptHeaderInterceptor) this.acceptHeaderInterceptorProvider.get(), (C13204g) this.cacheProvider.get());
        C12021c.m31671a(provideOkHttpClient, "Cannot return null from a non-@Nullable @Provides method");
        return provideOkHttpClient;
    }
}
