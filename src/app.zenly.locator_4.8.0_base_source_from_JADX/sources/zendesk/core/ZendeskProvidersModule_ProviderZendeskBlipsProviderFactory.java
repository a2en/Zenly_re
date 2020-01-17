package zendesk.core;

import dagger.internal.C12021c;
import dagger.internal.Factory;
import java.util.concurrent.ExecutorService;
import javax.inject.Provider;

public final class ZendeskProvidersModule_ProviderZendeskBlipsProviderFactory implements Factory<ZendeskBlipsProvider> {
    private final Provider<ApplicationConfiguration> applicationConfigurationProvider;
    private final Provider<BlipsService> blipsServiceProvider;
    private final Provider<CoreSettingsStorage> coreSettingsStorageProvider;
    private final Provider<DeviceInfo> deviceInfoProvider;
    private final Provider<ExecutorService> executorProvider;
    private final Provider<IdentityManager> identityManagerProvider;
    private final Provider<Serializer> serializerProvider;

    public ZendeskProvidersModule_ProviderZendeskBlipsProviderFactory(Provider<BlipsService> provider, Provider<DeviceInfo> provider2, Provider<Serializer> provider3, Provider<IdentityManager> provider4, Provider<ApplicationConfiguration> provider5, Provider<CoreSettingsStorage> provider6, Provider<ExecutorService> provider7) {
        this.blipsServiceProvider = provider;
        this.deviceInfoProvider = provider2;
        this.serializerProvider = provider3;
        this.identityManagerProvider = provider4;
        this.applicationConfigurationProvider = provider5;
        this.coreSettingsStorageProvider = provider6;
        this.executorProvider = provider7;
    }

    public static Factory<ZendeskBlipsProvider> create(Provider<BlipsService> provider, Provider<DeviceInfo> provider2, Provider<Serializer> provider3, Provider<IdentityManager> provider4, Provider<ApplicationConfiguration> provider5, Provider<CoreSettingsStorage> provider6, Provider<ExecutorService> provider7) {
        ZendeskProvidersModule_ProviderZendeskBlipsProviderFactory zendeskProvidersModule_ProviderZendeskBlipsProviderFactory = new ZendeskProvidersModule_ProviderZendeskBlipsProviderFactory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
        return zendeskProvidersModule_ProviderZendeskBlipsProviderFactory;
    }

    public ZendeskBlipsProvider get() {
        ZendeskBlipsProvider providerZendeskBlipsProvider = ZendeskProvidersModule.providerZendeskBlipsProvider((BlipsService) this.blipsServiceProvider.get(), (DeviceInfo) this.deviceInfoProvider.get(), (Serializer) this.serializerProvider.get(), (IdentityManager) this.identityManagerProvider.get(), (ApplicationConfiguration) this.applicationConfigurationProvider.get(), (CoreSettingsStorage) this.coreSettingsStorageProvider.get(), (ExecutorService) this.executorProvider.get());
        C12021c.m31671a(providerZendeskBlipsProvider, "Cannot return null from a non-@Nullable @Provides method");
        return providerZendeskBlipsProvider;
    }
}
