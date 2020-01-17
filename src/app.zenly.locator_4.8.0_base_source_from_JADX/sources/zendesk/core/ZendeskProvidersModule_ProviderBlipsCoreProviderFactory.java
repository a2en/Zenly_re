package zendesk.core;

import dagger.internal.C12021c;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ZendeskProvidersModule_ProviderBlipsCoreProviderFactory implements Factory<BlipsCoreProvider> {
    private final Provider<ZendeskBlipsProvider> zendeskBlipsProvider;

    public ZendeskProvidersModule_ProviderBlipsCoreProviderFactory(Provider<ZendeskBlipsProvider> provider) {
        this.zendeskBlipsProvider = provider;
    }

    public static Factory<BlipsCoreProvider> create(Provider<ZendeskBlipsProvider> provider) {
        return new ZendeskProvidersModule_ProviderBlipsCoreProviderFactory(provider);
    }

    public BlipsCoreProvider get() {
        ZendeskBlipsProvider zendeskBlipsProvider2 = (ZendeskBlipsProvider) this.zendeskBlipsProvider.get();
        ZendeskProvidersModule.providerBlipsCoreProvider(zendeskBlipsProvider2);
        C12021c.m31671a(zendeskBlipsProvider2, "Cannot return null from a non-@Nullable @Provides method");
        return zendeskBlipsProvider2;
    }
}
