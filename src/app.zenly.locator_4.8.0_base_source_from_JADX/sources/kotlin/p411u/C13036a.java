package kotlin.p411u;

import java.lang.reflect.Method;
import java.util.regex.MatchResult;
import kotlin.jvm.internal.C12932j;
import kotlin.text.C13008e;

/* renamed from: kotlin.u.a */
public class C13036a {

    /* renamed from: kotlin.u.a$a */
    private static final class C13037a {

        /* renamed from: a */
        public static final Method f33623a;

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0047 A[EDGE_INSN: B:13:0x0047->B:11:0x0047 ?: BREAK  , SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x0043 A[LOOP:0: B:1:0x0013->B:9:0x0043, LOOP_END] */
        static {
            /*
                kotlin.u.a$a r0 = new kotlin.u.a$a
                r0.<init>()
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r1 = r0.getMethods()
                java.lang.String r2 = "throwableClass.methods"
                kotlin.jvm.internal.C12932j.m33815a(r1, r2)
                int r2 = r1.length
                r3 = 0
                r4 = 0
            L_0x0013:
                if (r4 >= r2) goto L_0x0046
                r5 = r1[r4]
                java.lang.String r6 = "it"
                kotlin.jvm.internal.C12932j.m33815a(r5, r6)
                java.lang.String r6 = r5.getName()
                java.lang.String r7 = "addSuppressed"
                boolean r6 = kotlin.jvm.internal.C12932j.m33817a(r6, r7)
                if (r6 == 0) goto L_0x003f
                java.lang.Class[] r6 = r5.getParameterTypes()
                java.lang.String r7 = "it.parameterTypes"
                kotlin.jvm.internal.C12932j.m33815a(r6, r7)
                java.lang.Object r6 = kotlin.collections.C12840k.m33581f(r6)
                java.lang.Class r6 = (java.lang.Class) r6
                boolean r6 = kotlin.jvm.internal.C12932j.m33817a(r6, r0)
                if (r6 == 0) goto L_0x003f
                r6 = 1
                goto L_0x0040
            L_0x003f:
                r6 = 0
            L_0x0040:
                if (r6 == 0) goto L_0x0043
                goto L_0x0047
            L_0x0043:
                int r4 = r4 + 1
                goto L_0x0013
            L_0x0046:
                r5 = 0
            L_0x0047:
                f33623a = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.p411u.C13036a.C13037a.<clinit>():void");
        }

        private C13037a() {
        }
    }

    /* renamed from: a */
    public void mo37419a(Throwable th, Throwable th2) {
        C12932j.m33818b(th, "cause");
        C12932j.m33818b(th2, "exception");
        Method method = C13037a.f33623a;
        if (method != null) {
            method.invoke(th, new Object[]{th2});
        }
    }

    /* renamed from: a */
    public C13008e mo37418a(MatchResult matchResult, String str) {
        C12932j.m33818b(matchResult, "matchResult");
        C12932j.m33818b(str, "name");
        throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
    }
}
