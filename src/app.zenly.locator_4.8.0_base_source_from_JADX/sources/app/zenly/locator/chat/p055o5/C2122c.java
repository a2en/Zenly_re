package app.zenly.locator.chat.p055o5;

import kotlin.jvm.internal.C12932j;
import p213co.znly.models.C7391m1;

/* renamed from: app.zenly.locator.chat.o5.c */
public abstract class C2122c {

    /* renamed from: app.zenly.locator.chat.o5.c$a */
    public static final class C2123a extends C2122c {

        /* renamed from: a */
        private final C7391m1 f6622a;

        public C2123a(C7391m1 m1Var) {
            C12932j.m33818b(m1Var, "activity");
            super(null);
            this.f6622a = m1Var;
        }

        /* renamed from: a */
        public final C7391m1 mo7915a() {
            return this.f6622a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (kotlin.jvm.internal.C12932j.m33817a((java.lang.Object) r1.f6622a, (java.lang.Object) ((app.zenly.locator.chat.p055o5.C2122c.C2123a) r2).f6622a) != false) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0015
                boolean r0 = r2 instanceof app.zenly.locator.chat.p055o5.C2122c.C2123a
                if (r0 == 0) goto L_0x0013
                app.zenly.locator.chat.o5.c$a r2 = (app.zenly.locator.chat.p055o5.C2122c.C2123a) r2
                co.znly.models.m1 r0 = r1.f6622a
                co.znly.models.m1 r2 = r2.f6622a
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
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.chat.p055o5.C2122c.C2123a.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            C7391m1 m1Var = this.f6622a;
            if (m1Var != null) {
                return m1Var.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ChatActivity(activity=");
            sb.append(this.f6622a);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: app.zenly.locator.chat.o5.c$b */
    public static final class C2124b extends C2122c {

        /* renamed from: a */
        public static final C2124b f6623a = new C2124b();

        private C2124b() {
            super(null);
        }
    }

    /* renamed from: app.zenly.locator.chat.o5.c$c */
    public static final class C2125c extends C2122c {

        /* renamed from: a */
        private final C2137f f6624a;

        public C2125c(C2137f fVar) {
            C12932j.m33818b(fVar, "status");
            super(null);
            this.f6624a = fVar;
        }

        /* renamed from: a */
        public final C2137f mo7919a() {
            return this.f6624a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (kotlin.jvm.internal.C12932j.m33817a((java.lang.Object) r1.f6624a, (java.lang.Object) ((app.zenly.locator.chat.p055o5.C2122c.C2125c) r2).f6624a) != false) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0015
                boolean r0 = r2 instanceof app.zenly.locator.chat.p055o5.C2122c.C2125c
                if (r0 == 0) goto L_0x0013
                app.zenly.locator.chat.o5.c$c r2 = (app.zenly.locator.chat.p055o5.C2122c.C2125c) r2
                app.zenly.locator.chat.o5.f r0 = r1.f6624a
                app.zenly.locator.chat.o5.f r2 = r2.f6624a
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
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.chat.p055o5.C2122c.C2125c.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            C2137f fVar = this.f6624a;
            if (fVar != null) {
                return fVar.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("StatusWithImage(status=");
            sb.append(this.f6624a);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: app.zenly.locator.chat.o5.c$d */
    public static final class C2126d extends C2122c {

        /* renamed from: a */
        public static final C2126d f6625a = new C2126d();

        private C2126d() {
            super(null);
        }
    }

    private C2122c() {
    }

    public /* synthetic */ C2122c(C12928f fVar) {
        this();
    }
}
