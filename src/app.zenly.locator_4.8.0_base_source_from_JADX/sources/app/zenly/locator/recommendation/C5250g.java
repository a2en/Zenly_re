package app.zenly.locator.recommendation;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.transition.Transition;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.Window;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.dynamicanimation.animation.C0727c;
import androidx.dynamicanimation.animation.C0730f;
import androidx.dynamicanimation.animation.C0731g;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationEndListener;
import androidx.fragment.app.FragmentActivity;
import app.zenly.android.feature.base.app.C1321b;
import app.zenly.android.feature.base.model.AvatarLoader;
import app.zenly.android.feature.base.model.AvatarLoader.Request;
import app.zenly.android.feature.base.scheduling.C1351e;
import app.zenly.android.feature.base.scheduling.ZenlySchedulers;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.core.glide.C2477e;
import app.zenly.locator.core.models.C2884f;
import app.zenly.locator.core.p072ui.view.AnimatedTextView;
import app.zenly.locator.core.util.C3200e0;
import app.zenly.locator.p143s.p148l.C5448c;
import java.util.HashMap;
import kotlin.C12956q;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import kotlin.jvm.internal.C12934l;
import kotlin.jvm.internal.C12935m;
import kotlin.jvm.internal.C12946x;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import p213co.znly.core.ZenlyCore;
import p213co.znly.models.UserProto$User;
import p250f.p251a.p252a.p253a.p255e.C7662d;
import p250f.p251a.p252a.p253a.p262j.C7692a;
import p389io.reactivex.C12286f;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.p405m.C12773a;

/* renamed from: app.zenly.locator.recommendation.g */
public final class C5250g extends C1321b {

    /* renamed from: r */
    static final /* synthetic */ KProperty[] f13536r;

    /* renamed from: s */
    public static final C5251a f13537s = new C5251a(null);

    /* renamed from: f */
    private final ReadWriteProperty f13538f = C7662d.m18671c();

    /* renamed from: g */
    private final ReadWriteProperty f13539g = C7662d.m18671c();

    /* renamed from: h */
    private final C12275b f13540h = new C12275b();

    /* renamed from: i */
    private final ZenlySchedulers f13541i = C1351e.m6372a(C5249f.f13535b.mo19916a("intro"));
    /* access modifiers changed from: private */

    /* renamed from: j */
    public UserProto$User f13542j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public ValueAnimator f13543k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C0730f f13544l;

    /* renamed from: m */
    private final ZenlyCore f13545m = C5448c.m15478a();

    /* renamed from: n */
    private AvatarLoader f13546n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final OnAnimationEndListener f13547o = new C5257e(this);

    /* renamed from: p */
    private final C5260f f13548p = new C5260f(this);

    /* renamed from: q */
    private HashMap f13549q;

    /* renamed from: app.zenly.locator.recommendation.g$a */
    public static final class C5251a {
        private C5251a() {
        }

        /* renamed from: a */
        public final C5250g mo12602a(String str, String str2) {
            C12932j.m33818b(str, "newComerUuid");
            C12932j.m33818b(str2, "newComerName");
            C5250g gVar = new C5250g();
            gVar.mo12600b(str);
            gVar.mo12599a(str2);
            return gVar;
        }

        public /* synthetic */ C5251a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.recommendation.g$b */
    static final class C5252b<T> implements Consumer<UserProto$User> {

        /* renamed from: e */
        final /* synthetic */ C5250g f13550e;

        C5252b(C5250g gVar) {
            this.f13550e = gVar;
        }

        /* renamed from: a */
        public final void accept(UserProto$User userProto$User) {
            C5250g gVar = this.f13550e;
            C12932j.m33815a((Object) userProto$User, "user");
            gVar.f13542j = userProto$User;
            Request load = C5250g.m14907a(this.f13550e).load(C2884f.m9355a(userProto$User));
            ImageView imageView = (ImageView) this.f13550e.mo12598a(C3891l.avatar);
            C12932j.m33815a((Object) imageView, "avatar");
            load.into(imageView);
        }
    }

    /* renamed from: app.zenly.locator.recommendation.g$c */
    static final class C5253c extends C12933k implements Function0<C12956q> {

        /* renamed from: f */
        final /* synthetic */ C5250g f13551f;

        /* renamed from: g */
        final /* synthetic */ FragmentActivity f13552g;

        /* renamed from: app.zenly.locator.recommendation.g$c$a */
        static final class C5254a implements Runnable {

            /* renamed from: e */
            final /* synthetic */ C5253c f13553e;

            /* renamed from: app.zenly.locator.recommendation.g$c$a$a */
            static final class C5255a implements Runnable {

                /* renamed from: e */
                final /* synthetic */ C5254a f13554e;

