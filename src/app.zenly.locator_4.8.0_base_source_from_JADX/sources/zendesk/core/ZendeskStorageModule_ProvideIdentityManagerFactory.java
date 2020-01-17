package zendesk.core;

import dagger.internal.C12021c;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ZendeskStorageModule_ProvideIdentityManagerFactory implements Factory<IdentityManager> {
    private final Provider<IdentityStorage> identityStorageProvider;

    public ZendeskStorageModule_ProvideIdentityManagerFactory(Provider<IdentityStorage> provider) {
        this.identityStorageProvider = provider;
    }

    public static Factory<IdentityManager> create(Provider<IdentityStorage> provider) {
        return new ZendeskStorageModule_ProvideIdentityManagerFactory(provider);
    }

    public IdentityManager get() {
        IdentityManager provideIdentityManager = ZendeskStorageModule.provideIdentityManager((IdentityStorage) this.identityStorageProvider.get());
        C12021c.m31671a(provideIdentityManager, "Cannot return null from a non-@Nullable @Provides method");
        return provideIdentityManager;
    }
}
