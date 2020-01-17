package zendesk.core;

import android.content.Context;
import android.net.ConnectivityManager;
import dagger.internal.C12021c;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ZendeskProvidersModule_ProviderNetworkInfoProviderFactory implements Factory<NetworkInfoProvider> {
    private final Provider<ConnectivityManager> connectivityManagerProvider;
    private final Provider<Context> contextProvider;

    public ZendeskProvidersModule_ProviderNetworkInfoProviderFactory(Provider<Context> provider, Provider<ConnectivityManager> provider2) {
        this.contextProvider = provider;
        this.connectivityManagerProvider = provider2;
    }

    public static Factory<NetworkInfoProvider> create(Provider<Context> provider, Provider<ConnectivityManager> provider2) {
        return new ZendeskProvidersModule_ProviderNetworkInfoProviderFactory(provider, provider2);
    }

    public NetworkInfoProvider get() {
        NetworkInfoProvider providerNetworkInfoProvider = ZendeskProvidersModule.providerNetworkInfoProvider((Context) this.contextProvider.get(), (ConnectivityManager) this.connectivityManagerProvider.get());
        C12021c.m31671a(providerNetworkInfoProvider, "Cannot return null from a non-@Nullable @Provides method");
        return providerNetworkInfoProvider;
    }
}
