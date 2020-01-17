package app.zenly.locator.experimental.map;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import app.zenly.android.feature.base.scheduling.ZenlySchedulers;
import app.zenly.locator.R;
import app.zenly.locator.core.analytics.tracker.AnalyticsTracker;
import app.zenly.locator.core.p072ui.controller.C3103g.C3106c;
import app.zenly.locator.core.p072ui.controller.DraggableDialogController.ExitListener;
import app.zenly.locator.p143s.C5343a;
import app.zenly.locator.p143s.C5407g;
import app.zenly.locator.p143s.p148l.C5448c;
import app.zenly.locator.p196u.p197b.C5943a;
import app.zenly.locator.p207x.C6272z1;
import kotlin.C12899i;
import kotlin.C12954o;
import kotlin.C12956q;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12931i;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12946x;
import kotlin.reflect.KDeclarationContainer;
import p213co.znly.core.ZenlyCore;
import p213co.znly.core.vendor.com.google.protobuf.FieldMask;
import p213co.znly.models.ConfigurationProto$Configuration.C6770e.C6775d;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.core.C7086e0;
import p213co.znly.models.core.C7094f0;
import p213co.znly.models.core.C7101g0;
import p213co.znly.models.core.C7101g0.C7102a;
import p213co.znly.models.experimental.models.C7293c;
import p213co.znly.models.experimental.models.C7293c.C7294a;
import p389io.reactivex.C12279e;
import p389io.reactivex.C12286f;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.BiFunction;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.functions.Predicate;
import p389io.reactivex.p405m.C12773a;
import p389io.reactivex.p405m.C12774b;

/* renamed from: app.zenly.locator.experimental.map.a */
public final class C3723a implements NextUnlockController {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Activity f9974a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C6272z1 f9975b;

    /* renamed from: c */
    private View f9976c;

    /* renamed from: d */
    private final C12275b f9977d = new C12275b();

    /* renamed from: e */
    private final C12275b f9978e = new C12275b();

    /* renamed from: f */
    private final ZenlyCore f9979f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C5943a f9980g;

    /* renamed from: h */
    private final ZenlySchedulers f9981h;

    /* renamed from: app.zenly.locator.experimental.map.a$a */
    public static final class C3724a {
        private C3724a() {
        }

        public /* synthetic */ C3724a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.experimental.map.a$b */
    public static final class C3725b<T1, T2, R> implements BiFunction<T1, T2, R> {
        public final R apply(T1 t1, T2 t2) {
            C7086e0 e0Var = (C7086e0) t2;
            UserProto$User userProto$User = (UserProto$User) t1;
            C12932j.m33815a((Object) e0Var, "actionsEvent");
            return C12954o.m33853a(userProto$User, e0Var.getUserActions());
        }
    }

    /* renamed from: app.zenly.locator.experimental.map.a$c */
    static final /* synthetic */ class C3726c extends C12931i implements Function1<C12899i<? extends UserProto$User, ? extends C7293c>, C12956q> {
        C3726c(C3723a aVar) {
            super(1, aVar);
        }

        /* renamed from: a */
        public final void mo10265a(C12899i<UserProto$User, C7293c> iVar) {
            C12932j.m33818b(iVar, "p1");
            ((C3723a) this.f33505f).m11133a(iVar);
        }

        /* renamed from: d */
        public final KDeclarationContainer mo6620d() {
            return C12946x.m33834a(C3723a.class);
        }

        /* renamed from: f */
        public final String mo6621f() {
            return "hideNextUnlockIfConditionsMet(Lkotlin/Pair;)V";
        }

        public final String getName() {
            return "hideNextUnlockIfConditionsMet";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo10265a((C12899i) obj);
            return C12956q.f33541a;
        }
    }

    /* renamed from: app.zenly.locator.experimental.map.a$d */
    static final /* synthetic */ class C3727d extends C12931i implements Function1<C12899i<? extends UserProto$User, ? extends C7293c>, Boolean> {
        C3727d(C3723a aVar) {
            super(1, aVar);
        }

        /* renamed from: a */
        public final boolean mo10266a(C12899i<UserProto$User, C7293c> iVar) {
            C12932j.m33818b(iVar, "p1");
            return ((C3723a) this.f33505f).m11141c(iVar);
        }

        /* renamed from: d */
        public final KDeclarationContainer mo6620d() {
            return C12946x.m33834a(C3723a.class);
        }

        /* renamed from: f */
        public final String mo6621f() {
            return "userEligibleToExperiment(Lkotlin/Pair;)Z";
        }

        public final String getName() {
            return "userEligibleToExperiment";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(mo10266a((C12899i) obj));
        }
    }

