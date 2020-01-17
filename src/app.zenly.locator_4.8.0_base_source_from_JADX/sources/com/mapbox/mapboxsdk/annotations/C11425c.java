package com.mapbox.mapboxsdk.annotations;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

@Deprecated
/* renamed from: com.mapbox.mapboxsdk.annotations.c */
class C11425c extends Drawable {

    /* renamed from: a */
    private RectF f29562a;

    /* renamed from: b */
    private float f29563b;

    /* renamed from: c */
    private float f29564c;

    /* renamed from: d */
    private float f29565d;

    /* renamed from: e */
    private float f29566e;

    /* renamed from: f */
    private Paint f29567f = new Paint(1);

    /* renamed from: g */
    private float f29568g;

    /* renamed from: h */
    private Paint f29569h;

    /* renamed from: i */
    private Path f29570i;

    /* renamed from: j */
    private Path f29571j = new Path();

    C11425c(RectF rectF, C11424b bVar, float f, float f2, float f3, float f4, int i, float f5, int i2) {
        this.f29562a = rectF;
        this.f29563b = f;
        this.f29564c = f2;
        this.f29565d = f3;
        this.f29566e = f4;
        this.f29567f.setColor(i);
        this.f29568g = f5;
        if (f5 > 0.0f) {
            this.f29569h = new Paint(1);
            this.f29569h.setColor(i2);
            this.f29570i = new Path();
            m29470a(bVar, this.f29571j, f5);
            m29470a(bVar, this.f29570i, 0.0f);
            return;
        }
        m29470a(bVar, this.f29571j, 0.0f);
    }

    /* renamed from: a */
    private void m29470a(C11424b bVar, Path path, float f) {
        int a = bVar.mo33261a();
        if (a == 0) {
            float f2 = this.f29566e;
            if (f2 <= 0.0f) {
                m29473d(this.f29562a, path, f);
            } else if (f <= 0.0f || f <= f2) {
                m29472c(this.f29562a, path, f);
            } else {
                m29473d(this.f29562a, path, f);
            }
        } else if (a == 1) {
            float f3 = this.f29566e;
            if (f3 <= 0.0f) {
                m29475f(this.f29562a, path, f);
            } else if (f <= 0.0f || f <= f3) {
                m29474e(this.f29562a, path, f);
            } else {
                m29475f(this.f29562a, path, f);
            }
        } else if (a == 2) {
            float f4 = this.f29566e;
            if (f4 <= 0.0f) {
                m29477h(this.f29562a, path, f);
            } else if (f <= 0.0f || f <= f4) {
                m29476g(this.f29562a, path, f);
            } else {
                m29477h(this.f29562a, path, f);
            }
        } else if (a == 3) {
            float f5 = this.f29566e;
            if (f5 <= 0.0f) {
                m29471b(this.f29562a, path, f);
            } else if (f <= 0.0f || f <= f5) {
                m29469a(this.f29562a, path, f);
            } else {
                m29471b(this.f29562a, path, f);
            }
        }
    }

    /* renamed from: b */
    private void m29471b(RectF rectF, Path path, float f) {
        path.moveTo(rectF.left + f, rectF.top + f);
        path.lineTo(rectF.right - f, rectF.top + f);
        path.lineTo(rectF.right - f, (rectF.bottom - this.f29564c) - f);
        float f2 = f / 2.0f;
        path.lineTo(((rectF.left + this.f29563b) + this.f29565d) - f2, (rectF.bottom - this.f29564c) - f);
        path.lineTo(rectF.left + this.f29565d + (this.f29563b / 2.0f), (rectF.bottom - f) - f);
        path.lineTo(rectF.left + this.f29565d + f2, (rectF.bottom - this.f29564c) - f);
        path.lineTo(rectF.left + this.f29565d + f, (rectF.bottom - this.f29564c) - f);
        path.lineTo(rectF.left + f, (rectF.bottom - this.f29564c) - f);
        path.lineTo(rectF.left + f, rectF.top + f);
        path.close();
    }

