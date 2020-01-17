package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: androidx.cardview.widget.f */
class C0319f extends Drawable {

    /* renamed from: a */
    private float f1368a;

    /* renamed from: b */
    private final Paint f1369b;

    /* renamed from: c */
    private final RectF f1370c;

    /* renamed from: d */
    private final Rect f1371d;

    /* renamed from: e */
    private float f1372e;

    /* renamed from: f */
    private boolean f1373f = false;

    /* renamed from: g */
    private boolean f1374g = true;

    /* renamed from: h */
    private ColorStateList f1375h;

    /* renamed from: i */
    private PorterDuffColorFilter f1376i;

    /* renamed from: j */
    private ColorStateList f1377j;

    /* renamed from: k */
    private Mode f1378k = Mode.SRC_IN;

    C0319f(ColorStateList colorStateList, float f) {
        this.f1368a = f;
        this.f1369b = new Paint(5);
        m1317b(colorStateList);
        this.f1370c = new RectF();
        this.f1371d = new Rect();
    }

    /* renamed from: b */
    private void m1317b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f1375h = colorStateList;
        this.f1369b.setColor(this.f1375h.getColorForState(getState(), this.f1375h.getDefaultColor()));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2204a(float f, boolean z, boolean z2) {
        if (f != this.f1372e || this.f1373f != z || this.f1374g != z2) {
            this.f1372e = f;
            this.f1373f = z;
            this.f1374g = z2;
            m1316a((Rect) null);
            invalidateSelf();
        }
    }

    /* renamed from: c */
    public float mo2207c() {
        return this.f1368a;
    }

    public void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.f1369b;
        if (this.f1376i == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f1376i);
            z = true;
        }
        RectF rectF = this.f1370c;
        float f = this.f1368a;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f1371d, this.f1368a);
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.f1377j;
        if (colorStateList == null || !colorStateList.isStateful()) {
            ColorStateList colorStateList2 = this.f1375h;
            if ((colorStateList2 == null || !colorStateList2.isStateful()) && !super.isStateful()) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m1316a(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.f1375h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z = colorForState != this.f1369b.getColor();
        if (z) {
            this.f1369b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f1377j;
        if (colorStateList2 != null) {
            Mode mode = this.f1378k;
            if (mode != null) {
                this.f1376i = m1315a(colorStateList2, mode);
                return true;
            }
        }
        return z;
    }

    public void setAlpha(int i) {
        this.f1369b.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f1369b.setColorFilter(colorFilter);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f1377j = colorStateList;
        this.f1376i = m1315a(this.f1377j, this.f1378k);
        invalidateSelf();
    }

    public void setTintMode(Mode mode) {
        this.f1378k = mode;
        this.f1376i = m1315a(this.f1377j, this.f1378k);
        invalidateSelf();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public float mo2206b() {
        return this.f1372e;
    }

    /* renamed from: a */
    private void m1316a(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f1370c.set((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
        this.f1371d.set(rect);
        if (this.f1373f) {
            float b = C0320g.m1327b(this.f1372e, this.f1368a, this.f1374g);
            this.f1371d.inset((int) Math.ceil((double) C0320g.m1324a(this.f1372e, this.f1368a, this.f1374g)), (int) Math.ceil((double) b));
            this.f1370c.set(this.f1371d);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2203a(float f) {
        if (f != this.f1368a) {
            this.f1368a = f;
            m1316a((Rect) null);
            invalidateSelf();
        }
    }

    /* renamed from: a */
    public void mo2205a(ColorStateList colorStateList) {
        m1317b(colorStateList);
        invalidateSelf();
    }

    /* renamed from: a */
    public ColorStateList mo2202a() {
        return this.f1375h;
    }

    /* renamed from: a */
    private PorterDuffColorFilter m1315a(ColorStateList colorStateList, Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }
}
