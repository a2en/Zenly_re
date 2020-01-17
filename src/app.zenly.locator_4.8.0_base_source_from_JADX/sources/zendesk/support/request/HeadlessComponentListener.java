package zendesk.support.request;

import zendesk.suas.Listener;
import zendesk.suas.Store;

class HeadlessComponentListener {
    private final AttachmentDownloaderComponent attachment;
    private final ComponentPersistence persistence;
    private boolean registered = false;
    private final ComponentUpdateActionHandlers updateActionHandlersComponent;

    HeadlessComponentListener(ComponentPersistence componentPersistence, AttachmentDownloaderComponent attachmentDownloaderComponent, ComponentUpdateActionHandlers componentUpdateActionHandlers) {
        this.persistence = componentPersistence;
        this.attachment = attachmentDownloaderComponent;
        this.updateActionHandlersComponent = componentUpdateActionHandlers;
    }

    /* access modifiers changed from: 0000 */
    public void startListening(Store store) {
        if (!this.registered) {
            store.addListener(this.persistence.getSelector(), (Listener<E>) this.persistence);
            store.addListener(StateConversation.class, (Listener<E>) this.attachment);
            store.addListener(StateConversation.class, (Listener<E>) this.updateActionHandlersComponent);
            this.registered = true;
        }
    }
}
