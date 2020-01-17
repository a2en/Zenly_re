package zendesk.core;

import dagger.internal.C12021c;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ZendeskProvidersModule_ProvideAccessProviderFactory implements Factory<AccessProvider> {
    private final Provider<AccessService> accessServiceProvider;
    private final Provider<IdentityManager> identityManagerProvider;

    public ZendeskProvidersModule_ProvideAccessProviderFactory(Provider<IdentityManager> provider, Provider<AccessService> provider2) {
        this.identityManagerProvider = provider;
        this.accessServiceProvider = provider2;
    }

    public static Factory<AccessProvider> create(Provider<IdentityManager> provider, Provider<AccessService> provider2) {
        return new ZendeskProvidersModule_ProvideAccessProviderFactory(provider, provider2);
    }

    public AccessProvider get() {
        AccessProvider provideAccessProvider = ZendeskProvidersModule.provideAccessProvider((IdentityManager) this.identityManagerProvider.get(), (AccessService) this.accessServiceProvider.get());
        C12021c.m31671a(provideAccessProvider, "Cannot return null from a non-@Nullable @Provides method");
        return provideAccessProvider;
    }
}
