package zendesk.support.request;

import com.zendesk.logger.Logger;
import com.zendesk.service.C12008e;
import com.zendesk.service.ErrorResponse;
import com.zendesk.util.C12010a;
import com.zendesk.util.C12017g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import zendesk.suas.Dispatcher;
import zendesk.suas.GetState;
import zendesk.support.Comment;
import zendesk.support.CreateRequest;
import zendesk.support.EndUserComment;
import zendesk.support.Request;
import zendesk.support.RequestProvider;

class ActionCreateComment implements AsyncAction {
    /* access modifiers changed from: private */

    /* renamed from: af */
    public final ActionFactory f35206af;
    private C12008e<AttachmentUploadResult> attachmentCallback;
    private final AttachmentUploadService attachmentUploader;
    /* access modifiers changed from: private */
    public final StateMessage message;
    /* access modifiers changed from: private */
    public final RequestProvider requestProvider;

    static class CreateCommentResult {
        private final long commentRemoteId;
        private final AttachmentUploadResult localToRemoteAttachments;
        private final StateMessage message;
        private final String requestId;

        CreateCommentResult(StateMessage stateMessage, String str, long j, AttachmentUploadResult attachmentUploadResult) {
            this.message = stateMessage;
            this.requestId = str;
            this.commentRemoteId = j;
            this.localToRemoteAttachments = attachmentUploadResult;
        }

        /* access modifiers changed from: 0000 */
        public long getCommentRemoteId() {
            return this.commentRemoteId;
        }

        /* access modifiers changed from: 0000 */
        public AttachmentUploadResult getLocalToRemoteAttachments() {
            return this.localToRemoteAttachments;
        }

        /* access modifiers changed from: 0000 */
        public StateMessage getMessage() {
            return this.message;
        }

        /* access modifiers changed from: 0000 */
        public String getRequestId() {
            return this.requestId;
        }
    }

    ActionCreateComment(ActionFactory actionFactory, RequestProvider requestProvider2, AttachmentUploadService attachmentUploadService, StateMessage stateMessage) {
        this.f35206af = actionFactory;
        this.requestProvider = requestProvider2;
        this.message = stateMessage;
        this.attachmentUploader = attachmentUploadService;
    }

    private void addComment(Callback callback, Dispatcher dispatcher, StateConversation stateConversation, AttachmentUploadResult attachmentUploadResult) {
        EndUserComment endUserComment = new EndUserComment();
        endUserComment.setValue(this.message.getBody());
        endUserComment.setAttachments(getAttachmentToken(attachmentUploadResult.getRequestAttachments()));
        String remoteId = stateConversation.getRemoteId();
        RequestProvider requestProvider2 = this.requestProvider;
        final AttachmentUploadResult attachmentUploadResult2 = attachmentUploadResult;
        final Dispatcher dispatcher2 = dispatcher;
        final String str = remoteId;
        final StateConversation stateConversation2 = stateConversation;
        final Callback callback2 = callback;
        C137332 r2 = new C12008e<Comment>() {
            public void onError(ErrorResponse errorResponse) {
                String str = "RequestActivity";
                Logger.m31614d(str, "Unable to add comment to request. Error: '%s'. Message Id: %d", errorResponse.getReason(), Long.valueOf(ActionCreateComment.this.message.getId()));
                if (errorResponse.isHTTPError() && errorResponse.getStatus() == 422) {
                    Logger.m31614d(str, "This request (%s) is closed. Error: '%s'. Message Id: %d", str, errorResponse.getReason(), Long.valueOf(ActionCreateComment.this.message.getId()));
                    dispatcher2.dispatch(ActionCreateComment.this.f35206af.requestClosed());
                }
                dispatcher2.dispatch(ActionCreateComment.this.f35206af.createCommentError(errorResponse, ActionCreateComment.this.message.withError(errorResponse)));
                callback2.done();
            }

            public void onSuccess(Comment comment) {
                StateMessage withDelivered = ActionCreateComment.this.message.withAttachments(attachmentUploadResult2.getRequestAttachments()).withDelivered();
                Dispatcher dispatcher = dispatcher2;
                ActionFactory access$200 = ActionCreateComment.this.f35206af;
                CreateCommentResult createCommentResult = new CreateCommentResult(withDelivered, str, comment.getId().longValue(), attachmentUploadResult2);
                dispatcher.dispatch(access$200.createCommentSuccess(createCommentResult));
                ActionCreateComment.this.requestProvider.markRequestAsRead(str, stateConversation2.getMessageIdMapper().getRemoteIds().size());
                callback2.done();
            }
        };
        requestProvider2.addComment(remoteId, endUserComment, r2);
    }

