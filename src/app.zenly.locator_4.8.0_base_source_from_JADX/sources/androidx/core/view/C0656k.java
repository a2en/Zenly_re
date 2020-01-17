package androidx.core.view;

import android.os.Build.VERSION;
import android.view.ViewGroup;
import p214e.p234h.C7612c;

/* renamed from: androidx.core.view.k */
public final class C0656k {
    /* renamed from: a */
    public static boolean m3057a(ViewGroup viewGroup) {
        if (VERSION.SDK_INT >= 21) {
            return viewGroup.isTransitionGroup();
        }
        Boolean bool = (Boolean) viewGroup.getTag(C7612c.tag_transition_group);
        return ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && ViewCompat.m2867t(viewGroup) == null) ? false : true;
    }
}
