package zendesk.support.request;

import com.zendesk.logger.Logger;
import com.zendesk.service.C12008e;
import com.zendesk.service.ErrorResponse;
import com.zendesk.util.C12017g;
import zendesk.suas.Dispatcher;
import zendesk.suas.GetState;
import zendesk.support.Request;
import zendesk.support.RequestProvider;

class ActionLoadRequest implements AsyncAction {
    /* access modifiers changed from: private */

    /* renamed from: af */
    public final ActionFactory f35211af;
    private final RequestProvider requestProvider;

    ActionLoadRequest(ActionFactory actionFactory, RequestProvider requestProvider2) {
        this.f35211af = actionFactory;
        this.requestProvider = requestProvider2;
    }

    public void actionQueued(Dispatcher dispatcher, GetState getState) {
        dispatcher.dispatch(this.f35211af.loadRequest());
    }

    public void execute(final Dispatcher dispatcher, GetState getState, final Callback callback) {
        StateConversation fromState = StateConversation.fromState(getState.getState());
        String remoteId = fromState.getRemoteId();
        String str = "RequestActivity";
        if (!C12017g.m31658b(remoteId)) {
            Logger.m31608a(str, "Skip loading request. No remote id found.", new Object[0]);
            dispatcher.dispatch(this.f35211af.skipAction());
            callback.done();
        } else if (fromState.getStatus() != null) {
            Logger.m31608a(str, "Skip loading request. Request status already available.", new Object[0]);
            dispatcher.dispatch(this.f35211af.skipAction());
            callback.done();
        } else {
            this.requestProvider.getRequest(remoteId, new C12008e<Request>() {
                public void onError(ErrorResponse errorResponse) {
                    Logger.m31614d("RequestActivity", "Error loading request. Error: '%s'", errorResponse.getReason());
                    dispatcher.dispatch(ActionLoadRequest.this.f35211af.loadRequestError(errorResponse));
                    callback.done();
                }

                public void onSuccess(Request request) {
                    dispatcher.dispatch(ActionLoadRequest.this.f35211af.loadRequestSuccess(request));
                    callback.done();
                }
            });
        }
    }
}
