package zendesk.support.request;

import com.zendesk.logger.Logger;
import com.zendesk.util.C12010a;
import com.zendesk.util.C12017g;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;
import zendesk.belvedere.C13489a;
import zendesk.belvedere.MediaResult;
import zendesk.suas.C13600a;
import zendesk.suas.Dispatcher;
import zendesk.suas.GetState;
import zendesk.support.SupportUiStorage;

class ActionLoadCachedComments implements AsyncAction {

    /* renamed from: af */
    private final ActionFactory f35208af;
    private final C13489a belvedere;
    private final Executor executorService;
    private final String sdkVersion;
    private final SupportUiStorage supportUiStorage;

    static class LoadComments implements Runnable {

        /* renamed from: af */
        private final ActionFactory f35209af;
        private final C13489a belvedere;
        private final Callback callback;
        private final Dispatcher dispatcher;

        /* renamed from: id */
        private final String f35210id;
        private final String sdkVersion;
        private final SupportUiStorage supportUiStorage;

        LoadComments(String str, Dispatcher dispatcher2, Callback callback2, SupportUiStorage supportUiStorage2, ActionFactory actionFactory, C13489a aVar, String str2) {
            this.f35210id = str;
            this.dispatcher = dispatcher2;
            this.callback = callback2;
            this.supportUiStorage = supportUiStorage2;
            this.f35209af = actionFactory;
            this.belvedere = aVar;
            this.sdkVersion = str2;
        }

        private StateMessage findLocalAttachmentForMessage(StateMessage stateMessage, StateIdMapper stateIdMapper, C13489a aVar, String str) {
            List<StateRequestAttachment> attachments = stateMessage.getAttachments();
            if (!C12010a.m31639b((Collection<Type>) attachments)) {
                return stateMessage;
            }
            ArrayList arrayList = new ArrayList(stateMessage.getAttachments().size());
            for (StateRequestAttachment stateRequestAttachment : attachments) {
                if (stateIdMapper.hasRemoteId(Long.valueOf(stateRequestAttachment.getId()))) {
                    arrayList.add(updateAttachment(stateRequestAttachment, UtilsAttachment.getLocalFile(aVar, str, stateIdMapper.getRemoteId(Long.valueOf(stateRequestAttachment.getId())).longValue(), stateRequestAttachment.getName())));
                } else {
                    arrayList.add(stateRequestAttachment);
                }
            }
            return stateMessage.withAttachments(arrayList);
        }

        private StateRequestAttachment updateAttachment(StateRequestAttachment stateRequestAttachment, MediaResult mediaResult) {
            String str;
            File file = null;
            if (stateRequestAttachment.getSize() == mediaResult.mo38840a().length()) {
                file = mediaResult.mo38840a();
                str = mediaResult.mo38849g().toString();
            } else {
                str = null;
            }
            Builder newBuilder = stateRequestAttachment.newBuilder();
            newBuilder.setLocalFile(file);
            newBuilder.setLocalUri(str);
            return newBuilder.build();
        }

        /* access modifiers changed from: 0000 */
        public StateConversation resolveAttachments(StateConversation stateConversation) {
            ArrayList arrayList = new ArrayList(stateConversation.getMessages().size());
            for (StateMessage findLocalAttachmentForMessage : stateConversation.getMessages()) {
                arrayList.add(findLocalAttachmentForMessage(findLocalAttachmentForMessage, stateConversation.getAttachmentIdMapper(), this.belvedere, stateConversation.getLocalId()));
            }
            Builder newBuilder = stateConversation.newBuilder();
            newBuilder.setMessages(arrayList);
            return newBuilder.build();
        }

        public void run() {
            C13600a aVar;
            RequestPersistenceModel requestPersistenceModel = (RequestPersistenceModel) this.supportUiStorage.read(this.f35210id, RequestPersistenceModel.class);
            String str = "RequestActivity";
            if (requestPersistenceModel == null || requestPersistenceModel.getConversation() == null) {
                Logger.m31608a(str, "Unable to loaded request from disk", new Object[0]);
                aVar = this.f35209af.loadCommentsFromCacheError();
            } else if (this.sdkVersion.equals(requestPersistenceModel.getVersion())) {
                Logger.m31608a(str, "Successfully loaded request from disk", new Object[0]);
                aVar = this.f35209af.loadCommentsFromCacheSuccess(resolveAttachments(requestPersistenceModel.getConversation()));
            } else {
                Logger.m31608a(str, "Cached version doesn't match with SDK version. Ignoring cached data. [%s, %s]", requestPersistenceModel.getVersion(), "2.2.1");
                aVar = this.f35209af.loadCommentsFromCacheError();
            }
            this.dispatcher.dispatch(aVar);
            this.callback.done();
        }
    }

    ActionLoadCachedComments(ActionFactory actionFactory, SupportUiStorage supportUiStorage2, C13489a aVar, Executor executor, String str) {
        this.f35208af = actionFactory;
        this.supportUiStorage = supportUiStorage2;
        this.belvedere = aVar;
        this.executorService = executor;
        this.sdkVersion = str;
    }

    public void actionQueued(Dispatcher dispatcher, GetState getState) {
        dispatcher.dispatch(this.f35208af.loadCommentsFromCache());
    }

    public void execute(Dispatcher dispatcher, GetState getState, Callback callback) {
        StateConversation fromState = StateConversation.fromState(getState.getState());
        if (C12017g.m31658b(fromState.getLocalId())) {
            Executor executor = this.executorService;
            LoadComments loadComments = new LoadComments(fromState.getLocalId(), dispatcher, callback, this.supportUiStorage, this.f35208af, this.belvedere, this.sdkVersion);
            executor.execute(loadComments);
            return;
        }
        dispatcher.dispatch(this.f35208af.skipAction());
        callback.done();
    }
}
