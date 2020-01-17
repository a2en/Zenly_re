package app.zenly.locator.core.manager;

import android.text.TextUtils;
import app.zenly.android.feature.base.p009di.Provider;
import app.zenly.locator.core.contracts.MapControllerContract.C2458b;
import app.zenly.locator.core.contracts.MapControllerContract.C2459c;
import app.zenly.locator.core.contracts.MapControllerContract.C2465h.C2466a;
import app.zenly.locator.core.manager.p070t5.C2831a;
import app.zenly.locator.core.util.C3225m;
import app.zenly.locator.p143s.p148l.C5448c;
import app.zenly.locator.p143s.p150n.C5459d;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.C12953n;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12929g;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import kotlin.jvm.internal.C12938p;
import kotlin.jvm.internal.C12939q;
import kotlin.jvm.internal.C12946x;
import kotlin.reflect.KProperty;
import p213co.znly.core.ZenlyCore;
import p213co.znly.models.C6950b0;
import p213co.znly.models.C6950b0.C6951a;
import p213co.znly.models.C6975c0;
import p213co.znly.models.core.C7088e1;
import p389io.reactivex.C12279e;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.functions.BiFunction;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.functions.Function;
import p389io.reactivex.functions.Function3;
import p389io.reactivex.functions.Predicate;
import p389io.reactivex.p405m.C12774b;
import p389io.reactivex.p406n.C12785a;

/* renamed from: app.zenly.locator.core.manager.m5 */
public final class C2741m5 {

    /* renamed from: g */
    static final /* synthetic */ KProperty[] f7958g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final C2831a f7959h = new C2831a();

    /* renamed from: a */
    private final C12785a<String> f7960a;

    /* renamed from: b */
    private final C12785a<C2458b> f7961b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C12785a<Integer> f7962c;

    /* renamed from: d */
    private final C12279e<List<C5459d>> f7963d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Provider<MeUserManager> f7964e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final Provider<C2718k5> f7965f;

    /* renamed from: app.zenly.locator.core.manager.m5$a */
    public static final class C2742a<T1, T2, T3, R> implements Function3<T1, T2, T3, R> {
        public final R apply(T1 t1, T2 t2, T3 t3) {
            return Boolean.valueOf(((Boolean) t1).booleanValue() && ((Boolean) t2).booleanValue() && ((Boolean) t3).booleanValue());
        }
    }

    /* renamed from: app.zenly.locator.core.manager.m5$b */
    static final class C2743b<T, R> implements Function<T, ObservableSource<? extends R>> {

        /* renamed from: e */
        final /* synthetic */ C2741m5 f7966e;

        /* renamed from: f */
        final /* synthetic */ Lazy f7967f;

        /* renamed from: g */
        final /* synthetic */ KProperty f7968g;

        /* renamed from: h */
        final /* synthetic */ C12279e f7969h;

        /* renamed from: i */
        final /* synthetic */ ZenlyCore f7970i;

        /* renamed from: app.zenly.locator.core.manager.m5$b$a */
        public static final class C2744a<T1, T2, T3, R> implements Function3<T1, T2, T3, R> {
            public final R apply(T1 t1, T2 t2, T3 t3) {
                return new C12953n((C6950b0) t1, (C6950b0) t2, (Integer) t3);
            }
        }

        /* renamed from: app.zenly.locator.core.manager.m5$b$b */
        static final class C2745b<T, R> implements Function<T, ObservableSource<? extends R>> {

            /* renamed from: e */
            final /* synthetic */ C2743b f7971e;

            /* renamed from: app.zenly.locator.core.manager.m5$b$b$a */
            static final class C2746a<T, R> implements Function<T, R> {

                /* renamed from: e */
                public static final C2746a f7972e = new C2746a();

                C2746a() {
                }

                /* renamed from: a */
                public final ArrayList<C5459d> apply(C7088e1 e1Var) {
                    C12932j.m33818b(e1Var, "routeResponse");
                    C6975c0 low = e1Var.getLow();
                    String str = "routeResponse.low";
                    C12932j.m33815a((Object) low, str);
                    ArrayList<C5459d> arrayList = new ArrayList<>(low.getPointsCount());
                    C6975c0 low2 = e1Var.getLow();
                    C12932j.m33815a((Object) low2, str);
                    for (C6950b0 b0Var : low2.getPointsList()) {
                        C12932j.m33815a((Object) b0Var, "geoPoint");
                        arrayList.add(new C5459d(b0Var.getLatitude(), b0Var.getLongitude()));
                    }
                    return arrayList;
                }
            }

