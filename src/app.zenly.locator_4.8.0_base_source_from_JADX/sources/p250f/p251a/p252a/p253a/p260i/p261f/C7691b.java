package p250f.p251a.p252a.p253a.p260i.p261f;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p253a.p256f.p257a.C7675b;

/* renamed from: f.a.a.a.i.f.b */
public final class C7691b extends MetricAffectingSpan {

    /* renamed from: e */
    private final C7675b f19318e;

    public C7691b(Context context, int i) {
        C12932j.m33818b(context, "context");
        this.f19318e = new C7675b(context, i);
    }

    /* renamed from: a */
    public final C7675b mo19905a() {
        return this.f19318e;
    }

    public void updateDrawState(TextPaint textPaint) {
        C12932j.m33818b(textPaint, "ds");
        updateMeasureState(textPaint);
        if (this.f19318e.mo19819e() != null) {
            textPaint.setColor(this.f19318e.mo19819e().getColorForState(textPaint.drawableState, 0));
        }
        if (this.f19318e.mo19820f() != null) {
            textPaint.linkColor = this.f19318e.mo19820f().getColorForState(textPaint.drawableState, 0);
        }
    }

    public void updateMeasureState(TextPaint textPaint) {
        C12932j.m33818b(textPaint, "ds");
        textPaint.setTypeface(this.f19318e.mo19815a());
        if (this.f19318e.mo19821g() > ((float) 0)) {
            textPaint.setTextSize(this.f19318e.mo19821g());
        }
    }
}
