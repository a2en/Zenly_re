package kotlinx.coroutines;

import kotlin.coroutines.C12868a;
import kotlin.coroutines.CoroutineContext.Key;

/* renamed from: kotlinx.coroutines.s */
public final class C13141s extends C12868a {

    /* renamed from: f */
    public static final C13142a f33744f = new C13142a(null);

    /* renamed from: e */
    private final String f33745e;

    /* renamed from: kotlinx.coroutines.s$a */
    public static final class C13142a implements Key<C13141s> {
        private C13142a() {
        }

        public /* synthetic */ C13142a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: a */
    public final String mo37663a() {
        return this.f33745e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C12932j.m33817a((java.lang.Object) r1.f33745e, (java.lang.Object) ((kotlinx.coroutines.C13141s) r2).f33745e) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof kotlinx.coroutines.C13141s
            if (r0 == 0) goto L_0x0013
            kotlinx.coroutines.s r2 = (kotlinx.coroutines.C13141s) r2
            java.lang.String r0 = r1.f33745e
            java.lang.String r2 = r2.f33745e
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
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C13141s.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str = this.f33745e;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CoroutineName(");
        sb.append(this.f33745e);
        sb.append(')');
        return sb.toString();
    }
}
