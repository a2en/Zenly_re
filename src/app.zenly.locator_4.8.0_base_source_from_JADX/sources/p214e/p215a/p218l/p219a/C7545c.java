package p214e.p215a.p218l.p219a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import androidx.core.graphics.drawable.C0559a;

/* renamed from: e.a.l.a.c */
public class C7545c extends Drawable implements Callback {

    /* renamed from: e */
    private Drawable f18962e;

    public C7545c(Drawable drawable) {
        mo19402a(drawable);
    }

    /* renamed from: a */
    public Drawable mo19401a() {
        return this.f18962e;
    }

    public void draw(Canvas canvas) {
        this.f18962e.draw(canvas);
    }

    public int getChangingConfigurations() {
        return this.f18962e.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.f18962e.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f18962e.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f18962e.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f18962e.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f18962e.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f18962e.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f18962e.getPadding(rect);
    }

    public int[] getState() {
        return this.f18962e.getState();
    }

    public Region getTransparentRegion() {
        return this.f18962e.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return C0559a.m2654f(this.f18962e);
    }

    public boolean isStateful() {
        return this.f18962e.isStateful();
    }

    public void jumpToCurrentState() {
        C0559a.m2655g(this.f18962e);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f18962e.setBounds(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        return this.f18962e.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f18962e.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        C0559a.m2646a(this.f18962e, z);
    }

    public void setChangingConfigurations(int i) {
        this.f18962e.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f18962e.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f18962e.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f18962e.setFilterBitmap(z);
    }

    public void setHotspot(float f, float f2) {
        C0559a.m2640a(this.f18962e, f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        C0559a.m2641a(this.f18962e, i, i2, i3, i4);
    }

    public boolean setState(int[] iArr) {
        return this.f18962e.setState(iArr);
    }

    public void setTint(int i) {
        C0559a.m2650b(this.f18962e, i);
    }

    public void setTintList(ColorStateList colorStateList) {
        C0559a.m2642a(this.f18962e, colorStateList);
    }

    public void setTintMode(Mode mode) {
        C0559a.m2645a(this.f18962e, mode);
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f18962e.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    /* renamed from: a */
    public void mo19402a(Drawable drawable) {
        Drawable drawable2 = this.f18962e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f18962e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }
}
