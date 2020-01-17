package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Path.FillType;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.common.internal.C9536j;
import java.util.Arrays;

/* renamed from: com.facebook.drawee.drawable.j */
public class C9618j extends C9614f implements Rounded {

    /* renamed from: h */
    C9620b f25009h = C9620b.OVERLAY_COLOR;

    /* renamed from: i */
    private final RectF f25010i = new RectF();

    /* renamed from: j */
    private RectF f25011j;

    /* renamed from: k */
    private Matrix f25012k;

    /* renamed from: l */
    private final float[] f25013l = new float[8];

    /* renamed from: m */
    final float[] f25014m = new float[8];

    /* renamed from: n */
    final Paint f25015n = new Paint(1);

    /* renamed from: o */
    private boolean f25016o = false;

    /* renamed from: p */
    private float f25017p = 0.0f;

    /* renamed from: q */
    private int f25018q = 0;

    /* renamed from: r */
    private int f25019r = 0;

    /* renamed from: s */
    private float f25020s = 0.0f;

    /* renamed from: t */
    private boolean f25021t = false;

    /* renamed from: u */
    private boolean f25022u = false;

    /* renamed from: v */
    private final Path f25023v = new Path();

    /* renamed from: w */
    private final Path f25024w = new Path();

    /* renamed from: x */
    private final RectF f25025x = new RectF();

    /* renamed from: com.facebook.drawee.drawable.j$a */
    static /* synthetic */ class C9619a {

        /* renamed from: a */
        static final /* synthetic */ int[] f25026a = new int[C9620b.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                com.facebook.drawee.drawable.j$b[] r0 = com.facebook.drawee.drawable.C9618j.C9620b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f25026a = r0
                int[] r0 = f25026a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.facebook.drawee.drawable.j$b r1 = com.facebook.drawee.drawable.C9618j.C9620b.CLIPPING     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f25026a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.facebook.drawee.drawable.j$b r1 = com.facebook.drawee.drawable.C9618j.C9620b.OVERLAY_COLOR     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.drawee.drawable.C9618j.C9619a.<clinit>():void");
        }
    }

    /* renamed from: com.facebook.drawee.drawable.j$b */
    public enum C9620b {
        OVERLAY_COLOR,
        CLIPPING
    }

    public C9618j(Drawable drawable) {
        C9536j.m23271a(drawable);
        super(drawable);
    }

    /* renamed from: a */
    public void mo26013a(int i) {
        this.f25019r = i;
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        this.f25010i.set(getBounds());
        int i = C9619a.f25026a[this.f25009h.ordinal()];
        if (i == 1) {
            int save = canvas.save();
            this.f25023v.setFillType(FillType.EVEN_ODD);
            canvas.clipPath(this.f25023v);
            super.draw(canvas);
            canvas.restoreToCount(save);
        } else if (i == 2) {
            if (this.f25021t) {
                RectF rectF = this.f25011j;
                if (rectF == null) {
                    this.f25011j = new RectF(this.f25010i);
                    this.f25012k = new Matrix();
                } else {
                    rectF.set(this.f25010i);
                }
                RectF rectF2 = this.f25011j;
                float f = this.f25017p;
                rectF2.inset(f, f);
                this.f25012k.setRectToRect(this.f25010i, this.f25011j, ScaleToFit.FILL);
                int save2 = canvas.save();
                canvas.clipRect(this.f25010i);
                canvas.concat(this.f25012k);
                super.draw(canvas);
                canvas.restoreToCount(save2);
            } else {
                super.draw(canvas);
            }
            this.f25015n.setStyle(Style.FILL);
            this.f25015n.setColor(this.f25019r);
            this.f25015n.setStrokeWidth(0.0f);
            this.f25015n.setFilterBitmap(getPaintFilterBitmap());
            this.f25023v.setFillType(FillType.EVEN_ODD);
            canvas.drawPath(this.f25023v, this.f25015n);
            if (this.f25016o) {
                float width = ((this.f25010i.width() - this.f25010i.height()) + this.f25017p) / 2.0f;
                float height = ((this.f25010i.height() - this.f25010i.width()) + this.f25017p) / 2.0f;
                if (width > 0.0f) {
                    RectF rectF3 = this.f25010i;
                    float f2 = rectF3.left;
                    Canvas canvas2 = canvas;
                    canvas2.drawRect(f2, rectF3.top, f2 + width, rectF3.bottom, this.f25015n);
                    RectF rectF4 = this.f25010i;
                    float f3 = rectF4.right;
                    canvas2.drawRect(f3 - width, rectF4.top, f3, rectF4.bottom, this.f25015n);
                }
                if (height > 0.0f) {
                    RectF rectF5 = this.f25010i;
                    float f4 = rectF5.left;
                    float f5 = rectF5.top;
                    Canvas canvas3 = canvas;
                    canvas3.drawRect(f4, f5, rectF5.right, f5 + height, this.f25015n);
                    RectF rectF6 = this.f25010i;
                    float f6 = rectF6.left;
                    float f7 = rectF6.bottom;
                    canvas3.drawRect(f6, f7 - height, rectF6.right, f7, this.f25015n);
                }
            }
        }
        if (this.f25018q != 0) {
            this.f25015n.setStyle(Style.STROKE);
            this.f25015n.setColor(this.f25018q);
            this.f25015n.setStrokeWidth(this.f25017p);
            this.f25023v.setFillType(FillType.EVEN_ODD);
            canvas.drawPath(this.f25024w, this.f25015n);
        }
    }

