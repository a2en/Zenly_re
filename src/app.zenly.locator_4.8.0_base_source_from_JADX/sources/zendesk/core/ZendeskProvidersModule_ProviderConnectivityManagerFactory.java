package zendesk.core;

import android.content.Context;
import android.net.ConnectivityManager;
import dagger.internal.C12021c;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ZendeskProvidersModule_ProviderConnectivityManagerFactory implements Factory<ConnectivityManager> {
    private final Provider<Context> contextProvider;

    public ZendeskProvidersModule_ProviderConnectivityManagerFactory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static Factory<ConnectivityManager> create(Provider<Context> provider) {
        return new ZendeskProvidersModule_ProviderConnectivityManagerFactory(provider);
    }

    public ConnectivityManager get() {
        ConnectivityManager providerConnectivityManager = ZendeskProvidersModule.providerConnectivityManager((Context) this.contextProvider.get());
        C12021c.m31671a(providerConnectivityManager, "Cannot return null from a non-@Nullable @Provides method");
        return providerConnectivityManager;
    }
}
