package app.zenly.locator.chat.p055o5;

import app.zenly.android.feature.base.scheduling.C1351e;
import app.zenly.android.feature.base.scheduling.ZenlySchedulers;
import app.zenly.locator.chat.C1893c5;
import app.zenly.locator.chat.C1893c5.C1894a;
import app.zenly.locator.chat.C1956d5;
import app.zenly.locator.chat.C2382x4;
import app.zenly.locator.core.manager.C2718k5;
import app.zenly.locator.core.manager.p070t5.C2831a;
import java.util.concurrent.TimeUnit;
import kotlin.C12899i;
import kotlin.C12954o;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import kotlin.jvm.internal.C12940r;
import kotlin.jvm.internal.C12941s;
import kotlin.jvm.internal.C12946x;
import kotlin.reflect.KProperty;
import p213co.znly.models.C7391m1;
import p213co.znly.models.UserProto$User;
import p387h.p388a.C12143a;
import p389io.reactivex.C12279e;
import p389io.reactivex.C12286f;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.BiFunction;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.functions.Function;
import p389io.reactivex.functions.Function3;
import p389io.reactivex.p402j.C12767a;
import p389io.reactivex.p405m.C12773a;
import p389io.reactivex.p405m.C12774b;

/* renamed from: app.zenly.locator.chat.o5.k */
public final class C2166k {

    /* renamed from: i */
    static final /* synthetic */ KProperty[] f6680i;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final ZenlySchedulers f6681a = C1351e.m6372a(C2382x4.f7181b.mo19916a("statusPresenter"));

    /* renamed from: b */
    private final C12275b f6682b = new C12275b();

    /* renamed from: c */
    private final Lazy f6683c;

    /* renamed from: d */
    private final Lazy f6684d;

    /* renamed from: e */
    private final Lazy f6685e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C1956d5 f6686f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C1893c5 f6687g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C2182l f6688h;

    /* renamed from: app.zenly.locator.chat.o5.k$a */
    static final class C2167a extends C12933k implements Function0<C12767a<C7391m1>> {

        /* renamed from: f */
        final /* synthetic */ C2166k f6689f;

        /* renamed from: g */
        final /* synthetic */ C12279e f6690g;

        /* renamed from: app.zenly.locator.chat.o5.k$a$a */
        public static final class C2168a<T1, T2, T3, R> implements Function3<T1, T2, T3, R> {
            public final R apply(T1 t1, T2 t2, T3 t3) {
                C1894a aVar = (C1894a) t3;
                R r = (C7391m1) t1;
                if (((Boolean) t2).booleanValue()) {
                    C12932j.m33815a((Object) aVar, "relationship");
                    if (aVar.mo7627a()) {
                        return r;
                    }
                }
                return C7391m1.UNKNOWN;
            }
        }

        /* renamed from: app.zenly.locator.chat.o5.k$a$b */
        static final class C2169b<T, R> implements Function<Throwable, C7391m1> {

            /* renamed from: e */
            public static final C2169b f6691e = new C2169b();

            C2169b() {
            }

            /* renamed from: a */
            public final C7391m1 apply(Throwable th) {
                C12932j.m33818b(th, "it");
                return C7391m1.UNKNOWN;
            }
        }

        C2167a(C2166k kVar, C12279e eVar) {
            this.f6689f = kVar;
            this.f6690g = eVar;
            super(0);
        }

        public final C12767a<C7391m1> invoke() {
            C12774b bVar = C12774b.f33320a;
            C12279e a = this.f6689f.f6686f.mo7732a();
            C12932j.m33815a((Object) a, "chatViewModel.activityStream()");
            C12279e eVar = this.f6690g;
            C12279e c = this.f6689f.f6687g.mo7626c();
            C12932j.m33815a((Object) c, "userViewModel.relationship()");
            return C12279e.m32609a((ObservableSource<? extends T1>) a, (ObservableSource<? extends T2>) eVar, (ObservableSource<? extends T3>) c, (Function3<? super T1, ? super T2, ? super T3, ? extends R>) new C2168a<Object,Object,Object,Object>()).mo36504k(C2169b.f6691e).mo36477d().mo36503j();
        }
    }

