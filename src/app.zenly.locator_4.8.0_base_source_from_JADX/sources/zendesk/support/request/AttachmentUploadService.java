package zendesk.support.request;

import android.annotation.SuppressLint;
import android.net.Uri;
import com.zendesk.logger.Logger;
import com.zendesk.service.C12004a;
import com.zendesk.service.C12008e;
import com.zendesk.service.ErrorResponse;
import com.zendesk.util.C12010a;
import com.zendesk.util.C12017g;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import zendesk.belvedere.C13489a;
import zendesk.belvedere.C13492c;
import zendesk.belvedere.MediaResult;
import zendesk.support.Attachment;
import zendesk.support.UploadProvider;
import zendesk.support.UploadResponse;

class AttachmentUploadService {
    private final C13489a belvedere;
    private final List<StateRequestAttachment> errorItems;
    private final List<StateRequestAttachment> itemsForUpload;
    /* access modifiers changed from: private */
    public final Map<Long, Long> localToRemoteMap;
    private final Object lock = new Object();
    private final List<StateRequestAttachment> processedItems;
    private List<ResolveCallback> resolveCallbacks;
    private C12008e<AttachmentUploadResult> resultListener;
    private String subDirectory;
    /* access modifiers changed from: private */
    public final UploadProvider uploadProvider;

    static class AttachmentUploadResult {
        private final Map<Long, Long> localToRemoteIdMap;
        private final List<StateRequestAttachment> requestAttachments;

        AttachmentUploadResult(List<StateRequestAttachment> list, Map<Long, Long> map) {
            this.requestAttachments = list;
            this.localToRemoteIdMap = map;
        }

        /* access modifiers changed from: 0000 */
        public Map<Long, Long> getLocalToRemoteIdMap() {
            return this.localToRemoteIdMap;
        }

        /* access modifiers changed from: 0000 */
        public List<StateRequestAttachment> getRequestAttachments() {
            return this.requestAttachments;
        }
    }

    private class AttachmentsCallback extends C12008e<UploadResponse> {
        private final StateRequestAttachment requestAttachment;

        AttachmentsCallback(StateRequestAttachment stateRequestAttachment) {
            this.requestAttachment = stateRequestAttachment;
        }

        public void onError(ErrorResponse errorResponse) {
            Logger.m31614d("RequestActivity", "Error uploading file: %s | Error: %s", this.requestAttachment, errorResponse.getReason());
            AttachmentUploadService.this.errorUpload(this.requestAttachment);
        }

        public void onSuccess(UploadResponse uploadResponse) {
            Logger.m31608a("RequestActivity", "Successfully uploaded file: %s | Result: %s", this.requestAttachment, uploadResponse);
            AttachmentUploadService.this.localToRemoteMap.put(Long.valueOf(this.requestAttachment.getId()), uploadResponse.getAttachment().getId());
            AttachmentUploadService.this.uploadSuccess(this.requestAttachment, uploadResponse);
        }
    }

    private class ResolveCallback extends C13492c<List<MediaResult>> {
        private final StateRequestAttachment requestAttachment;

        private ResolveCallback(StateRequestAttachment stateRequestAttachment) {
            this.requestAttachment = stateRequestAttachment;
        }

        public void success(List<MediaResult> list) {
            Uri parsedLocalUri = this.requestAttachment.getParsedLocalUri();
            String str = "RequestActivity";
            if (list.size() <= 0 || AttachmentUploadService.this.isUploadFinished()) {
                Logger.m31614d(str, "Unable to resolve attachment: %s", parsedLocalUri);
                AttachmentUploadService.this.errorUpload(this.requestAttachment);
                return;
            }
            Logger.m31614d(str, "Successfully resolved attachment: %s", parsedLocalUri);
            StateRequestAttachment access$200 = AttachmentUploadService.this.updateRequestAttachment(this.requestAttachment, (MediaResult) list.get(0));
            AttachmentUploadService.this.uploadProvider.uploadAttachment(access$200.getName(), access$200.getLocalFile(), access$200.getMimeType(), new AttachmentsCallback(access$200));
        }
    }

    @SuppressLint({"UseSparseArrays"})
    AttachmentUploadService(UploadProvider uploadProvider2, C13489a aVar, List<StateRequestAttachment> list) {
        this.uploadProvider = uploadProvider2;
        this.belvedere = aVar;
        this.itemsForUpload = list;
        this.resolveCallbacks = new ArrayList(list.size());
        this.subDirectory = UtilsAttachment.getTemporaryRequestCacheDir();
        this.processedItems = new ArrayList(list.size());
        this.errorItems = new ArrayList(list.size());
        this.localToRemoteMap = new HashMap();
    }

