package zendesk.core;

import dagger.internal.C12021c;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ZendeskApplicationModule_ProvideZendeskFactory implements Factory<ZendeskShadow> {
    private final Provider<BlipsCoreProvider> blipsCoreProvider;
    private final Provider<CoreModule> coreModuleProvider;
    private final Provider<IdentityManager> identityManagerProvider;
    private final Provider<LegacyIdentityMigrator> legacyIdentityMigratorProvider;
    private final Provider<ProviderStore> providerStoreProvider;
    private final Provider<PushRegistrationProvider> pushRegistrationProvider;
    private final Provider<Storage> storageProvider;

    public ZendeskApplicationModule_ProvideZendeskFactory(Provider<Storage> provider, Provider<LegacyIdentityMigrator> provider2, Provider<IdentityManager> provider3, Provider<BlipsCoreProvider> provider4, Provider<PushRegistrationProvider> provider5, Provider<CoreModule> provider6, Provider<ProviderStore> provider7) {
        this.storageProvider = provider;
        this.legacyIdentityMigratorProvider = provider2;
        this.identityManagerProvider = provider3;
        this.blipsCoreProvider = provider4;
        this.pushRegistrationProvider = provider5;
        this.coreModuleProvider = provider6;
        this.providerStoreProvider = provider7;
    }

    public static Factory<ZendeskShadow> create(Provider<Storage> provider, Provider<LegacyIdentityMigrator> provider2, Provider<IdentityManager> provider3, Provider<BlipsCoreProvider> provider4, Provider<PushRegistrationProvider> provider5, Provider<CoreModule> provider6, Provider<ProviderStore> provider7) {
        ZendeskApplicationModule_ProvideZendeskFactory zendeskApplicationModule_ProvideZendeskFactory = new ZendeskApplicationModule_ProvideZendeskFactory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
        return zendeskApplicationModule_ProvideZendeskFactory;
    }

    public ZendeskShadow get() {
        ZendeskShadow provideZendesk = ZendeskApplicationModule.provideZendesk((Storage) this.storageProvider.get(), (LegacyIdentityMigrator) this.legacyIdentityMigratorProvider.get(), (IdentityManager) this.identityManagerProvider.get(), (BlipsCoreProvider) this.blipsCoreProvider.get(), (PushRegistrationProvider) this.pushRegistrationProvider.get(), (CoreModule) this.coreModuleProvider.get(), (ProviderStore) this.providerStoreProvider.get());
        C12021c.m31671a(provideZendesk, "Cannot return null from a non-@Nullable @Provides method");
        return provideZendesk;
    }
}
