package androidx.appcompat.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region.Op;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.Layout;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode.Callback;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.core.graphics.drawable.C0559a;
import androidx.core.view.ViewCompat;
import androidx.core.widget.C0680h;
import com.android.volley.toolbox.C8733j;
import p214e.p215a.C7521a;
import p214e.p215a.C7530j;
import p214e.p215a.p216k.p217a.C7531a;
import p214e.p215a.p221n.C7550a;

public class SwitchCompat extends CompoundButton {

    /* renamed from: R */
    private static final Property<SwitchCompat, Float> f983R = new C0231a(Float.class, "thumbPos");

    /* renamed from: S */
    private static final int[] f984S = {16842912};

    /* renamed from: A */
    private int f985A;

    /* renamed from: B */
    float f986B;

    /* renamed from: C */
    private int f987C;

    /* renamed from: D */
    private int f988D;

    /* renamed from: E */
    private int f989E;

    /* renamed from: F */
    private int f990F;

    /* renamed from: G */
    private int f991G;

    /* renamed from: H */
    private int f992H;

    /* renamed from: I */
    private int f993I;

    /* renamed from: J */
    private final TextPaint f994J;

    /* renamed from: K */
    private ColorStateList f995K;

    /* renamed from: L */
    private Layout f996L;

    /* renamed from: M */
    private Layout f997M;

    /* renamed from: N */
    private TransformationMethod f998N;

    /* renamed from: O */
    ObjectAnimator f999O;

    /* renamed from: P */
    private final C0259k f1000P;

    /* renamed from: Q */
    private final Rect f1001Q;

    /* renamed from: e */
    private Drawable f1002e;

    /* renamed from: f */
    private ColorStateList f1003f;

    /* renamed from: g */
    private Mode f1004g;

    /* renamed from: h */
    private boolean f1005h;

    /* renamed from: i */
    private boolean f1006i;

    /* renamed from: j */
    private Drawable f1007j;

    /* renamed from: k */
    private ColorStateList f1008k;

    /* renamed from: l */
    private Mode f1009l;

    /* renamed from: m */
    private boolean f1010m;

    /* renamed from: n */
    private boolean f1011n;

    /* renamed from: o */
    private int f1012o;

    /* renamed from: p */
    private int f1013p;

    /* renamed from: q */
    private int f1014q;

    /* renamed from: r */
    private boolean f1015r;

    /* renamed from: s */
    private CharSequence f1016s;

    /* renamed from: t */
    private CharSequence f1017t;

    /* renamed from: u */
    private boolean f1018u;

    /* renamed from: v */
    private int f1019v;

    /* renamed from: w */
    private int f1020w;

    /* renamed from: x */
    private float f1021x;

    /* renamed from: y */
    private float f1022y;

    /* renamed from: z */
    private VelocityTracker f1023z;

