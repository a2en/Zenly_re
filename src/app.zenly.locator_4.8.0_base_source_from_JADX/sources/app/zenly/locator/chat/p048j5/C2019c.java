package app.zenly.locator.chat.p048j5;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup;
import app.zenly.android.base.view.C1309a;
import app.zenly.locator.R;
import app.zenly.locator.chat.view.ErasableView;
import app.zenly.locator.core.p072ui.controller.ZenlyController;
import app.zenly.locator.p143s.p156s.C5509a;
import com.bluelinelabs.conductor.C8819d;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p253a.p254d.C7657c;
import p389io.reactivex.C12273d;
import p389io.reactivex.C12279e;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.functions.Function;
import p389io.reactivex.functions.Predicate;
import p389io.reactivex.p390h.p392c.C12295a;
import p389io.reactivex.p405m.C12773a;
import p389io.reactivex.schedulers.C12802a;

/* renamed from: app.zenly.locator.chat.j5.c */
public final class C2019c extends ZenlyController {

    /* renamed from: P */
    private View f6432P;

    /* renamed from: Q */
    private View f6433Q;

    /* renamed from: R */
    private ErasableView f6434R;

    /* renamed from: S */
    private final AnimatorSet f6435S = new AnimatorSet();

    /* renamed from: T */
    private final C12275b f6436T = new C12275b();

    /* renamed from: U */
    private final OnLayoutChangeListener f6437U = new C2024e(this);

    /* renamed from: app.zenly.locator.chat.j5.c$a */
    public static final class C2020a {
        private C2020a() {
        }

        public /* synthetic */ C2020a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.chat.j5.c$b */
    static final class C2021b<T, R> implements Function<T, R> {

        /* renamed from: e */
        final /* synthetic */ C2019c f6438e;

        C2021b(C2019c cVar) {
            this.f6438e = cVar;
        }

        /* renamed from: a */
        public final float mo7826a(Long l) {
            C12932j.m33818b(l, "it");
            return C2019c.m7739b(this.f6438e).getDiscovery();
        }

        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            return Float.valueOf(mo7826a((Long) obj));
        }
    }

    /* renamed from: app.zenly.locator.chat.j5.c$c */
    static final class C2022c<T> implements Predicate<Float> {

        /* renamed from: e */
        public static final C2022c f6439e = new C2022c();

        C2022c() {
        }

        /* renamed from: a */
        public final boolean test(Float f) {
            C12932j.m33818b(f, "discovery");
            return f.floatValue() > 0.7f;
        }
    }

    /* renamed from: app.zenly.locator.chat.j5.c$d */
    static final class C2023d<T> implements Consumer<Float> {

        /* renamed from: e */
        final /* synthetic */ C2019c f6440e;

        C2023d(C2019c cVar) {
            this.f6440e = cVar;
        }

        /* renamed from: a */
        public final void accept(Float f) {
            this.f6440e.mo23946k().mo23997a((C8819d) this.f6440e);
        }
    }

    /* renamed from: app.zenly.locator.chat.j5.c$e */
    static final class C2024e implements OnLayoutChangeListener {

        /* renamed from: e */
        final /* synthetic */ C2019c f6441e;

        C2024e(C2019c cVar) {
            this.f6441e = cVar;
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.f6441e.m7737D();
        }
    }

    /* renamed from: app.zenly.locator.chat.j5.c$f */
    public static final class C2025f implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ C2019c f6442a;

        public C2025f(C2019c cVar) {
            this.f6442a = cVar;
        }

        public void onAnimationCancel(Animator animator) {
            C12932j.m33818b(animator, "animator");
        }

        public void onAnimationEnd(Animator animator) {
            C12932j.m33818b(animator, "animator");
        }

        public void onAnimationRepeat(Animator animator) {
            C12932j.m33818b(animator, "animator");
        }

