package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewDebug.ExportedProperty;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0169i;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuBuilder.ItemInvoker;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuPresenter.Callback;
import androidx.appcompat.view.menu.MenuView;

public class ActionMenuView extends LinearLayoutCompat implements ItemInvoker, MenuView {

    /* renamed from: e */
    private MenuBuilder f826e;

    /* renamed from: f */
    private Context f827f;

    /* renamed from: g */
    private int f828g;

    /* renamed from: h */
    private boolean f829h;

    /* renamed from: i */
    private ActionMenuPresenter f830i;

    /* renamed from: j */
    private Callback f831j;

    /* renamed from: k */
    MenuBuilder.Callback f832k;

    /* renamed from: l */
    private boolean f833l;

    /* renamed from: m */
    private int f834m;

    /* renamed from: n */
    private int f835n;

    /* renamed from: o */
    private int f836o;

    /* renamed from: p */
    OnMenuItemClickListener f837p;

    public interface ActionMenuChildView {
        boolean needsDividerAfter();

        boolean needsDividerBefore();
    }

    public static class LayoutParams extends androidx.appcompat.widget.LinearLayoutCompat.LayoutParams {
        @ExportedProperty

        /* renamed from: c */
        public boolean f838c;
        @ExportedProperty

        /* renamed from: d */
        public int f839d;
        @ExportedProperty

        /* renamed from: e */
        public int f840e;
        @ExportedProperty

        /* renamed from: f */
        public boolean f841f;
        @ExportedProperty

        /* renamed from: g */
        public boolean f842g;