    /* renamed from: c */
    private void m29472c(RectF rectF, Path path, float f) {
        path.moveTo(this.f29563b + rectF.left + this.f29566e + f, rectF.top + f);
        path.lineTo((rectF.width() - this.f29566e) - f, rectF.top + f);
        float f2 = rectF.right;
        float f3 = this.f29566e;
        float f4 = f2 - f3;
        float f5 = rectF.top;
        path.arcTo(new RectF(f4, f5 + f, f2 - f, f3 + f5), 270.0f, 90.0f);
        path.lineTo(rectF.right - f, (rectF.bottom - this.f29566e) - f);
        float f6 = rectF.right;
        float f7 = this.f29566e;
        float f8 = f6 - f7;
        float f9 = rectF.bottom;
        path.arcTo(new RectF(f8, f9 - f7, f6 - f, f9 - f), 0.0f, 90.0f);
        path.lineTo(rectF.left + this.f29563b + this.f29566e + f, rectF.bottom - f);
        float f10 = rectF.left;
        float f11 = this.f29563b;
        float f12 = f10 + f11 + f;
        float f13 = rectF.bottom;
        float f14 = this.f29566e;
        path.arcTo(new RectF(f12, f13 - f14, f14 + f10 + f11, f13 - f), 90.0f, 90.0f);
        float f15 = f / 2.0f;
        path.lineTo(rectF.left + this.f29563b + f, (this.f29564c + this.f29565d) - f15);
        path.lineTo(rectF.left + f + f, this.f29565d + (this.f29564c / 2.0f));
        path.lineTo(rectF.left + this.f29563b + f, this.f29565d + f15);
        path.lineTo(rectF.left + this.f29563b + f, rectF.top + this.f29566e + f);
        float f16 = rectF.left;
        float f17 = this.f29563b;
        float f18 = f16 + f17 + f;
        float f19 = rectF.top;
        float f20 = f + f19;
        float f21 = this.f29566e;
        path.arcTo(new RectF(f18, f20, f16 + f21 + f17, f21 + f19), 180.0f, 90.0f);
        path.close();
    }

    /* renamed from: d */
    private void m29473d(RectF rectF, Path path, float f) {
        path.moveTo(this.f29563b + rectF.left + f, rectF.top + f);
        path.lineTo(rectF.width() - f, rectF.top + f);
        path.lineTo(rectF.right - f, rectF.bottom - f);
        path.lineTo(rectF.left + this.f29563b + f, rectF.bottom - f);
        float f2 = f / 2.0f;
        path.lineTo(rectF.left + this.f29563b + f, (this.f29564c + this.f29565d) - f2);
        path.lineTo(rectF.left + f + f, this.f29565d + (this.f29564c / 2.0f));
        path.lineTo(rectF.left + this.f29563b + f, this.f29565d + f2);
        path.lineTo(rectF.left + this.f29563b + f, rectF.top + f);
        path.close();
    }

