package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region.Op;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup.OnHierarchyChangeListener;
import android.view.ViewParent;
import android.view.ViewTreeObserver.OnPreDrawListener;
import androidx.core.content.C0540a;
import androidx.core.graphics.drawable.C0559a;
import androidx.core.util.C0602d;
import androidx.core.util.C0606h;
import androidx.core.util.Pools$Pool;
import androidx.core.view.C0641c;
import androidx.core.view.C0646h;
import androidx.core.view.C0666p;
import androidx.core.view.NestedScrollingParent2;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p214e.p233g.C7607a;
import p214e.p233g.C7608b;
import p214e.p233g.C7609c;

public class CoordinatorLayout extends ViewGroup implements NestedScrollingParent2 {

    /* renamed from: A */
    static final Comparator<View> f2334A;

    /* renamed from: B */
    private static final Pools$Pool<Rect> f2335B = new C0606h(12);

    /* renamed from: x */
    static final String f2336x;

    /* renamed from: y */
    static final Class<?>[] f2337y = {Context.class, AttributeSet.class};

    /* renamed from: z */
    static final ThreadLocal<Map<String, Constructor<Behavior>>> f2338z = new ThreadLocal<>();

    /* renamed from: e */
    private final List<View> f2339e;

    /* renamed from: f */
    private final C0492a<View> f2340f;

    /* renamed from: g */
    private final List<View> f2341g;

    /* renamed from: h */
    private final List<View> f2342h;

    /* renamed from: i */
    private final int[] f2343i;

    /* renamed from: j */
    private Paint f2344j;

    /* renamed from: k */
    private boolean f2345k;

    /* renamed from: l */
    private boolean f2346l;

    /* renamed from: m */
    private int[] f2347m;

    /* renamed from: n */
    private View f2348n;

    /* renamed from: o */
    private View f2349o;

    /* renamed from: p */
    private C0490e f2350p;

    /* renamed from: q */
    private boolean f2351q;

    /* renamed from: r */
    private C0666p f2352r;

    /* renamed from: s */
    private boolean f2353s;

    /* renamed from: t */
    private Drawable f2354t;

    /* renamed from: u */
    OnHierarchyChangeListener f2355u;

    /* renamed from: v */
    private OnApplyWindowInsetsListener f2356v;

    /* renamed from: w */
    private final C0646h f2357w;

    public interface AttachedBehavior {
        Behavior getBehavior();
    }

    public static abstract class Behavior<V extends View> {
        public Behavior() {
        }

        public boolean blocksInteractionBelow(CoordinatorLayout coordinatorLayout, V v) {
            return getScrimOpacity(coordinatorLayout, v) > 0.0f;
        }

        public boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, V v, Rect rect) {
            return false;
        }

        public int getScrimColor(CoordinatorLayout coordinatorLayout, V v) {
            return -16777216;
        }

        public float getScrimOpacity(CoordinatorLayout coordinatorLayout, V v) {
            return 0.0f;
        }

        public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        public C0666p onApplyWindowInsets(CoordinatorLayout coordinatorLayout, V v, C0666p pVar) {
            return pVar;
        }

        public void onAttachedToLayoutParams(C0489d dVar) {
        }

        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        public void onDependentViewRemoved(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        public void onDetachedFromLayoutParams() {
        }

        public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
            return false;
        }

