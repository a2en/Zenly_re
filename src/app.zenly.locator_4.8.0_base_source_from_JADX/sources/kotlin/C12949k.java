package kotlin;

import kotlin.C12918j.C12920b;
import kotlin.jvm.internal.C12932j;

/* renamed from: kotlin.k */
public final class C12949k {
    /* renamed from: a */
    public static final Object m33848a(Throwable th) {
        C12932j.m33818b(th, "exception");
        return new C12920b(th);
    }

    /* renamed from: a */
    public static final void m33849a(Object obj) {
        if (obj instanceof C12920b) {
            throw ((C12920b) obj).f33500e;
        }
    }
}
