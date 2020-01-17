package zendesk.core;

import dagger.internal.C12021c;
import dagger.internal.Factory;
import javax.inject.Provider;
import retrofit2.C13430i;

public final class ZendeskProvidersModule_ProvideBlipsServiceFactory implements Factory<BlipsService> {
    private final Provider<C13430i> retrofitProvider;

    public ZendeskProvidersModule_ProvideBlipsServiceFactory(Provider<C13430i> provider) {
        this.retrofitProvider = provider;
    }

    public static Factory<BlipsService> create(Provider<C13430i> provider) {
        return new ZendeskProvidersModule_ProvideBlipsServiceFactory(provider);
    }

    public BlipsService get() {
        BlipsService provideBlipsService = ZendeskProvidersModule.provideBlipsService((C13430i) this.retrofitProvider.get());
        C12021c.m31671a(provideBlipsService, "Cannot return null from a non-@Nullable @Provides method");
        return provideBlipsService;
    }
}
