package app.zenly.locator.cards;

import android.app.Activity;
import app.zenly.locator.R;
import com.snapchat.kit.sdk.SnapCreative;
import com.snapchat.kit.sdk.creative.exceptions.SnapMediaSizeException;
import com.snapchat.kit.sdk.creative.models.SnapContent;
import com.snapchat.kit.sdk.creative.models.SnapPhotoContent;
import com.snapchat.kit.sdk.creative.models.SnapVideoContent;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p264a.p272j.C7709b;
import p387h.p388a.C12143a;

/* renamed from: app.zenly.locator.cards.i */
public final class C1813i implements ISnapchatSharingVariant {

    /* renamed from: a */
    private static final boolean f6013a = f6013a;

    /* renamed from: b */
    public static final C1813i f6014b = new C1813i();

    private C1813i() {
    }

    public boolean isAvailable() {
        return f6013a;
    }

    public void share(Activity activity, C1808g gVar) {
        C12932j.m33818b(activity, "activity");
        C12932j.m33818b(gVar, "sharingInfo");
        SnapContent snapContent = null;
        try {
            C1801d c = gVar.mo7464c();
            if (c != null) {
                snapContent = new SnapVideoContent(SnapCreative.getMediaFactory(activity).getSnapVideoFromFile(c.mo7400a()));
            } else {
                C1801d a = gVar.mo7459a();
                if (a != null) {
                    snapContent = new SnapPhotoContent(SnapCreative.getMediaFactory(activity).getSnapPhotoFromFile(a.mo7400a()));
                }
            }
            if (snapContent != null) {
                snapContent.setCaptionText(C7709b.m18762a(activity, R.string.socialMedia_tagline));
                snapContent.setAttachmentUrl(gVar.mo7462b());
                SnapCreative.getApi(activity).send(snapContent);
            }
        } catch (SnapMediaSizeException e) {
            C12143a.m32032b(e, "Unable to share to Snap", new Object[0]);
        }
    }
}
