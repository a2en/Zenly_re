package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.MenuPresenter.Callback;
import androidx.core.view.C0646h;
import androidx.core.view.NestedScrollingParent;
import androidx.core.view.NestedScrollingParent2;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.ViewCompat;
import p214e.p215a.C7521a;
import p214e.p215a.C7526f;

public class ActionBarOverlayLayout extends ViewGroup implements DecorContentParent, NestedScrollingParent, NestedScrollingParent2, NestedScrollingParent3 {

    /* renamed from: F */
    static final int[] f766F = {C7521a.actionBarSize, 16842841};

    /* renamed from: A */
    ViewPropertyAnimator f767A;

    /* renamed from: B */
    final AnimatorListenerAdapter f768B;

    /* renamed from: C */
    private final Runnable f769C;

    /* renamed from: D */
    private final Runnable f770D;

    /* renamed from: E */
    private final C0646h f771E;

    /* renamed from: e */
    private int f772e;

    /* renamed from: f */
    private int f773f;

    /* renamed from: g */
    private ContentFrameLayout f774g;

    /* renamed from: h */
    ActionBarContainer f775h;

    /* renamed from: i */
    private DecorToolbar f776i;

    /* renamed from: j */
    private Drawable f777j;

    /* renamed from: k */
    private boolean f778k;

    /* renamed from: l */
    private boolean f779l;

    /* renamed from: m */
    private boolean f780m;

    /* renamed from: n */
    private boolean f781n;

    /* renamed from: o */
    boolean f782o;

    /* renamed from: p */
    private int f783p;

    /* renamed from: q */
    private int f784q;

    /* renamed from: r */
    private final Rect f785r;

    /* renamed from: s */
    private final Rect f786s;

    /* renamed from: t */
    private final Rect f787t;

    /* renamed from: u */
    private final Rect f788u;

    /* renamed from: v */
    private final Rect f789v;

    /* renamed from: w */
    private final Rect f790w;

    /* renamed from: x */
    private final Rect f791x;

    /* renamed from: y */
    private ActionBarVisibilityCallback f792y;

    /* renamed from: z */
    private OverScroller f793z;

    public interface ActionBarVisibilityCallback {
        void enableContentAnimations(boolean z);

        void hideForSystem();

        void onContentScrollStarted();

        void onContentScrollStopped();

        void onWindowVisibilityChanged(int i);

        void showForSystem();
    }

    public static class LayoutParams extends MarginLayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$a */
    class C0187a extends AnimatorListenerAdapter {
        C0187a() {
        }

        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f767A = null;
            actionBarOverlayLayout.f782o = false;
        }

        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f767A = null;
            actionBarOverlayLayout.f782o = false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$b */
    class C0188b implements Runnable {
        C0188b() {
        }

        public void run() {
            ActionBarOverlayLayout.this.mo1138a();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f767A = actionBarOverlayLayout.f775h.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f768B);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$c */
    class C0189c implements Runnable {
        C0189c() {
        }

        public void run() {
            ActionBarOverlayLayout.this.mo1138a();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f767A = actionBarOverlayLayout.f775h.animate().translationY((float) (-ActionBarOverlayLayout.this.f775h.getHeight())).setListener(ActionBarOverlayLayout.this.f768B);
        }
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m738a(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f766F);
        boolean z = false;
        this.f772e = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f777j = obtainStyledAttributes.getDrawable(1);
        setWillNotDraw(this.f777j == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z = true;
        }
        this.f778k = z;
        this.f793z = new OverScroller(context);
    }

    /* renamed from: d */
    private void m741d() {
        mo1138a();
        this.f770D.run();
    }

    /* renamed from: e */
    private void m742e() {
        mo1138a();
        postDelayed(this.f770D, 600);
    }

    /* renamed from: f */
    private void m743f() {
        mo1138a();
        postDelayed(this.f769C, 600);
    }

    /* renamed from: g */
    private void m744g() {
        mo1138a();
        this.f769C.run();
    }

