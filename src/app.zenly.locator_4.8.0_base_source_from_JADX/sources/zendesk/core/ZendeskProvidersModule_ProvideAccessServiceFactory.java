package zendesk.core;

import dagger.internal.C12021c;
import dagger.internal.Factory;
import javax.inject.Provider;
import retrofit2.C13430i;

public final class ZendeskProvidersModule_ProvideAccessServiceFactory implements Factory<AccessService> {
    private final Provider<C13430i> retrofitProvider;

    public ZendeskProvidersModule_ProvideAccessServiceFactory(Provider<C13430i> provider) {
        this.retrofitProvider = provider;
    }

    public static Factory<AccessService> create(Provider<C13430i> provider) {
        return new ZendeskProvidersModule_ProvideAccessServiceFactory(provider);
    }

    public AccessService get() {
        AccessService provideAccessService = ZendeskProvidersModule.provideAccessService((C13430i) this.retrofitProvider.get());
        C12021c.m31671a(provideAccessService, "Cannot return null from a non-@Nullable @Provides method");
        return provideAccessService;
    }
}
