package zendesk.core;

import dagger.internal.C12021c;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ZendeskStorageModule_ProvideAuthProviderFactory implements Factory<AuthenticationProvider> {
    private final Provider<IdentityManager> identityManagerProvider;

    public ZendeskStorageModule_ProvideAuthProviderFactory(Provider<IdentityManager> provider) {
        this.identityManagerProvider = provider;
    }

    public static Factory<AuthenticationProvider> create(Provider<IdentityManager> provider) {
        return new ZendeskStorageModule_ProvideAuthProviderFactory(provider);
    }

    public AuthenticationProvider get() {
        AuthenticationProvider provideAuthProvider = ZendeskStorageModule.provideAuthProvider((IdentityManager) this.identityManagerProvider.get());
        C12021c.m31671a(provideAuthProvider, "Cannot return null from a non-@Nullable @Provides method");
        return provideAuthProvider;
    }
}
