package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.C12956q;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12932j;

/* renamed from: kotlinx.coroutines.l0 */
final class C13123l0 extends C13127n0<Job> {

    /* renamed from: j */
    private static final AtomicIntegerFieldUpdater f33719j = AtomicIntegerFieldUpdater.newUpdater(C13123l0.class, "_invoked");
    private volatile int _invoked = 0;

    /* renamed from: i */
    private final Function1<Throwable, C12956q> f33720i;

    public C13123l0(Job job, Function1<? super Throwable, C12956q> function1) {
        C12932j.m33818b(job, "job");
        C12932j.m33818b(function1, "handler");
        super(job);
        this.f33720i = function1;
    }

    /* renamed from: a */
    public void mo37574a(Throwable th) {
        if (f33719j.compareAndSet(this, 0, 1)) {
            this.f33720i.invoke(th);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo37574a((Throwable) obj);
        return C12956q.f33541a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InvokeOnCancelling[");
        sb.append(C13151v.m34329a((Object) this));
        sb.append('@');
        sb.append(C13151v.m34331b(this));
        sb.append(']');
        return sb.toString();
    }
}
