package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.LinearLayoutCompat;
import p333g.p357d.p358a.p361b.C12076k;

public class ForegroundLinearLayout extends LinearLayoutCompat {

    /* renamed from: e */
    private Drawable f28106e;

    /* renamed from: f */
    private final Rect f28107f;

    /* renamed from: g */
    private final Rect f28108g;

    /* renamed from: h */
    private int f28109h;

    /* renamed from: i */
    protected boolean f28110i;

    /* renamed from: j */
    boolean f28111j;

    public ForegroundLinearLayout(Context context) {
        this(context, null);
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f28106e;
        if (drawable != null) {
            if (this.f28111j) {
                this.f28111j = false;
                Rect rect = this.f28107f;
                Rect rect2 = this.f28108g;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f28110i) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f28109h, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @TargetApi(21)
    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f28106e;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f28106e;
        if (drawable != null && drawable.isStateful()) {
            this.f28106e.setState(getDrawableState());
        }
    }

    public Drawable getForeground() {
        return this.f28106e;
    }

    public int getForegroundGravity() {
        return this.f28109h;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f28106e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f28111j = z | this.f28111j;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f28111j = true;
    }

    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f28106e;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f28106e);
            }
            this.f28106e = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f28109h == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public void setForegroundGravity(int i) {
        if (this.f28109h != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f28109h = i;
            if (this.f28109h == 119 && this.f28106e != null) {
                this.f28106e.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f28106e;
    }

    public ForegroundLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ForegroundLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f28107f = new Rect();
        this.f28108g = new Rect();
        this.f28109h = 119;
        this.f28110i = true;
        this.f28111j = false;
        TypedArray c = C10793g.m27778c(context, attributeSet, C12076k.ForegroundLinearLayout, i, 0, new int[0]);
        this.f28109h = c.getInt(C12076k.ForegroundLinearLayout_android_foregroundGravity, this.f28109h);
        Drawable drawable = c.getDrawable(C12076k.ForegroundLinearLayout_android_foreground);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f28110i = c.getBoolean(C12076k.ForegroundLinearLayout_foregroundInsidePadding, true);
        c.recycle();
    }
}