            /* renamed from: app.zenly.locator.core.manager.m5$b$b$b */
            static final class C2747b<T, R> implements Function<C12279e<Throwable>, ObservableSource<?>> {

                /* renamed from: e */
                public static final C2747b f7973e = new C2747b();

                /* renamed from: app.zenly.locator.core.manager.m5$b$b$b$a */
                static final class C2748a<T, R> implements Function<T, ObservableSource<? extends R>> {

                    /* renamed from: e */
                    public static final C2748a f7974e = new C2748a();

                    C2748a() {
                    }

                    /* renamed from: a */
                    public final C12279e<Long> apply(Throwable th) {
                        C12932j.m33818b(th, "<anonymous parameter 0>");
                        return C12279e.m32630h(1, TimeUnit.SECONDS);
                    }
                }

                C2747b() {
                }

                /* renamed from: a */
                public final C12279e<Long> apply(C12279e<Throwable> eVar) {
                    C12932j.m33818b(eVar, "errors");
                    return eVar.mo36490e((Function<? super T, ? extends ObservableSource<? extends R>>) C2748a.f7974e);
                }
            }

            C2745b(C2743b bVar) {
                this.f7971e = bVar;
            }

            /* renamed from: a */
            public final C12279e<List<C5459d>> apply(C12953n<C6950b0, C6950b0, Integer> nVar) {
                C12932j.m33818b(nVar, "triple");
                C6950b0 b0Var = (C6950b0) nVar.mo37312a();
                C6950b0 b0Var2 = (C6950b0) nVar.mo37313b();
                float a = C3225m.m10225a(b0Var.getLatitude(), b0Var.getLongitude(), b0Var2.getLatitude(), b0Var2.getLongitude());
                if (a >= ((float) 2500000)) {
                    return C12279e.m32626e(this.f7971e.f7966e.m9231a(new C5459d(b0Var.getLatitude(), b0Var.getLongitude()), new C5459d(b0Var2.getLatitude(), b0Var2.getLongitude())));
                }
                int i = a < ((float) ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED) ? 0 : 2;
                if (((Number) nVar.mo37314c()).intValue() != -1) {
                    i = ((Number) nVar.mo37314c()).intValue();
                }
                return this.f7971e.f7970i.geoRoutePolyline(b0Var, b0Var2, i).mo36501i(C2746a.f7972e).mo36507l(C2747b.f7973e);
            }
        }

        C2743b(C2741m5 m5Var, Lazy lazy, KProperty kProperty, C12279e eVar, ZenlyCore zenlyCore) {
            this.f7966e = m5Var;
            this.f7967f = lazy;
            this.f7968g = kProperty;
            this.f7969h = eVar;
            this.f7970i = zenlyCore;
        }

        /* renamed from: a */
        public final C12279e<List<C5459d>> apply(Boolean bool) {
            C12932j.m33818b(bool, "inMeetMode");
            if (!bool.booleanValue()) {
                return C12279e.m32626e(C12848o.m33640a());
            }
            C12774b bVar = C12774b.f33320a;
            C12279e eVar = (C12279e) this.f7967f.getValue();
            C12932j.m33815a((Object) eVar, "userGeoPoint");
            C12279e eVar2 = this.f7969h;
            C12932j.m33815a((Object) eVar2, "friendGeoPoint");
            return C12279e.m32609a((ObservableSource<? extends T1>) eVar, (ObservableSource<? extends T2>) eVar2, (ObservableSource<? extends T3>) this.f7966e.f7962c, (Function3<? super T1, ? super T2, ? super T3, ? extends R>) new C2744a<Object,Object,Object,Object>()).mo36509m(new C2745b(this));
        }
    }

    /* renamed from: app.zenly.locator.core.manager.m5$c */
    public static final class C2749c {
        private C2749c() {
        }

