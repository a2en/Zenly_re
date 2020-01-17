package app.zenly.android.base.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewDebug.ExportedProperty;
import android.view.ViewDebug.FlagToString;
import android.view.ViewDebug.IntToString;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.RemoteViews.RemoteView;
import p250f.p251a.p252a.p253a.C7654c;

@RemoteView
public class LinearLayout extends ViewGroup {

    /* renamed from: e */
    private final boolean f4900e;
    @ExportedProperty(category = "layout")

    /* renamed from: f */
    private boolean f4901f;
    @ExportedProperty(category = "layout")

    /* renamed from: g */
    private int f4902g;
    @ExportedProperty(category = "measurement")

    /* renamed from: h */
    private int f4903h;
    @ExportedProperty(category = "measurement")

    /* renamed from: i */
    private int f4904i;
    @ExportedProperty(category = "measurement", flagMapping = {@FlagToString(equals = -1, mask = -1, name = "NONE"), @FlagToString(equals = 0, mask = 0, name = "NONE"), @FlagToString(equals = 48, mask = 48, name = "TOP"), @FlagToString(equals = 80, mask = 80, name = "BOTTOM"), @FlagToString(equals = 3, mask = 3, name = "LEFT"), @FlagToString(equals = 5, mask = 5, name = "RIGHT"), @FlagToString(equals = 8388611, mask = 8388611, name = "START"), @FlagToString(equals = 8388613, mask = 8388613, name = "END"), @FlagToString(equals = 16, mask = 16, name = "CENTER_VERTICAL"), @FlagToString(equals = 112, mask = 112, name = "FILL_VERTICAL"), @FlagToString(equals = 1, mask = 1, name = "CENTER_HORIZONTAL"), @FlagToString(equals = 7, mask = 7, name = "FILL_HORIZONTAL"), @FlagToString(equals = 17, mask = 17, name = "CENTER"), @FlagToString(equals = 119, mask = 119, name = "FILL"), @FlagToString(equals = 8388608, mask = 8388608, name = "RELATIVE")}, formatToHexString = true)

    /* renamed from: j */
    private int f4905j;
    @ExportedProperty(category = "measurement")

    /* renamed from: k */
    private int f4906k;
    @ExportedProperty(category = "layout")

    /* renamed from: l */
    private float f4907l;
    @ExportedProperty(category = "layout")

    /* renamed from: m */
    private boolean f4908m;

    /* renamed from: n */
    private int[] f4909n;

    /* renamed from: o */
    private int[] f4910o;

    /* renamed from: p */
    private Drawable f4911p;

    /* renamed from: q */
    private int f4912q;

    /* renamed from: r */
    private int f4913r;

    /* renamed from: s */
    private int f4914s;

    /* renamed from: t */
    private int f4915t;

    /* renamed from: u */
    private int f4916u;

    public static class LayoutParams extends MarginLayoutParams {
        @ExportedProperty(category = "layout")

        /* renamed from: a */
        public float f4917a;
        @ExportedProperty(category = "layout", mapping = {@IntToString(from = -1, to = "NONE"), @IntToString(from = 0, to = "NONE"), @IntToString(from = 48, to = "TOP"), @IntToString(from = 80, to = "BOTTOM"), @IntToString(from = 3, to = "LEFT"), @IntToString(from = 5, to = "RIGHT"), @IntToString(from = 8388611, to = "START"), @IntToString(from = 8388613, to = "END"), @IntToString(from = 16, to = "CENTER_VERTICAL"), @IntToString(from = 112, to = "FILL_VERTICAL"), @IntToString(from = 1, to = "CENTER_HORIZONTAL"), @IntToString(from = 7, to = "FILL_HORIZONTAL"), @IntToString(from = 17, to = "CENTER"), @IntToString(from = 119, to = "FILL")})

