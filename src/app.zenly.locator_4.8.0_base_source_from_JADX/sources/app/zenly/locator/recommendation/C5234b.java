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
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import app.zenly.android.feature.base.app.C1321b;
import app.zenly.android.feature.base.scheduling.C1351e;
import app.zenly.android.feature.base.scheduling.ZenlySchedulers;
import app.zenly.android.feature.polenta.widget.SearchBar;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.recommendation.p139m.C5289a;
import app.zenly.locator.recommendation.p140n.C5292a;
import app.zenly.locator.recommendation.util.C5327a;
import com.airbnb.lottie.LottieAnimationView;
import com.snap.p327ui.recycling.adapter.C11705b;
import java.util.HashMap;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12931i;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12934l;
import kotlin.jvm.internal.C12935m;
import kotlin.jvm.internal.C12946x;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KProperty;
import org.greenrobot.eventbus.C13382i;
import org.greenrobot.eventbus.ThreadMode;
import p250f.p251a.p252a.p253a.p255e.C7662d;
import p389io.reactivex.disposables.C12275b;

/* renamed from: app.zenly.locator.recommendation.b */
public final class C5234b extends C1321b {

    /* renamed from: p */
    static final /* synthetic */ KProperty[] f13502p;

    /* renamed from: q */
    public static final C5235a f13503q = new C5235a(null);

    /* renamed from: f */
    private final ReadWriteProperty f13504f = C7662d.m18671c();

    /* renamed from: g */
    private final ReadWriteProperty f13505g = C7662d.m18671c();

    /* renamed from: h */
    private final C12275b f13506h = new C12275b();

    /* renamed from: i */
    private final ZenlySchedulers f13507i = C1351e.m6372a(C5249f.f13535b.mo19916a("recommendOthers"));

    /* renamed from: j */
    private C11705b f13508j;

    /* renamed from: k */
    private C5292a f13509k;

    /* renamed from: l */
    private C5263h f13510l;

    /* renamed from: m */
    private C5327a f13511m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public Animator f13512n;

    /* renamed from: o */
    private HashMap f13513o;

    /* renamed from: app.zenly.locator.recommendation.b$a */
    public static final class C5235a {
        private C5235a() {
        }

        /* renamed from: a */
        public final C5234b mo12576a(String str, String str2) {
            C12932j.m33818b(str, "newComerUuid");
            C12932j.m33818b(str2, "newComerName");
            C5234b bVar = new C5234b();
            bVar.mo12574b(str);
            bVar.mo12573a(str2);
            return bVar;
        }

        public /* synthetic */ C5235a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.recommendation.b$b */
    public final class C5236b {
        public C5236b() {
        }

        @C13382i(threadMode = ThreadMode.MAIN)
        public final void onRecommendFriendEvent(C5289a aVar) {
            C12932j.m33818b(aVar, "event");
            C5234b.m14883a(C5234b.this).mo12658a(aVar);
            C5234b.this.m14887d();
        }
    }

    /* renamed from: app.zenly.locator.recommendation.b$c */
    public static final class C5237c implements OnGlobalLayoutListener {

        /* renamed from: e */
        final /* synthetic */ C5234b f13515e;

        /* renamed from: f */
        final /* synthetic */ View f13516f;

        C5237c(C5234b bVar, View view) {
            this.f13515e = bVar;
            this.f13516f = view;
        }

