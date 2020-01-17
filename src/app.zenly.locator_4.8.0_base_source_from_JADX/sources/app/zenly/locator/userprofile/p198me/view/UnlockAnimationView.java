package app.zenly.locator.userprofile.p198me.view;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import app.zenly.android.base.view.C1311b;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.userprofile.p198me.p201i.C6099a;
import com.airbnb.lottie.C8506c;
import com.airbnb.lottie.LottieAnimationView;
import java.util.HashMap;
import java.util.List;
import kotlin.C12956q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import p250f.p251a.p252a.p253a.p254d.C7657c;
import p250f.p251a.p252a.p263b.p264a.p265d.C7697b;

/* renamed from: app.zenly.locator.userprofile.me.view.UnlockAnimationView */
public final class UnlockAnimationView extends FrameLayout {

    /* renamed from: e */
    private Function0<C12956q> f15434e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Function0<C12956q> f15435f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f15436g;

    /* renamed from: h */
    private HashMap f15437h;

    /* renamed from: app.zenly.locator.userprofile.me.view.UnlockAnimationView$a */
    public static final class C6146a {
        private C6146a() {
        }

        public /* synthetic */ C6146a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.userprofile.me.view.UnlockAnimationView$b */
    static final class C6147b extends C12933k implements Function0<C12956q> {

        /* renamed from: f */
        final /* synthetic */ UnlockAnimationView f15438f;

        /* renamed from: g */
        final /* synthetic */ Function0 f15439g;

        C6147b(UnlockAnimationView unlockAnimationView, Function0 function0) {
            this.f15438f = unlockAnimationView;
            this.f15439g = function0;
            super(0);
        }

        public final void invoke() {
            this.f15438f.m17009b();
            this.f15439g.invoke();
        }
    }

    /* renamed from: app.zenly.locator.userprofile.me.view.UnlockAnimationView$c */
    static final class C6148c extends C12933k implements Function0<C12956q> {

        /* renamed from: f */
        final /* synthetic */ UnlockAnimationView f15440f;

        /* renamed from: g */
        final /* synthetic */ Function0 f15441g;

        C6148c(UnlockAnimationView unlockAnimationView, Function0 function0) {
            this.f15440f = unlockAnimationView;
            this.f15441g = function0;
            super(0);
        }

        public final void invoke() {
            this.f15440f.m17009b();
            this.f15441g.invoke();
        }
    }

    /* renamed from: app.zenly.locator.userprofile.me.view.UnlockAnimationView$d */
    static final class C6149d extends C12933k implements Function0<C12956q> {

        /* renamed from: f */
        final /* synthetic */ UnlockAnimationView f15442f;

        /* renamed from: g */
        final /* synthetic */ LottieAnimationView f15443g;

        /* renamed from: h */
        final /* synthetic */ float f15444h;

        /* renamed from: app.zenly.locator.userprofile.me.view.UnlockAnimationView$d$a */
        static final class C6150a implements Runnable {

            /* renamed from: e */
            final /* synthetic */ C6149d f15445e;

            C6150a(C6149d dVar) {
                this.f15445e = dVar;
            }

