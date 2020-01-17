package zendesk.support;

import dagger.internal.C12021c;
import dagger.internal.Factory;
import javax.inject.Provider;
import zendesk.core.RestServiceProvider;

public final class ServiceModule_ProvidesUploadServiceFactory implements Factory<UploadService> {
    private final Provider<RestServiceProvider> restServiceProvider;

    public ServiceModule_ProvidesUploadServiceFactory(Provider<RestServiceProvider> provider) {
        this.restServiceProvider = provider;
    }

    public static Factory<UploadService> create(Provider<RestServiceProvider> provider) {
        return new ServiceModule_ProvidesUploadServiceFactory(provider);
    }

    public UploadService get() {
        UploadService providesUploadService = ServiceModule.providesUploadService((RestServiceProvider) this.restServiceProvider.get());
        C12021c.m31671a(providesUploadService, "Cannot return null from a non-@Nullable @Provides method");
        return providesUploadService;
    }
}
