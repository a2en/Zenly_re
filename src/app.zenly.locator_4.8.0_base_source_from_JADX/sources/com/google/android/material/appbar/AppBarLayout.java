package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0487b;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0489d;
import androidx.core.util.C0602d;
import androidx.core.view.C0666p;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.C10793g;
import java.lang.ref.WeakReference;
import java.util.List;
import p214e.p234h.p238g.C7631a;
import p333g.p357d.p358a.p361b.C12067b;
import p333g.p357d.p358a.p361b.C12075j;
import p333g.p357d.p358a.p361b.C12076k;
import p333g.p357d.p358a.p361b.p362l.C12077a;

@C0487b(Behavior.class)
public class AppBarLayout extends LinearLayout {

    /* renamed from: e */
    private int f27838e;

    /* renamed from: f */
    private int f27839f;

    /* renamed from: g */
    private int f27840g;

    /* renamed from: h */
    private boolean f27841h;

    /* renamed from: i */
    private int f27842i;

    /* renamed from: j */
    private C0666p f27843j;

    /* renamed from: k */
    private List<BaseOnOffsetChangedListener> f27844k;

    /* renamed from: l */
    private boolean f27845l;

    /* renamed from: m */
    private boolean f27846m;

    /* renamed from: n */
    private boolean f27847n;

    /* renamed from: o */
    private boolean f27848o;

    /* renamed from: p */
    private int[] f27849p;

    protected static class BaseBehavior<T extends AppBarLayout> extends HeaderBehavior<T> {
        /* access modifiers changed from: private */

        /* renamed from: h */
        public int f27850h;

        /* renamed from: i */
        private int f27851i;

        /* renamed from: j */
        private ValueAnimator f27852j;

        /* renamed from: k */
        private int f27853k = -1;

        /* renamed from: l */
        private boolean f27854l;

        /* renamed from: m */
        private float f27855m;

        /* renamed from: n */
        private WeakReference<View> f27856n;

        /* renamed from: o */
        private C10726b f27857o;

        protected static class SavedState extends AbsSavedState {
            public static final Creator<SavedState> CREATOR = new C10724a();

            /* renamed from: g */
            int f27858g;

            /* renamed from: h */
            float f27859h;

            /* renamed from: i */
            boolean f27860i;

            /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$SavedState$a */
            static class C10724a implements ClassLoaderCreator<SavedState> {
                C10724a() {
                }

                public SavedState[] newArray(int i) {
                    return new SavedState[i];
                }

                public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new SavedState(parcel, classLoader);
                }

                public SavedState createFromParcel(Parcel parcel) {
                    return new SavedState(parcel, null);
                }
            }

            public SavedState(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f27858g = parcel.readInt();
                this.f27859h = parcel.readFloat();
                this.f27860i = parcel.readByte() != 0;
            }

