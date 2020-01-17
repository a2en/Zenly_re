package com.google.android.material.shadow;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import androidx.core.content.C0540a;
import p214e.p215a.p218l.p219a.C7545c;
import p333g.p357d.p358a.p361b.C12068c;

/* renamed from: com.google.android.material.shadow.a */
public class C10796a extends C7545c {

    /* renamed from: u */
    static final double f28200u = Math.cos(Math.toRadians(45.0d));

    /* renamed from: f */
    final Paint f28201f;

    /* renamed from: g */
    final Paint f28202g;

    /* renamed from: h */
    final RectF f28203h;

    /* renamed from: i */
    float f28204i;

    /* renamed from: j */
    Path f28205j;

    /* renamed from: k */
    float f28206k;

    /* renamed from: l */
    float f28207l;

    /* renamed from: m */
    float f28208m;

    /* renamed from: n */
    private boolean f28209n = true;

    /* renamed from: o */
    private final int f28210o;

    /* renamed from: p */
    private final int f28211p;

    /* renamed from: q */
    private final int f28212q;

    /* renamed from: r */
    private boolean f28213r = true;

    /* renamed from: s */
    private float f28214s;

    /* renamed from: t */
    private boolean f28215t = false;

    public C10796a(Context context, Drawable drawable, float f, float f2, float f3) {
        super(drawable);
        this.f28210o = C0540a.m2536a(context, C12068c.design_fab_shadow_start_color);
        this.f28211p = C0540a.m2536a(context, C12068c.design_fab_shadow_mid_color);
        this.f28212q = C0540a.m2536a(context, C12068c.design_fab_shadow_end_color);
        this.f28201f = new Paint(5);
        this.f28201f.setStyle(Style.FILL);
        this.f28204i = (float) Math.round(f);
        this.f28203h = new RectF();
        this.f28202g = new Paint(this.f28201f);
        this.f28202g.setAntiAlias(false);
        mo31257a(f2, f3);
    }

    /* renamed from: c */
    private static int m27786c(float f) {
        int round = Math.round(f);
        return round % 2 == 1 ? round - 1 : round;
    }

    /* renamed from: a */
    public void mo31258a(boolean z) {
        this.f28213r = z;
        invalidateSelf();
    }

    /* renamed from: b */
    public void mo31260b(float f) {
        mo31257a(f, this.f28206k);
    }

    public void draw(Canvas canvas) {
        if (this.f28209n) {
            m27784a(getBounds());
            this.f28209n = false;
        }
        m27783a(canvas);
        super.draw(canvas);
    }

    public int getOpacity() {
        return -3;
    }

