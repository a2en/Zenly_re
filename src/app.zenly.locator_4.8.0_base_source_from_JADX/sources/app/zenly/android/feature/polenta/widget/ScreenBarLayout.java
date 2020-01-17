package app.zenly.android.feature.polenta.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.core.view.NestedScrollingChild;
import androidx.recyclerview.widget.RecyclerView;
import app.zenly.android.base.widget.LinearLayout;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p279d.C7765a;
import p250f.p251a.p252a.p263b.p279d.C7766b;
import p250f.p251a.p252a.p263b.p279d.C7768d;
import p250f.p251a.p252a.p263b.p279d.C7769e;
import p250f.p251a.p252a.p263b.p279d.C7771g;

@SuppressLint({"CustomViewStyleable"})
public final class ScreenBarLayout extends FrameLayout {

    /* renamed from: e */
    private int f5222e;

    /* renamed from: f */
    private int f5223f;

    /* renamed from: g */
    private boolean f5224g;

    /* renamed from: h */
    private OnCollapseListener f5225h;

    /* renamed from: i */
    private OnScreenBarLayoutReady f5226i;

    /* renamed from: j */
    private int f5227j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final float f5228k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final float f5229l;

    /* renamed from: m */
    private WeakReference<View> f5230m;

    /* renamed from: n */
    private final OnScrollChangedListener f5231n;

    /* renamed from: o */
    private final OnLayoutChangeListener f5232o;

    /* renamed from: p */
    private boolean f5233p;

    /* renamed from: q */
    private HashMap f5234q;

    public interface OnCollapseListener {
        void onCollapse(float f, int i);
    }

    public interface OnScreenBarLayoutReady {
        void onReady();
    }

    /* renamed from: app.zenly.android.feature.polenta.widget.ScreenBarLayout$a */
    static final class C1434a implements OnScrollChangedListener {

        /* renamed from: a */
        final /* synthetic */ ScreenBarLayout f5235a;

        C1434a(ScreenBarLayout screenBarLayout) {
            this.f5235a = screenBarLayout;
        }

        public final void onScrollChanged() {
            ScreenBarLayout screenBarLayout = this.f5235a;
            float a = (float) screenBarLayout.m6525b(screenBarLayout.m6521a(screenBarLayout.m6526b((ViewGroup) screenBarLayout)));
            ScreenBarLayout screenBarLayout2 = this.f5235a;
            screenBarLayout2.setTranslationZ((Math.min(a, screenBarLayout2.f5228k) / this.f5235a.f5228k) * this.f5235a.f5229l);
        }
    }

    /* renamed from: app.zenly.android.feature.polenta.widget.ScreenBarLayout$b */
    static final class C1435b implements OnLayoutChangeListener {

        /* renamed from: e */
        final /* synthetic */ ScreenBarLayout f5236e;

        /* renamed from: app.zenly.android.feature.polenta.widget.ScreenBarLayout$b$a */
        static final class C1436a implements Runnable {

            /* renamed from: e */
            final /* synthetic */ C1435b f5237e;

            /* renamed from: f */
            final /* synthetic */ View f5238f;

            C1436a(C1435b bVar, View view) {
                this.f5237e = bVar;
                this.f5238f = view;
            }

            public final void run() {
                ScreenBarLayout screenBarLayout = this.f5237e.f5236e;
                View view = this.f5238f;
                C12932j.m33815a((Object) view, "v");
                screenBarLayout.setExpandedHeight(view.getHeight());
            }
        }

        C1435b(ScreenBarLayout screenBarLayout) {
            this.f5236e = screenBarLayout;
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.f5236e.post(new C1436a(this, view));
        }
    }