    public int getBorderColor() {
        return this.f25018q;
    }

    public float getBorderWidth() {
        return this.f25017p;
    }

    public float getPadding() {
        return this.f25020s;
    }

    public boolean getPaintFilterBitmap() {
        return this.f25022u;
    }

    public float[] getRadii() {
        return this.f25013l;
    }

    public boolean getScaleDownInsideBorders() {
        return this.f25021t;
    }

    public boolean isCircle() {
        return this.f25016o;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m23615a();
    }

    public void setBorder(int i, float f) {
        this.f25018q = i;
        this.f25017p = f;
        m23615a();
        invalidateSelf();
    }

    public void setCircle(boolean z) {
        this.f25016o = z;
        m23615a();
        invalidateSelf();
    }

    public void setPadding(float f) {
        this.f25020s = f;
        m23615a();
        invalidateSelf();
    }

    public void setPaintFilterBitmap(boolean z) {
        if (this.f25022u != z) {
            this.f25022u = z;
            invalidateSelf();
        }
    }

    public void setRadii(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.f25013l, 0.0f);
        } else {
            C9536j.m23276a(fArr.length == 8, (Object) "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f25013l, 0, 8);
        }
        m23615a();
        invalidateSelf();
    }

    public void setRadius(float f) {
        Arrays.fill(this.f25013l, f);
        m23615a();
        invalidateSelf();
    }

    public void setScaleDownInsideBorders(boolean z) {
        this.f25021t = z;
        m23615a();
        invalidateSelf();
    }

    /* renamed from: a */
    private void m23615a() {
        float[] fArr;
        this.f25023v.reset();
        this.f25024w.reset();
        this.f25025x.set(getBounds());
        RectF rectF = this.f25025x;
        float f = this.f25020s;
        rectF.inset(f, f);
        this.f25023v.addRect(this.f25025x, Direction.CW);
        if (this.f25016o) {
            this.f25023v.addCircle(this.f25025x.centerX(), this.f25025x.centerY(), Math.min(this.f25025x.width(), this.f25025x.height()) / 2.0f, Direction.CW);
        } else {
            this.f25023v.addRoundRect(this.f25025x, this.f25013l, Direction.CW);
        }
        RectF rectF2 = this.f25025x;
        float f2 = this.f25020s;
        rectF2.inset(-f2, -f2);
        RectF rectF3 = this.f25025x;
        float f3 = this.f25017p;
        rectF3.inset(f3 / 2.0f, f3 / 2.0f);
        if (this.f25016o) {
            this.f25024w.addCircle(this.f25025x.centerX(), this.f25025x.centerY(), Math.min(this.f25025x.width(), this.f25025x.height()) / 2.0f, Direction.CW);
        } else {
            int i = 0;
            while (true) {
                fArr = this.f25014m;
                if (i >= fArr.length) {
                    break;
                }
                fArr[i] = (this.f25013l[i] + this.f25020s) - (this.f25017p / 2.0f);
                i++;
            }
            this.f25024w.addRoundRect(this.f25025x, fArr, Direction.CW);
        }
        RectF rectF4 = this.f25025x;
        float f4 = this.f25017p;
        rectF4.inset((-f4) / 2.0f, (-f4) / 2.0f);
    }
}
