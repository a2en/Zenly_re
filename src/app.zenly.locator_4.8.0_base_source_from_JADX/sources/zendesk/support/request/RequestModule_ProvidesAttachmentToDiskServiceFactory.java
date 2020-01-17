package zendesk.support.request;

import dagger.internal.C12021c;
import dagger.internal.Factory;
import java.util.concurrent.ExecutorService;
import javax.inject.Provider;
import okhttp3.C13325v;

public final class RequestModule_ProvidesAttachmentToDiskServiceFactory implements Factory<AttachmentDownloadService> {
    private final Provider<ExecutorService> executorProvider;
    private final Provider<C13325v> okHttpClientProvider;

    public RequestModule_ProvidesAttachmentToDiskServiceFactory(Provider<C13325v> provider, Provider<ExecutorService> provider2) {
        this.okHttpClientProvider = provider;
        this.executorProvider = provider2;
    }

    public static Factory<AttachmentDownloadService> create(Provider<C13325v> provider, Provider<ExecutorService> provider2) {
        return new RequestModule_ProvidesAttachmentToDiskServiceFactory(provider, provider2);
    }

    public AttachmentDownloadService get() {
        AttachmentDownloadService providesAttachmentToDiskService = RequestModule.providesAttachmentToDiskService((C13325v) this.okHttpClientProvider.get(), (ExecutorService) this.executorProvider.get());
        C12021c.m31671a(providesAttachmentToDiskService, "Cannot return null from a non-@Nullable @Provides method");
        return providesAttachmentToDiskService;
    }
}
