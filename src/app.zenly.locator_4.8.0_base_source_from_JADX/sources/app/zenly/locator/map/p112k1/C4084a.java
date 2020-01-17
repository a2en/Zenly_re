package app.zenly.locator.map.p112k1;

import app.zenly.android.feature.base.p009di.Provider;
import app.zenly.android.feature.base.scheduling.C1351e;
import app.zenly.android.feature.base.scheduling.ZenlySchedulers;
import app.zenly.locator.core.contracts.MapControllerContract.C2457a;
import app.zenly.locator.core.contracts.MapControllerContract.C2458b;
import app.zenly.locator.core.manager.C2718k5;
import app.zenly.locator.core.manager.p070t5.C2831a;
import app.zenly.locator.core.models.C2896p;
import app.zenly.locator.map.C4409z0;
import app.zenly.locator.map.p109i1.C4050q1;
import app.zenly.locator.map.p109i1.C4050q1.C4051a;
import app.zenly.locator.map.p109i1.C4050q1.C4051a.C4052a;
import app.zenly.locator.map.p109i1.C4050q1.C4051a.C4053b;
import app.zenly.locator.map.view.CapsulesStatesView;
import app.zenly.locator.p143s.p150n.C5459d;
import kotlin.C12899i;
import kotlin.C12956q;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12931i;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import kotlin.jvm.internal.C12946x;
import kotlin.reflect.KDeclarationContainer;
import p213co.znly.models.services.usermonitor.C8316b;
import p389io.reactivex.C12279e;
import p389io.reactivex.C12286f;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.functions.Function;
import p389io.reactivex.functions.Predicate;
import p389io.reactivex.p405m.C12773a;
import p389io.reactivex.p405m.C12774b;
import p389io.reactivex.p406n.C12785a;
import p389io.reactivex.p406n.C12789c;

/* renamed from: app.zenly.locator.map.k1.a */
public final class C4084a {
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final C2896p f10714k = new C2896p();

    /* renamed from: a */
    private final ZenlySchedulers f10715a = C1351e.m6372a(C4409z0.f11896b.mo19916a("CapsuleStatePresenter"));

    /* renamed from: b */
    private final C12785a<String> f10716b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C12785a<C2457a> f10717c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C12789c<Boolean> f10718d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C12789c<Boolean> f10719e;

    /* renamed from: f */
    private final C12275b f10720f;

    /* renamed from: g */
    private String f10721g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final CapsulesStatesView f10722h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final Provider<C2718k5> f10723i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C4050q1 f10724j;

    /* renamed from: app.zenly.locator.map.k1.a$a */
    static final class C4085a extends C12933k implements Function1<C2457a, C12956q> {

        /* renamed from: f */
        final /* synthetic */ C4084a f10725f;

