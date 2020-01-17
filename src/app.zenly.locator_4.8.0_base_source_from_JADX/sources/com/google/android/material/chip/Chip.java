package com.google.android.material.chip;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.TextView.BufferType;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.content.res.C0554e.C0555a;
import androidx.core.text.C0583a;
import androidx.customview.widget.C0691a;
import com.google.android.material.chip.ChipDrawable.Delegate;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p333g.p357d.p358a.p361b.p362l.C12084h;
import p333g.p357d.p358a.p361b.p364n.C12089b;

public class Chip extends AppCompatCheckBox implements Delegate {

    /* renamed from: t */
    private static final int[] f27993t = {16842913};

    /* renamed from: h */
    private ChipDrawable f27994h;

    /* renamed from: i */
    private RippleDrawable f27995i;

    /* renamed from: j */
    private OnClickListener f27996j;

    /* renamed from: k */
    private OnCheckedChangeListener f27997k;

    /* renamed from: l */
    private int f27998l;

    /* renamed from: m */
    private boolean f27999m;

    /* renamed from: n */
    private boolean f28000n;

    /* renamed from: o */
    private boolean f28001o;

    /* renamed from: p */
    private final C10753a f28002p;

    /* renamed from: q */
    private final Rect f28003q;

    /* renamed from: r */
    private final RectF f28004r;

    /* renamed from: s */
    private final C0555a f28005s;

    /* renamed from: com.google.android.material.chip.Chip$a */
    private class C10753a extends C0691a {
    }

    static {
        new Rect();
    }

    /* renamed from: a */
    private void m27478a(ChipDrawable chipDrawable) {
        chipDrawable.mo30902a((Delegate) this);
        throw null;
    }

    /* renamed from: b */
    private void m27482b(ChipDrawable chipDrawable) {
        if (chipDrawable != null) {
            chipDrawable.mo30902a((Delegate) null);
            throw null;
        }
    }

