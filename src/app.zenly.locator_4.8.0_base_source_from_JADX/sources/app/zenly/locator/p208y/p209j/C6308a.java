package app.zenly.locator.p208y.p209j;

import android.content.res.TypedArray;
import android.widget.TextView;
import androidx.core.widget.C0680h;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p279d.C7770f;

/* renamed from: app.zenly.locator.y.j.a */
public final class C6308a {

    /* renamed from: a */
    private static final int[] f15829a = {16842964, 16842904};

    /* renamed from: a */
    public static final void m17375a(TextView textView, int i) {
        C12932j.m33818b(textView, "$this$setImportance");
        int i2 = C7770f.Button_Large_Primary;
        if (i != 0 && i == 1) {
            i2 = C7770f.Button_Large_Tertiary;
        }
        TypedArray obtainStyledAttributes = textView.getContext().obtainStyledAttributes(i2, f15829a);
        textView.setBackground(obtainStyledAttributes.getDrawable(0));
        textView.setTextColor(obtainStyledAttributes.getColor(1, -16777216));
        obtainStyledAttributes.recycle();
        C0680h.m3189d(textView, i2);
    }
}
