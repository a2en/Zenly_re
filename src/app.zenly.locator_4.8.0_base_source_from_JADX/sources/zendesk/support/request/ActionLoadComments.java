package zendesk.support.request;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import com.zendesk.logger.Logger;
import com.zendesk.service.C12008e;
import com.zendesk.service.ErrorResponse;
import com.zendesk.util.C12017g;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import zendesk.belvedere.C13489a;
import zendesk.belvedere.MediaResult;
import zendesk.suas.Dispatcher;
import zendesk.suas.GetState;
import zendesk.support.Attachment;
import zendesk.support.CommentResponse;
import zendesk.support.CommentsResponse;
import zendesk.support.RequestProvider;

class ActionLoadComments implements AsyncAction {
    /* access modifiers changed from: private */
    public final ActionFactory actionFactory;
    private final C13489a belvedere;
    private final Handler handler;
    /* access modifiers changed from: private */
    public final boolean initialLoad;
    /* access modifiers changed from: private */
    public final RequestProvider requestProvider;

    private static abstract class MinimumTimeCallback<E> extends C12008e<E> {
        private final Handler handler;
        private final long minTime;
        private final TimeUnit minTimeUnit;
        private final long start = System.nanoTime();

        MinimumTimeCallback(Handler handler2, long j, TimeUnit timeUnit) {
            this.handler = handler2;
            this.minTime = j;
            this.minTimeUnit = timeUnit;
        }

        private long remainingTime() {
            long nanoTime = System.nanoTime() - this.start;
            long convert = TimeUnit.NANOSECONDS.convert(this.minTime, this.minTimeUnit);
            if (nanoTime < convert) {
                return TimeUnit.MILLISECONDS.convert(convert - nanoTime, TimeUnit.NANOSECONDS);
            }
            return 0;
        }

        public abstract void onDelayedError(ErrorResponse errorResponse);

        public abstract void onDelayedSuccess(E e);

        public void onError(final ErrorResponse errorResponse) {
            this.handler.postDelayed(new Runnable() {
                public void run() {
                    MinimumTimeCallback.this.onDelayedError(errorResponse);
                }
            }, remainingTime());
        }

        public void onSuccess(final E e) {
            this.handler.postDelayed(new Runnable() {
                public void run() {
                    MinimumTimeCallback.this.onDelayedSuccess(e);
                }
            }, remainingTime());
        }
    }

    ActionLoadComments(ActionFactory actionFactory2, RequestProvider requestProvider2, C13489a aVar, boolean z) {
        this(actionFactory2, requestProvider2, aVar, new Handler(Looper.getMainLooper()), z);
    }

    private StateMessage find2ndLastDeliveredMessage(List<StateMessage> list) {
        ListIterator listIterator = list.listIterator(list.size());
        int i = 0;
        while (listIterator.hasPrevious()) {
            StateMessage stateMessage = (StateMessage) listIterator.previous();
            if (stateMessage.getState().getStatus() == 2) {
                i++;
                if (i == 2) {
                    return stateMessage;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    @SuppressLint({"UseSparseArrays"})
    public Map<Long, MediaResult> findAttachments(String str, CommentsResponse commentsResponse) {
        List<CommentResponse> comments = commentsResponse.getComments();
        HashMap hashMap = new HashMap();
        for (CommentResponse attachments : comments) {
            for (Attachment attachment : attachments.getAttachments()) {
                MediaResult localFile = UtilsAttachment.getLocalFile(this.belvedere, str, attachment.getId().longValue(), attachment.getFileName());
                if (attachment.getSize().longValue() == localFile.mo38840a().length()) {
                    hashMap.put(attachment.getId(), localFile);
                }
            }
        }
        return hashMap;
    }

    public void actionQueued(Dispatcher dispatcher, GetState getState) {
        dispatcher.dispatch(this.actionFactory.loadComments(this.initialLoad));
    }

    public void execute(Dispatcher dispatcher, GetState getState, Callback callback) {
        StateConversation fromState = StateConversation.fromState(getState.getState());
        if (!C12017g.m31658b(fromState.getRemoteId())) {
            Logger.m31608a("RequestActivity", "Skip loading comments. No remote id found.", new Object[0]);
            dispatcher.dispatch(this.actionFactory.skipAction());
            callback.done();
            return;
        }
        final StateConversation stateConversation = fromState;
        final Dispatcher dispatcher2 = dispatcher;
        final Callback callback2 = callback;
        C137371 r0 = new MinimumTimeCallback<CommentsResponse>(this.handler, 1, TimeUnit.SECONDS) {
            public void onDelayedError(ErrorResponse errorResponse) {
                Logger.m31614d("RequestActivity", "Unable to load comments. Error: '%s'", errorResponse.getReason());
                dispatcher2.dispatch(ActionLoadComments.this.actionFactory.loadCommentsError(ActionLoadComments.this.initialLoad, errorResponse));
                callback2.done();
            }

            public void onDelayedSuccess(CommentsResponse commentsResponse) {
                HashSet hashSet = new HashSet(stateConversation.getMessageIdMapper().getRemoteIds());
                for (CommentResponse id : commentsResponse.getComments()) {
                    hashSet.add(id.getId());
                }
                ActionLoadComments.this.requestProvider.markRequestAsRead(stateConversation.getRemoteId(), hashSet.size());
                dispatcher2.dispatch(ActionLoadComments.this.actionFactory.loadCommentsSuccess(ActionLoadComments.this.initialLoad, commentsResponse, ActionLoadComments.this.findAttachments(stateConversation.getLocalId(), commentsResponse)));
                callback2.done();
            }
        };
        StateMessage find2ndLastDeliveredMessage = find2ndLastDeliveredMessage(fromState.getMessages());
        if (find2ndLastDeliveredMessage != null) {
            this.requestProvider.getCommentsSince(fromState.getRemoteId(), find2ndLastDeliveredMessage.getDate(), false, r0);
        } else {
            this.requestProvider.getComments(fromState.getRemoteId(), r0);
        }
    }

    ActionLoadComments(ActionFactory actionFactory2, RequestProvider requestProvider2, C13489a aVar, Handler handler2, boolean z) {
        this.actionFactory = actionFactory2;
        this.requestProvider = requestProvider2;
        this.belvedere = aVar;
        this.handler = handler2;
        this.initialLoad = z;
    }
}
