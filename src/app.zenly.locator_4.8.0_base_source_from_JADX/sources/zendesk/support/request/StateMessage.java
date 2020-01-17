package zendesk.support.request;

import androidx.core.util.C0603e;
import com.zendesk.service.ErrorResponse;
import com.zendesk.util.C12017g;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import zendesk.support.Attachment;
import zendesk.support.CommentResponse;
import zendesk.support.IdUtil;

class StateMessage implements Serializable {
    private final List<StateRequestAttachment> attachments;
    private final Date date;
    private final String htmlBody;

    /* renamed from: id */
    private final long f35240id;
    private final String plainBody;
    private final StateMessageStatus state;
    private final long userId;

    StateMessage(String str, List<StateRequestAttachment> list) {
        this.htmlBody = null;
        this.plainBody = str;
        this.date = new Date();
        this.f35240id = IdUtil.newLongId();
        this.userId = -1;
        this.state = StateMessageStatus.pending();
        this.attachments = list;
    }

    static C0603e<List<StateMessage>, StateIdMapper> convert(List<CommentResponse> list, StateIdMapper stateIdMapper, Map<Long, StateRequestAttachment> map) {
        long j;
        Map<Long, StateRequestAttachment> map2 = map;
        ArrayList arrayList = new ArrayList(list.size());
        StateIdMapper stateIdMapper2 = stateIdMapper;
        for (CommentResponse commentResponse : list) {
            Long id = commentResponse.getId();
            Long authorId = commentResponse.getAuthorId();
            if (!(id == null || authorId == null)) {
                ArrayList arrayList2 = new ArrayList();
                for (Attachment attachment : commentResponse.getAttachments()) {
                    if (map2.containsKey(attachment.getId())) {
                        arrayList2.add(map2.get(attachment.getId()));
                    }
                }
                if (stateIdMapper2.hasLocalId(id)) {
                    j = stateIdMapper2.getLocalId(id).longValue();
                } else {
                    j = IdUtil.newLongId();
                    stateIdMapper2 = stateIdMapper2.addIdMapping(id, Long.valueOf(j));
                }
                long j2 = j;
                StateMessage stateMessage = new StateMessage(commentResponse.getHtmlBody(), commentResponse.getBody(), commentResponse.getCreatedAt(), j2, authorId.longValue(), StateMessageStatus.delivered(), arrayList2);
                arrayList.add(stateMessage);
            }
        }
        return C0603e.m2769a(arrayList, stateIdMapper2.copy());
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || StateMessage.class != obj.getClass()) {
            return false;
        }
        StateMessage stateMessage = (StateMessage) obj;
        if (this.f35240id != stateMessage.f35240id || this.userId != stateMessage.userId) {
            return false;
        }
        String str = this.htmlBody;
        if (str == null ? stateMessage.htmlBody != null : !str.equals(stateMessage.htmlBody)) {
            return false;
        }
        String str2 = this.plainBody;
        if (str2 == null ? stateMessage.plainBody != null : !str2.equals(stateMessage.plainBody)) {
            return false;
        }
        Date date2 = this.date;
        if (date2 == null ? stateMessage.date != null : !date2.equals(stateMessage.date)) {
            return false;
        }
        StateMessageStatus stateMessageStatus = this.state;
        if (stateMessageStatus == null ? stateMessage.state != null : !stateMessageStatus.equals(stateMessage.state)) {
            return false;
        }
        List<StateRequestAttachment> list = this.attachments;
        List<StateRequestAttachment> list2 = stateMessage.attachments;
        if (list != null) {
            z = list.equals(list2);
        } else if (list2 != null) {
            z = false;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    public List<StateRequestAttachment> getAttachments() {
        return this.attachments;
    }

    /* access modifiers changed from: 0000 */
    public String getBody() {
        return C12017g.m31658b(this.plainBody) ? this.plainBody : UtilsAttachment.getMessageBodyForAttachments(getAttachments());
    }

    /* access modifiers changed from: 0000 */
    public Date getDate() {
        return this.date;
    }

    /* access modifiers changed from: 0000 */
    public String getHtmlBody() {
        return this.htmlBody;
    }

    /* access modifiers changed from: 0000 */
    public long getId() {
        return this.f35240id;
    }

    /* access modifiers changed from: 0000 */
    public String getPlainBody() {
        return this.plainBody;
    }

    /* access modifiers changed from: 0000 */
    public StateMessageStatus getState() {
        return this.state;
    }

    /* access modifiers changed from: 0000 */
    public long getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.htmlBody, this.plainBody, this.date, Long.valueOf(this.f35240id), Long.valueOf(this.userId), this.state, this.attachments});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Message{htmlBody='");
        sb.append(this.htmlBody);
        sb.append('\'');
        sb.append(", plainBody='");
        sb.append(this.plainBody);
        sb.append('\'');
        sb.append(", date=");
        sb.append(this.date);
        sb.append(", id=");
        sb.append(this.f35240id);
        sb.append(", userId=");
        sb.append(this.userId);
        sb.append(", state=");
        sb.append(this.state);
        sb.append('}');
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    public StateMessage withAttachments(List<StateRequestAttachment> list) {
        StateMessage stateMessage = new StateMessage(this.htmlBody, this.plainBody, this.date, this.f35240id, this.userId, this.state, list);
        return stateMessage;
    }

    /* access modifiers changed from: 0000 */
    public StateMessage withDelivered() {
        StateMessage stateMessage = new StateMessage(this.htmlBody, this.plainBody, this.date, this.f35240id, this.userId, StateMessageStatus.delivered(), this.attachments);
        return stateMessage;
    }

    /* access modifiers changed from: 0000 */
    public StateMessage withError(ErrorResponse errorResponse) {
        StateMessage stateMessage = new StateMessage(this.htmlBody, this.plainBody, this.date, this.f35240id, this.userId, StateMessageStatus.error(errorResponse.getReason()), this.attachments);
        return stateMessage;
    }

    /* access modifiers changed from: 0000 */
    public StateMessage withPending() {
        StateMessage stateMessage = new StateMessage(this.htmlBody, this.plainBody, this.date, this.f35240id, this.userId, StateMessageStatus.pending(), this.attachments);
        return stateMessage;
    }

    /* access modifiers changed from: 0000 */
    public StateMessage withUpdatedAttachment(StateRequestAttachment stateRequestAttachment) {
        ArrayList arrayList = new ArrayList(this.attachments.size());
        for (StateRequestAttachment stateRequestAttachment2 : this.attachments) {
            if (stateRequestAttachment2.getId() == stateRequestAttachment.getId()) {
                stateRequestAttachment2 = stateRequestAttachment;
            }
            arrayList.add(stateRequestAttachment2);
        }
        StateMessage stateMessage = new StateMessage(this.htmlBody, this.plainBody, this.date, this.f35240id, this.userId, this.state, arrayList);
        return stateMessage;
    }

    StateMessage(String str, String str2, Date date2, long j, long j2, StateMessageStatus stateMessageStatus, List<StateRequestAttachment> list) {
        this.htmlBody = str;
        this.plainBody = str2;
        this.date = date2;
        this.f35240id = j;
        this.userId = j2;
        this.state = stateMessageStatus;
        this.attachments = list;
    }
}
