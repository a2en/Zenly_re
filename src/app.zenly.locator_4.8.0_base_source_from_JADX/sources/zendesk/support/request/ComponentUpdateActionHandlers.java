package zendesk.support.request;

import android.content.Context;
import com.zendesk.service.C12008e;
import com.zendesk.service.ErrorResponse;
import com.zendesk.util.C12010a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import zendesk.core.ActionHandlerRegistry;
import zendesk.suas.Listener;
import zendesk.support.RequestStatus;
import zendesk.support.requestlist.RequestInfo;
import zendesk.support.requestlist.RequestInfo.AgentInfo;
import zendesk.support.requestlist.RequestInfo.MessageInfo;
import zendesk.support.requestlist.RequestInfoDataSource.LocalDataSource;
import zendesk.support.requestlist.RequestListActivity;

class ComponentUpdateActionHandlers implements Listener<StateConversation> {
    /* access modifiers changed from: private */
    public final ActionHandlerRegistry actionHandlerRegistry;
    /* access modifiers changed from: private */
    public final Context context;
    /* access modifiers changed from: private */
    public final LocalDataSource localDataSource;
    /* access modifiers changed from: private */
    public final Queue queue = new Queue();

    private class RefreshCallback extends C12008e<List<RequestInfo>> {
        private final Callback callback;

        public void onError(ErrorResponse errorResponse) {
            this.callback.done();
            if (!ComponentUpdateActionHandlers.this.queue.isRunning()) {
                RequestListActivity.refresh(ComponentUpdateActionHandlers.this.context, ComponentUpdateActionHandlers.this.actionHandlerRegistry);
            }
        }

        private RefreshCallback(Callback callback2) {
            this.callback = callback2;
        }

        public void onSuccess(List<RequestInfo> list) {
            this.callback.done();
            if (!ComponentUpdateActionHandlers.this.queue.isRunning()) {
                RequestListActivity.refresh(ComponentUpdateActionHandlers.this.context, ComponentUpdateActionHandlers.this.actionHandlerRegistry);
            }
        }
    }

    ComponentUpdateActionHandlers(Context context2, ActionHandlerRegistry actionHandlerRegistry2, LocalDataSource localDataSource2) {
        this.context = context2;
        this.actionHandlerRegistry = actionHandlerRegistry2;
        this.localDataSource = localDataSource2;
    }

    private List<AgentInfo> getLast5AgentInfos(List<StateMessage> list, List<StateRequestUser> list2) {
        HashMap hashMap = new HashMap(list2.size());
        for (StateRequestUser stateRequestUser : list2) {
            long id = stateRequestUser.getId();
            if (stateRequestUser.isAgent() && !hashMap.containsKey(Long.valueOf(id))) {
                hashMap.put(Long.valueOf(id), stateRequestUser);
            }
        }
        ArrayList arrayList = new ArrayList();
        List<StateMessage> a = C12010a.m31632a(list);
        Collections.reverse(a);
        for (StateMessage userId : a) {
            long userId2 = userId.getUserId();
            if (hashMap.containsKey(Long.valueOf(userId2))) {
                StateRequestUser stateRequestUser2 = (StateRequestUser) hashMap.get(Long.valueOf(userId2));
                arrayList.add(new AgentInfo(String.valueOf(userId2), stateRequestUser2.getName(), stateRequestUser2.getAvatar()));
                if (arrayList.size() == 5) {
                    break;
                }
            }
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    private boolean hasPendingMessages(StateConversation stateConversation) {
        for (StateMessage state : stateConversation.getMessages()) {
            if (state.getState().getStatus() == 3) {
                return true;
            }
        }
        return false;
    }

    private RequestInfo map(StateConversation stateConversation) {
        List<StateMessage> messages = stateConversation.getMessages();
        if (C12010a.m31635a((Collection<Type>) messages)) {
            return null;
        }
        String localId = stateConversation.getLocalId();
        String remoteId = stateConversation.getRemoteId();
        RequestStatus status = stateConversation.getStatus();
        StateMessage stateMessage = (StateMessage) messages.get(0);
        StateMessage stateMessage2 = (StateMessage) messages.get(stateConversation.getMessages().size() - 1);
        Date date = stateMessage2.getDate();
        List last5AgentInfos = getLast5AgentInfos(stateConversation.getMessages(), stateConversation.getUsers());
        MessageInfo messageInfo = new MessageInfo(String.valueOf(stateMessage.getId()), stateMessage.getDate(), stateMessage.getBody());
        MessageInfo messageInfo2 = new MessageInfo(String.valueOf(stateMessage2.getId()), stateMessage2.getDate(), stateMessage2.getBody());
        HashSet hashSet = new HashSet();
        for (StateMessage stateMessage3 : messages) {
            String valueOf = String.valueOf(stateMessage3.getId());
            if (stateMessage3.getState().getStatus() == 1) {
                hashSet.add(valueOf);
            }
        }
        RequestInfo requestInfo = new RequestInfo(localId, remoteId, status, false, date, last5AgentInfos, messageInfo, messageInfo2, hashSet);
        return requestInfo;
    }

    public void update(final StateConversation stateConversation) {
        final RequestInfo map = map(stateConversation);
        if (map == null) {
            this.queue.dispatch(new Item() {
                public void execute(Callback callback) {
                    ComponentUpdateActionHandlers.this.localDataSource.remove(stateConversation.getLocalId(), new RefreshCallback(callback));
                }
            });
        } else if (!hasPendingMessages(stateConversation)) {
            this.queue.dispatch(new Item() {
                public void execute(Callback callback) {
                    ComponentUpdateActionHandlers.this.localDataSource.insert(map, new RefreshCallback(callback));
                }
            });
        }
    }
}