            /* JADX WARNING: type inference failed for: r1v11 */
            /* JADX WARNING: type inference failed for: r2v0, types: [app.zenly.locator.userprofile.me.view.a] */
            /* JADX WARNING: Multi-variable type inference failed */
            /* JADX WARNING: Unknown variable types count: 1 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r3 = this;
                    app.zenly.locator.userprofile.me.view.UnlockAnimationView$d r0 = r3.f15445e
                    com.airbnb.lottie.LottieAnimationView r0 = r0.f15443g
                    android.view.ViewPropertyAnimator r0 = r0.animate()
                    app.zenly.locator.userprofile.me.view.UnlockAnimationView$d r1 = r3.f15445e
                    float r1 = r1.f15444h
                    r0.scaleX(r1)
                    app.zenly.locator.userprofile.me.view.UnlockAnimationView$d r1 = r3.f15445e
                    float r1 = r1.f15444h
                    r0.scaleY(r1)
                    r1 = 0
                    r0.alpha(r1)
                    r1 = 300(0x12c, double:1.48E-321)
                    r0.setDuration(r1)
                    r1 = 1075838976(0x40200000, float:2.5)
                    android.animation.TimeInterpolator r1 = p250f.p251a.p252a.p253a.p254d.C7657c.m18642a(r1)
                    r0.setInterpolator(r1)
                    app.zenly.locator.userprofile.me.view.UnlockAnimationView$d r1 = r3.f15445e
                    app.zenly.locator.userprofile.me.view.UnlockAnimationView r1 = r1.f15442f
                    kotlin.jvm.functions.Function0 r1 = r1.f15435f
                    if (r1 == 0) goto L_0x0038
                    app.zenly.locator.userprofile.me.view.a r2 = new app.zenly.locator.userprofile.me.view.a
                    r2.<init>(r1)
                    r1 = r2
                L_0x0038:
                    java.lang.Runnable r1 = (java.lang.Runnable) r1
                    r0.withEndAction(r1)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.userprofile.p198me.view.UnlockAnimationView.C6149d.C6150a.run():void");
            }
        }

        C6149d(UnlockAnimationView unlockAnimationView, LottieAnimationView lottieAnimationView, float f) {
            this.f15442f = unlockAnimationView;
            this.f15443g = lottieAnimationView;
            this.f15444h = f;
            super(0);
        }

        public final void invoke() {
            ViewPropertyAnimator animate = this.f15443g.animate();
            animate.scaleX(0.5f);
            animate.scaleY(0.5f);
            animate.setDuration(300);
            animate.setInterpolator(C7657c.m18650f());
            animate.withEndAction(new C6150a(this));
        }
    }

    /* renamed from: app.zenly.locator.userprofile.me.view.UnlockAnimationView$e */
    static final class C6151e extends C12933k implements Function1<C8506c, C12956q> {

        /* renamed from: f */
        final /* synthetic */ LottieAnimationView f15446f;

        C6151e(LottieAnimationView lottieAnimationView) {
            this.f15446f = lottieAnimationView;
            super(1);
        }

        /* renamed from: a */
        public final void mo14002a(C8506c cVar) {
            C12932j.m33818b(cVar, "it");
            this.f15446f.setComposition(cVar);
            this.f15446f.mo22807d();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo14002a((C8506c) obj);
            return C12956q.f33541a;
        }
    }

    /* renamed from: app.zenly.locator.userprofile.me.view.UnlockAnimationView$f */
    public static final class C6152f implements OnLayoutChangeListener {

        /* renamed from: e */
        final /* synthetic */ UnlockAnimationView f15447e;

        /* renamed from: f */
        final /* synthetic */ LottieAnimationView f15448f;

        public C6152f(UnlockAnimationView unlockAnimationView, LottieAnimationView lottieAnimationView) {
            this.f15447e = unlockAnimationView;
            this.f15448f = lottieAnimationView;
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            C12932j.m33818b(view, "view");
            view.removeOnLayoutChangeListener(this);
            int width = this.f15447e.getWidth();
            int height = this.f15447e.getHeight();
            int width2 = this.f15448f.getWidth();
            float f = (float) width2;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f15447e.mo13996a(C3891l.unlock_animation);
            String str = "unlock_animation";
            C12932j.m33815a((Object) lottieAnimationView, str);
            float width3 = f / ((float) lottieAnimationView.getWidth());
            Point point = new Point((width - width2) / 2, (height - width2) / 2);
            C1311b.m6281a(this.f15447e, point, this.f15448f);
            float max = ((float) Math.max(width, height)) / (f * 0.1f);
            this.f15447e.f15436g = true;
            this.f15448f.mo22797a();
            this.f15448f.setImageDrawable(null);
            View a = this.f15447e.mo13996a(C3891l.unlock_background);
            C12932j.m33815a((Object) a, "unlock_background");
            a.setAlpha(0.0f);
            C7697b.m18740c(this.f15447e.mo13996a(C3891l.unlock_background), 300, null, 2, null);
            UnlockAnimationView unlockAnimationView = this.f15447e;
            LottieAnimationView lottieAnimationView2 = (LottieAnimationView) unlockAnimationView.mo13996a(C3891l.unlock_animation);
            C12932j.m33815a((Object) lottieAnimationView2, str);
            unlockAnimationView.m17008a(lottieAnimationView2, point, width3, max);
        }
    }

