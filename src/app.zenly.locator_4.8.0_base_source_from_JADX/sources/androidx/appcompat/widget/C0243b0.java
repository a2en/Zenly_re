package androidx.appcompat.widget;

import android.os.Build.VERSION;
import android.view.View;

/* renamed from: androidx.appcompat.widget.b0 */
public class C0243b0 {
    /* renamed from: a */
    public static void m933a(View view, CharSequence charSequence) {
        if (VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
        } else {
            C0245c0.m945a(view, charSequence);
        }
    }
}