    public ScreenBarLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public ScreenBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ ScreenBarLayout(Context context, AttributeSet attributeSet, int i, int i2, C12928f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = C7765a.screenBarLayoutStyle;
        }
        this(context, attributeSet, i);
    }

    /* access modifiers changed from: private */
    public final void setExpandedHeight(int i) {
        if (this.f5223f != i) {
            this.f5223f = i;
            LinearLayout linearLayout = (LinearLayout) mo6877a(C7768d.view_screen_bar_container);
            LayoutParams layoutParams = linearLayout.getLayoutParams();
            layoutParams.height = this.f5223f;
            linearLayout.setLayoutParams(layoutParams);
            OnScreenBarLayoutReady onScreenBarLayoutReady = this.f5226i;
            if (onScreenBarLayoutReady != null) {
                onScreenBarLayoutReady.onReady();
            }
        }
    }

    /* renamed from: a */
    public View mo6877a(int i) {
        if (this.f5234q == null) {
            this.f5234q = new HashMap();
        }
        View view = (View) this.f5234q.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f5234q.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        C12932j.m33818b(view, "child");
        if (this.f5233p) {
            ((LinearLayout) mo6877a(C7768d.view_screen_bar_container)).addView(view, i, layoutParams);
        } else {
            super.addView(view, i, layoutParams);
        }
    }

    public final int getCollapsibleHeight() {
        return this.f5223f - this.f5222e;
    }

    public final int getExpandedHeight() {
        return this.f5223f;
    }

    public final boolean getLiftOnScroll() {
        return this.f5224g;
    }

    public final int getLiftOnScrollTargetViewId() {
        return this.f5227j;
    }

    public final OnCollapseListener getOnCollapseListener() {
        return this.f5225h;
    }

    public final OnScreenBarLayoutReady getOnScreenBarLayoutReady() {
        return this.f5226i;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((LinearLayout) mo6877a(C7768d.view_screen_bar_container)).addOnLayoutChangeListener(this.f5232o);
        m6526b((ViewGroup) this).getViewTreeObserver().addOnScrollChangedListener(this.f5231n);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        m6528b();
        ((LinearLayout) mo6877a(C7768d.view_screen_bar_container)).removeOnLayoutChangeListener(this.f5232o);
        m6526b((ViewGroup) this).getViewTreeObserver().removeOnScrollChangedListener(this.f5231n);
        super.onDetachedFromWindow();
    }

    public final void setLiftOnScroll(boolean z) {
        this.f5224g = z;
    }

    public final void setLiftOnScrollTargetViewId(int i) {
        if (i != this.f5227j) {
            this.f5227j = i;
            m6528b();
        }
    }

    public final void setOnCollapseListener(OnCollapseListener onCollapseListener) {
        this.f5225h = onCollapseListener;
    }

    public final void setOnScreenBarLayoutReady(OnScreenBarLayoutReady onScreenBarLayoutReady) {
        this.f5226i = onScreenBarLayoutReady;
        if (this.f5223f != 0) {
            OnScreenBarLayoutReady onScreenBarLayoutReady2 = this.f5226i;
            if (onScreenBarLayoutReady2 != null) {
                onScreenBarLayoutReady2.onReady();
            }
        }
    }

    public ScreenBarLayout(Context context, AttributeSet attributeSet, int i) {
        C12932j.m33818b(context, "context");
        super(context, attributeSet, i);
        this.f5227j = -1;
        this.f5228k = getResources().getDimension(C7766b.spacing_200);
        this.f5229l = getResources().getDimension(C7766b.elevation_200);
        this.f5231n = new C1434a(this);
        this.f5232o = new C1435b(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7771g.ScreenBarLayout, i, 0);
        this.f5222e = obtainStyledAttributes.getDimensionPixelSize(C7771g.ScreenBarLayout_collapsedHeight, 0);
        this.f5224g = obtainStyledAttributes.getBoolean(C7771g.ScreenBarLayout_liftOnScroll, false);
        setLiftOnScrollTargetViewId(obtainStyledAttributes.getResourceId(C7771g.ScreenBarLayout_liftOnScrollTargetViewId, -1));
        obtainStyledAttributes.recycle();
        LayoutInflater.from(context).inflate(C7769e.view_screen_bar_layout, this);
        this.f5233p = true;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final ViewGroup m6526b(ViewGroup viewGroup) {
        ViewParent parent = viewGroup.getParent();
        if (parent != null) {
            return (ViewGroup) parent;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    /* renamed from: b */
    private final void m6528b() {
        WeakReference<View> weakReference = this.f5230m;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f5230m = null;
    }

    /* renamed from: a */
    private final View m6520a(View view) {
        if (this.f5230m == null) {
            int i = this.f5227j;
            if (i != -1) {
                View findViewById = view != null ? view.findViewById(i) : null;
                if (findViewById == null) {
                    findViewById = m6526b((ViewGroup) this).findViewById(this.f5227j);
                }
                if (findViewById != null) {
                    this.f5230m = new WeakReference<>(findViewById);
                }
            }
        }
        WeakReference<View> weakReference = this.f5230m;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final int m6525b(View view) {
        View a = m6520a(view);
        if (a != null) {
            view = a;
        }
        if (view == null) {
            return 0;
        }
        if (view instanceof RecyclerView) {
            return ((RecyclerView) view).computeVerticalScrollOffset();
        }
        return view.getScrollY();
    }

    /* renamed from: b */
    public final void mo6880b(int i) {
        LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = this.f5223f - i;
        setLayoutParams(layoutParams);
        OnCollapseListener onCollapseListener = this.f5225h;
        if (onCollapseListener != null) {
            onCollapseListener.onCollapse(((float) i) / ((float) getCollapsibleHeight()), i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final View m6521a(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof NestedScrollingChild) || (childAt instanceof ListView) || (childAt instanceof ScrollView) || (childAt instanceof WebView)) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final boolean mo6878a() {
        return getHeight() > this.f5222e && getHeight() != this.f5223f;
    }
}
