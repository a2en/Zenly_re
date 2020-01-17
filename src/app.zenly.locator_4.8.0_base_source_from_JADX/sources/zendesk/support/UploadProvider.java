package zendesk.support;

import com.zendesk.service.C12008e;
import java.io.File;

public interface UploadProvider {
    void deleteAttachment(String str, C12008e<Void> eVar);

    void uploadAttachment(String str, File file, String str2, C12008e<UploadResponse> eVar);
}
