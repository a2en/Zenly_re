package app.zenly.locator.map.p109i1;

import app.zenly.locator.core.models.C2916z.C2918b;
import app.zenly.locator.core.util.C3245z;
import app.zenly.locator.p143s.p150n.C5459d;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.ZenlyCore;
import p213co.znly.models.core.C7170n0;
import p213co.znly.models.core.C7178o0;
import p213co.znly.models.core.C7178o0.C7179a;
import p213co.znly.models.core.C7186p0;
import p213co.znly.models.core.C7196q0;
import p213co.znly.models.core.C7196q0.C7197a;
import p213co.znly.models.services.usermonitor.C8316b;
import p213co.znly.models.services.usermonitor.C8324f;
import p213co.znly.models.services.usermonitor.C8324f.C8326b;
import p389io.reactivex.C12291g;
import p389io.reactivex.functions.Function;

/* renamed from: app.zenly.locator.map.i1.q1 */
public final class C4050q1 {

    /* renamed from: a */
    private final ZenlyCore f10641a;

    /* renamed from: app.zenly.locator.map.i1.q1$a */
    public static abstract class C4051a {

        /* renamed from: a */
        private final String f10642a;

        /* renamed from: b */
        private final C8316b f10643b;

        /* renamed from: app.zenly.locator.map.i1.q1$a$a */
        public static final class C4052a extends C4051a {

            /* renamed from: c */
            private final String f10644c;

            /* renamed from: d */
            private final C5459d f10645d;

            /* renamed from: e */
            private final double f10646e;

            /* renamed from: f */
            private final C2918b f10647f;

            /* renamed from: g */
            private final Long f10648g;

            /* renamed from: h */
            private final Long f10649h;

            public C4052a(String str, C5459d dVar, double d, C2918b bVar, Long l, Long l2) {
                C12932j.m33818b(str, "uuid");
                C12932j.m33818b(dVar, "location");
                super(str, C8316b.OnEnterGeofence, null);
                this.f10644c = str;
                this.f10645d = dVar;
                this.f10646e = d;
                this.f10647f = bVar;
                this.f10648g = l;
                this.f10649h = l2;
            }

            /* renamed from: c */
            public final Long mo10713c() {
                return this.f10649h;
            }

            /* renamed from: d */
            public final C5459d mo10714d() {
                return this.f10645d;
            }

