package com.facebook.drawee.drawable;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.facebook.common.internal.C9536j;
import java.util.Arrays;

/* renamed from: com.facebook.drawee.drawable.i */
public class C9617i extends Drawable implements Rounded {

    /* renamed from: e */
    private final float[] f24994e = new float[8];

    /* renamed from: f */
    final float[] f24995f = new float[8];

    /* renamed from: g */
    float[] f24996g;

    /* renamed from: h */
    final Paint f24997h = new Paint(1);

    /* renamed from: i */
    private boolean f24998i = false;

    /* renamed from: j */
    private float f24999j = 0.0f;

    /* renamed from: k */
    private float f25000k = 0.0f;

    /* renamed from: l */
    private int f25001l = 0;

    /* renamed from: m */
    private boolean f25002m = false;

    /* renamed from: n */
    private boolean f25003n = false;

    /* renamed from: o */
    final Path f25004o = new Path();

    /* renamed from: p */
    final Path f25005p = new Path();

    /* renamed from: q */
    private int f25006q = 0;

    /* renamed from: r */
    private final RectF f25007r = new RectF();

    /* renamed from: s */
    private int f25008s = 255;

    public C9617i(int i) {
        mo26006a(i);
    }

    @TargetApi(11)
    /* renamed from: a */
    public static C9617i m23612a(ColorDrawable colorDrawable) {
        return new C9617i(colorDrawable.getColor());
    }

    public void draw(Canvas canvas) {
        this.f24997h.setColor(C9612d.m23591a(this.f25006q, this.f25008s));
        this.f24997h.setStyle(Style.FILL);
        this.f24997h.setFilterBitmap(getPaintFilterBitmap());
        canvas.drawPath(this.f25004o, this.f24997h);
        if (this.f24999j != 0.0f) {
            this.f24997h.setColor(C9612d.m23591a(this.f25001l, this.f25008s));
            this.f24997h.setStyle(Style.STROKE);
            this.f24997h.setStrokeWidth(this.f24999j);
            canvas.drawPath(this.f25005p, this.f24997h);
        }
    }

    public int getAlpha() {
        return this.f25008s;
    }

    public int getBorderColor() {
        return this.f25001l;
    }

    public float getBorderWidth() {
        return this.f24999j;
    }

    public int getOpacity() {
        return C9612d.m23590a(C9612d.m23591a(this.f25006q, this.f25008s));
    }

    public float getPadding() {
        return this.f25000k;
    }

    public boolean getPaintFilterBitmap() {
        return this.f25003n;
    }

    public float[] getRadii() {
        return this.f24994e;
    }

    public boolean getScaleDownInsideBorders() {
        return this.f25002m;
    }

    public boolean isCircle() {
        return this.f24998i;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m23613a();
    }

    public void setAlpha(int i) {
        if (i != this.f25008s) {
            this.f25008s = i;
            invalidateSelf();
        }
    }

    public void setBorder(int i, float f) {
        if (this.f25001l != i) {
            this.f25001l = i;
            invalidateSelf();
        }
        if (this.f24999j != f) {
            this.f24999j = f;
            m23613a();
            invalidateSelf();
        }
    }

    public void setCircle(boolean z) {
        this.f24998i = z;
        m23613a();
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void setPadding(float f) {
        if (this.f25000k != f) {
            this.f25000k = f;
            m23613a();
            invalidateSelf();
        }
    }

    public void setPaintFilterBitmap(boolean z) {
        if (this.f25003n != z) {
            this.f25003n = z;
            invalidateSelf();
        }
    }

    public void setRadii(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.f24994e, 0.0f);
        } else {
            C9536j.m23276a(fArr.length == 8, (Object) "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f24994e, 0, 8);
        }
        m23613a();
        invalidateSelf();
    }

    public void setRadius(float f) {
        C9536j.m23276a(f >= 0.0f, (Object) "radius should be non negative");
        Arrays.fill(this.f24994e, f);
        m23613a();
        invalidateSelf();
    }

    public void setScaleDownInsideBorders(boolean z) {
        if (this.f25002m != z) {
            this.f25002m = z;
            m23613a();
            invalidateSelf();
        }
    }

    /* renamed from: a */
    public void mo26006a(int i) {
        if (this.f25006q != i) {
            this.f25006q = i;
            invalidateSelf();
        }
    }

    /* renamed from: a */
    private void m23613a() {
        float[] fArr;
        float[] fArr2;
        this.f25004o.reset();
        this.f25005p.reset();
        this.f25007r.set(getBounds());
        RectF rectF = this.f25007r;
        float f = this.f24999j;
        rectF.inset(f / 2.0f, f / 2.0f);
        int i = 0;
        if (this.f24998i) {
            this.f25005p.addCircle(this.f25007r.centerX(), this.f25007r.centerY(), Math.min(this.f25007r.width(), this.f25007r.height()) / 2.0f, Direction.CW);
        } else {
            int i2 = 0;
            while (true) {
                fArr2 = this.f24995f;
                if (i2 >= fArr2.length) {
                    break;
                }
                fArr2[i2] = (this.f24994e[i2] + this.f25000k) - (this.f24999j / 2.0f);
                i2++;
            }
            this.f25005p.addRoundRect(this.f25007r, fArr2, Direction.CW);
        }
        RectF rectF2 = this.f25007r;
        float f2 = this.f24999j;
        rectF2.inset((-f2) / 2.0f, (-f2) / 2.0f);
        float f3 = this.f25000k + (this.f25002m ? this.f24999j : 0.0f);
        this.f25007r.inset(f3, f3);
        if (this.f24998i) {
            this.f25004o.addCircle(this.f25007r.centerX(), this.f25007r.centerY(), Math.min(this.f25007r.width(), this.f25007r.height()) / 2.0f, Direction.CW);
        } else if (this.f25002m) {
            if (this.f24996g == null) {
                this.f24996g = new float[8];
            }
            while (true) {
                fArr = this.f24996g;
                if (i >= fArr.length) {
                    break;
                }
                fArr[i] = this.f24994e[i] - this.f24999j;
                i++;
            }
            this.f25004o.addRoundRect(this.f25007r, fArr, Direction.CW);
        } else {
            this.f25004o.addRoundRect(this.f25007r, this.f24994e, Direction.CW);
        }
        float f4 = -f3;
        this.f25007r.inset(f4, f4);
    }
}
