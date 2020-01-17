package zendesk.support;

import com.google.gson.p315j.C11258c;
import com.zendesk.util.C12010a;
import java.util.List;

public class EndUserComment {
    @C11258c("uploads")
    private List<String> attachments;
    private String value;

    public List<String> getAttachments() {
        return C12010a.m31632a(this.attachments);
    }

    public void setAttachments(List<String> list) {
        this.attachments = list;
    }

    public void setValue(String str) {
        this.value = str;
    }
}
