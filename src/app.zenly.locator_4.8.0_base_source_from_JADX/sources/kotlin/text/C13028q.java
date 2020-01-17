package kotlin.text;

import kotlin.jvm.internal.C12932j;

/* renamed from: kotlin.text.q */
class C13028q extends C13027p {
    /* renamed from: a */
    public static /* synthetic */ String m33999a(String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return m33998a(str, str2, str3, z);
    }

    /* renamed from: a */
    public static final String m33998a(String str, String str2, String str3, boolean z) {
        C12932j.m33818b(str, "$this$replace");
        C12932j.m33818b(str2, "oldValue");
        C12932j.m33818b(str3, "newValue");
        return C12990j.m33923a(C13029r.m34028b((CharSequence) str, new String[]{str2}, z, 0, 4, (Object) null), str3, null, null, 0, null, null, 62, null);
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m34003a(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m34002a(str, str2, z);
    }

    /* renamed from: a */
    public static final boolean m34002a(String str, String str2, boolean z) {
        C12932j.m33818b(str, "$this$startsWith");
        C12932j.m33818b(str2, "prefix");
        if (!z) {
            return str.startsWith(str2);
        }
        return m34001a(str, 0, str2, 0, str2.length(), z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m34000a(java.lang.CharSequence r4) {
        /*
            java.lang.String r0 = "$this$isBlank"
            kotlin.jvm.internal.C12932j.m33818b(r4, r0)
            int r0 = r4.length()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x003e
            kotlin.ranges.e r0 = kotlin.text.C13029r.m34026b(r4)
            boolean r3 = r0 instanceof java.util.Collection
            if (r3 == 0) goto L_0x0020
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0020
        L_0x001e:
            r4 = 1
            goto L_0x003c
        L_0x0020:
            java.util.Iterator r0 = r0.iterator()
        L_0x0024:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x001e
            r3 = r0
            kotlin.collections.b0 r3 = (kotlin.collections.C12819b0) r3
            int r3 = r3.mo37031a()
            char r3 = r4.charAt(r3)
            boolean r3 = kotlin.text.C13003a.m33944a(r3)
            if (r3 != 0) goto L_0x0024
            r4 = 0
        L_0x003c:
            if (r4 == 0) goto L_0x003f
        L_0x003e:
            r1 = 1
        L_0x003f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.C13028q.m34000a(java.lang.CharSequence):boolean");
    }

    /* renamed from: a */
    public static final boolean m34001a(String str, int i, String str2, int i2, int i3, boolean z) {
        C12932j.m33818b(str, "$this$regionMatches");
        C12932j.m33818b(str2, "other");
        if (!z) {
            return str.regionMatches(i, str2, i2, i3);
        }
        return str.regionMatches(z, i, str2, i2, i3);
    }
}
