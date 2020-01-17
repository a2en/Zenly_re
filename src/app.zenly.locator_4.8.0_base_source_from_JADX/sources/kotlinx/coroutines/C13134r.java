package kotlinx.coroutines;

import kotlin.coroutines.C12868a;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext.Element;
import kotlin.coroutines.CoroutineContext.Key;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C12932j;
import kotlinx.coroutines.ThreadContextElement.C13050a;

/* renamed from: kotlinx.coroutines.r */
public final class C13134r extends C12868a implements ThreadContextElement<String> {

    /* renamed from: e */
    private final long f33726e;

    /* renamed from: kotlinx.coroutines.r$a */
    public static final class C13135a implements Key<C13134r> {
        private C13135a() {
        }

        public /* synthetic */ C13135a(C12928f fVar) {
            this();
        }
    }

    static {
        new C13135a(null);
    }

    /* renamed from: a */
    public void restoreThreadContext(CoroutineContext coroutineContext, String str) {
        C12932j.m33818b(coroutineContext, "context");
        C12932j.m33818b(str, "oldState");
        Thread currentThread = Thread.currentThread();
        C12932j.m33815a((Object) currentThread, "Thread.currentThread()");
        currentThread.setName(str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C13134r) {
                if (this.f33726e == ((C13134r) obj).f33726e) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public <R> R fold(R r, Function2<? super R, ? super Element, ? extends R> function2) {
        C12932j.m33818b(function2, "operation");
        return C13050a.m34066a(this, r, function2);
    }

    public <E extends Element> E get(Key<E> key) {
        C12932j.m33818b(key, "key");
        return C13050a.m34067a((ThreadContextElement<S>) this, key);
    }

    public int hashCode() {
        long j = this.f33726e;
        return (int) (j ^ (j >>> 32));
    }

    public CoroutineContext minusKey(Key<?> key) {
        C12932j.m33818b(key, "key");
        return C13050a.m34069b(this, key);
    }

    public CoroutineContext plus(CoroutineContext coroutineContext) {
        C12932j.m33818b(coroutineContext, "context");
        return C13050a.m34068a((ThreadContextElement<S>) this, coroutineContext);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CoroutineId(");
        sb.append(this.f33726e);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r9 != null) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String updateThreadContext(kotlin.coroutines.CoroutineContext r9) {
        /*
            r8 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.C12932j.m33818b(r9, r0)
            kotlinx.coroutines.s$a r0 = kotlinx.coroutines.C13141s.f33744f
            kotlin.coroutines.CoroutineContext$Element r9 = r9.get(r0)
            kotlinx.coroutines.s r9 = (kotlinx.coroutines.C13141s) r9
            if (r9 == 0) goto L_0x0016
            java.lang.String r9 = r9.mo37663a()
            if (r9 == 0) goto L_0x0016
            goto L_0x0018
        L_0x0016:
            java.lang.String r9 = "coroutine"
        L_0x0018:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r1 = "currentThread"
            kotlin.jvm.internal.C12932j.m33815a(r0, r1)
            java.lang.String r1 = r0.getName()
            java.lang.String r2 = "oldName"
            kotlin.jvm.internal.C12932j.m33815a(r1, r2)
            r4 = 0
            r5 = 0
            r6 = 6
            r7 = 0
            java.lang.String r3 = " @"
            r2 = r1
            int r2 = kotlin.text.C13029r.m34024b(r2, r3, r4, r5, r6, r7)
            if (r2 >= 0) goto L_0x003b
            int r2 = r1.length()
        L_0x003b:
            int r3 = r9.length()
            int r3 = r3 + r2
            int r3 = r3 + 10
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            r3 = 0
            java.lang.String r2 = r1.substring(r3, r2)
            java.lang.String r3 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            kotlin.jvm.internal.C12932j.m33815a(r2, r3)
            r4.append(r2)
            java.lang.String r2 = " @"
            r4.append(r2)
            r4.append(r9)
            r9 = 35
            r4.append(r9)
            long r2 = r8.f33726e
            r4.append(r2)
            java.lang.String r9 = r4.toString()
            java.lang.String r2 = "StringBuilder(capacity).…builderAction).toString()"
            kotlin.jvm.internal.C12932j.m33815a(r9, r2)
            r0.setName(r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C13134r.updateThreadContext(kotlin.coroutines.CoroutineContext):java.lang.String");
    }
}
