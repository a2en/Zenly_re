package com.google.android.material.floatingactionbutton;

import android.animation.Animator.AnimatorListener;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView.ScaleType;
import androidx.appcompat.widget.C0250e;
import androidx.appcompat.widget.C0255g;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0487b;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0489d;
import androidx.core.graphics.drawable.C0559a;
import androidx.core.view.TintableBackgroundView;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TintableImageSourceView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.expandable.C10764a;
import com.google.android.material.expandable.ExpandableTransformationWidget;
import com.google.android.material.internal.C10788d;
import com.google.android.material.internal.C10793g;
import com.google.android.material.internal.C10794h;
import com.google.android.material.internal.VisibilityAwareImageButton;
import com.google.android.material.shadow.ShadowViewDelegate;
import com.google.android.material.stateful.ExtendableSavedState;
import java.util.List;
import p333g.p357d.p358a.p361b.C12067b;
import p333g.p357d.p358a.p361b.C12069d;
import p333g.p357d.p358a.p361b.C12075j;
import p333g.p357d.p358a.p361b.C12076k;
import p333g.p357d.p358a.p361b.p362l.C12084h;
import p333g.p357d.p358a.p361b.p364n.C12088a;

@C0487b(Behavior.class)
public class FloatingActionButton extends VisibilityAwareImageButton implements TintableBackgroundView, TintableImageSourceView, ExpandableTransformationWidget {

    /* renamed from: f */
    private ColorStateList f28027f;

    /* renamed from: g */
    private Mode f28028g;

    /* renamed from: h */
    private ColorStateList f28029h;

    /* renamed from: i */
    private Mode f28030i;

    /* renamed from: j */
    private int f28031j;

    /* renamed from: k */
    private ColorStateList f28032k;

    /* renamed from: l */
    private int f28033l;

    /* renamed from: m */
    private int f28034m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public int f28035n;

    /* renamed from: o */
    private int f28036o;

    /* renamed from: p */
    boolean f28037p;

    /* renamed from: q */
    final Rect f28038q;

    /* renamed from: r */
    private final Rect f28039r;

    /* renamed from: s */
    private final C0255g f28040s;

    /* renamed from: t */
    private final C10764a f28041t;

    /* renamed from: u */
    private C10768a f28042u;

    protected static class BaseBehavior<T extends FloatingActionButton> extends androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior<T> {

        /* renamed from: a */
        private Rect f28043a;

        /* renamed from: b */
        private C10766b f28044b;

        /* renamed from: c */
        private boolean f28045c;

        public BaseBehavior() {
            this.f28045c = true;
        }

        /* renamed from: b */
        private boolean m27630b(View view, FloatingActionButton floatingActionButton) {
            if (!m27628a(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((C0489d) floatingActionButton.getLayoutParams()).topMargin) {
                floatingActionButton.mo31052a(this.f28044b, false);
            } else {
                floatingActionButton.mo31057b(this.f28044b, false);
            }
            return true;
        }

        /* renamed from: a */
        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                m27629a(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
            } else if (m27627a(view)) {
                m27630b(view, floatingActionButton);
            }
            return false;
        }

        public void onAttachedToLayoutParams(C0489d dVar) {
            if (dVar.f2368h == 0) {
                dVar.f2368h = 80;
            }
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C12076k.FloatingActionButton_Behavior_Layout);
            this.f28045c = obtainStyledAttributes.getBoolean(C12076k.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        private static boolean m27627a(View view) {
            LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof C0489d) {
                return ((C0489d) layoutParams).mo2901d() instanceof BottomSheetBehavior;
            }
            return false;
        }

        /* renamed from: a */
        private boolean m27628a(View view, FloatingActionButton floatingActionButton) {
            C0489d dVar = (C0489d) floatingActionButton.getLayoutParams();
            if (this.f28045c && dVar.mo2900c() == view.getId() && floatingActionButton.getUserSetVisibility() == 0) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        private boolean m27629a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!m27628a((View) appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f28043a == null) {
                this.f28043a = new Rect();
            }
            Rect rect = this.f28043a;
            C10788d.m27761a((ViewGroup) coordinatorLayout, (View) appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.mo31052a(this.f28044b, false);
            } else {
                floatingActionButton.mo31057b(this.f28044b, false);
            }
            return true;
        }