        public void onGlobalLayout() {
            ViewTreeObserver viewTreeObserver = this.f13516f.getViewTreeObserver();
            C12932j.m33815a((Object) viewTreeObserver, "treeObserver");
            if (viewTreeObserver.isAlive()) {
                if (this.f13515e.isAdded()) {
                    TextView textView = (TextView) this.f13515e.mo12572a(C3891l.recommend);
                    String str = "recommend";
                    C12932j.m33815a((Object) textView, str);
                    LayoutParams layoutParams = textView.getLayoutParams();
                    if (layoutParams != null) {
                        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                        int i = marginLayoutParams.bottomMargin + marginLayoutParams.topMargin;
                        RecyclerView recyclerView = (RecyclerView) this.f13515e.mo12572a(C3891l.recycler_view);
                        C12932j.m33815a((Object) recyclerView, "recycler_view");
                        TextView textView2 = (TextView) this.f13515e.mo12572a(C3891l.recommend);
                        C12932j.m33815a((Object) textView2, str);
                        recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), textView2.getHeight() + i);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                }
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    /* renamed from: app.zenly.locator.recommendation.b$d */
    public static final class C5238d implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ C5234b f13517a;

        /* renamed from: app.zenly.locator.recommendation.b$d$a */
        static final class C5239a implements Runnable {

            /* renamed from: e */
            final /* synthetic */ C5238d f13518e;

            C5239a(C5238d dVar) {
                this.f13518e = dVar;
            }

            /* renamed from: a */
            public final void run() {
                if (this.f13518e.f13517a.getView() != null) {
                    TextView textView = (TextView) this.f13518e.f13517a.mo12572a(C3891l.recommend);
                    String str = "recommend";
                    C12932j.m33815a((Object) textView, str);
                    if (textView.getVisibility() == 0) {
                        ((TextView) this.f13518e.f13517a.mo12572a(C3891l.recommend)).animate().alpha(1.0f).start();
                    } else {
                        TextView textView2 = (TextView) this.f13518e.f13517a.mo12572a(C3891l.recommend);
                        C12932j.m33815a((Object) textView2, str);
                        textView2.setAlpha(1.0f);
                    }
                }
            }
        }

        public C5238d(C5234b bVar) {
            this.f13517a = bVar;
        }

        public void onAnimationCancel(Animator animator) {
            C12932j.m33818b(animator, "animator");
        }

        public void onAnimationEnd(Animator animator) {
            C12932j.m33818b(animator, "animator");
            if (this.f13517a.getView() != null) {
                SearchBar searchBar = (SearchBar) this.f13517a.mo12572a(C3891l.search_bar);
                C12932j.m33815a((Object) searchBar, "search_bar");
                searchBar.setVisibility(0);
                C5234b bVar = this.f13517a;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat((SearchBar) bVar.mo12572a(C3891l.search_bar), View.ALPHA, new float[]{0.0f, 1.0f});
                ofFloat.start();
                bVar.f13512n = ofFloat;
                RecyclerView recyclerView = (RecyclerView) this.f13517a.mo12572a(C3891l.recycler_view);
                C12932j.m33815a((Object) recyclerView, "recycler_view");
                recyclerView.setAdapter(C5234b.m14885b(this.f13517a));
                ((TextView) this.f13517a.mo12572a(C3891l.recommend)).postDelayed(new C5239a(this), 300);
            }
        }

        public void onAnimationRepeat(Animator animator) {
            C12932j.m33818b(animator, "animator");
        }

        public void onAnimationStart(Animator animator) {
            C12932j.m33818b(animator, "animator");
        }
    }

    /* renamed from: app.zenly.locator.recommendation.b$e */
    public static final class C5240e extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C5234b f13519a;

        C5240e(C5234b bVar) {
            this.f13519a = bVar;
        }

        public void onAnimationEnd(Animator animator) {
            if (this.f13519a.isAdded()) {
                LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f13519a.mo12572a(C3891l.heart);
                C12932j.m33815a((Object) lottieAnimationView, "heart");
                lottieAnimationView.setVisibility(4);
                this.f13519a.requireActivity().finish();
            }
        }
    }

    /* renamed from: app.zenly.locator.recommendation.b$f */
    static final class C5241f implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C5234b f13520e;

        /* renamed from: app.zenly.locator.recommendation.b$f$a */
        public static final class C5242a implements AnimatorListener {

            /* renamed from: a */
            final /* synthetic */ C5241f f13521a;

            public C5242a(C5241f fVar, PropertyValuesHolder propertyValuesHolder) {
                this.f13521a = fVar;
            }

            public void onAnimationCancel(Animator animator) {
                C12932j.m33818b(animator, "animator");
            }

            public void onAnimationEnd(Animator animator) {
                C12932j.m33818b(animator, "animator");
                LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f13521a.f13520e.mo12572a(C3891l.heart);
                C12932j.m33815a((Object) lottieAnimationView, "heart");
                lottieAnimationView.setVisibility(0);
                ((LottieAnimationView) this.f13521a.f13520e.mo12572a(C3891l.heart)).setMaxProgress(0.58f);
                ((LottieAnimationView) this.f13521a.f13520e.mo12572a(C3891l.heart)).mo22807d();
            }

            public void onAnimationRepeat(Animator animator) {
                C12932j.m33818b(animator, "animator");
            }

            public void onAnimationStart(Animator animator) {
                C12932j.m33818b(animator, "animator");
            }
        }