        public /* synthetic */ C2749c(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.core.manager.m5$d */
    private static final class C2750d {

        /* renamed from: a */
        private final String f7975a;

        /* renamed from: b */
        private final double f7976b;

        /* renamed from: c */
        private final double f7977c;

        public C2750d(String str, double d, double d2) {
            C12932j.m33818b(str, "uuid");
            this.f7975a = str;
            this.f7976b = d;
            this.f7977c = d2;
        }

        /* renamed from: a */
        public final double mo8813a() {
            return this.f7976b;
        }

        /* renamed from: b */
        public final double mo8814b() {
            return this.f7977c;
        }

        /* renamed from: c */
        public final String mo8815c() {
            return this.f7975a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
            if (java.lang.Double.compare(r4.f7977c, r5.f7977c) == 0) goto L_0x0029;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r5) {
            /*
                r4 = this;
                if (r4 == r5) goto L_0x0029
                boolean r0 = r5 instanceof app.zenly.locator.core.manager.C2741m5.C2750d
                if (r0 == 0) goto L_0x0027
                app.zenly.locator.core.manager.m5$d r5 = (app.zenly.locator.core.manager.C2741m5.C2750d) r5
                java.lang.String r0 = r4.f7975a
                java.lang.String r1 = r5.f7975a
                boolean r0 = kotlin.jvm.internal.C12932j.m33817a(r0, r1)
                if (r0 == 0) goto L_0x0027
                double r0 = r4.f7976b
                double r2 = r5.f7976b
                int r0 = java.lang.Double.compare(r0, r2)
                if (r0 != 0) goto L_0x0027
                double r0 = r4.f7977c
                double r2 = r5.f7977c
                int r5 = java.lang.Double.compare(r0, r2)
                if (r5 != 0) goto L_0x0027
                goto L_0x0029
            L_0x0027:
                r5 = 0
                return r5
            L_0x0029:
                r5 = 1
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.core.manager.C2741m5.C2750d.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            String str = this.f7975a;
            return ((((str != null ? str.hashCode() : 0) * 31) + Double.valueOf(this.f7976b).hashCode()) * 31) + Double.valueOf(this.f7977c).hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("LatLngWithUuid(uuid=");
            sb.append(this.f7975a);
            sb.append(", latitude=");
            sb.append(this.f7976b);
            sb.append(", longitude=");
            sb.append(this.f7977c);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: app.zenly.locator.core.manager.m5$e */
    static final class C2751e<T, R> implements Function<T, ObservableSource<? extends R>> {

        /* renamed from: e */
        final /* synthetic */ C2741m5 f7978e;

        C2751e(C2741m5 m5Var) {
            this.f7978e = m5Var;
        }

        /* renamed from: a */
        public final ObservableSource<? extends C2831a> apply(String str) {
            C12932j.m33818b(str, "uuid");
            if (str.length() == 0) {
                return C12279e.m32626e(C2741m5.f7959h);
            }
            return ((C2718k5) this.f7978e.f7965f.get()).mo8789b(str);
        }
    }

    /* renamed from: app.zenly.locator.core.manager.m5$f */
    static final class C2752f<T1, T2, R> implements BiFunction<R, T, R> {

        /* renamed from: a */
        public static final C2752f f7979a = new C2752f();

        C2752f() {
        }

        /* renamed from: a */
        public final C2750d apply(C2750d dVar, C2750d dVar2) {
            C12932j.m33818b(dVar, "oldFriendPos");
            C12932j.m33818b(dVar2, "friendPos");
            return (Double.isNaN(dVar.mo8813a()) || Double.isNaN(dVar.mo8814b()) || !TextUtils.equals(dVar.mo8815c(), dVar2.mo8815c()) || C3225m.m10225a(dVar.mo8813a(), dVar.mo8814b(), dVar2.mo8813a(), dVar2.mo8814b()) >= ((float) 50)) ? dVar2 : dVar;
        }
    }

    /* renamed from: app.zenly.locator.core.manager.m5$g */
    static final class C2753g<T, R> implements Function<T, R> {

        /* renamed from: e */
        public static final C2753g f7980e = new C2753g();

        C2753g() {
        }

        /* renamed from: a */
        public final C6950b0 apply(C2750d dVar) {
            C12932j.m33818b(dVar, "tc");
            C6951a newBuilder = C6950b0.newBuilder();
            C12932j.m33815a((Object) newBuilder, "geoPoint");
            newBuilder.setLatitude(dVar.mo8813a());
            newBuilder.setLongitude(dVar.mo8814b());
            return (C6950b0) newBuilder.build();
        }
    }

    /* renamed from: app.zenly.locator.core.manager.m5$h */
    static final class C2754h<T> implements Predicate<C2831a> {

        /* renamed from: e */
        public static final C2754h f7981e = new C2754h();

        C2754h() {
        }

        /* renamed from: a */
        public final boolean test(C2831a aVar) {
            C12932j.m33818b(aVar, "friendEvent");
            return aVar.mo8858c().f8199c != null && C2831a.m9302a(aVar.mo8857b(), Integer.MAX_VALUE);
        }
    }

    /* renamed from: app.zenly.locator.core.manager.m5$i */
    static final class C2755i<T, R> implements Function<T, R> {

        /* renamed from: e */
        public static final C2755i f7982e = new C2755i();

        C2755i() {
        }

        /* renamed from: a */
        public final C2750d apply(C2831a aVar) {
            C12932j.m33818b(aVar, "friendEvent");
            String str = aVar.mo8858c().f8197a;
            C12932j.m33815a((Object) str, "friendEvent.friend.uuid");
            C2750d dVar = new C2750d(str, aVar.mo8858c().f8199c.mo13060b(), aVar.mo8858c().f8199c.mo13062c());
            return dVar;
        }
    }

    /* renamed from: app.zenly.locator.core.manager.m5$j */
    static final class C2756j<T, R> implements Function<T, R> {

        /* renamed from: e */
        public static final C2756j f7983e = new C2756j();

        C2756j() {
        }

        /* renamed from: a */
        public final boolean mo8824a(C2831a aVar) {
            C12932j.m33818b(aVar, "friendEvent");
            return aVar != C2741m5.f7959h;
        }

        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            return Boolean.valueOf(mo8824a((C2831a) obj));
        }
    }

    /* renamed from: app.zenly.locator.core.manager.m5$k */
    static final class C2757k<T> implements Consumer<Boolean> {

        /* renamed from: e */
        final /* synthetic */ C2741m5 f7984e;

        C2757k(C2741m5 m5Var) {
            this.f7984e = m5Var;
        }

        /* renamed from: a */
        public final void accept(Boolean bool) {
            this.f7984e.f7962c.onNext(Integer.valueOf(-1));
        }
    }

    /* renamed from: app.zenly.locator.core.manager.m5$l */
    static final class C2758l<T, R> implements Function<T, R> {

        /* renamed from: e */
        public static final C2758l f7985e = new C2758l();

        C2758l() {
        }

        /* renamed from: a */
        public final boolean mo8826a(C2831a aVar) {
            C12932j.m33818b(aVar, "friendEvent");
            return aVar != C2741m5.f7959h && !aVar.mo8858c().f8208l;
        }

        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            return Boolean.valueOf(mo8826a((C2831a) obj));
        }
    }

    /* renamed from: app.zenly.locator.core.manager.m5$m */
    static final class C2759m<T, R> implements Function<T, R> {

        /* renamed from: e */
        public static final C2759m f7986e = new C2759m();

        C2759m() {
        }

        /* renamed from: a */
        public final boolean mo8827a(C2458b bVar) {
            C12932j.m33818b(bVar, "focusMode");
            return bVar == C2458b.MEET;
        }

        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            return Boolean.valueOf(mo8827a((C2458b) obj));
        }
    }

