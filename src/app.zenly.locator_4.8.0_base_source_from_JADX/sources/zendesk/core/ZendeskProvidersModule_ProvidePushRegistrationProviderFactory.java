package zendesk.core;

import android.content.Context;
import dagger.internal.C12021c;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ZendeskProvidersModule_ProvidePushRegistrationProviderFactory implements Factory<PushRegistrationProvider> {
    private final Provider<BlipsCoreProvider> blipsProvider;
    private final Provider<Context> contextProvider;
    private final Provider<IdentityManager> identityManagerProvider;
    private final Provider<PushDeviceIdStorage> pushDeviceIdStorageProvider;
    private final Provider<PushRegistrationService> pushRegistrationServiceProvider;
    private final Provider<SettingsProvider> settingsProvider;

    public ZendeskProvidersModule_ProvidePushRegistrationProviderFactory(Provider<PushRegistrationService> provider, Provider<IdentityManager> provider2, Provider<SettingsProvider> provider3, Provider<BlipsCoreProvider> provider4, Provider<PushDeviceIdStorage> provider5, Provider<Context> provider6) {
        this.pushRegistrationServiceProvider = provider;
        this.identityManagerProvider = provider2;
        this.settingsProvider = provider3;
        this.blipsProvider = provider4;
        this.pushDeviceIdStorageProvider = provider5;
        this.contextProvider = provider6;
    }

    public static Factory<PushRegistrationProvider> create(Provider<PushRegistrationService> provider, Provider<IdentityManager> provider2, Provider<SettingsProvider> provider3, Provider<BlipsCoreProvider> provider4, Provider<PushDeviceIdStorage> provider5, Provider<Context> provider6) {
        ZendeskProvidersModule_ProvidePushRegistrationProviderFactory zendeskProvidersModule_ProvidePushRegistrationProviderFactory = new ZendeskProvidersModule_ProvidePushRegistrationProviderFactory(provider, provider2, provider3, provider4, provider5, provider6);
        return zendeskProvidersModule_ProvidePushRegistrationProviderFactory;
    }

    public PushRegistrationProvider get() {
        PushRegistrationProvider providePushRegistrationProvider = ZendeskProvidersModule.providePushRegistrationProvider((PushRegistrationService) this.pushRegistrationServiceProvider.get(), (IdentityManager) this.identityManagerProvider.get(), (SettingsProvider) this.settingsProvider.get(), (BlipsCoreProvider) this.blipsProvider.get(), (PushDeviceIdStorage) this.pushDeviceIdStorageProvider.get(), (Context) this.contextProvider.get());
        C12021c.m31671a(providePushRegistrationProvider, "Cannot return null from a non-@Nullable @Provides method");
        return providePushRegistrationProvider;
    }
}
