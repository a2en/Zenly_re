package zendesk.support.requestlist;

import java.util.Date;
import java.util.List;
import java.util.Set;
import zendesk.support.RequestStatus;

public class RequestInfo {
    private final List<AgentInfo> agentInfos;
    private final Set<String> failedMessageIds;
    private final MessageInfo firstMessageInfo;
    private final MessageInfo lastMessageInfo;
    private final Date lastUpdated;
    private final String localId;
    private final String remoteId;
    private final RequestStatus requestStatus;
    private final boolean unread;

    public static class AgentInfo {
        private final String avatar;

        /* renamed from: id */
        private final String f35244id;
        private final String name;

        public AgentInfo(String str, String str2, String str3) {
            this.f35244id = str;
            this.name = str2;
            this.avatar = str3;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || AgentInfo.class != obj.getClass()) {
                return false;
            }
            AgentInfo agentInfo = (AgentInfo) obj;
            String str = this.f35244id;
            if (str == null ? agentInfo.f35244id != null : !str.equals(agentInfo.f35244id)) {
                return false;
            }
            String str2 = this.name;
            if (str2 == null ? agentInfo.name != null : !str2.equals(agentInfo.name)) {
                return false;
            }
            String str3 = this.avatar;
            String str4 = agentInfo.avatar;
            if (str3 != null) {
                z = str3.equals(str4);
            } else if (str4 != null) {
                z = false;
            }
            return z;
        }

        /* access modifiers changed from: 0000 */
        public String getAvatar() {
            return this.avatar;
        }

        /* access modifiers changed from: 0000 */
        public String getName() {
            return this.name;
        }

        public int hashCode() {
            String str = this.f35244id;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.name;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.avatar;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return hashCode2 + i;
        }
    }

    public static class MessageInfo {
        private final String body;
        private final Date date;

        /* renamed from: id */
        private final String f35245id;

        public MessageInfo(String str, Date date2, String str2) {
            this.f35245id = str;
            this.date = date2;
            this.body = str2;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || MessageInfo.class != obj.getClass()) {
                return false;
            }
            MessageInfo messageInfo = (MessageInfo) obj;
            String str = this.f35245id;
            if (str == null ? messageInfo.f35245id != null : !str.equals(messageInfo.f35245id)) {
                return false;
            }
            Date date2 = this.date;
            if (date2 == null ? messageInfo.date != null : !date2.equals(messageInfo.date)) {
                return false;
            }
            String str2 = this.body;
            String str3 = messageInfo.body;
            if (str2 != null) {
                z = str2.equals(str3);
            } else if (str3 != null) {
                z = false;
            }
            return z;
        }

        /* access modifiers changed from: 0000 */
        public String getBody() {
            return this.body;
        }

        /* access modifiers changed from: 0000 */
        public Date getDate() {
            return this.date;
        }

        public int hashCode() {
            String str = this.f35245id;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            Date date2 = this.date;
            int hashCode2 = (hashCode + (date2 != null ? date2.hashCode() : 0)) * 31;
            String str2 = this.body;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode2 + i;
        }
    }

    public RequestInfo(String str, String str2, RequestStatus requestStatus2, boolean z, Date date, List<AgentInfo> list, MessageInfo messageInfo, MessageInfo messageInfo2, Set<String> set) {
        this.localId = str;
        this.remoteId = str2;
        this.requestStatus = requestStatus2;
        this.unread = z;
        this.lastUpdated = date;
        this.agentInfos = list;
        this.firstMessageInfo = messageInfo;
        this.lastMessageInfo = messageInfo2;
        this.failedMessageIds = set;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || RequestInfo.class != obj.getClass()) {
            return false;
        }
        RequestInfo requestInfo = (RequestInfo) obj;
        if (this.unread != requestInfo.unread) {
            return false;
        }
        String str = this.localId;
        if (str == null ? requestInfo.localId != null : !str.equals(requestInfo.localId)) {
            return false;
        }
        String str2 = this.remoteId;
        if (str2 == null ? requestInfo.remoteId != null : !str2.equals(requestInfo.remoteId)) {
            return false;
        }
        if (this.requestStatus != requestInfo.requestStatus) {
            return false;
        }
        Date date = this.lastUpdated;
        if (date == null ? requestInfo.lastUpdated != null : !date.equals(requestInfo.lastUpdated)) {
            return false;
        }
        List<AgentInfo> list = this.agentInfos;
        if (list == null ? requestInfo.agentInfos != null : !list.equals(requestInfo.agentInfos)) {
            return false;
        }
        MessageInfo messageInfo = this.firstMessageInfo;
        if (messageInfo == null ? requestInfo.firstMessageInfo != null : !messageInfo.equals(requestInfo.firstMessageInfo)) {
            return false;
        }
        MessageInfo messageInfo2 = this.lastMessageInfo;
        if (messageInfo2 == null ? requestInfo.lastMessageInfo != null : !messageInfo2.equals(requestInfo.lastMessageInfo)) {
            return false;
        }
        Set<String> set = this.failedMessageIds;
        Set<String> set2 = requestInfo.failedMessageIds;
        if (set != null) {
            z = set.equals(set2);
        } else if (set2 != null) {
            z = false;
        }
        return z;
    }

    public List<AgentInfo> getAgentInfos() {
        return this.agentInfos;
    }

    /* access modifiers changed from: 0000 */
    public Set<String> getFailedMessageIds() {
        return this.failedMessageIds;
    }

    /* access modifiers changed from: 0000 */
    public MessageInfo getFirstMessageInfo() {
        return this.firstMessageInfo;
    }

    /* access modifiers changed from: 0000 */
    public MessageInfo getLastMessageInfo() {
        return this.lastMessageInfo;
    }

    /* access modifiers changed from: 0000 */
    public Date getLastUpdated() {
        return this.lastUpdated;
    }

    public String getLocalId() {
        return this.localId;
    }

    public String getRemoteId() {
        return this.remoteId;
    }

    public RequestStatus getRequestStatus() {
        return this.requestStatus;
    }

    public int hashCode() {
        String str = this.localId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.remoteId;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        RequestStatus requestStatus2 = this.requestStatus;
        int hashCode3 = (((hashCode2 + (requestStatus2 != null ? requestStatus2.hashCode() : 0)) * 31) + (this.unread ? 1 : 0)) * 31;
        Date date = this.lastUpdated;
        int hashCode4 = (hashCode3 + (date != null ? date.hashCode() : 0)) * 31;
        List<AgentInfo> list = this.agentInfos;
        int hashCode5 = (hashCode4 + (list != null ? list.hashCode() : 0)) * 31;
        MessageInfo messageInfo = this.firstMessageInfo;
        int hashCode6 = (hashCode5 + (messageInfo != null ? messageInfo.hashCode() : 0)) * 31;
        MessageInfo messageInfo2 = this.lastMessageInfo;
        int hashCode7 = (hashCode6 + (messageInfo2 != null ? messageInfo2.hashCode() : 0)) * 31;
        Set<String> set = this.failedMessageIds;
        if (set != null) {
            i = set.hashCode();
        }
        return hashCode7 + i;
    }

    /* access modifiers changed from: 0000 */
    public boolean isClosed() {
        return RequestStatus.Closed.equals(this.requestStatus);
    }

    /* access modifiers changed from: 0000 */
    public boolean isUnread() {
        return this.unread;
    }
}
