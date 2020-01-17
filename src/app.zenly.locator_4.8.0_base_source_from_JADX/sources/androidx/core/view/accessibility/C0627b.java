package androidx.core.view.accessibility;

import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: androidx.core.view.accessibility.b */
public final class C0627b {
    /* renamed from: a */
    public static void m2910a(AccessibilityEvent accessibilityEvent, int i) {
        if (VERSION.SDK_INT >= 19) {
            accessibilityEvent.setContentChangeTypes(i);
        }
    }

    /* renamed from: a */
    public static int m2909a(AccessibilityEvent accessibilityEvent) {
        if (VERSION.SDK_INT >= 19) {
            return accessibilityEvent.getContentChangeTypes();
        }
        return 0;
    }
}
