package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C12932j;

/* renamed from: kotlinx.coroutines.p0 */
final /* synthetic */ class C13131p0 {
    /* renamed from: a */
    public static /* synthetic */ void m34260a(CoroutineContext coroutineContext, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        C13129o0.m34256a(coroutineContext, cancellationException);
    }

    /* renamed from: a */
    public static final void m34259a(CoroutineContext coroutineContext, CancellationException cancellationException) {
        C12932j.m33818b(coroutineContext, "$this$cancel");
        Job job = (Job) coroutineContext.get(Job.f33627d);
        if (job != null) {
            job.cancel(cancellationException);
        }
    }
}
