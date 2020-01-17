package app.zenly.locator.recommendation;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.dynamicanimation.animation.C0728d;
import androidx.dynamicanimation.animation.C0730f;
import androidx.dynamicanimation.animation.C0731g;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationUpdateListener;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C1085v;
import app.zenly.android.feature.base.app.C1321b;
import app.zenly.android.feature.base.scheduling.C1342b;
import app.zenly.android.feature.base.scheduling.C1351e;
import app.zenly.android.feature.base.scheduling.ZenlySchedulers;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.core.analytics.tracker.AnalyticsTracker;
import app.zenly.locator.core.p072ui.view.particles.C3160b;
import app.zenly.locator.p143s.C5343a;
import app.zenly.locator.recommendation.C5245d.C5246a;
import app.zenly.locator.recommendation.C5245d.C5247b;
import app.zenly.locator.recommendation.C5266k.C5267a;
import app.zenly.locator.recommendation.model.C5290a;
import app.zenly.locator.recommendation.model.PotentialMatch;
import app.zenly.locator.recommendation.p142p.C5301b;
import app.zenly.locator.recommendation.section.RecommendFriendsSection;
import app.zenly.locator.recommendation.swipeable.C5310a;
import app.zenly.locator.recommendation.swipeable.SwipeableLayoutManager;
import app.zenly.locator.recommendation.swipeable.touchhelper.ItemTouchHelper;
import com.airbnb.lottie.LottieAnimationView;
import com.snap.p327ui.event.C11700c;
import com.snap.p327ui.event.EventDispatcher;
import com.snap.p327ui.recycling.adapter.C11705b;
import com.snap.p327ui.recycling.factory.C11727c;
import com.snap.p327ui.recycling.p328d.C11722a;
import java.util.HashMap;
import kotlin.C12956q;
import kotlin.Lazy;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import kotlin.jvm.internal.C12934l;
import kotlin.jvm.internal.C12935m;
import kotlin.jvm.internal.C12940r;
import kotlin.jvm.internal.C12941s;
import kotlin.jvm.internal.C12946x;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import p250f.p251a.p252a.p253a.p255e.C7662d;
import p389io.reactivex.C12279e;
import p389io.reactivex.C12286f;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.p405m.C12773a;
import p389io.reactivex.p406n.C12785a;

/* renamed from: app.zenly.locator.recommendation.a */
public final class C5216a extends C1321b {

    /* renamed from: x */
    static final /* synthetic */ KProperty[] f13464x;

    /* renamed from: y */
    public static final C5217a f13465y = new C5217a(null);

    /* renamed from: f */
    private final ReadWriteProperty f13466f = C7662d.m18671c();

    /* renamed from: g */
    private final ReadWriteProperty f13467g = C7662d.m18671c();

    /* renamed from: h */
    private final ZenlySchedulers f13468h = C1351e.m6372a(C5249f.f13535b.mo19916a("recommendFriends"));

    /* renamed from: i */
    private final Lazy f13469i = C12896f.m33751a(new C5230l(this));

    /* renamed from: j */
    private final C12275b f13470j = new C12275b();

    /* renamed from: k */
    private C11705b f13471k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C12785a<Integer> f13472l;

    /* renamed from: m */
    private C0728d f13473m;

    /* renamed from: n */
    private C3160b f13474n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C0730f f13475o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public Animator f13476p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final C5290a f13477q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public String f13478r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final C5245d f13479s;

    /* renamed from: t */
    private final Function1<Integer, C12956q> f13480t;

    /* renamed from: u */
    private final Function2<C1085v, Double, C12956q> f13481u;

    /* renamed from: v */
    private final C5310a f13482v;

    /* renamed from: w */
    private HashMap f13483w;

    /* renamed from: app.zenly.locator.recommendation.a$a */
    public static final class C5217a {
        private C5217a() {
        }

        /* renamed from: a */
        public final C5216a mo12548a(String str, String str2) {
            C12932j.m33818b(str, "newComerUuid");
            C12932j.m33818b(str2, "newComerName");
            C5216a aVar = new C5216a();
            aVar.mo12546b(str);
            aVar.mo12545a(str2);
            return aVar;
        }

        public /* synthetic */ C5217a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.recommendation.a$b */
    public static final class C5218b implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ C5216a f13484a;

        public C5218b(C5216a aVar) {
            this.f13484a = aVar;
        }

