package androidx.media;

import android.os.Bundle;

/* renamed from: androidx.media.d */
public class C0936d {
    /* renamed from: a */
    public static boolean m4197a(Bundle bundle, Bundle bundle2) {
        boolean z = true;
        if (bundle == bundle2) {
            return true;
        }
        String str = "android.media.browse.extra.PAGE_SIZE";
        String str2 = "android.media.browse.extra.PAGE";
        if (bundle == null) {
            if (!(bundle2.getInt(str2, -1) == -1 && bundle2.getInt(str, -1) == -1)) {
                z = false;
            }
            return z;
        } else if (bundle2 == null) {
            if (!(bundle.getInt(str2, -1) == -1 && bundle.getInt(str, -1) == -1)) {
                z = false;
            }
            return z;
        } else {
            if (!(bundle.getInt(str2, -1) == bundle2.getInt(str2, -1) && bundle.getInt(str, -1) == bundle2.getInt(str, -1))) {
                z = false;
            }
            return z;
        }
    }
}