        C4085a(C4084a aVar) {
            this.f10725f = aVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo10754a(C2457a aVar) {
            C12932j.m33818b(aVar, "it");
            this.f10725f.f10717c.onNext(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo10754a((C2457a) obj);
            return C12956q.f33541a;
        }
    }

    /* renamed from: app.zenly.locator.map.k1.a$b */
    public static final class C4086b {
        private C4086b() {
        }

        public /* synthetic */ C4086b(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.map.k1.a$c */
    static final class C4087c<T, R> implements Function<T, R> {

        /* renamed from: e */
        public static final C4087c f10726e = new C4087c();

        C4087c() {
        }

        /* renamed from: a */
        public final C2896p apply(C2831a aVar) {
            C12932j.m33818b(aVar, "it");
            return aVar.mo8858c();
        }
    }

    /* renamed from: app.zenly.locator.map.k1.a$d */
    static final class C4088d<T, R> implements Function<T, ObservableSource<? extends R>> {

        /* renamed from: e */
        final /* synthetic */ C4084a f10727e;

        /* renamed from: f */
        final /* synthetic */ Function1 f10728f;

        C4088d(C4084a aVar, Function1 function1) {
            this.f10727e = aVar;
            this.f10728f = function1;
        }

        /* renamed from: a */
        public final C12279e<Boolean> apply(C2896p pVar) {
            C12932j.m33818b(pVar, "it");
            return this.f10727e.f10724j.mo10708a((C4051a) this.f10728f.invoke(pVar)).mo36553e();
        }
    }

    /* renamed from: app.zenly.locator.map.k1.a$e */
    static final class C4089e<T, R> implements Function<T, R> {

        /* renamed from: e */
        public static final C4089e f10729e = new C4089e();

        C4089e() {
        }

        /* renamed from: a */
        public final boolean mo10757a(Boolean bool) {
            C12932j.m33818b(bool, "it");
            return !bool.booleanValue();
        }

        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            return Boolean.valueOf(mo10757a((Boolean) obj));
        }
    }

    /* renamed from: app.zenly.locator.map.k1.a$f */
    static final class C4090f<T, R> implements Function<T, ObservableSource<? extends R>> {

        /* renamed from: e */
        final /* synthetic */ C4084a f10730e;

        /* renamed from: f */
        final /* synthetic */ String f10731f;

        /* renamed from: g */
        final /* synthetic */ C8316b f10732g;

        /* renamed from: h */
        final /* synthetic */ Function1 f10733h;

        C4090f(C4084a aVar, String str, C8316b bVar, Function1 function1) {
            this.f10730e = aVar;
            this.f10731f = str;
            this.f10732g = bVar;
            this.f10733h = function1;
        }

        /* renamed from: a */
        public final C12279e<Boolean> apply(Boolean bool) {
            C12932j.m33818b(bool, "it");
            return this.f10730e.m11780a(this.f10731f, bool.booleanValue(), this.f10732g, this.f10733h);
        }
    }

    /* renamed from: app.zenly.locator.map.k1.a$g */
    static final class C4091g<T, R> implements Function<T, ObservableSource<? extends R>> {

        /* renamed from: e */
        final /* synthetic */ C4084a f10734e;

        /* renamed from: app.zenly.locator.map.k1.a$g$a */
        static final class C4092a<T> implements Predicate<C2831a> {

            /* renamed from: e */
            public static final C4092a f10735e = new C4092a();

            C4092a() {
            }

            /* renamed from: a */
            public final boolean test(C2831a aVar) {
                C12932j.m33818b(aVar, "it");
                return C2831a.m9302a(aVar.mo8857b(), 7507080);
            }
        }

        /* renamed from: app.zenly.locator.map.k1.a$g$b */
        static final class C4093b<T, R> implements Function<T, R> {

            /* renamed from: e */
            public static final C4093b f10736e = new C4093b();

            C4093b() {
            }

            /* renamed from: a */
            public final C2896p apply(C2831a aVar) {
                C12932j.m33818b(aVar, "friendEvent");
                return aVar.mo8858c();
            }
        }

        C4091g(C4084a aVar) {
            this.f10734e = aVar;
        }

        /* renamed from: a */
        public final C12279e<C2896p> apply(String str) {
            C12932j.m33818b(str, "uuid");
            if (str.length() == 0) {
                return C12279e.m32626e(C4084a.f10714k);
            }
            return ((C2718k5) this.f10734e.f10723i.get()).mo8789b(str).mo36459b((Predicate<? super T>) C4092a.f10735e).mo36501i(C4093b.f10736e);
        }
    }

    /* renamed from: app.zenly.locator.map.k1.a$h */
    static final class C4094h<T> implements Consumer<C2896p> {

        /* renamed from: e */
        final /* synthetic */ C4084a f10737e;

        C4094h(C4084a aVar) {
            this.f10737e = aVar;
        }

        /* renamed from: a */
        public final void accept(C2896p pVar) {
            if (C12932j.m33817a((Object) pVar, (Object) C4084a.f10714k)) {
                this.f10737e.f10722h.setFriend(null);
            } else {
                this.f10737e.f10722h.setFriend(pVar);
            }
        }
    }

    /* renamed from: app.zenly.locator.map.k1.a$i */
    static final class C4095i<T, R> implements Function<T, ObservableSource<? extends R>> {

        /* renamed from: e */
        final /* synthetic */ C4084a f10738e;

        /* renamed from: app.zenly.locator.map.k1.a$i$a */
        static final class C4096a extends C12933k implements Function1<C2896p, C4053b> {

            /* renamed from: f */
            public static final C4096a f10739f = new C4096a();

            C4096a() {
                super(1);
            }

            /* renamed from: a */
            public final C4053b invoke(C2896p pVar) {
                C12932j.m33818b(pVar, "it");
                String str = pVar.f8197a;
                C12932j.m33815a((Object) str, "it.uuid");
                return new C4053b(str, Long.valueOf(pVar.f8192A.mo8929c()));
            }
        }

        /* renamed from: app.zenly.locator.map.k1.a$i$b */
        static final class C4097b extends C12933k implements Function1<C2896p, C4052a> {

            /* renamed from: f */
            public static final C4097b f10740f = new C4097b();

            C4097b() {
                super(1);
            }

            /* renamed from: a */
            public final C4052a invoke(C2896p pVar) {
                C12932j.m33818b(pVar, "it");
                String str = pVar.f8197a;
                C12932j.m33815a((Object) str, "it.uuid");
                C5459d b = pVar.f8222z.mo8995d().mo9005c().mo9015b();
                if (b != null) {
                    C4052a aVar = new C4052a(str, b, pVar.f8222z.mo8995d().mo9005c().mo9016c(), pVar.f8222z.mo8995d().mo9005c().mo9017d(), Long.valueOf(pVar.f8222z.mo8995d().mo9005c().mo9014a()), pVar.f8222z.mo8995d().mo9006d() ? Long.valueOf(pVar.f8222z.mo8995d().mo8999a()) : null);
                    return aVar;
                }
                C12932j.m33814a();
                throw null;
            }
        }

        C4095i(C4084a aVar) {
            this.f10738e = aVar;
        }

        /* renamed from: a */
        public final C12279e<Boolean> apply(C12899i<? extends C2457a, String> iVar) {
            C12932j.m33818b(iVar, "<name for destructuring parameter 0>");
            C2457a aVar = (C2457a) iVar.mo37202a();
            String str = (String) iVar.mo37203b();
            if (aVar != null) {
                int i = C4103b.f10744a[aVar.ordinal()];
                String str2 = "uuid";
                if (i == 1) {
                    C4084a aVar2 = this.f10738e;
                    C12932j.m33815a((Object) str, str2);
                    return aVar2.m11779a(str, (C12279e<Boolean>) this.f10738e.f10718d, C8316b.OnWakeUp, (Function1<? super C2896p, ? extends C4051a>) C4096a.f10739f);
                } else if (i == 2) {
                    C4084a aVar3 = this.f10738e;
                    C12932j.m33815a((Object) str, str2);
                    return aVar3.m11779a(str, (C12279e<Boolean>) this.f10738e.f10719e, C8316b.OnEnterGeofence, (Function1<? super C2896p, ? extends C4051a>) C4097b.f10740f);
                }
            }
            C12279e<Boolean> e = C12279e.m32626e(Boolean.valueOf(false));
            C12932j.m33815a((Object) e, "Observable.just(false)");
            return e;
        }
    }

    /* renamed from: app.zenly.locator.map.k1.a$j */
    static final class C4098j<T> implements Consumer<Boolean> {

        /* renamed from: e */
        final /* synthetic */ C4084a f10741e;

        C4098j(C4084a aVar) {
            this.f10741e = aVar;
        }

        /* renamed from: a */
        public final void accept(Boolean bool) {
            CapsulesStatesView f = this.f10741e.f10722h;
            C12932j.m33815a((Object) bool, "it");
            f.setHasMonitoring(bool.booleanValue());
        }
    }

    /* renamed from: app.zenly.locator.map.k1.a$k */
    static final class C4099k<T, R> implements Function<T, R> {

        /* renamed from: e */
        public static final C4099k f10742e = new C4099k();

        C4099k() {
        }

        /* renamed from: a */
        public final boolean mo10767a(Boolean bool) {
            C12932j.m33818b(bool, "it");
            return !bool.booleanValue();
        }

        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            return Boolean.valueOf(mo10767a((Boolean) obj));
        }
    }

    /* renamed from: app.zenly.locator.map.k1.a$l */
    static final /* synthetic */ class C4100l extends C12931i implements Function1<Boolean, C12956q> {
        C4100l(C12789c cVar) {
            super(1, cVar);
        }

        /* renamed from: a */
        public final void mo10768a(boolean z) {
            ((C12789c) this.f33505f).onNext(Boolean.valueOf(z));
        }

        /* renamed from: d */
        public final KDeclarationContainer mo6620d() {
            return C12946x.m33834a(C12789c.class);
        }

        /* renamed from: f */
        public final String mo6621f() {
            return "onNext(Ljava/lang/Object;)V";
        }

        public final String getName() {
            return "onNext";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo10768a(((Boolean) obj).booleanValue());
            return C12956q.f33541a;
        }
    }

    /* renamed from: app.zenly.locator.map.k1.a$m */
    static final class C4101m<T, R> implements Function<T, R> {

        /* renamed from: e */
        public static final C4101m f10743e = new C4101m();

        C4101m() {
        }

        /* renamed from: a */
        public final boolean mo10769a(Boolean bool) {
            C12932j.m33818b(bool, "it");
            return !bool.booleanValue();
        }

        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            return Boolean.valueOf(mo10769a((Boolean) obj));
        }
    }

