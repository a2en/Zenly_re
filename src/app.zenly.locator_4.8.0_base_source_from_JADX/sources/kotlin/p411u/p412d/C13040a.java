package kotlin.p411u.p412d;

import kotlin.jvm.internal.C12932j;
import kotlin.p411u.C13036a;

/* renamed from: kotlin.u.d.a */
public class C13040a extends C13036a {
    /* renamed from: a */
    public void mo37419a(Throwable th, Throwable th2) {
        C12932j.m33818b(th, "cause");
        C12932j.m33818b(th2, "exception");
        th.addSuppressed(th2);
    }
}