    /* renamed from: app.zenly.locator.core.manager.m5$n */
    static final class C2760n extends C12933k implements Function0<C12279e<C6950b0>> {

        /* renamed from: f */
        final /* synthetic */ C2741m5 f7987f;

        /* renamed from: g */
        final /* synthetic */ C5459d f7988g;

        /* renamed from: app.zenly.locator.core.manager.m5$n$a */
        static final class C2761a<T1, T2, R> implements BiFunction<R, T, R> {

            /* renamed from: a */
            public static final C2761a f7989a = new C2761a();

            C2761a() {
            }

            /* renamed from: a */
            public final C5459d apply(C5459d dVar, C5459d dVar2) {
                C12932j.m33818b(dVar, "oldLocation");
                C12932j.m33818b(dVar2, "location");
                return (Double.isNaN(dVar.mo13060b()) || Double.isNaN(dVar.mo13062c()) || C3225m.m10225a(dVar.mo13060b(), dVar.mo13062c(), dVar2.mo13060b(), dVar2.mo13062c()) >= ((float) 50)) ? dVar2 : dVar;
            }
        }

        /* renamed from: app.zenly.locator.core.manager.m5$n$b */
        static final class C2762b<T, R> implements Function<T, R> {

            /* renamed from: e */
            public static final C2762b f7990e = new C2762b();

            C2762b() {
            }

            /* renamed from: a */
            public final C6950b0 apply(C5459d dVar) {
                C12932j.m33818b(dVar, "location");
                C6951a newBuilder = C6950b0.newBuilder();
                C12932j.m33815a((Object) newBuilder, "geoPoint");
                newBuilder.setLatitude(dVar.mo13060b());
                newBuilder.setLongitude(dVar.mo13062c());
                return (C6950b0) newBuilder.build();
            }
        }

        C2760n(C2741m5 m5Var, C5459d dVar) {
            this.f7987f = m5Var;
            this.f7988g = dVar;
            super(0);
        }

        public final C12279e<C6950b0> invoke() {
            return ((MeUserManager) this.f7987f.f7964e.get()).mo8749a().mo36441a(this.f7988g, (BiFunction<R, ? super T, R>) C2761a.f7989a).mo36477d().mo36501i(C2762b.f7990e);
        }
    }