    /* renamed from: app.zenly.locator.experimental.map.a$e */
    static final /* synthetic */ class C3728e extends C12931i implements Function1<C12899i<? extends UserProto$User, ? extends C7293c>, C12956q> {
        C3728e(C3723a aVar) {
            super(1, aVar);
        }

        /* renamed from: a */
        public final void mo10267a(C12899i<UserProto$User, C7293c> iVar) {
            C12932j.m33818b(iVar, "p1");
            ((C3723a) this.f33505f).m11137b(iVar);
        }

        /* renamed from: d */
        public final KDeclarationContainer mo6620d() {
            return C12946x.m33834a(C3723a.class);
        }

        /* renamed from: f */
        public final String mo6621f() {
            return "onUserEligibleDisplayButton(Lkotlin/Pair;)V";
        }

        public final String getName() {
            return "onUserEligibleDisplayButton";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo10267a((C12899i) obj);
            return C12956q.f33541a;
        }
    }

    /* renamed from: app.zenly.locator.experimental.map.a$f */
    static final class C3729f implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C3723a f9982e;

        /* renamed from: f */
        final /* synthetic */ C12899i f9983f;

        /* renamed from: app.zenly.locator.experimental.map.a$f$a */
        static final class C3730a implements OnClickListener {

            /* renamed from: e */
            final /* synthetic */ C3729f f9984e;

            C3730a(C3729f fVar) {
                this.f9984e = fVar;
            }

            public final void onClick(View view) {
                C6272z1 c = this.f9984e.f9982e.f9975b;
                if (c != null) {
                    c.onInboxAddFriends();
                }
                this.f9984e.f9982e.f9980g.mo13644b();
            }
        }

        /* renamed from: app.zenly.locator.experimental.map.a$f$b */
        static final class C3731b implements ExitListener {

            /* renamed from: a */
            final /* synthetic */ C3729f f9985a;

            C3731b(C3729f fVar) {
                this.f9985a = fVar;
            }

            public final void onExit() {
                this.f9985a.f9982e.m11135b();
            }
        }

        C3729f(C3723a aVar, C12899i iVar) {
            this.f9982e = aVar;
            this.f9983f = iVar;
        }

        public final void onClick(View view) {
            Activity a = this.f9982e.f9974a;
            if (a != null) {
                this.f9982e.f9980g.mo13649c();
                this.f9982e.m11139c();
                int friendsCount = 3 - ((UserProto$User) this.f9983f.mo37204c()).getFriendsCount();
                Context context = C3723a.m11142d(this.f9982e).getContext();
                C12932j.m33815a((Object) context, "nextUnlockButton.context");
                String quantityString = context.getResources().getQuantityString(R.plurals.z_track4exp1var1_modal_button, friendsCount, new Object[]{Integer.valueOf(friendsCount)});
                C12932j.m33815a((Object) quantityString, "resources.getQuantityStr…ndCount\n                )");
                C3106c cVar = new C3106c(C3723a.m11142d(this.f9982e).getContext());
                cVar.mo9349f((int) R.string.z_track4exp2var1_modal_title_watchers);
                cVar.mo9348e((int) R.string.z_track4exp1var1_modal_subtitle);
                cVar.mo9333a(LayoutInflater.from(C3723a.m11142d(this.f9982e).getContext()).inflate(R.layout.z_track4exp2var1_watchers_locked_dialog, null));
                cVar.mo9347d(2131231364);
                cVar.mo9338a(quantityString, null, new C3730a(this));
                cVar.mo9300a((ExitListener) new C3731b(this)).mo9344b().mo9296j(a);
            }
        }
    }

    static {
        new C3724a(null);
    }

    public C3723a(ZenlyCore zenlyCore, C5943a aVar, ZenlySchedulers zenlySchedulers) {
        C12932j.m33818b(zenlyCore, "zenlyCore");
        C12932j.m33818b(aVar, "experimentalAnalytics");
        C12932j.m33818b(zenlySchedulers, "schedulers");
        this.f9979f = zenlyCore;
        this.f9980g = aVar;
        this.f9981h = zenlySchedulers;
    }

    /* renamed from: d */
    public static final /* synthetic */ View m11142d(C3723a aVar) {
        View view = aVar.f9976c;
        if (view != null) {
            return view;
        }
        C12932j.m33820c("nextUnlockButton");
        throw null;
    }

    public void onAttach(C6272z1 z1Var, Activity activity) {
        C12932j.m33818b(z1Var, "navigationController");
        C12932j.m33818b(activity, "activity");
        this.f9975b = z1Var;
        this.f9974a = activity;
        m11131a();
    }

    public void onCreateView(View view) {
        C12932j.m33818b(view, "root");
        View findViewById = view.findViewById(R.id.btn_next_unlock);
        C12932j.m33815a((Object) findViewById, "root.findViewById(R.id.btn_next_unlock)");
        this.f9976c = findViewById;
    }

    public void onDetach() {
        this.f9975b = null;
        this.f9974a = null;
        this.f9977d.mo36401a();
        this.f9978e.mo36401a();
    }

    public void onDisplayGathering() {
        m11135b();
    }