    /* renamed from: androidx.appcompat.widget.SwitchCompat$a */
    static class C0231a extends Property<SwitchCompat, Float> {
        C0231a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.f986B);
        }

        /* renamed from: a */
        public void set(SwitchCompat switchCompat, Float f) {
            switchCompat.setThumbPosition(f.floatValue());
        }
    }

    public SwitchCompat(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private static float m865a(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    /* renamed from: b */
    private void m872b() {
        if (this.f1007j == null) {
            return;
        }
        if (this.f1010m || this.f1011n) {
            this.f1007j = C0559a.m2657i(this.f1007j).mutate();
            if (this.f1010m) {
                C0559a.m2642a(this.f1007j, this.f1008k);
            }
            if (this.f1011n) {
                C0559a.m2645a(this.f1007j, this.f1009l);
            }
            if (this.f1007j.isStateful()) {
                this.f1007j.setState(getDrawableState());
            }
        }
    }

    /* renamed from: c */
    private void m874c() {
        ObjectAnimator objectAnimator = this.f999O;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    private boolean getTargetCheckedState() {
        return this.f986B > 0.5f;
    }

    private int getThumbOffset() {
        float f;
        if (C0254f0.m992a(this)) {
            f = 1.0f - this.f986B;
        } else {
            f = this.f986B;
        }
        return (int) ((f * ((float) getThumbScrollRange())) + 0.5f);
    }

    private int getThumbScrollRange() {
        Rect rect;
        Drawable drawable = this.f1007j;
        if (drawable == null) {
            return 0;
        }
        Rect rect2 = this.f1001Q;
        drawable.getPadding(rect2);
        Drawable drawable2 = this.f1002e;
        if (drawable2 != null) {
            rect = C0262m.m1082d(drawable2);
        } else {
            rect = C0262m.f1205c;
        }
        return ((((this.f987C - this.f989E) - rect2.left) - rect2.right) - rect.left) - rect.right;
    }

    /* renamed from: a */
    public void mo1685a(Context context, int i) {
        C0291z a = C0291z.m1194a(context, i, C7530j.TextAppearance);
        ColorStateList a2 = a.mo2100a(C7530j.TextAppearance_android_textColor);
        if (a2 != null) {
            this.f995K = a2;
        } else {
            this.f995K = getTextColors();
        }
        int c = a.mo2107c(C7530j.TextAppearance_android_textSize, 0);
        if (c != 0) {
            float f = (float) c;
            if (f != this.f994J.getTextSize()) {
                this.f994J.setTextSize(f);
                requestLayout();
            }
        }
        m868a(a.mo2109d(C7530j.TextAppearance_android_typeface, -1), a.mo2109d(C7530j.TextAppearance_android_textStyle, -1));
        if (a.mo2103a(C7530j.TextAppearance_textAllCaps, false)) {
            this.f998N = new C7550a(getContext());
        } else {
            this.f998N = null;
        }
        a.mo2102a();
    }

    public void draw(Canvas canvas) {
        Rect rect;
        int i;
        int i2;
        Rect rect2 = this.f1001Q;
        int i3 = this.f990F;
        int i4 = this.f991G;
        int i5 = this.f992H;
        int i6 = this.f993I;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.f1002e;
        if (drawable != null) {
            rect = C0262m.m1082d(drawable);
        } else {
            rect = C0262m.f1205c;
        }
        Drawable drawable2 = this.f1007j;
        if (drawable2 != null) {
            drawable2.getPadding(rect2);
            int i7 = rect2.left;
            thumbOffset += i7;
            if (rect != null) {
                int i8 = rect.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = rect.top;
                int i10 = rect2.top;
                i = i9 > i10 ? (i9 - i10) + i4 : i4;
                int i11 = rect.right;
                int i12 = rect2.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = rect.bottom;
                int i14 = rect2.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                    this.f1007j.setBounds(i3, i, i5, i2);
                }
            } else {
                i = i4;
            }
            i2 = i6;
            this.f1007j.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.f1002e;
        if (drawable3 != null) {
            drawable3.getPadding(rect2);
            int i15 = thumbOffset - rect2.left;
            int i16 = thumbOffset + this.f989E + rect2.right;
            this.f1002e.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                C0559a.m2641a(background, i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    public void drawableHotspotChanged(float f, float f2) {
        if (VERSION.SDK_INT >= 21) {
            super.drawableHotspotChanged(f, f2);
        }
        Drawable drawable = this.f1002e;
        if (drawable != null) {
            C0559a.m2640a(drawable, f, f2);
        }
        Drawable drawable2 = this.f1007j;
        if (drawable2 != null) {
            C0559a.m2640a(drawable2, f, f2);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1002e;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f1007j;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    public int getCompoundPaddingLeft() {
        if (!C0254f0.m992a(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f987C;
        if (!TextUtils.isEmpty(getText())) {
            compoundPaddingLeft += this.f1014q;
        }
        return compoundPaddingLeft;
    }

    public int getCompoundPaddingRight() {
        if (C0254f0.m992a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f987C;
        if (!TextUtils.isEmpty(getText())) {
            compoundPaddingRight += this.f1014q;
        }
        return compoundPaddingRight;
    }

    public boolean getShowText() {
        return this.f1018u;
    }

    public boolean getSplitTrack() {
        return this.f1015r;
    }

    public int getSwitchMinWidth() {
        return this.f1013p;
    }

    public int getSwitchPadding() {
        return this.f1014q;
    }

    public CharSequence getTextOff() {
        return this.f1017t;
    }

    public CharSequence getTextOn() {
        return this.f1016s;
    }

    public Drawable getThumbDrawable() {
        return this.f1002e;
    }

    public int getThumbTextPadding() {
        return this.f1012o;
    }

    public ColorStateList getThumbTintList() {
        return this.f1003f;
    }

    public Mode getThumbTintMode() {
        return this.f1004g;
    }

    public Drawable getTrackDrawable() {
        return this.f1007j;
    }

    public ColorStateList getTrackTintList() {
        return this.f1008k;
    }

    public Mode getTrackTintMode() {
        return this.f1009l;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1002e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1007j;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f999O;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.f999O.end();
            this.f999O = null;
        }
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            CompoundButton.mergeDrawableStates(onCreateDrawableState, f984S);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        Rect rect = this.f1001Q;
        Drawable drawable = this.f1007j;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i2 = this.f991G + rect.top;
        int i3 = this.f993I - rect.bottom;
        Drawable drawable2 = this.f1002e;
        if (drawable != null) {
            if (!this.f1015r || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect d = C0262m.m1082d(drawable2);
                drawable2.copyBounds(rect);
                rect.left += d.left;
                rect.right -= d.right;
                int save = canvas.save();
                canvas.clipRect(rect, Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.f996L : this.f997M;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f995K;
            if (colorStateList != null) {
                this.f994J.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.f994J.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                i = bounds.left + bounds.right;
            } else {
                i = getWidth();
            }
            canvas.translate((float) ((i / 2) - (layout.getWidth() / 2)), (float) (((i2 + i3) / 2) - (layout.getHeight() / 2)));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        CharSequence charSequence = isChecked() ? this.f1016s : this.f1017t;
        if (!TextUtils.isEmpty(charSequence)) {
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        super.onLayout(z, i, i2, i3, i4);
        int i11 = 0;
        if (this.f1002e != null) {
            Rect rect = this.f1001Q;
            Drawable drawable = this.f1007j;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect d = C0262m.m1082d(this.f1002e);
            i5 = Math.max(0, d.left - rect.left);
            i11 = Math.max(0, d.right - rect.right);
        } else {
            i5 = 0;
        }
        if (C0254f0.m992a(this)) {
            i7 = getPaddingLeft() + i5;
            i6 = ((this.f987C + i7) - i5) - i11;
        } else {
            i6 = (getWidth() - getPaddingRight()) - i11;
            i7 = (i6 - this.f987C) + i5 + i11;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int paddingTop = ((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2;
            i10 = this.f988D;
            i9 = paddingTop - (i10 / 2);
        } else if (gravity != 80) {
            i9 = getPaddingTop();
            i10 = this.f988D;
        } else {
            i8 = getHeight() - getPaddingBottom();
            i9 = i8 - this.f988D;
            this.f990F = i7;
            this.f991G = i9;
            this.f993I = i8;
            this.f992H = i6;
        }
        i8 = i10 + i9;
        this.f990F = i7;
        this.f991G = i9;
        this.f993I = i8;
        this.f992H = i6;
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        if (this.f1018u) {
            if (this.f996L == null) {
                this.f996L = m866a(this.f1016s);
            }
            if (this.f997M == null) {
                this.f997M = m866a(this.f1017t);
            }
        }
        Rect rect = this.f1001Q;
        Drawable drawable = this.f1002e;
        int i5 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i4 = (this.f1002e.getIntrinsicWidth() - rect.left) - rect.right;
            i3 = this.f1002e.getIntrinsicHeight();
        } else {
            i4 = 0;
            i3 = 0;
        }
        this.f989E = Math.max(this.f1018u ? Math.max(this.f996L.getWidth(), this.f997M.getWidth()) + (this.f1012o * 2) : 0, i4);
        Drawable drawable2 = this.f1007j;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i5 = this.f1007j.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i6 = rect.left;
        int i7 = rect.right;
        Drawable drawable3 = this.f1002e;
        if (drawable3 != null) {
            Rect d = C0262m.m1082d(drawable3);
            i6 = Math.max(i6, d.left);
            i7 = Math.max(i7, d.right);
        }
        int max = Math.max(this.f1013p, (this.f989E * 2) + i6 + i7);
        int max2 = Math.max(i5, i3);
        this.f987C = max;
        this.f988D = max2;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f1016s : this.f1017t;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r0 != 3) goto L_0x00bb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            android.view.VelocityTracker r0 = r6.f1023z
            r0.addMovement(r7)
            int r0 = r7.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L_0x00a1
            r2 = 2
            if (r0 == r1) goto L_0x008d
            if (r0 == r2) goto L_0x0016
            r3 = 3
            if (r0 == r3) goto L_0x008d
            goto L_0x00bb
        L_0x0016:
            int r0 = r6.f1019v
            if (r0 == 0) goto L_0x00bb
            if (r0 == r1) goto L_0x0059
            if (r0 == r2) goto L_0x0020
            goto L_0x00bb
        L_0x0020:
            float r7 = r7.getX()
            int r0 = r6.getThumbScrollRange()
            float r2 = r6.f1021x
            float r2 = r7 - r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r0 == 0) goto L_0x0034
            float r0 = (float) r0
            float r2 = r2 / r0
            goto L_0x003f
        L_0x0034:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x003b
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L_0x003f
        L_0x003b:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x003f:
            boolean r0 = androidx.appcompat.widget.C0254f0.m992a(r6)
            if (r0 == 0) goto L_0x0046
            float r2 = -r2
        L_0x0046:
            float r0 = r6.f986B
            float r0 = r0 + r2
            float r0 = m865a(r0, r4, r3)
            float r2 = r6.f986B
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0058
            r6.f1021x = r7
            r6.setThumbPosition(r0)
        L_0x0058:
            return r1
        L_0x0059:
            float r0 = r7.getX()
            float r3 = r7.getY()
            float r4 = r6.f1021x
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f1020w
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L_0x007f
            float r4 = r6.f1022y
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f1020w
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x00bb
        L_0x007f:
            r6.f1019v = r2
            android.view.ViewParent r7 = r6.getParent()
            r7.requestDisallowInterceptTouchEvent(r1)
            r6.f1021x = r0
            r6.f1022y = r3
            return r1
        L_0x008d:
            int r0 = r6.f1019v
            if (r0 != r2) goto L_0x0098
            r6.m873b(r7)
            super.onTouchEvent(r7)
            return r1
        L_0x0098:
            r0 = 0
            r6.f1019v = r0
            android.view.VelocityTracker r0 = r6.f1023z
            r0.clear()
            goto L_0x00bb
        L_0x00a1:
            float r0 = r7.getX()
            float r2 = r7.getY()
            boolean r3 = r6.isEnabled()
            if (r3 == 0) goto L_0x00bb
            boolean r3 = r6.m871a(r0, r2)
            if (r3 == 0) goto L_0x00bb
            r6.f1019v = r1
            r6.f1021x = r0
            r6.f1022y = r2
        L_0x00bb:
            boolean r7 = super.onTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean isChecked = isChecked();
        if (getWindowToken() == null || !ViewCompat.m2804D(this)) {
            m874c();
            setThumbPosition(isChecked ? 1.0f : 0.0f);
            return;
        }
        m870a(isChecked);
    }

    public void setCustomSelectionActionModeCallback(Callback callback) {
        super.setCustomSelectionActionModeCallback(C0680h.m3176a((TextView) this, callback));
    }

    public void setShowText(boolean z) {
        if (this.f1018u != z) {
            this.f1018u = z;
            requestLayout();
        }
    }

    public void setSplitTrack(boolean z) {
        this.f1015r = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.f1013p = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.f1014q = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.f994J.getTypeface() != null && !this.f994J.getTypeface().equals(typeface)) || (this.f994J.getTypeface() == null && typeface != null)) {
            this.f994J.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void setTextOff(CharSequence charSequence) {
        this.f1017t = charSequence;
        requestLayout();
    }

    public void setTextOn(CharSequence charSequence) {
        this.f1016s = charSequence;
        requestLayout();
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1002e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1002e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    /* access modifiers changed from: 0000 */
    public void setThumbPosition(float f) {
        this.f986B = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(C7531a.m18133c(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.f1012o = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f1003f = colorStateList;
        this.f1005h = true;
        m867a();
    }

    public void setThumbTintMode(Mode mode) {
        this.f1004g = mode;
        this.f1006i = true;
        m867a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1007j;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1007j = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(C7531a.m18133c(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f1008k = colorStateList;
        this.f1010m = true;
        m872b();
    }

    public void setTrackTintMode(Mode mode) {
        this.f1009l = mode;
        this.f1011n = true;
        m872b();
    }

    public void toggle() {
        setChecked(!isChecked());
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1002e || drawable == this.f1007j;
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7521a.switchStyle);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1003f = null;
        this.f1004g = null;
        this.f1005h = false;
        this.f1006i = false;
        this.f1008k = null;
        this.f1009l = null;
        this.f1010m = false;
        this.f1011n = false;
        this.f1023z = VelocityTracker.obtain();
        this.f1001Q = new Rect();
        this.f994J = new TextPaint(1);
        Resources resources = getResources();
        this.f994J.density = resources.getDisplayMetrics().density;
        C0291z a = C0291z.m1196a(context, attributeSet, C7530j.SwitchCompat, i, 0);
        this.f1002e = a.mo2106b(C7530j.SwitchCompat_android_thumb);
        Drawable drawable = this.f1002e;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        this.f1007j = a.mo2106b(C7530j.SwitchCompat_track);
        Drawable drawable2 = this.f1007j;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
        this.f1016s = a.mo2112e(C7530j.SwitchCompat_android_textOn);
        this.f1017t = a.mo2112e(C7530j.SwitchCompat_android_textOff);
        this.f1018u = a.mo2103a(C7530j.SwitchCompat_showText, true);
        this.f1012o = a.mo2107c(C7530j.SwitchCompat_thumbTextPadding, 0);
        this.f1013p = a.mo2107c(C7530j.SwitchCompat_switchMinWidth, 0);
        this.f1014q = a.mo2107c(C7530j.SwitchCompat_switchPadding, 0);
        this.f1015r = a.mo2103a(C7530j.SwitchCompat_splitTrack, false);
        ColorStateList a2 = a.mo2100a(C7530j.SwitchCompat_thumbTint);
        if (a2 != null) {
            this.f1003f = a2;
            this.f1005h = true;
        }
        Mode a3 = C0262m.m1078a(a.mo2109d(C7530j.SwitchCompat_thumbTintMode, -1), null);
        if (this.f1004g != a3) {
            this.f1004g = a3;
            this.f1006i = true;
        }
        if (this.f1005h || this.f1006i) {
            m867a();
        }
        ColorStateList a4 = a.mo2100a(C7530j.SwitchCompat_trackTint);
        if (a4 != null) {
            this.f1008k = a4;
            this.f1010m = true;
        }
        Mode a5 = C0262m.m1078a(a.mo2109d(C7530j.SwitchCompat_trackTintMode, -1), null);
        if (this.f1009l != a5) {
            this.f1009l = a5;
            this.f1011n = true;
        }
        if (this.f1010m || this.f1011n) {
            m872b();
        }
        int g = a.mo2115g(C7530j.SwitchCompat_switchTextAppearance, 0);
        if (g != 0) {
            mo1685a(context, g);
        }
        this.f1000P = new C0259k(this);
        this.f1000P.mo1928a(attributeSet, i);
        a.mo2102a();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1020w = viewConfiguration.getScaledTouchSlop();
        this.f985A = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }

    /* renamed from: b */
    private void m873b(MotionEvent motionEvent) {
        boolean z;
        this.f1019v = 0;
        boolean z2 = true;
        boolean z3 = motionEvent.getAction() == 1 && isEnabled();
        boolean isChecked = isChecked();
        if (z3) {
            this.f1023z.computeCurrentVelocity(C8733j.DEFAULT_IMAGE_TIMEOUT_MS);
            float xVelocity = this.f1023z.getXVelocity();
            if (Math.abs(xVelocity) > ((float) this.f985A)) {
                if (!C0254f0.m992a(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                    z2 = false;
                }
                z = z2;
            } else {
                z = getTargetCheckedState();
            }
        } else {
            z = isChecked;
        }
        if (z != isChecked) {
            playSoundEffect(0);
        }
        setChecked(z);
        m869a(motionEvent);
    }

    /* renamed from: a */
    private void m868a(int i, int i2) {
        Typeface typeface = i != 1 ? i != 2 ? i != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
        mo1686a(typeface, i2);
    }

    /* renamed from: a */
    public void mo1686a(Typeface typeface, int i) {
        Typeface typeface2;
        float f = 0.0f;
        boolean z = false;
        if (i > 0) {
            if (typeface == null) {
                typeface2 = Typeface.defaultFromStyle(i);
            } else {
                typeface2 = Typeface.create(typeface, i);
            }
            setSwitchTypeface(typeface2);
            int i2 = (~(typeface2 != null ? typeface2.getStyle() : 0)) & i;
            TextPaint textPaint = this.f994J;
            if ((i2 & 1) != 0) {
                z = true;
            }
            textPaint.setFakeBoldText(z);
            TextPaint textPaint2 = this.f994J;
            if ((i2 & 2) != 0) {
                f = -0.25f;
            }
            textPaint2.setTextSkewX(f);
            return;
        }
        this.f994J.setFakeBoldText(false);
        this.f994J.setTextSkewX(0.0f);
        setSwitchTypeface(typeface);
    }

    /* renamed from: a */
    private void m867a() {
        if (this.f1002e == null) {
            return;
        }
        if (this.f1005h || this.f1006i) {
            this.f1002e = C0559a.m2657i(this.f1002e).mutate();
            if (this.f1005h) {
                C0559a.m2642a(this.f1002e, this.f1003f);
            }
            if (this.f1006i) {
                C0559a.m2645a(this.f1002e, this.f1004g);
            }
            if (this.f1002e.isStateful()) {
                this.f1002e.setState(getDrawableState());
            }
        }
    }

    /* renamed from: a */
    private Layout m866a(CharSequence charSequence) {
        TransformationMethod transformationMethod = this.f998N;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, this);
        }
        CharSequence charSequence2 = charSequence;
        TextPaint textPaint = this.f994J;
        StaticLayout staticLayout = new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil((double) Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        return staticLayout;
    }

    /* renamed from: a */
    private boolean m871a(float f, float f2) {
        boolean z = false;
        if (this.f1002e == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f1002e.getPadding(this.f1001Q);
        int i = this.f991G;
        int i2 = this.f1020w;
        int i3 = i - i2;
        int i4 = (this.f990F + thumbOffset) - i2;
        int i5 = this.f989E + i4;
        Rect rect = this.f1001Q;
        int i6 = i5 + rect.left + rect.right + i2;
        int i7 = this.f993I + i2;
        if (f > ((float) i4) && f < ((float) i6) && f2 > ((float) i3) && f2 < ((float) i7)) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    private void m869a(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        super.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* renamed from: a */
    private void m870a(boolean z) {
        this.f999O = ObjectAnimator.ofFloat(this, f983R, new float[]{z ? 1.0f : 0.0f});
        this.f999O.setDuration(250);
        if (VERSION.SDK_INT >= 18) {
            this.f999O.setAutoCancel(true);
        }
        this.f999O.start();
    }
}
