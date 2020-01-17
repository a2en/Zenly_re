package zendesk.support;

import com.zendesk.util.C12010a;
import java.util.List;

class AttachmentResponse {
    private List<HelpCenterAttachment> articleAttachments;

    AttachmentResponse() {
    }

    /* access modifiers changed from: 0000 */
    public List<HelpCenterAttachment> getArticleAttachments() {
        return C12010a.m31632a(this.articleAttachments);
    }
}
