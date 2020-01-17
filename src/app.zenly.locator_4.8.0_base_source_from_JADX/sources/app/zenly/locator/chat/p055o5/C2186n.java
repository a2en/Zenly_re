package app.zenly.locator.chat.p055o5;

import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.chat.o5.n */
public abstract class C2186n {

    /* renamed from: app.zenly.locator.chat.o5.n$a */
    public static final class C2187a extends C2186n {

        /* renamed from: a */
        private final C2188a f6724a;

        /* renamed from: app.zenly.locator.chat.o5.n$a$a */
        public enum C2188a {
            LOW_BATTERY,
            OUT_OF_BATTERY
        }

        public C2187a(C2188a aVar) {
            C12932j.m33818b(aVar, "level");
            super(null);
            this.f6724a = aVar;
        }

        /* renamed from: a */
        public final C2188a mo8012a() {
            return this.f6724a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (kotlin.jvm.internal.C12932j.m33817a((java.lang.Object) r1.f6724a, (java.lang.Object) ((app.zenly.locator.chat.p055o5.C2186n.C2187a) r2).f6724a) != false) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0015
                boolean r0 = r2 instanceof app.zenly.locator.chat.p055o5.C2186n.C2187a
                if (r0 == 0) goto L_0x0013
                app.zenly.locator.chat.o5.n$a r2 = (app.zenly.locator.chat.p055o5.C2186n.C2187a) r2
                app.zenly.locator.chat.o5.n$a$a r0 = r1.f6724a
                app.zenly.locator.chat.o5.n$a$a r2 = r2.f6724a
                boolean r2 = kotlin.jvm.internal.C12932j.m33817a(r0, r2)
                if (r2 == 0) goto L_0x0013
                goto L_0x0015
            L_0x0013:
                r2 = 0
                return r2
            L_0x0015:
                r2 = 1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.chat.p055o5.C2186n.C2187a.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            C2188a aVar = this.f6724a;
            if (aVar != null) {
                return aVar.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Battery(level=");
            sb.append(this.f6724a);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: app.zenly.locator.chat.o5.n$b */
    public static final class C2189b extends C2186n {

        /* renamed from: a */
        public static final C2189b f6728a = new C2189b();

        private C2189b() {
            super(null);
        }
    }

    private C2186n() {
    }

    public /* synthetic */ C2186n(C12928f fVar) {
        this();
    }
}
