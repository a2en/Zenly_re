package zendesk.core;

import com.google.gson.C11125d;
import dagger.internal.C12021c;
import dagger.internal.Factory;
import javax.inject.Provider;
import okhttp3.C13325v;
import retrofit2.C13430i;

public final class ZendeskNetworkModule_ProvideRetrofitFactory implements Factory<C13430i> {
    private final Provider<ApplicationConfiguration> configurationProvider;
    private final Provider<C11125d> gsonProvider;
    private final Provider<C13325v> okHttpClientProvider;

    public ZendeskNetworkModule_ProvideRetrofitFactory(Provider<ApplicationConfiguration> provider, Provider<C11125d> provider2, Provider<C13325v> provider3) {
        this.configurationProvider = provider;
        this.gsonProvider = provider2;
        this.okHttpClientProvider = provider3;
    }

    public static Factory<C13430i> create(Provider<ApplicationConfiguration> provider, Provider<C11125d> provider2, Provider<C13325v> provider3) {
        return new ZendeskNetworkModule_ProvideRetrofitFactory(provider, provider2, provider3);
    }

    public C13430i get() {
        C13430i provideRetrofit = ZendeskNetworkModule.provideRetrofit((ApplicationConfiguration) this.configurationProvider.get(), (C11125d) this.gsonProvider.get(), (C13325v) this.okHttpClientProvider.get());
        C12021c.m31671a(provideRetrofit, "Cannot return null from a non-@Nullable @Provides method");
        return provideRetrofit;
    }
}
