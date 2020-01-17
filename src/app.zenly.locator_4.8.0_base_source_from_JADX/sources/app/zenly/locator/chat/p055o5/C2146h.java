package app.zenly.locator.chat.p055o5;

import app.zenly.locator.chat.p055o5.C2122c.C2123a;
import app.zenly.locator.chat.p055o5.C2122c.C2124b;
import app.zenly.locator.chat.p055o5.C2122c.C2125c;
import app.zenly.locator.chat.p055o5.C2122c.C2126d;
import app.zenly.locator.chat.p055o5.C2132e.C2133a;
import app.zenly.locator.chat.p055o5.C2132e.C2136d;
import app.zenly.locator.chat.p055o5.C2137f.C2138a;
import app.zenly.locator.chat.p055o5.C2137f.C2139b;
import app.zenly.locator.chat.p055o5.C2137f.C2140c;
import app.zenly.locator.chat.p055o5.C2137f.C2141d;
import app.zenly.locator.chat.p055o5.C2137f.C2142e;
import app.zenly.locator.chat.p055o5.C2137f.C2143f;
import app.zenly.locator.chat.p055o5.C2186n.C2187a;
import app.zenly.locator.chat.p055o5.C2186n.C2187a.C2188a;
import app.zenly.locator.chat.p055o5.C2186n.C2189b;
import app.zenly.locator.core.manager.C2718k5;
import app.zenly.locator.core.manager.p070t5.C2831a;
import app.zenly.locator.core.models.C2896p;
import app.zenly.locator.p143s.C5404e;
import app.zenly.locator.p143s.p148l.C5448c;
import com.android.volley.toolbox.C8733j;
import java.util.concurrent.TimeUnit;
import kotlin.C12899i;
import kotlin.C12954o;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12931i;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import kotlin.jvm.internal.C12940r;
import kotlin.jvm.internal.C12941s;
import kotlin.jvm.internal.C12946x;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KProperty;
import p213co.znly.models.C7391m1;
import p213co.znly.models.reversegeocoder.ReverseGeoCoderProto$ReverseGeoCodeInformationOrBuilder;
import p213co.znly.models.services.C8290t1;
import p250f.p251a.p252a.p263b.p264a.p272j.C7710c;
import p389io.reactivex.C12279e;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.BiFunction;
import p389io.reactivex.functions.Function;
import p389io.reactivex.functions.Predicate;
import p389io.reactivex.p402j.C12767a;
import p389io.reactivex.p405m.C12774b;

/* renamed from: app.zenly.locator.chat.o5.h */
public final class C2146h {

    /* renamed from: i */
    static final /* synthetic */ KProperty[] f6652i;

    /* renamed from: a */
    private final Lazy f6653a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Integer[] f6654b = {Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(1048576), Integer.valueOf(32), Integer.valueOf(131072), Integer.valueOf(262144), Integer.valueOf(4), Integer.valueOf(128), Integer.valueOf(1), Integer.valueOf(1024)};
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Integer[] f6655c = {Integer.valueOf(64)};

    /* renamed from: d */
    private final Lazy f6656d;

    /* renamed from: e */
    private final Lazy f6657e;

    /* renamed from: f */
    private final Lazy f6658f;

    /* renamed from: g */
    private final Lazy f6659g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C12279e<C7391m1> f6660h;

    /* renamed from: app.zenly.locator.chat.o5.h$a */
    static final class C2147a extends C12933k implements Function0<C12279e<C2122c>> {

        /* renamed from: f */
        final /* synthetic */ C2146h f6661f;

        /* renamed from: app.zenly.locator.chat.o5.h$a$a */
        public static final class C2148a<T1, T2, R> implements BiFunction<T1, T2, R> {

            /* renamed from: a */
            final /* synthetic */ C2147a f6662a;

            public C2148a(C2147a aVar) {
                this.f6662a = aVar;
            }

            public final R apply(T1 t1, T2 t2) {
                return this.f6662a.f6661f.m7904a((C2137f) ((C12899i) t2).mo37203b(), (C7391m1) t1);
            }
        }

        C2147a(C2146h hVar) {
            this.f6661f = hVar;
            super(0);
        }

