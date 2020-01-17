package zendesk.core;

import dagger.internal.C12021c;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ZendeskStorageModule_ProvideIdentityStorageFactory implements Factory<IdentityStorage> {
    private final Provider<BaseStorage> baseStorageProvider;

    public ZendeskStorageModule_ProvideIdentityStorageFactory(Provider<BaseStorage> provider) {
        this.baseStorageProvider = provider;
    }

    public static Factory<IdentityStorage> create(Provider<BaseStorage> provider) {
        return new ZendeskStorageModule_ProvideIdentityStorageFactory(provider);
    }

    public IdentityStorage get() {
        IdentityStorage provideIdentityStorage = ZendeskStorageModule.provideIdentityStorage((BaseStorage) this.baseStorageProvider.get());
        C12021c.m31671a(provideIdentityStorage, "Cannot return null from a non-@Nullable @Provides method");
        return provideIdentityStorage;
    }
}
