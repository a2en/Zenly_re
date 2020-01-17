package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.C12932j;
import kotlinx.coroutines.C13071e0.C13074c;

/* renamed from: kotlinx.coroutines.f0 */
public abstract class C13077f0 extends C13069d0 {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo37567a(long j, C13074c cVar) {
        C12932j.m33818b(cVar, "delayedTask");
        if (C13149u.m34325a()) {
            if (!(this != C13153w.f33758k)) {
                throw new AssertionError();
            }
        }
        C13153w.f33758k.mo37552b(j, cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract Thread mo37502f();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo37568g() {
        Thread f = mo37502f();
        if (Thread.currentThread() != f) {
            TimeSource a = C13053a1.m34076a();
            if (a != null) {
                a.unpark(f);
            } else {
                LockSupport.unpark(f);
            }
        }
    }
}
