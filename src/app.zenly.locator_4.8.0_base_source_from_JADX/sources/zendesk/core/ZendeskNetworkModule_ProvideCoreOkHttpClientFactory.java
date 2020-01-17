package zendesk.core;

import dagger.internal.C12021c;
import dagger.internal.Factory;
import javax.inject.Provider;
import okhttp3.C13325v;

public final class ZendeskNetworkModule_ProvideCoreOkHttpClientFactory implements Factory<C13325v> {
    private final Provider<AcceptHeaderInterceptor> acceptHeaderInterceptorProvider;
    private final Provider<AcceptLanguageHeaderInterceptor> acceptLanguageHeaderInterceptorProvider;
    private final Provider<C13325v> okHttpClientProvider;

    public ZendeskNetworkModule_ProvideCoreOkHttpClientFactory(Provider<C13325v> provider, Provider<AcceptLanguageHeaderInterceptor> provider2, Provider<AcceptHeaderInterceptor> provider3) {
        this.okHttpClientProvider = provider;
        this.acceptLanguageHeaderInterceptorProvider = provider2;
        this.acceptHeaderInterceptorProvider = provider3;
    }

    public static Factory<C13325v> create(Provider<C13325v> provider, Provider<AcceptLanguageHeaderInterceptor> provider2, Provider<AcceptHeaderInterceptor> provider3) {
        return new ZendeskNetworkModule_ProvideCoreOkHttpClientFactory(provider, provider2, provider3);
    }

    public C13325v get() {
        C13325v provideCoreOkHttpClient = ZendeskNetworkModule.provideCoreOkHttpClient((C13325v) this.okHttpClientProvider.get(), (AcceptLanguageHeaderInterceptor) this.acceptLanguageHeaderInterceptorProvider.get(), (AcceptHeaderInterceptor) this.acceptHeaderInterceptorProvider.get());
        C12021c.m31671a(provideCoreOkHttpClient, "Cannot return null from a non-@Nullable @Provides method");
        return provideCoreOkHttpClient;
    }
}
