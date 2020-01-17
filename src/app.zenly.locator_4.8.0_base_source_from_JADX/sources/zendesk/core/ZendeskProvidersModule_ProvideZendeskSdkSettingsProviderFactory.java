package zendesk.core;

import android.content.Context;
import dagger.internal.C12021c;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ZendeskProvidersModule_ProvideZendeskSdkSettingsProviderFactory implements Factory<ZendeskSettingsProvider> {
    private final Provider<ApplicationConfiguration> configurationProvider;
    private final Provider<Context> contextProvider;
    private final Provider<CoreSettingsStorage> coreSettingsStorageProvider;
    private final Provider<SdkSettingsService> sdkSettingsServiceProvider;
    private final Provider<Serializer> serializerProvider;
    private final Provider<SettingsStorage> settingsStorageProvider;

    public ZendeskProvidersModule_ProvideZendeskSdkSettingsProviderFactory(Provider<SdkSettingsService> provider, Provider<SettingsStorage> provider2, Provider<CoreSettingsStorage> provider3, Provider<Serializer> provider4, Provider<ApplicationConfiguration> provider5, Provider<Context> provider6) {
        this.sdkSettingsServiceProvider = provider;
        this.settingsStorageProvider = provider2;
        this.coreSettingsStorageProvider = provider3;
        this.serializerProvider = provider4;
        this.configurationProvider = provider5;
        this.contextProvider = provider6;
    }

    public static Factory<ZendeskSettingsProvider> create(Provider<SdkSettingsService> provider, Provider<SettingsStorage> provider2, Provider<CoreSettingsStorage> provider3, Provider<Serializer> provider4, Provider<ApplicationConfiguration> provider5, Provider<Context> provider6) {
        ZendeskProvidersModule_ProvideZendeskSdkSettingsProviderFactory zendeskProvidersModule_ProvideZendeskSdkSettingsProviderFactory = new ZendeskProvidersModule_ProvideZendeskSdkSettingsProviderFactory(provider, provider2, provider3, provider4, provider5, provider6);
        return zendeskProvidersModule_ProvideZendeskSdkSettingsProviderFactory;
    }

    public ZendeskSettingsProvider get() {
        ZendeskSettingsProvider provideZendeskSdkSettingsProvider = ZendeskProvidersModule.provideZendeskSdkSettingsProvider((SdkSettingsService) this.sdkSettingsServiceProvider.get(), (SettingsStorage) this.settingsStorageProvider.get(), (CoreSettingsStorage) this.coreSettingsStorageProvider.get(), (Serializer) this.serializerProvider.get(), (ApplicationConfiguration) this.configurationProvider.get(), (Context) this.contextProvider.get());
        C12021c.m31671a(provideZendeskSdkSettingsProvider, "Cannot return null from a non-@Nullable @Provides method");
        return provideZendeskSdkSettingsProvider;
    }
}
