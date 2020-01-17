package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Path.FillType;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.common.internal.C9536j;
import com.facebook.imagepipeline.systrace.FrescoSystrace;
import java.util.Arrays;

/* renamed from: com.facebook.drawee.drawable.k */
public abstract class C9621k extends Drawable implements Rounded, TransformAwareDrawable {

    /* renamed from: A */
    Matrix f25030A;

    /* renamed from: B */
    final Matrix f25031B = new Matrix();

    /* renamed from: C */
    private float f25032C = 0.0f;

    /* renamed from: D */
    private boolean f25033D = false;

    /* renamed from: E */
    private boolean f25034E = false;

    /* renamed from: F */
    private boolean f25035F = true;

    /* renamed from: G */
    private TransformCallback f25036G;

    /* renamed from: e */
    private final Drawable f25037e;

    /* renamed from: f */
    protected boolean f25038f = false;

    /* renamed from: g */
    protected boolean f25039g = false;

    /* renamed from: h */
    protected float f25040h = 0.0f;

    /* renamed from: i */
    protected final Path f25041i = new Path();

    /* renamed from: j */
    protected boolean f25042j = true;

    /* renamed from: k */
    protected int f25043k = 0;

    /* renamed from: l */
    protected final Path f25044l = new Path();

    /* renamed from: m */
    private final float[] f25045m = new float[8];

    /* renamed from: n */
    final float[] f25046n = new float[8];

    /* renamed from: o */
    float[] f25047o;

    /* renamed from: p */
    final RectF f25048p = new RectF();

    /* renamed from: q */
    final RectF f25049q = new RectF();

    /* renamed from: r */
    final RectF f25050r = new RectF();

    /* renamed from: s */
    final RectF f25051s = new RectF();

    /* renamed from: t */
    RectF f25052t;

    /* renamed from: u */
    final Matrix f25053u = new Matrix();

    /* renamed from: v */
    final Matrix f25054v = new Matrix();

    /* renamed from: w */
    final Matrix f25055w = new Matrix();

    /* renamed from: x */
    final Matrix f25056x = new Matrix();

    /* renamed from: y */
    final Matrix f25057y = new Matrix();

    /* renamed from: z */
    Matrix f25058z;

