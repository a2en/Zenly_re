package zendesk.support;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CreateRequest {
    private static final transient String METADATA_SDK_KEY = "sdk";
    private Comment comment;
    private List<Object> customFields;

    /* renamed from: id */
    private String f35192id;
    private Map<String, Map<String, String>> metadata;
    private String subject;
    private List<String> tags;
    private Long ticketFormId;

    public List<Object> getCustomFields() {
        return this.customFields;
    }

    public String getDescription() {
        Comment comment2 = this.comment;
        if (comment2 == null) {
            return null;
        }
        return comment2.getBody();
    }

    public String getId() {
        return this.f35192id;
    }

    public String getSubject() {
        return this.subject;
    }

    public List<String> getTags() {
        return this.tags;
    }

    public Long getTicketFormId() {
        return this.ticketFormId;
    }

    public void setAttachments(List<String> list) {
        if (this.comment == null) {
            this.comment = new Comment();
        }
        this.comment.setAttachments(list);
    }

    public void setCustomFields(List<Object> list) {
        this.customFields = list;
    }

    public void setDescription(String str) {
        if (this.comment == null) {
            this.comment = new Comment();
        }
        this.comment.setBody(str);
    }

    public void setId(String str) {
        this.f35192id = str;
    }

    public void setMetadata(Map<String, String> map) {
        this.metadata = new HashMap();
        this.metadata.put(METADATA_SDK_KEY, map);
    }

    public void setSubject(String str) {
        this.subject = str;
    }

    public void setTags(List<String> list) {
        this.tags = list;
    }

    public void setTicketFormId(Long l) {
        this.ticketFormId = l;
    }
}