    static {
        C12939q qVar = new C12939q(C12946x.m33834a(C2741m5.class), "userGeoPoint", "<v#0>");
        C12946x.m33838a((C12938p) qVar);
        f7958g = new KProperty[]{qVar};
        new C2749c(null);
    }

    public C2741m5(Provider<MeUserManager> provider, Provider<C2718k5> provider2) {
        C12932j.m33818b(provider, "meUserManager");
        C12932j.m33818b(provider2, "friendsManager");
        this.f7964e = provider;
        this.f7965f = provider2;
        C12785a<String> h = C12785a.m33446h("");
        C12932j.m33815a((Object) h, "BehaviorSubject.createDefault(\"\")");
        this.f7960a = h;
        C12785a<C2458b> h2 = C12785a.m33446h(C2458b.NORMAL);
        C12932j.m33815a((Object) h2, "BehaviorSubject.createDe…ontract.FocusMode.NORMAL)");
        this.f7961b = h2;
        C12785a<Integer> h3 = C12785a.m33446h(Integer.valueOf(-1));
        C12932j.m33815a((Object) h3, "BehaviorSubject.createDe…EET_TRANSPORT_MODE_RESET)");
        this.f7962c = h3;
        ZenlyCore a = C5448c.m15478a();
        C12279e m = this.f7960a.mo36477d().mo36509m(new C2751e(this));
        C12279e d = this.f7961b.mo36501i(C2759m.f7986e).mo36477d();
        C12279e d2 = m.mo36501i(C2756j.f7983e).mo36477d();
        C12279e d3 = m.mo36501i(C2758l.f7985e).mo36477d();
        C12774b bVar = C12774b.f33320a;
        C12932j.m33815a((Object) d, "meetModeEnabled");
        C12932j.m33815a((Object) d2, "hasFocusedFriend");
        C12932j.m33815a((Object) d3, "isNotBlurred");
        C12279e b = C12279e.m32609a((ObservableSource<? extends T1>) d, (ObservableSource<? extends T2>) d2, (ObservableSource<? extends T3>) d3, (Function3<? super T1, ? super T2, ? super T3, ? extends R>) new C2742a<Object,Object,Object,Object>()).mo36477d().mo36455b((Consumer<? super T>) new C2757k<Object>(this));
        Lazy a2 = C12896f.m33751a(new C2760n(this, new C5459d()));
        KProperty kProperty = f7958g[0];
        C12279e i = m.mo36459b((Predicate<? super T>) C2754h.f7981e).mo36501i(C2755i.f7982e);
        C2750d dVar = new C2750d("", C12929g.f33511c.mo37275b(), C12929g.f33511c.mo37275b());
        C2743b bVar2 = new C2743b(this, a2, kProperty, i.mo36441a(dVar, (BiFunction<R, ? super T, R>) C2752f.f7979a).mo36477d().mo36501i(C2753g.f7980e), a);
        C12279e<List<C5459d>> m2 = b.mo36509m(bVar2);
        C12932j.m33815a((Object) m2, "isInMeetMode.switchMap {…)\n            }\n        }");
        this.f7963d = m2;
    }

    /* renamed from: a */
    public final C12279e<List<C5459d>> mo8804a() {
        return this.f7963d;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final List<C5459d> m9231a(C5459d dVar, C5459d dVar2) {
        ArrayList arrayList = new ArrayList();
        for (double d = 0.0d; d <= ((double) 1); d += 0.01d) {
            arrayList.add(new C5459d(dVar.mo13060b() + ((dVar2.mo13060b() - dVar.mo13060b()) * d), dVar.mo13062c() + ((dVar2.mo13062c() - dVar.mo13062c()) * d)));
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo8807a(C2459c cVar) {
        C12932j.m33818b(cVar, "friendSelection");
        C2466a aVar = cVar.f7400a;
        String str = "";
        if (aVar != null) {
            int i = C2769n5.f7997a[aVar.ordinal()];
            if (i == 1 || i == 2) {
                C12785a<String> aVar2 = this.f7960a;
                String str2 = cVar.f7380c.f8197a;
                if (str2 == null) {
                    str2 = str;
                }
                aVar2.onNext(str2);
                return;
            }
        }
        this.f7960a.onNext(str);
    }

    /* renamed from: a */
    public final void mo8805a(int i) {
        this.f7962c.onNext(Integer.valueOf(i));
    }

    /* renamed from: a */
    public final void mo8806a(C2458b bVar) {
        C12932j.m33818b(bVar, "focusMode");
        this.f7961b.onNext(bVar);
    }
}