    /* access modifiers changed from: private */
    public void errorUpload(StateRequestAttachment stateRequestAttachment) {
        synchronized (this.lock) {
            this.errorItems.add(stateRequestAttachment);
        }
        notifyIfFinished();
    }

    /* access modifiers changed from: private */
    public boolean isUploadFinished() {
        boolean z;
        synchronized (this.lock) {
            boolean b = C12010a.m31639b((Collection<Type>) this.errorItems);
            z = true;
            boolean z2 = this.processedItems.size() == this.itemsForUpload.size();
            if (!b) {
                if (!z2) {
                    z = false;
                }
            }
        }
        return z;
    }

    private void notifyIfFinished() {
        Logger.m31608a("RequestActivity", "Notify if finished. Listener: %s, isUploadFinished: %s", this.resultListener, Boolean.valueOf(isUploadFinished()));
        if (isUploadFinished() && this.resultListener != null) {
            if (C12010a.m31635a((Collection<Type>) this.errorItems)) {
                this.resultListener.onSuccess(new AttachmentUploadResult(C12010a.m31632a(this.processedItems), this.localToRemoteMap));
            } else {
                this.resultListener.onError(new C12004a("Error uploading attachments."));
            }
            this.resultListener = null;
        }
    }

    private MediaResult renameFile(File file, long j) {
        MediaResult a = this.belvedere.mo38864a(UtilsAttachment.getAttachmentSubDir(this.subDirectory, j), file.getName());
        Logger.m31608a("RequestActivity", "Rename local file: %s -> %s", file.getAbsolutePath(), a.mo38840a().getAbsolutePath());
        if (file.renameTo(a.mo38840a())) {
            return a;
        }
        return null;
    }

    /* access modifiers changed from: private */
    public StateRequestAttachment updateRequestAttachment(StateRequestAttachment stateRequestAttachment, MediaResult mediaResult) {
        Builder newBuilder = stateRequestAttachment.newBuilder();
        newBuilder.setLocalFile(mediaResult.mo38840a());
        newBuilder.setName(mediaResult.mo38844d());
        newBuilder.setMimeType(mediaResult.mo38842c());
        newBuilder.setLocalUri(mediaResult.mo38849g().toString());
        return newBuilder.build();
    }

    private void uploadAttachment(StateRequestAttachment stateRequestAttachment) {
        Uri parsedLocalUri = stateRequestAttachment.getParsedLocalUri();
        if (parsedLocalUri == null || isUploadFinished()) {
            Logger.m31614d("RequestActivity", "Unable to parse uri, skipping. | %s", stateRequestAttachment.getLocalUri());
            errorUpload(stateRequestAttachment);
            return;
        }
        ResolveCallback resolveCallback = new ResolveCallback(stateRequestAttachment);
        this.resolveCallbacks.add(resolveCallback);
        this.belvedere.mo38867a(Collections.singletonList(parsedLocalUri), this.subDirectory, resolveCallback);
    }

    /* access modifiers changed from: private */
    public void uploadSuccess(StateRequestAttachment stateRequestAttachment, UploadResponse uploadResponse) {
        String str;
        File file;
        Attachment attachment = uploadResponse.getAttachment();
        MediaResult renameFile = renameFile(stateRequestAttachment.getLocalFile(), attachment.getId().longValue());
        if (renameFile != null) {
            str = renameFile.mo38849g().toString();
            file = renameFile.mo38840a();
        } else {
            str = stateRequestAttachment.getLocalUri();
            file = stateRequestAttachment.getLocalFile();
        }
        Builder newBuilder = stateRequestAttachment.newBuilder();
        newBuilder.setLocalUri(str);
        newBuilder.setLocalFile(file);
        newBuilder.setToken(uploadResponse.getToken());
        newBuilder.setUrl(attachment.getContentUrl());
        newBuilder.setMimeType(attachment.getContentType());
        newBuilder.setName(attachment.getFileName());
        StateRequestAttachment build = newBuilder.build();
        synchronized (this.lock) {
            this.processedItems.add(build);
        }
        notifyIfFinished();
    }

    /* access modifiers changed from: 0000 */
    public void setResultListener(C12008e<AttachmentUploadResult> eVar) {
        this.resultListener = eVar;
        notifyIfFinished();
    }

    /* access modifiers changed from: 0000 */
    public void start(String str) {
        if (C12017g.m31658b(str)) {
            this.subDirectory = UtilsAttachment.getCacheDirForRequestId(str);
        }
        Logger.m31608a("RequestActivity", "Start uploading attachments", new Object[0]);
        for (StateRequestAttachment uploadAttachment : this.itemsForUpload) {
            uploadAttachment(uploadAttachment);
        }
    }
}
