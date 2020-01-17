package com.google.android.material.internal;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import p214e.p234h.p235e.C7614a;

/* renamed from: com.google.android.material.internal.a */
public class C10783a extends Drawable {

    /* renamed from: a */
    final Paint f28125a = new Paint(1);

    /* renamed from: b */
    final Rect f28126b = new Rect();

    /* renamed from: c */
    final RectF f28127c = new RectF();

    /* renamed from: d */
    final C10785b f28128d = new C10785b();

    /* renamed from: e */
    float f28129e;

    /* renamed from: f */
    private int f28130f;

    /* renamed from: g */
    private int f28131g;

    /* renamed from: h */
    private int f28132h;

    /* renamed from: i */
    private int f28133i;

    /* renamed from: j */
    private ColorStateList f28134j;

    /* renamed from: k */
    private int f28135k;

    /* renamed from: l */
    private boolean f28136l = true;

    /* renamed from: m */
    private float f28137m;

    /* renamed from: com.google.android.material.internal.a$b */
    private class C10785b extends ConstantState {
        private C10785b() {
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable() {
            return C10783a.this;
        }
    }

    public C10783a() {
        this.f28125a.setStyle(Style.STROKE);
    }

    /* renamed from: a */
    public void mo31209a(int i, int i2, int i3, int i4) {
        this.f28130f = i;
        this.f28131g = i2;
        this.f28132h = i3;
        this.f28133i = i4;
    }

    /* renamed from: b */
    public final void mo31211b(float f) {
        if (f != this.f28137m) {
            this.f28137m = f;
            invalidateSelf();
        }
    }

    public void draw(Canvas canvas) {
        if (this.f28136l) {
            this.f28125a.setShader(m27716a());
            this.f28136l = false;
        }
        float strokeWidth = this.f28125a.getStrokeWidth() / 2.0f;
        RectF rectF = this.f28127c;
        copyBounds(this.f28126b);
        rectF.set(this.f28126b);
        rectF.left += strokeWidth;
        rectF.top += strokeWidth;
        rectF.right -= strokeWidth;
        rectF.bottom -= strokeWidth;
        canvas.save();
        canvas.rotate(this.f28137m, rectF.centerX(), rectF.centerY());
        canvas.drawOval(rectF, this.f28125a);
        canvas.restore();
    }

    public ConstantState getConstantState() {
        return this.f28128d;
    }

    public int getOpacity() {
        return this.f28129e > 0.0f ? -3 : -2;
    }

    public boolean getPadding(Rect rect) {
        int round = Math.round(this.f28129e);
        rect.set(round, round, round, round);
        return true;
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.f28134j;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f28136l = true;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.f28134j;
        if (colorStateList != null) {
            int colorForState = colorStateList.getColorForState(iArr, this.f28135k);
            if (colorForState != this.f28135k) {
                this.f28136l = true;
                this.f28135k = colorForState;
            }
        }
        if (this.f28136l) {
            invalidateSelf();
        }
        return this.f28136l;
    }

    public void setAlpha(int i) {
        this.f28125a.setAlpha(i);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f28125a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    /* renamed from: a */
    public void mo31208a(float f) {
        if (this.f28129e != f) {
            this.f28129e = f;
            this.f28125a.setStrokeWidth(f * 1.3333f);
            this.f28136l = true;
            invalidateSelf();
        }
    }

    /* renamed from: a */
    public void mo31210a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f28135k = colorStateList.getColorForState(getState(), this.f28135k);
        }
        this.f28134j = colorStateList;
        this.f28136l = true;
        invalidateSelf();
    }

    /* renamed from: a */
    private Shader m27716a() {
        Rect rect = this.f28126b;
        copyBounds(rect);
        float height = this.f28129e / ((float) rect.height());
        LinearGradient linearGradient = new LinearGradient(0.0f, (float) rect.top, 0.0f, (float) rect.bottom, new int[]{C7614a.m18492b(this.f28130f, this.f28135k), C7614a.m18492b(this.f28131g, this.f28135k), C7614a.m18492b(C7614a.m18493c(this.f28131g, 0), this.f28135k), C7614a.m18492b(C7614a.m18493c(this.f28133i, 0), this.f28135k), C7614a.m18492b(this.f28133i, this.f28135k), C7614a.m18492b(this.f28132h, this.f28135k)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, TileMode.CLAMP);
        return linearGradient;
    }
}
