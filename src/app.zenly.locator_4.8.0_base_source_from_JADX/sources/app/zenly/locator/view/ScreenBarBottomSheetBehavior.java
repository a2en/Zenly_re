package app.zenly.locator.view;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0489d;
import androidx.core.view.C0657l;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C1076n;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import app.zenly.android.feature.polenta.graphics.drawable.SmoothRectDrawable;
import app.zenly.android.feature.polenta.widget.ScreenBar;
import app.zenly.android.feature.polenta.widget.ScreenBarLayout;
import app.zenly.android.feature.polenta.widget.ScreenBarLayout.OnCollapseListener;
import app.zenly.android.feature.polenta.widget.ScreenBarLayout.OnScreenBarLayoutReady;
import app.zenly.android.feature.polenta.widget.SearchBar;
import app.zenly.locator.R;
import com.android.volley.toolbox.C8733j;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior.C10744c;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import kotlin.jvm.internal.C12940r;
import kotlin.jvm.internal.C12941s;
import kotlin.jvm.internal.C12946x;
import kotlin.reflect.KProperty;
import p250f.p251a.p252a.p253a.p254d.C7657c;

public final class ScreenBarBottomSheetBehavior<V extends View> extends BottomSheetBehavior<V> {

    /* renamed from: a0 */
    static final /* synthetic */ KProperty[] f15475a0;

    /* renamed from: b0 */
    public static final C6163b f15476b0 = new C6163b(null);

    /* renamed from: A */
    private final Resources f15477A;

    /* renamed from: B */
    private final int f15478B = this.f15477A.getDimensionPixelSize(R.dimen.corner_radius_400);
    /* access modifiers changed from: private */

    /* renamed from: C */
    public final int f15479C = this.f15477A.getDimensionPixelSize(R.dimen.spacing_250);

    /* renamed from: D */
    private final int f15480D = this.f15477A.getDimensionPixelSize(R.dimen.spacing_200);

    /* renamed from: E */
    private final float f15481E;

    /* renamed from: F */
    private final Lazy f15482F;

    /* renamed from: G */
    private int f15483G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public ScreenBarLayout f15484H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public ScreenBar f15485I;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public SearchBar f15486J;

    /* renamed from: K */
    private View f15487K;

    /* renamed from: L */
    private RecyclerView f15488L;

    /* renamed from: M */
    private final ValueAnimator f15489M;

    /* renamed from: N */
    private Drawable f15490N;

    /* renamed from: O */
    private int f15491O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public C10744c f15492P;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public boolean f15493Q;

    /* renamed from: R */
    private boolean f15494R;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public boolean f15495S;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public boolean f15496T;

    /* renamed from: U */
    private int f15497U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public int f15498V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public final C6170i f15499W;

    /* renamed from: X */
    private float f15500X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public boolean f15501Y;

    /* renamed from: Z */
    private Rect f15502Z;

    /* renamed from: app.zenly.locator.view.ScreenBarBottomSheetBehavior$a */
    public static final class C6162a extends C10744c {

        /* renamed from: a */
        final /* synthetic */ ScreenBarBottomSheetBehavior f15503a;

        C6162a(ScreenBarBottomSheetBehavior screenBarBottomSheetBehavior) {
            this.f15503a = screenBarBottomSheetBehavior;
        }

        /* renamed from: a */
        public void mo7859a(View view, int i) {
            C12932j.m33818b(view, "bottomSheet");
            C10744c d = this.f15503a.f15492P;
            if (d != null) {
                d.mo7859a(view, i);
            }
            if (this.f15503a.mo30689c() == 4 && this.f15503a.f15498V > 0) {
                this.f15503a.mo30690c(3);
            }
            if (i == 5) {
                this.f15503a.m17069e(false);
            }
        }

        /* renamed from: a */
        public void mo7858a(View view, float f) {
            C12932j.m33818b(view, "bottomSheet");
            this.f15503a.m17045a(1.0f - C12973l.m33892c(C12973l.m33889b(f, 0.0f), 1.0f));
            C10744c d = this.f15503a.f15492P;
            if (d != null) {
                d.mo7858a(view, f);
            }
        }
    }

