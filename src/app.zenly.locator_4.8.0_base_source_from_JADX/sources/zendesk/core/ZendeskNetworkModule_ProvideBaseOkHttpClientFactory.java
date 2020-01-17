package zendesk.core;

import dagger.internal.C12021c;
import dagger.internal.Factory;
import java.util.concurrent.ExecutorService;
import javax.inject.Provider;
import okhttp3.C13325v;
import okhttp3.logging.HttpLoggingInterceptor;

public final class ZendeskNetworkModule_ProvideBaseOkHttpClientFactory implements Factory<C13325v> {
    private final Provider<ExecutorService> executorServiceProvider;
    private final Provider<HttpLoggingInterceptor> loggingInterceptorProvider;
    private final ZendeskNetworkModule module;
    private final Provider<ZendeskOauthIdHeaderInterceptor> oauthIdHeaderInterceptorProvider;
    private final Provider<UserAgentAndClientHeadersInterceptor> userAgentAndClientHeadersInterceptorProvider;

    public ZendeskNetworkModule_ProvideBaseOkHttpClientFactory(ZendeskNetworkModule zendeskNetworkModule, Provider<HttpLoggingInterceptor> provider, Provider<ZendeskOauthIdHeaderInterceptor> provider2, Provider<UserAgentAndClientHeadersInterceptor> provider3, Provider<ExecutorService> provider4) {
        this.module = zendeskNetworkModule;
        this.loggingInterceptorProvider = provider;
        this.oauthIdHeaderInterceptorProvider = provider2;
        this.userAgentAndClientHeadersInterceptorProvider = provider3;
        this.executorServiceProvider = provider4;
    }

    public static Factory<C13325v> create(ZendeskNetworkModule zendeskNetworkModule, Provider<HttpLoggingInterceptor> provider, Provider<ZendeskOauthIdHeaderInterceptor> provider2, Provider<UserAgentAndClientHeadersInterceptor> provider3, Provider<ExecutorService> provider4) {
        ZendeskNetworkModule_ProvideBaseOkHttpClientFactory zendeskNetworkModule_ProvideBaseOkHttpClientFactory = new ZendeskNetworkModule_ProvideBaseOkHttpClientFactory(zendeskNetworkModule, provider, provider2, provider3, provider4);
        return zendeskNetworkModule_ProvideBaseOkHttpClientFactory;
    }

    public C13325v get() {
        C13325v provideBaseOkHttpClient = this.module.provideBaseOkHttpClient((HttpLoggingInterceptor) this.loggingInterceptorProvider.get(), (ZendeskOauthIdHeaderInterceptor) this.oauthIdHeaderInterceptorProvider.get(), (UserAgentAndClientHeadersInterceptor) this.userAgentAndClientHeadersInterceptorProvider.get(), (ExecutorService) this.executorServiceProvider.get());
        C12021c.m31671a(provideBaseOkHttpClient, "Cannot return null from a non-@Nullable @Provides method");
        return provideBaseOkHttpClient;
    }
}
