package zendesk.core;

import dagger.internal.C12021c;
import dagger.internal.Factory;
import javax.inject.Provider;
import okhttp3.C13325v;
import retrofit2.C13430i;

public final class ZendeskNetworkModule_ProvideRestServiceProviderFactory implements Factory<RestServiceProvider> {
    private final Provider<C13325v> mediaOkHttpClientProvider;
    private final Provider<C13430i> retrofitProvider;
    private final Provider<C13325v> standardOkHttpClientProvider;

    public ZendeskNetworkModule_ProvideRestServiceProviderFactory(Provider<C13430i> provider, Provider<C13325v> provider2, Provider<C13325v> provider3) {
        this.retrofitProvider = provider;
        this.mediaOkHttpClientProvider = provider2;
        this.standardOkHttpClientProvider = provider3;
    }

    public static Factory<RestServiceProvider> create(Provider<C13430i> provider, Provider<C13325v> provider2, Provider<C13325v> provider3) {
        return new ZendeskNetworkModule_ProvideRestServiceProviderFactory(provider, provider2, provider3);
    }

    public RestServiceProvider get() {
        RestServiceProvider provideRestServiceProvider = ZendeskNetworkModule.provideRestServiceProvider((C13430i) this.retrofitProvider.get(), (C13325v) this.mediaOkHttpClientProvider.get(), (C13325v) this.standardOkHttpClientProvider.get());
        C12021c.m31671a(provideRestServiceProvider, "Cannot return null from a non-@Nullable @Provides method");
        return provideRestServiceProvider;
    }
}
