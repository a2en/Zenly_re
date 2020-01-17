package zendesk.support;

import dagger.internal.C12021c;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ServiceModule_ProvideZendeskRequestServiceFactory implements Factory<ZendeskRequestService> {
    private final Provider<RequestService> requestServiceProvider;

    public ServiceModule_ProvideZendeskRequestServiceFactory(Provider<RequestService> provider) {
        this.requestServiceProvider = provider;
    }

    public static Factory<ZendeskRequestService> create(Provider<RequestService> provider) {
        return new ServiceModule_ProvideZendeskRequestServiceFactory(provider);
    }

    public ZendeskRequestService get() {
        ZendeskRequestService provideZendeskRequestService = ServiceModule.provideZendeskRequestService((RequestService) this.requestServiceProvider.get());
        C12021c.m31671a(provideZendeskRequestService, "Cannot return null from a non-@Nullable @Provides method");
        return provideZendeskRequestService;
    }
}
