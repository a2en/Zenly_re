package p250f.p251a.p252a.p253a.p260i.p261f;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.core.content.C0540a;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p253a.p256f.p257a.C7674a;

/* renamed from: f.a.a.a.i.f.a */
public final class C7690a extends CharacterStyle implements UpdateAppearance {

    /* renamed from: e */
    private final ColorStateList f19316e;

    /* renamed from: f */
    private final ColorStateList f19317f;

    public C7690a(Context context, int i) {
        this(context, i, 0, 4, null);
    }

    public /* synthetic */ C7690a(ColorStateList colorStateList, ColorStateList colorStateList2, int i, C12928f fVar) {
        if ((i & 2) != 0) {
            colorStateList2 = null;
        }
        this(colorStateList, colorStateList2);
    }

    public void updateDrawState(TextPaint textPaint) {
        C12932j.m33818b(textPaint, "ds");
        textPaint.setColor(this.f19316e.getColorForState(textPaint.drawableState, 0));
        ColorStateList colorStateList = this.f19317f;
        if (colorStateList != null) {
            textPaint.linkColor = colorStateList.getColorForState(textPaint.drawableState, 0);
        }
    }

    public C7690a(ColorStateList colorStateList, ColorStateList colorStateList2) {
        C12932j.m33818b(colorStateList, "textColor");
        this.f19316e = colorStateList;
        this.f19317f = colorStateList2;
    }

    public /* synthetic */ C7690a(Context context, int i, int i2, int i3, C12928f fVar) {
        if ((i3 & 4) != 0) {
            i2 = C7674a.f19294a;
        }
        this(context, i, i2);
    }

    public C7690a(Context context, int i, int i2) {
        C12932j.m33818b(context, "context");
        ColorStateList b = C0540a.m2543b(context, i);
        ColorStateList colorStateList = null;
        if (b != null) {
            C12932j.m33815a((Object) b, "ContextCompat.getColorSt…t(context, textColorId)!!");
            if (C7674a.m18692a(i2)) {
                colorStateList = C0540a.m2543b(context, i2);
            }
            this(b, colorStateList);
            return;
        }
        C12932j.m33814a();
        throw null;
    }
}
