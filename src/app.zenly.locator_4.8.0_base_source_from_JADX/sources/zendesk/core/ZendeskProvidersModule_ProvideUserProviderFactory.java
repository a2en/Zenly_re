package zendesk.core;

import dagger.internal.C12021c;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ZendeskProvidersModule_ProvideUserProviderFactory implements Factory<UserProvider> {
    private final Provider<UserService> userServiceProvider;

    public ZendeskProvidersModule_ProvideUserProviderFactory(Provider<UserService> provider) {
        this.userServiceProvider = provider;
    }

    public static Factory<UserProvider> create(Provider<UserService> provider) {
        return new ZendeskProvidersModule_ProvideUserProviderFactory(provider);
    }

    public UserProvider get() {
        UserProvider provideUserProvider = ZendeskProvidersModule.provideUserProvider((UserService) this.userServiceProvider.get());
        C12021c.m31671a(provideUserProvider, "Cannot return null from a non-@Nullable @Provides method");
        return provideUserProvider;
    }
}
