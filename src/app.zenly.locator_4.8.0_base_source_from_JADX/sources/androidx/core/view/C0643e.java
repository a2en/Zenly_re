package androidx.core.view;

import android.os.Build.VERSION;
import android.view.ViewGroup.MarginLayoutParams;

/* renamed from: androidx.core.view.e */
public final class C0643e {
    /* renamed from: a */
    public static int m3006a(MarginLayoutParams marginLayoutParams) {
        if (VERSION.SDK_INT >= 17) {
            return marginLayoutParams.getMarginEnd();
        }
        return marginLayoutParams.rightMargin;
    }

    /* renamed from: b */
    public static int m3007b(MarginLayoutParams marginLayoutParams) {
        if (VERSION.SDK_INT >= 17) {
            return marginLayoutParams.getMarginStart();
        }
        return marginLayoutParams.leftMargin;
    }
}
