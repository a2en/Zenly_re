package app.zenly.locator.chat.p055o5;

import app.zenly.locator.core.models.C2916z.C2918b;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.chat.o5.f */
public abstract class C2137f {

    /* renamed from: a */
    private final C2190o f6635a;

    /* renamed from: app.zenly.locator.chat.o5.f$a */
    public static final class C2138a extends C2137f {

        /* renamed from: b */
        private final C2918b f6636b;

        /* renamed from: c */
        private final long f6637c;

        /* renamed from: d */
        private final boolean f6638d;

        /* renamed from: e */
        private final double f6639e;

        public C2138a(C2918b bVar, long j, boolean z, double d) {
            C12932j.m33818b(bVar, "destination");
            super(null, 1, null);
            this.f6636b = bVar;
            this.f6637c = j;
            this.f6638d = z;
            this.f6639e = d;
        }

        /* renamed from: b */
        public final C2918b mo7953b() {
            return this.f6636b;
        }

        /* renamed from: c */
        public final long mo7954c() {
            return this.f6637c;
        }

        /* renamed from: d */
        public final boolean mo7955d() {
            return this.f6638d;
        }

        /* renamed from: e */
        public final double mo7956e() {
            return this.f6639e;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C2138a) {
                    C2138a aVar = (C2138a) obj;
                    if (C12932j.m33817a((Object) this.f6636b, (Object) aVar.f6636b)) {
                        if (this.f6637c == aVar.f6637c) {
                            if (!(this.f6638d == aVar.f6638d) || Double.compare(this.f6639e, aVar.f6639e) != 0) {
                                return false;
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            C2918b bVar = this.f6636b;
            int hashCode = (((bVar != null ? bVar.hashCode() : 0) * 31) + Long.valueOf(this.f6637c).hashCode()) * 31;
            boolean z = this.f6638d;
            if (z) {
                z = true;
            }
            return ((hashCode + (z ? 1 : 0)) * 31) + Double.valueOf(this.f6639e).hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Heading(destination=");
            sb.append(this.f6636b);
            sb.append(", eta=");
            sb.append(this.f6637c);
            sb.append(", shouldDisplay=");
            sb.append(this.f6638d);
            sb.append(", speed=");
            sb.append(this.f6639e);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: app.zenly.locator.chat.o5.f$b */
    public static final class C2139b extends C2137f {

        /* renamed from: b */
        public static final C2139b f6640b = new C2139b();

        private C2139b() {
            super(null, 1, null);
        }
    }

    /* renamed from: app.zenly.locator.chat.o5.f$c */
    public static final class C2140c extends C2137f {

        /* renamed from: b */
        private final boolean f6641b;

        /* renamed from: c */
        private final double f6642c;

        public C2140c(boolean z, double d) {
            super(null, 1, null);
            this.f6641b = z;
            this.f6642c = d;
        }

        /* renamed from: b */
        public final boolean mo7960b() {
            return this.f6641b;
        }

        /* renamed from: c */
        public final double mo7961c() {
            return this.f6642c;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C2140c) {
                    C2140c cVar = (C2140c) obj;
                    if (!(this.f6641b == cVar.f6641b) || Double.compare(this.f6642c, cVar.f6642c) != 0) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            boolean z = this.f6641b;
            if (z) {
                z = true;
            }
            return ((z ? 1 : 0) * true) + Double.valueOf(this.f6642c).hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Moving(shouldDisplay=");
            sb.append(this.f6641b);
            sb.append(", speed=");
            sb.append(this.f6642c);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: app.zenly.locator.chat.o5.f$d */
    public static final class C2141d extends C2137f {

        /* renamed from: b */
        private final long f6643b;

        /* renamed from: c */
        private final long f6644c;

        /* renamed from: d */
        private final String f6645d;

        public C2141d(long j, long j2, String str) {
            C12932j.m33818b(str, "timeZone");
            super(null, 1, null);
            this.f6643b = j;
            this.f6644c = j2;
            this.f6645d = str;
        }

        /* renamed from: b */
        public final long mo7965b() {
            return this.f6643b;
        }

        /* renamed from: c */
        public final long mo7966c() {
            return this.f6644c;
        }

        /* renamed from: d */
        public final String mo7967d() {
            return this.f6645d;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C2141d) {
                    C2141d dVar = (C2141d) obj;
                    if (this.f6643b == dVar.f6643b) {
                        if (!(this.f6644c == dVar.f6644c) || !C12932j.m33817a((Object) this.f6645d, (Object) dVar.f6645d)) {
                            return false;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            int a = ((Long.valueOf(this.f6643b).hashCode() * 31) + Long.valueOf(this.f6644c).hashCode()) * 31;
            String str = this.f6645d;
            return a + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Sleeping(bedTime=");
            sb.append(this.f6643b);
            sb.append(", estimatedWakeUpTime=");
            sb.append(this.f6644c);
            sb.append(", timeZone=");
            sb.append(this.f6645d);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: app.zenly.locator.chat.o5.f$e */
    public static final class C2142e extends C2137f {

        /* renamed from: b */
        private final C2190o f6646b;

        /* renamed from: c */
        private final C2132e f6647c;

        /* renamed from: d */
        private final C2127d f6648d;

        public C2142e(C2190o oVar, C2132e eVar, C2127d dVar) {
            C12932j.m33818b(eVar, "location");
            C12932j.m33818b(dVar, "liveness");
            super(oVar, null);
            this.f6646b = oVar;
            this.f6647c = eVar;
            this.f6648d = dVar;
        }

        /* renamed from: a */
        public static /* synthetic */ C2142e m7895a(C2142e eVar, C2190o oVar, C2132e eVar2, C2127d dVar, int i, Object obj) {
            if ((i & 1) != 0) {
                oVar = eVar.mo7952a();
            }
            if ((i & 2) != 0) {
                eVar2 = eVar.f6647c;
            }
            if ((i & 4) != 0) {
                dVar = eVar.f6648d;
            }
            return eVar.mo7971a(oVar, eVar2, dVar);
        }

        /* renamed from: a */
        public final C2142e mo7971a(C2190o oVar, C2132e eVar, C2127d dVar) {
            C12932j.m33818b(eVar, "location");
            C12932j.m33818b(dVar, "liveness");
            return new C2142e(oVar, eVar, dVar);
        }

        /* renamed from: a */
        public C2190o mo7952a() {
            return this.f6646b;
        }

        /* renamed from: b */
        public final C2127d mo7972b() {
            return this.f6648d;
        }

        /* renamed from: c */
        public final C2132e mo7973c() {
            return this.f6647c;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0028, code lost:
            if (kotlin.jvm.internal.C12932j.m33817a((java.lang.Object) r2.f6648d, (java.lang.Object) r3.f6648d) != false) goto L_0x002d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x002d
                boolean r0 = r3 instanceof app.zenly.locator.chat.p055o5.C2137f.C2142e
                if (r0 == 0) goto L_0x002b
                app.zenly.locator.chat.o5.f$e r3 = (app.zenly.locator.chat.p055o5.C2137f.C2142e) r3
                app.zenly.locator.chat.o5.o r0 = r2.mo7952a()
                app.zenly.locator.chat.o5.o r1 = r3.mo7952a()
                boolean r0 = kotlin.jvm.internal.C12932j.m33817a(r0, r1)
                if (r0 == 0) goto L_0x002b
                app.zenly.locator.chat.o5.e r0 = r2.f6647c
                app.zenly.locator.chat.o5.e r1 = r3.f6647c
                boolean r0 = kotlin.jvm.internal.C12932j.m33817a(r0, r1)
                if (r0 == 0) goto L_0x002b
                app.zenly.locator.chat.o5.d r0 = r2.f6648d
                app.zenly.locator.chat.o5.d r3 = r3.f6648d
                boolean r3 = kotlin.jvm.internal.C12932j.m33817a(r0, r3)
                if (r3 == 0) goto L_0x002b
                goto L_0x002d
            L_0x002b:
                r3 = 0
                return r3
            L_0x002d:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.chat.p055o5.C2137f.C2142e.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            C2190o a = mo7952a();
            int i = 0;
            int hashCode = (a != null ? a.hashCode() : 0) * 31;
            C2132e eVar = this.f6647c;
            int hashCode2 = (hashCode + (eVar != null ? eVar.hashCode() : 0)) * 31;
            C2127d dVar = this.f6648d;
            if (dVar != null) {
                i = dVar.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Static(ticker=");
            sb.append(mo7952a());
            sb.append(", location=");
            sb.append(this.f6647c);
            sb.append(", liveness=");
            sb.append(this.f6648d);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: app.zenly.locator.chat.o5.f$f */
    public static final class C2143f extends C2137f {

        /* renamed from: b */
        public static final C2143f f6649b = new C2143f();

        private C2143f() {
            super(null, 1, null);
        }
    }

    private C2137f(C2190o oVar) {
        this.f6635a = oVar;
    }

    /* renamed from: a */
    public C2190o mo7952a() {
        return this.f6635a;
    }

    public /* synthetic */ C2137f(C2190o oVar, C12928f fVar) {
        this(oVar);
    }

    /* synthetic */ C2137f(C2190o oVar, int i, C12928f fVar) {
        if ((i & 1) != 0) {
            oVar = null;
        }
        this(oVar);
    }
}
