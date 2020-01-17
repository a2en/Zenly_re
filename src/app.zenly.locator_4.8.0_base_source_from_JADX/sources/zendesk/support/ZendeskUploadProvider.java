package zendesk.support;

import com.zendesk.service.C12008e;
import java.io.File;

class ZendeskUploadProvider implements UploadProvider {
    private final ZendeskUploadService uploadService;

    ZendeskUploadProvider(ZendeskUploadService zendeskUploadService) {
        this.uploadService = zendeskUploadService;
    }

    public void deleteAttachment(String str, C12008e<Void> eVar) {
        this.uploadService.deleteAttachment(str, eVar);
    }

    public void uploadAttachment(String str, File file, String str2, final C12008e<UploadResponse> eVar) {
        this.uploadService.uploadAttachment(str, file, str2, new ZendeskCallbackSuccess<UploadResponseWrapper>(this, eVar) {
            public void onSuccess(UploadResponseWrapper uploadResponseWrapper) {
                C12008e eVar = eVar;
                if (eVar != null) {
                    eVar.onSuccess(uploadResponseWrapper.getUpload());
                }
            }
        });
    }
}
