package zendesk.support;

import dagger.internal.C12021c;
import dagger.internal.Factory;
import java.util.Locale;
import javax.inject.Provider;
import zendesk.core.BlipsProvider;

public final class ProviderModule_ProvideSupportBlipsProviderFactory implements Factory<SupportBlipsProvider> {
    private final Provider<BlipsProvider> blipsProvider;
    private final Provider<Locale> localeProvider;
    private final ProviderModule module;

    public ProviderModule_ProvideSupportBlipsProviderFactory(ProviderModule providerModule, Provider<BlipsProvider> provider, Provider<Locale> provider2) {
        this.module = providerModule;
        this.blipsProvider = provider;
        this.localeProvider = provider2;
    }

    public static Factory<SupportBlipsProvider> create(ProviderModule providerModule, Provider<BlipsProvider> provider, Provider<Locale> provider2) {
        return new ProviderModule_ProvideSupportBlipsProviderFactory(providerModule, provider, provider2);
    }

    public SupportBlipsProvider get() {
        SupportBlipsProvider provideSupportBlipsProvider = this.module.provideSupportBlipsProvider((BlipsProvider) this.blipsProvider.get(), (Locale) this.localeProvider.get());
        C12021c.m31671a(provideSupportBlipsProvider, "Cannot return null from a non-@Nullable @Provides method");
        return provideSupportBlipsProvider;
    }
}
