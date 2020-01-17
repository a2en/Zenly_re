package app.zenly.locator.cards.framework.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import app.zenly.locator.C3892m;
import app.zenly.locator.R;
import app.zenly.locator.cards.framework.Tiltable;
import app.zenly.locator.core.util.C3200e0;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;

public final class CardBackgroundView extends View implements Tiltable {

    /* renamed from: A */
    private final Rect f5967A;

    /* renamed from: B */
    private boolean f5968B;

    /* renamed from: C */
    private boolean f5969C;

    /* renamed from: D */
    private final int f5970D;

    /* renamed from: e */
    private Drawable f5971e;

    /* renamed from: f */
    private int f5972f;

    /* renamed from: g */
    private Drawable f5973g;

    /* renamed from: h */
    private int f5974h;

    /* renamed from: i */
    private int f5975i;

    /* renamed from: j */
    private int f5976j;

    /* renamed from: k */
    private int f5977k;

    /* renamed from: l */
    private int f5978l;

    /* renamed from: m */
    private int f5979m;

    /* renamed from: n */
    private int f5980n;

    /* renamed from: o */
    private boolean f5981o;

    /* renamed from: p */
    private boolean f5982p;

    /* renamed from: q */
    private Drawable f5983q;

    /* renamed from: r */
    private final PointF f5984r;

    /* renamed from: s */
    private final PointF f5985s;

    /* renamed from: t */
    private float f5986t;

    /* renamed from: u */
    private float f5987u;

    /* renamed from: v */
    private Drawable f5988v;

    /* renamed from: w */
    private Bitmap f5989w;

    /* renamed from: x */
    private final Paint f5990x;

    /* renamed from: y */
    private Bitmap f5991y;

    /* renamed from: z */
    private final Rect f5992z;

    public CardBackgroundView(Context context) {
        this(context, null, 0, 6, null);
    }

