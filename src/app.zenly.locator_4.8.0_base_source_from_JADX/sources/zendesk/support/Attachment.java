package zendesk.support;

import com.zendesk.util.C12010a;
import java.util.List;

public class Attachment {
    private String contentType;
    private String contentUrl;
    private String fileName;
    private Long height;

    /* renamed from: id */
    private Long f35187id;
    private Long size;
    private List<Attachment> thumbnails;
    private Long width;

    public String getContentType() {
        return this.contentType;
    }

    public String getContentUrl() {
        return this.contentUrl;
    }

    public String getFileName() {
        return this.fileName;
    }

    public Long getHeight() {
        return this.height;
    }

    public Long getId() {
        return this.f35187id;
    }

    public Long getSize() {
        return this.size;
    }

    public List<Attachment> getThumbnails() {
        return C12010a.m31632a(this.thumbnails);
    }

    public Long getWidth() {
        return this.width;
    }
}