    /* renamed from: app.zenly.locator.userprofile.me.view.UnlockAnimationView$g */
    public static final class C6153g extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ UnlockAnimationView f15449a;

        /* renamed from: b */
        final /* synthetic */ LottieAnimationView f15450b;

        /* renamed from: c */
        final /* synthetic */ Function0 f15451c;

        /* renamed from: d */
        final /* synthetic */ int f15452d;

        /* renamed from: e */
        final /* synthetic */ List f15453e;

        C6153g(UnlockAnimationView unlockAnimationView, LottieAnimationView lottieAnimationView, Function0 function0, int i, List list) {
            this.f15449a = unlockAnimationView;
            this.f15450b = lottieAnimationView;
            this.f15451c = function0;
            this.f15452d = i;
            this.f15453e = list;
        }

        public void onAnimationCancel(Animator animator) {
            C12932j.m33818b(animator, "animation");
            this.f15451c.invoke();
        }

        public void onAnimationEnd(Animator animator) {
            C12932j.m33818b(animator, "animation");
            if (this.f15452d < this.f15453e.size() - 1) {
                this.f15449a.m17007a(this.f15450b, this.f15452d + 1, this.f15453e, this.f15451c);
            } else {
                this.f15451c.invoke();
            }
        }
    }

    static {
        new C6146a(null);
    }

    public UnlockAnimationView(Context context) {
        this(context, null, 0, 6, null);
    }

