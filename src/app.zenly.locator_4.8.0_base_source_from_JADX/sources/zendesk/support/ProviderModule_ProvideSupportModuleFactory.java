package zendesk.support;

import dagger.internal.C12021c;
import dagger.internal.Factory;
import javax.inject.Provider;
import zendesk.core.RestServiceProvider;

public final class ProviderModule_ProvideSupportModuleFactory implements Factory<SupportModule> {
    private final Provider<ArticleVoteStorage> articleVoteStorageProvider;
    private final Provider<SupportBlipsProvider> blipsProvider;
    private final Provider<HelpCenterProvider> helpCenterProvider;
    private final ProviderModule module;
    private final Provider<RequestProvider> requestProvider;
    private final Provider<RestServiceProvider> restServiceProvider;
    private final Provider<SupportSettingsProvider> settingsProvider;
    private final Provider<UploadProvider> uploadProvider;
    private final Provider<ZendeskTracker> zendeskTrackerProvider;

    public ProviderModule_ProvideSupportModuleFactory(ProviderModule providerModule, Provider<RequestProvider> provider, Provider<UploadProvider> provider2, Provider<HelpCenterProvider> provider3, Provider<SupportSettingsProvider> provider4, Provider<RestServiceProvider> provider5, Provider<SupportBlipsProvider> provider6, Provider<ZendeskTracker> provider7, Provider<ArticleVoteStorage> provider8) {
        this.module = providerModule;
        this.requestProvider = provider;
        this.uploadProvider = provider2;
        this.helpCenterProvider = provider3;
        this.settingsProvider = provider4;
        this.restServiceProvider = provider5;
        this.blipsProvider = provider6;
        this.zendeskTrackerProvider = provider7;
        this.articleVoteStorageProvider = provider8;
    }

    public static Factory<SupportModule> create(ProviderModule providerModule, Provider<RequestProvider> provider, Provider<UploadProvider> provider2, Provider<HelpCenterProvider> provider3, Provider<SupportSettingsProvider> provider4, Provider<RestServiceProvider> provider5, Provider<SupportBlipsProvider> provider6, Provider<ZendeskTracker> provider7, Provider<ArticleVoteStorage> provider8) {
        ProviderModule_ProvideSupportModuleFactory providerModule_ProvideSupportModuleFactory = new ProviderModule_ProvideSupportModuleFactory(providerModule, provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
        return providerModule_ProvideSupportModuleFactory;
    }

    public SupportModule get() {
        SupportModule provideSupportModule = this.module.provideSupportModule((RequestProvider) this.requestProvider.get(), (UploadProvider) this.uploadProvider.get(), (HelpCenterProvider) this.helpCenterProvider.get(), (SupportSettingsProvider) this.settingsProvider.get(), (RestServiceProvider) this.restServiceProvider.get(), (SupportBlipsProvider) this.blipsProvider.get(), (ZendeskTracker) this.zendeskTrackerProvider.get(), (ArticleVoteStorage) this.articleVoteStorageProvider.get());
        C12021c.m31671a(provideSupportModule, "Cannot return null from a non-@Nullable @Provides method");
        return provideSupportModule;
    }
}
