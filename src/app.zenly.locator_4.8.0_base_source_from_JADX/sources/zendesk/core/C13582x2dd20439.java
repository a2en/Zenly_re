package zendesk.core;

import dagger.internal.C12021c;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: zendesk.core.ZendeskNetworkModule_ProvideZendeskBasicHeadersInterceptorFactory */
public final class C13582x2dd20439 implements Factory<ZendeskOauthIdHeaderInterceptor> {
    private final Provider<ApplicationConfiguration> configurationProvider;
    private final ZendeskNetworkModule module;

    public C13582x2dd20439(ZendeskNetworkModule zendeskNetworkModule, Provider<ApplicationConfiguration> provider) {
        this.module = zendeskNetworkModule;
        this.configurationProvider = provider;
    }

    public static Factory<ZendeskOauthIdHeaderInterceptor> create(ZendeskNetworkModule zendeskNetworkModule, Provider<ApplicationConfiguration> provider) {
        return new C13582x2dd20439(zendeskNetworkModule, provider);
    }

    public ZendeskOauthIdHeaderInterceptor get() {
        ZendeskOauthIdHeaderInterceptor provideZendeskBasicHeadersInterceptor = this.module.provideZendeskBasicHeadersInterceptor((ApplicationConfiguration) this.configurationProvider.get());
        C12021c.m31671a(provideZendeskBasicHeadersInterceptor, "Cannot return null from a non-@Nullable @Provides method");
        return provideZendeskBasicHeadersInterceptor;
    }
}
