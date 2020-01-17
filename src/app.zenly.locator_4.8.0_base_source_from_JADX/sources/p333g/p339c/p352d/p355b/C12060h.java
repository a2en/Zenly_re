package p333g.p339c.p352d.p355b;

import android.graphics.Bitmap;
import com.facebook.common.references.ResourceReleaser;

/* renamed from: g.c.d.b.h */
public class C12060h implements ResourceReleaser<Bitmap> {

    /* renamed from: a */
    private static C12060h f31453a;

    private C12060h() {
    }

    /* renamed from: a */
    public static C12060h m31854a() {
        if (f31453a == null) {
            f31453a = new C12060h();
        }
        return f31453a;
    }

    /* renamed from: a */
    public void release(Bitmap bitmap) {
        bitmap.recycle();
    }
}