    /* renamed from: app.zenly.locator.map.k1.a$n */
    static final /* synthetic */ class C4102n extends C12931i implements Function1<Boolean, C12956q> {
        C4102n(C12789c cVar) {
            super(1, cVar);
        }

        /* renamed from: a */
        public final void mo10770a(boolean z) {
            ((C12789c) this.f33505f).onNext(Boolean.valueOf(z));
        }

        /* renamed from: d */
        public final KDeclarationContainer mo6620d() {
            return C12946x.m33834a(C12789c.class);
        }

        /* renamed from: f */
        public final String mo6621f() {
            return "onNext(Ljava/lang/Object;)V";
        }

        public final String getName() {
            return "onNext";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo10770a(((Boolean) obj).booleanValue());
            return C12956q.f33541a;
        }
    }

    static {
        new C4086b(null);
    }

    public C4084a(CapsulesStatesView capsulesStatesView, Provider<C2718k5> provider, C4050q1 q1Var) {
        C12932j.m33818b(capsulesStatesView, "view");
        C12932j.m33818b(provider, "friendsManager");
        C12932j.m33818b(q1Var, "userMonitoringStore");
        this.f10722h = capsulesStatesView;
        this.f10723i = provider;
        this.f10724j = q1Var;
        C12785a<String> h = C12785a.m33446h("");
        C12932j.m33815a((Object) h, "BehaviorSubject.createDefault(\"\")");
        this.f10716b = h;
        C12785a<C2457a> h2 = C12785a.m33446h(this.f10722h.getState());
        C12932j.m33815a((Object) h2, "BehaviorSubject.createDefault(view.state)");
        this.f10717c = h2;
        C12789c<Boolean> s = C12789c.m33462s();
        String str = "PublishSubject.create<Boolean>()";
        C12932j.m33815a((Object) s, str);
        this.f10718d = s;
        C12789c<Boolean> s2 = C12789c.m33462s();
        C12932j.m33815a((Object) s2, str);
        this.f10719e = s2;
        this.f10720f = new C12275b();
        this.f10722h.setOnStateChange(new C4085a(this));
    }