    /* renamed from: app.zenly.locator.view.ScreenBarBottomSheetBehavior$b */
    public static final class C6163b {
        private C6163b() {
        }

        /* renamed from: a */
        public static /* synthetic */ ScreenBarBottomSheetBehavior m17095a(C6163b bVar, ScreenBarLayout screenBarLayout, ScreenBar screenBar, SearchBar searchBar, View view, boolean z, int i, Object obj) {
            return bVar.mo14021a(screenBarLayout, (i & 2) != 0 ? null : screenBar, (i & 4) != 0 ? null : searchBar, view, (i & 16) != 0 ? false : z);
        }

        public /* synthetic */ C6163b(C12928f fVar) {
            this();
        }

        /* renamed from: a */
        public final <V extends View> ScreenBarBottomSheetBehavior<V> mo14021a(ScreenBarLayout screenBarLayout, ScreenBar screenBar, SearchBar searchBar, V v, boolean z) {
            C12932j.m33818b(screenBarLayout, "screenBarLayout");
            C12932j.m33818b(v, "content");
            LayoutParams layoutParams = v.getLayoutParams();
            String str = "Failed requirement.";
            if (!(layoutParams instanceof C0489d)) {
                throw new IllegalArgumentException(str.toString());
            } else if (!(v instanceof RecyclerView)) {
                Behavior d = ((C0489d) layoutParams).mo2901d();
                if (d != null) {
                    ScreenBarBottomSheetBehavior<V> screenBarBottomSheetBehavior = (ScreenBarBottomSheetBehavior) d;
                    screenBarBottomSheetBehavior.f15484H = screenBarLayout;
                    screenBarBottomSheetBehavior.f15485I = screenBar;
                    screenBarBottomSheetBehavior.m17047a(searchBar);
                    screenBarBottomSheetBehavior.m17063d((View) v);
                    screenBarBottomSheetBehavior.f15493Q = z;
                    screenBarBottomSheetBehavior.m17076g();
                    return screenBarBottomSheetBehavior;
                }
                throw new TypeCastException("null cannot be cast to non-null type app.zenly.locator.view.ScreenBarBottomSheetBehavior<V>");
            } else {
                throw new IllegalArgumentException(str.toString());
            }
        }
    }

    /* renamed from: app.zenly.locator.view.ScreenBarBottomSheetBehavior$c */
    public static final class C6164c implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ ScreenBarBottomSheetBehavior f15504a;

        public C6164c(ScreenBarBottomSheetBehavior screenBarBottomSheetBehavior) {
            this.f15504a = screenBarBottomSheetBehavior;
        }

        public void onAnimationCancel(Animator animator) {
            C12932j.m33818b(animator, "animator");
            this.f15504a.f15496T = false;
        }

        public void onAnimationEnd(Animator animator) {
            C12932j.m33818b(animator, "animator");
        }

        public void onAnimationRepeat(Animator animator) {
            C12932j.m33818b(animator, "animator");
        }