        public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
            return false;
        }

        public boolean onNestedFling(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2, boolean z) {
            return false;
        }

        public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
            return false;
        }

        @Deprecated
        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        }

        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
            if (i3 == 0) {
                onNestedPreScroll(coordinatorLayout, v, view, i, i2, iArr);
            }
        }

        @Deprecated
        public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        }

        public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5) {
            if (i5 == 0) {
                onNestedScroll(coordinatorLayout, v, view, i, i2, i3, i4);
            }
        }

        @Deprecated
        public void onNestedScrollAccepted(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        }

        public void onNestedScrollAccepted(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                onNestedScrollAccepted(coordinatorLayout, v, view, view2, i);
            }
        }

        public boolean onRequestChildRectangleOnScreen(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, V v) {
            return BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
            return false;
        }

        public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                return onStartNestedScroll(coordinatorLayout, v, view, view2, i);
            }
            return false;
        }

        @Deprecated
        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
            if (i == 0) {
                onStopNestedScroll(coordinatorLayout, v, view);
            }
        }

        public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
        }
    }

    protected static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new C0485a();

        /* renamed from: g */
        SparseArray<Parcelable> f2358g;

        /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$SavedState$a */
        static class C0485a implements ClassLoaderCreator<SavedState> {
            C0485a() {
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
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f2358g = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                this.f2358g.append(iArr[i], readParcelableArray[i]);
            }
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            SparseArray<Parcelable> sparseArray = this.f2358g;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.f2358g.keyAt(i2);
                parcelableArr[i2] = (Parcelable) this.f2358g.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$a */
    class C0486a implements OnApplyWindowInsetsListener {
        C0486a() {
        }

        public C0666p onApplyWindowInsets(View view, C0666p pVar) {
            return CoordinatorLayout.this.mo2806a(pVar);
        }
    }

    @Deprecated
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$b */
    public @interface C0487b {
        Class<? extends Behavior> value();
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$c */
    private class C0488c implements OnHierarchyChangeListener {
        C0488c() {
        }

        public void onChildViewAdded(View view, View view2) {
            OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f2355u;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.mo2808a(2);
            OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f2355u;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$d */
    public static class C0489d extends MarginLayoutParams {

        /* renamed from: a */
        Behavior f2361a;

        /* renamed from: b */
        boolean f2362b = false;

        /* renamed from: c */
        public int f2363c = 0;

        /* renamed from: d */
        public int f2364d = 0;

        /* renamed from: e */
        public int f2365e = -1;

        /* renamed from: f */
        int f2366f = -1;

        /* renamed from: g */
        public int f2367g = 0;

        /* renamed from: h */
        public int f2368h = 0;

        /* renamed from: i */
        int f2369i;

        /* renamed from: j */
        int f2370j;

        /* renamed from: k */
        View f2371k;

        /* renamed from: l */
        View f2372l;

        /* renamed from: m */
        private boolean f2373m;

        /* renamed from: n */
        private boolean f2374n;

        /* renamed from: o */
        private boolean f2375o;

        /* renamed from: p */
        private boolean f2376p;

        /* renamed from: q */
        final Rect f2377q = new Rect();

        public C0489d(int i, int i2) {
            super(i, i2);
        }

        /* renamed from: a */
        public void mo2892a(Behavior behavior) {
            Behavior behavior2 = this.f2361a;
            if (behavior2 != behavior) {
                if (behavior2 != null) {
                    behavior2.onDetachedFromLayoutParams();
                }
                this.f2361a = behavior;
                this.f2362b = true;
                if (behavior != null) {
                    behavior.onAttachedToLayoutParams(this);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public boolean mo2898b() {
            if (this.f2361a == null) {
                this.f2373m = false;
            }
            return this.f2373m;
        }

        /* renamed from: c */
        public int mo2900c() {
            return this.f2366f;
        }

        /* renamed from: d */
        public Behavior mo2901d() {
            return this.f2361a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public boolean mo2902e() {
            return this.f2376p;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public Rect mo2903f() {
            return this.f2377q;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public void mo2904g() {
            this.f2376p = false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public void mo2905h() {
            this.f2373m = false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public boolean mo2899b(CoordinatorLayout coordinatorLayout, View view) {
            boolean z = this.f2373m;
            if (z) {
                return true;
            }
            Behavior behavior = this.f2361a;
            boolean blocksInteractionBelow = (behavior != null ? behavior.blocksInteractionBelow(coordinatorLayout, view) : false) | z;
            this.f2373m = blocksInteractionBelow;
            return blocksInteractionBelow;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2891a(Rect rect) {
            this.f2377q.set(rect);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo2894a() {
            return this.f2371k == null && this.f2366f != -1;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo2897b(int i) {
            mo2890a(i, false);
        }

        /* renamed from: b */
        private boolean m2312b(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f2371k.getId() != this.f2366f) {
                return false;
            }
            View view2 = this.f2371k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f2372l = null;
                    this.f2371k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = (View) parent;
                }
            }
            this.f2372l = view2;
            return true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2890a(int i, boolean z) {
            if (i == 0) {
                this.f2374n = z;
            } else if (i == 1) {
                this.f2375o = z;
            }
        }

        C0489d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7609c.CoordinatorLayout_Layout);
            this.f2363c = obtainStyledAttributes.getInteger(C7609c.CoordinatorLayout_Layout_android_layout_gravity, 0);
            this.f2366f = obtainStyledAttributes.getResourceId(C7609c.CoordinatorLayout_Layout_layout_anchor, -1);
            this.f2364d = obtainStyledAttributes.getInteger(C7609c.CoordinatorLayout_Layout_layout_anchorGravity, 0);
            this.f2365e = obtainStyledAttributes.getInteger(C7609c.CoordinatorLayout_Layout_layout_keyline, -1);
            this.f2367g = obtainStyledAttributes.getInt(C7609c.CoordinatorLayout_Layout_layout_insetEdge, 0);
            this.f2368h = obtainStyledAttributes.getInt(C7609c.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
            this.f2362b = obtainStyledAttributes.hasValue(C7609c.CoordinatorLayout_Layout_layout_behavior);
            if (this.f2362b) {
                this.f2361a = CoordinatorLayout.m2270a(context, attributeSet, obtainStyledAttributes.getString(C7609c.CoordinatorLayout_Layout_layout_behavior));
            }
            obtainStyledAttributes.recycle();
            Behavior behavior = this.f2361a;
            if (behavior != null) {
                behavior.onAttachedToLayoutParams(this);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo2895a(int i) {
            if (i == 0) {
                return this.f2374n;
            }
            if (i != 1) {
                return false;
            }
            return this.f2375o;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2893a(boolean z) {
            this.f2376p = z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo2896a(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 != this.f2372l && !m2311a(view2, ViewCompat.m2862o(coordinatorLayout))) {
                Behavior behavior = this.f2361a;
                if (behavior == null || !behavior.layoutDependsOn(coordinatorLayout, view, view2)) {
                    return false;
                }
            }
            return true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public View mo2889a(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f2366f == -1) {
                this.f2372l = null;
                this.f2371k = null;
                return null;
            }
            if (this.f2371k == null || !m2312b(view, coordinatorLayout)) {
                m2310a(view, coordinatorLayout);
            }
            return this.f2371k;
        }

        /* renamed from: a */
        private void m2310a(View view, CoordinatorLayout coordinatorLayout) {
            this.f2371k = coordinatorLayout.findViewById(this.f2366f);
            View view2 = this.f2371k;
            if (view2 != null) {
                if (view2 != coordinatorLayout) {
                    ViewParent parent = view2.getParent();
                    while (parent != coordinatorLayout && parent != null) {
                        if (parent != view) {
                            if (parent instanceof View) {
                                view2 = (View) parent;
                            }
                            parent = parent.getParent();
                        } else if (coordinatorLayout.isInEditMode()) {
                            this.f2372l = null;
                            this.f2371k = null;
                            return;
                        } else {
                            throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                        }
                    }
                    this.f2372l = view2;
                } else if (coordinatorLayout.isInEditMode()) {
                    this.f2372l = null;
                    this.f2371k = null;
                } else {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
            } else if (coordinatorLayout.isInEditMode()) {
                this.f2372l = null;
                this.f2371k = null;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Could not find CoordinatorLayout descendant view with id ");
                sb.append(coordinatorLayout.getResources().getResourceName(this.f2366f));
                sb.append(" to anchor view ");
                sb.append(view);
                throw new IllegalStateException(sb.toString());
            }
        }

        public C0489d(C0489d dVar) {
            super(dVar);
        }

        /* renamed from: a */
        private boolean m2311a(View view, int i) {
            int a = C0641c.m3002a(((C0489d) view.getLayoutParams()).f2367g, i);
            return a != 0 && (C0641c.m3002a(this.f2368h, i) & a) == a;
        }

        public C0489d(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C0489d(LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$e */
    class C0490e implements OnPreDrawListener {
        C0490e() {
        }

        public boolean onPreDraw() {
            CoordinatorLayout.this.mo2808a(0);
            return true;
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$f */
    static class C0491f implements Comparator<View> {
        C0491f() {
        }

        /* renamed from: a */
        public int compare(View view, View view2) {
            float w = ViewCompat.m2870w(view);
            float w2 = ViewCompat.m2870w(view2);
            if (w > w2) {
                return -1;
            }
            return w < w2 ? 1 : 0;
        }
    }

    static {
        Package packageR = CoordinatorLayout.class.getPackage();
        f2336x = packageR != null ? packageR.getName() : null;
        if (VERSION.SDK_INT >= 21) {
            f2334A = new C0491f();
        } else {
            f2334A = null;
        }
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private static int m2269a(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    /* renamed from: a */
    private static void m2271a(Rect rect) {
        rect.setEmpty();
        f2335B.release(rect);
    }

    /* renamed from: b */
    private int m2279b(int i) {
        int[] iArr = this.f2347m;
        String str = "CoordinatorLayout";
        if (iArr == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("No keylines defined for ");
            sb.append(this);
            sb.append(" - attempted index lookup ");
            sb.append(i);
            Log.e(str, sb.toString());
            return 0;
        } else if (i >= 0 && i < iArr.length) {
            return iArr[i];
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Keyline index ");
            sb2.append(i);
            sb2.append(" out of range for ");
            sb2.append(this);
            Log.e(str, sb2.toString());
            return 0;
        }
    }

    /* renamed from: c */
    private static int m2282c(int i) {
        if (i == 0) {
            return 17;
        }
        return i;
    }

    /* renamed from: d */
    private static int m2284d(int i) {
        if ((i & 7) == 0) {
            i |= 8388611;
        }
        return (i & 112) == 0 ? i | 48 : i;
    }

    /* renamed from: d */
    private static Rect m2285d() {
        Rect rect = (Rect) f2335B.acquire();
        return rect == null ? new Rect() : rect;
    }

    /* renamed from: e */
    private static int m2287e(int i) {
        if (i == 0) {
            return 8388661;
        }
        return i;
    }

    /* renamed from: e */
    private void m2288e() {
        this.f2339e.clear();
        this.f2340f.mo2909a();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C0489d d = mo2824d(childAt);
            d.mo2889a(this, childAt);
            this.f2340f.mo2910a(childAt);
            for (int i2 = 0; i2 < childCount; i2++) {
                if (i2 != i) {
                    View childAt2 = getChildAt(i2);
                    if (d.mo2896a(this, childAt, childAt2)) {
                        if (!this.f2340f.mo2913b(childAt2)) {
                            this.f2340f.mo2910a(childAt2);
                        }
                        this.f2340f.mo2911a(childAt2, childAt);
                    }
                }
            }
        }
        this.f2339e.addAll(this.f2340f.mo2912b());
        Collections.reverse(this.f2339e);
    }

    /* renamed from: f */
    private void m2291f() {
        if (VERSION.SDK_INT >= 21) {
            if (ViewCompat.m2859l(this)) {
                if (this.f2356v == null) {
                    this.f2356v = new C0486a();
                }
                ViewCompat.m2823a((View) this, this.f2356v);
                setSystemUiVisibility(1280);
            } else {
                ViewCompat.m2823a((View) this, (OnApplyWindowInsetsListener) null);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo2822c(View view, Rect rect) {
        ((C0489d) view.getLayoutParams()).mo2891a(rect);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return (layoutParams instanceof C0489d) && super.checkLayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        C0489d dVar = (C0489d) view.getLayoutParams();
        Behavior behavior = dVar.f2361a;
        if (behavior != null) {
            float scrimOpacity = behavior.getScrimOpacity(this, view);
            if (scrimOpacity > 0.0f) {
                if (this.f2344j == null) {
                    this.f2344j = new Paint();
                }
                this.f2344j.setColor(dVar.f2361a.getScrimColor(this, view));
                this.f2344j.setAlpha(m2269a(Math.round(scrimOpacity * 255.0f), 0, 255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom(), Op.DIFFERENCE);
                }
                canvas.drawRect((float) getPaddingLeft(), (float) getPaddingTop(), (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()), this.f2344j);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f2354t;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* access modifiers changed from: 0000 */
    public final List<View> getDependencySortedChildren() {
        m2288e();
        return Collections.unmodifiableList(this.f2339e);
    }

    public final C0666p getLastWindowInsets() {
        return this.f2352r;
    }

    public int getNestedScrollAxes() {
        return this.f2357w.mo3405a();
    }

    public Drawable getStatusBarBackground() {
        return this.f2354t;
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m2277a(false);
        if (this.f2351q) {
            if (this.f2350p == null) {
                this.f2350p = new C0490e();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f2350p);
        }
        if (this.f2352r == null && ViewCompat.m2859l(this)) {
            ViewCompat.m2809I(this);
        }
        this.f2346l = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m2277a(false);
        if (this.f2351q && this.f2350p != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f2350p);
        }
        View view = this.f2349o;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f2346l = false;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f2353s && this.f2354t != null) {
            C0666p pVar = this.f2352r;
            int d = pVar != null ? pVar.mo3446d() : 0;
            if (d > 0) {
                this.f2354t.setBounds(0, 0, getWidth(), d);
                this.f2354t.draw(canvas);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m2277a(true);
        }
        boolean a = m2278a(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            m2277a(true);
        }
        return a;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int o = ViewCompat.m2862o(this);
        int size = this.f2339e.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) this.f2339e.get(i5);
            if (view.getVisibility() != 8) {
                Behavior d = ((C0489d) view.getLayoutParams()).mo2901d();
                if (d == null || !d.onLayoutChild(this, view, o)) {
                    mo2818b(view, o);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0117, code lost:
        if (r0.onMeasureChild(r30, r20, r11, r21, r23, 0) == false) goto L_0x0126;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x011a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r31, int r32) {
        /*
            r30 = this;
            r7 = r30
            r30.m2288e()
            r30.mo2817b()
            int r8 = r30.getPaddingLeft()
            int r0 = r30.getPaddingTop()
            int r9 = r30.getPaddingRight()
            int r1 = r30.getPaddingBottom()
            int r10 = androidx.core.view.ViewCompat.m2862o(r30)
            r2 = 1
            if (r10 != r2) goto L_0x0021
            r12 = 1
            goto L_0x0022
        L_0x0021:
            r12 = 0
        L_0x0022:
            int r13 = android.view.View.MeasureSpec.getMode(r31)
            int r14 = android.view.View.MeasureSpec.getSize(r31)
            int r15 = android.view.View.MeasureSpec.getMode(r32)
            int r16 = android.view.View.MeasureSpec.getSize(r32)
            int r17 = r8 + r9
            int r18 = r0 + r1
            int r0 = r30.getSuggestedMinimumWidth()
            int r1 = r30.getSuggestedMinimumHeight()
            androidx.core.view.p r3 = r7.f2352r
            if (r3 == 0) goto L_0x004b
            boolean r3 = androidx.core.view.ViewCompat.m2859l(r30)
            if (r3 == 0) goto L_0x004b
            r19 = 1
            goto L_0x004d
        L_0x004b:
            r19 = 0
        L_0x004d:
            java.util.List<android.view.View> r2 = r7.f2339e
            int r6 = r2.size()
            r4 = r0
            r2 = r1
            r3 = 0
            r5 = 0
        L_0x0057:
            if (r5 >= r6) goto L_0x016c
            java.util.List<android.view.View> r0 = r7.f2339e
            java.lang.Object r0 = r0.get(r5)
            r20 = r0
            android.view.View r20 = (android.view.View) r20
            int r0 = r20.getVisibility()
            r1 = 8
            if (r0 != r1) goto L_0x0071
            r22 = r5
            r29 = r6
            goto L_0x0166
        L_0x0071:
            android.view.ViewGroup$LayoutParams r0 = r20.getLayoutParams()
            r1 = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$d r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0489d) r1
            int r0 = r1.f2365e
            if (r0 < 0) goto L_0x00b8
            if (r13 == 0) goto L_0x00b8
            int r0 = r7.m2279b(r0)
            int r11 = r1.f2363c
            int r11 = m2287e(r11)
            int r11 = androidx.core.view.C0641c.m3002a(r11, r10)
            r11 = r11 & 7
            r22 = r2
            r2 = 3
            if (r11 != r2) goto L_0x0095
            if (r12 == 0) goto L_0x009a
        L_0x0095:
            r2 = 5
            if (r11 != r2) goto L_0x00a6
            if (r12 == 0) goto L_0x00a6
        L_0x009a:
            int r2 = r14 - r9
            int r2 = r2 - r0
            r0 = 0
            int r2 = java.lang.Math.max(r0, r2)
            r21 = r2
            r11 = 0
            goto L_0x00bd
        L_0x00a6:
            if (r11 != r2) goto L_0x00aa
            if (r12 == 0) goto L_0x00af
        L_0x00aa:
            r2 = 3
            if (r11 != r2) goto L_0x00ba
            if (r12 == 0) goto L_0x00ba
        L_0x00af:
            int r0 = r0 - r8
            r11 = 0
            int r0 = java.lang.Math.max(r11, r0)
            r21 = r0
            goto L_0x00bd
        L_0x00b8:
            r22 = r2
        L_0x00ba:
            r11 = 0
            r21 = 0
        L_0x00bd:
            if (r19 == 0) goto L_0x00ef
            boolean r0 = androidx.core.view.ViewCompat.m2859l(r20)
            if (r0 != 0) goto L_0x00ef
            androidx.core.view.p r0 = r7.f2352r
            int r0 = r0.mo3444b()
            androidx.core.view.p r2 = r7.f2352r
            int r2 = r2.mo3445c()
            int r0 = r0 + r2
            androidx.core.view.p r2 = r7.f2352r
            int r2 = r2.mo3446d()
            androidx.core.view.p r11 = r7.f2352r
            int r11 = r11.mo3442a()
            int r2 = r2 + r11
            int r0 = r14 - r0
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r13)
            int r2 = r16 - r2
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r15)
            r11 = r0
            r23 = r2
            goto L_0x00f3
        L_0x00ef:
            r11 = r31
            r23 = r32
        L_0x00f3:
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r0 = r1.mo2901d()
            if (r0 == 0) goto L_0x011a
            r24 = 0
            r2 = r1
            r1 = r30
            r26 = r2
            r25 = r22
            r2 = r20
            r27 = r3
            r3 = r11
            r28 = r4
            r4 = r21
            r22 = r5
            r5 = r23
            r29 = r6
            r6 = r24
            boolean r0 = r0.onMeasureChild(r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto L_0x0133
            goto L_0x0126
        L_0x011a:
            r26 = r1
            r27 = r3
            r28 = r4
            r29 = r6
            r25 = r22
            r22 = r5
        L_0x0126:
            r5 = 0
            r0 = r30
            r1 = r20
            r2 = r11
            r3 = r21
            r4 = r23
            r0.mo2811a(r1, r2, r3, r4, r5)
        L_0x0133:
            int r0 = r20.getMeasuredWidth()
            int r0 = r17 + r0
            r1 = r26
            int r2 = r1.leftMargin
            int r0 = r0 + r2
            int r2 = r1.rightMargin
            int r0 = r0 + r2
            r2 = r28
            int r0 = java.lang.Math.max(r2, r0)
            int r2 = r20.getMeasuredHeight()
            int r2 = r18 + r2
            int r3 = r1.topMargin
            int r2 = r2 + r3
            int r1 = r1.bottomMargin
            int r2 = r2 + r1
            r1 = r25
            int r1 = java.lang.Math.max(r1, r2)
            int r2 = r20.getMeasuredState()
            r11 = r27
            int r2 = android.view.View.combineMeasuredStates(r11, r2)
            r4 = r0
            r3 = r2
            r2 = r1
        L_0x0166:
            int r5 = r22 + 1
            r6 = r29
            goto L_0x0057
        L_0x016c:
            r1 = r2
            r11 = r3
            r2 = r4
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r11
            r3 = r31
            int r0 = android.view.View.resolveSizeAndState(r2, r3, r0)
            int r2 = r11 << 16
            r3 = r32
            int r1 = android.view.View.resolveSizeAndState(r1, r3, r2)
            r7.setMeasuredDimension(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0489d dVar = (C0489d) childAt.getLayoutParams();
                if (dVar.mo2895a(0)) {
                    Behavior d = dVar.mo2901d();
                    if (d != null) {
                        z2 |= d.onNestedFling(this, childAt, view, f, f2, z);
                    }
                }
            }
        }
        if (z2) {
            mo2808a(1);
        }
        return z2;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0489d dVar = (C0489d) childAt.getLayoutParams();
                if (dVar.mo2895a(0)) {
                    Behavior d = dVar.mo2901d();
                    if (d != null) {
                        z |= d.onNestedPreFling(this, childAt, view, f, f2);
                    }
                }
            }
        }
        return z;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        onNestedPreScroll(view, i, i2, iArr, 0);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        onNestedScroll(view, i, i2, i3, i4, 0);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        onNestedScrollAccepted(view, view2, i, 0);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo3548a());
        SparseArray<Parcelable> sparseArray = savedState.f2358g;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            Behavior d = mo2824d(childAt).mo2901d();
            if (!(id == -1 || d == null)) {
                Parcelable parcelable2 = (Parcelable) sparseArray.get(id);
                if (parcelable2 != null) {
                    d.onRestoreInstanceState(this, childAt, parcelable2);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            Behavior d = ((C0489d) childAt.getLayoutParams()).mo2901d();
            if (!(id == -1 || d == null)) {
                Parcelable onSaveInstanceState = d.onSaveInstanceState(this, childAt);
                if (onSaveInstanceState != null) {
                    sparseArray.append(id, onSaveInstanceState);
                }
            }
        }
        savedState.f2358g = sparseArray;
        return savedState;
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return onStartNestedScroll(view, view2, i, 0);
    }

    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r3 != false) goto L_0x0016;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f2348n
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0015
            boolean r3 = r0.m2278a(r1, r4)
            if (r3 == 0) goto L_0x002b
            goto L_0x0016
        L_0x0015:
            r3 = 0
        L_0x0016:
            android.view.View r6 = r0.f2348n
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$d r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0489d) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r6 = r6.mo2901d()
            if (r6 == 0) goto L_0x002b
            android.view.View r7 = r0.f2348n
            boolean r6 = r6.onTouchEvent(r0, r7, r1)
            goto L_0x002c
        L_0x002b:
            r6 = 0
        L_0x002c:
            android.view.View r7 = r0.f2348n
            r8 = 0
            if (r7 != 0) goto L_0x0037
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L_0x004a
        L_0x0037:
            if (r3 == 0) goto L_0x004a
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L_0x004a:
            if (r8 == 0) goto L_0x004f
            r8.recycle()
        L_0x004f:
            if (r2 == r4) goto L_0x0054
            r1 = 3
            if (r2 != r1) goto L_0x0057
        L_0x0054:
            r0.m2277a(r5)
        L_0x0057:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        Behavior d = ((C0489d) view.getLayoutParams()).mo2901d();
        if (d == null || !d.onRequestChildRectangleOnScreen(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.f2345k) {
            m2277a(false);
            this.f2345k = true;
        }
    }

    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        m2291f();
    }

    public void setOnHierarchyChangeListener(OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f2355u = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f2354t;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f2354t = drawable3;
            Drawable drawable4 = this.f2354t;
            if (drawable4 != null) {
                if (drawable4.isStateful()) {
                    this.f2354t.setState(getDrawableState());
                }
                C0559a.m2648a(this.f2354t, ViewCompat.m2862o(this));
                this.f2354t.setVisible(getVisibility() == 0, false);
                this.f2354t.setCallback(this);
            }
            ViewCompat.m2808H(this);
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? C0540a.m2546c(getContext(), i) : null);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f2354t;
        if (drawable != null && drawable.isVisible() != z) {
            this.f2354t.setVisible(z, false);
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f2354t;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7607a.coordinatorLayoutStyle);
    }

    /* access modifiers changed from: protected */
    public C0489d generateDefaultLayoutParams() {
        return new C0489d(-2, -2);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        int i4;
        int i5;
        int childCount = getChildCount();
        boolean z = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() == 8) {
                int i9 = i3;
            } else {
                C0489d dVar = (C0489d) childAt.getLayoutParams();
                if (dVar.mo2895a(i3)) {
                    Behavior d = dVar.mo2901d();
                    if (d != null) {
                        int[] iArr2 = this.f2343i;
                        iArr2[1] = 0;
                        iArr2[0] = 0;
                        d.onNestedPreScroll(this, childAt, view, i, i2, iArr2, i3);
                        int[] iArr3 = this.f2343i;
                        if (i > 0) {
                            i4 = Math.max(i6, iArr3[0]);
                        } else {
                            i4 = Math.min(i6, iArr3[0]);
                        }
                        int[] iArr4 = this.f2343i;
                        if (i2 > 0) {
                            i5 = Math.max(i7, iArr4[1]);
                        } else {
                            i5 = Math.min(i7, iArr4[1]);
                        }
                        i6 = i4;
                        i7 = i5;
                        z = true;
                    }
                }
            }
        }
        iArr[0] = i6;
        iArr[1] = i7;
        if (z) {
            mo2808a(1);
        }
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() == 8) {
                int i7 = i5;
            } else {
                C0489d dVar = (C0489d) childAt.getLayoutParams();
                if (dVar.mo2895a(i5)) {
                    Behavior d = dVar.mo2901d();
                    if (d != null) {
                        d.onNestedScroll(this, childAt, view, i, i2, i3, i4, i5);
                        z = true;
                    }
                }
            }
        }
        if (z) {
            mo2808a(1);
        }
    }

    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        this.f2357w.mo3409a(view, view2, i, i2);
        this.f2349o = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            C0489d dVar = (C0489d) childAt.getLayoutParams();
            if (dVar.mo2895a(i2)) {
                Behavior d = dVar.mo2901d();
                if (d != null) {
                    d.onNestedScrollAccepted(this, childAt, view, view2, i, i2);
                }
            }
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        int i3 = i2;
        int childCount = getChildCount();
        boolean z = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                C0489d dVar = (C0489d) childAt.getLayoutParams();
                Behavior d = dVar.mo2901d();
                if (d != null) {
                    boolean onStartNestedScroll = d.onStartNestedScroll(this, childAt, view, view2, i, i2);
                    boolean z2 = z | onStartNestedScroll;
                    dVar.mo2890a(i3, onStartNestedScroll);
                    z = z2;
                } else {
                    dVar.mo2890a(i3, false);
                }
            }
        }
        return z;
    }

    public void onStopNestedScroll(View view, int i) {
        this.f2357w.mo3407a(view, i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C0489d dVar = (C0489d) childAt.getLayoutParams();
            if (dVar.mo2895a(i)) {
                Behavior d = dVar.mo2901d();
                if (d != null) {
                    d.onStopNestedScroll(this, childAt, view, i);
                }
                dVar.mo2897b(i);
                dVar.mo2904g();
            }
        }
        this.f2349o = null;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        TypedArray typedArray;
        super(context, attributeSet, i);
        this.f2339e = new ArrayList();
        this.f2340f = new C0492a<>();
        this.f2341g = new ArrayList();
        this.f2342h = new ArrayList();
        this.f2343i = new int[2];
        this.f2357w = new C0646h(this);
        if (i == 0) {
            typedArray = context.obtainStyledAttributes(attributeSet, C7609c.CoordinatorLayout, 0, C7608b.Widget_Support_CoordinatorLayout);
        } else {
            typedArray = context.obtainStyledAttributes(attributeSet, C7609c.CoordinatorLayout, i, 0);
        }
        int resourceId = typedArray.getResourceId(C7609c.CoordinatorLayout_keylines, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f2347m = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.f2347m.length;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr = this.f2347m;
                iArr[i2] = (int) (((float) iArr[i2]) * f);
            }
        }
        this.f2354t = typedArray.getDrawable(C7609c.CoordinatorLayout_statusBarBackground);
        typedArray.recycle();
        m2291f();
        super.setOnHierarchyChangeListener(new C0488c());
    }

    /* renamed from: c */
    private void m2283c(View view, int i) {
        C0489d dVar = (C0489d) view.getLayoutParams();
        Rect d = m2285d();
        d.set(getPaddingLeft() + dVar.leftMargin, getPaddingTop() + dVar.topMargin, (getWidth() - getPaddingRight()) - dVar.rightMargin, (getHeight() - getPaddingBottom()) - dVar.bottomMargin);
        if (this.f2352r != null && ViewCompat.m2859l(this) && !ViewCompat.m2859l(view)) {
            d.left += this.f2352r.mo3444b();
            d.top += this.f2352r.mo3446d();
            d.right -= this.f2352r.mo3445c();
            d.bottom -= this.f2352r.mo3442a();
        }
        Rect d2 = m2285d();
        C0641c.m3003a(m2284d(dVar.f2363c), view.getMeasuredWidth(), view.getMeasuredHeight(), d, d2, i);
        view.layout(d2.left, d2.top, d2.right, d2.bottom);
        m2271a(d);
        m2271a(d2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C0666p mo2806a(C0666p pVar) {
        if (C0602d.m2768a(this.f2352r, pVar)) {
            return pVar;
        }
        this.f2352r = pVar;
        boolean z = true;
        this.f2353s = pVar != null && pVar.mo3446d() > 0;
        if (this.f2353s || getBackground() != null) {
            z = false;
        }
        setWillNotDraw(z);
        C0666p b = m2280b(pVar);
        requestLayout();
        return b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public C0489d mo2824d(View view) {
        C0489d dVar = (C0489d) view.getLayoutParams();
        if (!dVar.f2362b) {
            String str = "CoordinatorLayout";
            if (view instanceof AttachedBehavior) {
                Behavior behavior = ((AttachedBehavior) view).getBehavior();
                if (behavior == null) {
                    Log.e(str, "Attached behavior class is null");
                }
                dVar.mo2892a(behavior);
                dVar.f2362b = true;
            } else {
                C0487b bVar = null;
                for (Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    bVar = (C0487b) cls.getAnnotation(C0487b.class);
                    if (bVar != null) {
                        break;
                    }
                }
                if (bVar != null) {
                    try {
                        dVar.mo2892a((Behavior) bVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Default behavior class ");
                        sb.append(bVar.value().getName());
                        sb.append(" could not be instantiated. Did you forget");
                        sb.append(" a default constructor?");
                        Log.e(str, sb.toString(), e);
                    }
                }
                dVar.f2362b = true;
            }
        }
        return dVar;
    }

    public C0489d generateLayoutParams(AttributeSet attributeSet) {
        return new C0489d(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0489d generateLayoutParams(LayoutParams layoutParams) {
        if (layoutParams instanceof C0489d) {
            return new C0489d((C0489d) layoutParams);
        }
        if (layoutParams instanceof MarginLayoutParams) {
            return new C0489d((MarginLayoutParams) layoutParams);
        }
        return new C0489d(layoutParams);
    }

    /* renamed from: b */
    private C0666p m2280b(C0666p pVar) {
        if (pVar.mo3447e()) {
            return pVar;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (ViewCompat.m2859l(childAt)) {
                Behavior d = ((C0489d) childAt.getLayoutParams()).mo2901d();
                if (d != null) {
                    pVar = d.onApplyWindowInsets(this, childAt, pVar);
                    if (pVar.mo3447e()) {
                        break;
                    }
                } else {
                    continue;
                }
            }
        }
        return pVar;
    }

    /* renamed from: a */
    private void m2277a(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            Behavior d = ((C0489d) childAt.getLayoutParams()).mo2901d();
            if (d != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    d.onInterceptTouchEvent(this, childAt, obtain);
                } else {
                    d.onTouchEvent(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C0489d) getChildAt(i2).getLayoutParams()).mo2905h();
        }
        this.f2348n = null;
        this.f2345k = false;
    }

    /* renamed from: b */
    public void mo2818b(View view, int i) {
        C0489d dVar = (C0489d) view.getLayoutParams();
        if (!dVar.mo2894a()) {
            View view2 = dVar.f2371k;
            if (view2 != null) {
                m2274a(view, view2, i);
                return;
            }
            int i2 = dVar.f2365e;
            if (i2 >= 0) {
                m2281b(view, i2, i);
            } else {
                m2283c(view, i);
            }
        } else {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
    }

    /* renamed from: e */
    private void m2289e(View view, int i) {
        C0489d dVar = (C0489d) view.getLayoutParams();
        int i2 = dVar.f2370j;
        if (i2 != i) {
            ViewCompat.m2848e(view, i - i2);
            dVar.f2370j = i;
        }
    }

    /* renamed from: d */
    private void m2286d(View view, int i) {
        C0489d dVar = (C0489d) view.getLayoutParams();
        int i2 = dVar.f2369i;
        if (i2 != i) {
            ViewCompat.m2846d(view, i - i2);
            dVar.f2369i = i;
        }
    }

    /* renamed from: e */
    private boolean m2290e(View view) {
        return this.f2340f.mo2916e(view);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo2819b(View view, Rect rect) {
        rect.set(((C0489d) view.getLayoutParams()).mo2903f());
    }

    /* renamed from: a */
    private void m2276a(List<View> list) {
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        int i = childCount - 1;
        while (i >= 0) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i) : i));
            i--;
        }
        Comparator<View> comparator = f2334A;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    /* renamed from: c */
    public List<View> mo2820c(View view) {
        List c = this.f2340f.mo2914c(view);
        this.f2342h.clear();
        if (c != null) {
            this.f2342h.addAll(c);
        }
        return this.f2342h;
    }

    /* renamed from: b */
    private void m2281b(View view, int i, int i2) {
        C0489d dVar = (C0489d) view.getLayoutParams();
        int a = C0641c.m3002a(m2287e(dVar.f2363c), i2);
        int i3 = a & 7;
        int i4 = a & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i2 == 1) {
            i = width - i;
        }
        int b = m2279b(i) - measuredWidth;
        int i5 = 0;
        if (i3 == 1) {
            b += measuredWidth / 2;
        } else if (i3 == 5) {
            b += measuredWidth;
        }
        if (i4 == 16) {
            i5 = 0 + (measuredHeight / 2);
        } else if (i4 == 80) {
            i5 = measuredHeight + 0;
        }
        int max = Math.max(getPaddingLeft() + dVar.leftMargin, Math.min(b, ((width - getPaddingRight()) - measuredWidth) - dVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + dVar.topMargin, Math.min(i5, ((height - getPaddingBottom()) - measuredHeight) - dVar.bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo2821c() {
        if (this.f2346l && this.f2350p != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f2350p);
        }
        this.f2351q = false;
    }

    /* renamed from: a */
    private boolean m2278a(MotionEvent motionEvent, int i) {
        MotionEvent motionEvent2 = motionEvent;
        int i2 = i;
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f2341g;
        m2276a(list);
        int size = list.size();
        MotionEvent motionEvent3 = null;
        boolean z = false;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) list.get(i3);
            C0489d dVar = (C0489d) view.getLayoutParams();
            Behavior d = dVar.mo2901d();
            boolean z3 = true;
            if ((!z && !z2) || actionMasked == 0) {
                if (!z && d != null) {
                    if (i2 == 0) {
                        z = d.onInterceptTouchEvent(this, view, motionEvent2);
                    } else if (i2 == 1) {
                        z = d.onTouchEvent(this, view, motionEvent2);
                    }
                    if (z) {
                        this.f2348n = view;
                    }
                }
                boolean b = dVar.mo2898b();
                boolean b2 = dVar.mo2899b(this, view);
                if (!b2 || b) {
                    z3 = false;
                }
                if (b2 && !z3) {
                    break;
                }
                z2 = z3;
            } else if (d != null) {
                if (motionEvent3 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent3 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i2 == 0) {
                    d.onInterceptTouchEvent(this, view, motionEvent3);
                } else if (i2 == 1) {
                    d.onTouchEvent(this, view, motionEvent3);
                }
            }
        }
        list.clear();
        return z;
    }

    /* renamed from: b */
    public List<View> mo2816b(View view) {
        List d = this.f2340f.mo2915d(view);
        this.f2342h.clear();
        if (d != null) {
            this.f2342h.addAll(d);
        }
        return this.f2342h;
    }

    /* renamed from: a */
    static Behavior m2270a(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            StringBuilder sb = new StringBuilder();
            sb.append(context.getPackageName());
            sb.append(str);
            str = sb.toString();
        } else if (str.indexOf(46) < 0 && !TextUtils.isEmpty(f2336x)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(f2336x);
            sb2.append('.');
            sb2.append(str);
            str = sb2.toString();
        }
        try {
            Map map = (Map) f2338z.get();
            if (map == null) {
                map = new HashMap();
                f2338z.set(map);
            }
            Constructor constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = context.getClassLoader().loadClass(str).getConstructor(f2337y);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (Behavior) constructor.newInstance(new Object[]{context, attributeSet});
        } catch (Exception e) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Could not inflate Behavior subclass ");
            sb3.append(str);
            throw new RuntimeException(sb3.toString(), e);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo2817b() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (m2290e(getChildAt(i))) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z == this.f2351q) {
            return;
        }
        if (z) {
            mo2807a();
        } else {
            mo2821c();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2813a(View view, Rect rect) {
        C0493b.m2342a((ViewGroup) this, view, rect);
    }

    /* renamed from: a */
    public void mo2811a(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2814a(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
            return;
        }
        if (z) {
            mo2813a(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: a */
    private void m2272a(View view, int i, Rect rect, Rect rect2, C0489d dVar, int i2, int i3) {
        int i4;
        int i5;
        int a = C0641c.m3002a(m2282c(dVar.f2363c), i);
        int a2 = C0641c.m3002a(m2284d(dVar.f2364d), i);
        int i6 = a & 7;
        int i7 = a & 112;
        int i8 = a2 & 7;
        int i9 = a2 & 112;
        if (i8 == 1) {
            i4 = rect.left + (rect.width() / 2);
        } else if (i8 != 5) {
            i4 = rect.left;
        } else {
            i4 = rect.right;
        }
        if (i9 == 16) {
            i5 = rect.top + (rect.height() / 2);
        } else if (i9 != 80) {
            i5 = rect.top;
        } else {
            i5 = rect.bottom;
        }
        if (i6 == 1) {
            i4 -= i2 / 2;
        } else if (i6 != 5) {
            i4 -= i2;
        }
        if (i7 == 16) {
            i5 -= i3 / 2;
        } else if (i7 != 80) {
            i5 -= i3;
        }
        rect2.set(i4, i5, i2 + i4, i3 + i5);
    }

    /* renamed from: a */
    private void m2275a(C0489d dVar, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + dVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - dVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + dVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - dVar.bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2812a(View view, int i, Rect rect, Rect rect2) {
        C0489d dVar = (C0489d) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        m2272a(view, i, rect, rect2, dVar, measuredWidth, measuredHeight);
        m2275a(dVar, rect2, measuredWidth, measuredHeight);
    }

    /* renamed from: a */
    private void m2274a(View view, View view2, int i) {
        Rect d = m2285d();
        Rect d2 = m2285d();
        try {
            mo2813a(view2, d);
            mo2812a(view, i, d, d2);
            view.layout(d2.left, d2.top, d2.right, d2.bottom);
        } finally {
            m2271a(d);
            m2271a(d2);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo2808a(int i) {
        boolean z;
        int i2 = i;
        int o = ViewCompat.m2862o(this);
        int size = this.f2339e.size();
        Rect d = m2285d();
        Rect d2 = m2285d();
        Rect d3 = m2285d();
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) this.f2339e.get(i3);
            C0489d dVar = (C0489d) view.getLayoutParams();
            if (i2 != 0 || view.getVisibility() != 8) {
                for (int i4 = 0; i4 < i3; i4++) {
                    if (dVar.f2372l == ((View) this.f2339e.get(i4))) {
                        mo2810a(view, o);
                    }
                }
                mo2814a(view, true, d2);
                if (dVar.f2367g != 0 && !d2.isEmpty()) {
                    int a = C0641c.m3002a(dVar.f2367g, o);
                    int i5 = a & 112;
                    if (i5 == 48) {
                        d.top = Math.max(d.top, d2.bottom);
                    } else if (i5 == 80) {
                        d.bottom = Math.max(d.bottom, getHeight() - d2.top);
                    }
                    int i6 = a & 7;
                    if (i6 == 3) {
                        d.left = Math.max(d.left, d2.right);
                    } else if (i6 == 5) {
                        d.right = Math.max(d.right, getWidth() - d2.left);
                    }
                }
                if (dVar.f2368h != 0 && view.getVisibility() == 0) {
                    m2273a(view, d, o);
                }
                if (i2 != 2) {
                    mo2819b(view, d3);
                    if (!d3.equals(d2)) {
                        mo2822c(view, d2);
                    }
                }
                for (int i7 = i3 + 1; i7 < size; i7++) {
                    View view2 = (View) this.f2339e.get(i7);
                    C0489d dVar2 = (C0489d) view2.getLayoutParams();
                    Behavior d4 = dVar2.mo2901d();
                    if (d4 != null && d4.layoutDependsOn(this, view2, view)) {
                        if (i2 != 0 || !dVar2.mo2902e()) {
                            if (i2 != 2) {
                                z = d4.onDependentViewChanged(this, view2, view);
                            } else {
                                d4.onDependentViewRemoved(this, view2, view);
                                z = true;
                            }
                            if (i2 == 1) {
                                dVar2.mo2893a(z);
                            }
                        } else {
                            dVar2.mo2904g();
                        }
                    }
                }
            }
        }
        m2271a(d);
        m2271a(d2);
        m2271a(d3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f6  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m2273a(android.view.View r9, android.graphics.Rect r10, int r11) {
        /*
            r8 = this;
            boolean r0 = androidx.core.view.ViewCompat.m2804D(r9)
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            int r0 = r9.getWidth()
            if (r0 <= 0) goto L_0x00fc
            int r0 = r9.getHeight()
            if (r0 > 0) goto L_0x0015
            goto L_0x00fc
        L_0x0015:
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$d r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0489d) r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r1 = r0.mo2901d()
            android.graphics.Rect r2 = m2285d()
            android.graphics.Rect r3 = m2285d()
            int r4 = r9.getLeft()
            int r5 = r9.getTop()
            int r6 = r9.getRight()
            int r7 = r9.getBottom()
            r3.set(r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0070
            boolean r1 = r1.getInsetDodgeRect(r8, r9, r2)
            if (r1 == 0) goto L_0x0070
            boolean r1 = r3.contains(r2)
            if (r1 == 0) goto L_0x0049
            goto L_0x0073
        L_0x0049:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Rect should be within the child's bounds. Rect:"
            r10.append(r11)
            java.lang.String r11 = r2.toShortString()
            r10.append(r11)
            java.lang.String r11 = " | Bounds:"
            r10.append(r11)
            java.lang.String r11 = r3.toShortString()
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x0070:
            r2.set(r3)
        L_0x0073:
            m2271a(r3)
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L_0x0080
            m2271a(r2)
            return
        L_0x0080:
            int r1 = r0.f2368h
            int r11 = androidx.core.view.C0641c.m3002a(r1, r11)
            r1 = r11 & 48
            r3 = 48
            r4 = 1
            r5 = 0
            if (r1 != r3) goto L_0x00a0
            int r1 = r2.top
            int r3 = r0.topMargin
            int r1 = r1 - r3
            int r3 = r0.f2370j
            int r1 = r1 - r3
            int r3 = r10.top
            if (r1 >= r3) goto L_0x00a0
            int r3 = r3 - r1
            r8.m2289e(r9, r3)
            r1 = 1
            goto L_0x00a1
        L_0x00a0:
            r1 = 0
        L_0x00a1:
            r3 = r11 & 80
            r6 = 80
            if (r3 != r6) goto L_0x00bd
            int r3 = r8.getHeight()
            int r6 = r2.bottom
            int r3 = r3 - r6
            int r6 = r0.bottomMargin
            int r3 = r3 - r6
            int r6 = r0.f2370j
            int r3 = r3 + r6
            int r6 = r10.bottom
            if (r3 >= r6) goto L_0x00bd
            int r3 = r3 - r6
            r8.m2289e(r9, r3)
            r1 = 1
        L_0x00bd:
            if (r1 != 0) goto L_0x00c2
            r8.m2289e(r9, r5)
        L_0x00c2:
            r1 = r11 & 3
            r3 = 3
            if (r1 != r3) goto L_0x00d9
            int r1 = r2.left
            int r3 = r0.leftMargin
            int r1 = r1 - r3
            int r3 = r0.f2369i
            int r1 = r1 - r3
            int r3 = r10.left
            if (r1 >= r3) goto L_0x00d9
            int r3 = r3 - r1
            r8.m2286d(r9, r3)
            r1 = 1
            goto L_0x00da
        L_0x00d9:
            r1 = 0
        L_0x00da:
            r3 = 5
            r11 = r11 & r3
            if (r11 != r3) goto L_0x00f4
            int r11 = r8.getWidth()
            int r3 = r2.right
            int r11 = r11 - r3
            int r3 = r0.rightMargin
            int r11 = r11 - r3
            int r0 = r0.f2369i
            int r11 = r11 + r0
            int r10 = r10.right
            if (r11 >= r10) goto L_0x00f4
            int r11 = r11 - r10
            r8.m2286d(r9, r11)
            r1 = 1
        L_0x00f4:
            if (r1 != 0) goto L_0x00f9
            r8.m2286d(r9, r5)
        L_0x00f9:
            m2271a(r2)
        L_0x00fc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.m2273a(android.view.View, android.graphics.Rect, int):void");
    }

    /* renamed from: a */
    public void mo2809a(View view) {
        List c = this.f2340f.mo2914c(view);
        if (c != null && !c.isEmpty()) {
            for (int i = 0; i < c.size(); i++) {
                View view2 = (View) c.get(i);
                Behavior d = ((C0489d) view2.getLayoutParams()).mo2901d();
                if (d != null) {
                    d.onDependentViewChanged(this, view2, view);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2807a() {
        if (this.f2346l) {
            if (this.f2350p == null) {
                this.f2350p = new C0490e();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f2350p);
        }
        this.f2351q = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2810a(View view, int i) {
        View view2 = view;
        C0489d dVar = (C0489d) view.getLayoutParams();
        if (dVar.f2371k != null) {
            Rect d = m2285d();
            Rect d2 = m2285d();
            Rect d3 = m2285d();
            mo2813a(dVar.f2371k, d);
            boolean z = false;
            mo2814a(view2, false, d2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i2 = measuredHeight;
            m2272a(view, i, d, d3, dVar, measuredWidth, measuredHeight);
            if (!(d3.left == d2.left && d3.top == d2.top)) {
                z = true;
            }
            m2275a(dVar, d3, measuredWidth, i2);
            int i3 = d3.left - d2.left;
            int i4 = d3.top - d2.top;
            if (i3 != 0) {
                ViewCompat.m2846d(view2, i3);
            }
            if (i4 != 0) {
                ViewCompat.m2848e(view2, i4);
            }
            if (z) {
                Behavior d4 = dVar.mo2901d();
                if (d4 != null) {
                    d4.onDependentViewChanged(this, view2, dVar.f2371k);
                }
            }
            m2271a(d);
            m2271a(d2);
            m2271a(d3);
        }
    }

    /* renamed from: a */
    public boolean mo2815a(View view, int i, int i2) {
        Rect d = m2285d();
        mo2813a(view, d);
        try {
            return d.contains(i, i2);
        } finally {
            m2271a(d);
        }
    }
}