            public void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeInt(this.f27858g);
                parcel.writeFloat(this.f27859h);
                parcel.writeByte(this.f27860i ? (byte) 1 : 0);
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }
        }

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$a */
        class C10725a implements AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ CoordinatorLayout f27861a;

            /* renamed from: b */
            final /* synthetic */ AppBarLayout f27862b;

            C10725a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.f27861a = coordinatorLayout;
                this.f27862b = appBarLayout;
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseBehavior.this.mo30612a(this.f27861a, this.f27862b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$b */
        public static abstract class C10726b<T extends AppBarLayout> {
            /* renamed from: a */
            public abstract boolean mo30604a(T t);
        }

        public BaseBehavior() {
        }

        /* renamed from: a */
        private static boolean m27305a(int i, int i2) {
            return (i & i2) == i2;
        }

        /* renamed from: d */
        private void m27310d(CoordinatorLayout coordinatorLayout, T t) {
            int a = mo30581a();
            int b = m27307b(t, a);
            if (b >= 0) {
                View childAt = t.getChildAt(b);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int a2 = layoutParams.mo30606a();
                if ((a2 & 17) == 17) {
                    int i = -childAt.getTop();
                    int i2 = -childAt.getBottom();
                    if (b == t.getChildCount() - 1) {
                        i2 += t.getTopInset();
                    }
                    if (m27305a(a2, 2)) {
                        i2 += ViewCompat.m2863p(childAt);
                    } else if (m27305a(a2, 5)) {
                        int p = ViewCompat.m2863p(childAt) + i2;
                        if (a < p) {
                            i = p;
                        } else {
                            i2 = p;
                        }
                    }
                    if (m27305a(a2, 32)) {
                        i += layoutParams.topMargin;
                        i2 -= layoutParams.bottomMargin;
                    }
                    if (a < (i2 + i) / 2) {
                        i = i2;
                    }
                    m27302a(coordinatorLayout, t, C7631a.m18585a(i, -t.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public int mo30598c(T t) {
            return t.getTotalScrollRange();
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: b */
        private int m27307b(T t, int i) {
            int childCount = t.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = t.getChildAt(i2);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (m27305a(layoutParams.mo30606a(), 32)) {
                    top -= layoutParams.topMargin;
                    bottom += layoutParams.bottomMargin;
                }
                int i3 = -i;
                if (top <= i3 && bottom >= i3) {
                    return i2;
                }
            }
            return -1;
        }

        /* renamed from: c */
        private int m27308c(T t, int i) {
            int abs = Math.abs(i);
            int childCount = t.getChildCount();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                }
                View childAt = t.getChildAt(i3);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                Interpolator b = layoutParams.mo30607b();
                if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                    i3++;
                } else if (b != null) {
                    int a = layoutParams.mo30606a();
                    if ((a & 1) != 0) {
                        i2 = 0 + childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
                        if ((a & 2) != 0) {
                            i2 -= ViewCompat.m2863p(childAt);
                        }
                    }
                    if (ViewCompat.m2859l(childAt)) {
                        i2 -= t.getTopInset();
                    }
                    if (i2 > 0) {
                        float f = (float) i2;
                        return Integer.signum(i) * (childAt.getTop() + Math.round(f * b.getInterpolation(((float) (abs - childAt.getTop())) / f)));
                    }
                }
            }
            return i;
        }

        /* renamed from: a */
        public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, T t, View view, View view2, int i, int i2) {
            boolean z = (i & 2) != 0 && (t.mo30560c() || m27306a(coordinatorLayout, t, view));
            if (z) {
                ValueAnimator valueAnimator = this.f27852j;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
            }
            this.f27856n = null;
            this.f27851i = i2;
            return z;
        }

        /* renamed from: a */
        private boolean m27306a(CoordinatorLayout coordinatorLayout, T t, View view) {
            return t.mo30559b() && coordinatorLayout.getHeight() - view.getHeight() <= t.getHeight();
        }

        /* renamed from: a */
        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int[] iArr, int i3) {
            int i4;
            int i5;
            if (i2 != 0) {
                if (i2 < 0) {
                    int i6 = -t.getTotalScrollRange();
                    i5 = i6;
                    i4 = t.getDownNestedPreScrollRange() + i6;
                } else {
                    i5 = -t.getUpNestedPreScrollRange();
                    i4 = 0;
                }
                if (i5 != i4) {
                    iArr[1] = mo30613a(coordinatorLayout, t, i2, i5, i4);
                    m27301a(i2, t, view, i3);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public int mo30594b(T t) {
            return -t.getDownNestedScrollRange();
        }

        /* renamed from: b */
        public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, T t) {
            Parcelable onSaveInstanceState = super.onSaveInstanceState(coordinatorLayout, t);
            int topAndBottomOffset = getTopAndBottomOffset();
            int childCount = t.getChildCount();
            boolean z = false;
            int i = 0;
            while (i < childCount) {
                View childAt = t.getChildAt(i);
                int bottom = childAt.getBottom() + topAndBottomOffset;
                if (childAt.getTop() + topAndBottomOffset > 0 || bottom < 0) {
                    i++;
                } else {
                    SavedState savedState = new SavedState(onSaveInstanceState);
                    savedState.f27858g = i;
                    if (bottom == ViewCompat.m2863p(childAt) + t.getTopInset()) {
                        z = true;
                    }
                    savedState.f27860i = z;
                    savedState.f27859h = ((float) bottom) / ((float) childAt.getHeight());
                    return savedState;
                }
            }
            return onSaveInstanceState;
        }

        /* renamed from: a */
        public void onNestedScroll(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int i3, int i4, int i5) {
            if (i4 < 0) {
                mo30613a(coordinatorLayout, t, i4, -t.getDownNestedScrollRange(), 0);
                m27301a(i4, t, view, i5);
            }
            if (t.mo30560c()) {
                t.mo30558a(view.getScrollY() > 0);
            }
        }

        /* renamed from: c */
        private boolean m27309c(CoordinatorLayout coordinatorLayout, T t) {
            List c = coordinatorLayout.mo2820c((View) t);
            int size = c.size();
            boolean z = false;
            for (int i = 0; i < size; i++) {
                androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior d = ((C0489d) ((View) c.get(i)).getLayoutParams()).mo2901d();
                if (d instanceof ScrollingViewBehavior) {
                    if (((ScrollingViewBehavior) d).getOverlayTop() != 0) {
                        z = true;
                    }
                    return z;
                }
            }
            return false;
        }

        /* renamed from: a */
        private void m27301a(int i, T t, View view, int i2) {
            if (i2 == 1) {
                int a = mo30581a();
                if ((i < 0 && a == 0) || (i > 0 && a == (-t.getDownNestedScrollRange()))) {
                    ViewCompat.m2856i(view, 1);
                }
            }
        }

        /* renamed from: a */
        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, T t, View view, int i) {
            if (this.f27851i == 0 || i == 1) {
                m27310d(coordinatorLayout, t);
            }
            this.f27856n = new WeakReference<>(view);
        }

        /* renamed from: a */
        private void m27302a(CoordinatorLayout coordinatorLayout, T t, int i, float f) {
            int i2;
            int abs = Math.abs(mo30581a() - i);
            float abs2 = Math.abs(f);
            if (abs2 > 0.0f) {
                i2 = Math.round((((float) abs) / abs2) * 1000.0f) * 3;
            } else {
                i2 = (int) (((((float) abs) / ((float) t.getHeight())) + 1.0f) * 150.0f);
            }
            m27303a(coordinatorLayout, t, i, i2);
        }

        /* renamed from: a */
        private void m27303a(CoordinatorLayout coordinatorLayout, T t, int i, int i2) {
            int a = mo30581a();
            if (a == i) {
                ValueAnimator valueAnimator = this.f27852j;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f27852j.cancel();
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.f27852j;
            if (valueAnimator2 == null) {
                this.f27852j = new ValueAnimator();
                this.f27852j.setInterpolator(C12077a.f31464e);
                this.f27852j.addUpdateListener(new C10725a(coordinatorLayout, t));
            } else {
                valueAnimator2.cancel();
            }
            this.f27852j.setDuration((long) Math.min(i2, 600));
            this.f27852j.setIntValues(new int[]{a, i});
            this.f27852j.start();
        }

        /* renamed from: a */
        public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3, int i4) {
            if (((C0489d) t.getLayoutParams()).height != -2) {
                return super.onMeasureChild(coordinatorLayout, t, i, i2, i3, i4);
            }
            coordinatorLayout.mo2811a(t, i, i2, MeasureSpec.makeMeasureSpec(0, 0), i4);
            return true;
        }

        /* renamed from: a */
        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, T t, int i) {
            int i2;
            boolean onLayoutChild = super.onLayoutChild(coordinatorLayout, t, i);
            int pendingAction = t.getPendingAction();
            int i3 = this.f27853k;
            if (i3 >= 0 && (pendingAction & 8) == 0) {
                View childAt = t.getChildAt(i3);
                int i4 = -childAt.getBottom();
                if (this.f27854l) {
                    i2 = ViewCompat.m2863p(childAt) + t.getTopInset();
                } else {
                    i2 = Math.round(((float) childAt.getHeight()) * this.f27855m);
                }
                mo30612a(coordinatorLayout, t, i4 + i2);
            } else if (pendingAction != 0) {
                boolean z = (pendingAction & 4) != 0;
                if ((pendingAction & 2) != 0) {
                    int i5 = -t.getUpNestedPreScrollRange();
                    if (z) {
                        m27302a(coordinatorLayout, t, i5, 0.0f);
                    } else {
                        mo30612a(coordinatorLayout, t, i5);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z) {
                        m27302a(coordinatorLayout, t, 0, 0.0f);
                    } else {
                        mo30612a(coordinatorLayout, t, 0);
                    }
                }
            }
            t.mo30562d();
            this.f27853k = -1;
            setTopAndBottomOffset(C7631a.m18585a(getTopAndBottomOffset(), -t.getTotalScrollRange(), 0));
            m27304a(coordinatorLayout, t, getTopAndBottomOffset(), 0, true);
            t.mo30555a(getTopAndBottomOffset());
            return onLayoutChild;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo30589a(T t) {
            C10726b bVar = this.f27857o;
            if (bVar != null) {
                return bVar.mo30604a(t);
            }
            WeakReference<View> weakReference = this.f27856n;
            boolean z = true;
            if (weakReference != null) {
                View view = (View) weakReference.get();
                if (view == null || !view.isShown() || view.canScrollVertically(-1)) {
                    z = false;
                }
            }
            return z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30583a(CoordinatorLayout coordinatorLayout, T t) {
            m27310d(coordinatorLayout, t);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo30595b(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3) {
            int a = mo30581a();
            int i4 = 0;
            if (i2 == 0 || a < i2 || a > i3) {
                this.f27850h = 0;
            } else {
                int a2 = C7631a.m18585a(i, i2, i3);
                if (a != a2) {
                    int c = t.mo30557a() ? m27308c(t, a2) : a2;
                    boolean topAndBottomOffset = setTopAndBottomOffset(c);
                    i4 = a - a2;
                    this.f27850h = a2 - c;
                    if (!topAndBottomOffset && t.mo30557a()) {
                        coordinatorLayout.mo2809a((View) t);
                    }
                    t.mo30555a(getTopAndBottomOffset());
                    m27304a(coordinatorLayout, t, a2, a2 < a ? -1 : 1, false);
                }
            }
            return i4;
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0048  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0061  */
        /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m27304a(androidx.coordinatorlayout.widget.CoordinatorLayout r6, T r7, int r8, int r9, boolean r10) {
            /*
                r5 = this;
                android.view.View r0 = m27300a(r7, r8)
                if (r0 == 0) goto L_0x006e
                android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$LayoutParams r1 = (com.google.android.material.appbar.AppBarLayout.LayoutParams) r1
                int r1 = r1.mo30606a()
                r2 = r1 & 1
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L_0x0041
                int r2 = androidx.core.view.ViewCompat.m2863p(r0)
                if (r9 <= 0) goto L_0x002f
                r9 = r1 & 12
                if (r9 == 0) goto L_0x002f
                int r8 = -r8
                int r9 = r0.getBottom()
                int r9 = r9 - r2
                int r0 = r7.getTopInset()
                int r9 = r9 - r0
                if (r8 < r9) goto L_0x0041
            L_0x002d:
                r8 = 1
                goto L_0x0042
            L_0x002f:
                r9 = r1 & 2
                if (r9 == 0) goto L_0x0041
                int r8 = -r8
                int r9 = r0.getBottom()
                int r9 = r9 - r2
                int r0 = r7.getTopInset()
                int r9 = r9 - r0
                if (r8 < r9) goto L_0x0041
                goto L_0x002d
            L_0x0041:
                r8 = 0
            L_0x0042:
                boolean r9 = r7.mo30560c()
                if (r9 == 0) goto L_0x0057
                android.view.View r9 = r5.m27299a(r6)
                if (r9 == 0) goto L_0x0057
                int r8 = r9.getScrollY()
                if (r8 <= 0) goto L_0x0056
                r8 = 1
                goto L_0x0057
            L_0x0056:
                r8 = 0
            L_0x0057:
                boolean r8 = r7.mo30558a(r8)
                int r9 = android.os.Build.VERSION.SDK_INT
                r0 = 11
                if (r9 < r0) goto L_0x006e
                if (r10 != 0) goto L_0x006b
                if (r8 == 0) goto L_0x006e
                boolean r6 = r5.m27309c(r6, (T) r7)
                if (r6 == 0) goto L_0x006e
            L_0x006b:
                r7.jumpDrawablesToCurrentState()
            L_0x006e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.m27304a(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, boolean):void");
        }

        /* renamed from: a */
        private static View m27300a(AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: a */
        private View m27299a(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt instanceof NestedScrollingChild) {
                    return childAt;
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo30581a() {
            return getTopAndBottomOffset() + this.f27850h;
        }

        /* renamed from: a */
        public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, T t, Parcelable parcelable) {
            if (parcelable instanceof SavedState) {
                SavedState savedState = (SavedState) parcelable;
                super.onRestoreInstanceState(coordinatorLayout, t, savedState.mo3548a());
                this.f27853k = savedState.f27858g;
                this.f27855m = savedState.f27859h;
                this.f27854l = savedState.f27860i;
                return;
            }
            super.onRestoreInstanceState(coordinatorLayout, t, parcelable);
            this.f27853k = -1;
        }
    }

    public interface BaseOnOffsetChangedListener<T extends AppBarLayout> {
        void onOffsetChanged(T t, int i);
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class LayoutParams extends android.widget.LinearLayout.LayoutParams {

        /* renamed from: a */
        int f27864a = 1;

        /* renamed from: b */
        Interpolator f27865b;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C12076k.AppBarLayout_Layout);
            this.f27864a = obtainStyledAttributes.getInt(C12076k.AppBarLayout_Layout_layout_scrollFlags, 0);
            if (obtainStyledAttributes.hasValue(C12076k.AppBarLayout_Layout_layout_scrollInterpolator)) {
                this.f27865b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(C12076k.AppBarLayout_Layout_layout_scrollInterpolator, 0));
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public int mo30606a() {
            return this.f27864a;
        }

        /* renamed from: b */
        public Interpolator mo30607b() {
            return this.f27865b;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public boolean mo30608c() {
            int i = this.f27864a;
            return (i & 1) == 1 && (i & 10) != 0;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(android.widget.LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public interface OnOffsetChangedListener extends BaseOnOffsetChangedListener<AppBarLayout> {
        void onOffsetChanged(AppBarLayout appBarLayout, int i);
    }

    public static class ScrollingViewBehavior extends HeaderScrollingViewBehavior {
        public ScrollingViewBehavior() {
        }

        private static int getAppBarLayoutOffset(AppBarLayout appBarLayout) {
            androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior d = ((C0489d) appBarLayout.getLayoutParams()).mo2901d();
            if (d instanceof BaseBehavior) {
                return ((BaseBehavior) d).mo30581a();
            }
            return 0;
        }

        private void offsetChildAsNeeded(View view, View view2) {
            androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior d = ((C0489d) view2.getLayoutParams()).mo2901d();
            if (d instanceof BaseBehavior) {
                ViewCompat.m2848e(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) d).f27850h) + getVerticalLayoutGap()) - getOverlapPixelsForOffset(view2));
            }
        }

        private void updateLiftedStateIfNeeded(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.mo30560c()) {
                    appBarLayout.mo30558a(view.getScrollY() > 0);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public float getOverlapRatioForOffset(View view) {
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int appBarLayoutOffset = getAppBarLayoutOffset(appBarLayout);
                if (downNestedPreScrollRange != 0 && totalScrollRange + appBarLayoutOffset <= downNestedPreScrollRange) {
                    return 0.0f;
                }
                int i = totalScrollRange - downNestedPreScrollRange;
                if (i != 0) {
                    return (((float) appBarLayoutOffset) / ((float) i)) + 1.0f;
                }
            }
            return 0.0f;
        }

        /* access modifiers changed from: 0000 */
        public int getScrollRange(View view) {
            if (view instanceof AppBarLayout) {
                return ((AppBarLayout) view).getTotalScrollRange();
            }
            return super.getScrollRange(view);
        }

        public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
            offsetChildAsNeeded(view, view2);
            updateLiftedStateIfNeeded(view, view2);
            return false;
        }

        public boolean onRequestChildRectangleOnScreen(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout findFirstDependency = findFirstDependency(coordinatorLayout.mo2816b(view));
            if (findFirstDependency != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.tempRect1;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    findFirstDependency.mo30556a(false, !z);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C12076k.ScrollingViewBehavior_Layout);
            setOverlayTop(obtainStyledAttributes.getDimensionPixelSize(C12076k.ScrollingViewBehavior_Layout_behavior_overlapTop, 0));
            obtainStyledAttributes.recycle();
        }

        /* access modifiers changed from: 0000 */
        public AppBarLayout findFirstDependency(List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = (View) list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$a */
    class C10727a implements OnApplyWindowInsetsListener {
        C10727a() {
        }

        public C0666p onApplyWindowInsets(View view, C0666p pVar) {
            return AppBarLayout.this.mo30554a(pVar);
        }
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }

    /* renamed from: e */
    private boolean m27288e() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((LayoutParams) getChildAt(i).getLayoutParams()).mo30608c()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    private void m27289f() {
        this.f27838e = -1;
        this.f27839f = -1;
        this.f27840g = -1;
    }

    /* renamed from: a */
    public void mo30556a(boolean z, boolean z2) {
        m27286a(z, z2, true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo30559b() {
        return getTotalScrollRange() != 0;
    }

    /* renamed from: c */
    public boolean mo30560c() {
        return this.f27848o;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo30562d() {
        this.f27842i = 0;
    }

    /* access modifiers changed from: 0000 */
    public int getDownNestedPreScrollRange() {
        int i;
        int i2 = this.f27839f;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = layoutParams.f27864a;
            if ((i4 & 5) == 5) {
                int i5 = i3 + layoutParams.topMargin + layoutParams.bottomMargin;
                if ((i4 & 8) != 0) {
                    i3 = i5 + ViewCompat.m2863p(childAt);
                } else {
                    if ((i4 & 2) != 0) {
                        i = ViewCompat.m2863p(childAt);
                    } else {
                        i = getTopInset();
                    }
                    i3 = i5 + (measuredHeight - i);
                }
            } else if (i3 > 0) {
                break;
            }
        }
        int max = Math.max(0, i3);
        this.f27839f = max;
        return max;
    }

    /* access modifiers changed from: 0000 */
    public int getDownNestedScrollRange() {
        int i = this.f27840g;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int i4 = layoutParams.f27864a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight;
            if ((i4 & 2) != 0) {
                i3 -= ViewCompat.m2863p(childAt) + getTopInset();
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.f27840g = max;
        return max;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int p = ViewCompat.m2863p(this);
        if (p == 0) {
            int childCount = getChildCount();
            p = childCount >= 1 ? ViewCompat.m2863p(getChildAt(childCount - 1)) : 0;
            if (p == 0) {
                return getHeight() / 3;
            }
        }
        return (p * 2) + topInset;
    }

    /* access modifiers changed from: 0000 */
    public int getPendingAction() {
        return this.f27842i;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    /* access modifiers changed from: 0000 */
    public final int getTopInset() {
        C0666p pVar = this.f27843j;
        if (pVar != null) {
            return pVar.mo3446d();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.f27838e;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = layoutParams.f27864a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight + layoutParams.topMargin + layoutParams.bottomMargin;
            if ((i4 & 2) != 0) {
                i3 -= ViewCompat.m2863p(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3 - getTopInset());
        this.f27838e = max;
        return max;
    }

    /* access modifiers changed from: 0000 */
    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        if (this.f27849p == null) {
            this.f27849p = new int[4];
        }
        int[] iArr = this.f27849p;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        iArr[0] = this.f27846m ? C12067b.state_liftable : -C12067b.state_liftable;
        iArr[1] = (!this.f27846m || !this.f27847n) ? -C12067b.state_lifted : C12067b.state_lifted;
        iArr[2] = this.f27846m ? C12067b.state_collapsible : -C12067b.state_collapsible;
        iArr[3] = (!this.f27846m || !this.f27847n) ? -C12067b.state_collapsed : C12067b.state_collapsed;
        return LinearLayout.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m27289f();
        boolean z2 = false;
        this.f27841h = false;
        int childCount = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount) {
                break;
            } else if (((LayoutParams) getChildAt(i5).getLayoutParams()).mo30607b() != null) {
                this.f27841h = true;
                break;
            } else {
                i5++;
            }
        }
        if (!this.f27845l) {
            if (this.f27848o || m27288e()) {
                z2 = true;
            }
            m27287b(z2);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m27289f();
    }

    public void setExpanded(boolean z) {
        mo30556a(z, ViewCompat.m2804D(this));
    }

    public void setLiftOnScroll(boolean z) {
        this.f27848o = z;
    }

    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    @Deprecated
    public void setTargetElevation(float f) {
        if (VERSION.SDK_INT >= 21) {
            C10730b.m27350a(this, f);
        }
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f27838e = -1;
        this.f27839f = -1;
        this.f27840g = -1;
        this.f27842i = 0;
        setOrientation(1);
        if (VERSION.SDK_INT >= 21) {
            C10730b.m27349a(this);
            C10730b.m27351a(this, attributeSet, 0, C12075j.Widget_Design_AppBarLayout);
        }
        TypedArray c = C10793g.m27778c(context, attributeSet, C12076k.AppBarLayout, 0, C12075j.Widget_Design_AppBarLayout, new int[0]);
        ViewCompat.m2822a((View) this, c.getDrawable(C12076k.AppBarLayout_android_background));
        if (c.hasValue(C12076k.AppBarLayout_expanded)) {
            m27286a(c.getBoolean(C12076k.AppBarLayout_expanded, false), false, false);
        }
        if (VERSION.SDK_INT >= 21 && c.hasValue(C12076k.AppBarLayout_elevation)) {
            C10730b.m27350a(this, (float) c.getDimensionPixelSize(C12076k.AppBarLayout_elevation, 0));
        }
        if (VERSION.SDK_INT >= 26) {
            if (c.hasValue(C12076k.AppBarLayout_android_keyboardNavigationCluster)) {
                setKeyboardNavigationCluster(c.getBoolean(C12076k.AppBarLayout_android_keyboardNavigationCluster, false));
            }
            if (c.hasValue(C12076k.AppBarLayout_android_touchscreenBlocksFocus)) {
                setTouchscreenBlocksFocus(c.getBoolean(C12076k.AppBarLayout_android_touchscreenBlocksFocus, false));
            }
        }
        this.f27848o = c.getBoolean(C12076k.AppBarLayout_liftOnScroll, false);
        c.recycle();
        ViewCompat.m2823a((View) this, (OnApplyWindowInsetsListener) new C10727a());
    }

    /* renamed from: a */
    private void m27286a(boolean z, boolean z2, boolean z3) {
        int i = 0;
        int i2 = (z ? 1 : 2) | (z2 ? 4 : 0);
        if (z3) {
            i = 8;
        }
        this.f27842i = i2 | i;
        requestLayout();
    }

    /* renamed from: b */
    private boolean m27287b(boolean z) {
        if (this.f27846m == z) {
            return false;
        }
        this.f27846m = z;
        refreshDrawableState();
        return true;
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo30557a() {
        return this.f27841h;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo30555a(int i) {
        List<BaseOnOffsetChangedListener> list = this.f27844k;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                BaseOnOffsetChangedListener baseOnOffsetChangedListener = (BaseOnOffsetChangedListener) this.f27844k.get(i2);
                if (baseOnOffsetChangedListener != null) {
                    baseOnOffsetChangedListener.onOffsetChanged(this, i);
                }
            }
        }
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (VERSION.SDK_INT >= 19 && (layoutParams instanceof android.widget.LinearLayout.LayoutParams)) {
            return new LayoutParams((android.widget.LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof MarginLayoutParams) {
            return new LayoutParams((MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo30558a(boolean z) {
        if (this.f27847n == z) {
            return false;
        }
        this.f27847n = z;
        refreshDrawableState();
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0666p mo30554a(C0666p pVar) {
        C0666p pVar2 = ViewCompat.m2859l(this) ? pVar : null;
        if (!C0602d.m2768a(this.f27843j, pVar2)) {
            this.f27843j = pVar2;
            m27289f();
        }
        return pVar;
    }
}
