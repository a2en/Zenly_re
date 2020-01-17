package androidx.emoji.text;

import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.text.style.ReplacementSpan;
import androidx.core.util.C0607i;

/* renamed from: androidx.emoji.text.c */
public abstract class C0745c extends ReplacementSpan {

    /* renamed from: e */
    private final FontMetricsInt f3084e = new FontMetricsInt();

    /* renamed from: f */
    private final C0740a f3085f;

    /* renamed from: g */
    private short f3086g = -1;

    /* renamed from: h */
    private float f3087h = 1.0f;

    C0745c(C0740a aVar) {
        C0607i.m2774a(aVar, (Object) "metadata cannot be null");
        this.f3085f = aVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C0740a mo3728a() {
        return this.f3085f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final int mo3729b() {
        return this.f3086g;
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f3084e);
        FontMetricsInt fontMetricsInt2 = this.f3084e;
        this.f3087h = (((float) Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent)) * 1.0f) / ((float) this.f3085f.mo3715c());
        this.f3085f.mo3715c();
        this.f3086g = (short) ((int) (((float) this.f3085f.mo3718f()) * this.f3087h));
        if (fontMetricsInt != null) {
            FontMetricsInt fontMetricsInt3 = this.f3084e;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return this.f3086g;
    }
}
