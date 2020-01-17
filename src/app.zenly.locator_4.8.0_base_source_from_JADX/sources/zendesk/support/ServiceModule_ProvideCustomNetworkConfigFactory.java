package zendesk.support;

import dagger.internal.C12021c;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ServiceModule_ProvideCustomNetworkConfigFactory implements Factory<HelpCenterCachingNetworkConfig> {
    private final Provider<HelpCenterCachingInterceptor> helpCenterCachingInterceptorProvider;

    public ServiceModule_ProvideCustomNetworkConfigFactory(Provider<HelpCenterCachingInterceptor> provider) {
        this.helpCenterCachingInterceptorProvider = provider;
    }

    public static Factory<HelpCenterCachingNetworkConfig> create(Provider<HelpCenterCachingInterceptor> provider) {
        return new ServiceModule_ProvideCustomNetworkConfigFactory(provider);
    }

    public HelpCenterCachingNetworkConfig get() {
        HelpCenterCachingNetworkConfig provideCustomNetworkConfig = ServiceModule.provideCustomNetworkConfig((HelpCenterCachingInterceptor) this.helpCenterCachingInterceptorProvider.get());
        C12021c.m31671a(provideCustomNetworkConfig, "Cannot return null from a non-@Nullable @Provides method");
        return provideCustomNetworkConfig;
    }
}