            /* renamed from: e */
            public final C2918b mo10715e() {
                return this.f10647f;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
                if (kotlin.jvm.internal.C12932j.m33817a((java.lang.Object) r4.f10649h, (java.lang.Object) r5.f10649h) != false) goto L_0x0047;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean equals(java.lang.Object r5) {
                /*
                    r4 = this;
                    if (r4 == r5) goto L_0x0047
                    boolean r0 = r5 instanceof app.zenly.locator.map.p109i1.C4050q1.C4051a.C4052a
                    if (r0 == 0) goto L_0x0045
                    app.zenly.locator.map.i1.q1$a$a r5 = (app.zenly.locator.map.p109i1.C4050q1.C4051a.C4052a) r5
                    java.lang.String r0 = r4.f10644c
                    java.lang.String r1 = r5.f10644c
                    boolean r0 = kotlin.jvm.internal.C12932j.m33817a(r0, r1)
                    if (r0 == 0) goto L_0x0045
                    app.zenly.locator.s.n.d r0 = r4.f10645d
                    app.zenly.locator.s.n.d r1 = r5.f10645d
                    boolean r0 = kotlin.jvm.internal.C12932j.m33817a(r0, r1)
                    if (r0 == 0) goto L_0x0045
                    double r0 = r4.f10646e
                    double r2 = r5.f10646e
                    int r0 = java.lang.Double.compare(r0, r2)
                    if (r0 != 0) goto L_0x0045
                    app.zenly.locator.core.models.z$b r0 = r4.f10647f
                    app.zenly.locator.core.models.z$b r1 = r5.f10647f
                    boolean r0 = kotlin.jvm.internal.C12932j.m33817a(r0, r1)
                    if (r0 == 0) goto L_0x0045
                    java.lang.Long r0 = r4.f10648g
                    java.lang.Long r1 = r5.f10648g
                    boolean r0 = kotlin.jvm.internal.C12932j.m33817a(r0, r1)
                    if (r0 == 0) goto L_0x0045
                    java.lang.Long r0 = r4.f10649h
                    java.lang.Long r5 = r5.f10649h
                    boolean r5 = kotlin.jvm.internal.C12932j.m33817a(r0, r5)
                    if (r5 == 0) goto L_0x0045
                    goto L_0x0047
                L_0x0045:
                    r5 = 0
                    return r5
                L_0x0047:
                    r5 = 1
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.map.p109i1.C4050q1.C4051a.C4052a.equals(java.lang.Object):boolean");
            }

            /* renamed from: f */
            public final Long mo10717f() {
                return this.f10648g;
            }

            /* renamed from: g */
            public final double mo10718g() {
                return this.f10646e;
            }

            public int hashCode() {
                String str = this.f10644c;
                int i = 0;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                C5459d dVar = this.f10645d;
                int hashCode2 = (((hashCode + (dVar != null ? dVar.hashCode() : 0)) * 31) + Double.valueOf(this.f10646e).hashCode()) * 31;
                C2918b bVar = this.f10647f;
                int hashCode3 = (hashCode2 + (bVar != null ? bVar.hashCode() : 0)) * 31;
                Long l = this.f10648g;
                int hashCode4 = (hashCode3 + (l != null ? l.hashCode() : 0)) * 31;
                Long l2 = this.f10649h;
                if (l2 != null) {
                    i = l2.hashCode();
                }
                return hashCode4 + i;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("OnEnterGeofence(uuid=");
                sb.append(this.f10644c);
                sb.append(", location=");
                sb.append(this.f10645d);
                sb.append(", radius=");
                sb.append(this.f10646e);
                sb.append(", place=");
                sb.append(this.f10647f);
                sb.append(", placeId=");
                sb.append(this.f10648g);
                sb.append(", eta=");
                sb.append(this.f10649h);
                sb.append(")");
                return sb.toString();
            }
        }

        /* renamed from: app.zenly.locator.map.i1.q1$a$b */
        public static final class C4053b extends C4051a {

            /* renamed from: c */
            private final String f10650c;

            /* renamed from: d */
            private final Long f10651d;

            public C4053b(String str, Long l) {
                C12932j.m33818b(str, "uuid");
                super(str, C8316b.OnWakeUp, null);
                this.f10650c = str;
                this.f10651d = l;
            }

            /* renamed from: c */
            public final Long mo10721c() {
                return this.f10651d;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
                if (kotlin.jvm.internal.C12932j.m33817a((java.lang.Object) r2.f10651d, (java.lang.Object) r3.f10651d) != false) goto L_0x001f;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean equals(java.lang.Object r3) {
                /*
                    r2 = this;
                    if (r2 == r3) goto L_0x001f
                    boolean r0 = r3 instanceof app.zenly.locator.map.p109i1.C4050q1.C4051a.C4053b
                    if (r0 == 0) goto L_0x001d
                    app.zenly.locator.map.i1.q1$a$b r3 = (app.zenly.locator.map.p109i1.C4050q1.C4051a.C4053b) r3
                    java.lang.String r0 = r2.f10650c
                    java.lang.String r1 = r3.f10650c
                    boolean r0 = kotlin.jvm.internal.C12932j.m33817a(r0, r1)
                    if (r0 == 0) goto L_0x001d
                    java.lang.Long r0 = r2.f10651d
                    java.lang.Long r3 = r3.f10651d
                    boolean r3 = kotlin.jvm.internal.C12932j.m33817a(r0, r3)
                    if (r3 == 0) goto L_0x001d
                    goto L_0x001f
                L_0x001d:
                    r3 = 0
                    return r3
                L_0x001f:
                    r3 = 1
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.map.p109i1.C4050q1.C4051a.C4053b.equals(java.lang.Object):boolean");
            }

            public int hashCode() {
                String str = this.f10650c;
                int i = 0;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                Long l = this.f10651d;
                if (l != null) {
                    i = l.hashCode();
                }
                return hashCode + i;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("OnWakeUp(uuid=");
                sb.append(this.f10650c);
                sb.append(", expectedWakeup=");
                sb.append(this.f10651d);
                sb.append(")");
                return sb.toString();
            }
        }

        private C4051a(String str, C8316b bVar) {
            this.f10642a = str;
            this.f10643b = bVar;
        }

        /* renamed from: a */
        public final C8316b mo10711a() {
            return this.f10643b;
        }

        /* renamed from: b */
        public final String mo10712b() {
            return this.f10642a;
        }

        public /* synthetic */ C4051a(String str, C8316b bVar, C12928f fVar) {
            this(str, bVar);
        }
    }

    /* renamed from: app.zenly.locator.map.i1.q1$b */
    static final class C4054b<T, R> implements Function<T, R> {

        /* renamed from: e */
        public static final C4054b f10652e = new C4054b();

        C4054b() {
        }

        /* renamed from: a */
        public final boolean mo10725a(C7186p0 p0Var) {
            C12932j.m33818b(p0Var, "response");
            C8324f error = p0Var.getError();
            C12932j.m33815a((Object) error, "response.error");
            return error.getErrorCode() == C8326b.ERROR_NO_ERROR;
        }

        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            return Boolean.valueOf(mo10725a((C7186p0) obj));
        }
    }

    /* renamed from: app.zenly.locator.map.i1.q1$c */
    static final class C4055c<T, R> implements Function<T, R> {

        /* renamed from: e */
        public static final C4055c f10653e = new C4055c();

        C4055c() {
        }

        /* renamed from: a */
        public final boolean mo10726a(C7170n0 n0Var) {
            C12932j.m33818b(n0Var, "r");
            return n0Var.getIsExist();
        }

        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            return Boolean.valueOf(mo10726a((C7170n0) obj));
        }
    }

    /* renamed from: app.zenly.locator.map.i1.q1$d */
    static final class C4056d<T, R> implements Function<T, R> {

        /* renamed from: e */
        public static final C4056d f10654e = new C4056d();

        C4056d() {
        }

        /* renamed from: a */
        public final boolean mo10727a(C7186p0 p0Var) {
            C12932j.m33818b(p0Var, "response");
            C8324f error = p0Var.getError();
            C12932j.m33815a((Object) error, "response.error");
            return error.getErrorCode() == C8326b.ERROR_NO_ERROR;
        }

        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            return Boolean.valueOf(mo10727a((C7186p0) obj));
        }
    }