    /* renamed from: e */
    private void m29474e(RectF rectF, Path path, float f) {
        path.moveTo(rectF.left + this.f29566e + f, rectF.top + f);
        path.lineTo(((rectF.width() - this.f29566e) - this.f29563b) - f, rectF.top + f);
        float f2 = rectF.right;
        float f3 = this.f29566e;
        float f4 = f2 - f3;
        float f5 = this.f29563b;
        float f6 = f4 - f5;
        float f7 = rectF.top;
        path.arcTo(new RectF(f6, f7 + f, (f2 - f5) - f, f3 + f7), 270.0f, 90.0f);
        float f8 = f / 2.0f;
        path.lineTo((rectF.right - this.f29563b) - f, this.f29565d + f8);
        path.lineTo((rectF.right - f) - f, this.f29565d + (this.f29564c / 2.0f));
        path.lineTo((rectF.right - this.f29563b) - f, (this.f29565d + this.f29564c) - f8);
        path.lineTo((rectF.right - this.f29563b) - f, (rectF.bottom - this.f29566e) - f);
        float f9 = rectF.right;
        float f10 = this.f29566e;
        float f11 = f9 - f10;
        float f12 = this.f29563b;
        float f13 = f11 - f12;
        float f14 = rectF.bottom;
        path.arcTo(new RectF(f13, f14 - f10, (f9 - f12) - f, f14 - f), 0.0f, 90.0f);
        path.lineTo(rectF.left + this.f29563b + f, rectF.bottom - f);
        float f15 = rectF.left;
        float f16 = f15 + f;
        float f17 = rectF.bottom;
        float f18 = this.f29566e;
        path.arcTo(new RectF(f16, f17 - f18, f18 + f15, f17 - f), 90.0f, 90.0f);
        float f19 = rectF.left;
        float f20 = f19 + f;
        float f21 = rectF.top;
        float f22 = f + f21;
        float f23 = this.f29566e;
        path.arcTo(new RectF(f20, f22, f19 + f23, f23 + f21), 180.0f, 90.0f);
        path.close();
    }

    /* renamed from: f */
    private void m29475f(RectF rectF, Path path, float f) {
        path.moveTo(rectF.left + f, rectF.top + f);
        path.lineTo((rectF.width() - this.f29563b) - f, rectF.top + f);
        float f2 = f / 2.0f;
        path.lineTo((rectF.right - this.f29563b) - f, this.f29565d + f2);
        path.lineTo((rectF.right - f) - f, this.f29565d + (this.f29564c / 2.0f));
        path.lineTo((rectF.right - this.f29563b) - f, (this.f29565d + this.f29564c) - f2);
        path.lineTo((rectF.right - this.f29563b) - f, rectF.bottom - f);
        path.lineTo(rectF.left + f, rectF.bottom - f);
        path.lineTo(rectF.left + f, rectF.top + f);
        path.close();
    }

    /* renamed from: g */
    private void m29476g(RectF rectF, Path path, float f) {
        path.moveTo(rectF.left + Math.min(this.f29565d, this.f29566e) + f, rectF.top + this.f29564c + f);
        float f2 = f / 2.0f;
        path.lineTo(rectF.left + this.f29565d + f2, rectF.top + this.f29564c + f);
        path.lineTo(rectF.left + (this.f29563b / 2.0f) + this.f29565d, rectF.top + f + f);
        path.lineTo(((rectF.left + this.f29563b) + this.f29565d) - f2, rectF.top + this.f29564c + f);
        path.lineTo((rectF.right - this.f29566e) - f, rectF.top + this.f29564c + f);
        float f3 = rectF.right;
        float f4 = this.f29566e;
        float f5 = f3 - f4;
        float f6 = rectF.top;
        float f7 = this.f29564c;
        path.arcTo(new RectF(f5, f6 + f7 + f, f3 - f, f4 + f6 + f7), 270.0f, 90.0f);
        path.lineTo(rectF.right - f, (rectF.bottom - this.f29566e) - f);
        float f8 = rectF.right;
        float f9 = this.f29566e;
        float f10 = f8 - f9;
        float f11 = rectF.bottom;
        path.arcTo(new RectF(f10, f11 - f9, f8 - f, f11 - f), 0.0f, 90.0f);
        path.lineTo(rectF.left + this.f29566e + f, rectF.bottom - f);
        float f12 = rectF.left;
        float f13 = f12 + f;
        float f14 = rectF.bottom;
        float f15 = this.f29566e;
        path.arcTo(new RectF(f13, f14 - f15, f15 + f12, f14 - f), 90.0f, 90.0f);
        path.lineTo(rectF.left + f, rectF.top + this.f29564c + this.f29566e + f);
        float f16 = rectF.left;
        float f17 = f16 + f;
        float f18 = rectF.top;
        float f19 = this.f29564c;
        float f20 = f18 + f19 + f;
        float f21 = this.f29566e;
        path.arcTo(new RectF(f17, f20, f16 + f21, f21 + f18 + f19), 180.0f, 90.0f);
        path.close();
    }

