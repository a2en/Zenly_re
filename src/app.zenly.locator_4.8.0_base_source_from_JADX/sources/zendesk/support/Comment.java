package zendesk.support;

import com.google.gson.p315j.C11258c;
import com.zendesk.util.C12010a;
import java.util.Date;
import java.util.List;

public class Comment {
    @C11258c("uploads")
    private List<String> attachments;
    private Long authorId;
    private String body;
    private Date createdAt;
    private String htmlBody;

    /* renamed from: id */
    private Long f35190id;
    @C11258c("public")
    private boolean isPublic = true;
    private String requestId;
    private String url;

    public List<String> getAttachments() {
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
        return this.f35190id;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public String getUrl() {
        return this.url;
    }

    public boolean isPublic() {
        return this.isPublic;
    }

    public void setAttachments(List<String> list) {
        this.attachments = list;
    }

    public void setAuthorId(Long l) {
        this.authorId = l;
    }

    public void setBody(String str) {
        this.body = str;
    }

    public void setCreatedAt(Date date) {
        this.createdAt = date;
    }
}
