package zendesk.support;

import dagger.internal.C12021c;
import dagger.internal.Factory;

public final class ProviderModule_ProvideHelpCenterLocaleConverterFactory implements Factory<HelpCenterLocaleConverter> {
    private final ProviderModule module;

    public ProviderModule_ProvideHelpCenterLocaleConverterFactory(ProviderModule providerModule) {
        this.module = providerModule;
    }

    public static Factory<HelpCenterLocaleConverter> create(ProviderModule providerModule) {
        return new ProviderModule_ProvideHelpCenterLocaleConverterFactory(providerModule);
    }

    public HelpCenterLocaleConverter get() {
        HelpCenterLocaleConverter provideHelpCenterLocaleConverter = this.module.provideHelpCenterLocaleConverter();
        C12021c.m31671a(provideHelpCenterLocaleConverter, "Cannot return null from a non-@Nullable @Provides method");
        return provideHelpCenterLocaleConverter;
    }
}