    public UnlockAnimationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ UnlockAnimationView(Context context, AttributeSet attributeSet, int i, int i2, C12928f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* renamed from: a */
    public View mo13996a(int i) {
        if (this.f15437h == null) {
            this.f15437h = new HashMap();
        }
        View view = (View) this.f15437h.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f15437h.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public UnlockAnimationView(Context context, AttributeSet attributeSet, int i) {
        C12932j.m33818b(context, "context");
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.view_unlock_animation, this);
    }

    /* renamed from: b */
    public final void mo14000b(Function0<C12956q> function0) {
        C12932j.m33818b(function0, "actionEnd");
        this.f15435f = new C6148c(this, function0);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m17009b() {
        View a = mo13996a(C3891l.unlock_background);
        if (a != null) {
            a.setVisibility(8);
        }
        LottieAnimationView lottieAnimationView = (LottieAnimationView) mo13996a(C3891l.unlock_animation);
        if (lottieAnimationView != null) {
            lottieAnimationView.setVisibility(8);
        }
        LottieAnimationView lottieAnimationView2 = (LottieAnimationView) mo13996a(C3891l.unlock_animation);
        if (lottieAnimationView2 != null) {
            lottieAnimationView2.mo22809f();
        }
        LottieAnimationView lottieAnimationView3 = (LottieAnimationView) mo13996a(C3891l.unlock_animation);
        if (lottieAnimationView3 != null) {
            lottieAnimationView3.mo22808e();
        }
        LottieAnimationView lottieAnimationView4 = (LottieAnimationView) mo13996a(C3891l.unlock_animation);
        if (lottieAnimationView4 != null) {
            lottieAnimationView4.clearAnimation();
        }
        this.f15436g = false;
    }

    /* renamed from: a */
    public final void mo13997a(LottieAnimationView lottieAnimationView) {
        C12932j.m33818b(lottieAnimationView, "fromView");
        LottieAnimationView lottieAnimationView2 = (LottieAnimationView) mo13996a(C3891l.unlock_animation);
        String str = "unlock_animation";
        C12932j.m33815a((Object) lottieAnimationView2, str);
        lottieAnimationView2.setVisibility(0);
        if (!ViewCompat.m2804D(this) || isLayoutRequested()) {
            addOnLayoutChangeListener(new C6152f(this, lottieAnimationView));
            return;
        }
        int width = getWidth();
        int height = getHeight();
        int width2 = lottieAnimationView.getWidth();
        float f = (float) width2;
        LottieAnimationView lottieAnimationView3 = (LottieAnimationView) mo13996a(C3891l.unlock_animation);
        C12932j.m33815a((Object) lottieAnimationView3, str);
        float width3 = f / ((float) lottieAnimationView3.getWidth());
        Point point = new Point((width - width2) / 2, (height - width2) / 2);
        C1311b.m6281a(this, point, lottieAnimationView);
        float max = ((float) Math.max(width, height)) / (f * 0.1f);
        this.f15436g = true;
        lottieAnimationView.mo22797a();
        lottieAnimationView.setImageDrawable(null);
        View a = mo13996a(C3891l.unlock_background);
        C12932j.m33815a((Object) a, "unlock_background");
        a.setAlpha(0.0f);
        C7697b.m18740c(mo13996a(C3891l.unlock_background), 300, null, 2, null);
        LottieAnimationView lottieAnimationView4 = (LottieAnimationView) mo13996a(C3891l.unlock_animation);
        C12932j.m33815a((Object) lottieAnimationView4, str);
        m17008a(lottieAnimationView4, point, width3, max);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m17008a(LottieAnimationView lottieAnimationView, Point point, float f, float f2) {
        lottieAnimationView.setVisibility(0);
        lottieAnimationView.setScaleX(f);
        lottieAnimationView.setScaleY(f);
        lottieAnimationView.setAlpha(1.0f);
        lottieAnimationView.setTranslationX(-((float) point.x));
        lottieAnimationView.setTranslationY(-((float) point.y));
        ViewPropertyAnimator animate = lottieAnimationView.animate();
        animate.translationX(0.0f);
        animate.translationY(0.0f);
        animate.scaleX(1.0f);
        animate.scaleY(1.0f);
        animate.setDuration(300);
        animate.setInterpolator(C7657c.m18643b());
        C6151e eVar = new C6151e(lottieAnimationView);
        Context context = lottieAnimationView.getContext();
        String str = "context";
        C12932j.m33815a((Object) context, str);
        Context context2 = lottieAnimationView.getContext();
        C12932j.m33815a((Object) context2, str);
        C6099a[] aVarArr = {new C6099a(context, R.raw.lottie_unlocking, eVar), new C6099a(context2, R.raw.lottie_unlocked, eVar)};
        m17004a(this, lottieAnimationView, 0, C12848o.m33643b((Object[]) aVarArr), new C6149d(this, lottieAnimationView, f2), 1, null);
    }

    /* renamed from: a */
    static /* synthetic */ void m17004a(UnlockAnimationView unlockAnimationView, LottieAnimationView lottieAnimationView, int i, List list, Function0 function0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        unlockAnimationView.m17007a(lottieAnimationView, i, list, function0);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m17007a(LottieAnimationView lottieAnimationView, int i, List<C6099a> list, Function0<C12956q> function0) {
        ((C6099a) list.get(i)).mo13926a();
        lottieAnimationView.mo22808e();
        C6153g gVar = new C6153g(this, lottieAnimationView, function0, i, list);
        lottieAnimationView.mo22798a((AnimatorListener) gVar);
    }

    /* renamed from: a */
    public final void mo13998a(Function0<C12956q> function0) {
        C12932j.m33818b(function0, "actionCancelled");
        this.f15434e = new C6147b(this, function0);
    }

    /* renamed from: a */
    public final boolean mo13999a() {
        if (!this.f15436g) {
            return false;
        }
        Function0<C12956q> function0 = this.f15434e;
        if (function0 != null) {
            C12956q qVar = (C12956q) function0.invoke();
        }
        return true;
    }
}