        public final C12279e<C2122c> invoke() {
            C12774b bVar = C12774b.f33320a;
            C12279e a = this.f6661f.f6660h;
            C12767a d = this.f6661f.m7916f();
            C12932j.m33815a((Object) d, "rawStatusObservable");
            return C12279e.m32610a((ObservableSource<? extends T1>) a, (ObservableSource<? extends T2>) d, (BiFunction<? super T1, ? super T2, ? extends R>) new C2148a<Object,Object,Object>(this));
        }
    }

    /* renamed from: app.zenly.locator.chat.o5.h$b */
    static final class C2149b extends C12933k implements Function0<C12279e<C2137f>> {

        /* renamed from: f */
        final /* synthetic */ C2146h f6663f;

        /* renamed from: app.zenly.locator.chat.o5.h$b$a */
        static final class C2150a<T, R> implements Function<T, ObservableSource<? extends R>> {

            /* renamed from: e */
            final /* synthetic */ C2149b f6664e;

            C2150a(C2149b bVar) {
                this.f6664e = bVar;
            }

            /* renamed from: a */
            public final C12279e<? extends C2137f> apply(C12899i<? extends C2896p, ? extends C2137f> iVar) {
                C12932j.m33818b(iVar, "<name for destructuring parameter 0>");
                C2896p pVar = (C2896p) iVar.mo37202a();
                C2137f fVar = (C2137f) iVar.mo37203b();
                if (fVar instanceof C2142e) {
                    C2142e eVar = (C2142e) fVar;
                    if (eVar.mo7973c() instanceof C2136d) {
                        C2146h hVar = this.f6664e.f6663f;
                        C12932j.m33815a((Object) pVar, "friend");
                        return hVar.m7910a(pVar, (C2136d) eVar.mo7973c(), eVar);
                    }
                }
                C12279e<? extends C2137f> e = C12279e.m32626e(fVar);
                C12932j.m33815a((Object) e, "Observable.just(status)");
                return e;
            }
        }

        C2149b(C2146h hVar) {
            this.f6663f = hVar;
            super(0);
        }

        public final C12279e<C2137f> invoke() {
            return this.f6663f.m7916f().mo36509m(new C2150a(this));
        }
    }

    /* renamed from: app.zenly.locator.chat.o5.h$c */
    static final class C2151c extends C12933k implements Function0<C12279e<C2186n>> {

        /* renamed from: f */
        final /* synthetic */ C2146h f6665f;

        /* renamed from: g */
        final /* synthetic */ C12279e f6666g;

        /* renamed from: app.zenly.locator.chat.o5.h$c$a */
        static final class C2152a<T> implements Predicate<C2831a> {

            /* renamed from: e */
            final /* synthetic */ C2151c f6667e;

            C2152a(C2151c cVar) {
                this.f6667e = cVar;
            }

            /* renamed from: a */
            public final boolean test(C2831a aVar) {
                C12932j.m33818b(aVar, "<name for destructuring parameter 0>");
                int a = aVar.mo8854a();
                for (Integer intValue : this.f6667e.f6665f.f6655c) {
                    if (C7710c.m18767b(a, intValue.intValue())) {
                        return true;
                    }
                }
                return false;
            }
        }

        /* renamed from: app.zenly.locator.chat.o5.h$c$b */
        static final class C2153b<T, R> implements Function<T, R> {

            /* renamed from: e */
            public static final C2153b f6668e = new C2153b();

            C2153b() {
            }

            /* renamed from: a */
            public final C2896p apply(C2831a aVar) {
                C12932j.m33818b(aVar, "it");
                return aVar.mo8858c();
            }
        }

        /* renamed from: app.zenly.locator.chat.o5.h$c$c */
        static final /* synthetic */ class C2154c extends C12931i implements Function1<C2896p, C12279e<C2186n>> {
            C2154c(C2146h hVar) {
                super(1, hVar);
            }

            /* renamed from: a */
            public final C12279e<C2186n> invoke(C2896p pVar) {
                C12932j.m33818b(pVar, "p1");
                return ((C2146h) this.f33505f).m7909a(pVar);
            }

            /* renamed from: d */
            public final KDeclarationContainer mo6620d() {
                return C12946x.m33834a(C2146h.class);
            }

            /* renamed from: f */
            public final String mo6621f() {
                return "computeTemporaryStatus(Lapp/zenly/locator/core/models/Friend;)Lio/reactivex/Observable;";
            }

            public final String getName() {
                return "computeTemporaryStatus";
            }
        }

