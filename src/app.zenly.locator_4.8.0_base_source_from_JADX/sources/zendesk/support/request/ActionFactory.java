package zendesk.support.request;

import androidx.core.util.C0603e;
import com.zendesk.service.ErrorResponse;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import zendesk.belvedere.C13489a;
import zendesk.belvedere.MediaResult;
import zendesk.core.AuthenticationProvider;
import zendesk.core.Zendesk;
import zendesk.suas.C13600a;
import zendesk.support.CommentsResponse;
import zendesk.support.Request;
import zendesk.support.RequestProvider;
import zendesk.support.SupportBlipsProvider;
import zendesk.support.SupportSettingsProvider;
import zendesk.support.SupportUiStorage;
import zendesk.support.UploadProvider;

class ActionFactory {
    private final AuthenticationProvider authProvider;
    private final C13489a belvedere;
    private final Executor executorService;
    private final Executor mainThreadExecutor;
    private final RequestProvider requestProvider;
    private final String sdkVersion;
    private final SupportSettingsProvider settingsProvider;
    private final SupportBlipsProvider supportBlipsProvider;
    private final SupportUiStorage supportUiStorage;
    private final UploadProvider uploadProvider;

    /* renamed from: zendesk reason: collision with root package name */
    private final Zendesk f35254zendesk;

    static class ErrorAction<E> extends C13600a<E> {
        private final ErrorResponse errorResponse;

        ErrorAction(String str, ErrorResponse errorResponse2) {
            this(str, errorResponse2, null);
        }

        public ErrorResponse getErrorResponse() {
            return this.errorResponse;
        }

        ErrorAction(String str, ErrorResponse errorResponse2, E e) {
            super(str, e);
            this.errorResponse = errorResponse2;
        }
    }

    ActionFactory(RequestProvider requestProvider2, UploadProvider uploadProvider2, SupportSettingsProvider supportSettingsProvider, C13489a aVar, SupportUiStorage supportUiStorage2, Executor executor, String str, AuthenticationProvider authenticationProvider, Zendesk zendesk2, SupportBlipsProvider supportBlipsProvider2, Executor executor2) {
        this.requestProvider = requestProvider2;
        this.uploadProvider = uploadProvider2;
        this.settingsProvider = supportSettingsProvider;
        this.belvedere = aVar;
        this.supportUiStorage = supportUiStorage2;
        this.executorService = executor;
        this.mainThreadExecutor = executor2;
        this.sdkVersion = str;
        this.authProvider = authenticationProvider;
        this.f35254zendesk = zendesk2;
        this.supportBlipsProvider = supportBlipsProvider2;
    }

    /* access modifiers changed from: 0000 */
    public C13600a androidOnPause() {
        return new C13600a("ANDROID_ON_PAUSE");
    }

    /* access modifiers changed from: 0000 */
    public C13600a androidOnResume() {
        return new C13600a("ANDROID_ON_RESUME");
    }

    /* access modifiers changed from: 0000 */
    public C13600a attachmentDownloaded(StateRequestAttachment stateRequestAttachment, MediaResult mediaResult) {
        return new C13600a("ATTACHMENT_DOWNLOADED", C0603e.m2769a(stateRequestAttachment, mediaResult));
    }

    /* access modifiers changed from: 0000 */
    public C13600a clearAttachments() {
        return new C13600a("CLEAR_ATTACHMENTS");
    }

    /* access modifiers changed from: 0000 */
    public C13600a clearMessages() {
        return new C13600a("CLEAR_MESSAGES");
    }

    /* access modifiers changed from: 0000 */
    public C13600a createComment(StateMessage stateMessage) {
        return new C13600a("CREATE_COMMENT", stateMessage);
    }

    /* access modifiers changed from: 0000 */
    public C13600a createCommentAsync(String str, List<StateRequestAttachment> list) {
        return AsyncMiddleware.createAction(new ActionCreateComment(this, this.requestProvider, new AttachmentUploadService(this.uploadProvider, this.belvedere, list), new StateMessage(str, list)));
    }

    /* access modifiers changed from: 0000 */
    public C13600a createCommentError(ErrorResponse errorResponse, StateMessage stateMessage) {
        return new ErrorAction("CREATE_COMMENT_ERROR", errorResponse, stateMessage);
    }

    /* access modifiers changed from: 0000 */
    public C13600a createCommentSuccess(CreateCommentResult createCommentResult) {
        return new C13600a("CREATE_COMMENT_SUCCESS", createCommentResult);
    }

    /* access modifiers changed from: 0000 */
    public C13600a createRequestError(ErrorResponse errorResponse, StateMessage stateMessage) {
        return new ErrorAction("CREATE_REQUEST_ERROR", errorResponse, stateMessage);
    }

    /* access modifiers changed from: 0000 */
    public C13600a createRequestSuccess(CreateCommentResult createCommentResult) {
        return new C13600a("CREATE_REQUEST_SUCCESS", createCommentResult);
    }

    /* access modifiers changed from: 0000 */
    public C13600a deleteMessage(StateMessage stateMessage) {
        return new C13600a("DELETE_MESSAGE", stateMessage);
    }

    /* access modifiers changed from: 0000 */
    public C13600a deselectAttachment(List<MediaResult> list) {
        return new C13600a("ATTACHMENTS_DESELECTED", list);
    }

    /* access modifiers changed from: 0000 */
    public C13600a initialLoadCommentsAsync() {
        return AsyncMiddleware.createAction(new ActionLoadComments(this, this.requestProvider, this.belvedere, true));
    }

