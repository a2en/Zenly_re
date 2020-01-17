package zendesk.core;

import dagger.internal.C12021c;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ZendeskNetworkModule_ProvideAccessInterceptorFactory implements Factory<ZendeskAccessInterceptor> {
    private final Provider<AccessProvider> accessProvider;
    private final Provider<CoreSettingsStorage> coreSettingsStorageProvider;
    private final Provider<IdentityManager> identityManagerProvider;
    private final Provider<Storage> storageProvider;

    public ZendeskNetworkModule_ProvideAccessInterceptorFactory(Provider<IdentityManager> provider, Provider<AccessProvider> provider2, Provider<Storage> provider3, Provider<CoreSettingsStorage> provider4) {
        this.identityManagerProvider = provider;
        this.accessProvider = provider2;
        this.storageProvider = provider3;
        this.coreSettingsStorageProvider = provider4;
    }

    public static Factory<ZendeskAccessInterceptor> create(Provider<IdentityManager> provider, Provider<AccessProvider> provider2, Provider<Storage> provider3, Provider<CoreSettingsStorage> provider4) {
        return new ZendeskNetworkModule_ProvideAccessInterceptorFactory(provider, provider2, provider3, provider4);
    }

    public ZendeskAccessInterceptor get() {
        ZendeskAccessInterceptor provideAccessInterceptor = ZendeskNetworkModule.provideAccessInterceptor((IdentityManager) this.identityManagerProvider.get(), (AccessProvider) this.accessProvider.get(), (Storage) this.storageProvider.get(), (CoreSettingsStorage) this.coreSettingsStorageProvider.get());
        C12021c.m31671a(provideAccessInterceptor, "Cannot return null from a non-@Nullable @Provides method");
        return provideAccessInterceptor;
    }
}
