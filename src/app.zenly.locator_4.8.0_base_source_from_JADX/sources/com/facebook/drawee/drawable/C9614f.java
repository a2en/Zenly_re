package com.facebook.drawee.drawable;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;

/* renamed from: com.facebook.drawee.drawable.f */
public class C9614f extends Drawable implements Callback, TransformCallback, TransformAwareDrawable, DrawableParent {

    /* renamed from: e */
    private Drawable f24982e;

    /* renamed from: f */
    private final C9611c f24983f = new C9611c();

    /* renamed from: g */
    protected TransformCallback f24984g;

    static {
        new Matrix();
    }

    public C9614f(Drawable drawable) {
        this.f24982e = drawable;
        C9612d.m23593a(this.f24982e, this, this);
    }

    /* renamed from: a */
    public Drawable mo25979a(Drawable drawable) {
        Drawable b = mo25981b(drawable);
        invalidateSelf();
        return b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Drawable mo25981b(Drawable drawable) {
        Drawable drawable2 = this.f24982e;
        C9612d.m23593a(drawable2, null, null);
        C9612d.m23593a(drawable, null, null);
        C9612d.m23595a(drawable, this.f24983f);
        C9612d.m23594a(drawable, (Drawable) this);
        C9612d.m23593a(drawable, this, this);
        this.f24982e = drawable;
        return drawable2;
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f24982e;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    public ConstantState getConstantState() {
        Drawable drawable = this.f24982e;
        if (drawable == null) {
            return super.getConstantState();
        }
        return drawable.getConstantState();
    }

    public Drawable getCurrent() {
        return this.f24982e;
    }

    public Drawable getDrawable() {
        return getCurrent();
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f24982e;
        if (drawable == null) {
            return super.getIntrinsicHeight();
        }
        return drawable.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f24982e;
        if (drawable == null) {
            return super.getIntrinsicWidth();
        }
        return drawable.getIntrinsicWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.f24982e;
        if (drawable == null) {
            return 0;
        }
        return drawable.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        Drawable drawable = this.f24982e;
        if (drawable == null) {
            return super.getPadding(rect);
        }
        return drawable.getPadding(rect);
    }

    public void getRootBounds(RectF rectF) {
        TransformCallback transformCallback = this.f24984g;
        if (transformCallback != null) {
            transformCallback.getRootBounds(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    public void getTransform(Matrix matrix) {
        mo25980a(matrix);
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isStateful() {
        Drawable drawable = this.f24982e;
        if (drawable == null) {
            return false;
        }
        return drawable.isStateful();
    }

    public Drawable mutate() {
        Drawable drawable = this.f24982e;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f24982e;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f24982e;
        if (drawable == null) {
            return super.onLevelChange(i);
        }
        return drawable.setLevel(i);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f24982e;
        if (drawable == null) {
            return super.onStateChange(iArr);
        }
        return drawable.setState(iArr);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f24983f.mo25964a(i);
        Drawable drawable = this.f24982e;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f24983f.mo25965a(colorFilter);
        Drawable drawable = this.f24982e;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }

    public void setDither(boolean z) {
        this.f24983f.mo25967a(z);
        Drawable drawable = this.f24982e;
        if (drawable != null) {
            drawable.setDither(z);
        }
    }

    public Drawable setDrawable(Drawable drawable) {
        return mo25979a(drawable);
    }

    public void setFilterBitmap(boolean z) {
        this.f24983f.mo25968b(z);
        Drawable drawable = this.f24982e;
        if (drawable != null) {
            drawable.setFilterBitmap(z);
        }
    }

    @TargetApi(21)
    public void setHotspot(float f, float f2) {
        Drawable drawable = this.f24982e;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    public void setTransformCallback(TransformCallback transformCallback) {
        this.f24984g = transformCallback;
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f24982e;
        if (drawable == null) {
            return visible;
        }
        return drawable.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo25980a(Matrix matrix) {
        TransformCallback transformCallback = this.f24984g;
        if (transformCallback != null) {
            transformCallback.getTransform(matrix);
        } else {
            matrix.reset();
        }
    }
}
