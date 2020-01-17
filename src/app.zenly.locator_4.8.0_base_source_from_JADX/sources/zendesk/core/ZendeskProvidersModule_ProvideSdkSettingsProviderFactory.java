package zendesk.core;

import dagger.internal.C12021c;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ZendeskProvidersModule_ProvideSdkSettingsProviderFactory implements Factory<SettingsProvider> {
    private final Provider<ZendeskSettingsProvider> sdkSettingsProvider;

    public ZendeskProvidersModule_ProvideSdkSettingsProviderFactory(Provider<ZendeskSettingsProvider> provider) {
        this.sdkSettingsProvider = provider;
    }

    public static Factory<SettingsProvider> create(Provider<ZendeskSettingsProvider> provider) {
        return new ZendeskProvidersModule_ProvideSdkSettingsProviderFactory(provider);
    }

    public SettingsProvider get() {
        ZendeskSettingsProvider zendeskSettingsProvider = (ZendeskSettingsProvider) this.sdkSettingsProvider.get();
        ZendeskProvidersModule.provideSdkSettingsProvider(zendeskSettingsProvider);
        C12021c.m31671a(zendeskSettingsProvider, "Cannot return null from a non-@Nullable @Provides method");
        return zendeskSettingsProvider;
    }
}
