package zendesk.support;

public class HelpCenterAttachment {
    private String contentUrl;
    private String fileName;
    private Long size;

    public String getContentUrl() {
        return this.contentUrl;
    }

    public String getFileName() {
        return this.fileName;
    }

    public Long getSize() {
        return this.size;
    }
}