    /* renamed from: c */
    private boolean m27483c() {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable == null) {
            return false;
        }
        chipDrawable.mo30947l();
        throw null;
    }

    /* renamed from: d */
    private void m27484d() {
        if (!TextUtils.isEmpty(getText())) {
            ChipDrawable chipDrawable = this.f27994h;
            if (chipDrawable != null) {
                chipDrawable.mo30938i();
                throw null;
            }
        }
    }

    private RectF getCloseIconTouchBounds() {
        this.f28004r.setEmpty();
        if (!m27483c()) {
            return this.f28004r;
        }
        this.f27994h.mo30899a(this.f28004r);
        throw null;
    }

    private Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f28003q.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f28003q;
    }

    private C12089b getTextAppearance() {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable == null) {
            return null;
        }
        chipDrawable.mo30975y();
        throw null;
    }

    private void setCloseIconFocused(boolean z) {
        if (this.f28001o != z) {
            this.f28001o = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconHovered(boolean z) {
        if (this.f28000n != z) {
            this.f28000n = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.f27999m != z) {
            this.f27999m = z;
            refreshDrawableState();
        }
    }

    private void setFocusedVirtualView(int i) {
        int i2 = this.f27998l;
        if (i2 != i) {
            if (i2 == 0) {
                setCloseIconFocused(false);
            }
            this.f27998l = i;
            if (i == 0) {
                setCloseIconFocused(true);
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return m27479a(motionEvent) || this.f28002p.mo3569a(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f28002p.mo3568a(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable != null) {
            chipDrawable.mo30893C();
            throw null;
        }
    }

    public Drawable getCheckedIcon() {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable == null) {
            return null;
        }
        chipDrawable.mo30895a();
        throw null;
    }

    public ColorStateList getChipBackgroundColor() {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable == null) {
            return null;
        }
        chipDrawable.mo30907b();
        throw null;
    }

    public float getChipCornerRadius() {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable == null) {
            return 0.0f;
        }
        chipDrawable.mo30914c();
        throw null;
    }

    public Drawable getChipDrawable() {
        return this.f27994h;
    }

    public float getChipEndPadding() {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable == null) {
            return 0.0f;
        }
        chipDrawable.mo30920d();
        throw null;
    }

    public Drawable getChipIcon() {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable == null) {
            return null;
        }
        chipDrawable.mo30925e();
        throw null;
    }

    public float getChipIconSize() {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable == null) {
            return 0.0f;
        }
        chipDrawable.mo30929f();
        throw null;
    }

    public ColorStateList getChipIconTint() {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable == null) {
            return null;
        }
        chipDrawable.mo30932g();
        throw null;
    }

    public float getChipMinHeight() {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable == null) {
            return 0.0f;
        }
        chipDrawable.mo30935h();
        throw null;
    }

    public float getChipStartPadding() {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable == null) {
            return 0.0f;
        }
        chipDrawable.mo30938i();
        throw null;
    }

    public ColorStateList getChipStrokeColor() {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable == null) {
            return null;
        }
        chipDrawable.mo30941j();
        throw null;
    }

    public float getChipStrokeWidth() {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable == null) {
            return 0.0f;
        }
        chipDrawable.mo30944k();
        throw null;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable == null) {
            return null;
        }
        chipDrawable.mo30947l();
        throw null;
    }

    public CharSequence getCloseIconContentDescription() {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable == null) {
            return null;
        }
        chipDrawable.mo30950m();
        throw null;
    }

    public float getCloseIconEndPadding() {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable == null) {
            return 0.0f;
        }
        chipDrawable.mo30953n();
        throw null;
    }

    public float getCloseIconSize() {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable == null) {
            return 0.0f;
        }
        chipDrawable.mo30955o();
        throw null;
    }

    public float getCloseIconStartPadding() {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable == null) {
            return 0.0f;
        }
        chipDrawable.mo30957p();
        throw null;
    }

    public ColorStateList getCloseIconTint() {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable == null) {
            return null;
        }
        chipDrawable.mo30959q();
        throw null;
    }

    public TruncateAt getEllipsize() {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable == null) {
            return null;
        }
        chipDrawable.mo30961r();
        throw null;
    }

    public void getFocusedRect(Rect rect) {
        if (this.f27998l == 0) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public C12084h getHideMotionSpec() {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable == null) {
            return null;
        }
        chipDrawable.mo30963s();
        throw null;
    }

    public float getIconEndPadding() {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable == null) {
            return 0.0f;
        }
        chipDrawable.mo30965t();
        throw null;
    }

    public float getIconStartPadding() {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable == null) {
            return 0.0f;
        }
        chipDrawable.mo30967u();
        throw null;
    }

    public ColorStateList getRippleColor() {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable == null) {
            return null;
        }
        chipDrawable.mo30969v();
        throw null;
    }

    public C12084h getShowMotionSpec() {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable == null) {
            return null;
        }
        chipDrawable.mo30971w();
        throw null;
    }

    public CharSequence getText() {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable == null) {
            return "";
        }
        chipDrawable.mo30973x();
        throw null;
    }

    public float getTextEndPadding() {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable == null) {
            return 0.0f;
        }
        chipDrawable.mo30977z();
        throw null;
    }

    public float getTextStartPadding() {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable == null) {
            return 0.0f;
        }
        chipDrawable.mo30888A();
        throw null;
    }

    public void onChipDrawableSizeChange() {
        m27484d();
        requestLayout();
        if (VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, f27993t);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (!TextUtils.isEmpty(getText())) {
            ChipDrawable chipDrawable = this.f27994h;
            if (chipDrawable != null) {
                chipDrawable.mo30894D();
                throw null;
            }
        }
        super.onDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i, Rect rect) {
        if (z) {
            setFocusedVirtualView(-1);
        } else {
            setFocusedVirtualView(Integer.MIN_VALUE);
        }
        invalidate();
        super.onFocusChanged(z, i, rect);
        this.f28002p.mo3564a(z, i, rect);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0069  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onKeyDown(int r7, android.view.KeyEvent r8) {
        /*
            r6 = this;
            int r0 = r8.getKeyCode()
            r1 = 61
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L_0x0041
            r1 = 66
            if (r0 == r1) goto L_0x0031
            switch(r0) {
                case 21: goto L_0x0022;
                case 22: goto L_0x0012;
                case 23: goto L_0x0031;
                default: goto L_0x0011;
            }
        L_0x0011:
            goto L_0x006d
        L_0x0012:
            boolean r0 = r8.hasNoModifiers()
            if (r0 == 0) goto L_0x006d
            boolean r0 = com.google.android.material.internal.C10794h.m27781a(r6)
            r0 = r0 ^ r3
            boolean r2 = r6.m27480a(r0)
            goto L_0x006d
        L_0x0022:
            boolean r0 = r8.hasNoModifiers()
            if (r0 == 0) goto L_0x006d
            boolean r0 = com.google.android.material.internal.C10794h.m27781a(r6)
            boolean r2 = r6.m27480a(r0)
            goto L_0x006d
        L_0x0031:
            int r0 = r6.f27998l
            r1 = -1
            if (r0 == r1) goto L_0x003d
            if (r0 == 0) goto L_0x0039
            goto L_0x006d
        L_0x0039:
            r6.mo30759a()
            return r3
        L_0x003d:
            r6.performClick()
            return r3
        L_0x0041:
            boolean r0 = r8.hasNoModifiers()
            if (r0 == 0) goto L_0x0049
            r0 = 2
            goto L_0x0052
        L_0x0049:
            boolean r0 = r8.hasModifiers(r3)
            if (r0 == 0) goto L_0x0051
            r0 = 1
            goto L_0x0052
        L_0x0051:
            r0 = 0
        L_0x0052:
            if (r0 == 0) goto L_0x006d
            android.view.ViewParent r1 = r6.getParent()
            r4 = r6
        L_0x0059:
            android.view.View r4 = r4.focusSearch(r0)
            if (r4 == 0) goto L_0x0067
            if (r4 == r6) goto L_0x0067
            android.view.ViewParent r5 = r4.getParent()
            if (r5 == r1) goto L_0x0059
        L_0x0067:
            if (r4 == 0) goto L_0x006d
            r4.requestFocus()
            return r3
        L_0x006d:
            if (r2 == 0) goto L_0x0073
            r6.invalidate()
            return r3
        L_0x0073:
            boolean r7 = super.onKeyDown(r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @TargetApi(24)
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        if (!getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) {
            return null;
        }
        return PointerIcon.getSystemIcon(getContext(), 1002);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r0 != 3) goto L_0x0040;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0039
            if (r0 == r3) goto L_0x002b
            r4 = 2
            if (r0 == r4) goto L_0x0021
            r1 = 3
            if (r0 == r1) goto L_0x0034
            goto L_0x0040
        L_0x0021:
            boolean r0 = r5.f27999m
            if (r0 == 0) goto L_0x0040
            if (r1 != 0) goto L_0x003e
            r5.setCloseIconPressed(r2)
            goto L_0x003e
        L_0x002b:
            boolean r0 = r5.f27999m
            if (r0 == 0) goto L_0x0034
            r5.mo30759a()
            r0 = 1
            goto L_0x0035
        L_0x0034:
            r0 = 0
        L_0x0035:
            r5.setCloseIconPressed(r2)
            goto L_0x0041
        L_0x0039:
            if (r1 == 0) goto L_0x0040
            r5.setCloseIconPressed(r3)
        L_0x003e:
            r0 = 1
            goto L_0x0041
        L_0x0040:
            r0 = 0
        L_0x0041:
            if (r0 != 0) goto L_0x0049
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L_0x004a
        L_0x0049:
            r2 = 1
        L_0x004a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setBackground(Drawable drawable) {
        if (drawable == this.f27994h || drawable == this.f27995i) {
            super.setBackground(drawable);
            return;
        }
        throw new UnsupportedOperationException("Do not set the background; Chip manages its own background drawable.");
    }

    public void setBackgroundColor(int i) {
        throw new UnsupportedOperationException("Do not set the background color; Chip manages its own background drawable.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == this.f27994h || drawable == this.f27995i) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        throw new UnsupportedOperationException("Do not set the background drawable; Chip manages its own background drawable.");
    }

    public void setBackgroundResource(int i) {
        throw new UnsupportedOperationException("Do not set the background resource; Chip manages its own background drawable.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        throw new UnsupportedOperationException("Do not set the background tint list; Chip manages its own background drawable.");
    }

    public void setBackgroundTintMode(Mode mode) {
        throw new UnsupportedOperationException("Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable != null) {
            chipDrawable.mo30906a(z);
            throw null;
        }
    }

    public void setCheckableResource(int i) {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable != null) {
            chipDrawable.mo30897a(i);
            throw null;
        }
    }

    public void setChecked(boolean z) {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable != null) {
            chipDrawable.mo30891B();
            throw null;
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable != null) {
            chipDrawable.mo30900a(drawable);
            throw null;
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable != null) {
            chipDrawable.mo30909b(i);
            throw null;
        }
    }

    public void setCheckedIconVisible(int i) {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable != null) {
            chipDrawable.mo30916c(i);
            throw null;
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable != null) {
            chipDrawable.mo30898a(colorStateList);
            throw null;
        }
    }

    public void setChipBackgroundColorResource(int i) {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable != null) {
            chipDrawable.mo30922d(i);
            throw null;
        }
    }

    public void setChipCornerRadius(float f) {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable != null) {
            chipDrawable.mo30896a(f);
            throw null;
        }
    }

    public void setChipCornerRadiusResource(int i) {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable != null) {
            chipDrawable.mo30927e(i);
            throw null;
        }
    }

    public void setChipDrawable(ChipDrawable chipDrawable) {
        ChipDrawable chipDrawable2 = this.f27994h;
        if (chipDrawable2 != chipDrawable) {
            m27482b(chipDrawable2);
            this.f27994h = chipDrawable;
            m27478a(this.f27994h);
            throw null;
        }
    }

    public void setChipEndPadding(float f) {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable != null) {
            chipDrawable.mo30908b(f);
            throw null;
        }
    }

    public void setChipEndPaddingResource(int i) {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable != null) {
            chipDrawable.mo30931f(i);
            throw null;
        }
    }

    public void setChipIcon(Drawable drawable) {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable != null) {
            chipDrawable.mo30911b(drawable);
            throw null;
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable != null) {
            chipDrawable.mo30934g(i);
            throw null;
        }
    }

    public void setChipIconSize(float f) {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable != null) {
            chipDrawable.mo30915c(f);
            throw null;
        }
    }

    public void setChipIconSizeResource(int i) {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable != null) {
            chipDrawable.mo30937h(i);
            throw null;
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable != null) {
            chipDrawable.mo30910b(colorStateList);
            throw null;
        }
    }

    public void setChipIconTintResource(int i) {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable != null) {
            chipDrawable.mo30940i(i);
            throw null;
        }
    }

    public void setChipIconVisible(int i) {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable != null) {
            chipDrawable.mo30943j(i);
            throw null;
        }
    }

    public void setChipMinHeight(float f) {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable != null) {
            chipDrawable.mo30921d(f);
            throw null;
        }
    }

    public void setChipMinHeightResource(int i) {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable != null) {
            chipDrawable.mo30946k(i);
            throw null;
        }
    }

    public void setChipStartPadding(float f) {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable != null) {
            chipDrawable.mo30926e(f);
            throw null;
        }
    }

    public void setChipStartPaddingResource(int i) {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable != null) {
            chipDrawable.mo30949l(i);
            throw null;
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable != null) {
            chipDrawable.mo30917c(colorStateList);
            throw null;
        }
    }

    public void setChipStrokeColorResource(int i) {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable != null) {
            chipDrawable.mo30952m(i);
            throw null;
        }
    }

    public void setChipStrokeWidth(float f) {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable != null) {
            chipDrawable.mo30930f(f);
            throw null;
        }
    }

    public void setChipStrokeWidthResource(int i) {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable != null) {
            chipDrawable.mo30954n(i);
            throw null;
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable != null) {
            chipDrawable.mo30918c(drawable);
            throw null;
        }
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable != null) {
            chipDrawable.mo30905a(charSequence);
            throw null;
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable != null) {
            chipDrawable.mo30933g(f);
            throw null;
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable != null) {
            chipDrawable.mo30956o(i);
            throw null;
        }
    }

    public void setCloseIconResource(int i) {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable != null) {
            chipDrawable.mo30958p(i);
            throw null;
        }
    }

    public void setCloseIconSize(float f) {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable != null) {
            chipDrawable.mo30936h(f);
            throw null;
        }
    }

    public void setCloseIconSizeResource(int i) {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable != null) {
            chipDrawable.mo30960q(i);
            throw null;
        }
    }

    public void setCloseIconStartPadding(float f) {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable != null) {
            chipDrawable.mo30939i(f);
            throw null;
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable != null) {
            chipDrawable.mo30962r(i);
            throw null;
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable != null) {
            chipDrawable.mo30923d(colorStateList);
            throw null;
        }
    }

    public void setCloseIconTintResource(int i) {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable != null) {
            chipDrawable.mo30964s(i);
            throw null;
        }
    }

    public void setCloseIconVisible(int i) {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable != null) {
            chipDrawable.mo30966t(i);
            throw null;
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setEllipsize(TruncateAt truncateAt) {
        if (this.f27994h != null) {
            if (truncateAt != TruncateAt.MARQUEE) {
                super.setEllipsize(truncateAt);
                ChipDrawable chipDrawable = this.f27994h;
                if (chipDrawable != null) {
                    chipDrawable.mo30901a(truncateAt);
                    throw null;
                }
                return;
            }
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
    }

    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(C12084h hVar) {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable != null) {
            chipDrawable.mo30903a(hVar);
            throw null;
        }
    }

    public void setHideMotionSpecResource(int i) {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable != null) {
            chipDrawable.mo30968u(i);
            throw null;
        }
    }

    public void setIconEndPadding(float f) {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable != null) {
            chipDrawable.mo30942j(f);
            throw null;
        }
    }

    public void setIconEndPaddingResource(int i) {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable != null) {
            chipDrawable.mo30970v(i);
            throw null;
        }
    }

    public void setIconStartPadding(float f) {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable != null) {
            chipDrawable.mo30945k(f);
            throw null;
        }
    }

    public void setIconStartPaddingResource(int i) {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable != null) {
            chipDrawable.mo30972w(i);
            throw null;
        }
    }

    public void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable != null) {
            chipDrawable.mo30974x(i);
            throw null;
        }
    }

    public void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    /* access modifiers changed from: 0000 */
    public void setOnCheckedChangeListenerInternal(OnCheckedChangeListener onCheckedChangeListener) {
        this.f27997k = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(OnClickListener onClickListener) {
        this.f27996j = onClickListener;
    }

    public void setRippleColor(ColorStateList colorStateList) {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable != null) {
            chipDrawable.mo30928e(colorStateList);
            throw null;
        }
    }

    public void setRippleColorResource(int i) {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable != null) {
            chipDrawable.mo30976y(i);
            throw null;
        }
    }

    public void setShowMotionSpec(C12084h hVar) {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable != null) {
            chipDrawable.mo30912b(hVar);
            throw null;
        }
    }

    public void setShowMotionSpecResource(int i) {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable != null) {
            chipDrawable.mo30978z(i);
            throw null;
        }
    }

    public void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(z);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setText(CharSequence charSequence, BufferType bufferType) {
        if (this.f27994h != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            C0583a.m2715b().mo3203a(charSequence);
            this.f27994h.mo30894D();
            throw null;
        }
    }

    public void setTextAppearance(C12089b bVar) {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable != null) {
            chipDrawable.mo30904a(bVar);
            throw null;
        } else if (getTextAppearance() != null) {
            getTextAppearance().mo35810a(getContext(), getPaint(), this.f28005s);
            throw null;
        }
    }

    public void setTextAppearanceResource(int i) {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable == null) {
            setTextAppearance(getContext(), i);
        } else {
            chipDrawable.mo30889A(i);
            throw null;
        }
    }

    public void setTextEndPadding(float f) {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable != null) {
            chipDrawable.mo30948l(f);
            throw null;
        }
    }

    public void setTextEndPaddingResource(int i) {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable != null) {
            chipDrawable.mo30890B(i);
            throw null;
        }
    }

    public void setTextStartPadding(float f) {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable != null) {
            chipDrawable.mo30951m(f);
            throw null;
        }
    }

    public void setTextStartPaddingResource(int i) {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable != null) {
            chipDrawable.mo30892C(i);
            throw null;
        }
    }

    /* renamed from: b */
    private void m27481b() {
        if (this.f27998l == Integer.MIN_VALUE) {
            setFocusedVirtualView(-1);
        }
    }

    /* renamed from: a */
    public boolean mo30759a() {
        boolean z;
        playSoundEffect(0);
        OnClickListener onClickListener = this.f27996j;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z = true;
        } else {
            z = false;
        }
        this.f28002p.mo3566a(0, 1);
        return z;
    }

    public void setCheckedIconVisible(boolean z) {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable != null) {
            chipDrawable.mo30913b(z);
            throw null;
        }
    }

    public void setChipIconVisible(boolean z) {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable != null) {
            chipDrawable.mo30919c(z);
            throw null;
        }
    }

    public void setCloseIconVisible(boolean z) {
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable != null) {
            chipDrawable.mo30924d(z);
            throw null;
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable != null) {
            chipDrawable.mo30889A(i);
            throw null;
        } else if (getTextAppearance() != null) {
            getTextAppearance().mo35810a(context, getPaint(), this.f28005s);
            throw null;
        }
    }

    @SuppressLint({"PrivateApi"})
    /* renamed from: a */
    private boolean m27479a(MotionEvent motionEvent) {
        Class<C0691a> cls = C0691a.class;
        String str = "Unable to send Accessibility Exit event";
        String str2 = "Chip";
        if (motionEvent.getAction() == 10) {
            try {
                Field declaredField = cls.getDeclaredField("m");
                declaredField.setAccessible(true);
                if (((Integer) declaredField.get(this.f28002p)).intValue() != Integer.MIN_VALUE) {
                    Method declaredMethod = cls.getDeclaredMethod("i", new Class[]{Integer.TYPE});
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(this.f28002p, new Object[]{Integer.valueOf(Integer.MIN_VALUE)});
                    return true;
                }
            } catch (NoSuchMethodException e) {
                Log.e(str2, str, e);
            } catch (IllegalAccessException e2) {
                Log.e(str2, str, e2);
            } catch (InvocationTargetException e3) {
                Log.e(str2, str, e3);
            } catch (NoSuchFieldException e4) {
                Log.e(str2, str, e4);
            }
        }
        return false;
    }

    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        ChipDrawable chipDrawable = this.f27994h;
        if (chipDrawable != null) {
            chipDrawable.mo30889A(i);
            throw null;
        } else if (getTextAppearance() != null) {
            getTextAppearance().mo35810a(getContext(), getPaint(), this.f28005s);
            throw null;
        }
    }

    /* renamed from: a */
    private boolean m27480a(boolean z) {
        m27481b();
        if (z) {
            if (this.f27998l == -1) {
                setFocusedVirtualView(0);
                return true;
            }
        } else if (this.f27998l == 0) {
            setFocusedVirtualView(-1);
            return true;
        }
        return false;
    }
}
