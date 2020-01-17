package app.zenly.locator.core.invitations;

import java.util.List;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.core.invitations.a0 */
public abstract class C2530a0 {

    /* renamed from: app.zenly.locator.core.invitations.a0$a */
    public static final class C2531a extends C2530a0 {

        /* renamed from: a */
        private final String f7575a;

        /* renamed from: b */
        private final String f7576b;

        public C2531a(String str, String str2) {
            C12932j.m33818b(str, "uuid");
            C12932j.m33818b(str2, "bumpId");
            super(null);
            this.f7575a = str;
            this.f7576b = str2;
        }

        /* renamed from: a */
        public final String mo8641a() {
            return this.f7576b;
        }

        /* renamed from: b */
        public final String mo8642b() {
            return this.f7575a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
            if (kotlin.jvm.internal.C12932j.m33817a((java.lang.Object) r2.f7576b, (java.lang.Object) r3.f7576b) != false) goto L_0x001f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x001f
                boolean r0 = r3 instanceof app.zenly.locator.core.invitations.C2530a0.C2531a
                if (r0 == 0) goto L_0x001d
                app.zenly.locator.core.invitations.a0$a r3 = (app.zenly.locator.core.invitations.C2530a0.C2531a) r3
                java.lang.String r0 = r2.f7575a
                java.lang.String r1 = r3.f7575a
                boolean r0 = kotlin.jvm.internal.C12932j.m33817a(r0, r1)
                if (r0 == 0) goto L_0x001d
                java.lang.String r0 = r2.f7576b
                java.lang.String r3 = r3.f7576b
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
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.core.invitations.C2530a0.C2531a.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            String str = this.f7575a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f7576b;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Bump(uuid=");
            sb.append(this.f7575a);
            sb.append(", bumpId=");
            sb.append(this.f7576b);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: app.zenly.locator.core.invitations.a0$b */
    public static final class C2532b extends C2530a0 {

        /* renamed from: a */
        private final List<String> f7577a;

        public C2532b(List<String> list) {
            C12932j.m33818b(list, "phoneNumbers");
            super(null);
            this.f7577a = list;
        }

        /* renamed from: a */
        public final List<String> mo8646a() {
            return this.f7577a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (kotlin.jvm.internal.C12932j.m33817a((java.lang.Object) r1.f7577a, (java.lang.Object) ((app.zenly.locator.core.invitations.C2530a0.C2532b) r2).f7577a) != false) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0015
                boolean r0 = r2 instanceof app.zenly.locator.core.invitations.C2530a0.C2532b
                if (r0 == 0) goto L_0x0013
                app.zenly.locator.core.invitations.a0$b r2 = (app.zenly.locator.core.invitations.C2530a0.C2532b) r2
                java.util.List<java.lang.String> r0 = r1.f7577a
                java.util.List<java.lang.String> r2 = r2.f7577a
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
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.core.invitations.C2530a0.C2532b.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            List<String> list = this.f7577a;
            if (list != null) {
                return list.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PhoneNumber(phoneNumbers=");
            sb.append(this.f7577a);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: app.zenly.locator.core.invitations.a0$c */
    public static final class C2533c extends C2530a0 {

        /* renamed from: a */
        private final String f7578a;

        public C2533c(String str) {
            C12932j.m33818b(str, "uuid");
            super(null);
            this.f7578a = str;
        }

        /* renamed from: a */
        public final String mo8650a() {
            return this.f7578a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (kotlin.jvm.internal.C12932j.m33817a((java.lang.Object) r1.f7578a, (java.lang.Object) ((app.zenly.locator.core.invitations.C2530a0.C2533c) r2).f7578a) != false) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0015
                boolean r0 = r2 instanceof app.zenly.locator.core.invitations.C2530a0.C2533c
                if (r0 == 0) goto L_0x0013
                app.zenly.locator.core.invitations.a0$c r2 = (app.zenly.locator.core.invitations.C2530a0.C2533c) r2
                java.lang.String r0 = r1.f7578a
                java.lang.String r2 = r2.f7578a
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
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.core.invitations.C2530a0.C2533c.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            String str = this.f7578a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("UserUuid(uuid=");
            sb.append(this.f7578a);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: app.zenly.locator.core.invitations.a0$d */
    public static final class C2534d extends C2530a0 {

        /* renamed from: a */
        private final String f7579a;

        public C2534d(String str) {
            C12932j.m33818b(str, "username");
            super(null);
            this.f7579a = str;
        }

        /* renamed from: a */
        public final String mo8654a() {
            return this.f7579a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (kotlin.jvm.internal.C12932j.m33817a((java.lang.Object) r1.f7579a, (java.lang.Object) ((app.zenly.locator.core.invitations.C2530a0.C2534d) r2).f7579a) != false) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0015
                boolean r0 = r2 instanceof app.zenly.locator.core.invitations.C2530a0.C2534d
                if (r0 == 0) goto L_0x0013
                app.zenly.locator.core.invitations.a0$d r2 = (app.zenly.locator.core.invitations.C2530a0.C2534d) r2
                java.lang.String r0 = r1.f7579a
                java.lang.String r2 = r2.f7579a
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
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.core.invitations.C2530a0.C2534d.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            String str = this.f7579a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Username(username=");
            sb.append(this.f7579a);
            sb.append(")");
            return sb.toString();
        }
    }

    private C2530a0() {
    }

    public /* synthetic */ C2530a0(C12928f fVar) {
        this();
    }
}