        public void onAnimationStart(Animator animator) {
            C12932j.m33818b(animator, "animator");
        }
    }

    /* renamed from: app.zenly.locator.view.ScreenBarBottomSheetBehavior$d */
    public static final class C6165d implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ ScreenBarBottomSheetBehavior f15505a;

        public C6165d(ScreenBarBottomSheetBehavior screenBarBottomSheetBehavior) {
            this.f15505a = screenBarBottomSheetBehavior;
        }

        public void onAnimationCancel(Animator animator) {
            C12932j.m33818b(animator, "animator");
        }

        public void onAnimationEnd(Animator animator) {
            C12932j.m33818b(animator, "animator");
            this.f15505a.f15496T = false;
        }

        public void onAnimationRepeat(Animator animator) {
            C12932j.m33818b(animator, "animator");
        }

        public void onAnimationStart(Animator animator) {
            C12932j.m33818b(animator, "animator");
        }
    }

    /* renamed from: app.zenly.locator.view.ScreenBarBottomSheetBehavior$e */
    static final class C6166e implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ ScreenBarBottomSheetBehavior f15506a;

        C6166e(ScreenBarBottomSheetBehavior screenBarBottomSheetBehavior) {
            this.f15506a = screenBarBottomSheetBehavior;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C12932j.m33815a((Object) valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                int intValue = ((Integer) animatedValue).intValue();
                ScreenBarBottomSheetBehavior screenBarBottomSheetBehavior = this.f15506a;
                screenBarBottomSheetBehavior.f15498V = C12973l.m33886a(intValue, 0, ScreenBarBottomSheetBehavior.m17075g(screenBarBottomSheetBehavior).getCollapsibleHeight());
                this.f15506a.m17081h(true);
                if (this.f15506a.f15498V == 0) {
                    ScreenBarBottomSheetBehavior.m17075g(this.f15506a).setTranslationZ(0.0f);
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    /* renamed from: app.zenly.locator.view.ScreenBarBottomSheetBehavior$f */
    public static final class C6167f implements OnCollapseListener {

        /* renamed from: a */
        final /* synthetic */ ScreenBarBottomSheetBehavior f15507a;

        C6167f(ScreenBarBottomSheetBehavior screenBarBottomSheetBehavior) {
            this.f15507a = screenBarBottomSheetBehavior;
        }

        public void onCollapse(float f, int i) {
            SearchBar h = this.f15507a.f15486J;
            if (h != null) {
                ScreenBar f2 = this.f15507a.f15485I;
                if (f2 == null) {
                    return;
                }
                if (this.f15507a.f15501Y) {
                    f2.setVisibility(8);
                    h.setTranslationY((float) this.f15507a.f15479C);
                    return;
                }
                f2.setVisibility(0);
                float f3 = (float) i;
                h.setAlpha(1.0f - (f3 / ((float) h.getHeight())));
                h.setTranslationY(-f3);
            }
        }
    }

    /* renamed from: app.zenly.locator.view.ScreenBarBottomSheetBehavior$g */
    static final class C6168g extends C12933k implements Function1<View, RecyclerView> {

        /* renamed from: f */
        final /* synthetic */ ScreenBarBottomSheetBehavior f15508f;

        C6168g(ScreenBarBottomSheetBehavior screenBarBottomSheetBehavior) {
            this.f15508f = screenBarBottomSheetBehavior;
            super(1);
        }

        /* renamed from: a */
        public final RecyclerView invoke(View view) {
            C12932j.m33818b(view, "it");
            return this.f15508f.m17060c(view);
        }
    }

    /* renamed from: app.zenly.locator.view.ScreenBarBottomSheetBehavior$h */
    public static final class C6169h implements OnScreenBarLayoutReady {

        /* renamed from: a */
        final /* synthetic */ RecyclerView f15509a;

        /* renamed from: b */
        final /* synthetic */ ScreenBarBottomSheetBehavior f15510b;

        C6169h(RecyclerView recyclerView, ScreenBarBottomSheetBehavior screenBarBottomSheetBehavior) {
            this.f15509a = recyclerView;
            this.f15510b = screenBarBottomSheetBehavior;
        }

        public void onReady() {
            this.f15510b.m17078g(true);
            this.f15509a.mo5047a((C1076n) this.f15510b.f15499W);
        }
    }

    /* renamed from: app.zenly.locator.view.ScreenBarBottomSheetBehavior$i */
    public static final class C6170i extends C1076n {

        /* renamed from: a */
        final /* synthetic */ ScreenBarBottomSheetBehavior f15511a;

        C6170i(ScreenBarBottomSheetBehavior screenBarBottomSheetBehavior) {
            this.f15511a = screenBarBottomSheetBehavior;
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            C12932j.m33818b(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            this.f15511a.f15495S = true;
            this.f15511a.m17071f();
            this.f15511a.m17084j();
        }
    }

    /* renamed from: app.zenly.locator.view.ScreenBarBottomSheetBehavior$j */
    static final class C6171j implements OnFocusChangeListener {

        /* renamed from: e */
        final /* synthetic */ ScreenBarBottomSheetBehavior f15512e;

        C6171j(ScreenBarBottomSheetBehavior screenBarBottomSheetBehavior) {
            this.f15512e = screenBarBottomSheetBehavior;
        }

        public final void onFocusChange(View view, boolean z) {
            this.f15512e.m17074f(z);
        }
    }

    /* renamed from: app.zenly.locator.view.ScreenBarBottomSheetBehavior$k */
    static final class C6172k implements Runnable {

        /* renamed from: e */
        final /* synthetic */ ScreenBarBottomSheetBehavior f15513e;

        /* renamed from: f */
        final /* synthetic */ int f15514f;

        C6172k(ScreenBarBottomSheetBehavior screenBarBottomSheetBehavior, int i) {
            this.f15513e = screenBarBottomSheetBehavior;
            this.f15514f = i;
        }

        public final void run() {
            this.f15513e.m17072f(-this.f15514f);
        }
    }

    /* renamed from: app.zenly.locator.view.ScreenBarBottomSheetBehavior$l */
    static final class C6173l extends C12933k implements Function0<VelocityTracker> {

        /* renamed from: f */
        public static final C6173l f15515f = new C6173l();

        C6173l() {
            super(0);
        }

        public final VelocityTracker invoke() {
            return VelocityTracker.obtain();
        }
    }

    static {
        C12941s sVar = new C12941s(C12946x.m33834a(ScreenBarBottomSheetBehavior.class), "velocityTracker", "getVelocityTracker()Landroid/view/VelocityTracker;");
        C12946x.m33839a((C12940r) sVar);
        f15475a0 = new KProperty[]{sVar};
    }

    public ScreenBarBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        C12932j.m33818b(context, "context");
        super(context, attributeSet);
        this.f15477A = context.getResources();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        C12932j.m33815a((Object) viewConfiguration, "ViewConfiguration.get(context)");
        this.f15481E = (float) viewConfiguration.getScaledMaximumFlingVelocity();
        this.f15482F = C12896f.m33751a(C6173l.f15515f);
        this.f15483G = -1;
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0});
        ofInt.setInterpolator(C7657c.m18649e());
        ofInt.setDuration(150);
        this.f15489M = ofInt;
        this.f15499W = new C6170i(this);
        this.f15500X = 1.0f;
        this.f15502Z = new Rect();
        super.mo14019a((C10744c) new C6162a(this));
    }

    /* renamed from: a */
    public static final <V extends View> ScreenBarBottomSheetBehavior<V> m17044a(ScreenBarLayout screenBarLayout, ScreenBar screenBar, SearchBar searchBar, V v, boolean z) {
        return f15476b0.mo14021a(screenBarLayout, screenBar, searchBar, v, z);
    }

    /* renamed from: g */
    public static final /* synthetic */ ScreenBarLayout m17075g(ScreenBarBottomSheetBehavior screenBarBottomSheetBehavior) {
        ScreenBarLayout screenBarLayout = screenBarBottomSheetBehavior.f15484H;
        if (screenBarLayout != null) {
            return screenBarLayout;
        }
        C12932j.m33820c("screenBarLayout");
        throw null;
    }

    /* renamed from: h */
    private final VelocityTracker m17079h() {
        Lazy lazy = this.f15482F;
        KProperty kProperty = f15475a0[0];
        return (VelocityTracker) lazy.getValue();
    }

    /* renamed from: l */
    private final void m17088l() {
        this.f15483G = -1;
        m17079h().clear();
    }

    /* renamed from: m */
    private final boolean m17089m() {
        return mo30693d() && (mo30688b() || (this.f15500X == 1.0f && m17082i() > this.f15481E * 0.05f));
    }

    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        C12932j.m33818b(coordinatorLayout, "parent");
        C12932j.m33818b(v, "child");
        if (this.f15488L == null) {
            RecyclerView c = m17060c((View) v);
            if (c != null) {
                ScreenBarLayout screenBarLayout = this.f15484H;
                if (screenBarLayout != null) {
                    screenBarLayout.setOnScreenBarLayoutReady(new C6169h(c, this));
                } else {
                    C12932j.m33820c("screenBarLayout");
                    throw null;
                }
            } else {
                c = null;
            }
            this.f15488L = c;
        }
        if (!this.f15493Q) {
            mo30686b((coordinatorLayout.getHeight() - this.f15478B) - this.f15502Z.top);
        }
        return super.onLayoutChild(coordinatorLayout, v, i);
    }

    public boolean onNestedFling(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2, boolean z) {
        C12932j.m33818b(coordinatorLayout, "coordinatorLayout");
        C12932j.m33818b(v, "child");
        C12932j.m33818b(view, "target");
        this.f15494R = true;
        return super.onNestedFling(coordinatorLayout, v, view, f, f2, z);
    }

    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        C12932j.m33818b(coordinatorLayout, "coordinatorLayout");
        C12932j.m33818b(v, "child");
        C12932j.m33818b(view, "target");
        C12932j.m33818b(iArr, "consumed");
        super.onNestedPreScroll(coordinatorLayout, v, view, i, i2, iArr, i3);
        this.f15497U = i2;
    }

    public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
        C12932j.m33818b(coordinatorLayout, "coordinatorLayout");
        C12932j.m33818b(v, "child");
        C12932j.m33818b(view, "target");
        if (this.f15500X == 1.0f && this.f15497U > 0) {
            mo30690c(4);
        } else if (this.f15497U >= 0 || !m17089m()) {
            super.onStopNestedScroll(coordinatorLayout, v, view, i);
            if (i == 0) {
                this.f15495S = false;
            } else if (i == 1) {
                this.f15494R = false;
                this.f15495S = false;
            }
            m17084j();
        } else {
            mo30690c(5);
        }
    }

    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        C12932j.m33818b(coordinatorLayout, "parent");
        C12932j.m33818b(v, "child");
        C12932j.m33818b(motionEvent, "event");
        m17046a(v, motionEvent, false);
        try {
            return super.onTouchEvent(coordinatorLayout, v, motionEvent);
        } catch (IllegalArgumentException unused) {
            motionEvent.setAction(3);
            return super.onTouchEvent(coordinatorLayout, v, motionEvent);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public final void m17081h(boolean z) {
        String str = "screenBarLayout";
        if (this.f15501Y) {
            ScreenBarLayout screenBarLayout = this.f15484H;
            if (screenBarLayout != null) {
                int collapsibleHeight = screenBarLayout.getCollapsibleHeight() - ((int) (((float) this.f15479C) * 1.5f));
                ScreenBarLayout screenBarLayout2 = this.f15484H;
                if (screenBarLayout2 != null) {
                    screenBarLayout2.mo6880b(collapsibleHeight);
                    if (z) {
                        ScreenBarLayout screenBarLayout3 = this.f15484H;
                        if (screenBarLayout3 != null) {
                            screenBarLayout3.post(new C6172k(this, collapsibleHeight));
                        } else {
                            C12932j.m33820c(str);
                            throw null;
                        }
                    }
                } else {
                    C12932j.m33820c(str);
                    throw null;
                }
            } else {
                C12932j.m33820c(str);
                throw null;
            }
        } else {
            ScreenBarLayout screenBarLayout4 = this.f15484H;
            if (screenBarLayout4 != null) {
                screenBarLayout4.mo6880b(this.f15498V);
                if (z) {
                    m17072f(-this.f15498V);
                    return;
                }
                return;
            }
            C12932j.m33820c(str);
            throw null;
        }
    }

    /* renamed from: i */
    private final float m17082i() {
        m17079h().computeCurrentVelocity(C8733j.DEFAULT_IMAGE_TIMEOUT_MS, this.f15481E);
        return m17079h().getYVelocity(this.f15483G);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public final void m17084j() {
        if (!this.f15496T && this.f15495S) {
            m17081h(false);
        } else if (!this.f15494R && !this.f15496T && !this.f15501Y) {
            ScreenBarLayout screenBarLayout = this.f15484H;
            if (screenBarLayout == null) {
                C12932j.m33820c("screenBarLayout");
                throw null;
            } else if (screenBarLayout.mo6878a()) {
                m17078g(true);
            }
        }
    }

    /* renamed from: k */
    private final void m17086k() {
        View view = this.f15487K;
        if (view != null) {
            int i = this.f15491O;
            if (i > 0) {
                float f = ((float) i) * this.f15500X;
                Drawable drawable = this.f15490N;
                if (drawable instanceof GradientDrawable) {
                    ((GradientDrawable) drawable).setCornerRadii(new float[]{f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f});
                    view.setBackground(drawable);
                } else if (drawable instanceof SmoothRectDrawable) {
                    ((SmoothRectDrawable) drawable).setCornerRadius(f);
                    view.setBackground(drawable);
                }
            }
            if (view instanceof ViewGroup) {
                float f2 = ((float) (this.f15502Z.top - this.f15480D)) * (1.0f - this.f15500X);
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    C12932j.m33815a((Object) childAt, "getChildAt(index)");
                    childAt.setTranslationY(f2);
                }
            }
            RecyclerView recyclerView = this.f15488L;
            if (recyclerView != null) {
                int i3 = this.f15502Z.bottom + this.f15480D;
                ScreenBarLayout screenBarLayout = this.f15484H;
                if (screenBarLayout != null) {
                    recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), i3 + screenBarLayout.getCollapsibleHeight());
                    return;
                }
                C12932j.m33820c("screenBarLayout");
                throw null;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final RecyclerView m17060c(View view) {
        Object obj;
        boolean z;
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        Iterator it = C12990j.m33930c(C0657l.m3059a((ViewGroup) view), new C6168g(this)).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((RecyclerView) obj) != null) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        return (RecyclerView) obj;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m17063d(View view) {
        if (!C12932j.m33817a((Object) this.f15487K, (Object) view)) {
            this.f15487K = view;
            View view2 = this.f15487K;
            if (view2 != null) {
                Drawable background = view2.getBackground();
                this.f15490N = background != null ? background.mutate() : null;
                this.f15491O = this.f15478B;
                view2.setClipToOutline(true);
            }
            m17086k();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final void m17074f(boolean z) {
        if (this.f15501Y != z) {
            this.f15501Y = z;
            m17078g(false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public final void m17076g() {
        ScreenBarLayout screenBarLayout = this.f15484H;
        if (screenBarLayout != null) {
            screenBarLayout.setOnCollapseListener(new C6167f(this));
        } else {
            C12932j.m33820c("screenBarLayout");
            throw null;
        }
    }

    /* renamed from: e */
    public final void mo14020e() {
        mo14019a((C10744c) null);
        RecyclerView recyclerView = this.f15488L;
        if (recyclerView != null) {
            recyclerView.mo5066b((C1076n) this.f15499W);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public final void m17078g(boolean z) {
        if (this.f15501Y || this.f15497U > 0) {
            m17065d(z);
        } else {
            m17069e(z);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final void m17069e(boolean z) {
        m17071f();
        if (z) {
            m17067e(0);
            return;
        }
        this.f15498V = 0;
        m17081h(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final void m17072f(int i) {
        RecyclerView recyclerView = this.f15488L;
        if (recyclerView != null) {
            String str = "screenBarLayout";
            if (this.f15501Y) {
                ScreenBarLayout screenBarLayout = this.f15484H;
                if (screenBarLayout != null) {
                    recyclerView.setPadding(recyclerView.getPaddingLeft(), screenBarLayout.getExpandedHeight() + i, recyclerView.getPaddingRight(), recyclerView.getPaddingBottom());
                } else {
                    C12932j.m33820c(str);
                    throw null;
                }
            } else {
                ScreenBarLayout screenBarLayout2 = this.f15484H;
                if (screenBarLayout2 != null) {
                    recyclerView.setPadding(recyclerView.getPaddingLeft(), screenBarLayout2.getExpandedHeight(), recyclerView.getPaddingRight(), recyclerView.getPaddingBottom());
                } else {
                    C12932j.m33820c(str);
                    throw null;
                }
            }
            LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (!(layoutManager instanceof LinearLayoutManager)) {
                layoutManager = null;
            }
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            if (linearLayoutManager != null) {
                if (this.f15501Y) {
                    ScreenBarLayout screenBarLayout3 = this.f15484H;
                    if (screenBarLayout3 != null) {
                        i = screenBarLayout3.getCollapsibleHeight();
                    } else {
                        C12932j.m33820c(str);
                        throw null;
                    }
                }
                linearLayoutManager.mo5004f(0, i);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m17047a(SearchBar searchBar) {
        if (!C12932j.m33817a((Object) this.f15486J, (Object) searchBar)) {
            this.f15486J = searchBar;
            SearchBar searchBar2 = this.f15486J;
            if (searchBar2 != null) {
                searchBar2.mo6899a((OnFocusChangeListener) new C6171j(this));
            }
        }
    }

    /* renamed from: e */
    private final void m17067e(int i) {
        this.f15496T = true;
        this.f15489M.setIntValues(new int[]{this.f15498V, i});
        this.f15489M.addUpdateListener(new C6166e(this));
        ValueAnimator valueAnimator = this.f15489M;
        String str = "scrollAnimator";
        C12932j.m33815a((Object) valueAnimator, str);
        valueAnimator.addListener(new C6165d(this));
        ValueAnimator valueAnimator2 = this.f15489M;
        C12932j.m33815a((Object) valueAnimator2, str);
        valueAnimator2.addListener(new C6164c(this));
        this.f15489M.start();
    }

    /* renamed from: d */
    private final void m17065d(boolean z) {
        m17071f();
        String str = "screenBarLayout";
        if (z) {
            ScreenBarLayout screenBarLayout = this.f15484H;
            if (screenBarLayout != null) {
                m17067e(screenBarLayout.getCollapsibleHeight());
            } else {
                C12932j.m33820c(str);
                throw null;
            }
        } else {
            ScreenBarLayout screenBarLayout2 = this.f15484H;
            if (screenBarLayout2 != null) {
                this.f15498V = screenBarLayout2.getCollapsibleHeight();
                m17081h(true);
                return;
            }
            C12932j.m33820c(str);
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m17045a(float f) {
        if (this.f15500X != f) {
            this.f15500X = f;
            m17086k();
        }
    }

    /* renamed from: a */
    public final void mo14018a(Rect rect) {
        C12932j.m33818b(rect, "value");
        if (!C12932j.m33817a((Object) this.f15502Z, (Object) rect)) {
            this.f15502Z = rect;
            m17086k();
        }
    }

    /* renamed from: a */
    private final void m17046a(V v, MotionEvent motionEvent, boolean z) {
        if (v.isShown()) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                m17088l();
                this.f15483G = motionEvent.getPointerId(motionEvent.getActionIndex());
            } else if (actionMasked == 1 || actionMasked == 3) {
                this.f15483G = -1;
            }
            if (z || !(motionEvent.getActionMasked() == 0 || mo30689c() == 1)) {
                m17079h().addMovement(motionEvent);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final void m17071f() {
        int i;
        RecyclerView recyclerView = this.f15488L;
        if (recyclerView != null) {
            LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (!(layoutManager instanceof LinearLayoutManager)) {
                layoutManager = null;
            }
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            View b = linearLayoutManager != null ? linearLayoutManager.mo4995b(0) : null;
            if (recyclerView != null) {
                String str = "screenBarLayout";
                if (recyclerView.getChildCount() <= 0) {
                    ScreenBarLayout screenBarLayout = this.f15484H;
                    if (screenBarLayout != null) {
                        i = screenBarLayout.getExpandedHeight();
                    } else {
                        C12932j.m33820c(str);
                        throw null;
                    }
                } else if (b != null) {
                    LayoutParams layoutParams = b.getLayoutParams();
                    if (!(layoutParams instanceof MarginLayoutParams)) {
                        layoutParams = null;
                    }
                    MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                    i = b.getTop() - (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
                } else {
                    i = 0;
                }
                ScreenBarLayout screenBarLayout2 = this.f15484H;
                if (screenBarLayout2 != null) {
                    int expandedHeight = screenBarLayout2.getExpandedHeight() - i;
                    ScreenBarLayout screenBarLayout3 = this.f15484H;
                    if (screenBarLayout3 != null) {
                        this.f15498V = C12973l.m33886a(expandedHeight, 0, screenBarLayout3.getCollapsibleHeight());
                    } else {
                        C12932j.m33820c(str);
                        throw null;
                    }
                } else {
                    C12932j.m33820c(str);
                    throw null;
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
            }
        }
    }

    /* renamed from: a */
    public void mo14019a(C10744c cVar) {
        this.f15492P = cVar;
    }
}
