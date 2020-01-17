package zendesk.support.request;

import dagger.internal.C12021c;
import dagger.internal.Factory;
import javax.inject.Provider;
import zendesk.suas.Dispatcher;

public final class RequestModule_ProvidesAttachmentDownloaderComponentFactory implements Factory<AttachmentDownloaderComponent> {
    private final Provider<ActionFactory> actionFactoryProvider;
    private final Provider<AttachmentDownloader> attachmentDownloaderProvider;
    private final Provider<Dispatcher> dispatcherProvider;

    public RequestModule_ProvidesAttachmentDownloaderComponentFactory(Provider<Dispatcher> provider, Provider<ActionFactory> provider2, Provider<AttachmentDownloader> provider3) {
        this.dispatcherProvider = provider;
        this.actionFactoryProvider = provider2;
        this.attachmentDownloaderProvider = provider3;
    }

    public static Factory<AttachmentDownloaderComponent> create(Provider<Dispatcher> provider, Provider<ActionFactory> provider2, Provider<AttachmentDownloader> provider3) {
        return new RequestModule_ProvidesAttachmentDownloaderComponentFactory(provider, provider2, provider3);
    }

    public AttachmentDownloaderComponent get() {
        AttachmentDownloaderComponent providesAttachmentDownloaderComponent = RequestModule.providesAttachmentDownloaderComponent((Dispatcher) this.dispatcherProvider.get(), (ActionFactory) this.actionFactoryProvider.get(), (AttachmentDownloader) this.attachmentDownloaderProvider.get());
        C12021c.m31671a(providesAttachmentDownloaderComponent, "Cannot return null from a non-@Nullable @Provides method");
        return providesAttachmentDownloaderComponent;
    }
}
