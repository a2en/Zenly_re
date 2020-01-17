package app.zenly.locator.onboarding;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout.LayoutParams;
import app.zenly.android.base.view.C1309a;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.p143s.p149m.C5454c;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.fresco.animation.backend.AnimationBackend;
import com.facebook.fresco.animation.backend.C9628a;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import com.facebook.fresco.animation.drawable.AnimationListener;
import kotlin.C12956q;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import kotlin.jvm.internal.C12943u;
import p250f.p251a.p252a.p253a.p254d.C7657c;
import p387h.p388a.C12143a;

/* renamed from: app.zenly.locator.onboarding.r3 */
public final class C4891r3 extends BaseSignupController {

    /* renamed from: T */
    private View f12857T;

    /* renamed from: U */
    private C5454c f12858U;

    /* renamed from: V */
    private final Function0<C12956q> f12859V = new C4901i(this);
    /* access modifiers changed from: private */

    /* renamed from: W */
    public final C4892a f12860W = new C4892a(new C4894c(this), new C4895d(this));

    /* renamed from: app.zenly.locator.onboarding.r3$a */
    private static final class C4892a implements AnimationListener {

        /* renamed from: a */
        private final Function0<C12956q> f12861a;

        /* renamed from: b */
        private final Function0<C12956q> f12862b;

        public C4892a(Function0<C12956q> function0, Function0<C12956q> function02) {
            C12932j.m33818b(function0, "doOnStart");
            C12932j.m33818b(function02, "doOnStop");
            this.f12861a = function0;
            this.f12862b = function02;
        }

        /* renamed from: a */
        private final void m14229a() {
        }

        public void onAnimationFrame(AnimatedDrawable2 animatedDrawable2, int i) {
            m14229a();
        }

        public void onAnimationRepeat(AnimatedDrawable2 animatedDrawable2) {
            m14229a();
        }

        public void onAnimationReset(AnimatedDrawable2 animatedDrawable2) {
            m14229a();
        }

        public void onAnimationStart(AnimatedDrawable2 animatedDrawable2) {
            this.f12861a.invoke();
        }

        public void onAnimationStop(AnimatedDrawable2 animatedDrawable2) {
            this.f12862b.invoke();
        }
    }

    /* renamed from: app.zenly.locator.onboarding.r3$b */
    private static final class C4893b extends C9628a<AnimationBackend> {
        public C4893b(AnimationBackend animationBackend) {
            super(animationBackend);
        }

        public int getLoopCount() {
            return 1;
        }
    }

    /* renamed from: app.zenly.locator.onboarding.r3$c */
    static final class C4894c extends C12933k implements Function0<C12956q> {

        /* renamed from: f */
        final /* synthetic */ C4891r3 f12863f;

        C4894c(C4891r3 r3Var) {
            this.f12863f = r3Var;
            super(0);
        }

