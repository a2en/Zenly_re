package zendesk.support;

import dagger.internal.C12021c;
import dagger.internal.Factory;
import java.util.Locale;
import javax.inject.Provider;
import zendesk.core.SettingsProvider;

public final class ProviderModule_ProvideSdkSettingsProviderFactory implements Factory<SupportSettingsProvider> {
    private final Provider<HelpCenterLocaleConverter> helpCenterLocaleConverterProvider;
    private final Provider<Locale> localeProvider;
    private final ProviderModule module;
    private final Provider<SettingsProvider> sdkSettingsProvider;

    public ProviderModule_ProvideSdkSettingsProviderFactory(ProviderModule providerModule, Provider<SettingsProvider> provider, Provider<Locale> provider2, Provider<HelpCenterLocaleConverter> provider3) {
        this.module = providerModule;
        this.sdkSettingsProvider = provider;
        this.localeProvider = provider2;
        this.helpCenterLocaleConverterProvider = provider3;
    }

    public static Factory<SupportSettingsProvider> create(ProviderModule providerModule, Provider<SettingsProvider> provider, Provider<Locale> provider2, Provider<HelpCenterLocaleConverter> provider3) {
        return new ProviderModule_ProvideSdkSettingsProviderFactory(providerModule, provider, provider2, provider3);
    }

    public SupportSettingsProvider get() {
        SupportSettingsProvider provideSdkSettingsProvider = this.module.provideSdkSettingsProvider((SettingsProvider) this.sdkSettingsProvider.get(), (Locale) this.localeProvider.get(), (HelpCenterLocaleConverter) this.helpCenterLocaleConverterProvider.get());
        C12021c.m31671a(provideSdkSettingsProvider, "Cannot return null from a non-@Nullable @Provides method");
        return provideSdkSettingsProvider;
    }
}
