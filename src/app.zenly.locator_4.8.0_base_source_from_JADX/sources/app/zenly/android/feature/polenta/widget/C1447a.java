package app.zenly.android.feature.polenta.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.widget.ImageButton;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p279d.C7771g;

/* renamed from: app.zenly.android.feature.polenta.widget.a */
public final class C1447a {
    /* renamed from: a */
    public static /* synthetic */ void m6543a(ImageButton imageButton, int i, Context context, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            context = imageButton.getContext();
            C12932j.m33815a((Object) context, "this.context");
        }
        m6542a(imageButton, i, context);
    }

    /* renamed from: a */
    public static final void m6542a(ImageButton imageButton, int i, Context context) {
        C12932j.m33818b(imageButton, "$this$applyStyle");
        C12932j.m33818b(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C7771g.ImageButtonStyleable);
        imageButton.setBackground(obtainStyledAttributes.getDrawable(C7771g.ImageButtonStyleable_android_background));
        imageButton.setImageTintList(obtainStyledAttributes.getColorStateList(C7771g.ImageButtonStyleable_android_tint));
        obtainStyledAttributes.recycle();
    }
}
