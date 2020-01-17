package zendesk.support;

import com.zendesk.util.C12010a;
import java.util.Date;
import java.util.List;

public class Request {
    private List<Long> collaboratorIds;
    private EndUserComment comment;
    private Integer commentCount;
    private Date createdAt;
    private String description;
    private Date dueAt;
    private Comment firstComment;

    /* renamed from: id */
    private String f35197id;
    private Comment lastComment;
    private List<User> lastCommentingAgents;
    private List<Long> lastCommentingAgentsIds;
    private Long organizationId;
    private String priority;
    private Date publicUpdatedAt;
    private Long requesterId;
    private RequestStatus status;
    private String subject;
    private String type;
    private Date updatedAt;
    private String url;

    public Request() {
    }

    public List<Long> getCollaboratorIds() {
        return C12010a.m31632a(this.collaboratorIds);
    }

    public Integer getCommentCount() {
        return this.commentCount;
    }

    public Date getCreatedAt() {
        Date date = this.createdAt;
        if (date == null) {
            return null;
        }
        return new Date(date.getTime());
    }

    public String getDescription() {
        return this.description;
    }

    public Date getDueAt() {
        Date date = this.dueAt;
        if (date == null) {
            return null;
        }
        return new Date(date.getTime());
    }

    public Comment getFirstComment() {
        return this.firstComment;
    }

    public String getId() {
        return this.f35197id;
    }

    public Comment getLastComment() {
        return this.lastComment;
    }

    public List<User> getLastCommentingAgents() {
        return C12010a.m31632a(this.lastCommentingAgents);
    }

    /* access modifiers changed from: 0000 */
    public List<Long> getLastCommentingAgentsIds() {
        return C12010a.m31632a(this.lastCommentingAgentsIds);
    }

    public Long getOrganizationId() {
        return this.organizationId;
    }

    public String getPriority() {
        return this.priority;
    }

    public Date getPublicUpdatedAt() {
        Date date = this.publicUpdatedAt;
        if (date == null) {
            return getUpdatedAt();
        }
        return new Date(date.getTime());
    }

    public Long getRequesterId() {
        return this.requesterId;
    }

    public RequestStatus getStatus() {
        return this.status;
    }

    public String getSubject() {
        return this.subject;
    }

    public String getType() {
        return this.type;
    }

    public Date getUpdatedAt() {
        Date date = this.updatedAt;
        if (date == null) {
            return null;
        }
        return new Date(date.getTime());
    }

    public String getUrl() {
        return this.url;
    }

    public void setComment(EndUserComment endUserComment) {
        this.comment = endUserComment;
    }

    /* access modifiers changed from: 0000 */
    public void setLastCommentingAgents(List<User> list) {
        this.lastCommentingAgents = list;
    }

    Request(String str, RequestStatus requestStatus) {
        this.f35197id = str;
        this.status = requestStatus;
    }
}
