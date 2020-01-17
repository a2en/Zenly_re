package zendesk.support;

import dagger.internal.C12021c;
import dagger.internal.Factory;
import javax.inject.Provider;
import zendesk.core.AuthenticationProvider;

public final class ProviderModule_ProvideRequestProviderFactory implements Factory<RequestProvider> {
    private final Provider<AuthenticationProvider> authenticationProvider;
    private final Provider<SupportBlipsProvider> blipsProvider;
    private final ProviderModule module;
    private final Provider<ZendeskRequestService> requestServiceProvider;
    private final Provider<RequestSessionCache> requestSessionCacheProvider;
    private final Provider<RequestStorage> requestStorageProvider;
    private final Provider<SupportSettingsProvider> settingsProvider;
    private final Provider<SupportSdkMetadata> supportSdkMetadataProvider;
    private final Provider<ZendeskTracker> zendeskTrackerProvider;

    public ProviderModule_ProvideRequestProviderFactory(ProviderModule providerModule, Provider<SupportSettingsProvider> provider, Provider<AuthenticationProvider> provider2, Provider<ZendeskRequestService> provider3, Provider<RequestStorage> provider4, Provider<RequestSessionCache> provider5, Provider<ZendeskTracker> provider6, Provider<SupportSdkMetadata> provider7, Provider<SupportBlipsProvider> provider8) {
        this.module = providerModule;
        this.settingsProvider = provider;
        this.authenticationProvider = provider2;
        this.requestServiceProvider = provider3;
        this.requestStorageProvider = provider4;
        this.requestSessionCacheProvider = provider5;
        this.zendeskTrackerProvider = provider6;
        this.supportSdkMetadataProvider = provider7;
        this.blipsProvider = provider8;
    }

    public static Factory<RequestProvider> create(ProviderModule providerModule, Provider<SupportSettingsProvider> provider, Provider<AuthenticationProvider> provider2, Provider<ZendeskRequestService> provider3, Provider<RequestStorage> provider4, Provider<RequestSessionCache> provider5, Provider<ZendeskTracker> provider6, Provider<SupportSdkMetadata> provider7, Provider<SupportBlipsProvider> provider8) {
        ProviderModule_ProvideRequestProviderFactory providerModule_ProvideRequestProviderFactory = new ProviderModule_ProvideRequestProviderFactory(providerModule, provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
        return providerModule_ProvideRequestProviderFactory;
    }

    public RequestProvider get() {
        RequestProvider provideRequestProvider = this.module.provideRequestProvider((SupportSettingsProvider) this.settingsProvider.get(), (AuthenticationProvider) this.authenticationProvider.get(), (ZendeskRequestService) this.requestServiceProvider.get(), (RequestStorage) this.requestStorageProvider.get(), (RequestSessionCache) this.requestSessionCacheProvider.get(), (ZendeskTracker) this.zendeskTrackerProvider.get(), (SupportSdkMetadata) this.supportSdkMetadataProvider.get(), (SupportBlipsProvider) this.blipsProvider.get());
        C12021c.m31671a(provideRequestProvider, "Cannot return null from a non-@Nullable @Provides method");
        return provideRequestProvider;
    }
}
