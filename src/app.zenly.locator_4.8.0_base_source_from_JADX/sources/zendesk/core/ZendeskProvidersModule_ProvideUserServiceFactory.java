package zendesk.core;

import dagger.internal.C12021c;
import dagger.internal.Factory;
import javax.inject.Provider;
import retrofit2.C13430i;

public final class ZendeskProvidersModule_ProvideUserServiceFactory implements Factory<UserService> {
    private final Provider<C13430i> retrofitProvider;

    public ZendeskProvidersModule_ProvideUserServiceFactory(Provider<C13430i> provider) {
        this.retrofitProvider = provider;
    }

    public static Factory<UserService> create(Provider<C13430i> provider) {
        return new ZendeskProvidersModule_ProvideUserServiceFactory(provider);
    }

    public UserService get() {
        UserService provideUserService = ZendeskProvidersModule.provideUserService((C13430i) this.retrofitProvider.get());
        C12021c.m31671a(provideUserService, "Cannot return null from a non-@Nullable @Provides method");
        return provideUserService;
    }
}