    /* renamed from: app.zenly.locator.chat.o5.k$b */
    static final class C2170b extends C12933k implements Function0<C2144g> {

        /* renamed from: f */
        final /* synthetic */ C2166k f6692f;

        C2170b(C2166k kVar) {
            this.f6692f = kVar;
            super(0);
        }

        public final C2144g invoke() {
            C12767a a = this.f6692f.m7940c();
            C12932j.m33815a((Object) a, "activityStream");
            return new C2144g(a);
        }
    }

    /* renamed from: app.zenly.locator.chat.o5.k$c */
    static final class C2171c extends C12933k implements Function0<C2146h> {

        /* renamed from: f */
        final /* synthetic */ C2166k f6693f;

        /* renamed from: g */
        final /* synthetic */ C2718k5 f6694g;

        /* renamed from: h */
        final /* synthetic */ C12279e f6695h;

        C2171c(C2166k kVar, C2718k5 k5Var, C12279e eVar) {
            this.f6693f = kVar;
            this.f6694g = k5Var;
            this.f6695h = eVar;
            super(0);
        }

        public final C2146h invoke() {
            C2718k5 k5Var = this.f6694g;
            C12279e eVar = this.f6695h;
            C12767a a = this.f6693f.m7940c();
            C12932j.m33815a((Object) a, "activityStream");
            return new C2146h(k5Var, eVar, a);
        }
    }

    /* renamed from: app.zenly.locator.chat.o5.k$d */
    public static final class C2172d<T1, T2, R> implements BiFunction<T1, T2, R> {
        public final R apply(T1 t1, T2 t2) {
            return C12954o.m33853a((C2137f) t1, (C2186n) t2);
        }
    }

    /* renamed from: app.zenly.locator.chat.o5.k$e */
    public static final class C2173e<T1, T2, R> implements BiFunction<T1, T2, R> {
        public final R apply(T1 t1, T2 t2) {
            return C12954o.m33853a((C2122c) t1, (C2186n) t2);
        }
    }

    /* renamed from: app.zenly.locator.chat.o5.k$f */
    static final class C2174f<T> implements Consumer<C7391m1> {

        /* renamed from: e */
        final /* synthetic */ C2166k f6696e;

        C2174f(C2166k kVar) {
            this.f6696e = kVar;
        }

        /* renamed from: a */
        public final void accept(C7391m1 m1Var) {
            C2182l d = this.f6696e.f6688h;
            C12932j.m33815a((Object) m1Var, "it");
            d.mo8009a(m1Var);
        }
    }

    /* renamed from: app.zenly.locator.chat.o5.k$g */
    static final class C2175g<T, R> implements Function<T, ObservableSource<? extends R>> {

        /* renamed from: e */
        final /* synthetic */ C2166k f6697e;

        /* renamed from: app.zenly.locator.chat.o5.k$g$a */
        static final class C2176a<T, R> implements Function<T, R> {

            /* renamed from: e */
            final /* synthetic */ C12899i f6698e;

            C2176a(C12899i iVar) {
                this.f6698e = iVar;
            }

            /* renamed from: a */
            public final C12899i<C2137f, C2186n> apply(Long l) {
                C12932j.m33818b(l, "it");
                return this.f6698e;
            }
        }

        C2175g(C2166k kVar) {
            this.f6697e = kVar;
        }

        /* renamed from: a */
        public final C12279e<C12899i<C2137f, C2186n>> apply(C12899i<? extends C2137f, ? extends C2186n> iVar) {
            C12932j.m33818b(iVar, "data");
            C2190o a = ((C2137f) iVar.mo37204c()).mo7952a();
            if (a != null) {
                return C12279e.m32599a(a.mo8016a(), a.mo8017b(), TimeUnit.MILLISECONDS).mo36485d(Long.valueOf(0)).mo36452b((C12286f) this.f6697e.f6681a.getComputation()).mo36501i(new C2176a(iVar));
            }
            return C12279e.m32626e(iVar);
        }
    }

