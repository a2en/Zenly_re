package zendesk.support;

import com.zendesk.util.C12010a;
import java.util.Date;
import java.util.List;

public class CommentResponse {
    private List<Attachment> attachments;
    private Long authorId;
    private String body;
    private Date createdAt;
    private String htmlBody;

    /* renamed from: id */
    private Long f35191id;

    public List<Attachment> getAttachments() {
        return C12010a.m31632a(this.attachments);
    }

    public Long getAuthorId() {
        return this.authorId;
    }

    public String getBody() {
        return this.body;
    }

    public Date getCreatedAt() {
        Date date = this.createdAt;
        if (date == null) {
            return null;
        }
        return new Date(date.getTime());
    }

    public String getHtmlBody() {
        return this.htmlBody;
    }

    public Long getId() {
        return this.f35191id;
    }
}