        /* renamed from: b */
        public int f4918b;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f4918b = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7654c.LinearLayout_Layout);
            this.f4917a = obtainStyledAttributes.getFloat(C7654c.LinearLayout_Layout_android_layout_weight, 0.0f);
            this.f4918b = obtainStyledAttributes.getInt(C7654c.LinearLayout_Layout_android_layout_gravity, -1);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f4918b = -1;
            this.f4917a = 0.0f;
        }

        public LayoutParams(int i, int i2, float f) {
            super(i, i2);
            this.f4918b = -1;
            this.f4917a = f;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f4918b = -1;
        }

        public LayoutParams(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f4918b = -1;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.f4918b = -1;
            this.f4917a = layoutParams.f4917a;
            this.f4918b = layoutParams.f4918b;
        }
    }

    public LinearLayout(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private boolean mo6846a() {
        return (this.f4914s == 0 || this.f4911p == null) ? false : true;
    }

    /* renamed from: c */
    private void m6295c(int i, int i2) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View a = mo6452a(i3);
            if (!(a == null || a.getVisibility() == 8)) {
                LayoutParams layoutParams = (LayoutParams) a.getLayoutParams();
                if (layoutParams.height == -1) {
                    int i4 = layoutParams.width;
                    layoutParams.width = a.getMeasuredWidth();
                    measureChildWithMargins(a, i2, 0, makeMeasureSpec, 0);
                    layoutParams.width = i4;
                }
            }
        }
    }

    /* renamed from: d */
    private void m6296d(int i, int i2) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View a = mo6452a(i3);
            if (!(a == null || a.getVisibility() == 8)) {
                LayoutParams layoutParams = (LayoutParams) a.getLayoutParams();
                if (layoutParams.width == -1) {
                    int i4 = layoutParams.height;
                    layoutParams.height = a.getMeasuredHeight();
                    measureChildWithMargins(a, makeMeasureSpec, 0, i2, 0);
                    layoutParams.height = i4;
                }
            }
        }
    }

    private View getLastNonGoneChild() {
        for (int virtualChildCount = getVirtualChildCount() - 1; virtualChildCount >= 0; virtualChildCount--) {
            View a = mo6452a(virtualChildCount);
            if (a != null && a.getVisibility() != 8) {
                return a;
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo6450a(View view) {
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo6451a(View view, int i) {
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo6458b(View view) {
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo6461b(Canvas canvas) {
        int i;
        int virtualChildCount = getVirtualChildCount();
        for (int i2 = 0; i2 < virtualChildCount; i2++) {
            View a = mo6452a(i2);
            if (!(a == null || a.getVisibility() == 8 || !mo6463b(i2))) {
                mo6456a(canvas, (a.getTop() - ((LayoutParams) a.getLayoutParams()).topMargin) - this.f4913r);
            }
        }
        if (mo6463b(virtualChildCount)) {
            View lastNonGoneChild = getLastNonGoneChild();
            if (lastNonGoneChild == null) {
                i = (getHeight() - getPaddingBottom()) - this.f4913r;
            } else {
                i = lastNonGoneChild.getBottom() + ((LayoutParams) lastNonGoneChild.getLayoutParams()).bottomMargin;
            }
            mo6456a(canvas, i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo6464c(int i) {
        return 0;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public CharSequence getAccessibilityClassName() {
        return LinearLayout.class.getName();
    }

    public int getBaseline() {
        if (this.f4902g < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i = this.f4902g;
        if (childCount > i) {
            View childAt = getChildAt(i);
            int baseline = childAt.getBaseline();
            if (baseline != -1) {
                int i2 = this.f4903h;
                if (this.f4904i == 1) {
                    int i3 = this.f4905j & 112;
                    if (i3 != 48) {
                        if (i3 == 16) {
                            i2 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f4906k) / 2;
                        } else if (i3 == 80) {
                            i2 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f4906k;
                        }
                    }
                }
                return i2 + ((LayoutParams) childAt.getLayoutParams()).topMargin + baseline;
            } else if (this.f4902g == 0) {
                return -1;
            } else {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
    }

    public int getBaselineAlignedChildIndex() {
        return this.f4902g;
    }

    public Drawable getDividerDrawable() {
        return this.f4911p;
    }

    public int getDividerPadding() {
        return this.f4915t;
    }

    public int getDividerWidth() {
        return this.f4912q;
    }

    public int getGravity() {
        return this.f4905j;
    }

    public int getOrientation() {
        return this.f4904i;
    }

    public int getShowDividers() {
        return this.f4914s;
    }

    /* access modifiers changed from: 0000 */
    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f4907l;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.f4911p != null) {
            if (this.f4904i == 1) {
                mo6461b(canvas);
            } else {
                mo6455a(canvas);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f4904i == 1) {
            mo6460b(i, i2, i3, i4);
        } else {
            mo6454a(i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f4904i == 1) {
            mo6459b(i, i2);
        } else {
            mo6453a(i, i2);
        }
    }

    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (i != this.f4916u) {
            this.f4916u = i;
            if (this.f4904i == 0) {
                requestLayout();
            }
        }
    }

    public void setBaselineAligned(boolean z) {
        this.f4901f = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i < 0 || i >= getChildCount()) {
            StringBuilder sb = new StringBuilder();
            sb.append("base aligned child index out of range (0, ");
            sb.append(getChildCount());
            sb.append(")");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f4902g = i;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable != this.f4911p) {
            this.f4911p = drawable;
            if (drawable != null) {
                this.f4912q = drawable.getIntrinsicWidth();
                this.f4913r = drawable.getIntrinsicHeight();
            } else {
                this.f4912q = 0;
                this.f4913r = 0;
            }
            setWillNotDraw(!mo6846a());
            requestLayout();
        }
    }

    public void setDividerPadding(int i) {
        if (i != this.f4915t) {
            this.f4915t = i;
            if (mo6846a()) {
                requestLayout();
                invalidate();
            }
        }
    }

    public void setGravity(int i) {
        if (this.f4905j != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f4905j = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.f4905j;
        if ((8388615 & i3) != i2) {
            this.f4905j = i2 | (-8388616 & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f4908m = z;
    }

    public void setOrientation(int i) {
        if (this.f4904i != i) {
            this.f4904i = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.f4914s) {
            this.f4914s = i;
            setWillNotDraw(!mo6846a());
            requestLayout();
        }
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.f4905j;
        if ((i3 & 112) != i2) {
            this.f4905j = i2 | (i3 & -113);
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.f4907l = Math.max(0.0f, f);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public LinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6455a(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        int virtualChildCount = getVirtualChildCount();
        boolean a = C1318b.m6320a(this);
        for (int i5 = 0; i5 < virtualChildCount; i5++) {
            View a2 = mo6452a(i5);
            if (!(a2 == null || a2.getVisibility() == 8 || !mo6463b(i5))) {
                LayoutParams layoutParams = (LayoutParams) a2.getLayoutParams();
                if (a) {
                    i4 = a2.getRight() + layoutParams.rightMargin;
                } else {
                    i4 = (a2.getLeft() - layoutParams.leftMargin) - this.f4912q;
                }
                mo6462b(canvas, i4);
            }
        }
        if (mo6463b(virtualChildCount)) {
            View lastNonGoneChild = getLastNonGoneChild();
            if (lastNonGoneChild != null) {
                LayoutParams layoutParams2 = (LayoutParams) lastNonGoneChild.getLayoutParams();
                if (a) {
                    i3 = lastNonGoneChild.getLeft() - layoutParams2.leftMargin;
                    i2 = this.f4912q;
                } else {
                    i = lastNonGoneChild.getRight() + layoutParams2.rightMargin;
                    mo6462b(canvas, i);
                }
            } else if (a) {
                i = getPaddingLeft();
                mo6462b(canvas, i);
            } else {
                i3 = getWidth() - getPaddingRight();
                i2 = this.f4912q;
            }
            i = i3 - i2;
            mo6462b(canvas, i);
        }
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateDefaultLayoutParams() {
        int i = this.f4904i;
        if (i == 0) {
            return new LayoutParams(-2, -2);
        }
        if (i == 1) {
            return new LayoutParams(-1, -2);
        }
        return null;
    }

    public LinearLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public LinearLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        boolean z = true;
        this.f4901f = true;
        this.f4902g = -1;
        this.f4903h = 0;
        this.f4905j = 8388659;
        this.f4916u = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7654c.LinearLayout, i, i2);
        int i3 = obtainStyledAttributes.getInt(C7654c.LinearLayout_android_orientation, -1);
        if (i3 >= 0) {
            setOrientation(i3);
        }
        int i4 = obtainStyledAttributes.getInt(C7654c.LinearLayout_android_gravity, -1);
        if (i4 >= 0) {
            setGravity(i4);
        }
        boolean z2 = obtainStyledAttributes.getBoolean(C7654c.LinearLayout_android_baselineAligned, true);
        if (!z2) {
            setBaselineAligned(z2);
        }
        this.f4907l = obtainStyledAttributes.getFloat(C7654c.LinearLayout_android_weightSum, -1.0f);
        this.f4902g = obtainStyledAttributes.getInt(C7654c.LinearLayout_android_baselineAlignedChildIndex, -1);
        this.f4908m = obtainStyledAttributes.getBoolean(C7654c.LinearLayout_android_measureWithLargestChild, false);
        this.f4914s = obtainStyledAttributes.getInt(C7654c.LinearLayout_android_showDividers, 0);
        this.f4915t = obtainStyledAttributes.getDimensionPixelSize(C7654c.LinearLayout_android_dividerPadding, 0);
        setDividerDrawable(obtainStyledAttributes.getDrawable(C7654c.LinearLayout_android_divider));
        if (context.getApplicationInfo().targetSdkVersion > 23) {
            z = false;
        }
        this.f4900e = z;
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof MarginLayoutParams) {
            return new LayoutParams((MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo6462b(Canvas canvas, int i) {
        this.f4911p.setBounds(i, getPaddingTop() + this.f4915t, this.f4912q + i, (getHeight() - getPaddingBottom()) - this.f4915t);
        this.f4911p.draw(canvas);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo6463b(int i) {
        return m6294b(i, false);
    }

    /* renamed from: b */
    private boolean m6294b(int i, boolean z) {
        int i2 = 4;
        boolean z2 = false;
        if (i == getVirtualChildCount()) {
            int i3 = this.f4914s;
            if (z) {
                i2 = 1;
            }
            if ((i3 & i2) != 0) {
                z2 = true;
            }
            return z2;
        } else if (m6293a(i, z)) {
            int i4 = this.f4914s;
            if (!z) {
                i2 = 1;
            }
            if ((i4 & i2) != 0) {
                z2 = true;
            }
            return z2;
        } else {
            if ((this.f4914s & 2) != 0) {
                z2 = true;
            }
            return z2;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6456a(Canvas canvas, int i) {
        this.f4911p.setBounds(getPaddingLeft() + this.f4915t, i, (getWidth() - getPaddingRight()) - this.f4915t, this.f4913r + i);
        this.f4911p.draw(canvas);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public View mo6452a(int i) {
        return getChildAt(i);
    }

    /* renamed from: a */
    private boolean m6293a(int i, boolean z) {
        if (z) {
            for (int i2 = i + 1; i2 < getVirtualChildCount(); i2++) {
                View a = mo6452a(i2);
                if (a != null && a.getVisibility() != 8) {
                    return false;
                }
            }
        } else {
            for (int i3 = i - 1; i3 >= 0; i3--) {
                View a2 = mo6452a(i3);
                if (a2 != null && a2.getVisibility() != 8) {
                    return false;
                }
            }
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02c2, code lost:
        if (r0 == 1073741824) goto L_0x02d0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x032f  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0171  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo6459b(int r35, int r36) {
        /*
            r34 = this;
            r7 = r34
            r8 = r35
            r9 = r36
            r10 = 0
            r7.f4906k = r10
            int r11 = r34.getVirtualChildCount()
            int r12 = android.view.View.MeasureSpec.getMode(r35)
            int r13 = android.view.View.MeasureSpec.getMode(r36)
            int r14 = r7.f4902g
            boolean r15 = r7.f4908m
            r16 = 0
            r17 = 1
            r0 = 0
            r1 = 0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 0
            r4 = 0
            r5 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 1
            r23 = 0
        L_0x0030:
            r6 = 8
            if (r5 >= r11) goto L_0x0197
            r25 = r4
            android.view.View r4 = r7.mo6452a(r5)
            if (r4 != 0) goto L_0x004d
            int r4 = r7.f4906k
            int r6 = r7.mo6464c(r5)
            int r4 = r4 + r6
            r7.f4906k = r4
        L_0x0045:
            r24 = r13
            r4 = r25
            r25 = r20
            goto L_0x018b
        L_0x004d:
            int r10 = r4.getVisibility()
            if (r10 != r6) goto L_0x0059
            int r4 = r7.mo6451a(r4, r5)
            int r5 = r5 + r4
            goto L_0x0045
        L_0x0059:
            int r10 = r0 + 1
            boolean r0 = r7.mo6463b(r5)
            if (r0 == 0) goto L_0x0068
            int r0 = r7.f4906k
            int r6 = r7.f4913r
            int r0 = r0 + r6
            r7.f4906k = r0
        L_0x0068:
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            r6 = r0
            app.zenly.android.base.widget.LinearLayout$LayoutParams r6 = (app.zenly.android.base.widget.LinearLayout.LayoutParams) r6
            float r0 = r6.f4917a
            float r26 = r1 + r0
            int r0 = r6.height
            if (r0 != 0) goto L_0x0082
            float r0 = r6.f4917a
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x0082
            r0 = 1073741824(0x40000000, float:2.0)
            r27 = 1
            goto L_0x0086
        L_0x0082:
            r0 = 1073741824(0x40000000, float:2.0)
            r27 = 0
        L_0x0086:
            if (r13 != r0) goto L_0x00ac
            if (r27 == 0) goto L_0x00ac
            int r0 = r7.f4906k
            int r1 = r6.topMargin
            int r1 = r1 + r0
            r28 = r2
            int r2 = r6.bottomMargin
            int r1 = r1 + r2
            int r0 = java.lang.Math.max(r0, r1)
            r7.f4906k = r0
            r33 = r5
            r9 = r6
            r24 = r13
            r8 = r25
            r2 = r28
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            r19 = 1
            r28 = r10
            r10 = r3
            r3 = r4
            goto L_0x0109
        L_0x00ac:
            r28 = r2
            if (r27 == 0) goto L_0x00b3
            r0 = -2
            r6.height = r0
        L_0x00b3:
            int r0 = (r26 > r16 ? 1 : (r26 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x00bc
            int r0 = r7.f4906k
            r29 = r0
            goto L_0x00be
        L_0x00bc:
            r29 = 0
        L_0x00be:
            r30 = 0
            r0 = r34
            r1 = r4
            r31 = r28
            r2 = r5
            r28 = r10
            r10 = r3
            r3 = r35
            r32 = r4
            r8 = r25
            r4 = r30
            r33 = r5
            r5 = r36
            r9 = r6
            r24 = r13
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r29
            r0.mo6457a(r1, r2, r3, r4, r5, r6)
            int r0 = r32.getMeasuredHeight()
            if (r27 == 0) goto L_0x00ea
            r1 = 0
            r9.height = r1
            int r18 = r18 + r0
        L_0x00ea:
            int r1 = r7.f4906k
            int r2 = r1 + r0
            int r3 = r9.topMargin
            int r2 = r2 + r3
            int r3 = r9.bottomMargin
            int r2 = r2 + r3
            r3 = r32
            int r4 = r7.mo6458b(r3)
            int r2 = r2 + r4
            int r1 = java.lang.Math.max(r1, r2)
            r7.f4906k = r1
            r2 = r31
            if (r15 == 0) goto L_0x0109
            int r2 = java.lang.Math.max(r0, r2)
        L_0x0109:
            if (r14 < 0) goto L_0x0116
            r0 = r33
            int r5 = r0 + 1
            if (r14 != r5) goto L_0x0118
            int r1 = r7.f4906k
            r7.f4903h = r1
            goto L_0x0118
        L_0x0116:
            r0 = r33
        L_0x0118:
            if (r0 >= r14) goto L_0x0129
            float r1 = r9.f4917a
            int r1 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r1 > 0) goto L_0x0121
            goto L_0x0129
        L_0x0121:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex."
            r0.<init>(r1)
            throw r0
        L_0x0129:
            r1 = 1073741824(0x40000000, float:2.0)
            if (r12 == r1) goto L_0x0136
            int r1 = r9.width
            r4 = -1
            if (r1 != r4) goto L_0x0136
            r1 = 1
            r23 = 1
            goto L_0x0137
        L_0x0136:
            r1 = 0
        L_0x0137:
            int r4 = r9.leftMargin
            int r5 = r9.rightMargin
            int r4 = r4 + r5
            int r5 = r3.getMeasuredWidth()
            int r5 = r5 + r4
            r6 = r20
            int r6 = java.lang.Math.max(r6, r5)
            int r13 = r3.getMeasuredState()
            r25 = r6
            r6 = r21
            int r6 = android.view.ViewGroup.combineMeasuredStates(r6, r13)
            if (r22 == 0) goto L_0x015e
            int r13 = r9.width
            r21 = r2
            r2 = -1
            if (r13 != r2) goto L_0x0160
            r2 = 1
            goto L_0x0161
        L_0x015e:
            r21 = r2
        L_0x0160:
            r2 = 0
        L_0x0161:
            float r9 = r9.f4917a
            int r9 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r9 <= 0) goto L_0x0171
            if (r1 == 0) goto L_0x016a
            goto L_0x016b
        L_0x016a:
            r4 = r5
        L_0x016b:
            int r1 = java.lang.Math.max(r10, r4)
            r4 = r8
            goto L_0x017a
        L_0x0171:
            if (r1 == 0) goto L_0x0174
            goto L_0x0175
        L_0x0174:
            r4 = r5
        L_0x0175:
            int r4 = java.lang.Math.max(r8, r4)
            r1 = r10
        L_0x017a:
            int r3 = r7.mo6451a(r3, r0)
            int r5 = r0 + r3
            r3 = r1
            r22 = r2
            r2 = r21
            r1 = r26
            r0 = r28
            r21 = r6
        L_0x018b:
            int r5 = r5 + 1
            r8 = r35
            r9 = r36
            r13 = r24
            r20 = r25
            goto L_0x0030
        L_0x0197:
            r10 = r3
            r8 = r4
            r24 = r13
            r25 = r20
            r6 = r21
            r3 = 8
            if (r0 <= 0) goto L_0x01b0
            boolean r0 = r7.mo6463b(r11)
            if (r0 == 0) goto L_0x01b0
            int r0 = r7.f4906k
            int r4 = r7.f4913r
            int r0 = r0 + r4
            r7.f4906k = r0
        L_0x01b0:
            r0 = r24
            if (r15 == 0) goto L_0x01fc
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r4) goto L_0x01ba
            if (r0 != 0) goto L_0x01fc
        L_0x01ba:
            r4 = 0
            r7.f4906k = r4
            r4 = 0
        L_0x01be:
            if (r4 >= r11) goto L_0x01fc
            android.view.View r5 = r7.mo6452a(r4)
            if (r5 != 0) goto L_0x01d0
            int r5 = r7.f4906k
            int r9 = r7.mo6464c(r4)
            int r5 = r5 + r9
            r7.f4906k = r5
            goto L_0x01f7
        L_0x01d0:
            int r9 = r5.getVisibility()
            if (r9 != r3) goto L_0x01dc
            int r5 = r7.mo6451a(r5, r4)
            int r4 = r4 + r5
            goto L_0x01f7
        L_0x01dc:
            android.view.ViewGroup$LayoutParams r9 = r5.getLayoutParams()
            app.zenly.android.base.widget.LinearLayout$LayoutParams r9 = (app.zenly.android.base.widget.LinearLayout.LayoutParams) r9
            int r13 = r7.f4906k
            int r14 = r13 + r2
            int r3 = r9.topMargin
            int r14 = r14 + r3
            int r3 = r9.bottomMargin
            int r14 = r14 + r3
            int r3 = r7.mo6458b(r5)
            int r14 = r14 + r3
            int r3 = java.lang.Math.max(r13, r14)
            r7.f4906k = r3
        L_0x01f7:
            int r4 = r4 + 1
            r3 = 8
            goto L_0x01be
        L_0x01fc:
            int r3 = r7.f4906k
            int r4 = r34.getPaddingTop()
            int r5 = r34.getPaddingBottom()
            int r4 = r4 + r5
            int r3 = r3 + r4
            r7.f4906k = r3
            int r3 = r7.f4906k
            int r4 = r34.getSuggestedMinimumHeight()
            int r3 = java.lang.Math.max(r3, r4)
            r4 = r36
            r5 = 0
            int r3 = android.view.ViewGroup.resolveSizeAndState(r3, r4, r5)
            r5 = 16777215(0xffffff, float:2.3509886E-38)
            r5 = r5 & r3
            int r9 = r7.f4906k
            int r5 = r5 - r9
            boolean r9 = r7.f4900e
            if (r9 == 0) goto L_0x0228
            r18 = 0
        L_0x0228:
            int r5 = r5 + r18
            if (r19 != 0) goto L_0x0275
            if (r5 == 0) goto L_0x0233
            int r9 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r9 <= 0) goto L_0x0233
            goto L_0x0275
        L_0x0233:
            int r1 = java.lang.Math.max(r8, r10)
            if (r15 == 0) goto L_0x026f
            r5 = 1073741824(0x40000000, float:2.0)
            if (r0 == r5) goto L_0x026f
            r0 = 0
        L_0x023e:
            if (r0 >= r11) goto L_0x026f
            android.view.View r5 = r7.mo6452a(r0)
            if (r5 == 0) goto L_0x026c
            int r8 = r5.getVisibility()
            r9 = 8
            if (r8 != r9) goto L_0x024f
            goto L_0x026c
        L_0x024f:
            android.view.ViewGroup$LayoutParams r8 = r5.getLayoutParams()
            app.zenly.android.base.widget.LinearLayout$LayoutParams r8 = (app.zenly.android.base.widget.LinearLayout.LayoutParams) r8
            float r8 = r8.f4917a
            int r8 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r8 <= 0) goto L_0x026c
            int r8 = r5.getMeasuredWidth()
            r9 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r9)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r9)
            r5.measure(r8, r10)
        L_0x026c:
            int r0 = r0 + 1
            goto L_0x023e
        L_0x026f:
            r9 = r35
            r5 = r25
            goto L_0x0381
        L_0x0275:
            float r9 = r7.f4907l
            int r10 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r10 <= 0) goto L_0x027c
            r1 = r9
        L_0x027c:
            r9 = 0
            r7.f4906k = r9
            r10 = r1
            r9 = r5
            r5 = r25
            r1 = 0
        L_0x0284:
            if (r1 >= r11) goto L_0x0370
            android.view.View r13 = r7.mo6452a(r1)
            if (r13 == 0) goto L_0x0360
            int r14 = r13.getVisibility()
            r15 = 8
            if (r14 != r15) goto L_0x0296
            goto L_0x0360
        L_0x0296:
            android.view.ViewGroup$LayoutParams r14 = r13.getLayoutParams()
            app.zenly.android.base.widget.LinearLayout$LayoutParams r14 = (app.zenly.android.base.widget.LinearLayout.LayoutParams) r14
            float r15 = r14.f4917a
            int r18 = (r15 > r16 ? 1 : (r15 == r16 ? 0 : -1))
            if (r18 <= 0) goto L_0x0305
            r31 = r2
            float r2 = (float) r9
            float r2 = r2 * r15
            float r2 = r2 / r10
            int r2 = (int) r2
            int r9 = r9 - r2
            float r10 = r10 - r15
            boolean r15 = r7.f4908m
            if (r15 == 0) goto L_0x02b8
            r15 = 1073741824(0x40000000, float:2.0)
            if (r0 == r15) goto L_0x02b8
            r24 = r0
            r2 = r31
            goto L_0x02d2
        L_0x02b8:
            int r15 = r14.height
            if (r15 != 0) goto L_0x02c8
            boolean r15 = r7.f4900e
            if (r15 == 0) goto L_0x02c5
            r15 = 1073741824(0x40000000, float:2.0)
            if (r0 != r15) goto L_0x02ca
            goto L_0x02d0
        L_0x02c5:
            r15 = 1073741824(0x40000000, float:2.0)
            goto L_0x02d0
        L_0x02c8:
            r15 = 1073741824(0x40000000, float:2.0)
        L_0x02ca:
            int r18 = r13.getMeasuredHeight()
            int r2 = r18 + r2
        L_0x02d0:
            r24 = r0
        L_0x02d2:
            r0 = 0
            int r2 = java.lang.Math.max(r0, r2)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r15)
            int r15 = r34.getPaddingLeft()
            int r18 = r34.getPaddingRight()
            int r15 = r15 + r18
            int r0 = r14.leftMargin
            int r15 = r15 + r0
            int r0 = r14.rightMargin
            int r15 = r15 + r0
            int r0 = r14.width
            r18 = r9
            r9 = r35
            int r0 = android.view.ViewGroup.getChildMeasureSpec(r9, r15, r0)
            r13.measure(r0, r2)
            int r0 = r13.getMeasuredState()
            r0 = r0 & -256(0xffffffffffffff00, float:NaN)
            int r6 = android.view.ViewGroup.combineMeasuredStates(r6, r0)
            r0 = r18
            goto L_0x030c
        L_0x0305:
            r24 = r0
            r31 = r2
            r0 = r9
            r9 = r35
        L_0x030c:
            int r2 = r14.leftMargin
            int r15 = r14.rightMargin
            int r2 = r2 + r15
            int r15 = r13.getMeasuredWidth()
            int r15 = r15 + r2
            int r5 = java.lang.Math.max(r5, r15)
            r18 = r0
            r0 = 1073741824(0x40000000, float:2.0)
            if (r12 == r0) goto L_0x0329
            int r0 = r14.width
            r19 = r2
            r2 = -1
            if (r0 != r2) goto L_0x032c
            r0 = 1
            goto L_0x032d
        L_0x0329:
            r19 = r2
            r2 = -1
        L_0x032c:
            r0 = 0
        L_0x032d:
            if (r0 == 0) goto L_0x0331
            r15 = r19
        L_0x0331:
            int r0 = java.lang.Math.max(r8, r15)
            if (r22 == 0) goto L_0x033d
            int r8 = r14.width
            if (r8 != r2) goto L_0x033d
            r8 = 1
            goto L_0x033e
        L_0x033d:
            r8 = 0
        L_0x033e:
            int r15 = r7.f4906k
            int r19 = r13.getMeasuredHeight()
            int r19 = r15 + r19
            int r2 = r14.topMargin
            int r19 = r19 + r2
            int r2 = r14.bottomMargin
            int r19 = r19 + r2
            int r2 = r7.mo6458b(r13)
            int r2 = r19 + r2
            int r2 = java.lang.Math.max(r15, r2)
            r7.f4906k = r2
            r22 = r8
            r8 = r0
            r0 = r18
            goto L_0x0367
        L_0x0360:
            r24 = r0
            r31 = r2
            r0 = r9
            r9 = r35
        L_0x0367:
            int r1 = r1 + 1
            r9 = r0
            r0 = r24
            r2 = r31
            goto L_0x0284
        L_0x0370:
            r9 = r35
            int r0 = r7.f4906k
            int r1 = r34.getPaddingTop()
            int r2 = r34.getPaddingBottom()
            int r1 = r1 + r2
            int r0 = r0 + r1
            r7.f4906k = r0
            r1 = r8
        L_0x0381:
            if (r22 != 0) goto L_0x0388
            r0 = 1073741824(0x40000000, float:2.0)
            if (r12 == r0) goto L_0x0388
            goto L_0x0389
        L_0x0388:
            r1 = r5
        L_0x0389:
            int r0 = r34.getPaddingLeft()
            int r2 = r34.getPaddingRight()
            int r0 = r0 + r2
            int r1 = r1 + r0
            int r0 = r34.getSuggestedMinimumWidth()
            int r0 = java.lang.Math.max(r1, r0)
            int r0 = android.view.ViewGroup.resolveSizeAndState(r0, r9, r6)
            r7.setMeasuredDimension(r0, r3)
            if (r23 == 0) goto L_0x03a7
            r7.m6296d(r11, r4)
        L_0x03a7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.android.base.widget.LinearLayout.mo6459b(int, int):void");
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x03a7, code lost:
        if (r12 == 1073741824) goto L_0x03b5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x045b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo6453a(int r42, int r43) {
        /*
            r41 = this;
            r7 = r41
            r8 = r42
            r9 = r43
            r10 = 0
            r7.f4906k = r10
            int r11 = r41.getVirtualChildCount()
            int r12 = android.view.View.MeasureSpec.getMode(r42)
            int r13 = android.view.View.MeasureSpec.getMode(r43)
            int[] r0 = r7.f4909n
            r14 = 4
            if (r0 == 0) goto L_0x001e
            int[] r0 = r7.f4910o
            if (r0 != 0) goto L_0x0026
        L_0x001e:
            int[] r0 = new int[r14]
            r7.f4909n = r0
            int[] r0 = new int[r14]
            r7.f4910o = r0
        L_0x0026:
            int[] r15 = r7.f4909n
            int[] r6 = r7.f4910o
            r16 = 3
            r5 = -1
            r15[r16] = r5
            r17 = 2
            r15[r17] = r5
            r18 = 1
            r15[r18] = r5
            r15[r10] = r5
            r6[r16] = r5
            r6[r17] = r5
            r6[r18] = r5
            r6[r10] = r5
            boolean r4 = r7.f4901f
            boolean r3 = r7.f4908m
            r2 = 1073741824(0x40000000, float:2.0)
            if (r12 != r2) goto L_0x004c
            r19 = 1
            goto L_0x004e
        L_0x004c:
            r19 = 0
        L_0x004e:
            r20 = 0
            r0 = 0
            r14 = -2147483648(0xffffffff80000000, float:-0.0)
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r29 = 0
            r30 = 0
            r31 = 1
        L_0x0067:
            r32 = r6
            r1 = 8
            if (r0 >= r11) goto L_0x020e
            android.view.View r6 = r7.mo6452a(r0)
            if (r6 != 0) goto L_0x0082
            int r1 = r7.f4906k
            int r6 = r7.mo6464c(r0)
            int r1 = r1 + r6
            r7.f4906k = r1
        L_0x007c:
            r39 = r3
            r40 = r4
            goto L_0x01fe
        L_0x0082:
            int r5 = r6.getVisibility()
            if (r5 != r1) goto L_0x008e
            int r1 = r7.mo6451a(r6, r0)
            int r0 = r0 + r1
            goto L_0x007c
        L_0x008e:
            int r21 = r21 + 1
            boolean r1 = r7.mo6463b(r0)
            if (r1 == 0) goto L_0x009d
            int r1 = r7.f4906k
            int r5 = r7.f4912q
            int r1 = r1 + r5
            r7.f4906k = r1
        L_0x009d:
            android.view.ViewGroup$LayoutParams r1 = r6.getLayoutParams()
            r5 = r1
            app.zenly.android.base.widget.LinearLayout$LayoutParams r5 = (app.zenly.android.base.widget.LinearLayout.LayoutParams) r5
            float r1 = r5.f4917a
            float r22 = r22 + r1
            int r1 = r5.width
            if (r1 != 0) goto L_0x00b5
            float r1 = r5.f4917a
            int r1 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r1 <= 0) goto L_0x00b5
            r36 = 1
            goto L_0x00b7
        L_0x00b5:
            r36 = 0
        L_0x00b7:
            if (r12 != r2) goto L_0x0109
            if (r36 == 0) goto L_0x0109
            if (r19 == 0) goto L_0x00c8
            int r1 = r7.f4906k
            int r2 = r5.leftMargin
            int r10 = r5.rightMargin
            int r2 = r2 + r10
            int r1 = r1 + r2
            r7.f4906k = r1
            goto L_0x00d6
        L_0x00c8:
            int r1 = r7.f4906k
            int r2 = r5.leftMargin
            int r2 = r2 + r1
            int r10 = r5.rightMargin
            int r2 = r2 + r10
            int r1 = java.lang.Math.max(r1, r2)
            r7.f4906k = r1
        L_0x00d6:
            if (r4 == 0) goto L_0x00f8
            int r1 = android.view.View.MeasureSpec.getSize(r42)
            r2 = 0
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r2)
            int r10 = android.view.View.MeasureSpec.getSize(r43)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r2)
            r6.measure(r1, r10)
            r33 = r0
            r39 = r3
            r40 = r4
            r10 = r5
            r3 = r6
            r0 = 1073741824(0x40000000, float:2.0)
            r9 = -1
            goto L_0x0105
        L_0x00f8:
            r33 = r0
            r39 = r3
            r40 = r4
            r10 = r5
            r3 = r6
            r0 = 1073741824(0x40000000, float:2.0)
            r9 = -1
            r24 = 1
        L_0x0105:
            r38 = -2
            goto L_0x0179
        L_0x0109:
            r10 = -2
            if (r36 == 0) goto L_0x010e
            r5.width = r10
        L_0x010e:
            int r1 = (r22 > r20 ? 1 : (r22 == r20 ? 0 : -1))
            if (r1 != 0) goto L_0x0117
            int r1 = r7.f4906k
            r34 = r1
            goto L_0x0119
        L_0x0117:
            r34 = 0
        L_0x0119:
            r37 = 0
            r2 = r0
            r0 = r41
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r6
            r33 = r2
            r10 = 1073741824(0x40000000, float:2.0)
            r39 = r3
            r3 = r42
            r40 = r4
            r4 = r34
            r10 = r5
            r9 = -1
            r5 = r43
            r35 = r6
            r38 = -2
            r6 = r37
            r0.mo6457a(r1, r2, r3, r4, r5, r6)
            int r0 = r35.getMeasuredWidth()
            if (r36 == 0) goto L_0x0145
            r1 = 0
            r10.width = r1
            int r25 = r25 + r0
        L_0x0145:
            if (r19 == 0) goto L_0x015a
            int r1 = r7.f4906k
            int r2 = r10.leftMargin
            int r2 = r2 + r0
            int r3 = r10.rightMargin
            int r2 = r2 + r3
            r3 = r35
            int r4 = r7.mo6458b(r3)
            int r2 = r2 + r4
            int r1 = r1 + r2
            r7.f4906k = r1
            goto L_0x0171
        L_0x015a:
            r3 = r35
            int r1 = r7.f4906k
            int r2 = r1 + r0
            int r4 = r10.leftMargin
            int r2 = r2 + r4
            int r4 = r10.rightMargin
            int r2 = r2 + r4
            int r4 = r7.mo6458b(r3)
            int r2 = r2 + r4
            int r1 = java.lang.Math.max(r1, r2)
            r7.f4906k = r1
        L_0x0171:
            if (r39 == 0) goto L_0x0177
            int r14 = java.lang.Math.max(r0, r14)
        L_0x0177:
            r0 = 1073741824(0x40000000, float:2.0)
        L_0x0179:
            if (r13 == r0) goto L_0x0183
            int r0 = r10.height
            if (r0 != r9) goto L_0x0183
            r0 = 1
            r29 = 1
            goto L_0x0184
        L_0x0183:
            r0 = 0
        L_0x0184:
            int r1 = r10.topMargin
            int r2 = r10.bottomMargin
            int r1 = r1 + r2
            int r2 = r3.getMeasuredHeight()
            int r2 = r2 + r1
            int r4 = r3.getMeasuredState()
            r5 = r30
            int r4 = android.view.ViewGroup.combineMeasuredStates(r5, r4)
            if (r40 == 0) goto L_0x01c2
            int r5 = r3.getBaseline()
            if (r5 == r9) goto L_0x01c2
            int r6 = r10.f4918b
            if (r6 >= 0) goto L_0x01a6
            int r6 = r7.f4905j
        L_0x01a6:
            r6 = r6 & 112(0x70, float:1.57E-43)
            r28 = 4
            int r6 = r6 >> 4
            r6 = r6 & -2
            int r6 = r6 >> 1
            r9 = r15[r6]
            int r9 = java.lang.Math.max(r9, r5)
            r15[r6] = r9
            r9 = r32[r6]
            int r5 = r2 - r5
            int r5 = java.lang.Math.max(r9, r5)
            r32[r6] = r5
        L_0x01c2:
            r6 = r23
            int r5 = java.lang.Math.max(r6, r2)
            if (r31 == 0) goto L_0x01d1
            int r6 = r10.height
            r9 = -1
            if (r6 != r9) goto L_0x01d1
            r6 = 1
            goto L_0x01d2
        L_0x01d1:
            r6 = 0
        L_0x01d2:
            float r9 = r10.f4917a
            int r9 = (r9 > r20 ? 1 : (r9 == r20 ? 0 : -1))
            if (r9 <= 0) goto L_0x01e3
            if (r0 == 0) goto L_0x01db
            goto L_0x01dc
        L_0x01db:
            r1 = r2
        L_0x01dc:
            r10 = r27
            int r27 = java.lang.Math.max(r10, r1)
            goto L_0x01f1
        L_0x01e3:
            r10 = r27
            if (r0 == 0) goto L_0x01e8
            goto L_0x01e9
        L_0x01e8:
            r1 = r2
        L_0x01e9:
            r0 = r26
            int r26 = java.lang.Math.max(r0, r1)
            r27 = r10
        L_0x01f1:
            r10 = r33
            int r0 = r7.mo6451a(r3, r10)
            int r0 = r0 + r10
            r30 = r4
            r23 = r5
            r31 = r6
        L_0x01fe:
            int r0 = r0 + 1
            r9 = r43
            r6 = r32
            r3 = r39
            r4 = r40
            r2 = 1073741824(0x40000000, float:2.0)
            r5 = -1
            r10 = 0
            goto L_0x0067
        L_0x020e:
            r39 = r3
            r40 = r4
            r6 = r23
            r0 = r26
            r10 = r27
            r5 = r30
            r38 = -2
            if (r21 <= 0) goto L_0x022b
            boolean r2 = r7.mo6463b(r11)
            if (r2 == 0) goto L_0x022b
            int r2 = r7.f4906k
            int r3 = r7.f4912q
            int r2 = r2 + r3
            r7.f4906k = r2
        L_0x022b:
            r2 = r15[r18]
            r3 = -1
            if (r2 != r3) goto L_0x023d
            r2 = 0
            r4 = r15[r2]
            if (r4 != r3) goto L_0x023d
            r2 = r15[r17]
            if (r2 != r3) goto L_0x023d
            r2 = r15[r16]
            if (r2 == r3) goto L_0x026d
        L_0x023d:
            r2 = r15[r16]
            r3 = 0
            r4 = r15[r3]
            r9 = r15[r18]
            r1 = r15[r17]
            int r1 = java.lang.Math.max(r9, r1)
            int r1 = java.lang.Math.max(r4, r1)
            int r1 = java.lang.Math.max(r2, r1)
            r2 = r32[r16]
            r4 = r32[r3]
            r3 = r32[r18]
            r9 = r32[r17]
            int r3 = java.lang.Math.max(r3, r9)
            int r3 = java.lang.Math.max(r4, r3)
            int r2 = java.lang.Math.max(r2, r3)
            int r1 = r1 + r2
            int r23 = java.lang.Math.max(r6, r1)
            r6 = r23
        L_0x026d:
            if (r39 == 0) goto L_0x02d0
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r12 == r1) goto L_0x0275
            if (r12 != 0) goto L_0x02d0
        L_0x0275:
            r1 = 0
            r7.f4906k = r1
            r1 = 0
        L_0x0279:
            if (r1 >= r11) goto L_0x02d0
            android.view.View r2 = r7.mo6452a(r1)
            if (r2 != 0) goto L_0x028d
            int r2 = r7.f4906k
            int r3 = r7.mo6464c(r1)
            int r2 = r2 + r3
            r7.f4906k = r2
        L_0x028a:
            r23 = r1
            goto L_0x02cb
        L_0x028d:
            int r3 = r2.getVisibility()
            r4 = 8
            if (r3 != r4) goto L_0x029b
            int r2 = r7.mo6451a(r2, r1)
            int r1 = r1 + r2
            goto L_0x02cd
        L_0x029b:
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            app.zenly.android.base.widget.LinearLayout$LayoutParams r3 = (app.zenly.android.base.widget.LinearLayout.LayoutParams) r3
            if (r19 == 0) goto L_0x02b4
            int r4 = r7.f4906k
            int r9 = r3.leftMargin
            int r9 = r9 + r14
            int r3 = r3.rightMargin
            int r9 = r9 + r3
            int r2 = r7.mo6458b(r2)
            int r9 = r9 + r2
            int r4 = r4 + r9
            r7.f4906k = r4
            goto L_0x028a
        L_0x02b4:
            int r4 = r7.f4906k
            int r9 = r4 + r14
            r23 = r1
            int r1 = r3.leftMargin
            int r9 = r9 + r1
            int r1 = r3.rightMargin
            int r9 = r9 + r1
            int r1 = r7.mo6458b(r2)
            int r9 = r9 + r1
            int r1 = java.lang.Math.max(r4, r9)
            r7.f4906k = r1
        L_0x02cb:
            r1 = r23
        L_0x02cd:
            int r1 = r1 + 1
            goto L_0x0279
        L_0x02d0:
            int r1 = r7.f4906k
            int r2 = r41.getPaddingLeft()
            int r3 = r41.getPaddingRight()
            int r2 = r2 + r3
            int r1 = r1 + r2
            r7.f4906k = r1
            int r1 = r7.f4906k
            int r2 = r41.getSuggestedMinimumWidth()
            int r1 = java.lang.Math.max(r1, r2)
            r2 = 0
            int r1 = android.view.ViewGroup.resolveSizeAndState(r1, r8, r2)
            r2 = 16777215(0xffffff, float:2.3509886E-38)
            r2 = r2 & r1
            int r3 = r7.f4906k
            int r2 = r2 - r3
            boolean r3 = r7.f4900e
            if (r3 == 0) goto L_0x02fa
            r25 = 0
        L_0x02fa:
            int r2 = r2 + r25
            if (r24 != 0) goto L_0x0345
            if (r2 == 0) goto L_0x0305
            int r4 = (r22 > r20 ? 1 : (r22 == r20 ? 0 : -1))
            if (r4 <= 0) goto L_0x0305
            goto L_0x0345
        L_0x0305:
            int r0 = java.lang.Math.max(r0, r10)
            if (r39 == 0) goto L_0x0341
            r2 = 1073741824(0x40000000, float:2.0)
            if (r12 == r2) goto L_0x0341
            r2 = 0
        L_0x0310:
            if (r2 >= r11) goto L_0x0341
            android.view.View r4 = r7.mo6452a(r2)
            if (r4 == 0) goto L_0x033e
            int r9 = r4.getVisibility()
            r10 = 8
            if (r9 != r10) goto L_0x0321
            goto L_0x033e
        L_0x0321:
            android.view.ViewGroup$LayoutParams r9 = r4.getLayoutParams()
            app.zenly.android.base.widget.LinearLayout$LayoutParams r9 = (app.zenly.android.base.widget.LinearLayout.LayoutParams) r9
            float r9 = r9.f4917a
            int r9 = (r9 > r20 ? 1 : (r9 == r20 ? 0 : -1))
            if (r9 <= 0) goto L_0x033e
            r9 = 1073741824(0x40000000, float:2.0)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r9)
            int r12 = r4.getMeasuredHeight()
            int r12 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r9)
            r4.measure(r10, r12)
        L_0x033e:
            int r2 = r2 + 1
            goto L_0x0310
        L_0x0341:
            r4 = r43
            goto L_0x04ef
        L_0x0345:
            float r4 = r7.f4907l
            int r6 = (r4 > r20 ? 1 : (r4 == r20 ? 0 : -1))
            if (r6 <= 0) goto L_0x034c
            goto L_0x034e
        L_0x034c:
            r4 = r22
        L_0x034e:
            r9 = -1
            r15[r16] = r9
            r15[r17] = r9
            r15[r18] = r9
            r6 = 0
            r15[r6] = r9
            r32[r16] = r9
            r32[r17] = r9
            r32[r18] = r9
            r32[r6] = r9
            r7.f4906k = r6
            r10 = r0
            r6 = r5
            r0 = 0
            r5 = -1
        L_0x0366:
            if (r0 >= r11) goto L_0x0499
            android.view.View r9 = r7.mo6452a(r0)
            if (r9 == 0) goto L_0x0486
            int r3 = r9.getVisibility()
            r23 = r14
            r14 = 8
            if (r3 != r14) goto L_0x037d
            r8 = r4
            r26 = r12
            goto L_0x048b
        L_0x037d:
            android.view.ViewGroup$LayoutParams r3 = r9.getLayoutParams()
            app.zenly.android.base.widget.LinearLayout$LayoutParams r3 = (app.zenly.android.base.widget.LinearLayout.LayoutParams) r3
            float r14 = r3.f4917a
            int r24 = (r14 > r20 ? 1 : (r14 == r20 ? 0 : -1))
            if (r24 <= 0) goto L_0x03ef
            float r8 = (float) r2
            float r8 = r8 * r14
            float r8 = r8 / r4
            int r8 = (int) r8
            int r2 = r2 - r8
            float r4 = r4 - r14
            boolean r14 = r7.f4908m
            if (r14 == 0) goto L_0x039d
            r14 = 1073741824(0x40000000, float:2.0)
            if (r12 == r14) goto L_0x039d
            r24 = r2
            r8 = r23
            goto L_0x03b7
        L_0x039d:
            int r14 = r3.width
            if (r14 != 0) goto L_0x03ad
            boolean r14 = r7.f4900e
            if (r14 == 0) goto L_0x03aa
            r14 = 1073741824(0x40000000, float:2.0)
            if (r12 != r14) goto L_0x03af
            goto L_0x03b5
        L_0x03aa:
            r14 = 1073741824(0x40000000, float:2.0)
            goto L_0x03b5
        L_0x03ad:
            r14 = 1073741824(0x40000000, float:2.0)
        L_0x03af:
            int r24 = r9.getMeasuredWidth()
            int r8 = r24 + r8
        L_0x03b5:
            r24 = r2
        L_0x03b7:
            r2 = 0
            int r8 = java.lang.Math.max(r2, r8)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r14)
            int r8 = r41.getPaddingTop()
            int r14 = r41.getPaddingBottom()
            int r8 = r8 + r14
            int r14 = r3.topMargin
            int r8 = r8 + r14
            int r14 = r3.bottomMargin
            int r8 = r8 + r14
            int r14 = r3.height
            r25 = r4
            r26 = r12
            r12 = -1
            r4 = r43
            int r8 = android.view.ViewGroup.getChildMeasureSpec(r4, r8, r14)
            r9.measure(r2, r8)
            int r2 = r9.getMeasuredState()
            r8 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2 = r2 & r8
            int r6 = android.view.ViewGroup.combineMeasuredStates(r6, r2)
            r2 = r24
            r8 = r25
            goto L_0x03f5
        L_0x03ef:
            r8 = r4
            r26 = r12
            r12 = -1
            r4 = r43
        L_0x03f5:
            if (r19 == 0) goto L_0x0412
            int r14 = r7.f4906k
            int r24 = r9.getMeasuredWidth()
            int r12 = r3.leftMargin
            int r24 = r24 + r12
            int r12 = r3.rightMargin
            int r24 = r24 + r12
            int r12 = r7.mo6458b(r9)
            int r24 = r24 + r12
            int r14 = r14 + r24
            r7.f4906k = r14
            r24 = r2
            goto L_0x042c
        L_0x0412:
            int r12 = r7.f4906k
            int r14 = r9.getMeasuredWidth()
            int r14 = r14 + r12
            r24 = r2
            int r2 = r3.leftMargin
            int r14 = r14 + r2
            int r2 = r3.rightMargin
            int r14 = r14 + r2
            int r2 = r7.mo6458b(r9)
            int r14 = r14 + r2
            int r2 = java.lang.Math.max(r12, r14)
            r7.f4906k = r2
        L_0x042c:
            r2 = 1073741824(0x40000000, float:2.0)
            if (r13 == r2) goto L_0x0437
            int r2 = r3.height
            r12 = -1
            if (r2 != r12) goto L_0x0437
            r2 = 1
            goto L_0x0438
        L_0x0437:
            r2 = 0
        L_0x0438:
            int r12 = r3.topMargin
            int r14 = r3.bottomMargin
            int r12 = r12 + r14
            int r14 = r9.getMeasuredHeight()
            int r14 = r14 + r12
            int r5 = java.lang.Math.max(r5, r14)
            if (r2 == 0) goto L_0x0449
            goto L_0x044a
        L_0x0449:
            r12 = r14
        L_0x044a:
            int r2 = java.lang.Math.max(r10, r12)
            if (r31 == 0) goto L_0x0457
            int r10 = r3.height
            r12 = -1
            if (r10 != r12) goto L_0x0458
            r10 = 1
            goto L_0x0459
        L_0x0457:
            r12 = -1
        L_0x0458:
            r10 = 0
        L_0x0459:
            if (r40 == 0) goto L_0x0480
            int r9 = r9.getBaseline()
            if (r9 == r12) goto L_0x0480
            int r3 = r3.f4918b
            if (r3 >= 0) goto L_0x0467
            int r3 = r7.f4905j
        L_0x0467:
            r3 = r3 & 112(0x70, float:1.57E-43)
            r12 = 4
            int r3 = r3 >> r12
            r3 = r3 & -2
            int r3 = r3 >> 1
            r12 = r15[r3]
            int r12 = java.lang.Math.max(r12, r9)
            r15[r3] = r12
            r12 = r32[r3]
            int r14 = r14 - r9
            int r9 = java.lang.Math.max(r12, r14)
            r32[r3] = r9
        L_0x0480:
            r31 = r10
            r10 = r2
            r2 = r24
            goto L_0x048d
        L_0x0486:
            r8 = r4
            r26 = r12
            r23 = r14
        L_0x048b:
            r4 = r43
        L_0x048d:
            int r0 = r0 + 1
            r4 = r8
            r14 = r23
            r12 = r26
            r9 = -1
            r8 = r42
            goto L_0x0366
        L_0x0499:
            r4 = r43
            int r0 = r7.f4906k
            int r2 = r41.getPaddingLeft()
            int r3 = r41.getPaddingRight()
            int r2 = r2 + r3
            int r0 = r0 + r2
            r7.f4906k = r0
            r0 = r15[r18]
            r2 = -1
            if (r0 != r2) goto L_0x04be
            r0 = 0
            r3 = r15[r0]
            if (r3 != r2) goto L_0x04be
            r0 = r15[r17]
            if (r0 != r2) goto L_0x04be
            r0 = r15[r16]
            if (r0 == r2) goto L_0x04bc
            goto L_0x04be
        L_0x04bc:
            r0 = r5
            goto L_0x04ec
        L_0x04be:
            r0 = r15[r16]
            r2 = 0
            r3 = r15[r2]
            r8 = r15[r18]
            r9 = r15[r17]
            int r8 = java.lang.Math.max(r8, r9)
            int r3 = java.lang.Math.max(r3, r8)
            int r0 = java.lang.Math.max(r0, r3)
            r3 = r32[r16]
            r2 = r32[r2]
            r8 = r32[r18]
            r9 = r32[r17]
            int r8 = java.lang.Math.max(r8, r9)
            int r2 = java.lang.Math.max(r2, r8)
            int r2 = java.lang.Math.max(r3, r2)
            int r0 = r0 + r2
            int r0 = java.lang.Math.max(r5, r0)
        L_0x04ec:
            r5 = r6
            r6 = r0
            r0 = r10
        L_0x04ef:
            if (r31 != 0) goto L_0x04f6
            r2 = 1073741824(0x40000000, float:2.0)
            if (r13 == r2) goto L_0x04f6
            goto L_0x04f7
        L_0x04f6:
            r0 = r6
        L_0x04f7:
            int r2 = r41.getPaddingTop()
            int r3 = r41.getPaddingBottom()
            int r2 = r2 + r3
            int r0 = r0 + r2
            int r2 = r41.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r0, r2)
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2 = r2 & r5
            r1 = r1 | r2
            int r2 = r5 << 16
            int r0 = android.view.ViewGroup.resolveSizeAndState(r0, r4, r2)
            r7.setMeasuredDimension(r1, r0)
            if (r29 == 0) goto L_0x051d
            r0 = r42
            r7.m6295c(r11, r0)
        L_0x051d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.android.base.widget.LinearLayout.mo6453a(int, int):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo6460b(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int paddingLeft = getPaddingLeft();
        int i9 = i3 - i;
        int paddingRight = i9 - getPaddingRight();
        int paddingRight2 = (i9 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        int i10 = this.f4905j;
        int i11 = i10 & 112;
        int i12 = i10 & 8388615;
        if (i11 == 16) {
            i5 = getPaddingTop() + (((i4 - i2) - this.f4906k) / 2);
        } else if (i11 != 80) {
            i5 = getPaddingTop();
        } else {
            i5 = ((getPaddingTop() + i4) - i2) - this.f4906k;
        }
        int i13 = 0;
        while (i13 < virtualChildCount) {
            View a = mo6452a(i13);
            if (a == null) {
                i5 += mo6464c(i13);
            } else if (a.getVisibility() != 8) {
                int measuredWidth = a.getMeasuredWidth();
                int measuredHeight = a.getMeasuredHeight();
                LayoutParams layoutParams = (LayoutParams) a.getLayoutParams();
                int i14 = layoutParams.f4918b;
                if (i14 < 0) {
                    i14 = i12;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i14, getLayoutDirection()) & 7;
                if (absoluteGravity == 1) {
                    i7 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + layoutParams.leftMargin;
                    i6 = layoutParams.rightMargin;
                    i8 = i7 - i6;
                } else if (absoluteGravity != 5) {
                    i8 = layoutParams.leftMargin + paddingLeft;
                } else {
                    i7 = paddingRight - measuredWidth;
                    i6 = layoutParams.rightMargin;
                    i8 = i7 - i6;
                }
                int i15 = i8;
                if (mo6463b(i13)) {
                    i5 += this.f4913r;
                }
                int i16 = i5 + layoutParams.topMargin;
                LayoutParams layoutParams2 = layoutParams;
                m6291a(a, i15, i16 + mo6450a(a), measuredWidth, measuredHeight);
                i13 += mo6451a(a, i13);
                i5 = i16 + measuredHeight + layoutParams2.bottomMargin + mo6458b(a);
            }
            i13++;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6457a(View view, int i, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f6  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo6454a(int r26, int r27, int r28, int r29) {
        /*
            r25 = this;
            r6 = r25
            boolean r7 = app.zenly.android.base.widget.C1318b.m6320a(r25)
            int r8 = r25.getPaddingTop()
            int r0 = r29 - r27
            int r1 = r25.getPaddingBottom()
            int r9 = r0 - r1
            int r0 = r0 - r8
            int r1 = r25.getPaddingBottom()
            int r10 = r0 - r1
            int r11 = r25.getVirtualChildCount()
            int r0 = r6.f4905j
            r1 = 8388615(0x800007, float:1.1754953E-38)
            r1 = r1 & r0
            r12 = r0 & 112(0x70, float:1.57E-43)
            boolean r13 = r6.f4901f
            int[] r14 = r6.f4909n
            int[] r15 = r6.f4910o
            int r0 = r25.getLayoutDirection()
            int r0 = android.view.Gravity.getAbsoluteGravity(r1, r0)
            r16 = 2
            r5 = 1
            if (r0 == r5) goto L_0x004c
            r1 = 5
            if (r0 == r1) goto L_0x0040
            int r0 = r25.getPaddingLeft()
            goto L_0x0058
        L_0x0040:
            int r0 = r25.getPaddingLeft()
            int r0 = r0 + r28
            int r0 = r0 - r26
            int r1 = r6.f4906k
            int r0 = r0 - r1
            goto L_0x0058
        L_0x004c:
            int r0 = r25.getPaddingLeft()
            int r1 = r28 - r26
            int r2 = r6.f4906k
            int r1 = r1 - r2
            int r1 = r1 / 2
            int r0 = r0 + r1
        L_0x0058:
            r1 = 0
            if (r7 == 0) goto L_0x0062
            int r2 = r11 + -1
            r17 = r2
            r18 = -1
            goto L_0x0066
        L_0x0062:
            r17 = 0
            r18 = 1
        L_0x0066:
            r3 = 0
        L_0x0067:
            if (r3 >= r11) goto L_0x0142
            int r1 = r18 * r3
            int r2 = r17 + r1
            android.view.View r1 = r6.mo6452a(r2)
            if (r1 != 0) goto L_0x007a
            int r1 = r6.mo6464c(r2)
            int r0 = r0 + r1
            goto L_0x012d
        L_0x007a:
            int r5 = r1.getVisibility()
            r4 = 8
            if (r5 == r4) goto L_0x012b
            int r19 = r1.getMeasuredWidth()
            int r5 = r1.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r4 = r1.getLayoutParams()
            app.zenly.android.base.widget.LinearLayout$LayoutParams r4 = (app.zenly.android.base.widget.LinearLayout.LayoutParams) r4
            r28 = r3
            if (r13 == 0) goto L_0x00a0
            int r3 = r4.height
            r29 = r11
            r11 = -1
            if (r3 == r11) goto L_0x00a2
            int r3 = r1.getBaseline()
            goto L_0x00a3
        L_0x00a0:
            r29 = r11
        L_0x00a2:
            r3 = -1
        L_0x00a3:
            int r11 = r4.f4918b
            if (r11 >= 0) goto L_0x00a8
            r11 = r12
        L_0x00a8:
            r11 = r11 & 112(0x70, float:1.57E-43)
            r20 = r12
            r12 = 16
            if (r11 == r12) goto L_0x00e2
            r12 = 48
            if (r11 == r12) goto L_0x00d2
            r12 = 80
            if (r11 == r12) goto L_0x00bd
            r3 = r8
            r12 = -1
        L_0x00ba:
            r21 = 1
            goto L_0x00f0
        L_0x00bd:
            int r11 = r9 - r5
            int r12 = r4.bottomMargin
            int r11 = r11 - r12
            r12 = -1
            if (r3 == r12) goto L_0x00d0
            int r21 = r1.getMeasuredHeight()
            int r21 = r21 - r3
            r3 = r15[r16]
            int r3 = r3 - r21
            int r11 = r11 - r3
        L_0x00d0:
            r3 = r11
            goto L_0x00ba
        L_0x00d2:
            r12 = -1
            int r11 = r4.topMargin
            int r11 = r11 + r8
            r21 = 1
            if (r3 == r12) goto L_0x00e0
            r22 = r14[r21]
            int r22 = r22 - r3
            int r11 = r11 + r22
        L_0x00e0:
            r3 = r11
            goto L_0x00f0
        L_0x00e2:
            r12 = -1
            r21 = 1
            int r3 = r10 - r5
            int r3 = r3 / 2
            int r3 = r3 + r8
            int r11 = r4.topMargin
            int r3 = r3 + r11
            int r11 = r4.bottomMargin
            int r3 = r3 - r11
        L_0x00f0:
            boolean r11 = r6.m6294b(r2, r7)
            if (r11 == 0) goto L_0x00f9
            int r11 = r6.f4912q
            int r0 = r0 + r11
        L_0x00f9:
            int r11 = r4.leftMargin
            int r11 = r11 + r0
            int r0 = r6.mo6450a(r1)
            int r22 = r11 + r0
            r0 = r25
            r26 = r1
            r12 = r2
            r2 = r22
            r22 = r28
            r23 = r7
            r24 = -1
            r7 = r4
            r4 = r19
            r0.m6291a(r1, r2, r3, r4, r5)
            int r0 = r7.rightMargin
            int r19 = r19 + r0
            r0 = r26
            int r1 = r6.mo6458b(r0)
            int r19 = r19 + r1
            int r11 = r11 + r19
            int r0 = r6.mo6451a(r0, r12)
            int r3 = r22 + r0
            r0 = r11
            goto L_0x0137
        L_0x012b:
            r22 = r3
        L_0x012d:
            r23 = r7
            r29 = r11
            r20 = r12
            r21 = 1
            r24 = -1
        L_0x0137:
            int r3 = r3 + 1
            r11 = r29
            r12 = r20
            r7 = r23
            r5 = 1
            goto L_0x0067
        L_0x0142:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.android.base.widget.LinearLayout.mo6454a(int, int, int, int):void");
    }

    /* renamed from: a */
    private void m6291a(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }
}