    /* renamed from: app.zenly.locator.chat.o5.k$h */
    static final class C2177h<T> implements Consumer<C12899i<? extends C2137f, ? extends C2186n>> {

        /* renamed from: e */
        final /* synthetic */ C2166k f6699e;

        C2177h(C2166k kVar) {
            this.f6699e = kVar;
        }

        /* renamed from: a */
        public final void accept(C12899i<? extends C2137f, ? extends C2186n> iVar) {
            C2137f fVar = (C2137f) iVar.mo37202a();
            C2186n nVar = (C2186n) iVar.mo37203b();
            C2182l d = this.f6699e.f6688h;
            C12932j.m33815a((Object) nVar, "temporaryStatus");
            d.mo8007a(fVar, nVar);
        }
    }

    /* renamed from: app.zenly.locator.chat.o5.k$i */
    static final class C2178i<T> implements Consumer<C12899i<? extends C2122c, ? extends C2186n>> {

        /* renamed from: e */
        final /* synthetic */ C2166k f6700e;

        C2178i(C2166k kVar) {
            this.f6700e = kVar;
        }

        /* renamed from: a */
        public final void accept(C12899i<? extends C2122c, ? extends C2186n> iVar) {
            C2122c cVar = (C2122c) iVar.mo37202a();
            C2186n nVar = (C2186n) iVar.mo37203b();
            C2182l d = this.f6700e.f6688h;
            C12932j.m33815a((Object) nVar, "temporaryStatus");
            d.mo8006a(cVar, nVar);
        }
    }

    /* renamed from: app.zenly.locator.chat.o5.k$j */
    static final class C2179j<T> implements Consumer<Throwable> {

        /* renamed from: e */
        public static final C2179j f6701e = new C2179j();

