package app.zenly.android.feature.polenta.widget;

import android.content.res.TypedArray;
import android.widget.TextView;
import androidx.core.widget.C0680h;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p279d.C7771g;

/* renamed from: app.zenly.android.feature.polenta.widget.b */
public final class C1448b {
    /* renamed from: a */
    public static final void m6544a(TextView textView, int i) {
        C12932j.m33818b(textView, "$this$applyStyle");
        TypedArray obtainStyledAttributes = textView.getContext().obtainStyledAttributes(i, C7771g.TextViewStyleable);
        textView.setBackground(obtainStyledAttributes.getDrawable(C7771g.TextViewStyleable_android_background));
        textView.setTextColor(obtainStyledAttributes.getColorStateList(C7771g.TextViewStyleable_android_textColor));
        C0680h.m3178a(textView, obtainStyledAttributes.getColorStateList(C7771g.TextViewStyleable_drawableTint));
        obtainStyledAttributes.recycle();
    }
}