        /* renamed from: a */
        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            List b = coordinatorLayout.mo2816b((View) floatingActionButton);
            int size = b.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = (View) b.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    if (m27627a(view) && m27630b(view, floatingActionButton)) {
                        break;
                    }
                } else if (m27629a(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.mo2818b((View) floatingActionButton, i);
            m27626a(coordinatorLayout, floatingActionButton);
            return true;
        }

        /* renamed from: a */
        public boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.f28038q;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        /* renamed from: a */
        private void m27626a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            Rect rect = floatingActionButton.f28038q;
            if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
                C0489d dVar = (C0489d) floatingActionButton.getLayoutParams();
                int i = 0;
                int i2 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - dVar.rightMargin ? rect.right : floatingActionButton.getLeft() <= dVar.leftMargin ? -rect.left : 0;
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - dVar.bottomMargin) {
                    i = rect.bottom;
                } else if (floatingActionButton.getTop() <= dVar.topMargin) {
                    i = -rect.top;
                }
                if (i != 0) {
                    ViewCompat.m2848e(floatingActionButton, i);
                }
                if (i2 != 0) {
                    ViewCompat.m2846d((View) floatingActionButton, i2);
                }
            }
        }
    }

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$a */
    class C10765a implements C10775g {

        /* renamed from: a */
        final /* synthetic */ C10766b f28046a;

        C10765a(C10766b bVar) {
            this.f28046a = bVar;
        }

        /* renamed from: a */
        public void mo31109a() {
            this.f28046a.mo31112b(FloatingActionButton.this);
        }

        /* renamed from: b */
        public void mo31110b() {
            this.f28046a.mo31111a(FloatingActionButton.this);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$b */
    public static abstract class C10766b {
        /* renamed from: a */
        public abstract void mo31111a(FloatingActionButton floatingActionButton);

        /* renamed from: b */
        public abstract void mo31112b(FloatingActionButton floatingActionButton);
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$c */
    private class C10767c implements ShadowViewDelegate {
        C10767c() {
        }

        public float getRadius() {
            return ((float) FloatingActionButton.this.getSizeDimension()) / 2.0f;
        }

        public boolean isCompatPaddingEnabled() {
            return FloatingActionButton.this.f28037p;
        }

        public void setBackgroundDrawable(Drawable drawable) {
            FloatingActionButton.super.setBackgroundDrawable(drawable);
        }

        public void setShadowPadding(int i, int i2, int i3, int i4) {
            FloatingActionButton.this.f28038q.set(i, i2, i3, i4);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i + floatingActionButton.f28035n, i2 + FloatingActionButton.this.f28035n, i3 + FloatingActionButton.this.f28035n, i4 + FloatingActionButton.this.f28035n);
        }
    }

    public FloatingActionButton(Context context) {
        this(context, null);
    }

    /* renamed from: e */
    private void m27612e() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            ColorStateList colorStateList = this.f28029h;
            if (colorStateList == null) {
                C0559a.m2649b(drawable);
                return;
            }
            int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
            Mode mode = this.f28030i;
            if (mode == null) {
                mode = Mode.SRC_IN;
            }
            drawable.mutate().setColorFilter(C0250e.m967a(colorForState, mode));
        }
    }

    private C10768a getImpl() {
        if (this.f28042u == null) {
            this.f28042u = m27611d();
        }
        return this.f28042u;
    }

    /* renamed from: b */
    public void mo31056b(C10766b bVar) {
        mo31057b(bVar, true);
    }

    /* renamed from: c */
    public void mo31059c() {
        mo31056b((C10766b) null);
    }

    /* renamed from: d */
    public void mo31061d(AnimatorListener animatorListener) {
        getImpl().mo31142d(animatorListener);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().mo31129a(getDrawableState());
    }

    public ColorStateList getBackgroundTintList() {
        return this.f28027f;
    }

    public Mode getBackgroundTintMode() {
        return this.f28028g;
    }

    public float getCompatElevation() {
        return getImpl().mo31137c();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().mo31143e();
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().mo31144f();
    }

    public Drawable getContentBackground() {
        return getImpl().mo31130b();
    }

    public int getCustomSize() {
        return this.f28034m;
    }

    public int getExpandedComponentIdHint() {
        return this.f28041t.mo31043a();
    }

    public C12084h getHideMotionSpec() {
        return getImpl().mo31140d();
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f28032k;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f28032k;
    }

    public C12084h getShowMotionSpec() {
        return getImpl().mo31145g();
    }

    public int getSize() {
        return this.f28033l;
    }

    /* access modifiers changed from: 0000 */
    public int getSizeDimension() {
        return m27605a(this.f28033l);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f28029h;
    }

    public Mode getSupportImageTintMode() {
        return this.f28030i;
    }

    public boolean getUseCompatPadding() {
        return this.f28037p;
    }

    public boolean isExpanded() {
        return this.f28041t.mo31047b();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().mo31148j();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().mo31151m();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().mo31153o();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int sizeDimension = getSizeDimension();
        this.f28035n = (sizeDimension - this.f28036o) / 2;
        getImpl().mo31157s();
        int min = Math.min(m27606a(sizeDimension, i), m27606a(sizeDimension, i2));
        Rect rect = this.f28038q;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.mo3548a());
        this.f28041t.mo31045a((Bundle) extendableSavedState.f28267g.get("expandableWidgetHelper"));
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        ExtendableSavedState extendableSavedState = new ExtendableSavedState(super.onSaveInstanceState());
        extendableSavedState.f28267g.put("expandableWidgetHelper", this.f28041t.mo31048c());
        return extendableSavedState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || !mo31053a(this.f28039r) || this.f28039r.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f28027f != colorStateList) {
            this.f28027f = colorStateList;
            getImpl().mo31123a(colorStateList);
        }
    }

    public void setBackgroundTintMode(Mode mode) {
        if (this.f28028g != mode) {
            this.f28028g = mode;
            getImpl().mo31125a(mode);
        }
    }

    public void setCompatElevation(float f) {
        getImpl().mo31119a(f);
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        getImpl().mo31131b(f);
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f) {
        getImpl().mo31141d(f);
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setCustomSize(int i) {
        if (i >= 0) {
            this.f28034m = i;
            return;
        }
        throw new IllegalArgumentException("Custom size must be non-negative");
    }

    public boolean setExpanded(boolean z) {
        return this.f28041t.mo31046a(z);
    }

    public void setExpandedComponentIdHint(int i) {
        this.f28041t.mo31044a(i);
    }

    public void setHideMotionSpec(C12084h hVar) {
        getImpl().mo31128a(hVar);
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(C12084h.m31883a(getContext(), i));
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        getImpl().mo31156r();
    }

    public void setImageResource(int i) {
        this.f28040s.mo1906a(i);
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    public void setShowMotionSpec(C12084h hVar) {
        getImpl().mo31136b(hVar);
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(C12084h.m31883a(getContext(), i));
    }

    public void setSize(int i) {
        this.f28034m = 0;
        if (i != this.f28033l) {
            this.f28033l = i;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f28029h != colorStateList) {
            this.f28029h = colorStateList;
            m27612e();
        }
    }

    public void setSupportImageTintMode(Mode mode) {
        if (this.f28030i != mode) {
            this.f28030i = mode;
            m27612e();
        }
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f28037p != z) {
            this.f28037p = z;
            getImpl().mo31152n();
        }
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C12067b.floatingActionButtonStyle);
    }

    /* renamed from: d */
    private C10768a m27611d() {
        if (VERSION.SDK_INT >= 21) {
            return new C10778b(this, new C10767c());
        }
        return new C10768a(this, new C10767c());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo31057b(C10766b bVar, boolean z) {
        getImpl().mo31135b(m27609c(bVar), z);
    }

    /* renamed from: c */
    public void mo31060c(AnimatorListener animatorListener) {
        getImpl().mo31139c(animatorListener);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f28032k != colorStateList) {
            this.f28032k = colorStateList;
            getImpl().mo31133b(this.f28032k);
        }
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f28038q = new Rect();
        this.f28039r = new Rect();
        TypedArray c = C10793g.m27778c(context, attributeSet, C12076k.FloatingActionButton, i, C12075j.Widget_Design_FloatingActionButton, new int[0]);
        this.f28027f = C12088a.m31903a(context, c, C12076k.FloatingActionButton_backgroundTint);
        this.f28028g = C10794h.m27780a(c.getInt(C12076k.FloatingActionButton_backgroundTintMode, -1), null);
        this.f28032k = C12088a.m31903a(context, c, C12076k.FloatingActionButton_rippleColor);
        this.f28033l = c.getInt(C12076k.FloatingActionButton_fabSize, -1);
        this.f28034m = c.getDimensionPixelSize(C12076k.FloatingActionButton_fabCustomSize, 0);
        this.f28031j = c.getDimensionPixelSize(C12076k.FloatingActionButton_borderWidth, 0);
        float dimension = c.getDimension(C12076k.FloatingActionButton_elevation, 0.0f);
        float dimension2 = c.getDimension(C12076k.FloatingActionButton_hoveredFocusedTranslationZ, 0.0f);
        float dimension3 = c.getDimension(C12076k.FloatingActionButton_pressedTranslationZ, 0.0f);
        this.f28037p = c.getBoolean(C12076k.FloatingActionButton_useCompatPadding, false);
        this.f28036o = c.getDimensionPixelSize(C12076k.FloatingActionButton_maxImageSize, 0);
        C12084h a = C12084h.m31884a(context, c, C12076k.FloatingActionButton_showMotionSpec);
        C12084h a2 = C12084h.m31884a(context, c, C12076k.FloatingActionButton_hideMotionSpec);
        c.recycle();
        this.f28040s = new C0255g(this);
        this.f28040s.mo1909a(attributeSet, i);
        this.f28041t = new C10764a(this);
        getImpl().mo31124a(this.f28027f, this.f28028g, this.f28032k, this.f28031j);
        getImpl().mo31119a(dimension);
        getImpl().mo31131b(dimension2);
        getImpl().mo31141d(dimension3);
        getImpl().mo31121a(this.f28036o);
        getImpl().mo31136b(a);
        getImpl().mo31128a(a2);
        setScaleType(ScaleType.MATRIX);
    }

    /* renamed from: c */
    private C10775g m27609c(C10766b bVar) {
        if (bVar == null) {
            return null;
        }
        return new C10765a(bVar);
    }

    /* renamed from: a */
    public void mo31049a() {
        mo31051a((C10766b) null);
    }

    /* renamed from: b */
    public void mo31054b(AnimatorListener animatorListener) {
        getImpl().mo31132b(animatorListener);
    }

    /* renamed from: c */
    private void m27610c(Rect rect) {
        int i = rect.left;
        Rect rect2 = this.f28038q;
        rect.left = i + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    /* renamed from: a */
    public void mo31051a(C10766b bVar) {
        mo31052a(bVar, true);
    }

    /* renamed from: b */
    public boolean mo31058b() {
        return getImpl().mo31147i();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo31052a(C10766b bVar, boolean z) {
        getImpl().mo31127a(m27609c(bVar), z);
    }

    /* renamed from: b */
    public void mo31055b(Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        m27610c(rect);
    }

    /* renamed from: a */
    public void mo31050a(AnimatorListener animatorListener) {
        getImpl().mo31122a(animatorListener);
    }

    /* renamed from: a */
    private int m27605a(int i) {
        int i2;
        int i3 = this.f28034m;
        if (i3 != 0) {
            return i3;
        }
        Resources resources = getResources();
        if (i == -1) {
            if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470) {
                i2 = m27605a(1);
            } else {
                i2 = m27605a(0);
            }
            return i2;
        } else if (i != 1) {
            return resources.getDimensionPixelSize(C12069d.design_fab_size_normal);
        } else {
            return resources.getDimensionPixelSize(C12069d.design_fab_size_mini);
        }
    }

    @Deprecated
    /* renamed from: a */
    public boolean mo31053a(Rect rect) {
        if (!ViewCompat.m2804D(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        m27610c(rect);
        return true;
    }

    /* renamed from: a */
    private static int m27606a(int i, int i2) {
        int mode = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i, size);
        }
        if (mode == 0) {
            return i;
        }
        if (mode == 1073741824) {
            return size;
        }
        throw new IllegalArgumentException();
    }
}
