package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;

/* renamed from: androidx.core.graphics.drawable.b */
class C0560b extends Drawable implements Callback, WrappedDrawable, TintAwareDrawable {

    /* renamed from: k */
    static final Mode f2618k = Mode.SRC_IN;

    /* renamed from: e */
    private int f2619e;

    /* renamed from: f */
    private Mode f2620f;

    /* renamed from: g */
    private boolean f2621g;

    /* renamed from: h */
    C0562d f2622h;

    /* renamed from: i */
    private boolean f2623i;

    /* renamed from: j */
    Drawable f2624j;

    C0560b(C0562d dVar, Resources resources) {
        this.f2622h = dVar;
        m2658a(resources);
    }

    /* renamed from: a */
    private void m2658a(Resources resources) {
        C0562d dVar = this.f2622h;
        if (dVar != null) {
            ConstantState constantState = dVar.f2627b;
            if (constantState != null) {
                setWrappedDrawable(constantState.newDrawable(resources));
            }
        }
    }

    /* renamed from: b */
    private C0562d m2660b() {
        return new C0562d(this.f2622h);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo3116a() {
        return true;
    }

    public void draw(Canvas canvas) {
        this.f2624j.draw(canvas);
    }

    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        C0562d dVar = this.f2622h;
        return changingConfigurations | (dVar != null ? dVar.getChangingConfigurations() : 0) | this.f2624j.getChangingConfigurations();
    }

    public ConstantState getConstantState() {
        C0562d dVar = this.f2622h;
        if (dVar == null || !dVar.mo3151a()) {
            return null;
        }
        this.f2622h.f2626a = getChangingConfigurations();
        return this.f2622h;
    }

    public Drawable getCurrent() {
        return this.f2624j.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f2624j.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f2624j.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f2624j.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f2624j.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f2624j.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f2624j.getPadding(rect);
    }

    public int[] getState() {
        return this.f2624j.getState();
    }

    public Region getTransparentRegion() {
        return this.f2624j.getTransparentRegion();
    }

    public final Drawable getWrappedDrawable() {
        return this.f2624j;
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return this.f2624j.isAutoMirrored();
    }

    public boolean isStateful() {
        ColorStateList colorStateList;
        if (mo3116a()) {
            C0562d dVar = this.f2622h;
            if (dVar != null) {
                colorStateList = dVar.f2628c;
                return (colorStateList == null && colorStateList.isStateful()) || this.f2624j.isStateful();
            }
        }
        colorStateList = null;
        if (colorStateList == null) {
        }
    }

    public void jumpToCurrentState() {
        this.f2624j.jumpToCurrentState();
    }

    public Drawable mutate() {
        if (!this.f2623i && super.mutate() == this) {
            this.f2622h = m2660b();
            Drawable drawable = this.f2624j;
            if (drawable != null) {
                drawable.mutate();
            }
            C0562d dVar = this.f2622h;
            if (dVar != null) {
                Drawable drawable2 = this.f2624j;
                dVar.f2627b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f2623i = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2624j;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        return this.f2624j.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f2624j.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        this.f2624j.setAutoMirrored(z);
    }

    public void setChangingConfigurations(int i) {
        this.f2624j.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f2624j.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f2624j.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f2624j.setFilterBitmap(z);
    }

    public boolean setState(int[] iArr) {
        return m2659a(iArr) || this.f2624j.setState(iArr);
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f2622h.f2628c = colorStateList;
        m2659a(getState());
    }

    public void setTintMode(Mode mode) {
        this.f2622h.f2629d = mode;
        m2659a(getState());
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f2624j.setVisible(z, z2);
    }

    public final void setWrappedDrawable(Drawable drawable) {
        Drawable drawable2 = this.f2624j;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f2624j = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            C0562d dVar = this.f2622h;
            if (dVar != null) {
                dVar.f2627b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    /* renamed from: a */
    private boolean m2659a(int[] iArr) {
        if (!mo3116a()) {
            return false;
        }
        C0562d dVar = this.f2622h;
        ColorStateList colorStateList = dVar.f2628c;
        Mode mode = dVar.f2629d;
        if (colorStateList == null || mode == null) {
            this.f2621g = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!(this.f2621g && colorForState == this.f2619e && mode == this.f2620f)) {
                setColorFilter(colorForState, mode);
                this.f2619e = colorForState;
                this.f2620f = mode;
                this.f2621g = true;
                return true;
            }
        }
        return false;
    }

    C0560b(Drawable drawable) {
        this.f2622h = m2660b();
        setWrappedDrawable(drawable);
    }
}
