package zendesk.support.request;

import dagger.internal.C12021c;
import dagger.internal.Factory;
import javax.inject.Provider;
import zendesk.belvedere.C13489a;

public final class RequestModule_ProvidesAttachmentDownloaderFactory implements Factory<AttachmentDownloader> {
    private final Provider<AttachmentDownloadService> attachmentToDiskServiceProvider;
    private final Provider<C13489a> belvedereProvider;

    public RequestModule_ProvidesAttachmentDownloaderFactory(Provider<C13489a> provider, Provider<AttachmentDownloadService> provider2) {
        this.belvedereProvider = provider;
        this.attachmentToDiskServiceProvider = provider2;
    }

    public static Factory<AttachmentDownloader> create(Provider<C13489a> provider, Provider<AttachmentDownloadService> provider2) {
        return new RequestModule_ProvidesAttachmentDownloaderFactory(provider, provider2);
    }

    public AttachmentDownloader get() {
        AttachmentDownloader providesAttachmentDownloader = RequestModule.providesAttachmentDownloader((C13489a) this.belvedereProvider.get(), (AttachmentDownloadService) this.attachmentToDiskServiceProvider.get());
        C12021c.m31671a(providesAttachmentDownloader, "Cannot return null from a non-@Nullable @Provides method");
        return providesAttachmentDownloader;
    }
}