    public CardBackgroundView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ CardBackgroundView(Context context, AttributeSet attributeSet, int i, int i2, C12928f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = R.attr.cardBackgroundViewStyle;
        }
        this(context, attributeSet, i);
    }

    /* renamed from: b */
    private final int m7260b(int i, int i2) {
        int mode = MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            return C12973l.m33890b(i2, MeasureSpec.getSize(i));
        }
        if (mode == 0) {
            return i2;
        }
        if (mode == 1073741824) {
            return MeasureSpec.getSize(i);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: c */
    private final void m7262c() {
        Drawable drawable = null;
        if (this.f5981o) {
            Drawable drawable2 = this.f5973g;
            if (drawable2 != null) {
                ConstantState constantState = drawable2.getConstantState();
                if (constantState != null) {
                    Drawable newDrawable = constantState.newDrawable();
                    if (newDrawable != null) {
                        drawable = newDrawable.mutate();
                    }
                }
            }
            this.f5983q = drawable;
            Drawable drawable3 = this.f5983q;
            if (drawable3 != null) {
                m7259a(drawable3, this.f5980n);
                return;
            }
            return;
        }
        this.f5983q = null;
    }

    /* renamed from: a */
    public final void mo7436a(int i, int i2) {
        this.f5974h = i;
        this.f5975i = i2;
        invalidate();
    }

    public final Drawable getPattern() {
        return this.f5971e;
    }

    public final int getPatternTint() {
        return this.f5972f;
    }

    public final Drawable getShape() {
        return this.f5973g;
    }

    public final int getShineHeight() {
        return this.f5977k;
    }

    public final int getShineTint() {
        return this.f5978l;
    }

    public final boolean getShowShine() {
        return this.f5982p;
    }

    public final int getThickness() {
        return this.f5979m;
    }

    public final boolean getThicknessEnabled() {
        return this.f5981o;
    }

    public final int getThicknessTint() {
        return this.f5980n;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        C12932j.m33818b(canvas, "canvas");
        super.onDraw(canvas);
        int width = getWidth() - this.f5979m;
        int height = getHeight() - this.f5979m;
        PointF pointF = this.f5984r;
        canvas.translate(pointF.x, pointF.y);
        Drawable drawable = this.f5983q;
        if (drawable != null) {
            drawable.setBounds(0, 0, width, height);
            drawable.draw(canvas);
        }
        PointF pointF2 = this.f5984r;
        float f = -pointF2.x;
        PointF pointF3 = this.f5985s;
        canvas.translate(f + pointF3.x, (-pointF2.y) + pointF3.y);
        Drawable drawable2 = this.f5973g;
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, width, height);
            if (drawable2 != null) {
                GradientDrawable gradientDrawable = (GradientDrawable) drawable2;
                gradientDrawable.setColors(new int[]{this.f5974h, this.f5975i});
                gradientDrawable.setOrientation(this.f5969C ? Orientation.TR_BL : Orientation.TL_BR);
                drawable2.draw(canvas);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            }
        }
        Drawable drawable3 = this.f5971e;
        if (drawable3 != null) {
            drawable3.setBounds(0, 0, width, height);
            drawable3.draw(canvas);
        }
        if (this.f5968B) {
            this.f5968B = false;
            m7261b();
        }
        Bitmap bitmap = this.f5991y;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, this.f5992z, this.f5967A, null);
        }
    }

    public boolean onInterceptTilt() {
        return false;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4 = this.f5979m;
        Drawable drawable = this.f5973g;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth() + i4;
            i3 = i4 + drawable.getIntrinsicHeight();
            i4 = intrinsicWidth;
        } else {
            i3 = i4;
        }
        setMeasuredDimension(m7260b(i, i4), m7260b(i2, i3));
    }

    public final void setPattern(Drawable drawable) {
        Drawable drawable2 = null;
        this.f5971e = drawable != null ? drawable.mutate() : null;
        Drawable drawable3 = this.f5971e;
        if (drawable3 != null) {
            m7259a(drawable3, this.f5972f);
        }
        if (drawable != null) {
            ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                Drawable newDrawable = constantState.newDrawable();
                if (newDrawable != null) {
                    drawable2 = newDrawable.mutate();
                }
            }
        }
        this.f5988v = drawable2;
        Drawable drawable4 = this.f5988v;
        if (drawable4 != null) {
            m7259a(drawable4, this.f5978l);
        }
        this.f5968B = this.f5982p;
        invalidate();
    }

    public final void setPatternTint(int i) {
        this.f5972f = i;
        Drawable drawable = this.f5971e;
        if (drawable != null) {
            m7259a(drawable, this.f5972f);
        }
        invalidate();
    }

    public final void setShape(Drawable drawable) {
        this.f5973g = drawable != null ? drawable.mutate() : null;
        m7262c();
        this.f5968B = this.f5982p;
        requestLayout();
        invalidate();
    }

    public final void setShineHeight(int i) {
        this.f5977k = i;
        this.f5968B = this.f5982p;
        invalidate();
    }

    public final void setShineTint(int i) {
        this.f5978l = i;
        Drawable drawable = this.f5988v;
        if (drawable != null) {
            m7259a(drawable, this.f5978l);
        }
        this.f5968B = this.f5982p;
        invalidate();
    }

    public final void setShowShine(boolean z) {
        this.f5982p = z;
        this.f5968B = true;
        invalidate();
    }

    public final void setThickness(int i) {
        this.f5979m = i;
        requestLayout();
        invalidate();
    }

    public final void setThicknessEnabled(boolean z) {
        this.f5981o = z;
        m7262c();
        invalidate();
    }

    public final void setThicknessTint(int i) {
        this.f5980n = i;
        Drawable drawable = this.f5983q;
        if (drawable != null) {
            m7259a(drawable, this.f5980n);
        }
        invalidate();
    }

    public void setTilt(float f, float f2, float f3) {
        this.f5986t = f;
        this.f5987u = f2;
        m7258a();
        this.f5968B = this.f5982p;
        invalidate();
    }

    public CardBackgroundView(Context context, AttributeSet attributeSet, int i) {
        C12932j.m33818b(context, "context");
        super(context, attributeSet, i);
        this.f5981o = true;
        this.f5982p = true;
        this.f5984r = new PointF();
        this.f5985s = new PointF();
        this.f5990x = new Paint(1);
        this.f5992z = new Rect();
        this.f5967A = new Rect();
        this.f5970D = C3200e0.m10183a(context, 8);
        setClickable(true);
        this.f5990x.setXfermode(new PorterDuffXfermode(Mode.DST_IN));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3892m.CardBackgroundView, i, 0);
        setPattern(obtainStyledAttributes.getDrawable(1));
        setPatternTint(obtainStyledAttributes.getColor(2, this.f5972f));
        setShape(obtainStyledAttributes.getDrawable(3));
        setShineHeight(obtainStyledAttributes.getDimensionPixelSize(6, 0));
        this.f5975i = obtainStyledAttributes.getColor(4, this.f5975i);
        this.f5974h = obtainStyledAttributes.getColor(5, this.f5974h);
        setShineTint(obtainStyledAttributes.getColor(7, this.f5978l));
        setThickness(obtainStyledAttributes.getDimensionPixelSize(8, 0));
        setThicknessTint(obtainStyledAttributes.getColor(9, this.f5980n));
        this.f5969C = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private final void m7259a(Drawable drawable, int i) {
        if (i == 0) {
            drawable.setColorFilter(null);
        } else {
            drawable.setColorFilter(new PorterDuffColorFilter(i, Mode.SRC_IN));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0064, code lost:
        if (r5.getHeight() == r0.f5977k) goto L_0x00b5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0199  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m7261b() {
        /*
            r23 = this;
            r0 = r23
            android.graphics.drawable.Drawable r1 = r0.f5988v
            r2 = 0
            if (r1 == 0) goto L_0x01a1
            android.graphics.drawable.Drawable r1 = r0.f5973g
            if (r1 == 0) goto L_0x01a1
            int r1 = r0.f5977k
            if (r1 <= 0) goto L_0x01a1
            boolean r1 = r0.f5982p
            if (r1 != 0) goto L_0x0015
            goto L_0x01a1
        L_0x0015:
            int r1 = r23.getWidth()
            int r3 = r0.f5979m
            int r1 = r1 - r3
            int r3 = r23.getHeight()
            int r4 = r0.f5979m
            int r3 = r3 - r4
            int r4 = r23.getHeight()
            float r4 = (float) r4
            int r5 = r0.f5977k
            float r6 = (float) r5
            r7 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 * r7
            float r4 = r4 + r6
            float r6 = r0.f5986t
            float r6 = -r6
            r8 = 1065353216(0x3f800000, float:1.0)
            float r6 = r6 + r8
            float r6 = r6 * r4
            float r6 = r6 % r4
            float r4 = (float) r5
            float r4 = r4 / r7
            float r6 = r6 - r4
            float r4 = (float) r5
            float r6 = r6 - r4
            int r4 = (int) r6
            int r5 = r0.f5976j
            int r5 = r5 - r4
            int r5 = java.lang.Math.abs(r5)
            int r6 = r0.f5970D
            if (r5 >= r6) goto L_0x004b
            return
        L_0x004b:
            r0.f5976j = r4
            android.graphics.Bitmap r5 = r0.f5989w
            r6 = 1
            if (r5 == 0) goto L_0x0066
            if (r5 == 0) goto L_0x0066
            int r5 = r5.getWidth()
            if (r5 != r1) goto L_0x0066
            android.graphics.Bitmap r5 = r0.f5989w
            if (r5 == 0) goto L_0x0066
            int r5 = r5.getHeight()
            int r8 = r0.f5977k
            if (r5 == r8) goto L_0x00b5
        L_0x0066:
            android.graphics.LinearGradient r5 = new android.graphics.LinearGradient
            r10 = 0
            r11 = 0
            r12 = 0
            int r8 = r0.f5977k
            float r8 = (float) r8
            float r13 = r8 / r7
            r7 = 2
            int[] r14 = new int[r7]
            r14 = {0, -16777216} // fill-array
            float[] r15 = new float[r7]
            r15 = {0, 1058642330} // fill-array
            android.graphics.Shader$TileMode r16 = android.graphics.Shader.TileMode.MIRROR
            r9 = r5
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            android.graphics.Paint r7 = new android.graphics.Paint
            r7.<init>(r6)
            r7.setShader(r5)
            int r5 = r0.f5977k
            android.graphics.Bitmap$Config r8 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r1, r5, r8)
            r0.f5989w = r1
            android.graphics.Canvas r1 = new android.graphics.Canvas
            android.graphics.Bitmap r5 = r0.f5989w
            if (r5 == 0) goto L_0x019d
            r1.<init>(r5)
            r18 = 0
            r19 = 0
            int r5 = r1.getWidth()
            float r5 = (float) r5
            int r8 = r1.getHeight()
            float r8 = (float) r8
            r17 = r1
            r20 = r5
            r21 = r8
            r22 = r7
            r17.drawRect(r18, r19, r20, r21, r22)
        L_0x00b5:
            android.graphics.Bitmap r1 = r0.f5991y
            r5 = 0
            if (r1 == 0) goto L_0x0107
            if (r1 == 0) goto L_0x00c5
            int r1 = r1.getWidth()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x00c6
        L_0x00c5:
            r1 = r2
        L_0x00c6:
            android.graphics.Bitmap r7 = r0.f5989w
            if (r7 == 0) goto L_0x00d3
            int r7 = r7.getWidth()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x00d4
        L_0x00d3:
            r7 = r2
        L_0x00d4:
            boolean r1 = kotlin.jvm.internal.C12932j.m33817a(r1, r7)
            r1 = r1 ^ r6
            if (r1 != 0) goto L_0x0107
            android.graphics.Bitmap r1 = r0.f5991y
            if (r1 == 0) goto L_0x00e8
            int r1 = r1.getHeight()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x00e9
        L_0x00e8:
            r1 = r2
        L_0x00e9:
            android.graphics.Bitmap r7 = r0.f5989w
            if (r7 == 0) goto L_0x00f6
            int r7 = r7.getHeight()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x00f7
        L_0x00f6:
            r7 = r2
        L_0x00f7:
            boolean r1 = kotlin.jvm.internal.C12932j.m33817a(r1, r7)
            r1 = r1 ^ r6
            if (r1 == 0) goto L_0x00ff
            goto L_0x0107
        L_0x00ff:
            android.graphics.Bitmap r1 = r0.f5991y
            if (r1 == 0) goto L_0x0121
            r1.eraseColor(r5)
            goto L_0x0121
        L_0x0107:
            android.graphics.Bitmap r1 = r0.f5989w
            if (r1 == 0) goto L_0x0110
            int r1 = r1.getWidth()
            goto L_0x0111
        L_0x0110:
            r1 = 1
        L_0x0111:
            android.graphics.Bitmap r7 = r0.f5989w
            if (r7 == 0) goto L_0x0119
            int r6 = r7.getHeight()
        L_0x0119:
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r1, r6, r7)
            r0.f5991y = r1
        L_0x0121:
            android.graphics.Canvas r1 = new android.graphics.Canvas
            android.graphics.Bitmap r6 = r0.f5991y
            if (r6 == 0) goto L_0x0199
            r1.<init>(r6)
            float r6 = (float) r4
            float r7 = -r6
            r8 = 0
            r1.translate(r8, r7)
            android.graphics.drawable.Drawable r7 = r0.f5988v
            if (r7 == 0) goto L_0x0143
            int r9 = r1.getWidth()
            int r10 = r1.getHeight()
            int r10 = r10 + r4
            r7.setBounds(r5, r4, r9, r10)
            r7.draw(r1)
        L_0x0143:
            android.graphics.Bitmap r7 = r0.f5989w
            if (r7 == 0) goto L_0x0195
            android.graphics.Paint r2 = r0.f5990x
            r1.drawBitmap(r7, r8, r6, r2)
            android.graphics.Bitmap r1 = r0.f5991y
            if (r1 == 0) goto L_0x0194
            if (r4 >= 0) goto L_0x0161
            int r2 = 0 - r4
            int r3 = r1.getHeight()
            int r2 = java.lang.Math.min(r2, r3)
            int r3 = r1.getHeight()
            goto L_0x017a
        L_0x0161:
            int r2 = r1.getHeight()
            int r2 = r2 + r4
            if (r2 <= r3) goto L_0x0175
            int r2 = r1.getHeight()
            int r6 = r1.getHeight()
            int r6 = r6 + r4
            int r6 = r6 - r3
            int r3 = r2 - r6
            goto L_0x0179
        L_0x0175:
            int r3 = r1.getHeight()
        L_0x0179:
            r2 = 0
        L_0x017a:
            android.graphics.Rect r6 = r0.f5992z
            int r7 = r1.getWidth()
            r6.set(r5, r2, r7, r3)
            android.graphics.Rect r3 = r0.f5967A
            int r4 = r4 + r2
            int r1 = r1.getWidth()
            android.graphics.Rect r2 = r0.f5992z
            int r2 = r2.height()
            int r2 = r2 + r4
            r3.set(r5, r4, r1, r2)
        L_0x0194:
            return
        L_0x0195:
            kotlin.jvm.internal.C12932j.m33814a()
            throw r2
        L_0x0199:
            kotlin.jvm.internal.C12932j.m33814a()
            throw r2
        L_0x019d:
            kotlin.jvm.internal.C12932j.m33814a()
            throw r2
        L_0x01a1:
            r0.f5991y = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.cards.framework.widget.CardBackgroundView.m7261b():void");
    }

    /* renamed from: a */
    private final void m7258a() {
        float f = ((float) this.f5979m) / 2.0f;
        PointF pointF = this.f5984r;
        float f2 = this.f5987u;
        pointF.x = f - (f * f2);
        float f3 = this.f5986t;
        pointF.y = (f * f3) + f;
        PointF pointF2 = this.f5985s;
        pointF2.x = (f2 * f) + f;
        pointF2.y = f - (f3 * f);
    }

    public final void setPattern(Drawable[] drawableArr) {
        C12932j.m33818b(drawableArr, "patterns");
        if (!(drawableArr.length == 0)) {
            setPattern((Drawable) new LayerDrawable(drawableArr));
        }
    }
}
