package app.zenly.locator.chat.p056p5;

import app.zenly.android.feature.base.scheduling.C1351e;
import app.zenly.android.feature.base.scheduling.ZenlySchedulers;
import app.zenly.locator.chat.C2196p4;
import app.zenly.locator.chat.C2382x4;
import app.zenly.locator.core.analytics.tracker.AnalyticsTracker;
import app.zenly.locator.core.manager.p070t5.C2831a;
import app.zenly.locator.core.models.C2879d0;
import app.zenly.locator.core.models.C2896p;
import app.zenly.locator.p143s.C5343a;
import kotlin.C12956q;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import p213co.znly.core.ZenlyCore;
import p213co.znly.models.services.C8171m4;
import p213co.znly.models.services.C8171m4.C8172a;
import p213co.znly.models.services.C8171m4.C8173b;
import p213co.znly.models.services.C8187n4;
import p387h.p388a.C12143a;
import p389io.reactivex.C12279e;
import p389io.reactivex.C12286f;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.Action;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.functions.Function;
import p389io.reactivex.functions.Predicate;
import p389io.reactivex.p390h.p392c.C12295a;
import p389io.reactivex.p405m.C12773a;

/* renamed from: app.zenly.locator.chat.p5.a */
public final class C2197a {

    /* renamed from: a */
    private final ZenlySchedulers f6738a = C1351e.m6372a(C2382x4.f7181b.mo19916a("locationDisabledPresenter"));

    /* renamed from: b */
    private final C12275b f6739b = new C12275b();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C2196p4 f6740c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C2205b f6741d;

    /* renamed from: e */
    private final C12279e<C2831a> f6742e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final ZenlyCore f6743f;

    /* renamed from: app.zenly.locator.chat.p5.a$a */
    static final class C2198a extends C12933k implements Function1<String, C12956q> {

        /* renamed from: f */
        final /* synthetic */ C2197a f6744f;

        /* renamed from: app.zenly.locator.chat.p5.a$a$a */
        static final class C2199a<T> implements Consumer<C8187n4> {

            /* renamed from: e */
            public static final C2199a f6745e = new C2199a();

            C2199a() {
            }

            /* renamed from: a */
            public final void accept(C8187n4 n4Var) {
                C12143a.m32027a("userRequest onNext", new Object[0]);
            }
        }

        /* renamed from: app.zenly.locator.chat.p5.a$a$b */
        static final class C2200b<T> implements Consumer<Throwable> {

            /* renamed from: e */
            public static final C2200b f6746e = new C2200b();

            C2200b() {
            }

            /* renamed from: a */
            public final void accept(Throwable th) {
                C12143a.m32034c(th, "userRequest onError", new Object[0]);
            }
        }

        /* renamed from: app.zenly.locator.chat.p5.a$a$c */
        static final class C2201c implements Action {

            /* renamed from: a */
            public static final C2201c f6747a = new C2201c();

            C2201c() {
            }

            public final void run() {
                C12143a.m32027a("userRequest onComplete", new Object[0]);
            }
        }

        C2198a(C2197a aVar) {
            this.f6744f = aVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo8024a(String str) {
            C12932j.m33818b(str, "userUuid");
            this.f6744f.f6740c.mo8021b();
            C8172a newBuilder = C8171m4.newBuilder();
            C12932j.m33815a((Object) newBuilder, "requestRequest");
            newBuilder.mo22164a(str);
            newBuilder.mo22163a(C8173b.ENABLE_ALWAYS_ON_LOCATION);
            this.f6744f.f6743f.userRequest((C8171m4) newBuilder.build()).mo36428a(C12295a.m32802a()).mo36413a((Consumer<? super T>) C2199a.f6745e, (Consumer<? super Throwable>) C2200b.f6746e, (Action) C2201c.f6747a);
            this.f6744f.f6741d.mo8035d();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo8024a((String) obj);
            return C12956q.f33541a;
        }
    }

    /* renamed from: app.zenly.locator.chat.p5.a$b */
    static final class C2202b<T> implements Predicate<C2831a> {

        /* renamed from: e */
        public static final C2202b f6748e = new C2202b();

        C2202b() {
        }

        /* renamed from: a */
        public final boolean test(C2831a aVar) {
            C12932j.m33818b(aVar, "it");
            return aVar.mo8858c().f8198b != null && C2831a.m9302a(aVar.mo8857b(), 4227072);
        }
    }

    /* renamed from: app.zenly.locator.chat.p5.a$c */
    static final class C2203c<T, R> implements Function<T, R> {

        /* renamed from: e */
        public static final C2203c f6749e = new C2203c();

        C2203c() {
        }

        /* renamed from: a */
        public final C2896p apply(C2831a aVar) {
            C12932j.m33818b(aVar, "it");
            return aVar.mo8858c();
        }
    }

    /* renamed from: app.zenly.locator.chat.p5.a$d */
    static final class C2204d<T> implements Consumer<C2896p> {

        /* renamed from: e */
        final /* synthetic */ C2197a f6750e;

        C2204d(C2197a aVar) {
            this.f6750e = aVar;
        }

        /* renamed from: a */
        public final void accept(C2896p pVar) {
            C2197a aVar = this.f6750e;
            C12932j.m33815a((Object) pVar, "it");
            aVar.m7999a(pVar);
        }
    }

    public C2197a(C2205b bVar, C12279e<C2831a> eVar, ZenlyCore zenlyCore) {
        C12932j.m33818b(bVar, "viewController");
        C12932j.m33818b(eVar, "friendStream");
        C12932j.m33818b(zenlyCore, "core");
        this.f6741d = bVar;
        this.f6742e = eVar;
        this.f6743f = zenlyCore;
        C5343a U = C5343a.m15160U();
        C12932j.m33815a((Object) U, "Analytics.get()");
        AnalyticsTracker a = U.mo12806a();
        C12932j.m33815a((Object) a, "Analytics.get().tracker");
        this.f6740c = new C2196p4(a);
        this.f6741d.mo8032a((Function1<? super String, C12956q>) new C2198a<Object,C12956q>(this));
    }

    /* renamed from: b */
    public final void mo8023b() {
        this.f6739b.mo36401a();
    }

    /* renamed from: a */
    public final void mo8022a() {
        Disposable d = this.f6742e.mo36459b((Predicate<? super T>) C2202b.f6748e).mo36501i(C2203c.f6749e).mo36428a((C12286f) this.f6738a.getMainThread()).mo36476d((Consumer<? super T>) new C2204d<Object>(this));
        C12932j.m33815a((Object) d, "friendStream\n           …be { onFriendUpdate(it) }");
        C12773a.m33432a(d, this.f6739b);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m7999a(C2896p pVar) {
        if (pVar.f8214r || pVar.f8193B) {
            this.f6741d.mo8033b();
            return;
        }
        C2205b bVar = this.f6741d;
        C2879d0 d0Var = pVar.f8198b;
        C12932j.m33815a((Object) d0Var, "friend.user");
        bVar.mo8031a(d0Var);
        this.f6740c.mo8020a();
    }
}
