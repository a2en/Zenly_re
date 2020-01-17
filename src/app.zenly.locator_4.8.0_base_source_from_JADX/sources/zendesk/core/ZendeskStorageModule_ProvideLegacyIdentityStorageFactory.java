package zendesk.core;

import dagger.internal.C12021c;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ZendeskStorageModule_ProvideLegacyIdentityStorageFactory implements Factory<LegacyIdentityMigrator> {
    private final Provider<IdentityManager> identityManagerProvider;
    private final Provider<IdentityStorage> identityStorageProvider;
    private final Provider<SharedPreferencesStorage> legacyIdentityBaseStorageProvider;
    private final Provider<SharedPreferencesStorage> legacyPushBaseStorageProvider;
    private final Provider<PushDeviceIdStorage> pushDeviceIdStorageProvider;

    public ZendeskStorageModule_ProvideLegacyIdentityStorageFactory(Provider<SharedPreferencesStorage> provider, Provider<SharedPreferencesStorage> provider2, Provider<IdentityStorage> provider3, Provider<IdentityManager> provider4, Provider<PushDeviceIdStorage> provider5) {
        this.legacyIdentityBaseStorageProvider = provider;
        this.legacyPushBaseStorageProvider = provider2;
        this.identityStorageProvider = provider3;
        this.identityManagerProvider = provider4;
        this.pushDeviceIdStorageProvider = provider5;
    }

    public static Factory<LegacyIdentityMigrator> create(Provider<SharedPreferencesStorage> provider, Provider<SharedPreferencesStorage> provider2, Provider<IdentityStorage> provider3, Provider<IdentityManager> provider4, Provider<PushDeviceIdStorage> provider5) {
        ZendeskStorageModule_ProvideLegacyIdentityStorageFactory zendeskStorageModule_ProvideLegacyIdentityStorageFactory = new ZendeskStorageModule_ProvideLegacyIdentityStorageFactory(provider, provider2, provider3, provider4, provider5);
        return zendeskStorageModule_ProvideLegacyIdentityStorageFactory;
    }

    public LegacyIdentityMigrator get() {
        LegacyIdentityMigrator provideLegacyIdentityStorage = ZendeskStorageModule.provideLegacyIdentityStorage((SharedPreferencesStorage) this.legacyIdentityBaseStorageProvider.get(), (SharedPreferencesStorage) this.legacyPushBaseStorageProvider.get(), (IdentityStorage) this.identityStorageProvider.get(), (IdentityManager) this.identityManagerProvider.get(), (PushDeviceIdStorage) this.pushDeviceIdStorageProvider.get());
        C12021c.m31671a(provideLegacyIdentityStorage, "Cannot return null from a non-@Nullable @Provides method");
        return provideLegacyIdentityStorage;
    }
}
