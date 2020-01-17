package zendesk.support.request;

import dagger.internal.C12021c;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class RequestModule_ProvidesHeadlessComponentListenerFactory implements Factory<HeadlessComponentListener> {
    private final Provider<AttachmentDownloaderComponent> attachmentDownloaderProvider;
    private final Provider<ComponentPersistence> persistenceProvider;
    private final Provider<ComponentUpdateActionHandlers> updatesComponentProvider;

    public RequestModule_ProvidesHeadlessComponentListenerFactory(Provider<ComponentPersistence> provider, Provider<AttachmentDownloaderComponent> provider2, Provider<ComponentUpdateActionHandlers> provider3) {
        this.persistenceProvider = provider;
        this.attachmentDownloaderProvider = provider2;
        this.updatesComponentProvider = provider3;
    }

    public static Factory<HeadlessComponentListener> create(Provider<ComponentPersistence> provider, Provider<AttachmentDownloaderComponent> provider2, Provider<ComponentUpdateActionHandlers> provider3) {
        return new RequestModule_ProvidesHeadlessComponentListenerFactory(provider, provider2, provider3);
    }

    public HeadlessComponentListener get() {
        HeadlessComponentListener providesHeadlessComponentListener = RequestModule.providesHeadlessComponentListener((ComponentPersistence) this.persistenceProvider.get(), (AttachmentDownloaderComponent) this.attachmentDownloaderProvider.get(), (ComponentUpdateActionHandlers) this.updatesComponentProvider.get());
        C12021c.m31671a(providesHeadlessComponentListener, "Cannot return null from a non-@Nullable @Provides method");
        return providesHeadlessComponentListener;
    }
}
