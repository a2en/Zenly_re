package zendesk.support;

import dagger.internal.C12021c;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ServiceModule_ProvideZendeskUploadServiceFactory implements Factory<ZendeskUploadService> {
    private final Provider<UploadService> uploadServiceProvider;

    public ServiceModule_ProvideZendeskUploadServiceFactory(Provider<UploadService> provider) {
        this.uploadServiceProvider = provider;
    }

    public static Factory<ZendeskUploadService> create(Provider<UploadService> provider) {
        return new ServiceModule_ProvideZendeskUploadServiceFactory(provider);
    }

    public ZendeskUploadService get() {
        ZendeskUploadService provideZendeskUploadService = ServiceModule.provideZendeskUploadService((UploadService) this.uploadServiceProvider.get());
        C12021c.m31671a(provideZendeskUploadService, "Cannot return null from a non-@Nullable @Provides method");
        return provideZendeskUploadService;
    }
}
