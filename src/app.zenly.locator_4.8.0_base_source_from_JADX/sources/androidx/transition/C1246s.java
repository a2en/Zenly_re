package androidx.transition;

import android.os.Build.VERSION;
import android.view.ViewGroup;

/* renamed from: androidx.transition.s */
class C1246s {
    /* renamed from: a */
    static C1245r m5989a(ViewGroup viewGroup) {
        if (VERSION.SDK_INT >= 18) {
            return new C1244q(viewGroup);
        }
        return C1243p.m5980a(viewGroup);
    }

    /* renamed from: a */
    static void m5990a(ViewGroup viewGroup, boolean z) {
        if (VERSION.SDK_INT >= 18) {
            C1249u.m5994a(viewGroup, z);
        } else {
            C1247t.m5992a(viewGroup, z);
        }
    }
}