    /* renamed from: b */
    public final void mo10750b() {
        Disposable d = this.f10716b.mo36509m(new C4091g(this)).mo36476d((Consumer<? super T>) new C4094h<Object>(this));
        C12932j.m33815a((Object) d, "_focusedUuid\n           …          }\n            }");
        C12773a.m33432a(d, this.f10720f);
        Disposable d2 = C12774b.f33320a.mo36955a(this.f10717c, this.f10716b).mo36509m(new C4095i(this)).mo36428a((C12286f) this.f10715a.getMainThread()).mo36476d((Consumer<? super T>) new C4098j<Object>(this));
        C12932j.m33815a((Object) d2, "Observables.combineLates…toring = it\n            }");
        C12773a.m33432a(d2, this.f10720f);
    }

    /* renamed from: c */
    public final void mo10751c() {
        String str = this.f10721g;
        if (str != null) {
            this.f10724j.mo10709a(str, C8316b.OnEnterGeofence).mo36552d((Function<? super T, ? extends R>) C4099k.f10742e).mo36551d((Consumer<? super T>) new C4104c<Object>(new C4100l(this.f10719e)));
        }
    }

    /* renamed from: d */
    public final void mo10752d() {
        String str = this.f10721g;
        if (str != null) {
            this.f10724j.mo10709a(str, C8316b.OnWakeUp).mo36552d((Function<? super T, ? extends R>) C4101m.f10743e).mo36551d((Consumer<? super T>) new C4104c<Object>(new C4102n(this.f10718d)));
        }
    }

    /* renamed from: e */
    public final void mo10753e() {
        this.f10720f.mo36401a();
    }

    /* renamed from: a */
    public final void mo10748a(String str) {
        this.f10721g = str;
        C12785a<String> aVar = this.f10716b;
        if (str == null) {
            str = "";
        }
        aVar.onNext(str);
    }

    /* renamed from: a */
    public final void mo10747a(C2458b bVar) {
        C12932j.m33818b(bVar, "value");
        this.f10722h.setFocusMode(bVar);
    }

    /* renamed from: a */
    public final boolean mo10749a() {
        return this.f10722h.getHasMonitoring();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C12279e<Boolean> m11779a(String str, C12279e<Boolean> eVar, C8316b bVar, Function1<? super C2896p, ? extends C4051a> function1) {
        C12279e<Boolean> d = eVar.mo36509m(new C4090f(this, str, bVar, function1)).mo36482d((ObservableSource<? extends T>) this.f10724j.mo10709a(str, bVar).mo36553e());
        C12932j.m33815a((Object) d, "monitoringTrigger\n      …bservable()\n            )");
        return d;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C12279e<Boolean> m11780a(String str, boolean z, C8316b bVar, Function1<? super C2896p, ? extends C4051a> function1) {
        if (z) {
            C12279e<Boolean> e = ((C2718k5) this.f10723i.get()).mo8789b(str).mo36487e(1).mo36501i(C4087c.f10726e).mo36490e((Function<? super T, ? extends ObservableSource<? extends R>>) new C4088d<Object,Object>(this, function1));
            C12932j.m33815a((Object) e, "friendsManager.get().get…vable()\n                }");
            return e;
        }
        C12279e<Boolean> i = this.f10724j.mo10710b(str, bVar).mo36553e().mo36501i(C4089e.f10729e);
        C12932j.m33815a((Object) i, "userMonitoringStore\n    …    !it\n                }");
        return i;
    }
}
