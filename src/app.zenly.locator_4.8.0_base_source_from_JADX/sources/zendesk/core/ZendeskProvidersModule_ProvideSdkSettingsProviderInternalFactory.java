package zendesk.core;

import dagger.internal.C12021c;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ZendeskProvidersModule_ProvideSdkSettingsProviderInternalFactory implements Factory<SdkSettingsProviderInternal> {
    private final Provider<ZendeskSettingsProvider> sdkSettingsProvider;

    public ZendeskProvidersModule_ProvideSdkSettingsProviderInternalFactory(Provider<ZendeskSettingsProvider> provider) {
        this.sdkSettingsProvider = provider;
    }

    public static Factory<SdkSettingsProviderInternal> create(Provider<ZendeskSettingsProvider> provider) {
        return new ZendeskProvidersModule_ProvideSdkSettingsProviderInternalFactory(provider);
    }

    public SdkSettingsProviderInternal get() {
        ZendeskSettingsProvider zendeskSettingsProvider = (ZendeskSettingsProvider) this.sdkSettingsProvider.get();
        ZendeskProvidersModule.provideSdkSettingsProviderInternal(zendeskSettingsProvider);
        C12021c.m31671a(zendeskSettingsProvider, "Cannot return null from a non-@Nullable @Provides method");
        return zendeskSettingsProvider;
    }
}
