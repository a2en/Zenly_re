package zendesk.support;

import dagger.internal.C12021c;
import dagger.internal.Factory;
import javax.inject.Provider;
import zendesk.core.RestServiceProvider;

public final class ServiceModule_ProvidesRequestServiceFactory implements Factory<RequestService> {
    private final Provider<RestServiceProvider> restServiceProvider;

    public ServiceModule_ProvidesRequestServiceFactory(Provider<RestServiceProvider> provider) {
        this.restServiceProvider = provider;
    }

    public static Factory<RequestService> create(Provider<RestServiceProvider> provider) {
        return new ServiceModule_ProvidesRequestServiceFactory(provider);
    }

    public RequestService get() {
        RequestService providesRequestService = ServiceModule.providesRequestService((RestServiceProvider) this.restServiceProvider.get());
        C12021c.m31671a(providesRequestService, "Cannot return null from a non-@Nullable @Provides method");
        return providesRequestService;
    }
}
