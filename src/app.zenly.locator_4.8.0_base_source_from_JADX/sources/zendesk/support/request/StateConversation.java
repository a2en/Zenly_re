package zendesk.support.request;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import zendesk.suas.C13622i;
import zendesk.support.RequestStatus;

class StateConversation implements Serializable {
    private final StateIdMapper attachmentIdMapper;
    private final boolean hasAgentReplies;
    private final String localId;
    private final StateIdMapper messageIdMapper;
    private final List<StateMessage> messages;
    private final String remoteId;
    private final RequestStatus status;
    private final List<StateRequestUser> users;

    static class Builder {
        private StateIdMapper attachmentIdMapper;
        private boolean hasAgentReplies;
        private String localId;
        private StateIdMapper messageIdMapper;
        private List<StateMessage> messages;
        private String remoteId;
        private RequestStatus status;
        private List<StateRequestUser> users;

        /* access modifiers changed from: 0000 */
        public StateConversation build() {
            StateConversation stateConversation = new StateConversation(this.localId, this.remoteId, this.status, this.hasAgentReplies, this.messages, this.users, this.attachmentIdMapper, this.messageIdMapper);
            return stateConversation;
        }

        /* access modifiers changed from: 0000 */
        public Builder setAttachmentIdMapper(StateIdMapper stateIdMapper) {
            this.attachmentIdMapper = stateIdMapper;
            return this;
        }

        /* access modifiers changed from: 0000 */
        public Builder setHasAgentReplies(boolean z) {
            this.hasAgentReplies = z;
            return this;
        }

        /* access modifiers changed from: 0000 */
        public Builder setLocalId(String str) {
            this.localId = str;
            return this;
        }

        /* access modifiers changed from: 0000 */
        public Builder setMessageIdMapper(StateIdMapper stateIdMapper) {
            this.messageIdMapper = stateIdMapper;
            return this;
        }

        /* access modifiers changed from: 0000 */
        public Builder setMessages(List<StateMessage> list) {
            this.messages = list;
            return this;
        }

        /* access modifiers changed from: 0000 */
        public Builder setRemoteId(String str) {
            this.remoteId = str;
            return this;
        }

        /* access modifiers changed from: 0000 */
        public Builder setStatus(RequestStatus requestStatus) {
            this.status = requestStatus;
            return this;
        }

        /* access modifiers changed from: 0000 */
        public Builder setUsers(List<StateRequestUser> list) {
            this.users = list;
            if (!this.hasAgentReplies) {
                this.hasAgentReplies = StateRequestUser.containsAgent(list);
            }
            return this;
        }

        private Builder(String str, String str2, RequestStatus requestStatus, boolean z, List<StateMessage> list, List<StateRequestUser> list2, StateIdMapper stateIdMapper, StateIdMapper stateIdMapper2) {
            this.localId = str;
            this.remoteId = str2;
            this.status = requestStatus;
            this.hasAgentReplies = z;
            this.messages = list;
            this.users = list2;
            this.attachmentIdMapper = stateIdMapper;
            this.messageIdMapper = stateIdMapper2;
        }
    }

    static StateConversation fromState(C13622i iVar) {
        StateConversation stateConversation = (StateConversation) iVar.mo39263a(StateConversation.class);
        if (stateConversation != null) {
            return stateConversation;
        }
        return new StateConversation();
    }

    /* access modifiers changed from: 0000 */
    public StateIdMapper getAttachmentIdMapper() {
        return this.attachmentIdMapper;
    }

    /* access modifiers changed from: 0000 */
    public String getLocalId() {
        return this.localId;
    }

    /* access modifiers changed from: 0000 */
    public StateIdMapper getMessageIdMapper() {
        return this.messageIdMapper;
    }

    /* access modifiers changed from: 0000 */
    public List<StateMessage> getMessages() {
        return this.messages;
    }

    /* access modifiers changed from: 0000 */
    public String getRemoteId() {
        return this.remoteId;
    }

    /* access modifiers changed from: 0000 */
    public RequestStatus getStatus() {
        return this.status;
    }

    /* access modifiers changed from: 0000 */
    public List<StateRequestUser> getUsers() {
        return this.users;
    }

    /* access modifiers changed from: 0000 */
    public boolean hasAgentReplies() {
        return this.hasAgentReplies;
    }

    /* access modifiers changed from: 0000 */
    public Builder newBuilder() {
        Builder builder = new Builder(this.localId, this.remoteId, this.status, this.hasAgentReplies, this.messages, this.users, this.attachmentIdMapper, this.messageIdMapper);
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Conversation{localId='");
        sb.append(this.localId);
        sb.append('\'');
        sb.append(", remoteId='");
        sb.append(this.remoteId);
        sb.append('\'');
        sb.append(", messages=");
        sb.append(this.messages);
        sb.append(", users=");
        sb.append(this.users);
        sb.append(", attachmentIdMapper=");
        sb.append(this.attachmentIdMapper);
        sb.append(", messageIdMapper=");
        sb.append(this.messageIdMapper);
        sb.append('}');
        return sb.toString();
    }

    private StateConversation(String str, String str2, RequestStatus requestStatus, boolean z, List<StateMessage> list, List<StateRequestUser> list2, StateIdMapper stateIdMapper, StateIdMapper stateIdMapper2) {
        this.localId = str;
        this.remoteId = str2;
        this.status = requestStatus;
        this.hasAgentReplies = z;
        this.messages = list;
        this.users = list2;
        this.attachmentIdMapper = stateIdMapper;
        this.messageIdMapper = stateIdMapper2;
    }

    StateConversation() {
        String str = "";
        this.localId = str;
        this.remoteId = str;
        this.status = null;
        this.hasAgentReplies = false;
        this.messages = new ArrayList();
        this.users = new ArrayList();
        this.attachmentIdMapper = new StateIdMapper();
        this.messageIdMapper = new StateIdMapper();
    }
}