        public void onAnimationStart(Animator animator) {
            C12932j.m33818b(animator, "animator");
            C2019c.m7740c(this.f6442a).setVisibility(0);
        }
    }

    /* renamed from: app.zenly.locator.chat.j5.c$g */
    public static final class C2026g implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ C2019c f6443a;

        public C2026g(C2019c cVar, ObjectAnimator objectAnimator, ObjectAnimator objectAnimator2) {
            this.f6443a = cVar;
        }

        public void onAnimationCancel(Animator animator) {
            C12932j.m33818b(animator, "animator");
        }

        public void onAnimationEnd(Animator animator) {
            C12932j.m33818b(animator, "animator");
            this.f6443a.m7736C();
        }

        public void onAnimationRepeat(Animator animator) {
            C12932j.m33818b(animator, "animator");
        }

        public void onAnimationStart(Animator animator) {
            C12932j.m33818b(animator, "animator");
        }
    }

    static {
        new C2020a(null);
    }

    /* renamed from: B */
    private final C12273d<Float> m7735B() {
        return C12279e.m32599a(1000, 500, TimeUnit.MILLISECONDS).mo36501i(new C2021b(this)).mo36459b((Predicate<? super T>) C2022c.f6439e).mo36486e();
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public final void m7736C() {
        ErasableView erasableView = this.f6434R;
        if (erasableView != null) {
            erasableView.setErasable(true);
            Disposable c = m7735B().mo36392b(C12802a.m33490a()).mo36378a(C12295a.m32802a()).mo36398c((Consumer<? super T>) new C2023d<Object>(this));
            C12932j.m33815a((Object) c, "createDiscoveryObservabl…ter.popController(this) }");
            C12773a.m33432a(c, this.f6436T);
            return;
        }
        C12932j.m33820c("erasableView");
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public final void m7737D() {
        View m = mo23948m();
        if (m != null) {
            C12932j.m33815a((Object) m, "view ?: throw IllegalStateException()");
            m.removeOnLayoutChangeListener(this.f6437U);
            float height = (float) m.getHeight();
            View view = this.f6432P;
            String str = "backgroundView";
            if (view != null) {
                float f = -height;
                view.setTranslationY(f);
                View view2 = this.f6433Q;
                String str2 = "poopView";
                if (view2 != null) {
                    view2.setVisibility(4);
                    View view3 = this.f6433Q;
                    if (view3 != null) {
                        view3.setScaleX(0.1f);
                        View view4 = this.f6433Q;
                        if (view4 != null) {
                            view4.setScaleY(0.1f);
                            View view5 = this.f6432P;
                            if (view5 != null) {
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view5, View.TRANSLATION_Y, new float[]{f, 0.0f});
                                ofFloat.setDuration(1000);
                                ofFloat.setInterpolator(C7657c.m18644b(1.5f));
                                View view6 = this.f6433Q;
                                if (view6 != null) {
                                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view6, C1309a.f4895a, new float[]{0.1f, 1.0f});
                                    ofFloat2.setDuration(500);
                                    ofFloat2.setInterpolator(C7657c.m18650f());
                                    ofFloat2.addListener(new C2025f(this));
                                    AnimatorSet animatorSet = this.f6435S;
                                    animatorSet.playSequentially(new Animator[]{ofFloat, ofFloat2});
                                    animatorSet.addListener(new C2026g(this, ofFloat, ofFloat2));
                                    animatorSet.start();
                                    Activity A = mo9304A();
                                    C12932j.m33815a((Object) A, "requireActivity()");
                                    C5509a.m15628b((Context) A, (int) R.raw.sound_easter_egg_rainbow_poop);
                                    return;
                                }
                                C12932j.m33820c(str2);
                                throw null;
                            }
                            C12932j.m33820c(str);
                            throw null;
                        }
                        C12932j.m33820c(str2);
                        throw null;
                    }
                    C12932j.m33820c(str2);
                    throw null;
                }
                C12932j.m33820c(str2);
                throw null;
            }
            C12932j.m33820c(str);
            throw null;
        }
        throw new IllegalStateException();
    }

    /* renamed from: b */
    public static final /* synthetic */ ErasableView m7739b(C2019c cVar) {
        ErasableView erasableView = cVar.f6434R;
        if (erasableView != null) {
            return erasableView;
        }
        C12932j.m33820c("erasableView");
        throw null;
    }

    /* renamed from: c */
    public static final /* synthetic */ View m7740c(C2019c cVar) {
        View view = cVar.f6433Q;
        if (view != null) {
            return view;
        }
        C12932j.m33820c("poopView");
        throw null;
    }

    /* renamed from: w */
    public boolean mo7339w() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C12932j.m33818b(layoutInflater, "inflater");
        C12932j.m33818b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.fragment_chat_easteregg_poop, viewGroup, false);
        inflate.addOnLayoutChangeListener(this.f6437U);
        View findViewById = inflate.findViewById(R.id.background_view);
        C12932j.m33815a((Object) findViewById, "findViewById(R.id.background_view)");
        this.f6432P = findViewById;
        View findViewById2 = inflate.findViewById(R.id.poop_view);
        C12932j.m33815a((Object) findViewById2, "findViewById(R.id.poop_view)");
        this.f6433Q = findViewById2;
        View findViewById3 = inflate.findViewById(R.id.erasable_view);
        C12932j.m33815a((Object) findViewById3, "findViewById(R.id.erasable_view)");
        this.f6434R = (ErasableView) findViewById3;
        C12932j.m33815a((Object) inflate, "inflater.inflate(R.layou….erasable_view)\n        }");
        return inflate;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7052b(View view) {
        C12932j.m33818b(view, "view");
        super.mo7052b(view);
        if (this.f6435S.isPaused()) {
            this.f6435S.resume();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo7066c(View view) {
        C12932j.m33818b(view, "view");
        this.f6436T.mo36401a();
        super.mo7066c(view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo7053d(View view) {
        C12932j.m33818b(view, "view");
        if (this.f6435S.isRunning()) {
            this.f6435S.pause();
        }
        super.mo7053d(view);
    }
}