                C5255a(C5254a aVar) {
                    this.f13554e = aVar;
                }

                public final void run() {
                    if (this.f13554e.f13553e.f13551f.isAdded() && !this.f13554e.f13553e.f13551f.isStateSaved()) {
                        FragmentActivity fragmentActivity = this.f13554e.f13553e.f13552g;
                        if (fragmentActivity != null) {
                            ((RecommendationActivity) fragmentActivity).mo12541f();
                            return;
                        }
                        throw new TypeCastException("null cannot be cast to non-null type app.zenly.locator.recommendation.RecommendationActivity");
                    }
                }
            }

            C5254a(C5253c cVar) {
                this.f13553e = cVar;
            }

            public final void run() {
                if (this.f13553e.f13551f.isAdded()) {
                    ((AnimatedTextView) this.f13553e.f13551f.mo12598a(C3891l.animated_text)).animate().translationYBy(-((float) C3200e0.m10183a(this.f13553e.f13551f.requireContext(), 180))).alpha(0.0f).withEndAction(new C5255a(this)).start();
                }
            }
        }

        C5253c(C5250g gVar, FragmentActivity fragmentActivity) {
            this.f13551f = gVar;
            this.f13552g = fragmentActivity;
            super(0);
        }

        public final void invoke() {
            ((AnimatedTextView) this.f13551f.mo12598a(C3891l.animated_text)).postDelayed(new C5254a(this), 1000);
        }
    }

    /* renamed from: app.zenly.locator.recommendation.g$d */
    public static final class C5256d implements OnGlobalLayoutListener {

        /* renamed from: e */
        final /* synthetic */ View f13555e;

        /* renamed from: f */
        final /* synthetic */ FragmentActivity f13556f;

        C5256d(View view, FragmentActivity fragmentActivity) {
            this.f13555e = view;
            this.f13556f = fragmentActivity;
        }

        public void onGlobalLayout() {
            ViewTreeObserver viewTreeObserver = this.f13555e.getViewTreeObserver();
            C12932j.m33815a((Object) viewTreeObserver, "view.viewTreeObserver");
            if (viewTreeObserver.isAlive()) {
                this.f13555e.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                this.f13556f.startPostponedEnterTransition();
            }
        }
    }

    /* renamed from: app.zenly.locator.recommendation.g$e */
    static final class C5257e implements OnAnimationEndListener {

        /* renamed from: a */
        final /* synthetic */ C5250g f13557a;

        /* renamed from: app.zenly.locator.recommendation.g$e$a */
        static final class C5258a implements AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ C5257e f13558a;

            C5258a(C5257e eVar) {
                this.f13558a = eVar;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C12932j.m33815a((Object) valueAnimator, "it");
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    float floatValue = ((Float) animatedValue).floatValue();
                    ImageView imageView = (ImageView) this.f13558a.f13557a.mo12598a(C3891l.avatar);
                    String str = "avatar";
                    C12932j.m33815a((Object) imageView, str);
                    imageView.setTranslationY(floatValue);
                    ImageView imageView2 = (ImageView) this.f13558a.f13557a.mo12598a(C3891l.emoji);
                    String str2 = "emoji";
                    C12932j.m33815a((Object) imageView2, str2);
                    imageView2.setTranslationY(floatValue);
                    float animatedFraction = 1.0f - valueAnimator.getAnimatedFraction();
                    ImageView imageView3 = (ImageView) this.f13558a.f13557a.mo12598a(C3891l.avatar);
                    C12932j.m33815a((Object) imageView3, str);
                    imageView3.setAlpha(animatedFraction);
                    ImageView imageView4 = (ImageView) this.f13558a.f13557a.mo12598a(C3891l.emoji);
                    C12932j.m33815a((Object) imageView4, str2);
                    imageView4.setAlpha(animatedFraction);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
            }
        }

        /* renamed from: app.zenly.locator.recommendation.g$e$b */
        public static final class C5259b implements AnimatorListener {

            /* renamed from: a */
            final /* synthetic */ C5257e f13559a;

            public C5259b(C5257e eVar) {
                this.f13559a = eVar;
            }

            public void onAnimationCancel(Animator animator) {
                C12932j.m33818b(animator, "animator");
            }

            public void onAnimationEnd(Animator animator) {
                C12932j.m33818b(animator, "animator");
                if (this.f13559a.f13557a.isAdded()) {
                    AnimatedTextView animatedTextView = (AnimatedTextView) this.f13559a.f13557a.mo12598a(C3891l.animated_text);
                    C5250g gVar = this.f13559a.f13557a;
                    String string = gVar.getString(R.string.recommendation_matchmaker_title, gVar.mo6614b());
                    C12932j.m33815a((Object) string, "getString(R.string.recom…aker_title, newComerName)");
                    animatedTextView.setText(string);
                }
            }

