package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.facebook.common.internal.C9532i;
import com.facebook.common.internal.C9536j;
import com.facebook.drawee.drawable.ScalingUtils.ScaleType;
import com.facebook.drawee.drawable.ScalingUtils.StatefulScaleType;

/* renamed from: com.facebook.drawee.drawable.m */
public class C9623m extends C9614f {

    /* renamed from: h */
    ScaleType f25059h;

    /* renamed from: i */
    Object f25060i;

    /* renamed from: j */
    PointF f25061j = null;

    /* renamed from: k */
    int f25062k = 0;

    /* renamed from: l */
    int f25063l = 0;

    /* renamed from: m */
    Matrix f25064m;

    /* renamed from: n */
    private Matrix f25065n = new Matrix();

    public C9623m(Drawable drawable, ScaleType scaleType) {
        C9536j.m23271a(drawable);
        super(drawable);
        this.f25059h = scaleType;
    }

    /* renamed from: c */
    private void m23620c() {
        boolean z;
        ScaleType scaleType = this.f25059h;
        boolean z2 = true;
        if (scaleType instanceof StatefulScaleType) {
            Object state = ((StatefulScaleType) scaleType).getState();
            z = state == null || !state.equals(this.f25060i);
            this.f25060i = state;
        } else {
            z = false;
        }
        if (this.f25062k == getCurrent().getIntrinsicWidth() && this.f25063l == getCurrent().getIntrinsicHeight()) {
            z2 = false;
        }
        if (z2 || z) {
            mo26024a();
        }
    }

    /* renamed from: a */
    public Drawable mo25979a(Drawable drawable) {
        Drawable a = super.mo25979a(drawable);
        mo26024a();
        return a;
    }

    /* renamed from: b */
    public ScaleType mo26026b() {
        return this.f25059h;
    }

    public void draw(Canvas canvas) {
        m23620c();
        if (this.f25064m != null) {
            int save = canvas.save();
            canvas.clipRect(getBounds());
            canvas.concat(this.f25064m);
            super.draw(canvas);
            canvas.restoreToCount(save);
            return;
        }
        super.draw(canvas);
    }

    public void getTransform(Matrix matrix) {
        mo25980a(matrix);
        m23620c();
        Matrix matrix2 = this.f25064m;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        mo26024a();
    }

    /* renamed from: a */
    public void mo26025a(PointF pointF) {
        if (!C9532i.m23264a(this.f25061j, pointF)) {
            if (this.f25061j == null) {
                this.f25061j = new PointF();
            }
            this.f25061j.set(pointF);
            mo26024a();
            invalidateSelf();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo26024a() {
        Drawable current = getCurrent();
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        int intrinsicWidth = current.getIntrinsicWidth();
        this.f25062k = intrinsicWidth;
        int intrinsicHeight = current.getIntrinsicHeight();
        this.f25063l = intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            current.setBounds(bounds);
            this.f25064m = null;
        } else if (intrinsicWidth == width && intrinsicHeight == height) {
            current.setBounds(bounds);
            this.f25064m = null;
        } else if (this.f25059h == ScaleType.f24938a) {
            current.setBounds(bounds);
            this.f25064m = null;
        } else {
            current.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            ScaleType scaleType = this.f25059h;
            Matrix matrix = this.f25065n;
            PointF pointF = this.f25061j;
            float f = pointF != null ? pointF.x : 0.5f;
            PointF pointF2 = this.f25061j;
            scaleType.getTransform(matrix, bounds, intrinsicWidth, intrinsicHeight, f, pointF2 != null ? pointF2.y : 0.5f);
            this.f25064m = this.f25065n;
        }
    }
}
