package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: androidx.core.graphics.drawable.c */
class C0561c extends C0560b {

    /* renamed from: l */
    private static Method f2625l;

    C0561c(Drawable drawable) {
        super(drawable);
        m2662b();
    }

    /* renamed from: b */
    private void m2662b() {
        if (f2625l == null) {
            try {
                f2625l = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo3116a() {
        if (VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f2624j;
        if ((drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable)) {
            return true;
        }
        return false;
    }

    public Rect getDirtyBounds() {
        return this.f2624j.getDirtyBounds();
    }

    public void getOutline(Outline outline) {
        this.f2624j.getOutline(outline);
    }

    public boolean isProjected() {
        Drawable drawable = this.f2624j;
        if (drawable != null) {
            Method method = f2625l;
            if (method != null) {
                try {
                    return ((Boolean) method.invoke(drawable, new Object[0])).booleanValue();
                } catch (Exception e) {
                    Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", e);
                }
            }
        }
        return false;
    }

    public void setHotspot(float f, float f2) {
        this.f2624j.setHotspot(f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.f2624j.setHotspotBounds(i, i2, i3, i4);
    }

    public boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    public void setTint(int i) {
        if (mo3116a()) {
            super.setTint(i);
        } else {
            this.f2624j.setTint(i);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (mo3116a()) {
            super.setTintList(colorStateList);
        } else {
            this.f2624j.setTintList(colorStateList);
        }
    }

    public void setTintMode(Mode mode) {
        if (mo3116a()) {
            super.setTintMode(mode);
        } else {
            this.f2624j.setTintMode(mode);
        }
    }

    C0561c(C0562d dVar, Resources resources) {
        super(dVar, resources);
        m2662b();
    }
}
