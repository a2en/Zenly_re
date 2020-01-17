package zendesk.support;

import dagger.internal.C12021c;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ProviderModule_ProvideHelpCenterProviderFactory implements Factory<HelpCenterProvider> {
    private final Provider<ZendeskHelpCenterService> helpCenterServiceProvider;
    private final Provider<HelpCenterSessionCache> helpCenterSessionCacheProvider;
    private final ProviderModule module;
    private final Provider<SupportSettingsProvider> settingsProvider;
    private final Provider<SupportBlipsProvider> supportBlipsProvider;
    private final Provider<ZendeskTracker> zendeskTrackerProvider;

    public ProviderModule_ProvideHelpCenterProviderFactory(ProviderModule providerModule, Provider<SupportSettingsProvider> provider, Provider<SupportBlipsProvider> provider2, Provider<ZendeskHelpCenterService> provider3, Provider<HelpCenterSessionCache> provider4, Provider<ZendeskTracker> provider5) {
        this.module = providerModule;
        this.settingsProvider = provider;
        this.supportBlipsProvider = provider2;
        this.helpCenterServiceProvider = provider3;
        this.helpCenterSessionCacheProvider = provider4;
        this.zendeskTrackerProvider = provider5;
    }

    public static Factory<HelpCenterProvider> create(ProviderModule providerModule, Provider<SupportSettingsProvider> provider, Provider<SupportBlipsProvider> provider2, Provider<ZendeskHelpCenterService> provider3, Provider<HelpCenterSessionCache> provider4, Provider<ZendeskTracker> provider5) {
        ProviderModule_ProvideHelpCenterProviderFactory providerModule_ProvideHelpCenterProviderFactory = new ProviderModule_ProvideHelpCenterProviderFactory(providerModule, provider, provider2, provider3, provider4, provider5);
        return providerModule_ProvideHelpCenterProviderFactory;
    }

    public HelpCenterProvider get() {
        HelpCenterProvider provideHelpCenterProvider = this.module.provideHelpCenterProvider((SupportSettingsProvider) this.settingsProvider.get(), (SupportBlipsProvider) this.supportBlipsProvider.get(), (ZendeskHelpCenterService) this.helpCenterServiceProvider.get(), (HelpCenterSessionCache) this.helpCenterSessionCacheProvider.get(), (ZendeskTracker) this.zendeskTrackerProvider.get());
        C12021c.m31671a(provideHelpCenterProvider, "Cannot return null from a non-@Nullable @Provides method");
        return provideHelpCenterProvider;
    }
}