        public void onAnimationCancel(Animator animator) {
            C12932j.m33818b(animator, "animator");
        }

        public void onAnimationEnd(Animator animator) {
            C12932j.m33818b(animator, "animator");
            if (this.f13484a.isAdded() && !this.f13484a.isStateSaved()) {
                this.f13484a.m14861h();
            }
        }

        public void onAnimationRepeat(Animator animator) {
            C12932j.m33818b(animator, "animator");
        }

        public void onAnimationStart(Animator animator) {
            C12932j.m33818b(animator, "animator");
        }
    }

    /* renamed from: app.zenly.locator.recommendation.a$c */
    public static final class C5219c implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ C5216a f13485a;

        public C5219c(C5216a aVar) {
            this.f13485a = aVar;
        }

        public void onAnimationCancel(Animator animator) {
            C12932j.m33818b(animator, "animator");
        }

        public void onAnimationEnd(Animator animator) {
            C12932j.m33818b(animator, "animator");
            if (this.f13485a.isAdded()) {
                this.f13485a.requireActivity().finish();
            }
        }

        public void onAnimationRepeat(Animator animator) {
            C12932j.m33818b(animator, "animator");
        }

        public void onAnimationStart(Animator animator) {
            C12932j.m33818b(animator, "animator");
        }
    }

    /* renamed from: app.zenly.locator.recommendation.a$d */
    public static final class C5220d implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ C5216a f13486a;

        /* renamed from: app.zenly.locator.recommendation.a$d$a */
        public static final class C5221a extends AnimatorListenerAdapter {

            /* renamed from: a */
            final /* synthetic */ C5220d f13487a;

            C5221a(C5220d dVar) {
                this.f13487a = dVar;
            }

            public void onAnimationEnd(Animator animator) {
                if (this.f13487a.f13486a.isAdded()) {
                    LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f13487a.f13486a.mo12544a(C3891l.heart);
                    C12932j.m33815a((Object) lottieAnimationView, "heart");
                    lottieAnimationView.setVisibility(4);
                    this.f13487a.f13486a.requireActivity().finish();
                }
            }
        }

        public C5220d(C5216a aVar) {
            this.f13486a = aVar;
        }

        public void onAnimationCancel(Animator animator) {
            C12932j.m33818b(animator, "animator");
        }

        public void onAnimationEnd(Animator animator) {
            C12932j.m33818b(animator, "animator");
            ((LottieAnimationView) this.f13486a.mo12544a(C3891l.heart)).mo22798a((AnimatorListener) new C5221a(this));
            this.f13486a.m14865j();
        }

        public void onAnimationRepeat(Animator animator) {
            C12932j.m33818b(animator, "animator");
        }

        public void onAnimationStart(Animator animator) {
            C12932j.m33818b(animator, "animator");
        }
    }

    /* renamed from: app.zenly.locator.recommendation.a$e */
    static final class C5222e extends C12933k implements Function1<Integer, C12956q> {

        /* renamed from: f */
        final /* synthetic */ C5216a f13488f;

        C5222e(C5216a aVar) {
            this.f13488f = aVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo12562a(int i) {
            C11722a itemViewModel = C5216a.m14859g(this.f13488f).getItemViewModel(0);
            if (itemViewModel != null) {
                String id = ((C5301b) itemViewModel).mo12674f().getId();
                if (i == 4) {
                    this.f13488f.f13477q.mo12655b();
                    this.f13488f.m14858g().mo12620a(this.f13488f.mo12547c(), id, C5267a.IGNORED);
                } else {
                    this.f13488f.m14858g().mo12620a(this.f13488f.mo12547c(), id, C5267a.ACCEPTED);
                    this.f13488f.m14858g().mo12626b(this.f13488f.mo12547c(), id);
                    this.f13488f.f13479s.mo12594a(C5247b.CARD);
                    this.f13488f.f13477q.mo12656c();
                }
                boolean m = this.f13488f.m14863i();
                if (this.f13488f.f13477q.mo12654a(m)) {
                    this.f13488f.m14867k();
                    return;
                }
                this.f13488f.m14849b(i);
                if (m) {
                    if (this.f13488f.f13477q.mo12653a()) {
                        this.f13488f.m14857f();
                    } else {
                        this.f13488f.m14855e();
                    }
                }
                C12785a e = this.f13488f.f13472l;
                Object s = this.f13488f.f13472l.mo36963s();
                if (s != null) {
                    e.onNext(Integer.valueOf(((Number) s).intValue() + 1));
                } else {
                    C12932j.m33814a();
                    throw null;
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type app.zenly.locator.recommendation.viewmodel.PotentialMatchViewModel");
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo12562a(((Number) obj).intValue());
            return C12956q.f33541a;
        }
    }

    /* renamed from: app.zenly.locator.recommendation.a$f */
    static final class C5223f extends C12933k implements Function2<C1085v, Double, C12956q> {

        /* renamed from: f */
        final /* synthetic */ C5216a f13489f;

        C5223f(C5216a aVar) {
            this.f13489f = aVar;
            super(2);
        }

        /* renamed from: a */
        public final void mo12563a(C1085v vVar, double d) {
            C12932j.m33818b(vVar, "<anonymous parameter 0>");
            C0730f j = this.f13489f.f13475o;
            if (j != null) {
                j.mo3676g();
            }
            float abs = ((float) Math.abs(d)) * 0.3f;
            String str = "dismiss_button";
            String str2 = "recommend_button";
            if (d > ((double) 0)) {
                AppCompatImageButton appCompatImageButton = (AppCompatImageButton) this.f13489f.mo12544a(C3891l.dismiss_button);
                C12932j.m33815a((Object) appCompatImageButton, str);
                appCompatImageButton.setScaleX(1.0f);
                AppCompatImageButton appCompatImageButton2 = (AppCompatImageButton) this.f13489f.mo12544a(C3891l.dismiss_button);
                C12932j.m33815a((Object) appCompatImageButton2, str);
                appCompatImageButton2.setScaleY(1.0f);
                AppCompatImageButton appCompatImageButton3 = (AppCompatImageButton) this.f13489f.mo12544a(C3891l.recommend_button);
                C12932j.m33815a((Object) appCompatImageButton3, str2);
                float f = 1.0f - abs;
                appCompatImageButton3.setScaleX(f);
                AppCompatImageButton appCompatImageButton4 = (AppCompatImageButton) this.f13489f.mo12544a(C3891l.recommend_button);
                C12932j.m33815a((Object) appCompatImageButton4, str2);
                appCompatImageButton4.setScaleY(f);
                return;
            }
            AppCompatImageButton appCompatImageButton5 = (AppCompatImageButton) this.f13489f.mo12544a(C3891l.recommend_button);
            C12932j.m33815a((Object) appCompatImageButton5, str2);
            appCompatImageButton5.setScaleX(1.0f);
            AppCompatImageButton appCompatImageButton6 = (AppCompatImageButton) this.f13489f.mo12544a(C3891l.recommend_button);
            C12932j.m33815a((Object) appCompatImageButton6, str2);
            appCompatImageButton6.setScaleY(1.0f);
            AppCompatImageButton appCompatImageButton7 = (AppCompatImageButton) this.f13489f.mo12544a(C3891l.dismiss_button);
            C12932j.m33815a((Object) appCompatImageButton7, str);
            float f2 = 1.0f - abs;
            appCompatImageButton7.setScaleX(f2);
            AppCompatImageButton appCompatImageButton8 = (AppCompatImageButton) this.f13489f.mo12544a(C3891l.dismiss_button);
            C12932j.m33815a((Object) appCompatImageButton8, str);
            appCompatImageButton8.setScaleY(f2);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo12563a((C1085v) obj, ((Number) obj2).doubleValue());
            return C12956q.f33541a;
        }
    }

    /* renamed from: app.zenly.locator.recommendation.a$g */
    static final class C5224g extends C12933k implements Function1<PotentialMatch, C12956q> {

        /* renamed from: f */
        final /* synthetic */ C5216a f13490f;

        /* renamed from: app.zenly.locator.recommendation.a$g$a */
        public static final class C5225a implements AnimatorListener {

            /* renamed from: a */
            final /* synthetic */ C5224g f13491a;

            /* renamed from: b */
            final /* synthetic */ PotentialMatch f13492b;

            /* renamed from: c */
            final /* synthetic */ String f13493c;

            public C5225a(C5224g gVar, PotentialMatch potentialMatch, String str) {
                this.f13491a = gVar;
                this.f13492b = potentialMatch;
                this.f13493c = str;
            }

            public void onAnimationCancel(Animator animator) {
                C12932j.m33818b(animator, "animator");
            }

            public void onAnimationEnd(Animator animator) {
                C12932j.m33818b(animator, "animator");
                if (this.f13491a.f13490f.isAdded() && (!C12932j.m33817a((Object) this.f13491a.f13490f.f13478r, (Object) this.f13492b.getId()))) {
                    this.f13491a.f13490f.f13478r = this.f13492b.getId();
                    TextView textView = (TextView) this.f13491a.f13490f.mo12544a(C3891l.title);
                    C12932j.m33815a((Object) textView, "title");
                    textView.setText(this.f13493c);
                    C5216a aVar = this.f13491a.f13490f;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat((TextView) aVar.mo12544a(C3891l.title), View.ALPHA, new float[]{0.0f, 1.0f});
                    ofFloat.start();
                    aVar.f13476p = ofFloat;
                }
            }

            public void onAnimationRepeat(Animator animator) {
                C12932j.m33818b(animator, "animator");
            }

            public void onAnimationStart(Animator animator) {
                C12932j.m33818b(animator, "animator");
            }
        }

        C5224g(C5216a aVar) {
            this.f13490f = aVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo12564a(PotentialMatch potentialMatch) {
            C12932j.m33818b(potentialMatch, "potentialMatch");
            boolean z = false;
            String string = this.f13490f.getString(R.string.recommendation_matchmaker_question, potentialMatch.getName(), this.f13490f.mo6614b());
            C12932j.m33815a((Object) string, "getString(R.string.recom…Match.name, newComerName)");
            TextView textView = (TextView) this.f13490f.mo12544a(C3891l.title);
            String str = "title";
            C12932j.m33815a((Object) textView, str);
            CharSequence text = textView.getText();
            C12932j.m33815a((Object) text, "title.text");
            if (text.length() == 0) {
                z = true;
            }
            if (z) {
                TextView textView2 = (TextView) this.f13490f.mo12544a(C3891l.title);
                C12932j.m33815a((Object) textView2, str);
                textView2.setText(string);
                return;
            }
            Animator f = this.f13490f.f13476p;
            if (f != null) {
                f.end();
            }
            C5216a aVar = this.f13490f;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat((TextView) aVar.mo12544a(C3891l.title), View.ALPHA, new float[]{1.0f, 0.0f});
            ofFloat.addListener(new C5225a(this, potentialMatch, string));
            ofFloat.start();
            aVar.f13476p = ofFloat;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo12564a((PotentialMatch) obj);
            return C12956q.f33541a;
        }
    }

    /* renamed from: app.zenly.locator.recommendation.a$h */
    static final class C5226h extends C12933k implements Function0<C12956q> {

        /* renamed from: f */
        final /* synthetic */ C5216a f13494f;

        C5226h(C5216a aVar) {
            this.f13494f = aVar;
            super(0);
        }

        public final void invoke() {
            this.f13494f.m14861h();
        }
    }

    /* renamed from: app.zenly.locator.recommendation.a$i */
    static final class C5227i extends C12933k implements Function0<C12956q> {

        /* renamed from: f */
        final /* synthetic */ C5216a f13495f;

        C5227i(C5216a aVar) {
            this.f13495f = aVar;
            super(0);
        }

        public final void invoke() {
            if (this.f13495f.isAdded()) {
                C5216a aVar = this.f13495f;
                AnimatorSet animatorSet = new AnimatorSet();
                PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{0.0f, 1.0f});
                animatorSet.playTogether(new Animator[]{ObjectAnimator.ofPropertyValuesHolder((AppCompatImageButton) this.f13495f.mo12544a(C3891l.recommend_button), new PropertyValuesHolder[]{ofFloat}), ObjectAnimator.ofPropertyValuesHolder((AppCompatImageButton) this.f13495f.mo12544a(C3891l.dismiss_button), new PropertyValuesHolder[]{ofFloat}), ObjectAnimator.ofPropertyValuesHolder((TextView) this.f13495f.mo12544a(C3891l.title), new PropertyValuesHolder[]{ofFloat})});
                animatorSet.start();
                aVar.f13476p = animatorSet;
            }
        }
    }

    /* renamed from: app.zenly.locator.recommendation.a$j */
    static final class C5228j implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ ItemTouchHelper f13496e;

        C5228j(ItemTouchHelper itemTouchHelper) {
            this.f13496e = itemTouchHelper;
        }

        public final void onClick(View view) {
            this.f13496e.mo12699a(8);
        }
    }

    /* renamed from: app.zenly.locator.recommendation.a$k */
    static final class C5229k implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ ItemTouchHelper f13497e;

        C5229k(ItemTouchHelper itemTouchHelper) {
            this.f13497e = itemTouchHelper;
        }

        public final void onClick(View view) {
            this.f13497e.mo12699a(4);
        }
    }

    /* renamed from: app.zenly.locator.recommendation.a$l */
    static final class C5230l extends C12933k implements Function0<C5266k> {

        /* renamed from: f */
        final /* synthetic */ C5216a f13498f;

        C5230l(C5216a aVar) {
            this.f13498f = aVar;
            super(0);
        }

        public final C5266k invoke() {
            Context requireContext = this.f13498f.requireContext();
            C12932j.m33815a((Object) requireContext, "requireContext()");
            return C5264i.m14923a(requireContext).mo12619b();
        }
    }

    /* renamed from: app.zenly.locator.recommendation.a$m */
    static final class C5231m implements OnAnimationUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C5216a f13499a;

        C5231m(C5216a aVar) {
            this.f13499a = aVar;
        }

        public final void onAnimationUpdate(DynamicAnimation<DynamicAnimation<?>> dynamicAnimation, float f, float f2) {
            AppCompatImageButton appCompatImageButton = (AppCompatImageButton) this.f13499a.mo12544a(C3891l.recommend_button);
            String str = "recommend_button";
            C12932j.m33815a((Object) appCompatImageButton, str);
            appCompatImageButton.setScaleX(f);
            AppCompatImageButton appCompatImageButton2 = (AppCompatImageButton) this.f13499a.mo12544a(C3891l.recommend_button);
            C12932j.m33815a((Object) appCompatImageButton2, str);
            appCompatImageButton2.setScaleY(f);
        }
    }

    /* renamed from: app.zenly.locator.recommendation.a$n */
    static final class C5232n implements OnAnimationUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C5216a f13500a;

        C5232n(C5216a aVar) {
            this.f13500a = aVar;
        }

        public final void onAnimationUpdate(DynamicAnimation<DynamicAnimation<?>> dynamicAnimation, float f, float f2) {
            AppCompatImageButton appCompatImageButton = (AppCompatImageButton) this.f13500a.mo12544a(C3891l.dismiss_button);
            String str = "dismiss_button";
            C12932j.m33815a((Object) appCompatImageButton, str);
            appCompatImageButton.setScaleX(f);
            AppCompatImageButton appCompatImageButton2 = (AppCompatImageButton) this.f13500a.mo12544a(C3891l.dismiss_button);
            C12932j.m33815a((Object) appCompatImageButton2, str);
            appCompatImageButton2.setScaleY(f);
        }
    }

    /* renamed from: app.zenly.locator.recommendation.a$o */
    public static final class C5233o extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C5216a f13501a;

        C5233o(C5216a aVar) {
            this.f13501a = aVar;
        }

        public void onAnimationEnd(Animator animator) {
            if (this.f13501a.isAdded()) {
                LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f13501a.mo12544a(C3891l.heart);
                C12932j.m33815a((Object) lottieAnimationView, "heart");
                lottieAnimationView.setVisibility(4);
                this.f13501a.m14853d();
            }
        }
    }

    static {
        C12935m mVar = new C12935m(C12946x.m33834a(C5216a.class), "newComerUuid", "getNewComerUuid()Ljava/lang/String;");
        C12946x.m33837a((C12934l) mVar);
        C12935m mVar2 = new C12935m(C12946x.m33834a(C5216a.class), "newComerName", "getNewComerName()Ljava/lang/String;");
        C12946x.m33837a((C12934l) mVar2);
        C12941s sVar = new C12941s(C12946x.m33834a(C5216a.class), "recommendationRepository", "getRecommendationRepository()Lapp/zenly/locator/recommendation/RecommendationRepository;");
        C12946x.m33839a((C12940r) sVar);
        f13464x = new KProperty[]{mVar, mVar2, sVar};
    }

    public C5216a() {
        C12785a<Integer> u = C12785a.m33447u();
        C12932j.m33815a((Object) u, "BehaviorSubject.create<Int>()");
        this.f13472l = u;
        this.f13473m = new C0728d();
        this.f13477q = new C5290a();
        C5343a U = C5343a.m15160U();
        C12932j.m33815a((Object) U, "Analytics.get()");
        AnalyticsTracker a = U.mo12806a();
        C12932j.m33815a((Object) a, "Analytics.get().tracker");
        this.f13479s = new C5245d(a);
        this.f13480t = new C5222e(this);
        this.f13481u = new C5223f(this);
        this.f13482v = new C5310a(this.f13480t, this.f13481u);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public final C5266k m14858g() {
        Lazy lazy = this.f13469i;
        KProperty kProperty = f13464x[2];
        return (C5266k) lazy.getValue();
    }

    /* renamed from: g */
    public static final /* synthetic */ C11705b m14859g(C5216a aVar) {
        C11705b bVar = aVar.f13471k;
        if (bVar != null) {
            return bVar;
        }
        C12932j.m33820c("recommendFriendsAdapter");
        throw null;
    }

    /* renamed from: a */
    public View mo12544a(int i) {
        if (this.f13483w == null) {
            this.f13483w = new HashMap();
        }
        View view = (View) this.f13483w.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f13483w.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    public void mo6508a() {
        HashMap hashMap = this.f13483w;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: a */
    public final void mo12545a(String str) {
        C12932j.m33818b(str, "<set-?>");
        this.f13467g.setValue(this, f13464x[1], str);
    }

    /* renamed from: b */
    public final String mo6614b() {
        return (String) this.f13467g.getValue(this, f13464x[1]);
    }

    /* renamed from: b */
    public final void mo12546b(String str) {
        C12932j.m33818b(str, "<set-?>");
        this.f13466f.setValue(this, f13464x[0], str);
    }

    /* renamed from: c */
    public final String mo12547c() {
        return (String) this.f13466f.getValue(this, f13464x[0]);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C12932j.m33818b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_recommend_friends, viewGroup, false);
    }

    public void onDestroyView() {
        ((LottieAnimationView) mo12544a(C3891l.heart)).mo22797a();
        C0730f fVar = this.f13475o;
        if (fVar != null) {
            fVar.mo3615a();
        }
        Animator animator = this.f13476p;
        if (animator != null) {
            animator.cancel();
        }
        C3160b bVar = this.f13474n;
        if (bVar != null) {
            bVar.mo9493a(true);
        }
        this.f13470j.mo36401a();
        super.onDestroyView();
        mo6508a();
    }

    public void onPause() {
        ((LottieAnimationView) mo12544a(C3891l.heart)).mo22806c();
        Animator animator = this.f13476p;
        if (animator != null) {
            animator.pause();
        }
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        Animator animator = this.f13476p;
        if (animator != null) {
            animator.resume();
        }
        ((LottieAnimationView) mo12544a(C3891l.heart)).mo22810g();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C12932j.m33818b(view, "view");
        super.onViewCreated(view, bundle);
        TextView textView = (TextView) mo12544a(C3891l.title);
        C12932j.m33815a((Object) textView, "title");
        textView.setAlpha(0.0f);
        AppCompatImageButton appCompatImageButton = (AppCompatImageButton) mo12544a(C3891l.recommend_button);
        C12932j.m33815a((Object) appCompatImageButton, "recommend_button");
        appCompatImageButton.setAlpha(0.0f);
        AppCompatImageButton appCompatImageButton2 = (AppCompatImageButton) mo12544a(C3891l.dismiss_button);
        C12932j.m33815a((Object) appCompatImageButton2, "dismiss_button");
        appCompatImageButton2.setAlpha(0.0f);
        C11727c cVar = new C11727c(C12846n.m33635a(C5288l.class));
        C11700c cVar2 = new C11700c();
        this.f13470j.add(cVar2);
        EventDispatcher a = cVar2.mo34447a();
        C12932j.m33815a((Object) a, "bus.eventDispatcher");
        C1342b computation = this.f13468h.getComputation();
        C1342b mainThread = this.f13468h.getMainThread();
        String c = mo12547c();
        C12279e a2 = this.f13472l.mo36428a((C12286f) this.f13468h.getComputation());
        C12932j.m33815a((Object) a2, "onItemSwipedSubject.obse…edSchedulers.computation)");
        RecommendFriendsSection recommendFriendsSection = new RecommendFriendsSection(c, a2, new C5224g(this), new C5226h(this), m14858g());
        C11705b bVar = new C11705b(cVar, a, computation, mainThread, C12846n.m33635a(recommendFriendsSection), null, 32, null);
        this.f13471k = bVar;
        ((LottieAnimationView) mo12544a(C3891l.heart)).setAnimation((int) R.raw.lottie_emoji_heart);
        RecyclerView recyclerView = (RecyclerView) mo12544a(C3891l.recycler_view);
        String str = "recycler_view";
        C12932j.m33815a((Object) recyclerView, str);
        C11705b bVar2 = this.f13471k;
        String str2 = "recommendFriendsAdapter";
        if (bVar2 != null) {
            recyclerView.setAdapter(bVar2);
            RecyclerView recyclerView2 = (RecyclerView) mo12544a(C3891l.recycler_view);
            C12932j.m33815a((Object) recyclerView2, str);
            SwipeableLayoutManager swipeableLayoutManager = new SwipeableLayoutManager(new C5227i(this));
            swipeableLayoutManager.mo12687i(4);
            swipeableLayoutManager.mo12688j(getResources().getDimensionPixelSize(R.dimen.spacing_100));
            swipeableLayoutManager.mo12686a(0.015f);
            recyclerView2.setLayoutManager(swipeableLayoutManager);
            ((RecyclerView) mo12544a(C3891l.recycler_view)).setHasFixedSize(true);
            RecyclerView recyclerView3 = (RecyclerView) mo12544a(C3891l.recycler_view);
            C12932j.m33815a((Object) recyclerView3, str);
            recyclerView3.setItemAnimator(null);
            this.f13472l.onNext(Integer.valueOf(0));
            ItemTouchHelper itemTouchHelper = new ItemTouchHelper(this.f13482v);
            itemTouchHelper.mo12706a((RecyclerView) mo12544a(C3891l.recycler_view));
            C11705b bVar3 = this.f13471k;
            if (bVar3 != null) {
                C12773a.m33432a(bVar3.mo34464b(), this.f13470j);
                ((AppCompatImageButton) mo12544a(C3891l.recommend_button)).setOnClickListener(new C5228j(itemTouchHelper));
                ((AppCompatImageButton) mo12544a(C3891l.dismiss_button)).setOnClickListener(new C5229k(itemTouchHelper));
                return;
            }
            C12932j.m33820c(str2);
            throw null;
        }
        C12932j.m33820c(str2);
        throw null;
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        C12932j.m33818b(view, "view");
        C12932j.m33818b(rect, "insets");
        super.onWindowInsetsChanged(view, rect);
        ConstraintLayout constraintLayout = (ConstraintLayout) mo12544a(C3891l.root_container);
        C12932j.m33815a((Object) constraintLayout, "root_container");
        constraintLayout.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m14849b(int i) {
        C0731g gVar = new C0731g();
        gVar.mo3684c(200.0f);
        gVar.mo3680a(0.75f);
        C0730f fVar = this.f13475o;
        if (fVar != null) {
            fVar.mo3676g();
        }
        C0730f fVar2 = new C0730f(this.f13473m);
        fVar2.mo3672a(gVar);
        fVar2.mo3620c(0.002f);
        this.f13475o = fVar2;
        if (i == 8) {
            C0730f fVar3 = this.f13475o;
            if (fVar3 != null) {
                AppCompatImageButton appCompatImageButton = (AppCompatImageButton) mo12544a(C3891l.recommend_button);
                C12932j.m33815a((Object) appCompatImageButton, "recommend_button");
                fVar3.mo3624e(appCompatImageButton.getScaleX());
            }
            C0730f fVar4 = this.f13475o;
            if (fVar4 != null) {
                fVar4.mo3614a((OnAnimationUpdateListener) new C5231m(this));
            }
        } else {
            C0730f fVar5 = this.f13475o;
            if (fVar5 != null) {
                AppCompatImageButton appCompatImageButton2 = (AppCompatImageButton) mo12544a(C3891l.dismiss_button);
                C12932j.m33815a((Object) appCompatImageButton2, "dismiss_button");
                fVar5.mo3624e(appCompatImageButton2.getScaleX());
            }
            C0730f fVar6 = this.f13475o;
            if (fVar6 != null) {
                fVar6.mo3614a((OnAnimationUpdateListener) new C5232n(this));
            }
        }
        C0730f fVar7 = this.f13475o;
        if (fVar7 != null) {
            fVar7.mo3677g(1.0f);
        }
        C0730f fVar8 = this.f13475o;
        if (fVar8 != null) {
            fVar8.mo3622d();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m14853d() {
        AnimatorSet animatorSet = new AnimatorSet();
        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{1.0f, 0.0f});
        Context requireContext = requireContext();
        C12932j.m33815a((Object) requireContext, "requireContext()");
        int dimensionPixelSize = requireContext.getResources().getDimensionPixelSize(R.dimen.spacing_400);
        ConstraintLayout constraintLayout = (ConstraintLayout) mo12544a(C3891l.root_container);
        C12932j.m33815a((Object) constraintLayout, "root_container");
        float paddingTop = (float) (dimensionPixelSize + constraintLayout.getPaddingTop());
        TextView textView = (TextView) mo12544a(C3891l.title);
        C12932j.m33815a((Object) textView, "title");
        float y = paddingTop - textView.getY();
        animatorSet.playTogether(new Animator[]{ObjectAnimator.ofPropertyValuesHolder((AppCompatImageButton) mo12544a(C3891l.recommend_button), new PropertyValuesHolder[]{ofFloat}), ObjectAnimator.ofPropertyValuesHolder((AppCompatImageButton) mo12544a(C3891l.dismiss_button), new PropertyValuesHolder[]{ofFloat}), ObjectAnimator.ofPropertyValuesHolder((RecyclerView) mo12544a(C3891l.recycler_view), new PropertyValuesHolder[]{ofFloat}), ObjectAnimator.ofFloat((TextView) mo12544a(C3891l.title), View.TRANSLATION_Y, new float[]{0.0f, y}), ObjectAnimator.ofFloat((TextView) mo12544a(C3891l.title), View.ALPHA, new float[]{1.0f, 0.0f})});
        animatorSet.addListener(new C5218b(this));
        animatorSet.start();
        this.f13476p = animatorSet;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final void m14855e() {
        AnimatorSet animatorSet = new AnimatorSet();
        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{1.0f, 0.0f});
        animatorSet.playTogether(new Animator[]{ObjectAnimator.ofPropertyValuesHolder((AppCompatImageButton) mo12544a(C3891l.recommend_button), new PropertyValuesHolder[]{ofFloat}), ObjectAnimator.ofPropertyValuesHolder((AppCompatImageButton) mo12544a(C3891l.dismiss_button), new PropertyValuesHolder[]{ofFloat})});
        animatorSet.addListener(new C5219c(this));
        animatorSet.start();
        this.f13476p = animatorSet;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final void m14857f() {
        AnimatorSet animatorSet = new AnimatorSet();
        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{1.0f, 0.0f});
        animatorSet.playTogether(new Animator[]{ObjectAnimator.ofPropertyValuesHolder((AppCompatImageButton) mo12544a(C3891l.recommend_button), new PropertyValuesHolder[]{ofFloat}), ObjectAnimator.ofPropertyValuesHolder((AppCompatImageButton) mo12544a(C3891l.dismiss_button), new PropertyValuesHolder[]{ofFloat}), ObjectAnimator.ofPropertyValuesHolder((TextView) mo12544a(C3891l.title), new PropertyValuesHolder[]{ofFloat}), ObjectAnimator.ofPropertyValuesHolder((LottieAnimationView) mo12544a(C3891l.heart), new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{1.0f, 1.2f}), PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{1.0f, 1.2f})})});
        animatorSet.addListener(new C5220d(this));
        animatorSet.start();
        this.f13476p = animatorSet;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public final void m14861h() {
        this.f13479s.mo12595b(C5246a.CARD_MATCHMAKING);
        FragmentActivity requireActivity = requireActivity();
        if (requireActivity != null) {
            ((RecommendationActivity) requireActivity).mo7317e();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type app.zenly.locator.recommendation.RecommendationActivity");
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public final boolean m14863i() {
        C11705b bVar = this.f13471k;
        if (bVar != null) {
            return bVar.getItemCount() == 1;
        }
        C12932j.m33820c("recommendFriendsAdapter");
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public final void m14865j() {
        LottieAnimationView lottieAnimationView = (LottieAnimationView) mo12544a(C3891l.heart);
        C12932j.m33815a((Object) lottieAnimationView, "heart");
        lottieAnimationView.setVisibility(0);
        ((LottieAnimationView) mo12544a(C3891l.heart)).mo22807d();
        ((LottieAnimationView) mo12544a(C3891l.heart)).setMaxProgress(0.58f);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public final void m14867k() {
        if (!this.f13477q.mo12653a()) {
            m14853d();
            return;
        }
        m14865j();
        ((LottieAnimationView) mo12544a(C3891l.heart)).mo22798a((AnimatorListener) new C5233o(this));
    }
}
