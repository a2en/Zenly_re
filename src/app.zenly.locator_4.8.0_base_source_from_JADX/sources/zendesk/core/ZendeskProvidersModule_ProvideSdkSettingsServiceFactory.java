package zendesk.core;

import dagger.internal.C12021c;
import dagger.internal.Factory;
import javax.inject.Provider;
import retrofit2.C13430i;

public final class ZendeskProvidersModule_ProvideSdkSettingsServiceFactory implements Factory<SdkSettingsService> {
    private final Provider<C13430i> retrofitProvider;

    public ZendeskProvidersModule_ProvideSdkSettingsServiceFactory(Provider<C13430i> provider) {
        this.retrofitProvider = provider;
    }

    public static Factory<SdkSettingsService> create(Provider<C13430i> provider) {
        return new ZendeskProvidersModule_ProvideSdkSettingsServiceFactory(provider);
    }

    public SdkSettingsService get() {
        SdkSettingsService provideSdkSettingsService = ZendeskProvidersModule.provideSdkSettingsService((C13430i) this.retrofitProvider.get());
        C12021c.m31671a(provideSdkSettingsService, "Cannot return null from a non-@Nullable @Provides method");
        return provideSdkSettingsService;
    }
}