            public void onAnimationRepeat(Animator animator) {
                C12932j.m33818b(animator, "animator");
            }

            public void onAnimationStart(Animator animator) {
                C12932j.m33818b(animator, "animator");
            }
        }

        C5257e(C5250g gVar) {
            this.f13557a = gVar;
        }

        public final void onAnimationEnd(DynamicAnimation<DynamicAnimation<?>> dynamicAnimation, boolean z, float f, float f2) {
            if (this.f13557a.isAdded()) {
                float f3 = -((float) C3200e0.m10183a(this.f13557a.requireContext(), 180));
                C5250g gVar = this.f13557a;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, f3});
                ofFloat.addUpdateListener(new C5258a(this));
                ofFloat.addListener(new C5259b(this));
                ofFloat.start();
                gVar.f13543k = ofFloat;
            }
        }
    }

    /* renamed from: app.zenly.locator.recommendation.g$f */
    public static final class C5260f extends C7692a {

        /* renamed from: a */
        final /* synthetic */ C5250g f13560a;

        /* renamed from: app.zenly.locator.recommendation.g$f$a */
        static final class C5261a implements AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ C5260f f13561a;

            C5261a(C5260f fVar) {
                this.f13561a = fVar;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C12932j.m33815a((Object) valueAnimator, "it");
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    float floatValue = ((Float) animatedValue).floatValue();
                    ImageView imageView = (ImageView) this.f13561a.f13560a.mo12598a(C3891l.emoji);
                    String str = "emoji";
                    C12932j.m33815a((Object) imageView, str);
                    imageView.setAlpha(floatValue);
                    float f = (float) 1;
                    float f2 = f + ((f - floatValue) * 30.0f);
                    ImageView imageView2 = (ImageView) this.f13561a.f13560a.mo12598a(C3891l.emoji);
                    C12932j.m33815a((Object) imageView2, str);
                    imageView2.setScaleX(f2);
                    ImageView imageView3 = (ImageView) this.f13561a.f13560a.mo12598a(C3891l.emoji);
                    C12932j.m33815a((Object) imageView3, str);
                    imageView3.setScaleY(f2);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
            }
        }

        /* renamed from: app.zenly.locator.recommendation.g$f$b */
        public static final class C5262b implements AnimatorListener {

            /* renamed from: a */
            final /* synthetic */ C5260f f13562a;

            public C5262b(C5260f fVar) {
                this.f13562a = fVar;
            }

            public void onAnimationCancel(Animator animator) {
                C12932j.m33818b(animator, "animator");
            }

            public void onAnimationEnd(Animator animator) {
                C12932j.m33818b(animator, "animator");
                if (this.f13562a.f13560a.isAdded()) {
                    C0731g gVar = new C0731g();
                    gVar.mo3684c(1500.0f);
                    gVar.mo3680a(0.5f);
                    C5250g gVar2 = this.f13562a.f13560a;
                    C0730f fVar = new C0730f((ImageView) gVar2.mo12598a(C3891l.emoji), (C0727c<K>) DynamicAnimation.f2983p);
                    fVar.mo3672a(gVar);
                    fVar.mo3620c(0.002f);
                    C0730f fVar2 = fVar;
                    fVar2.mo3624e(30.0f);
                    C0730f fVar3 = fVar2;
                    fVar3.mo3612a(30.0f);
                    C0730f fVar4 = fVar3;
                    fVar4.mo3618b(-30.0f);
                    C0730f fVar5 = fVar4;
                    fVar5.mo3613a(this.f13562a.f13560a.f13547o);
                    gVar2.f13544l = fVar5;
                    C0730f b = this.f13562a.f13560a.f13544l;
                    if (b != null) {
                        b.mo3677g(0.0f);
                    }
                }
            }

            public void onAnimationRepeat(Animator animator) {
                C12932j.m33818b(animator, "animator");
            }

            public void onAnimationStart(Animator animator) {
                C12932j.m33818b(animator, "animator");
            }
        }

        C5260f(C5250g gVar) {
            this.f13560a = gVar;
        }

        public void onTransitionEnd(Transition transition) {
            C12932j.m33818b(transition, "transition");
            C5250g gVar = this.f13560a;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            ofFloat.addUpdateListener(new C5261a(this));
            ofFloat.addListener(new C5262b(this));
            ofFloat.start();
            gVar.f13543k = ofFloat;
        }
    }

    static {
        C12935m mVar = new C12935m(C12946x.m33834a(C5250g.class), "newComerUuid", "getNewComerUuid()Ljava/lang/String;");
        C12946x.m33837a((C12934l) mVar);
        C12935m mVar2 = new C12935m(C12946x.m33834a(C5250g.class), "newComerName", "getNewComerName()Ljava/lang/String;");
        C12946x.m33837a((C12934l) mVar2);
        f13536r = new KProperty[]{mVar, mVar2};
    }

    /* renamed from: a */
    public static final /* synthetic */ AvatarLoader m14907a(C5250g gVar) {
        AvatarLoader avatarLoader = gVar.f13546n;
        if (avatarLoader != null) {
            return avatarLoader;
        }
        C12932j.m33820c("avatarLoader");
        throw null;
    }

    /* renamed from: a */
    public View mo12598a(int i) {
        if (this.f13549q == null) {
            this.f13549q = new HashMap();
        }
        View view = (View) this.f13549q.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f13549q.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    public void mo6508a() {
        HashMap hashMap = this.f13549q;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: a */
    public final void mo12599a(String str) {
        C12932j.m33818b(str, "<set-?>");
        this.f13539g.setValue(this, f13536r[1], str);
    }

    /* renamed from: b */
    public final String mo6614b() {
        return (String) this.f13539g.getValue(this, f13536r[1]);
    }

    /* renamed from: b */
    public final void mo12600b(String str) {
        C12932j.m33818b(str, "<set-?>");
        this.f13538f.setValue(this, f13536r[0], str);
    }

    /* renamed from: c */
    public final String mo12601c() {
        return (String) this.f13538f.getValue(this, f13536r[0]);
    }

    public void onAttach(Context context) {
        C12932j.m33818b(context, "context");
        super.onAttach(context);
        this.f13546n = new C2477e(context);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C12932j.m33818b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_recommendation_introduction, viewGroup, false);
    }

    public void onDestroyView() {
        C0730f fVar = this.f13544l;
        if (fVar != null) {
            fVar.mo3615a();
        }
        ValueAnimator valueAnimator = this.f13543k;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f13540h.mo36401a();
        ((AnimatedTextView) mo12598a(C3891l.animated_text)).setCallback(null);
        FragmentActivity requireActivity = requireActivity();
        C12932j.m33815a((Object) requireActivity, "requireActivity()");
        Window window = requireActivity.getWindow();
        C12932j.m33815a((Object) window, "requireActivity().window");
        window.getSharedElementEnterTransition().removeListener(this.f13548p);
        super.onDestroyView();
        mo6508a();
    }

    public void onPause() {
        ValueAnimator valueAnimator = this.f13543k;
        if (valueAnimator != null) {
            valueAnimator.pause();
        }
        super.onPause();
    }

    public void onResume() {
        ValueAnimator valueAnimator = this.f13543k;
        if (valueAnimator != null) {
            valueAnimator.resume();
        }
        super.onResume();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C12932j.m33818b(view, "view");
        super.onViewCreated(view, bundle);
        ImageView imageView = (ImageView) mo12598a(C3891l.emoji);
        String str = "emoji";
        C12932j.m33815a((Object) imageView, str);
        imageView.setAlpha(0.0f);
        ImageView imageView2 = (ImageView) mo12598a(C3891l.emoji);
        C12932j.m33815a((Object) imageView2, str);
        imageView2.setScaleX(30.0f);
        ImageView imageView3 = (ImageView) mo12598a(C3891l.emoji);
        C12932j.m33815a((Object) imageView3, str);
        imageView3.setScaleY(30.0f);
        Disposable d = this.f13545m.userPublicStream(mo12601c()).mo36495f().mo36535a((C12286f) this.f13541i.getMainThread()).mo36551d((Consumer<? super T>) new C5252b<Object>(this));
        C12932j.m33815a((Object) d, "zenlyCore\n            .u…nto(avatar)\n            }");
        C12773a.m33432a(d, this.f13540h);
        FragmentActivity requireActivity = requireActivity();
        C12932j.m33815a((Object) requireActivity, "requireActivity()");
        ((AnimatedTextView) mo12598a(C3891l.animated_text)).setCallback(new C5253c(this, requireActivity));
        Window window = requireActivity.getWindow();
        C12932j.m33815a((Object) window, "requireActivity.window");
        window.getSharedElementEnterTransition().addListener(this.f13548p);
        view.getViewTreeObserver().addOnGlobalLayoutListener(new C5256d(view, requireActivity));
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        C12932j.m33818b(view, "view");
        C12932j.m33818b(rect, "insets");
        super.onWindowInsetsChanged(view, rect);
        ConstraintLayout constraintLayout = (ConstraintLayout) mo12598a(C3891l.root_container);
        C12932j.m33815a((Object) constraintLayout, "root_container");
        constraintLayout.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }
}
