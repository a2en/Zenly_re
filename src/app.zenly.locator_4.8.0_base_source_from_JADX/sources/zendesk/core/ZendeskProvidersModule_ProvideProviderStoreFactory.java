package zendesk.core;

import dagger.internal.C12021c;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ZendeskProvidersModule_ProvideProviderStoreFactory implements Factory<ProviderStore> {
    private final Provider<PushRegistrationProvider> pushRegistrationProvider;
    private final Provider<UserProvider> userProvider;

    public ZendeskProvidersModule_ProvideProviderStoreFactory(Provider<UserProvider> provider, Provider<PushRegistrationProvider> provider2) {
        this.userProvider = provider;
        this.pushRegistrationProvider = provider2;
    }

    public static Factory<ProviderStore> create(Provider<UserProvider> provider, Provider<PushRegistrationProvider> provider2) {
        return new ZendeskProvidersModule_ProvideProviderStoreFactory(provider, provider2);
    }

    public ProviderStore get() {
        ProviderStore provideProviderStore = ZendeskProvidersModule.provideProviderStore((UserProvider) this.userProvider.get(), (PushRegistrationProvider) this.pushRegistrationProvider.get());
        C12021c.m31671a(provideProviderStore, "Cannot return null from a non-@Nullable @Provides method");
        return provideProviderStore;
    }
}
