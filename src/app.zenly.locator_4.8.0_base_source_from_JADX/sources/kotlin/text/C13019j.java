package kotlin.text;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;

/* renamed from: kotlin.text.j */
class C13019j {

    /* renamed from: kotlin.text.j$a */
    static final class C13020a extends C12933k implements Function1<String, String> {

        /* renamed from: f */
        public static final C13020a f33617f = new C13020a();

        C13020a() {
            super(1);
        }

        /* renamed from: a */
        public final String mo37413a(String str) {
            C12932j.m33818b(str, "line");
            return str;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            String str = (String) obj;
            mo37413a(str);
            return str;
        }
    }

    /* renamed from: kotlin.text.j$b */
    static final class C13021b extends C12933k implements Function1<String, String> {

        /* renamed from: f */
        final /* synthetic */ String f33618f;

        C13021b(String str) {
            this.f33618f = str;
            super(1);
        }

        /* renamed from: a */
        public final String invoke(String str) {
            C12932j.m33818b(str, "line");
            StringBuilder sb = new StringBuilder();
            sb.append(this.f33618f);
            sb.append(str);
            return sb.toString();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00af, code lost:
        if (r7 != null) goto L_0x00b3;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m33986a(java.lang.String r14, java.lang.String r15) {
        /*
            java.lang.String r0 = "$this$replaceIndent"
            kotlin.jvm.internal.C12932j.m33818b(r14, r0)
            java.lang.String r0 = "newIndent"
            kotlin.jvm.internal.C12932j.m33818b(r15, r0)
            java.util.List r0 = kotlin.text.C13029r.m34032e(r14)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r0.iterator()
        L_0x0017:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0030
            java.lang.Object r3 = r2.next()
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = kotlin.text.C13028q.m34000a(r4)
            r4 = r4 ^ 1
            if (r4 == 0) goto L_0x0017
            r1.add(r3)
            goto L_0x0017
        L_0x0030:
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = kotlin.collections.C12850p.m33647a(r1, r3)
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L_0x003f:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0057
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            int r3 = m33988b(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.add(r3)
            goto L_0x003f
        L_0x0057:
            java.lang.Comparable r1 = kotlin.collections.C12857w.m33681f(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r2 = 0
            if (r1 == 0) goto L_0x0065
            int r1 = r1.intValue()
            goto L_0x0066
        L_0x0065:
            r1 = 0
        L_0x0066:
            int r14 = r14.length()
            int r3 = r15.length()
            int r4 = r0.size()
            int r3 = r3 * r4
            int r14 = r14 + r3
            kotlin.jvm.functions.Function1 r15 = m33987a(r15)
            int r3 = kotlin.collections.C12848o.m33638a(r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0086:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x00be
            java.lang.Object r5 = r0.next()
            int r6 = r2 + 1
            r7 = 0
            if (r2 < 0) goto L_0x00ba
            java.lang.String r5 = (java.lang.String) r5
            if (r2 == 0) goto L_0x009b
            if (r2 != r3) goto L_0x00a2
        L_0x009b:
            boolean r2 = kotlin.text.C13028q.m34000a(r5)
            if (r2 == 0) goto L_0x00a2
            goto L_0x00b3
        L_0x00a2:
            java.lang.String r2 = kotlin.text.C13033t.m34036c(r5, r1)
            if (r2 == 0) goto L_0x00b2
            java.lang.Object r2 = r15.invoke(r2)
            r7 = r2
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L_0x00b2
            goto L_0x00b3
        L_0x00b2:
            r7 = r5
        L_0x00b3:
            if (r7 == 0) goto L_0x00b8
            r4.add(r7)
        L_0x00b8:
            r2 = r6
            goto L_0x0086
        L_0x00ba:
            kotlin.collections.C12844m.m33616c()
            throw r7
        L_0x00be:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>(r14)
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 124(0x7c, float:1.74E-43)
            r13 = 0
            java.lang.String r6 = "\n"
            r5 = r15
            kotlin.collections.C12857w.m33660a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.StringBuilder r15 = (java.lang.StringBuilder) r15
            java.lang.String r14 = r15.toString()
            java.lang.String r15 = "mapIndexedNotNull { inde…\"\\n\")\n        .toString()"
            kotlin.jvm.internal.C12932j.m33815a(r14, r15)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.C13019j.m33986a(java.lang.String, java.lang.String):java.lang.String");
    }

    /* renamed from: b */
    private static final int m33988b(String str) {
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (!C13003a.m33944a(str.charAt(i))) {
                break;
            } else {
                i++;
            }
        }
        return i == -1 ? str.length() : i;
    }

    /* renamed from: c */
    public static String m33989c(String str) {
        C12932j.m33818b(str, "$this$trimIndent");
        return m33986a(str, "");
    }

    /* renamed from: a */
    private static final Function1<String, String> m33987a(String str) {
        if (str.length() == 0) {
            return C13020a.f33617f;
        }
        return new C13021b(str);
    }
}