    C9621k(Drawable drawable) {
        this.f25037e = drawable;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo26002a() {
        return this.f25038f || this.f25039g || this.f25040h > 0.0f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo26014b() {
        float[] fArr;
        if (this.f25035F) {
            this.f25044l.reset();
            RectF rectF = this.f25048p;
            float f = this.f25040h;
            rectF.inset(f / 2.0f, f / 2.0f);
            if (this.f25038f) {
                this.f25044l.addCircle(this.f25048p.centerX(), this.f25048p.centerY(), Math.min(this.f25048p.width(), this.f25048p.height()) / 2.0f, Direction.CW);
            } else {
                int i = 0;
                while (true) {
                    fArr = this.f25046n;
                    if (i >= fArr.length) {
                        break;
                    }
                    fArr[i] = (this.f25045m[i] + this.f25032C) - (this.f25040h / 2.0f);
                    i++;
                }
                this.f25044l.addRoundRect(this.f25048p, fArr, Direction.CW);
            }
            RectF rectF2 = this.f25048p;
            float f2 = this.f25040h;
            rectF2.inset((-f2) / 2.0f, (-f2) / 2.0f);
            this.f25041i.reset();
            float f3 = this.f25032C + (this.f25033D ? this.f25040h : 0.0f);
            this.f25048p.inset(f3, f3);
            if (this.f25038f) {
                this.f25041i.addCircle(this.f25048p.centerX(), this.f25048p.centerY(), Math.min(this.f25048p.width(), this.f25048p.height()) / 2.0f, Direction.CW);
            } else if (this.f25033D) {
                if (this.f25047o == null) {
                    this.f25047o = new float[8];
                }
                for (int i2 = 0; i2 < this.f25046n.length; i2++) {
                    this.f25047o[i2] = this.f25045m[i2] - this.f25040h;
                }
                this.f25041i.addRoundRect(this.f25048p, this.f25047o, Direction.CW);
            } else {
                this.f25041i.addRoundRect(this.f25048p, this.f25045m, Direction.CW);
            }
            float f4 = -f3;
            this.f25048p.inset(f4, f4);
            this.f25041i.setFillType(FillType.WINDING);
            this.f25035F = false;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a0, code lost:
        if (r0.equals(r4.f25030A) == false) goto L_0x00a2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo26015c() {
        /*
            r4 = this;
            com.facebook.drawee.drawable.TransformCallback r0 = r4.f25036G
            if (r0 == 0) goto L_0x0011
            android.graphics.Matrix r1 = r4.f25055w
            r0.getTransform(r1)
            com.facebook.drawee.drawable.TransformCallback r0 = r4.f25036G
            android.graphics.RectF r1 = r4.f25048p
            r0.getRootBounds(r1)
            goto L_0x001f
        L_0x0011:
            android.graphics.Matrix r0 = r4.f25055w
            r0.reset()
            android.graphics.RectF r0 = r4.f25048p
            android.graphics.Rect r1 = r4.getBounds()
            r0.set(r1)
        L_0x001f:
            android.graphics.RectF r0 = r4.f25050r
            int r1 = r4.getIntrinsicWidth()
            float r1 = (float) r1
            int r2 = r4.getIntrinsicHeight()
            float r2 = (float) r2
            r3 = 0
            r0.set(r3, r3, r1, r2)
            android.graphics.RectF r0 = r4.f25051s
            android.graphics.drawable.Drawable r1 = r4.f25037e
            android.graphics.Rect r1 = r1.getBounds()
            r0.set(r1)
            android.graphics.Matrix r0 = r4.f25053u
            android.graphics.RectF r1 = r4.f25050r
            android.graphics.RectF r2 = r4.f25051s
            android.graphics.Matrix$ScaleToFit r3 = android.graphics.Matrix.ScaleToFit.FILL
            r0.setRectToRect(r1, r2, r3)
            boolean r0 = r4.f25033D
            if (r0 == 0) goto L_0x007a
            android.graphics.RectF r0 = r4.f25052t
            if (r0 != 0) goto L_0x0057
            android.graphics.RectF r0 = new android.graphics.RectF
            android.graphics.RectF r1 = r4.f25048p
            r0.<init>(r1)
            r4.f25052t = r0
            goto L_0x005c
        L_0x0057:
            android.graphics.RectF r1 = r4.f25048p
            r0.set(r1)
        L_0x005c:
            android.graphics.RectF r0 = r4.f25052t
            float r1 = r4.f25040h
            r0.inset(r1, r1)
            android.graphics.Matrix r0 = r4.f25058z
            if (r0 != 0) goto L_0x006e
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r4.f25058z = r0
        L_0x006e:
            android.graphics.Matrix r0 = r4.f25058z
            android.graphics.RectF r1 = r4.f25048p
            android.graphics.RectF r2 = r4.f25052t
            android.graphics.Matrix$ScaleToFit r3 = android.graphics.Matrix.ScaleToFit.FILL
            r0.setRectToRect(r1, r2, r3)
            goto L_0x0081
        L_0x007a:
            android.graphics.Matrix r0 = r4.f25058z
            if (r0 == 0) goto L_0x0081
            r0.reset()
        L_0x0081:
            android.graphics.Matrix r0 = r4.f25055w
            android.graphics.Matrix r1 = r4.f25056x
            boolean r0 = r0.equals(r1)
            r1 = 1
            if (r0 == 0) goto L_0x00a2
            android.graphics.Matrix r0 = r4.f25053u
            android.graphics.Matrix r2 = r4.f25054v
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00a2
            android.graphics.Matrix r0 = r4.f25058z
            if (r0 == 0) goto L_0x00f1
            android.graphics.Matrix r2 = r4.f25030A
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x00f1
        L_0x00a2:
            r4.f25042j = r1
            android.graphics.Matrix r0 = r4.f25055w
            android.graphics.Matrix r2 = r4.f25057y
            r0.invert(r2)
            android.graphics.Matrix r0 = r4.f25031B
            android.graphics.Matrix r2 = r4.f25055w
            r0.set(r2)
            boolean r0 = r4.f25033D
            if (r0 == 0) goto L_0x00bd
            android.graphics.Matrix r0 = r4.f25031B
            android.graphics.Matrix r2 = r4.f25058z
            r0.postConcat(r2)
        L_0x00bd:
            android.graphics.Matrix r0 = r4.f25031B
            android.graphics.Matrix r2 = r4.f25053u
            r0.preConcat(r2)
            android.graphics.Matrix r0 = r4.f25056x
            android.graphics.Matrix r2 = r4.f25055w
            r0.set(r2)
            android.graphics.Matrix r0 = r4.f25054v
            android.graphics.Matrix r2 = r4.f25053u
            r0.set(r2)
            boolean r0 = r4.f25033D
            if (r0 == 0) goto L_0x00ea
            android.graphics.Matrix r0 = r4.f25030A
            if (r0 != 0) goto L_0x00e4
            android.graphics.Matrix r0 = new android.graphics.Matrix
            android.graphics.Matrix r2 = r4.f25058z
            r0.<init>(r2)
            r4.f25030A = r0
            goto L_0x00f1
        L_0x00e4:
            android.graphics.Matrix r2 = r4.f25058z
            r0.set(r2)
            goto L_0x00f1
        L_0x00ea:
            android.graphics.Matrix r0 = r4.f25030A
            if (r0 == 0) goto L_0x00f1
            r0.reset()
        L_0x00f1:
            android.graphics.RectF r0 = r4.f25048p
            android.graphics.RectF r2 = r4.f25049q
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0104
            r4.f25035F = r1
            android.graphics.RectF r0 = r4.f25049q
            android.graphics.RectF r1 = r4.f25048p
            r0.set(r1)
        L_0x0104:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.drawee.drawable.C9621k.mo26015c():void");
    }

    public void clearColorFilter() {
        this.f25037e.clearColorFilter();
    }

    public void draw(Canvas canvas) {
        if (FrescoSystrace.m24705c()) {
            FrescoSystrace.m24703a("RoundedDrawable#draw");
        }
        this.f25037e.draw(canvas);
        if (FrescoSystrace.m24705c()) {
            FrescoSystrace.m24702a();
        }
    }

    public int getAlpha() {
        return this.f25037e.getAlpha();
    }

    public int getBorderColor() {
        return this.f25043k;
    }

    public float getBorderWidth() {
        return this.f25040h;
    }

    public ColorFilter getColorFilter() {
        return this.f25037e.getColorFilter();
    }

    public int getIntrinsicHeight() {
        return this.f25037e.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f25037e.getIntrinsicWidth();
    }

    public int getOpacity() {
        return this.f25037e.getOpacity();
    }

    public float getPadding() {
        return this.f25032C;
    }

    public boolean getPaintFilterBitmap() {
        return this.f25034E;
    }

    public float[] getRadii() {
        return this.f25045m;
    }

    public boolean getScaleDownInsideBorders() {
        return this.f25033D;
    }

    public boolean isCircle() {
        return this.f25038f;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f25037e.setBounds(rect);
    }

    public void setAlpha(int i) {
        this.f25037e.setAlpha(i);
    }

    public void setBorder(int i, float f) {
        if (this.f25043k != i || this.f25040h != f) {
            this.f25043k = i;
            this.f25040h = f;
            this.f25035F = true;
            invalidateSelf();
        }
    }

    public void setCircle(boolean z) {
        this.f25038f = z;
        this.f25035F = true;
        invalidateSelf();
    }

    public void setColorFilter(int i, Mode mode) {
        this.f25037e.setColorFilter(i, mode);
    }

    public void setPadding(float f) {
        if (this.f25032C != f) {
            this.f25032C = f;
            this.f25035F = true;
            invalidateSelf();
        }
    }

    public void setPaintFilterBitmap(boolean z) {
        if (this.f25034E != z) {
            this.f25034E = z;
            invalidateSelf();
        }
    }

    public void setRadii(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.f25045m, 0.0f);
            this.f25039g = false;
        } else {
            C9536j.m23276a(fArr.length == 8, (Object) "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f25045m, 0, 8);
            this.f25039g = false;
            for (int i = 0; i < 8; i++) {
                this.f25039g |= fArr[i] > 0.0f;
            }
        }
        this.f25035F = true;
        invalidateSelf();
    }

    public void setRadius(float f) {
        boolean z = false;
        int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        C9536j.m23279b(i >= 0);
        Arrays.fill(this.f25045m, f);
        if (i != 0) {
            z = true;
        }
        this.f25039g = z;
        this.f25035F = true;
        invalidateSelf();
    }

    public void setScaleDownInsideBorders(boolean z) {
        if (this.f25033D != z) {
            this.f25033D = z;
            this.f25035F = true;
            invalidateSelf();
        }
    }

    public void setTransformCallback(TransformCallback transformCallback) {
        this.f25036G = transformCallback;
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f25037e.setColorFilter(colorFilter);
    }
}
