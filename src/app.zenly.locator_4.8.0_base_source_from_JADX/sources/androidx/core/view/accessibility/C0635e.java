package androidx.core.view.accessibility;

import android.os.Build.VERSION;
import android.view.View;
import android.view.accessibility.AccessibilityRecord;

/* renamed from: androidx.core.view.accessibility.e */
public class C0635e {
    /* renamed from: a */
    public static void m2989a(AccessibilityRecord accessibilityRecord, View view, int i) {
        if (VERSION.SDK_INT >= 16) {
            accessibilityRecord.setSource(view, i);
        }
    }

    /* renamed from: b */
    public static void m2990b(AccessibilityRecord accessibilityRecord, int i) {
        if (VERSION.SDK_INT >= 15) {
            accessibilityRecord.setMaxScrollY(i);
        }
    }

    /* renamed from: a */
    public static void m2988a(AccessibilityRecord accessibilityRecord, int i) {
        if (VERSION.SDK_INT >= 15) {
            accessibilityRecord.setMaxScrollX(i);
        }
    }
}
