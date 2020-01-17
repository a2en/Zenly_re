package androidx.core.view;

import android.view.MotionEvent;

/* renamed from: androidx.core.view.f */
public final class C0644f {
    /* renamed from: a */
    public static boolean m3008a(MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }
}