        /* renamed from: app.zenly.locator.chat.o5.h$c$d */
        static final class C2155d<T, R> implements Function<T, ObservableSource<? extends R>> {

            /* renamed from: e */
            public static final C2155d f6669e = new C2155d();

            /* renamed from: app.zenly.locator.chat.o5.h$c$d$a */
            public static final class C2156a<T1, T2, R> implements BiFunction<T1, T2, R> {
                public final R apply(T1 t1, T2 t2) {
                    Long l = (Long) t2;
                    return (C2186n) t1;
                }
            }

            C2155d() {
            }

            /* renamed from: a */
            public final C12279e<C2186n> apply(C2186n nVar) {
                C12932j.m33818b(nVar, "temporaryStatus");
                if (C12932j.m33817a((Object) nVar, (Object) C2189b.f6728a)) {
                    return C12279e.m32626e(nVar);
                }
                C12774b bVar = C12774b.f33320a;
                C12279e a = C12279e.m32620a((T[]) new C2186n[]{nVar, C2189b.f6728a});
                C12932j.m33815a((Object) a, "Observable.fromArray(tem… TemporaryStatus.Nothing)");
                C12279e e = C12279e.m32599a(0, 3, TimeUnit.SECONDS).mo36487e(2);
                C12932j.m33815a((Object) e, "Observable.interval(0, 3…TimeUnit.SECONDS).take(2)");
                return C12279e.m32622b((ObservableSource<? extends T1>) a, (ObservableSource<? extends T2>) e, (BiFunction<? super T1, ? super T2, ? extends R>) new C2156a<Object,Object,Object>());
            }
        }

        C2151c(C2146h hVar, C12279e eVar) {
            this.f6665f = hVar;
            this.f6666g = eVar;
            super(0);
        }

        public final C12279e<C2186n> invoke() {
            return this.f6666g.mo36459b((Predicate<? super T>) new C2152a<Object>(this)).mo36501i(C2153b.f6668e).mo36509m(new C2164i(new C2154c(this.f6665f))).mo36477d().mo36509m(C2155d.f6669e);
        }
    }

    /* renamed from: app.zenly.locator.chat.o5.h$d */
    static final class C2157d extends C12933k implements Function0<C2119a> {

        /* renamed from: f */
        final /* synthetic */ C2718k5 f6670f;

        C2157d(C2718k5 k5Var) {
            this.f6670f = k5Var;
            super(0);
        }

        public final C2119a invoke() {
            return new C2119a(this.f6670f);
        }
    }

    /* renamed from: app.zenly.locator.chat.o5.h$e */
    static final class C2158e extends C12933k implements Function0<C12767a<C12899i<? extends C2896p, ? extends C2137f>>> {

        /* renamed from: f */
        final /* synthetic */ C2146h f6671f;

        /* renamed from: g */
        final /* synthetic */ C12279e f6672g;

        /* renamed from: app.zenly.locator.chat.o5.h$e$a */
        static final class C2159a<T> implements Predicate<C2831a> {

            /* renamed from: e */
            final /* synthetic */ C2158e f6673e;

            C2159a(C2158e eVar) {
                this.f6673e = eVar;
            }

            /* renamed from: a */
            public final boolean test(C2831a aVar) {
                C12932j.m33818b(aVar, "<name for destructuring parameter 0>");
                int a = aVar.mo8854a();
                for (Integer intValue : this.f6673e.f6671f.f6654b) {
                    if (C7710c.m18767b(a, intValue.intValue())) {
                        return true;
                    }
                }
                return false;
            }
        }

        /* renamed from: app.zenly.locator.chat.o5.h$e$b */
        static final class C2160b<T, R> implements Function<T, R> {

            /* renamed from: e */
            final /* synthetic */ C2158e f6674e;

            C2160b(C2158e eVar) {
                this.f6674e = eVar;
            }

            /* renamed from: a */
            public final C12899i<C2896p, C2137f> apply(C2831a aVar) {
                C12932j.m33818b(aVar, "it");
                C2896p c = aVar.mo8858c();
                C2119a c2 = this.f6674e.f6671f.m7914e();
                C2896p c3 = aVar.mo8858c();
                C12932j.m33815a((Object) c3, "it.friend");
                return C12954o.m33853a(c, c2.mo7914a(c3));
            }
        }

