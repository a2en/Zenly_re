package zendesk.core;

import dagger.internal.C12021c;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ZendeskProvidersModule_ProviderBlipsProviderFactory implements Factory<BlipsProvider> {
    private final Provider<ZendeskBlipsProvider> zendeskBlipsProvider;

    public ZendeskProvidersModule_ProviderBlipsProviderFactory(Provider<ZendeskBlipsProvider> provider) {
        this.zendeskBlipsProvider = provider;
    }

    public static Factory<BlipsProvider> create(Provider<ZendeskBlipsProvider> provider) {
        return new ZendeskProvidersModule_ProviderBlipsProviderFactory(provider);
    }

    public BlipsProvider get() {
        ZendeskBlipsProvider zendeskBlipsProvider2 = (ZendeskBlipsProvider) this.zendeskBlipsProvider.get();
        ZendeskProvidersModule.providerBlipsProvider(zendeskBlipsProvider2);
        C12021c.m31671a(zendeskBlipsProvider2, "Cannot return null from a non-@Nullable @Provides method");
        return zendeskBlipsProvider2;
    }
}
