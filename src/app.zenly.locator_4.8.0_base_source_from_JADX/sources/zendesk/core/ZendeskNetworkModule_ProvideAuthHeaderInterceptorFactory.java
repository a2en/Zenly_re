package zendesk.core;

import dagger.internal.C12021c;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ZendeskNetworkModule_ProvideAuthHeaderInterceptorFactory implements Factory<ZendeskAuthHeaderInterceptor> {
    private final Provider<IdentityManager> identityManagerProvider;

    public ZendeskNetworkModule_ProvideAuthHeaderInterceptorFactory(Provider<IdentityManager> provider) {
        this.identityManagerProvider = provider;
    }

    public static Factory<ZendeskAuthHeaderInterceptor> create(Provider<IdentityManager> provider) {
        return new ZendeskNetworkModule_ProvideAuthHeaderInterceptorFactory(provider);
    }

    public ZendeskAuthHeaderInterceptor get() {
        ZendeskAuthHeaderInterceptor provideAuthHeaderInterceptor = ZendeskNetworkModule.provideAuthHeaderInterceptor((IdentityManager) this.identityManagerProvider.get());
        C12021c.m31671a(provideAuthHeaderInterceptor, "Cannot return null from a non-@Nullable @Provides method");
        return provideAuthHeaderInterceptor;
    }
}
