package zendesk.support.request;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import com.zendesk.util.C12010a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p333g.p384h.p385a.C12132b;
import zendesk.belvedere.BelvedereUi;
import zendesk.belvedere.BelvedereUi.C13467b;
import zendesk.belvedere.MediaResult;

class AttachmentHelper {
    private List<StateRequestAttachment> additionalAttachments;
    private long maxFileSize = -1;
    private List<StateRequestAttachment> selectedAttachments;
    private final int[] touchableItems;

    AttachmentHelper(int... iArr) {
        this.touchableItems = iArr;
        this.selectedAttachments = new ArrayList();
        this.additionalAttachments = new ArrayList();
    }

    private List<MediaResult> requestAttachmentsToMediaResult(List<StateRequestAttachment> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (StateRequestAttachment convert : list) {
            arrayList.add(StateRequestAttachment.convert(convert));
        }
        return arrayList;
    }

    /* access modifiers changed from: 0000 */
    public List<StateRequestAttachment> getSelectedAttachments() {
        return C12010a.m31632a(this.selectedAttachments);
    }

    /* access modifiers changed from: 0000 */
    public void showImagePicker(AppCompatActivity appCompatActivity) {
        C13467b a = BelvedereUi.m35620a((Context) appCompatActivity);
        a.mo38745a();
        a.mo38747a("*/*", true);
        a.mo38752b(requestAttachmentsToMediaResult(this.selectedAttachments));
        a.mo38749a(appCompatActivity.getResources().getBoolean(C12132b.zs_request_image_picker_full_screen));
        a.mo38748a(requestAttachmentsToMediaResult(this.additionalAttachments));
        int[] iArr = this.touchableItems;
        if (iArr != null && iArr.length > 0) {
            a.mo38750a(iArr);
        }
        long j = this.maxFileSize;
        if (j > 0) {
            a.mo38746a(j);
        }
        a.mo38751a(appCompatActivity);
    }

    /* access modifiers changed from: 0000 */
    public void updateAttachments(Collection<StateRequestAttachment> collection, Collection<StateRequestAttachment> collection2) {
        this.selectedAttachments = C12010a.m31632a((List<Type>) new ArrayList<Type>(collection));
        this.additionalAttachments = C12010a.m31632a((List<Type>) new ArrayList<Type>(collection2));
    }

    /* access modifiers changed from: 0000 */
    public void updateMaxFileSize(long j) {
        this.maxFileSize = j;
    }
}
