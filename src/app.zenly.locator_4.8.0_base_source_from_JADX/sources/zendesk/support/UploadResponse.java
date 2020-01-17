package zendesk.support;

public class UploadResponse {
    private Attachment attachment;
    private String token;

    public Attachment getAttachment() {
        return this.attachment;
    }

    public String getToken() {
        return this.token;
    }
}