        C2158e(C2146h hVar, C12279e eVar) {
            this.f6671f = hVar;
            this.f6672g = eVar;
            super(0);
        }

        public final C12767a<C12899i<C2896p, C2137f>> invoke() {
            return this.f6672g.mo36459b((Predicate<? super T>) new C2159a<Object>(this)).mo36501i(new C2160b(this)).mo36503j();
        }
    }

    /* renamed from: app.zenly.locator.chat.o5.h$f */
    static final class C2161f<T, R> implements Function<T, R> {

        /* renamed from: e */
        final /* synthetic */ C2142e f6675e;

        C2161f(C2142e eVar) {
            this.f6675e = eVar;
        }

        /* renamed from: a */
        public final C2142e apply(String str) {
            C12932j.m33818b(str, "address");
            return C13028q.m34000a(str) ? this.f6675e : C2142e.m7895a(this.f6675e, null, new C2133a(str), null, 5, null);
        }
    }

    /* renamed from: app.zenly.locator.chat.o5.h$g */
    static final class C2162g<T, R> implements Function<Throwable, C2142e> {

        /* renamed from: e */
        final /* synthetic */ C2142e f6676e;

        C2162g(C2142e eVar) {
            this.f6676e = eVar;
        }

        /* renamed from: a */
        public final C2142e apply(Throwable th) {
            C12932j.m33818b(th, "it");
            return this.f6676e;
        }
    }

    /* renamed from: app.zenly.locator.chat.o5.h$h */
    static final class C2163h<T, R> implements Function<T, R> {

        /* renamed from: e */
        public static final C2163h f6677e = new C2163h();

        C2163h() {
        }

        /* renamed from: a */
        public final String apply(C8290t1 t1Var) {
            C12932j.m33818b(t1Var, "it");
            ReverseGeoCoderProto$ReverseGeoCodeInformationOrBuilder reverseGeoCoderProto$ReverseGeoCodeInformationOrBuilder = (ReverseGeoCoderProto$ReverseGeoCodeInformationOrBuilder) t1Var.mo22256a().get(0);
            if (reverseGeoCoderProto$ReverseGeoCodeInformationOrBuilder != null) {
                String label = reverseGeoCoderProto$ReverseGeoCodeInformationOrBuilder.getLabel();
                if (label != null) {
                    return label;
                }
            }
            return "";
        }
    }

    static {
        Class<C2146h> cls = C2146h.class;
        C12941s sVar = new C12941s(C12946x.m33834a((Class) cls), "friendStatusHelper", "getFriendStatusHelper()Lapp/zenly/locator/chat/status/FriendStatusHelper;");
        C12946x.m33839a((C12940r) sVar);
        C12941s sVar2 = new C12941s(C12946x.m33834a((Class) cls), "rawStatusObservable", "getRawStatusObservable()Lio/reactivex/observables/ConnectableObservable;");
        C12946x.m33839a((C12940r) sVar2);
        C12941s sVar3 = new C12941s(C12946x.m33834a((Class) cls), "_statusObservable", "get_statusObservable()Lio/reactivex/Observable;");
        C12946x.m33839a((C12940r) sVar3);
        C12941s sVar4 = new C12941s(C12946x.m33834a((Class) cls), "_imageStatusObservable", "get_imageStatusObservable()Lio/reactivex/Observable;");
        C12946x.m33839a((C12940r) sVar4);
        C12941s sVar5 = new C12941s(C12946x.m33834a((Class) cls), "_temporaryStatusObservable", "get_temporaryStatusObservable()Lio/reactivex/Observable;");
        C12946x.m33839a((C12940r) sVar5);
        f6652i = new KProperty[]{sVar, sVar2, sVar3, sVar4, sVar5};
    }