    /* renamed from: h */
    private void m29477h(RectF rectF, Path path, float f) {
        path.moveTo(rectF.left + this.f29565d + f, rectF.top + this.f29564c + f);
        float f2 = f / 2.0f;
        path.lineTo(rectF.left + this.f29565d + f2, rectF.top + this.f29564c + f);
        path.lineTo(rectF.left + (this.f29563b / 2.0f) + this.f29565d, rectF.top + f + f);
        path.lineTo(((rectF.left + this.f29563b) + this.f29565d) - f2, rectF.top + this.f29564c + f);
        path.lineTo(rectF.right - f, rectF.top + this.f29564c + f);
        path.lineTo(rectF.right - f, rectF.bottom - f);
        path.lineTo(rectF.left + f, rectF.bottom - f);
        path.lineTo(rectF.left + f, rectF.top + this.f29564c + f);
        path.lineTo(rectF.left + this.f29565d + f, rectF.top + this.f29564c + f);
        path.close();
    }

    public void draw(Canvas canvas) {
        if (this.f29568g > 0.0f) {
            canvas.drawPath(this.f29570i, this.f29569h);
        }
        canvas.drawPath(this.f29571j, this.f29567f);
    }

    public int getIntrinsicHeight() {
        return (int) this.f29562a.height();
    }

    public int getIntrinsicWidth() {
        return (int) this.f29562a.width();
    }

    public int getOpacity() {
        return -3;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
    }

    public void setAlpha(int i) {
        this.f29567f.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f29567f.setColorFilter(colorFilter);
    }

    /* renamed from: a */
    private void m29469a(RectF rectF, Path path, float f) {
        path.moveTo(rectF.left + this.f29566e + f, rectF.top + f);
        path.lineTo((rectF.width() - this.f29566e) - f, rectF.top + f);
        float f2 = rectF.right;
        float f3 = this.f29566e;
        float f4 = f2 - f3;
        float f5 = rectF.top;
        path.arcTo(new RectF(f4, f5 + f, f2 - f, f3 + f5), 270.0f, 90.0f);
        path.lineTo(rectF.right - f, ((rectF.bottom - this.f29564c) - this.f29566e) - f);
        float f6 = rectF.right;
        float f7 = this.f29566e;
        float f8 = f6 - f7;
        float f9 = rectF.bottom;
        float f10 = f9 - f7;
        float f11 = this.f29564c;
        path.arcTo(new RectF(f8, f10 - f11, f6 - f, (f9 - f11) - f), 0.0f, 90.0f);
        float f12 = f / 2.0f;
        path.lineTo(((rectF.left + this.f29563b) + this.f29565d) - f12, (rectF.bottom - this.f29564c) - f);
        path.lineTo(rectF.left + this.f29565d + (this.f29563b / 2.0f), (rectF.bottom - f) - f);
        path.lineTo(rectF.left + this.f29565d + f12, (rectF.bottom - this.f29564c) - f);
        path.lineTo(rectF.left + Math.min(this.f29566e, this.f29565d) + f, (rectF.bottom - this.f29564c) - f);
        float f13 = rectF.left;
        float f14 = f13 + f;
        float f15 = rectF.bottom;
        float f16 = this.f29566e;
        float f17 = f15 - f16;
        float f18 = this.f29564c;
        path.arcTo(new RectF(f14, f17 - f18, f16 + f13, (f15 - f18) - f), 90.0f, 90.0f);
        path.lineTo(rectF.left + f, rectF.top + this.f29566e + f);
        float f19 = rectF.left;
        float f20 = f19 + f;
        float f21 = rectF.top;
        float f22 = f + f21;
        float f23 = this.f29566e;
        path.arcTo(new RectF(f20, f22, f19 + f23, f23 + f21), 180.0f, 90.0f);
        path.close();
    }
}
