package zendesk.support;

public enum AttachmentType {
    INLINE("inline"),
    BLOCK("block");
    
    private String attachmentType;

    private AttachmentType(String str) {
        this.attachmentType = str;
    }

    public String getAttachmentType() {
        return this.attachmentType;
    }
}