        C2179j() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C12143a.m32032b(th, "Failed updating activity indicator", new Object[0]);
        }
    }

    /* renamed from: app.zenly.locator.chat.o5.k$k */
    static final class C2180k<T> implements Consumer<UserProto$User> {

        /* renamed from: e */
        final /* synthetic */ C2166k f6702e;

        C2180k(C2166k kVar) {
            this.f6702e = kVar;
        }

        /* renamed from: a */
        public final void accept(UserProto$User userProto$User) {
            C2182l d = this.f6702e.f6688h;
            C12932j.m33815a((Object) userProto$User, "user");
            d.mo8008a(userProto$User);
        }
    }

    /* renamed from: app.zenly.locator.chat.o5.k$l */
    static final class C2181l<T> implements Consumer<Throwable> {

        /* renamed from: e */
        public static final C2181l f6703e = new C2181l();

        C2181l() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C12143a.m32032b(th, "Failed getting user", new Object[0]);
        }
    }

    static {
        Class<C2166k> cls = C2166k.class;
        C12941s sVar = new C12941s(C12946x.m33834a((Class) cls), "activityStream", "getActivityStream()Lio/reactivex/observables/ConnectableObservable;");
        C12946x.m33839a((C12940r) sVar);
        C12941s sVar2 = new C12941s(C12946x.m33834a((Class) cls), "statusObservableProvider", "getStatusObservableProvider()Lapp/zenly/locator/chat/status/StatusObservableProvider;");
        C12946x.m33839a((C12940r) sVar2);
        C12941s sVar3 = new C12941s(C12946x.m33834a((Class) cls), "statusInterruptObservableProvider", "getStatusInterruptObservableProvider()Lapp/zenly/locator/chat/status/StatusInterruptObservableProvider;");
        C12946x.m33839a((C12940r) sVar3);
        f6680i = new KProperty[]{sVar, sVar2, sVar3};
    }

    public C2166k(C2718k5 k5Var, C12279e<Boolean> eVar, C12279e<C2831a> eVar2, C1956d5 d5Var, C1893c5 c5Var, C2182l lVar) {
        C12932j.m33818b(k5Var, "friendsManager");
        C12932j.m33818b(eVar, "isFriendStream");
        C12932j.m33818b(eVar2, "friendStream");
        C12932j.m33818b(d5Var, "chatViewModel");
        C12932j.m33818b(c5Var, "userViewModel");
        C12932j.m33818b(lVar, "statusView");
        this.f6686f = d5Var;
        this.f6687g = c5Var;
        this.f6688h = lVar;
        this.f6683c = C12896f.m33751a(new C2167a(this, eVar));
        this.f6684d = C12896f.m33751a(new C2171c(this, k5Var, eVar2));
        this.f6685e = C12896f.m33751a(new C2170b(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final C12767a<C7391m1> m7940c() {
        Lazy lazy = this.f6683c;
        KProperty kProperty = f6680i[0];
        return (C12767a) lazy.getValue();
    }

    /* renamed from: d */
    private final C2144g m7941d() {
        Lazy lazy = this.f6685e;
        KProperty kProperty = f6680i[2];
        return (C2144g) lazy.getValue();
    }

    /* renamed from: e */
    private final C2146h m7944e() {
        Lazy lazy = this.f6684d;
        KProperty kProperty = f6680i[1];
        return (C2146h) lazy.getValue();
    }

    /* renamed from: a */
    public final void mo7993a() {
        Disposable d = m7941d().mo7977a().mo36428a((C12286f) this.f6681a.getMainThread()).mo36476d((Consumer<? super T>) new C2174f<Object>(this));
        C12932j.m33815a((Object) d, "statusInterruptObservabl…terrupt(it)\n            }");
        C12773a.m33432a(d, this.f6682b);
        C12767a j = m7944e().mo7981c().mo36503j();
        C12774b bVar = C12774b.f33320a;
        C12279e b = m7944e().mo7980b();
        C12932j.m33815a((Object) j, "temporaryStatusObservable");
        Disposable d2 = C12279e.m32610a((ObservableSource<? extends T1>) b, (ObservableSource<? extends T2>) j, (BiFunction<? super T1, ? super T2, ? extends R>) new C2172d<Object,Object,Object>()).mo36477d().mo36509m(new C2175g(this)).mo36428a((C12286f) this.f6681a.getMainThread()).mo36476d((Consumer<? super T>) new C2177h<Object>(this));
        C12932j.m33815a((Object) d2, "Observables.combineLates…raryStatus)\n            }");
        C12773a.m33432a(d2, this.f6682b);
        C12774b bVar2 = C12774b.f33320a;
        Disposable a = C12279e.m32610a((ObservableSource<? extends T1>) m7944e().mo7979a(), (ObservableSource<? extends T2>) j, (BiFunction<? super T1, ? super T2, ? extends R>) new C2173e<Object,Object,Object>()).mo36428a((C12286f) this.f6681a.getMainThread()).mo36412a((Consumer<? super T>) new C2178i<Object>(this), (Consumer<? super Throwable>) C2179j.f6701e);
        C12932j.m33815a((Object) a, "Observables.combineLates…dicator\") }\n            )");
        C12773a.m33432a(a, this.f6682b);
        C12773a.m33432a(m7944e().mo7982d(), this.f6682b);
        Disposable r = m7940c().mo36946r();
        C12932j.m33815a((Object) r, "activityStream.connect()");
        C12773a.m33432a(r, this.f6682b);
        Disposable r2 = j.mo36946r();
        C12932j.m33815a((Object) r2, "temporaryStatusObservable.connect()");
        C12773a.m33432a(r2, this.f6682b);
        Disposable a2 = this.f6687g.mo7622a().mo36428a((C12286f) this.f6681a.getMainThread()).mo36412a((Consumer<? super T>) new C2180k<Object>(this), (Consumer<? super Throwable>) C2181l.f6703e);
        C12932j.m33815a((Object) a2, "userViewModel.publicUser…ng user\") }\n            )");
        C12773a.m33432a(a2, this.f6682b);
    }

    /* renamed from: b */
    public final void mo7994b() {
        this.f6682b.mo36401a();
    }
}