    public C4050q1(ZenlyCore zenlyCore) {
        C12932j.m33818b(zenlyCore, "core");
        this.f10641a = zenlyCore;
    }

    /* renamed from: a */
    public final C12291g<Boolean> mo10709a(String str, C8316b bVar) {
        C12932j.m33818b(str, "uuid");
        C12932j.m33818b(bVar, "type");
        C7179a newBuilder = C7178o0.newBuilder();
        newBuilder.mo19173a(str);
        newBuilder.mo19172a(bVar);
        C12291g<Boolean> d = this.f10641a.userMonitoringExist((C7178o0) newBuilder.build()).mo36552d((Function<? super T, ? extends R>) C4055c.f10653e);
        C12932j.m33815a((Object) d, "core.userMonitoringExist…  .map { r -> r.isExist }");
        return d;
    }

    /* renamed from: b */
    public final C12291g<Boolean> mo10710b(String str, C8316b bVar) {
        C12932j.m33818b(str, "uuid");
        C12932j.m33818b(bVar, "type");
        C7179a newBuilder = C7178o0.newBuilder();
        newBuilder.mo19172a(bVar);
        newBuilder.mo19173a(str);
        C12291g<Boolean> d = this.f10641a.userMonitoringDelete((C7178o0) newBuilder.build()).mo36552d((Function<? super T, ? extends R>) C4056d.f10654e);
        C12932j.m33815a((Object) d, "core.userMonitoringDelet…OR_NO_ERROR\n            }");
        return d;
    }

    /* renamed from: a */
    public final C12291g<Boolean> mo10708a(C4051a aVar) {
        C12932j.m33818b(aVar, "request");
        C7197a newBuilder = C7196q0.newBuilder();
        newBuilder.mo19179a(aVar.mo10712b());
        newBuilder.mo19178a(aVar.mo10711a());
        if (aVar instanceof C4052a) {
            C4052a aVar2 = (C4052a) aVar;
            newBuilder.setLatitude(aVar2.mo10714d().mo13060b());
            newBuilder.setLongitude(aVar2.mo10714d().mo13062c());
            newBuilder.mo19174a(aVar2.mo10718g());
            if (aVar2.mo10715e() != null) {
                newBuilder.mo19177a(aVar2.mo10715e().mo9024a());
            }
            if (aVar2.mo10717f() != null) {
                newBuilder.mo19175a(aVar2.mo10717f().longValue());
            }
            if (aVar2.mo10713c() != null) {
                newBuilder.mo19180b(C3245z.m10282a(aVar2.mo10713c().longValue()));
            }
        } else if (aVar instanceof C4053b) {
            C4053b bVar = (C4053b) aVar;
            if (bVar.mo10721c() != null) {
                newBuilder.mo19176a(C3245z.m10282a(bVar.mo10721c().longValue()));
            }
        }
        C12291g<Boolean> d = this.f10641a.userMonitoringUpsert((C7196q0) newBuilder.build()).mo36552d((Function<? super T, ? extends R>) C4054b.f10652e);
        C12932j.m33815a((Object) d, "core.userMonitoringUpser…OR_NO_ERROR\n            }");
        return d;
    }
}