    public void onEnterDiscoverMode() {
        m11135b();
    }

    public void onExitDiscoverMode() {
        m11131a();
    }

    public void onGatheringCleared() {
        m11131a();
    }

    public void onViewPagerScrolled(float f, int i) {
        float min = Math.min(1.0f, f * ((float) 2));
        View view = this.f9976c;
        if (view != null) {
            float f2 = 1.0f - min;
            view.setAlpha(f2);
            view.setScaleX(f2);
            view.setScaleY(f2);
            view.setTranslationY(((float) i) * 2.0f * min);
            return;
        }
        C12932j.m33820c("nextUnlockButton");
        throw null;
    }

    /* renamed from: a */
    private final void m11131a() {
        C12774b bVar = C12774b.f33320a;
        C12279e userMeStream = this.f9979f.userMeStream();
        C12932j.m33815a((Object) userMeStream, "zenlyCore.userMeStream()");
        C12279e userActionsFetchStream = this.f9979f.userActionsFetchStream((C7094f0) C7094f0.newBuilder().build());
        C12932j.m33815a((Object) userActionsFetchStream, "zenlyCore.userActionsFet…   .build()\n            )");
        Disposable d = C12279e.m32610a((ObservableSource<? extends T1>) userMeStream, (ObservableSource<? extends T2>) userActionsFetchStream, (BiFunction<? super T1, ? super T2, ? extends R>) new C3725b<Object,Object,Object>()).mo36455b((Consumer<? super T>) new C3732b<Object>(new C3726c(this))).mo36459b((Predicate<? super T>) new C3733c<Object>(new C3727d(this))).mo36428a((C12286f) this.f9981h.getMainThread()).mo36476d((Consumer<? super T>) new C3732b<Object>(new C3728e(this)));
        C12932j.m33815a((Object) d, "Observables.combineLates…serEligibleDisplayButton)");
        C12773a.m33432a(d, this.f9977d);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m11135b() {
        this.f9977d.mo36401a();
        View view = this.f9976c;
        if (view != null) {
            view.setVisibility(8);
        } else {
            C12932j.m33820c("nextUnlockButton");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final boolean m11141c(C12899i<UserProto$User, C7293c> iVar) {
        int friendsCount = ((UserProto$User) iVar.mo37204c()).getFriendsCount();
        if (1 <= friendsCount && 3 > friendsCount && !((C7293c) iVar.mo37205d()).getWatchersHighlightDisplayed()) {
            View view = this.f9976c;
            if (view == null) {
                C12932j.m33820c("nextUnlockButton");
                throw null;
            } else if (view.getVisibility() != 0) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m11139c() {
        ZenlyCore zenlyCore = this.f9979f;
        C7102a newBuilder = C7101g0.newBuilder();
        newBuilder.mo19120a((FieldMask) FieldMask.newBuilder().addPaths("actions.watchers_highlight_displayed").build());
        C7294a newBuilder2 = C7293c.newBuilder();
        newBuilder2.mo19206a(true);
        newBuilder.mo19121a((C7293c) newBuilder2.build());
        Disposable c = zenlyCore.userActionsUpdate((C7101g0) newBuilder.build()).mo36547c();
        C12932j.m33815a((Object) c, "zenlyCore.userActionsUpd…\n            .subscribe()");
        C12773a.m33432a(c, this.f9978e);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m11137b(C12899i<UserProto$User, C7293c> iVar) {
        Activity activity = this.f9974a;
        if (activity != null) {
            C3737f fVar = new C3737f(C5407g.f13966d.mo12991a(activity).mo12986h());
            if (!fVar.mo10272a()) {
                C5343a U = C5343a.m15160U();
                C12932j.m33815a((Object) U, "Analytics.get()");
                AnalyticsTracker a = U.mo12806a();
                C12932j.m33815a((Object) a, "Analytics.get().tracker");
                new C5943a(a, C5448c.m15478a()).mo13642a(C6775d.GROUP_IN_EXPERIMENT);
                fVar.mo10271a(true);
            }
            if (!fVar.mo10274b()) {
                this.f9980g.mo13651d();
                fVar.mo10273b(true);
            }
        }
        View view = this.f9976c;
        String str = "nextUnlockButton";
        if (view != null) {
            view.setVisibility(0);
            view.setAlpha(0.0f);
            view.animate().alpha(1.0f).start();
            View view2 = this.f9976c;
            if (view2 != null) {
                view2.setOnClickListener(new C3729f(this, iVar));
            } else {
                C12932j.m33820c(str);
                throw null;
            }
        } else {
            C12932j.m33820c(str);
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m11133a(C12899i<UserProto$User, C7293c> iVar) {
        if (((UserProto$User) iVar.mo37204c()).getFriendsCount() >= 3 || ((C7293c) iVar.mo37205d()).getWatchersHighlightDisplayed()) {
            m11135b();
        }
    }
}
