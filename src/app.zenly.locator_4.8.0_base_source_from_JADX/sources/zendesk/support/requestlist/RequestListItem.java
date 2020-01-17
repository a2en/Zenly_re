package zendesk.support.requestlist;

import com.zendesk.func.ZFunc1;
import com.zendesk.util.C12010a;
import com.zendesk.util.C12017g;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import zendesk.support.request.RequestUiConfig.Builder;
import zendesk.support.requestlist.RequestInfo.AgentInfo;

class RequestListItem {
    private final RequestInfo requestInfo;

    RequestListItem(RequestInfo requestInfo2) {
        this.requestInfo = requestInfo2;
    }

    /* access modifiers changed from: 0000 */
    public Builder configure(Builder builder) {
        builder.withRequestInfo(this.requestInfo);
        return builder;
    }

    /* access modifiers changed from: 0000 */
    public String getAvatar() {
        return hasAgentReplied() ? ((AgentInfo) this.requestInfo.getAgentInfos().get(0)).getAvatar() : "";
    }

    /* access modifiers changed from: 0000 */
    public String getFirstMessage() {
        return this.requestInfo.getFirstMessageInfo().getBody();
    }

    /* access modifiers changed from: 0000 */
    public long getItemId() {
        int i;
        String localId = this.requestInfo.getLocalId();
        String remoteId = this.requestInfo.getRemoteId();
        if (C12017g.m31658b(localId)) {
            i = localId.hashCode();
        } else {
            i = remoteId.hashCode();
        }
        return (long) i;
    }

    /* access modifiers changed from: 0000 */
    public List<String> getLastCommentingAgentNames() {
        return C12010a.m31637b(this.requestInfo.getAgentInfos(), new ZFunc1<AgentInfo, String>(this) {
            public String apply(AgentInfo agentInfo) {
                return agentInfo.getName();
            }
        });
    }

    /* access modifiers changed from: 0000 */
    public String getLastMessage() {
        return this.requestInfo.getLastMessageInfo().getBody();
    }

    /* access modifiers changed from: 0000 */
    public Date getLastUpdated() {
        return this.requestInfo.getLastUpdated();
    }

    /* access modifiers changed from: 0000 */
    public boolean hasAgentReplied() {
        return C12010a.m31639b((Collection<Type>) this.requestInfo.getAgentInfos());
    }

    /* access modifiers changed from: 0000 */
    public boolean isClosed() {
        return this.requestInfo.isClosed();
    }

    /* access modifiers changed from: 0000 */
    public boolean isFailed() {
        return C12010a.m31639b((Collection<Type>) this.requestInfo.getFailedMessageIds());
    }

    /* access modifiers changed from: 0000 */
    public boolean isUnread() {
        return this.requestInfo.isUnread();
    }
}
