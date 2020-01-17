package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: androidx.cardview.widget.c */
class C0315c implements C0318e {

    /* renamed from: a */
    final RectF f1366a = new RectF();

    /* renamed from: androidx.cardview.widget.c$a */
    class C0316a implements C0321a {
        C0316a() {
        }

        /* renamed from: a */
        public void mo2186a(Canvas canvas, RectF rectF, float f, Paint paint) {
            Canvas canvas2 = canvas;
            RectF rectF2 = rectF;
            float f2 = 2.0f * f;
            float width = (rectF.width() - f2) - 1.0f;
            float height = (rectF.height() - f2) - 1.0f;
            if (f >= 1.0f) {
                float f3 = f + 0.5f;
                float f4 = -f3;
                C0315c.this.f1366a.set(f4, f4, f3, f3);
                int save = canvas.save();
                canvas2.translate(rectF2.left + f3, rectF2.top + f3);
                Paint paint2 = paint;
                canvas.drawArc(C0315c.this.f1366a, 180.0f, 90.0f, true, paint2);
                canvas2.translate(width, 0.0f);
                canvas2.rotate(90.0f);
                canvas.drawArc(C0315c.this.f1366a, 180.0f, 90.0f, true, paint2);
                canvas2.translate(height, 0.0f);
                canvas2.rotate(90.0f);
                canvas.drawArc(C0315c.this.f1366a, 180.0f, 90.0f, true, paint2);
                canvas2.translate(width, 0.0f);
                canvas2.rotate(90.0f);
                canvas.drawArc(C0315c.this.f1366a, 180.0f, 90.0f, true, paint2);
                canvas2.restoreToCount(save);
                float f5 = (rectF2.left + f3) - 1.0f;
                float f6 = rectF2.top;
                canvas.drawRect(f5, f6, (rectF2.right - f3) + 1.0f, f6 + f3, paint2);
                float f7 = (rectF2.left + f3) - 1.0f;
                float f8 = rectF2.bottom;
                canvas.drawRect(f7, f8 - f3, (rectF2.right - f3) + 1.0f, f8, paint2);
            }
            canvas.drawRect(rectF2.left, rectF2.top + f, rectF2.right, rectF2.bottom - f, paint);
        }
    }

    C0315c() {
    }

    /* renamed from: j */
    private C0320g m1278j(C0317d dVar) {
        return (C0320g) dVar.mo2181b();
    }

    /* renamed from: a */
    public void mo2185a() {
        C0320g.f1380r = new C0316a();
    }

    /* renamed from: b */
    public void mo2192b(C0317d dVar, float f) {
        m1278j(dVar).mo2226c(f);
    }

    /* renamed from: c */
    public ColorStateList mo2193c(C0317d dVar) {
        return m1278j(dVar).mo2218a();
    }

    /* renamed from: d */
    public float mo2195d(C0317d dVar) {
        return m1278j(dVar).mo2227d();
    }

    /* renamed from: e */
    public void mo2196e(C0317d dVar) {
        m1278j(dVar).mo2222a(dVar.mo2182c());
        mo2201i(dVar);
    }

    /* renamed from: f */
    public float mo2197f(C0317d dVar) {
        return m1278j(dVar).mo2230f();
    }

    /* renamed from: g */
    public void mo2198g(C0317d dVar) {
    }

    /* renamed from: h */
    public float mo2199h(C0317d dVar) {
        return m1278j(dVar).mo2229e();
    }

    /* renamed from: i */
    public void mo2201i(C0317d dVar) {
        Rect rect = new Rect();
        m1278j(dVar).mo2221a(rect);
        dVar.mo2178a((int) Math.ceil((double) mo2199h(dVar)), (int) Math.ceil((double) mo2195d(dVar)));
        dVar.setShadowPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: a */
    public void mo2189a(C0317d dVar, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        C0320g a = m1277a(context, colorStateList, f, f2, f3);
        a.mo2222a(dVar.mo2182c());
        dVar.mo2179a(a);
        mo2201i(dVar);
    }

    /* renamed from: b */
    public float mo2191b(C0317d dVar) {
        return m1278j(dVar).mo2225c();
    }

    /* renamed from: c */
    public void mo2194c(C0317d dVar, float f) {
        m1278j(dVar).mo2224b(f);
        mo2201i(dVar);
    }

    /* renamed from: a */
    private C0320g m1277a(Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        C0320g gVar = new C0320g(context.getResources(), colorStateList, f, f2, f3);
        return gVar;
    }

    /* renamed from: a */
    public void mo2190a(C0317d dVar, ColorStateList colorStateList) {
        m1278j(dVar).mo2220a(colorStateList);
    }

    /* renamed from: a */
    public void mo2188a(C0317d dVar, float f) {
        m1278j(dVar).mo2219a(f);
        mo2201i(dVar);
    }

    /* renamed from: a */
    public float mo2187a(C0317d dVar) {
        return m1278j(dVar).mo2223b();
    }
}
