package zendesk.support.request;

import com.zendesk.logger.Logger;
import com.zendesk.service.C12008e;
import com.zendesk.service.ErrorResponse;
import com.zendesk.util.C12017g;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import okhttp3.C13170b0;
import zendesk.belvedere.C13489a;
import zendesk.belvedere.MediaResult;
import zendesk.suas.Dispatcher;
import zendesk.suas.Listener;

class AttachmentDownloaderComponent implements Listener<StateConversation> {
    /* access modifiers changed from: private */
    public final ActionFactory actionFactory;
    private final AttachmentDownloader attachmentDownloader;
    /* access modifiers changed from: private */
    public final Dispatcher dispatcher;
    private final AttachmentDownloaderSelector selector = new AttachmentDownloaderSelector();

    static class AttachmentDownloader {
        /* access modifiers changed from: private */
        public final AttachmentDownloadService attachmentIo;
        /* access modifiers changed from: private */
        public final C13489a belvedere;
        /* access modifiers changed from: private */
        public final Set<String> downloadingHistory = new HashSet();

        class CacheCallback extends C12008e<MediaResult> {
            private final C12008e<MediaResult> callback;
            private final StateRequestAttachment requestAttachment;

            CacheCallback(StateRequestAttachment stateRequestAttachment, C12008e<MediaResult> eVar) {
                this.requestAttachment = stateRequestAttachment;
                this.callback = eVar;
            }

            public void onError(ErrorResponse errorResponse) {
                AttachmentDownloader.this.handleError(this.requestAttachment.getUrl(), errorResponse, this.callback);
            }

            public void onSuccess(MediaResult mediaResult) {
                this.callback.onSuccess(mediaResult);
                AttachmentDownloader.this.downloadingHistory.remove(this.requestAttachment.getUrl());
            }
        }

        class HttpCallback extends C12008e<C13170b0> {
            private final C12008e<MediaResult> callback;
            private final Request request;
            private final StateRequestAttachment requestAttachment;

            HttpCallback(Request request2, StateRequestAttachment stateRequestAttachment, C12008e<MediaResult> eVar) {
                this.request = request2;
                this.requestAttachment = stateRequestAttachment;
                this.callback = eVar;
            }

            public void onError(ErrorResponse errorResponse) {
                AttachmentDownloader.this.handleError(this.requestAttachment.getUrl(), errorResponse, this.callback);
            }

            public void onSuccess(C13170b0 b0Var) {
                AttachmentDownloader.this.attachmentIo.storeAttachment(b0Var, UtilsAttachment.getLocalFile(AttachmentDownloader.this.belvedere, this.request.getRequestId(), this.request.getRemoteAttachmentId(), this.requestAttachment.getName()), new CacheCallback(this.requestAttachment, this.callback));
            }
        }

        static class Request {
            private final long remoteAttachmentId;
            private final StateRequestAttachment requestAttachment;
            private final String requestId;

            Request(String str, long j, StateRequestAttachment stateRequestAttachment) {
                this.requestId = str;
                this.remoteAttachmentId = j;
                this.requestAttachment = stateRequestAttachment;
            }

            /* access modifiers changed from: 0000 */
            public long getRemoteAttachmentId() {
                return this.remoteAttachmentId;
            }

            /* access modifiers changed from: 0000 */
            public StateRequestAttachment getRequestAttachment() {
                return this.requestAttachment;
            }

            /* access modifiers changed from: 0000 */
            public String getRequestId() {
                return this.requestId;
            }
        }

        AttachmentDownloader(C13489a aVar, AttachmentDownloadService attachmentDownloadService) {
            this.belvedere = aVar;
            this.attachmentIo = attachmentDownloadService;
        }

        /* access modifiers changed from: private */
        public void handleError(String str, ErrorResponse errorResponse, C12008e eVar) {
            this.downloadingHistory.remove(str);
            if (eVar != null) {
                eVar.onError(errorResponse);
            }
        }

        /* access modifiers changed from: 0000 */
        public void download(Request request, C12008e<MediaResult> eVar) {
            StateRequestAttachment requestAttachment = request.getRequestAttachment();
            String url = requestAttachment.getUrl();
            if (!this.downloadingHistory.contains(url)) {
                this.downloadingHistory.add(url);
                this.attachmentIo.downloadAttachment(url, new HttpCallback(request, requestAttachment, eVar));
            }
        }
    }

    static class AttachmentDownloaderSelector {
        AttachmentDownloaderSelector() {
        }

        public List<Request> selectData(StateConversation stateConversation) {
            StateIdMapper attachmentIdMapper = stateConversation.getAttachmentIdMapper();
            String localId = stateConversation.getLocalId();
            List<StateMessage> messages = stateConversation.getMessages();
            LinkedList linkedList = new LinkedList();
            for (StateMessage attachments : messages) {
                for (StateRequestAttachment stateRequestAttachment : attachments.getAttachments()) {
                    long id = stateRequestAttachment.getId();
                    boolean z = stateRequestAttachment.getLocalFile() != null;
                    boolean hasRemoteId = attachmentIdMapper.hasRemoteId(Long.valueOf(id));
                    boolean b = C12017g.m31658b(stateRequestAttachment.getUrl());
                    if (!z && hasRemoteId && b) {
                        linkedList.add(new Request(localId, attachmentIdMapper.getRemoteId(Long.valueOf(id)).longValue(), stateRequestAttachment));
                    }
                }
            }
            return linkedList;
        }
    }

    private class DownloadCallback extends C12008e<MediaResult> {
        private final StateRequestAttachment requestAttachment;

        DownloadCallback(StateRequestAttachment stateRequestAttachment) {
            this.requestAttachment = stateRequestAttachment;
        }

        public void onError(ErrorResponse errorResponse) {
            Logger.m31608a("RequestActivity", "Unable to download attachment. Error: %s", errorResponse.getReason());
        }

        public void onSuccess(MediaResult mediaResult) {
            AttachmentDownloaderComponent.this.dispatcher.dispatch(AttachmentDownloaderComponent.this.actionFactory.attachmentDownloaded(this.requestAttachment, mediaResult));
        }
    }

    AttachmentDownloaderComponent(Dispatcher dispatcher2, ActionFactory actionFactory2, AttachmentDownloader attachmentDownloader2) {
        this.dispatcher = dispatcher2;
        this.actionFactory = actionFactory2;
        this.attachmentDownloader = attachmentDownloader2;
    }

    public void update(StateConversation stateConversation) {
        for (Request request : this.selector.selectData(stateConversation)) {
            this.attachmentDownloader.download(request, new DownloadCallback(request.getRequestAttachment()));
        }
    }
}