        C5241f(C5234b bVar) {
            this.f13520e = bVar;
        }

        public final void onClick(View view) {
            C5234b.m14883a(this.f13520e).mo12660b();
            PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{1.0f, 0.0f});
            C5234b bVar = this.f13520e;
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(new Animator[]{ObjectAnimator.ofPropertyValuesHolder((TextView) this.f13520e.mo12572a(C3891l.title), new PropertyValuesHolder[]{ofFloat}), ObjectAnimator.ofPropertyValuesHolder((RecyclerView) this.f13520e.mo12572a(C3891l.recycler_view), new PropertyValuesHolder[]{ofFloat}), ObjectAnimator.ofPropertyValuesHolder((SearchBar) this.f13520e.mo12572a(C3891l.search_bar), new PropertyValuesHolder[]{ofFloat}), ObjectAnimator.ofPropertyValuesHolder((TextView) this.f13520e.mo12572a(C3891l.recommend), new PropertyValuesHolder[]{ofFloat})});
            animatorSet.addListener(new C5242a(this, ofFloat));
            animatorSet.start();
            bVar.f13512n = animatorSet;
        }
    }

    /* renamed from: app.zenly.locator.recommendation.b$g */
    static final /* synthetic */ class C5243g extends C12931i implements Function1<Object, String> {

        /* renamed from: i */
        public static final C5243g f13522i = new C5243g();

        C5243g() {
            super(1);
        }

        /* renamed from: a */
        public final String invoke(CharSequence charSequence) {
            C12932j.m33818b(charSequence, "p1");
            return charSequence.toString();
        }

        /* renamed from: d */
        public final KDeclarationContainer mo6620d() {
            return C12946x.m33834a(CharSequence.class);
        }

        /* renamed from: f */
        public final String mo6621f() {
            return "toString()Ljava/lang/String;";
        }

        public final String getName() {
            return "toString";
        }
    }

    static {
        C12935m mVar = new C12935m(C12946x.m33834a(C5234b.class), "newComerUuid", "getNewComerUuid()Ljava/lang/String;");
        C12946x.m33837a((C12934l) mVar);
        C12935m mVar2 = new C12935m(C12946x.m33834a(C5234b.class), "newComerName", "getNewComerName()Ljava/lang/String;");
        C12946x.m33837a((C12934l) mVar2);
        f13502p = new KProperty[]{mVar, mVar2};
    }

    /* renamed from: a */
    public static final /* synthetic */ C5292a m14883a(C5234b bVar) {
        C5292a aVar = bVar.f13509k;
        if (aVar != null) {
            return aVar;
        }
        C12932j.m33820c("presenter");
        throw null;
    }

    /* renamed from: b */
    public static final /* synthetic */ C11705b m14885b(C5234b bVar) {
        C11705b bVar2 = bVar.f13508j;
        if (bVar2 != null) {
            return bVar2;
        }
        C12932j.m33820c("recommendFriendsAdapter");
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m14887d() {
        TextView textView = (TextView) mo12572a(C3891l.recommend);
        String str = "recommend";
        C12932j.m33815a((Object) textView, str);
        C5292a aVar = this.f13509k;
        String str2 = "presenter";
        if (aVar != null) {
            textView.setVisibility(aVar.mo12662d() ? 0 : 4);
            C5292a aVar2 = this.f13509k;
            if (aVar2 != null) {
                int c = aVar2.mo12661c();
                TextView textView2 = (TextView) mo12572a(C3891l.recommend);
                C12932j.m33815a((Object) textView2, str);
                textView2.setText(getResources().getQuantityString(R.plurals.recommendation_matchmaker_list_cta, c, new Object[]{Integer.valueOf(c)}));
                return;
            }
            C12932j.m33820c(str2);
            throw null;
        }
        C12932j.m33820c(str2);
        throw null;
    }

    /* renamed from: a */
    public View mo12572a(int i) {
        if (this.f13513o == null) {
            this.f13513o = new HashMap();
        }
        View view = (View) this.f13513o.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f13513o.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    public void mo6508a() {
        HashMap hashMap = this.f13513o;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: a */
    public final void mo12573a(String str) {
        C12932j.m33818b(str, "<set-?>");
        this.f13505g.setValue(this, f13502p[1], str);
    }

    /* renamed from: b */
    public final String mo6614b() {
        return (String) this.f13505g.getValue(this, f13502p[1]);
    }

    /* renamed from: b */
    public final void mo12574b(String str) {
        C12932j.m33818b(str, "<set-?>");
        this.f13504f.setValue(this, f13502p[0], str);
    }

    /* renamed from: c */
    public final String mo12575c() {
        return (String) this.f13504f.getValue(this, f13502p[0]);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Context requireContext = requireContext();
        C12932j.m33815a((Object) requireContext, "requireContext()");
        this.f13510l = C5264i.m14923a(requireContext);
        C5263h hVar = this.f13510l;
        if (hVar != null) {
            this.f13509k = new C5292a(mo12575c(), hVar.mo12619b());
            return;
        }
        C12932j.m33820c("recommendationModule");
        throw null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C12932j.m33818b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_recommend_friends_other, viewGroup, false);
    }

    public void onDestroyView() {
        C5327a aVar = this.f13511m;
        if (aVar != null) {
            aVar.mo12754d();
            this.f13506h.mo36401a();
            Animator animator = this.f13512n;
            if (animator != null) {
                animator.cancel();
            }
            ((LottieAnimationView) mo12572a(C3891l.heart)).mo22797a();
            super.onDestroyView();
            mo6508a();
            return;
        }
        C12932j.m33820c("searchModeHelper");
        throw null;
    }

    public void onPause() {
        Animator animator = this.f13512n;
        if (animator != null) {
            animator.pause();
        }
        ((LottieAnimationView) mo12572a(C3891l.heart)).mo22806c();
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        ((LottieAnimationView) mo12572a(C3891l.heart)).mo22810g();
        Animator animator = this.f13512n;
        if (animator != null) {
            animator.resume();
        }
    }

    /* JADX WARNING: type inference failed for: r3v5, types: [kotlin.jvm.functions.Function1, app.zenly.locator.recommendation.b$g] */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r5v10, types: [app.zenly.locator.recommendation.c] */
    /* JADX WARNING: type inference failed for: r3v20 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onViewCreated(android.view.View r18, android.os.Bundle r19) {
        /*
            r17 = this;
            r0 = r17
            java.lang.String r1 = "view"
            r2 = r18
            kotlin.jvm.internal.C12932j.m33818b(r2, r1)
            super.onViewCreated(r18, r19)
            android.view.ViewTreeObserver r1 = r18.getViewTreeObserver()
            android.view.ViewTreeObserver$OnGlobalLayoutListener r2 = r17.m14882a(r18)
            r1.addOnGlobalLayoutListener(r2)
            int r1 = app.zenly.locator.C3891l.heart
            android.view.View r1 = r0.mo12572a(r1)
            com.airbnb.lottie.LottieAnimationView r1 = (com.airbnb.lottie.LottieAnimationView) r1
            r2 = 2131951632(0x7f130010, float:1.9539684E38)
            r1.setAnimation(r2)
            int r1 = app.zenly.locator.C3891l.heart
            android.view.View r1 = r0.mo12572a(r1)
            com.airbnb.lottie.LottieAnimationView r1 = (com.airbnb.lottie.LottieAnimationView) r1
            app.zenly.locator.recommendation.b$e r2 = new app.zenly.locator.recommendation.b$e
            r2.<init>(r0)
            r1.mo22798a(r2)
            com.snap.ui.recycling.factory.c r4 = new com.snap.ui.recycling.factory.c
            java.lang.Class<app.zenly.locator.recommendation.l> r1 = app.zenly.locator.recommendation.C5288l.class
            java.util.List r1 = kotlin.collections.C12846n.m33635a(r1)
            r4.<init>(r1)
            com.snap.ui.event.c r1 = new com.snap.ui.event.c
            r1.<init>()
            app.zenly.locator.recommendation.b$b r2 = new app.zenly.locator.recommendation.b$b
            r2.<init>()
            r1.mo34449b(r2)
            io.reactivex.disposables.b r2 = r0.f13506h
            r2.add(r1)
            app.zenly.locator.recommendation.util.a r2 = new app.zenly.locator.recommendation.util.a
            int r3 = app.zenly.locator.C3891l.search_bar
            android.view.View r3 = r0.mo12572a(r3)
            app.zenly.android.feature.polenta.widget.SearchBar r3 = (app.zenly.android.feature.polenta.widget.SearchBar) r3
            java.lang.String r12 = "search_bar"
            kotlin.jvm.internal.C12932j.m33815a(r3, r12)
            r2.<init>(r3)
            r0.f13511m = r2
            androidx.fragment.app.FragmentActivity r2 = r17.requireActivity()
            java.lang.String r3 = "requireActivity()"
            kotlin.jvm.internal.C12932j.m33815a(r2, r3)
            androidx.activity.OnBackPressedDispatcher r2 = r2.getOnBackPressedDispatcher()
            androidx.lifecycle.LifecycleOwner r3 = r17.getViewLifecycleOwner()
            app.zenly.locator.recommendation.util.a r5 = r0.f13511m
            r13 = 0
            if (r5 == 0) goto L_0x01d8
            r2.mo283a(r3, r5)
            int r2 = app.zenly.locator.C3891l.search_bar
            android.view.View r2 = r0.mo12572a(r2)
            app.zenly.android.feature.polenta.widget.SearchBar r2 = (app.zenly.android.feature.polenta.widget.SearchBar) r2
            kotlin.jvm.internal.C12932j.m33815a(r2, r12)
            g.e.c.a r2 = app.zenly.locator.p017a0.p041t.C1684a.m7016a(r2)
            app.zenly.locator.recommendation.b$g r3 = app.zenly.locator.recommendation.C5234b.C5243g.f13522i
            if (r3 == 0) goto L_0x0098
            app.zenly.locator.recommendation.c r5 = new app.zenly.locator.recommendation.c
            r5.<init>(r3)
            r3 = r5
        L_0x0098:
            io.reactivex.functions.Function r3 = (p389io.reactivex.functions.Function) r3
            io.reactivex.e r2 = r2.mo36501i(r3)
            io.reactivex.e r2 = r2.mo36477d()
            java.lang.String r3 = ""
            io.reactivex.e r2 = r2.mo36485d(r3)
            app.zenly.android.feature.base.scheduling.ZenlySchedulers r3 = r0.f13507i
            app.zenly.android.feature.base.scheduling.b r3 = r3.getDisk()
            java.lang.String r5 = "query"
            app.zenly.android.feature.base.scheduling.b r3 = r3.mo6569a(r5)
            io.reactivex.e r2 = r2.mo36428a(r3)
            com.snap.ui.recycling.adapter.b r14 = new com.snap.ui.recycling.adapter.b
            com.snap.ui.event.EventDispatcher r1 = r1.mo34447a()
            java.lang.String r3 = "bus.eventDispatcher"
            kotlin.jvm.internal.C12932j.m33815a(r1, r3)
            app.zenly.android.feature.base.scheduling.ZenlySchedulers r3 = r0.f13507i
            app.zenly.android.feature.base.scheduling.b r3 = r3.getComputation()
            java.lang.String r5 = "recommendFriends"
            app.zenly.android.feature.base.scheduling.b r11 = r3.mo6569a(r5)
            app.zenly.android.feature.base.scheduling.ZenlySchedulers r3 = r0.f13507i
            app.zenly.android.feature.base.scheduling.b r3 = r3.getMainThread()
            app.zenly.android.feature.base.scheduling.b r15 = r3.mo6569a(r5)
            app.zenly.locator.recommendation.section.a r3 = new app.zenly.locator.recommendation.section.a
            java.lang.String r6 = r17.mo12575c()
            java.lang.String r5 = "queryObservable"
            kotlin.jvm.internal.C12932j.m33815a(r2, r5)
            app.zenly.locator.recommendation.h r5 = r0.f13510l
            if (r5 == 0) goto L_0x01d2
            app.zenly.locator.recommendation.k r8 = r5.mo12619b()
            co.znly.core.ZenlyCore r5 = app.zenly.locator.p143s.p148l.C5448c.m15478a()
            java.lang.String r7 = r17.mo12575c()
            io.reactivex.e r9 = r5.userPublicMutualFriendsState(r7)
            java.lang.String r5 = "ZenlyCoreProvider.get().…riendsState(newComerUuid)"
            kotlin.jvm.internal.C12932j.m33815a(r9, r5)
            app.zenly.locator.recommendation.n.a r10 = r0.f13509k
            if (r10 == 0) goto L_0x01cc
            r5 = r3
            r7 = r2
            r5.<init>(r6, r7, r8, r9, r10)
            java.util.List r8 = kotlin.collections.C12846n.m33635a(r3)
            r9 = 0
            r10 = 32
            r16 = 0
            r3 = r14
            r5 = r1
            r6 = r11
            r7 = r15
            r11 = r16
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r0.f13508j = r14
            io.reactivex.disposables.Disposable r1 = r2.mo36508m()
            java.lang.String r2 = "queryObservable\n            .subscribe()"
            kotlin.jvm.internal.C12932j.m33815a(r1, r2)
            io.reactivex.disposables.b r2 = r0.f13506h
            p389io.reactivex.p405m.C12773a.m33432a(r1, r2)
            int r1 = app.zenly.locator.C3891l.title
            android.view.View r1 = r0.mo12572a(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r2 = "title"
            kotlin.jvm.internal.C12932j.m33815a(r1, r2)
            r2 = 2132017991(0x7f140347, float:1.9674276E38)
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r5 = 0
            java.lang.String r6 = r17.mo6614b()
            r4[r5] = r6
            java.lang.String r2 = r0.getString(r2, r4)
            r1.setText(r2)
            int r1 = app.zenly.locator.C3891l.search_bar
            android.view.View r1 = r0.mo12572a(r1)
            app.zenly.android.feature.polenta.widget.SearchBar r1 = (app.zenly.android.feature.polenta.widget.SearchBar) r1
            kotlin.jvm.internal.C12932j.m33815a(r1, r12)
            r2 = 4
            r1.setVisibility(r2)
            r17.m14887d()
            int r1 = app.zenly.locator.C3891l.recommend
            android.view.View r1 = r0.mo12572a(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r2 = "recommend"
            kotlin.jvm.internal.C12932j.m33815a(r1, r2)
            r2 = 0
            r1.setAlpha(r2)
            int r1 = app.zenly.locator.C3891l.title
            android.view.View r1 = r0.mo12572a(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            android.util.Property r2 = android.view.View.ALPHA
            r4 = 2
            float[] r4 = new float[r4]
            r4 = {0, 1065353216} // fill-array
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofFloat(r1, r2, r4)
            app.zenly.locator.recommendation.b$d r2 = new app.zenly.locator.recommendation.b$d
            r2.<init>(r0)
            r1.addListener(r2)
            r1.start()
            r0.f13512n = r1
            int r1 = app.zenly.locator.C3891l.recycler_view
            android.view.View r1 = r0.mo12572a(r1)
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            r1.setHasFixedSize(r3)
            int r1 = app.zenly.locator.C3891l.recycler_view
            android.view.View r1 = r0.mo12572a(r1)
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            java.lang.String r2 = "recycler_view"
            kotlin.jvm.internal.C12932j.m33815a(r1, r2)
            r1.setItemAnimator(r13)
            int r1 = app.zenly.locator.C3891l.recommend
            android.view.View r1 = r0.mo12572a(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            app.zenly.locator.recommendation.b$f r2 = new app.zenly.locator.recommendation.b$f
            r2.<init>(r0)
            r1.setOnClickListener(r2)
            com.snap.ui.recycling.adapter.b r1 = r0.f13508j
            if (r1 == 0) goto L_0x01c6
            io.reactivex.disposables.Disposable r1 = r1.mo34464b()
            io.reactivex.disposables.b r2 = r0.f13506h
            p389io.reactivex.p405m.C12773a.m33432a(r1, r2)
            return
        L_0x01c6:
            java.lang.String r1 = "recommendFriendsAdapter"
            kotlin.jvm.internal.C12932j.m33820c(r1)
            throw r13
        L_0x01cc:
            java.lang.String r1 = "presenter"
            kotlin.jvm.internal.C12932j.m33820c(r1)
            throw r13
        L_0x01d2:
            java.lang.String r1 = "recommendationModule"
            kotlin.jvm.internal.C12932j.m33820c(r1)
            throw r13
        L_0x01d8:
            java.lang.String r1 = "searchModeHelper"
            kotlin.jvm.internal.C12932j.m33820c(r1)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.recommendation.C5234b.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        C12932j.m33818b(view, "view");
        C12932j.m33818b(rect, "insets");
        super.onWindowInsetsChanged(view, rect);
        ConstraintLayout constraintLayout = (ConstraintLayout) mo12572a(C3891l.root_container);
        C12932j.m33815a((Object) constraintLayout, "root_container");
        constraintLayout.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: a */
    private final OnGlobalLayoutListener m14882a(View view) {
        return new C5237c(this, view);
    }
}