        public final void invoke() {
            AnimatorSet animatorSet = new AnimatorSet();
            ImageView imageView = (ImageView) C4891r3.m14220a(this.f12863f).findViewById(C3891l.first_frame);
            C12932j.m33815a((Object) imageView, "contentView.first_frame");
            imageView.setVisibility(4);
            animatorSet.setInterpolator(C7657c.m18641a());
            animatorSet.setStartDelay(500);
            animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat((TextView) C4891r3.m14220a(this.f12863f).findViewById(C3891l.message), C1309a.f4895a, new float[]{1.0f, 3.0f}), ObjectAnimator.ofFloat((TextView) C4891r3.m14220a(this.f12863f).findViewById(C3891l.message), View.ALPHA, new float[]{1.0f, 0.0f})});
            animatorSet.start();
        }
    }

    /* renamed from: app.zenly.locator.onboarding.r3$d */
    static final class C4895d extends C12933k implements Function0<C12956q> {

        /* renamed from: f */
        final /* synthetic */ C4891r3 f12864f;

        C4895d(C4891r3 r3Var) {
            this.f12864f = r3Var;
            super(0);
        }

        public final void invoke() {
            this.f12864f.mo11928b(0);
        }
    }

    /* renamed from: app.zenly.locator.onboarding.r3$e */
    static final class C4896e extends C12933k implements Function1<AnimatedDrawable2, C12956q> {

        /* renamed from: f */
        final /* synthetic */ C4891r3 f12865f;

        C4896e(C4891r3 r3Var) {
            this.f12865f = r3Var;
            super(1);
        }

        /* renamed from: a */
        public final void mo12107a(AnimatedDrawable2 animatedDrawable2) {
            C12932j.m33818b(animatedDrawable2, "it");
            animatedDrawable2.mo26122a((AnimationBackend) new C4893b(animatedDrawable2.mo26120a()));
            animatedDrawable2.mo26123a((AnimationListener) this.f12865f.f12860W);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo12107a((AnimatedDrawable2) obj);
            return C12956q.f33541a;
        }
    }

    /* renamed from: app.zenly.locator.onboarding.r3$f */
    public static final class C4897f implements Runnable {

        /* renamed from: e */
        final /* synthetic */ Function0 f12866e;

        public C4897f(Function0 function0) {
            this.f12866e = function0;
        }

        public final void run() {
            this.f12866e.invoke();
        }
    }

    /* renamed from: app.zenly.locator.onboarding.r3$g */
    static final class C4898g implements OnLayoutChangeListener {

        /* renamed from: e */
        final /* synthetic */ C4891r3 f12867e;

        /* renamed from: f */
        final /* synthetic */ LayoutParams f12868f;

        /* renamed from: g */
        final /* synthetic */ C12943u f12869g;

        /* renamed from: app.zenly.locator.onboarding.r3$g$a */
        static final class C4899a implements Runnable {

            /* renamed from: e */
            final /* synthetic */ C4898g f12870e;

            C4899a(C4898g gVar) {
                this.f12870e = gVar;
            }

            public final void run() {
                ((ImageView) C4891r3.m14220a(this.f12870e.f12867e).findViewById(C3891l.first_frame)).requestLayout();
            }
        }

        C4898g(C4891r3 r3Var, LayoutParams layoutParams, C12943u uVar) {
            this.f12867e = r3Var;
            this.f12868f = layoutParams;
            this.f12869g = uVar;
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int d = (this.f12867e.m14219E() - C4891r3.m14220a(this.f12867e).getHeight()) / 2;
            LayoutParams layoutParams = this.f12868f;
            if (d != layoutParams.topMargin) {
                layoutParams.topMargin = d;
                ((ImageView) C4891r3.m14220a(this.f12867e).findViewById(C3891l.first_frame)).post(new C4899a(this));
            }
            if (!this.f12869g.f33526e) {
                C4891r3 r3Var = this.f12867e;
                r3Var.m14225e(C4891r3.m14220a(r3Var));
            }
            this.f12869g.f33526e = true;
        }
    }

    /* renamed from: app.zenly.locator.onboarding.r3$h */
    public static final class C4900h implements Runnable {

        /* renamed from: e */
        final /* synthetic */ C4891r3 f12871e;

        public C4900h(C4891r3 r3Var) {
            this.f12871e = r3Var;
        }

        public final void run() {
            C4891r3.m14223c(this.f12871e).mo13042c();
        }
    }

    /* renamed from: app.zenly.locator.onboarding.r3$i */
    static final class C4901i extends C12933k implements Function0<C12956q> {

        /* renamed from: f */
        final /* synthetic */ C4891r3 f12872f;

        C4901i(C4891r3 r3Var) {
            this.f12872f = r3Var;
            super(0);
        }

        public final void invoke() {
            C12143a.m32030b("The outro animation doOnStop was never called.", new Object[0]);
            this.f12872f.mo11928b(0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public final int m14219E() {
        Object systemService = mo9304A().getSystemService("window");
        if (systemService != null) {
            WindowManager windowManager = (WindowManager) systemService;
            Point point = new Point();
            windowManager.getDefaultDisplay().getRealSize(point);
            return point.y;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.WindowManager");
    }

    /* renamed from: a */
    public static final /* synthetic */ View m14220a(C4891r3 r3Var) {
        View view = r3Var.f12857T;
        if (view != null) {
            return view;
        }
        C12932j.m33820c("contentView");
        throw null;
    }

    /* renamed from: c */
    public static final /* synthetic */ C5454c m14223c(C4891r3 r3Var) {
        C5454c cVar = r3Var.f12858U;
        if (cVar != null) {
            return cVar;
        }
        C12932j.m33820c("frescoPlayer");
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final void m14225e(View view) {
        view.postDelayed(new C4900h(this), 200);
    }

    /* renamed from: B */
    public int mo7192B() {
        return 60;
    }

    public boolean handleBack() {
        return true;
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        C12932j.m33818b(view, "view");
        C12932j.m33818b(rect, "insets");
        super.onWindowInsetsChanged(view, rect);
        view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [kotlin.jvm.functions.Function0<kotlin.q>, kotlin.jvm.functions.Function0] */
    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r2v0, types: [app.zenly.locator.onboarding.s3] */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo7066c(android.view.View r4) {
        /*
            r3 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.C12932j.m33818b(r4, r0)
            android.view.View r0 = r3.f12857T
            if (r0 == 0) goto L_0x001c
            kotlin.jvm.functions.Function0<kotlin.q> r1 = r3.f12859V
            if (r1 == 0) goto L_0x0013
            app.zenly.locator.onboarding.s3 r2 = new app.zenly.locator.onboarding.s3
            r2.<init>(r1)
            r1 = r2
        L_0x0013:
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r0.removeCallbacks(r1)
            super.mo7066c(r4)
            return
        L_0x001c:
            java.lang.String r4 = "contentView"
            kotlin.jvm.internal.C12932j.m33820c(r4)
            r4 = 0
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.onboarding.C4891r3.mo7066c(android.view.View):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C12932j.m33818b(layoutInflater, "inflater");
        C12932j.m33818b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.controller_success_signup, viewGroup, false);
        C12932j.m33815a((Object) inflate, "inflater.inflate(R.layou…signup, container, false)");
        this.f12857T = inflate;
        View view = this.f12857T;
        String str = "contentView";
        if (view != null) {
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) view.findViewById(C3891l.drawee);
            C12932j.m33815a((Object) simpleDraweeView, "contentView.drawee");
            C5454c cVar = new C5454c(simpleDraweeView, 2131951647);
            cVar.mo13040a((Function1<? super AnimatedDrawable2, C12956q>) new C4896e<Object,C12956q>(this));
            cVar.mo13041b();
            this.f12858U = cVar;
            View view2 = this.f12857T;
            if (view2 != null) {
                ImageView imageView = (ImageView) view2.findViewById(C3891l.first_frame);
                C12932j.m33815a((Object) imageView, "contentView.first_frame");
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                if (layoutParams != null) {
                    LayoutParams layoutParams2 = (LayoutParams) layoutParams;
                    C12943u uVar = new C12943u();
                    uVar.f33526e = false;
                    View view3 = this.f12857T;
                    if (view3 != null) {
                        view3.addOnLayoutChangeListener(new C4898g(this, layoutParams2, uVar));
                        View view4 = this.f12857T;
                        if (view4 != null) {
                            view4.postDelayed(new C4897f(this.f12859V), 5000);
                            View view5 = this.f12857T;
                            if (view5 != null) {
                                return view5;
                            }
                            C12932j.m33820c(str);
                            throw null;
                        }
                        C12932j.m33820c(str);
                        throw null;
                    }
                    C12932j.m33820c(str);
                    throw null;
                }
                throw new TypeCastException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            C12932j.m33820c(str);
            throw null;
        }
        C12932j.m33820c(str);
        throw null;
    }
}