    /* renamed from: b */
    public boolean mo1139b() {
        return this.f779l;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo1140c() {
        if (this.f774g == null) {
            this.f774g = (ContentFrameLayout) findViewById(C7526f.action_bar_activity_content);
            this.f775h = (ActionBarContainer) findViewById(C7526f.action_bar_container);
            this.f776i = m737a(findViewById(C7526f.action_bar));
        }
    }

    public boolean canShowOverflowMenu() {
        mo1140c();
        return this.f776i.canShowOverflowMenu();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void dismissPopups() {
        mo1140c();
        this.f776i.dismissPopupMenus();
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f777j != null && !this.f778k) {
            int bottom = this.f775h.getVisibility() == 0 ? (int) (((float) this.f775h.getBottom()) + this.f775h.getTranslationY() + 0.5f) : 0;
            this.f777j.setBounds(0, bottom, getWidth(), this.f777j.getIntrinsicHeight() + bottom);
            this.f777j.draw(canvas);
        }
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        mo1140c();
        int v = ViewCompat.m2869v(this) & 256;
        boolean a = m740a(this.f775h, rect, true, true, false, true);
        this.f788u.set(rect);
        C0254f0.m991a(this, this.f788u, this.f785r);
        if (!this.f789v.equals(this.f788u)) {
            this.f789v.set(this.f788u);
            a = true;
        }
        if (!this.f786s.equals(this.f785r)) {
            this.f786s.set(this.f785r);
            a = true;
        }
        if (a) {
            requestLayout();
        }
        return true;
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f775h;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        return this.f771E.mo3405a();
    }

    public CharSequence getTitle() {
        mo1140c();
        return this.f776i.getTitle();
    }

    public boolean hasIcon() {
        mo1140c();
        return this.f776i.hasIcon();
    }

    public boolean hasLogo() {
        mo1140c();
        return this.f776i.hasLogo();
    }

    public boolean hideOverflowMenu() {
        mo1140c();
        return this.f776i.hideOverflowMenu();
    }

    public void initFeature(int i) {
        mo1140c();
        if (i == 2) {
            this.f776i.initProgress();
        } else if (i == 5) {
            this.f776i.initIndeterminateProgress();
        } else if (i == 109) {
            setOverlayMode(true);
        }
    }

    public boolean isOverflowMenuShowPending() {
        mo1140c();
        return this.f776i.isOverflowMenuShowPending();
    }

    public boolean isOverflowMenuShowing() {
        mo1140c();
        return this.f776i.isOverflowMenuShowing();
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m738a(getContext());
        ViewCompat.m2809I(this);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo1138a();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        getPaddingRight();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int i6 = layoutParams.leftMargin + paddingLeft;
                int i7 = layoutParams.topMargin + paddingTop;
                childAt.layout(i6, i7, childAt.getMeasuredWidth() + i6, childAt.getMeasuredHeight() + i7);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        mo1140c();
        measureChildWithMargins(this.f775h, i, 0, i2, 0);
        LayoutParams layoutParams = (LayoutParams) this.f775h.getLayoutParams();
        int max = Math.max(0, this.f775h.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
        int max2 = Math.max(0, this.f775h.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f775h.getMeasuredState());
        boolean z = (ViewCompat.m2869v(this) & 256) != 0;
        if (z) {
            i3 = this.f772e;
            if (this.f780m && this.f775h.getTabContainer() != null) {
                i3 += this.f772e;
            }
        } else {
            i3 = this.f775h.getVisibility() != 8 ? this.f775h.getMeasuredHeight() : 0;
        }
        this.f787t.set(this.f785r);
        this.f790w.set(this.f788u);
        if (this.f779l || z) {
            Rect rect = this.f790w;
            rect.top += i3;
            rect.bottom += 0;
        } else {
            Rect rect2 = this.f787t;
            rect2.top += i3;
            rect2.bottom += 0;
        }
        m740a(this.f774g, this.f787t, true, true, true, true);
        if (!this.f791x.equals(this.f790w)) {
            this.f791x.set(this.f790w);
            this.f774g.mo1444a(this.f790w);
        }
        measureChildWithMargins(this.f774g, i, 0, i2, 0);
        LayoutParams layoutParams2 = (LayoutParams) this.f774g.getLayoutParams();
        int max3 = Math.max(max, this.f774g.getMeasuredWidth() + layoutParams2.leftMargin + layoutParams2.rightMargin);
        int max4 = Math.max(max2, this.f774g.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f774g.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f781n || !z) {
            return false;
        }
        if (m739a(f, f2)) {
            m741d();
        } else {
            m744g();
        }
        this.f782o = true;
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        onNestedScroll(view, i, i2, i3, i4, i5);
    }

    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    public void onStopNestedScroll(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    public void onWindowSystemUiVisibilityChanged(int i) {
        if (VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i);
        }
        mo1140c();
        int i2 = this.f784q ^ i;
        this.f784q = i;
        boolean z = false;
        boolean z2 = (i & 4) == 0;
        if ((i & 256) != 0) {
            z = true;
        }
        ActionBarVisibilityCallback actionBarVisibilityCallback = this.f792y;
        if (actionBarVisibilityCallback != null) {
            actionBarVisibilityCallback.enableContentAnimations(!z);
            if (z2 || !z) {
                this.f792y.showForSystem();
            } else {
                this.f792y.hideForSystem();
            }
        }
        if ((i2 & 256) != 0 && this.f792y != null) {
            ViewCompat.m2809I(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f773f = i;
        ActionBarVisibilityCallback actionBarVisibilityCallback = this.f792y;
        if (actionBarVisibilityCallback != null) {
            actionBarVisibilityCallback.onWindowVisibilityChanged(i);
        }
    }

    public void restoreToolbarHierarchyState(SparseArray<Parcelable> sparseArray) {
        mo1140c();
        this.f776i.restoreHierarchyState(sparseArray);
    }

    public void saveToolbarHierarchyState(SparseArray<Parcelable> sparseArray) {
        mo1140c();
        this.f776i.saveHierarchyState(sparseArray);
    }

    public void setActionBarHideOffset(int i) {
        mo1138a();
        this.f775h.setTranslationY((float) (-Math.max(0, Math.min(i, this.f775h.getHeight()))));
    }

    public void setActionBarVisibilityCallback(ActionBarVisibilityCallback actionBarVisibilityCallback) {
        this.f792y = actionBarVisibilityCallback;
        if (getWindowToken() != null) {
            this.f792y.onWindowVisibilityChanged(this.f773f);
            int i = this.f784q;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                ViewCompat.m2809I(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f780m = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f781n) {
            this.f781n = z;
            if (!z) {
                mo1138a();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i) {
        mo1140c();
        this.f776i.setIcon(i);
    }

    public void setLogo(int i) {
        mo1140c();
        this.f776i.setLogo(i);
    }

    public void setMenu(Menu menu, Callback callback) {
        mo1140c();
        this.f776i.setMenu(menu, callback);
    }

    public void setMenuPrepared() {
        mo1140c();
        this.f776i.setMenuPrepared();
    }

    public void setOverlayMode(boolean z) {
        this.f779l = z;
        this.f778k = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public void setWindowCallback(Window.Callback callback) {
        mo1140c();
        this.f776i.setWindowCallback(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        mo1140c();
        this.f776i.setWindowTitle(charSequence);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public boolean showOverflowMenu() {
        mo1140c();
        return this.f776i.showOverflowMenu();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f773f = 0;
        this.f785r = new Rect();
        this.f786s = new Rect();
        this.f787t = new Rect();
        this.f788u = new Rect();
        this.f789v = new Rect();
        this.f790w = new Rect();
        this.f791x = new Rect();
        this.f768B = new C0187a();
        this.f769C = new C0188b();
        this.f770D = new C0189c();
        m738a(context);
        this.f771E = new C0646h(this);
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f771E.mo3408a(view, view2, i);
        this.f783p = getActionBarHideOffset();
        mo1138a();
        ActionBarVisibilityCallback actionBarVisibilityCallback = this.f792y;
        if (actionBarVisibilityCallback != null) {
            actionBarVisibilityCallback.onContentScrollStarted();
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f775h.getVisibility() != 0) {
            return false;
        }
        return this.f781n;
    }

    public void onStopNestedScroll(View view) {
        if (this.f781n && !this.f782o) {
            if (this.f783p <= this.f775h.getHeight()) {
                m743f();
            } else {
                m742e();
            }
        }
        ActionBarVisibilityCallback actionBarVisibilityCallback = this.f792y;
        if (actionBarVisibilityCallback != null) {
            actionBarVisibilityCallback.onContentScrollStopped();
        }
    }

    /* access modifiers changed from: protected */
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        this.f783p += i2;
        setActionBarHideOffset(this.f783p);
    }

    public void setIcon(Drawable drawable) {
        mo1140c();
        this.f776i.setIcon(drawable);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0016  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m740a(android.view.View r3, android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        /*
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$LayoutParams r3 = (androidx.appcompat.widget.ActionBarOverlayLayout.LayoutParams) r3
            r0 = 1
            if (r5 == 0) goto L_0x0013
            int r5 = r3.leftMargin
            int r1 = r4.left
            if (r5 == r1) goto L_0x0013
            r3.leftMargin = r1
            r5 = 1
            goto L_0x0014
        L_0x0013:
            r5 = 0
        L_0x0014:
            if (r6 == 0) goto L_0x001f
            int r6 = r3.topMargin
            int r1 = r4.top
            if (r6 == r1) goto L_0x001f
            r3.topMargin = r1
            r5 = 1
        L_0x001f:
            if (r8 == 0) goto L_0x002a
            int r6 = r3.rightMargin
            int r8 = r4.right
            if (r6 == r8) goto L_0x002a
            r3.rightMargin = r8
            r5 = 1
        L_0x002a:
            if (r7 == 0) goto L_0x0035
            int r6 = r3.bottomMargin
            int r4 = r4.bottom
            if (r6 == r4) goto L_0x0035
            r3.bottomMargin = r4
            r5 = 1
        L_0x0035:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.m740a(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    /* renamed from: a */
    private DecorToolbar m737a(View view) {
        if (view instanceof DecorToolbar) {
            return (DecorToolbar) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view.getClass().getSimpleName());
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1138a() {
        removeCallbacks(this.f769C);
        removeCallbacks(this.f770D);
        ViewPropertyAnimator viewPropertyAnimator = this.f767A;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* renamed from: a */
    private boolean m739a(float f, float f2) {
        this.f793z.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.f793z.getFinalY() > this.f775h.getHeight();
    }
}
