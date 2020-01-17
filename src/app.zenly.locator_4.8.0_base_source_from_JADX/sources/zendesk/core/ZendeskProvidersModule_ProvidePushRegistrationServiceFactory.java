package zendesk.core;

import dagger.internal.C12021c;
import dagger.internal.Factory;
import javax.inject.Provider;
import retrofit2.C13430i;

public final class ZendeskProvidersModule_ProvidePushRegistrationServiceFactory implements Factory<PushRegistrationService> {
    private final Provider<C13430i> retrofitProvider;

    public ZendeskProvidersModule_ProvidePushRegistrationServiceFactory(Provider<C13430i> provider) {
        this.retrofitProvider = provider;
    }

    public static Factory<PushRegistrationService> create(Provider<C13430i> provider) {
        return new ZendeskProvidersModule_ProvidePushRegistrationServiceFactory(provider);
    }

    public PushRegistrationService get() {
        PushRegistrationService providePushRegistrationService = ZendeskProvidersModule.providePushRegistrationService((C13430i) this.retrofitProvider.get());
        C12021c.m31671a(providePushRegistrationService, "Cannot return null from a non-@Nullable @Provides method");
        return providePushRegistrationService;
    }
}
