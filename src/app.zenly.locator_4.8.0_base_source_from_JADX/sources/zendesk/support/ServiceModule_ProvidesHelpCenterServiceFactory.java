package zendesk.support;

import dagger.internal.C12021c;
import dagger.internal.Factory;
import javax.inject.Provider;
import zendesk.core.RestServiceProvider;

public final class ServiceModule_ProvidesHelpCenterServiceFactory implements Factory<HelpCenterService> {
    private final Provider<HelpCenterCachingNetworkConfig> helpCenterCachingNetworkConfigProvider;
    private final Provider<RestServiceProvider> restServiceProvider;

    public ServiceModule_ProvidesHelpCenterServiceFactory(Provider<RestServiceProvider> provider, Provider<HelpCenterCachingNetworkConfig> provider2) {
        this.restServiceProvider = provider;
        this.helpCenterCachingNetworkConfigProvider = provider2;
    }

    public static Factory<HelpCenterService> create(Provider<RestServiceProvider> provider, Provider<HelpCenterCachingNetworkConfig> provider2) {
        return new ServiceModule_ProvidesHelpCenterServiceFactory(provider, provider2);
    }

    public HelpCenterService get() {
        HelpCenterService providesHelpCenterService = ServiceModule.providesHelpCenterService((RestServiceProvider) this.restServiceProvider.get(), (HelpCenterCachingNetworkConfig) this.helpCenterCachingNetworkConfigProvider.get());
        C12021c.m31671a(providesHelpCenterService, "Cannot return null from a non-@Nullable @Provides method");
        return providesHelpCenterService;
    }
}