    /* access modifiers changed from: 0000 */
    public C13600a installStartConfigAsync(RequestUiConfig requestUiConfig) {
        ActionInstallConfiguration actionInstallConfiguration = new ActionInstallConfiguration(this.supportUiStorage, requestUiConfig, this.executorService, this.mainThreadExecutor, this, this.supportBlipsProvider);
        return AsyncMiddleware.createAction(actionInstallConfiguration);
    }

    /* access modifiers changed from: 0000 */
    public C13600a loadComments(boolean z) {
        if (z) {
            return new C13600a("LOAD_COMMENT_INITIAL");
        }
        return new C13600a("LOAD_COMMENTS_UPDATE");
    }

    /* access modifiers changed from: 0000 */
    public C13600a loadCommentsError(boolean z, ErrorResponse errorResponse) {
        if (z) {
            return new ErrorAction("LOAD_COMMENTS_INITIAL_ERROR", errorResponse);
        }
        return new ErrorAction("LOAD_COMMENTS_UPDATE_ERROR", errorResponse);
    }

    /* access modifiers changed from: 0000 */
    public C13600a loadCommentsFromCache() {
        return new C13600a("LOAD_COMMENTS_FROM_CACHE");
    }

    /* access modifiers changed from: 0000 */
    public C13600a loadCommentsFromCacheAsync() {
        ActionLoadCachedComments actionLoadCachedComments = new ActionLoadCachedComments(this, this.supportUiStorage, this.belvedere, this.executorService, this.sdkVersion);
        return AsyncMiddleware.createAction(actionLoadCachedComments);
    }

    /* access modifiers changed from: 0000 */
    public C13600a loadCommentsFromCacheError() {
        return new C13600a("LOAD_COMMENTS_FROM_CACHE_ERROR");
    }

    /* access modifiers changed from: 0000 */
    public C13600a loadCommentsFromCacheSuccess(StateConversation stateConversation) {
        return new C13600a("LOAD_COMMENTS_FROM_CACHE_SUCCESS", stateConversation);
    }

    /* access modifiers changed from: 0000 */
    public C13600a loadCommentsSuccess(boolean z, CommentsResponse commentsResponse, Map<Long, MediaResult> map) {
        C0603e eVar = new C0603e(commentsResponse, map);
        if (z) {
            return new C13600a("LOAD_COMMENTS_INITIAL_SUCCESS", eVar);
        }
        return new C13600a("LOAD_COMMENTS_UPDATE_SUCCESS", eVar);
    }

    /* access modifiers changed from: 0000 */
    public C13600a loadRequest() {
        return new C13600a("LOAD_REQUEST");
    }

    /* access modifiers changed from: 0000 */
    public C13600a loadRequestAsync() {
        return AsyncMiddleware.createAction(new ActionLoadRequest(this, this.requestProvider));
    }

    /* access modifiers changed from: 0000 */
    public C13600a loadRequestError(ErrorResponse errorResponse) {
        return new ErrorAction("LOAD_REQUEST_ERROR", errorResponse);
    }

    /* access modifiers changed from: 0000 */
    public C13600a loadRequestSuccess(Request request) {
        return new C13600a("LOAD_REQUEST_SUCCESS", request);
    }

    /* access modifiers changed from: 0000 */
    public C13600a loadSettings() {
        return new C13600a("LOAD_SETTINGS");
    }

    /* access modifiers changed from: 0000 */
    public C13600a loadSettingsAsync() {
        return AsyncMiddleware.createAction(new ActionLoadSettings(this, this.settingsProvider, this.authProvider));
    }

    /* access modifiers changed from: 0000 */
    public C13600a loadSettingsError(ErrorResponse errorResponse) {
        return new ErrorAction("LOAD_SETTINGS_ERROR", errorResponse);
    }

    /* access modifiers changed from: 0000 */
    public C13600a loadSettingsSuccess(StateSettings stateSettings) {
        return new C13600a("LOAD_SETTINGS_SUCCESS", stateSettings);
    }

    /* access modifiers changed from: 0000 */
    public C13600a onDialogDismissed() {
        return new C13600a("DIALOG_DISMISSED");
    }

    /* access modifiers changed from: 0000 */
    public C13600a requestClosed() {
        return new C13600a("REQUEST_CLOSED");
    }

    /* access modifiers changed from: 0000 */
    public C13600a resendCommentAsync(StateMessage stateMessage) {
        return AsyncMiddleware.createAction(new ActionCreateComment(this, this.requestProvider, new AttachmentUploadService(this.uploadProvider, this.belvedere, stateMessage.getAttachments()), stateMessage));
    }

    /* access modifiers changed from: 0000 */
    public C13600a selectAttachment(List<MediaResult> list) {
        return new C13600a("ATTACHMENTS_SELECTED", list);
    }

    /* access modifiers changed from: 0000 */
    public C13600a showRetryDialog(List<StateMessage> list) {
        return new C13600a("SHOW_RETRY_DIALOG", list);
    }

    /* access modifiers changed from: 0000 */
    public C13600a skipAction() {
        return new C13600a("SKIP_ACTION");
    }

    /* access modifiers changed from: 0000 */
    public C13600a startConfig(RequestUiConfig requestUiConfig) {
        return new C13600a("START_CONFIG", requestUiConfig);
    }

    /* access modifiers changed from: 0000 */
    public C13600a updateCommentsAsync() {
        return AsyncMiddleware.createAction(new ActionLoadComments(this, this.requestProvider, this.belvedere, false));
    }

    /* access modifiers changed from: 0000 */
    public C13600a updateNameEmailAsync(String str, String str2) {
        return AsyncMiddleware.createAction(new ActionUpdateNameEmail(str, str2, this.authProvider, this.f35254zendesk));
    }
}