    public boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil((double) m27785b(this.f28206k, this.f28204i, this.f28213r));
        int ceil2 = (int) Math.ceil((double) m27782a(this.f28206k, this.f28204i, this.f28213r));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f28209n = true;
    }

    public void setAlpha(int i) {
        super.setAlpha(i);
        this.f28201f.setAlpha(i);
        this.f28202g.setAlpha(i);
    }

    /* renamed from: b */
    public float mo31259b() {
        return this.f28208m;
    }

    /* renamed from: b */
    public static float m27785b(float f, float f2, boolean z) {
        return z ? (float) (((double) (f * 1.5f)) + ((1.0d - f28200u) * ((double) f2))) : f * 1.5f;
    }

    /* renamed from: c */
    private void m27787c() {
        float f = this.f28204i;
        RectF rectF = new RectF(-f, -f, f, f);
        RectF rectF2 = new RectF(rectF);
        float f2 = this.f28207l;
        rectF2.inset(-f2, -f2);
        Path path = this.f28205j;
        if (path == null) {
            this.f28205j = new Path();
        } else {
            path.reset();
        }
        this.f28205j.setFillType(FillType.EVEN_ODD);
        this.f28205j.moveTo(-this.f28204i, 0.0f);
        this.f28205j.rLineTo(-this.f28207l, 0.0f);
        this.f28205j.arcTo(rectF2, 180.0f, 90.0f, false);
        this.f28205j.arcTo(rectF, 270.0f, -90.0f, false);
        this.f28205j.close();
        float f3 = -rectF2.top;
        if (f3 > 0.0f) {
            float f4 = this.f28204i / f3;
            float f5 = ((1.0f - f4) / 2.0f) + f4;
            Paint paint = this.f28201f;
            RadialGradient radialGradient = r8;
            RadialGradient radialGradient2 = new RadialGradient(0.0f, 0.0f, f3, new int[]{0, this.f28210o, this.f28211p, this.f28212q}, new float[]{0.0f, f4, f5, 1.0f}, TileMode.CLAMP);
            paint.setShader(radialGradient);
        }
        Paint paint2 = this.f28202g;
        LinearGradient linearGradient = new LinearGradient(0.0f, rectF.top, 0.0f, rectF2.top, new int[]{this.f28210o, this.f28211p, this.f28212q}, new float[]{0.0f, 0.5f, 1.0f}, TileMode.CLAMP);
        paint2.setShader(linearGradient);
        this.f28202g.setAntiAlias(false);
    }

    /* renamed from: a */
    public void mo31257a(float f, float f2) {
        if (f < 0.0f || f2 < 0.0f) {
            throw new IllegalArgumentException("invalid shadow size");
        }
        float c = (float) m27786c(f);
        float c2 = (float) m27786c(f2);
        if (c > c2) {
            if (!this.f28215t) {
                this.f28215t = true;
            }
            c = c2;
        }
        if (this.f28208m != c || this.f28206k != c2) {
            this.f28208m = c;
            this.f28206k = c2;
            this.f28207l = (float) Math.round(c * 1.5f);
            this.f28209n = true;
            invalidateSelf();
        }
    }

    /* renamed from: a */
    public static float m27782a(float f, float f2, boolean z) {
        return z ? (float) (((double) f) + ((1.0d - f28200u) * ((double) f2))) : f;
    }

    /* renamed from: a */
    public final void mo31256a(float f) {
        if (this.f28214s != f) {
            this.f28214s = f;
            invalidateSelf();
        }
    }

    /* renamed from: a */
    private void m27783a(Canvas canvas) {
        float f;
        int i;
        int i2;
        float f2;
        float f3;
        float f4;
        Canvas canvas2 = canvas;
        int save = canvas.save();
        canvas2.rotate(this.f28214s, this.f28203h.centerX(), this.f28203h.centerY());
        float f5 = this.f28204i;
        float f6 = (-f5) - this.f28207l;
        float f7 = f5 * 2.0f;
        boolean z = this.f28203h.width() - f7 > 0.0f;
        boolean z2 = this.f28203h.height() - f7 > 0.0f;
        float f8 = this.f28208m;
        float f9 = f5 / ((f8 - (0.5f * f8)) + f5);
        float f10 = f5 / ((f8 - (0.25f * f8)) + f5);
        float f11 = f5 / ((f8 - (f8 * 1.0f)) + f5);
        int save2 = canvas.save();
        RectF rectF = this.f28203h;
        canvas2.translate(rectF.left + f5, rectF.top + f5);
        canvas2.scale(f9, f10);
        canvas2.drawPath(this.f28205j, this.f28201f);
        if (z) {
            canvas2.scale(1.0f / f9, 1.0f);
            i2 = save2;
            f = f11;
            i = save;
            f2 = f10;
            canvas.drawRect(0.0f, f6, this.f28203h.width() - f7, -this.f28204i, this.f28202g);
        } else {
            i2 = save2;
            f = f11;
            i = save;
            f2 = f10;
        }
        canvas2.restoreToCount(i2);
        int save3 = canvas.save();
        RectF rectF2 = this.f28203h;
        canvas2.translate(rectF2.right - f5, rectF2.bottom - f5);
        float f12 = f;
        canvas2.scale(f9, f12);
        canvas2.rotate(180.0f);
        canvas2.drawPath(this.f28205j, this.f28201f);
        if (z) {
            canvas2.scale(1.0f / f9, 1.0f);
            f3 = f2;
            f4 = f12;
            canvas.drawRect(0.0f, f6, this.f28203h.width() - f7, (-this.f28204i) + this.f28207l, this.f28202g);
        } else {
            f3 = f2;
            f4 = f12;
        }
        canvas2.restoreToCount(save3);
        int save4 = canvas.save();
        RectF rectF3 = this.f28203h;
        canvas2.translate(rectF3.left + f5, rectF3.bottom - f5);
        canvas2.scale(f9, f4);
        canvas2.rotate(270.0f);
        canvas2.drawPath(this.f28205j, this.f28201f);
        if (z2) {
            canvas2.scale(1.0f / f4, 1.0f);
            canvas.drawRect(0.0f, f6, this.f28203h.height() - f7, -this.f28204i, this.f28202g);
        }
        canvas2.restoreToCount(save4);
        int save5 = canvas.save();
        RectF rectF4 = this.f28203h;
        canvas2.translate(rectF4.right - f5, rectF4.top + f5);
        float f13 = f3;
        canvas2.scale(f9, f13);
        canvas2.rotate(90.0f);
        canvas2.drawPath(this.f28205j, this.f28201f);
        if (z2) {
            canvas2.scale(1.0f / f13, 1.0f);
            canvas.drawRect(0.0f, f6, this.f28203h.height() - f7, -this.f28204i, this.f28202g);
        }
        canvas2.restoreToCount(save5);
        canvas2.restoreToCount(i);
    }

    /* renamed from: a */
    private void m27784a(Rect rect) {
        float f = this.f28206k;
        float f2 = 1.5f * f;
        this.f28203h.set(((float) rect.left) + f, ((float) rect.top) + f2, ((float) rect.right) - f, ((float) rect.bottom) - f2);
        Drawable a = mo19401a();
        RectF rectF = this.f28203h;
        a.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        m27787c();
    }
}
