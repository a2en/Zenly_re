package com.facebook.drawee.drawable;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import com.facebook.common.internal.C9536j;

/* renamed from: com.facebook.drawee.drawable.a */
public class C9609a extends Drawable implements Callback, TransformCallback, TransformAwareDrawable {

    /* renamed from: e */
    private TransformCallback f24956e;

    /* renamed from: f */
    private final C9611c f24957f = new C9611c();

    /* renamed from: g */
    private final Drawable[] f24958g;

    /* renamed from: h */
    private final Rect f24959h = new Rect();

    /* renamed from: i */
    private boolean f24960i;

    /* renamed from: j */
    private boolean f24961j;

    public C9609a(Drawable[] drawableArr) {
        int i = 0;
        this.f24960i = false;
        this.f24961j = false;
        C9536j.m23271a(drawableArr);
        this.f24958g = drawableArr;
        while (true) {
            Drawable[] drawableArr2 = this.f24958g;
            if (i < drawableArr2.length) {
                C9612d.m23593a(drawableArr2[i], this, this);
                i++;
            } else {
                DrawableParent[] drawableParentArr = new DrawableParent[drawableArr2.length];
                return;
            }
        }
    }

    /* renamed from: a */
    public int mo25941a() {
        return this.f24958g.length;
    }

    public void draw(Canvas canvas) {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f24958g;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.draw(canvas);
                }
                i++;
            } else {
                return;
            }
        }
    }

    public int getIntrinsicHeight() {
        int i = 0;
        int i2 = -1;
        while (true) {
            Drawable[] drawableArr = this.f24958g;
            if (i >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                i2 = Math.max(i2, drawable.getIntrinsicHeight());
            }
            i++;
        }
        if (i2 > 0) {
            return i2;
        }
        return -1;
    }

    public int getIntrinsicWidth() {
        int i = 0;
        int i2 = -1;
        while (true) {
            Drawable[] drawableArr = this.f24958g;
            if (i >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                i2 = Math.max(i2, drawable.getIntrinsicWidth());
            }
            i++;
        }
        if (i2 > 0) {
            return i2;
        }
        return -1;
    }

    public int getOpacity() {
        if (this.f24958g.length == 0) {
            return -2;
        }
        int i = -1;
        int i2 = 1;
        while (true) {
            Drawable[] drawableArr = this.f24958g;
            if (i2 >= drawableArr.length) {
                return i;
            }
            Drawable drawable = drawableArr[i2];
            if (drawable != null) {
                i = Drawable.resolveOpacity(i, drawable.getOpacity());
            }
            i2++;
        }
    }

    public boolean getPadding(Rect rect) {
        int i = 0;
        rect.left = 0;
        rect.top = 0;
        rect.right = 0;
        rect.bottom = 0;
        Rect rect2 = this.f24959h;
        while (true) {
            Drawable[] drawableArr = this.f24958g;
            if (i >= drawableArr.length) {
                return true;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.getPadding(rect2);
                rect.left = Math.max(rect.left, rect2.left);
                rect.top = Math.max(rect.top, rect2.top);
                rect.right = Math.max(rect.right, rect2.right);
                rect.bottom = Math.max(rect.bottom, rect2.bottom);
            }
            i++;
        }
    }

    public void getRootBounds(RectF rectF) {
        TransformCallback transformCallback = this.f24956e;
        if (transformCallback != null) {
            transformCallback.getRootBounds(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    public void getTransform(Matrix matrix) {
        TransformCallback transformCallback = this.f24956e;
        if (transformCallback != null) {
            transformCallback.getTransform(matrix);
        } else {
            matrix.reset();
        }
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isStateful() {
        if (!this.f24961j) {
            this.f24960i = false;
            int i = 0;
            while (true) {
                Drawable[] drawableArr = this.f24958g;
                boolean z = true;
                if (i >= drawableArr.length) {
                    break;
                }
                Drawable drawable = drawableArr[i];
                boolean z2 = this.f24960i;
                if (drawable == null || !drawable.isStateful()) {
                    z = false;
                }
                this.f24960i = z2 | z;
                i++;
            }
            this.f24961j = true;
        }
        return this.f24960i;
    }

    public Drawable mutate() {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f24958g;
            if (i >= drawableArr.length) {
                return this;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.mutate();
            }
            i++;
        }
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f24958g;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.setBounds(rect);
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        int i2 = 0;
        boolean z = false;
        while (true) {
            Drawable[] drawableArr = this.f24958g;
            if (i2 >= drawableArr.length) {
                return z;
            }
            Drawable drawable = drawableArr[i2];
            if (drawable != null && drawable.setLevel(i)) {
                z = true;
            }
            i2++;
        }
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        int i = 0;
        boolean z = false;
        while (true) {
            Drawable[] drawableArr = this.f24958g;
            if (i >= drawableArr.length) {
                return z;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null && drawable.setState(iArr)) {
                z = true;
            }
            i++;
        }
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f24957f.mo25964a(i);
        int i2 = 0;
        while (true) {
            Drawable[] drawableArr = this.f24958g;
            if (i2 < drawableArr.length) {
                Drawable drawable = drawableArr[i2];
                if (drawable != null) {
                    drawable.setAlpha(i);
                }
                i2++;
            } else {
                return;
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f24957f.mo25965a(colorFilter);
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f24958g;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.setColorFilter(colorFilter);
                }
                i++;
            } else {
                return;
            }
        }
    }

    public void setDither(boolean z) {
        this.f24957f.mo25967a(z);
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f24958g;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.setDither(z);
                }
                i++;
            } else {
                return;
            }
        }
    }

    public void setFilterBitmap(boolean z) {
        this.f24957f.mo25968b(z);
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f24958g;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.setFilterBitmap(z);
                }
                i++;
            } else {
                return;
            }
        }
    }

    @TargetApi(21)
    public void setHotspot(float f, float f2) {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f24958g;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.setHotspot(f, f2);
                }
                i++;
            } else {
                return;
            }
        }
    }

    public void setTransformCallback(TransformCallback transformCallback) {
        this.f24956e = transformCallback;
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f24958g;
            if (i >= drawableArr.length) {
                return visible;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.setVisible(z, z2);
            }
            i++;
        }
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    /* renamed from: a */
    public Drawable mo25942a(int i) {
        boolean z = true;
        C9536j.m23275a(i >= 0);
        if (i >= this.f24958g.length) {
            z = false;
        }
        C9536j.m23275a(z);
        return this.f24958g[i];
    }
}