    /* access modifiers changed from: private */
    public void createMessage(StateConversation stateConversation, StateConfig stateConfig, Dispatcher dispatcher, Callback callback, AttachmentUploadResult attachmentUploadResult) {
        String str = "RequestActivity";
        if (C12017g.m31658b(stateConversation.getRemoteId())) {
            Logger.m31608a(str, "Adding a comment to an existing request. Message Id %s", Long.valueOf(this.message.getId()));
            addComment(callback, dispatcher, stateConversation, attachmentUploadResult);
            return;
        }
        Logger.m31608a(str, "Creating a new request. Message Id %s", Long.valueOf(this.message.getId()));
        createRequest(callback, dispatcher, attachmentUploadResult, stateConfig);
    }

    private void createRequest(final Callback callback, final Dispatcher dispatcher, final AttachmentUploadResult attachmentUploadResult, StateConfig stateConfig) {
        CreateRequest createRequest = new CreateRequest();
        createRequest.setDescription(this.message.getBody());
        createRequest.setAttachments(getAttachmentToken(attachmentUploadResult.getRequestAttachments()));
        if (C12010a.m31639b((Collection<Type>) stateConfig.getTags())) {
            createRequest.setTags(stateConfig.getTags());
        }
        if (C12017g.m31658b(stateConfig.getSubject())) {
            createRequest.setSubject(stateConfig.getSubject());
        }
        if (stateConfig.getTicketForm() == null) {
            this.requestProvider.createRequest(createRequest, new C12008e<Request>() {
                public void onError(ErrorResponse errorResponse) {
                    dispatcher.dispatch(ActionCreateComment.this.f35206af.createRequestError(errorResponse, ActionCreateComment.this.message.withError(errorResponse)));
                    callback.done();
                }

                public void onSuccess(Request request) {
                    StateMessage withDelivered = ActionCreateComment.this.message.withAttachments(attachmentUploadResult.getRequestAttachments()).withDelivered();
                    Dispatcher dispatcher = dispatcher;
                    ActionFactory access$200 = ActionCreateComment.this.f35206af;
                    CreateCommentResult createCommentResult = new CreateCommentResult(withDelivered, request.getId(), request.getLastComment().getId().longValue(), attachmentUploadResult);
                    dispatcher.dispatch(access$200.createRequestSuccess(createCommentResult));
                    callback.done();
                    if (request.getId() != null) {
                        ActionCreateComment.this.requestProvider.markRequestAsRead(request.getId(), 1);
                    }
                }
            });
        } else {
            stateConfig.getTicketForm().getId();
            throw null;
        }
    }

    private List<String> getAttachmentToken(List<StateRequestAttachment> list) {
        ArrayList arrayList = new ArrayList();
        for (StateRequestAttachment token : list) {
            arrayList.add(token.getToken());
        }
        return arrayList;
    }

    private void waitForAttachments(Dispatcher dispatcher, GetState getState, Callback callback) {
        final StateConversation fromState = StateConversation.fromState(getState.getState());
        final StateConfig fromState2 = StateConfig.fromState(getState.getState());
        Logger.m31608a("RequestActivity", "Waiting for attachments to be uploaded. Message Id: %s", Long.valueOf(this.message.getId()));
        final Dispatcher dispatcher2 = dispatcher;
        final Callback callback2 = callback;
        C137321 r1 = new C12008e<AttachmentUploadResult>() {
            public void onError(ErrorResponse errorResponse) {
                Logger.m31614d("RequestActivity", "Attachment upload error. '%s'. Message Id: %s", errorResponse.getReason(), Long.valueOf(ActionCreateComment.this.message.getId()));
                StateMessage withError = ActionCreateComment.this.message.withError(errorResponse);
                if (C12017g.m31658b(fromState.getRemoteId())) {
                    dispatcher2.dispatch(ActionCreateComment.this.f35206af.createCommentError(errorResponse, withError));
                } else {
                    dispatcher2.dispatch(ActionCreateComment.this.f35206af.createRequestError(errorResponse, withError));
                }
                callback2.done();
            }

            public void onSuccess(AttachmentUploadResult attachmentUploadResult) {
                Logger.m31608a("RequestActivity", "Attachments resolved and uploaded. Message Id: %s", Long.valueOf(ActionCreateComment.this.message.getId()));
                ActionCreateComment.this.createMessage(fromState, fromState2, dispatcher2, callback2, attachmentUploadResult);
            }
        };
        this.attachmentCallback = r1;
        this.attachmentUploader.setResultListener(this.attachmentCallback);
    }

    public void actionQueued(Dispatcher dispatcher, GetState getState) {
        List attachments = this.message.getAttachments();
        String localId = StateConversation.fromState(getState.getState()).getLocalId();
        if (C12010a.m31639b((Collection<Type>) attachments)) {
            Logger.m31608a("RequestActivity", "Start uploading %d attachments. Message Id: %s", Integer.valueOf(attachments.size()), Long.valueOf(this.message.getId()));
            this.attachmentUploader.start(localId);
        }
        dispatcher.dispatch(this.f35206af.createComment(this.message.withPending()));
    }

    public void execute(Dispatcher dispatcher, GetState getState, Callback callback) {
        waitForAttachments(dispatcher, getState, callback);
    }
}
