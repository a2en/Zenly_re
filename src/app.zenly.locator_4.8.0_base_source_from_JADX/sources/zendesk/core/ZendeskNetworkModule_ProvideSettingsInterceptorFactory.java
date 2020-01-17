package zendesk.core;

import dagger.internal.C12021c;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ZendeskNetworkModule_ProvideSettingsInterceptorFactory implements Factory<ZendeskSettingsInterceptor> {
    private final Provider<SdkSettingsProviderInternal> sdkSettingsProvider;
    private final Provider<SettingsStorage> settingsStorageProvider;

    public ZendeskNetworkModule_ProvideSettingsInterceptorFactory(Provider<SdkSettingsProviderInternal> provider, Provider<SettingsStorage> provider2) {
        this.sdkSettingsProvider = provider;
        this.settingsStorageProvider = provider2;
    }

    public static Factory<ZendeskSettingsInterceptor> create(Provider<SdkSettingsProviderInternal> provider, Provider<SettingsStorage> provider2) {
        return new ZendeskNetworkModule_ProvideSettingsInterceptorFactory(provider, provider2);
    }

    public ZendeskSettingsInterceptor get() {
        ZendeskSettingsInterceptor provideSettingsInterceptor = ZendeskNetworkModule.provideSettingsInterceptor((SdkSettingsProviderInternal) this.sdkSettingsProvider.get(), (SettingsStorage) this.settingsStorageProvider.get());
        C12021c.m31671a(provideSettingsInterceptor, "Cannot return null from a non-@Nullable @Provides method");
        return provideSettingsInterceptor;
    }
}