    public C2146h(C2718k5 k5Var, C12279e<C2831a> eVar, C12279e<C7391m1> eVar2) {
        C12932j.m33818b(k5Var, "friendsManager");
        C12932j.m33818b(eVar, "friendStream");
        C12932j.m33818b(eVar2, "activityStream");
        this.f6660h = eVar2;
        this.f6653a = C12896f.m33751a(new C2157d(k5Var));
        this.f6656d = C12896f.m33751a(new C2158e(this, eVar));
        this.f6657e = C12896f.m33751a(new C2149b(this));
        this.f6658f = C12896f.m33751a(new C2147a(this));
        this.f6659g = C12896f.m33751a(new C2151c(this, eVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final C2119a m7914e() {
        Lazy lazy = this.f6653a;
        KProperty kProperty = f6652i[0];
        return (C2119a) lazy.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final C12767a<C12899i<C2896p, C2137f>> m7916f() {
        Lazy lazy = this.f6656d;
        KProperty kProperty = f6652i[1];
        return (C12767a) lazy.getValue();
    }

    /* renamed from: g */
    private final C12279e<C2122c> m7917g() {
        Lazy lazy = this.f6658f;
        KProperty kProperty = f6652i[3];
        return (C12279e) lazy.getValue();
    }

    /* renamed from: h */
    private final C12279e<C2137f> m7918h() {
        Lazy lazy = this.f6657e;
        KProperty kProperty = f6652i[2];
        return (C12279e) lazy.getValue();
    }

    /* renamed from: i */
    private final C12279e<C2186n> m7919i() {
        Lazy lazy = this.f6659g;
        KProperty kProperty = f6652i[4];
        return (C12279e) lazy.getValue();
    }

    /* renamed from: b */
    public final C12279e<C2137f> mo7980b() {
        C12279e<C2137f> h = m7918h();
        C12932j.m33815a((Object) h, "_statusObservable");
        return h;
    }

    /* renamed from: c */
    public final C12279e<C2186n> mo7981c() {
        C12279e<C2186n> i = m7919i();
        C12932j.m33815a((Object) i, "_temporaryStatusObservable");
        return i;
    }

    /* renamed from: d */
    public final Disposable mo7982d() {
        Disposable r = m7916f().mo36946r();
        C12932j.m33815a((Object) r, "rawStatusObservable.connect()");
        return r;
    }

    /* renamed from: a */
    public final C12279e<C2122c> mo7979a() {
        C12279e<C2122c> g = m7917g();
        C12932j.m33815a((Object) g, "_imageStatusObservable");
        return g;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C2122c m7904a(C2137f fVar, C7391m1 m1Var) {
        C2125c cVar;
        if (C12840k.m33571a((Object[]) C2165j.f6679a, (Object) m1Var)) {
            return new C2123a(m1Var);
        }
        if (fVar instanceof C2142e) {
            cVar = new C2125c(fVar);
        } else if (fVar instanceof C2138a) {
            cVar = new C2125c(fVar);
        } else if (fVar instanceof C2141d) {
            cVar = new C2125c(fVar);
        } else if (fVar instanceof C2143f) {
            return C2126d.f6625a;
        } else {
            if ((fVar instanceof C2140c) || C12932j.m33817a((Object) fVar, (Object) C2139b.f6640b)) {
                return C2124b.f6623a;
            }
            throw new NoWhenBranchMatchedException();
        }
        return cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C12279e<C2142e> m7910a(C2896p pVar, C2136d dVar, C2142e eVar) {
        C12279e eVar2;
        if (pVar.f8208l) {
            eVar2 = C5448c.m15478a().reverseGeoCodeViewports(C5404e.m15383a(dVar.mo7948a(), (int) C8733j.DEFAULT_IMAGE_TIMEOUT_MS, (int) C8733j.DEFAULT_IMAGE_TIMEOUT_MS)).mo36501i(C2163h.f6677e);
        } else {
            eVar2 = C5448c.m15478a().geoReverseGeocodeStreet(dVar.mo7948a().mo13060b(), dVar.mo7948a().mo13062c());
        }
        C12279e<C2142e> k = eVar2.mo36501i(new C2161f(eVar)).mo36504k(new C2162g(eVar));
        C12932j.m33815a((Object) k, "contextualLabeling\n     …     status\n            }");
        return k;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C12279e<C2186n> m7909a(C2896p pVar) {
        Object obj;
        if (pVar.mo8978c()) {
            obj = new C2187a(C2188a.OUT_OF_BATTERY);
        } else if (pVar.mo8977b()) {
            obj = new C2187a(C2188a.LOW_BATTERY);
        } else {
            obj = C2189b.f6728a;
        }
        C12279e<C2186n> e = C12279e.m32626e(obj);
        C12932j.m33815a((Object) e, "Observable.just(batteryStatus)");
        return e;
    }
}