        /* renamed from: h */
        boolean f843h;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.f838c = layoutParams.f838c;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f838c = false;
        }
    }

    public interface OnMenuItemClickListener {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$a */
    private static class C0198a implements Callback {
        C0198a() {
        }

        public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
        }

        public boolean onOpenSubMenu(MenuBuilder menuBuilder) {
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$b */
    private class C0199b implements MenuBuilder.Callback {
        C0199b() {
        }

        public boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
            OnMenuItemClickListener onMenuItemClickListener = ActionMenuView.this.f837p;
            return onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(menuItem);
        }

        public void onMenuModeChange(MenuBuilder menuBuilder) {
            MenuBuilder.Callback callback = ActionMenuView.this.f832k;
            if (callback != null) {
                callback.onMenuModeChange(menuBuilder);
            }
        }
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m778a(int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z2;
        int mode = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingTop, -2);
        int i9 = size - paddingLeft;
        int i10 = this.f835n;
        int i11 = i9 / i10;
        int i12 = i9 % i10;
        if (i11 == 0) {
            setMeasuredDimension(i9, 0);
            return;
        }
        int i13 = i10 + (i12 / i11);
        int childCount = getChildCount();
        int i14 = i11;
        int i15 = 0;
        int i16 = 0;
        boolean z3 = false;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        long j = 0;
        while (i15 < childCount) {
            View childAt = getChildAt(i15);
            int i20 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z4 = childAt instanceof ActionMenuItemView;
                int i21 = i17 + 1;
                if (z4) {
                    int i22 = this.f836o;
                    i8 = i21;
                    z2 = false;
                    childAt.setPadding(i22, 0, i22, 0);
                } else {
                    i8 = i21;
                    z2 = false;
                }
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                layoutParams.f843h = z2;
                layoutParams.f840e = z2 ? 1 : 0;
                layoutParams.f839d = z2;
                layoutParams.f841f = z2;
                layoutParams.leftMargin = z2;
                layoutParams.rightMargin = z2;
                layoutParams.f842g = z4 && ((ActionMenuItemView) childAt).mo674a();
                int a = m777a(childAt, i13, layoutParams.f838c ? 1 : i14, childMeasureSpec, paddingTop);
                int max = Math.max(i18, a);
                if (layoutParams.f841f) {
                    i19++;
                }
                if (layoutParams.f838c) {
                    z3 = true;
                }
                i14 -= a;
                i16 = Math.max(i16, childAt.getMeasuredHeight());
                if (a == 1) {
                    j |= (long) (1 << i15);
                    i16 = i16;
                } else {
                    int i23 = i16;
                }
                i18 = max;
                i17 = i8;
            }
            i15++;
            size2 = i20;
        }
        int i24 = size2;
        boolean z5 = z3 && i17 == 2;
        boolean z6 = false;
        while (true) {
            if (i19 <= 0 || i14 <= 0) {
                i5 = mode;
                i3 = i9;
                z = z6;
                i4 = i16;
            } else {
                int i25 = Integer.MAX_VALUE;
                int i26 = 0;
                int i27 = 0;
                long j2 = 0;
                while (i26 < childCount) {
                    boolean z7 = z6;
                    LayoutParams layoutParams2 = (LayoutParams) getChildAt(i26).getLayoutParams();
                    int i28 = i16;
                    if (layoutParams2.f841f) {
                        int i29 = layoutParams2.f839d;
                        if (i29 < i25) {
                            i25 = i29;
                            j2 = 1 << i26;
                            i27 = 1;
                        } else if (i29 == i25) {
                            j2 |= 1 << i26;
                            i27++;
                        }
                    }
                    i26++;
                    i16 = i28;
                    z6 = z7;
                }
                z = z6;
                i4 = i16;
                j |= j2;
                if (i27 > i14) {
                    i5 = mode;
                    i3 = i9;
                    break;
                }
                int i30 = i25 + 1;
                int i31 = 0;
                while (i31 < childCount) {
                    View childAt2 = getChildAt(i31);
                    LayoutParams layoutParams3 = (LayoutParams) childAt2.getLayoutParams();
                    int i32 = i9;
                    int i33 = mode;
                    long j3 = (long) (1 << i31);
                    if ((j2 & j3) == 0) {
                        if (layoutParams3.f839d == i30) {
                            j |= j3;
                        }
                        i7 = i30;
                    } else {
                        if (!z5 || !layoutParams3.f842g || i14 != 1) {
                            i7 = i30;
                        } else {
                            int i34 = this.f836o;
                            i7 = i30;
                            childAt2.setPadding(i34 + i13, 0, i34, 0);
                        }
                        layoutParams3.f839d++;
                        layoutParams3.f843h = true;
                        i14--;
                    }
                    i31++;
                    mode = i33;
                    i30 = i7;
                    i9 = i32;
                }
                i16 = i4;
                z6 = true;
            }
        }
        boolean z8 = !z3 && i17 == 1;
        if (i14 <= 0 || j == 0 || (i14 >= i17 - 1 && !z8 && i18 <= 1)) {
            i6 = 0;
        } else {
            float bitCount = (float) Long.bitCount(j);
            if (!z8) {
                i6 = 0;
                if ((j & 1) != 0 && !((LayoutParams) getChildAt(0).getLayoutParams()).f842g) {
                    bitCount -= 0.5f;
                }
                int i35 = childCount - 1;
                if ((j & ((long) (1 << i35))) != 0 && !((LayoutParams) getChildAt(i35).getLayoutParams()).f842g) {
                    bitCount -= 0.5f;
                }
            } else {
                i6 = 0;
            }
            int i36 = bitCount > 0.0f ? (int) (((float) (i14 * i13)) / bitCount) : 0;
            for (int i37 = 0; i37 < childCount; i37++) {
                if ((j & ((long) (1 << i37))) != 0) {
                    View childAt3 = getChildAt(i37);
                    LayoutParams layoutParams4 = (LayoutParams) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        layoutParams4.f840e = i36;
                        layoutParams4.f843h = true;
                        if (i37 == 0 && !layoutParams4.f842g) {
                            layoutParams4.leftMargin = (-i36) / 2;
                        }
                    } else if (layoutParams4.f838c) {
                        layoutParams4.f840e = i36;
                        layoutParams4.f843h = true;
                        layoutParams4.rightMargin = (-i36) / 2;
                    } else {
                        if (i37 != 0) {
                            layoutParams4.leftMargin = i36 / 2;
                        }
                        if (i37 != childCount - 1) {
                            layoutParams4.rightMargin = i36 / 2;
                        }
                    }
                    z = true;
                }
            }
        }
        if (z) {
            while (i6 < childCount) {
                View childAt4 = getChildAt(i6);
                LayoutParams layoutParams5 = (LayoutParams) childAt4.getLayoutParams();
                if (layoutParams5.f843h) {
                    childAt4.measure(MeasureSpec.makeMeasureSpec((layoutParams5.f839d * i13) + layoutParams5.f840e, 1073741824), childMeasureSpec);
                }
                i6++;
            }
        }
        setMeasuredDimension(i3, i5 != 1073741824 ? i4 : i24);
    }

    /* renamed from: b */
    public LayoutParams mo1223b() {
        LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.f838c = true;
        return generateDefaultLayoutParams;
    }

    /* renamed from: c */
    public boolean mo1224c() {
        ActionMenuPresenter actionMenuPresenter = this.f830i;
        return actionMenuPresenter != null && actionMenuPresenter.mo1206d();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* renamed from: d */
    public boolean mo1226d() {
        ActionMenuPresenter actionMenuPresenter = this.f830i;
        return actionMenuPresenter != null && actionMenuPresenter.mo1208f();
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    /* renamed from: e */
    public boolean mo1228e() {
        ActionMenuPresenter actionMenuPresenter = this.f830i;
        return actionMenuPresenter != null && actionMenuPresenter.mo1209g();
    }

    /* renamed from: f */
    public boolean mo1229f() {
        return this.f829h;
    }

    /* renamed from: g */
    public MenuBuilder mo1230g() {
        return this.f826e;
    }

    public Menu getMenu() {
        if (this.f826e == null) {
            Context context = getContext();
            this.f826e = new MenuBuilder(context);
            this.f826e.mo718a((MenuBuilder.Callback) new C0199b());
            this.f830i = new ActionMenuPresenter(context);
            this.f830i.mo1203b(true);
            ActionMenuPresenter actionMenuPresenter = this.f830i;
            Callback callback = this.f831j;
            if (callback == null) {
                callback = new C0198a();
            }
            actionMenuPresenter.setCallback(callback);
            this.f826e.mo720a((MenuPresenter) this.f830i, this.f827f);
            this.f830i.mo1201a(this);
        }
        return this.f826e;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f830i.mo1205c();
    }

    public int getPopupTheme() {
        return this.f828g;
    }

    public int getWindowAnimations() {
        return 0;
    }

    /* renamed from: h */
    public boolean mo1237h() {
        ActionMenuPresenter actionMenuPresenter = this.f830i;
        return actionMenuPresenter != null && actionMenuPresenter.mo1210h();
    }

    public void initialize(MenuBuilder menuBuilder) {
        this.f826e = menuBuilder;
    }

    public boolean invokeItem(C0169i iVar) {
        return this.f826e.mo723a((MenuItem) iVar, 0);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter actionMenuPresenter = this.f830i;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.updateMenuView(false);
            if (this.f830i.mo1209g()) {
                this.f830i.mo1206d();
                this.f830i.mo1210h();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo1220a();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        if (!this.f833l) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i9 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i10 = i3 - i;
        int paddingRight = (i10 - getPaddingRight()) - getPaddingLeft();
        boolean a = C0254f0.m992a(this);
        int i11 = paddingRight;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f838c) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (mo1222a(i14)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a) {
                        i7 = getPaddingLeft() + layoutParams.leftMargin;
                        i8 = i7 + measuredWidth;
                    } else {
                        i8 = (getWidth() - getPaddingRight()) - layoutParams.rightMargin;
                        i7 = i8 - measuredWidth;
                    }
                    int i15 = i9 - (measuredHeight / 2);
                    childAt.layout(i7, i15, i8, measuredHeight + i15);
                    i11 -= measuredWidth;
                    i12 = 1;
                } else {
                    i11 -= (childAt.getMeasuredWidth() + layoutParams.leftMargin) + layoutParams.rightMargin;
                    boolean a2 = mo1222a(i14);
                    i13++;
                }
            }
        }
        if (childCount == 1 && i12 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i16 = (i10 / 2) - (measuredWidth2 / 2);
            int i17 = i9 - (measuredHeight2 / 2);
            childAt2.layout(i16, i17, measuredWidth2 + i16, measuredHeight2 + i17);
            return;
        }
        int i18 = i13 - (i12 ^ 1);
        if (i18 > 0) {
            i5 = i11 / i18;
            i6 = 0;
        } else {
            i6 = 0;
            i5 = 0;
        }
        int max = Math.max(i6, i5);
        if (a) {
            int width = getWidth() - getPaddingRight();
            while (i6 < childCount) {
                View childAt3 = getChildAt(i6);
                LayoutParams layoutParams2 = (LayoutParams) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !layoutParams2.f838c) {
                    int i19 = width - layoutParams2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i20 = i9 - (measuredHeight3 / 2);
                    childAt3.layout(i19 - measuredWidth3, i20, i19, measuredHeight3 + i20);
                    width = i19 - ((measuredWidth3 + layoutParams2.leftMargin) + max);
                }
                i6++;
            }
        } else {
            int paddingLeft = getPaddingLeft();
            while (i6 < childCount) {
                View childAt4 = getChildAt(i6);
                LayoutParams layoutParams3 = (LayoutParams) childAt4.getLayoutParams();
                if (childAt4.getVisibility() != 8 && !layoutParams3.f838c) {
                    int i21 = paddingLeft + layoutParams3.leftMargin;
                    int measuredWidth4 = childAt4.getMeasuredWidth();
                    int measuredHeight4 = childAt4.getMeasuredHeight();
                    int i22 = i9 - (measuredHeight4 / 2);
                    childAt4.layout(i21, i22, i21 + measuredWidth4, measuredHeight4 + i22);
                    paddingLeft = i21 + measuredWidth4 + layoutParams3.rightMargin + max;
                }
                i6++;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        boolean z = this.f833l;
        this.f833l = MeasureSpec.getMode(i) == 1073741824;
        if (z != this.f833l) {
            this.f834m = 0;
        }
        int size = MeasureSpec.getSize(i);
        if (this.f833l) {
            MenuBuilder menuBuilder = this.f826e;
            if (!(menuBuilder == null || size == this.f834m)) {
                this.f834m = size;
                menuBuilder.mo740b(true);
            }
        }
        int childCount = getChildCount();
        if (!this.f833l || childCount <= 0) {
            for (int i3 = 0; i3 < childCount; i3++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i3).getLayoutParams();
                layoutParams.rightMargin = 0;
                layoutParams.leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        m778a(i, i2);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f830i.mo1202a(z);
    }

    public void setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.f837p = onMenuItemClickListener;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f830i.mo1200a(drawable);
    }

    public void setOverflowReserved(boolean z) {
        this.f829h = z;
    }

    public void setPopupTheme(int i) {
        if (this.f828g != i) {
            this.f828g = i;
            if (i == 0) {
                this.f827f = getContext();
            } else {
                this.f827f = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.f830i = actionMenuPresenter;
        this.f830i.mo1201a(this);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f835n = (int) (56.0f * f);
        this.f836o = (int) (f * 4.0f);
        this.f827f = context;
        this.f828g = 0;
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.f916b = 16;
        return layoutParams;
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        LayoutParams layoutParams2 = layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : new LayoutParams(layoutParams);
        if (layoutParams2.f916b <= 0) {
            layoutParams2.f916b = 16;
        }
        return layoutParams2;
    }

    /* renamed from: a */
    static int m777a(View view, int i, int i2, int i3, int i4) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(i3) - i4, MeasureSpec.getMode(i3));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z = true;
        boolean z2 = actionMenuItemView != null && actionMenuItemView.mo674a();
        int i5 = 2;
        if (i2 <= 0 || (z2 && i2 < 2)) {
            i5 = 0;
        } else {
            view.measure(MeasureSpec.makeMeasureSpec(i2 * i, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i6 = measuredWidth / i;
            if (measuredWidth % i != 0) {
                i6++;
            }
            if (!z2 || i6 >= 2) {
                i5 = i6;
            }
        }
        if (layoutParams.f838c || !z2) {
            z = false;
        }
        layoutParams.f841f = z;
        layoutParams.f839d = i5;
        view.measure(MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
        return i5;
    }

    /* renamed from: a */
    public void mo1221a(Callback callback, MenuBuilder.Callback callback2) {
        this.f831j = callback;
        this.f832k = callback2;
    }

    /* renamed from: a */
    public void mo1220a() {
        ActionMenuPresenter actionMenuPresenter = this.f830i;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.mo1204b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo1222a(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof ActionMenuChildView)) {
            z = false | ((ActionMenuChildView) childAt).needsDividerAfter();
        }
        if (i > 0 && (childAt2 instanceof ActionMenuChildView)) {
            z |= ((ActionMenuChildView) childAt2).needsDividerBefore();
        }
        return z;
    }
}
