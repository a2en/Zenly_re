package zendesk.support;

import com.zendesk.service.C12008e;
import com.zendesk.service.RetrofitZendeskCallbackAdapter;
import java.io.File;
import okhttp3.C13321t;
import okhttp3.C13333z;

class ZendeskUploadService {
    private final UploadService uploadService;

    public ZendeskUploadService(UploadService uploadService2) {
        this.uploadService = uploadService2;
    }

    /* access modifiers changed from: 0000 */
    public void deleteAttachment(String str, C12008e<Void> eVar) {
        this.uploadService.deleteAttachment(str).enqueue(new RetrofitZendeskCallbackAdapter(eVar));
    }

    /* access modifiers changed from: 0000 */
    public void uploadAttachment(String str, File file, String str2, C12008e<UploadResponseWrapper> eVar) {
        this.uploadService.uploadAttachment(str, C13333z.m35280a(C13321t.m35172b(str2), file)).enqueue(new RetrofitZendeskCallbackAdapter(eVar));
    }
}
