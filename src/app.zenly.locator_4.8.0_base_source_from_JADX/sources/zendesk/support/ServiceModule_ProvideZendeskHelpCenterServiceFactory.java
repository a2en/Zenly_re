package zendesk.support;

import dagger.internal.C12021c;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ServiceModule_ProvideZendeskHelpCenterServiceFactory implements Factory<ZendeskHelpCenterService> {
    private final Provider<HelpCenterService> helpCenterServiceProvider;
    private final Provider<HelpCenterLocaleConverter> localeConverterProvider;

    public ServiceModule_ProvideZendeskHelpCenterServiceFactory(Provider<HelpCenterService> provider, Provider<HelpCenterLocaleConverter> provider2) {
        this.helpCenterServiceProvider = provider;
        this.localeConverterProvider = provider2;
    }

    public static Factory<ZendeskHelpCenterService> create(Provider<HelpCenterService> provider, Provider<HelpCenterLocaleConverter> provider2) {
        return new ServiceModule_ProvideZendeskHelpCenterServiceFactory(provider, provider2);
    }

    public ZendeskHelpCenterService get() {
        ZendeskHelpCenterService provideZendeskHelpCenterService = ServiceModule.provideZendeskHelpCenterService((HelpCenterService) this.helpCenterServiceProvider.get(), (HelpCenterLocaleConverter) this.localeConverterProvider.get());
        C12021c.m31671a(provideZendeskHelpCenterService, "Cannot return null from a non-@Nullable @Provides method");
        return provideZendeskHelpCenterService;
    }
}
