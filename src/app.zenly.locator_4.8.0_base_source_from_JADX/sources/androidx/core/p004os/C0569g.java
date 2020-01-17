package androidx.core.p004os;

import android.os.Build.VERSION;
import android.os.Trace;

/* renamed from: androidx.core.os.g */
public final class C0569g {
    /* renamed from: a */
    public static void m2680a(String str) {
        if (VERSION.SDK_INT >= 18) {
            Trace.beginSection(str);
        }
    }

    /* renamed from: a */
    public static void m2679a() {
        if (VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }
}
