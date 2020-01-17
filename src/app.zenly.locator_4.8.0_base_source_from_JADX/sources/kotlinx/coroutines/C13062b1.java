package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C12932j;

/* renamed from: kotlinx.coroutines.b1 */
public final class C13062b1 {
    /* renamed from: a */
    public static final void m34084a(CoroutineContext coroutineContext) {
        C12932j.m33818b(coroutineContext, "$this$checkCompletion");
        Job job = (Job) coroutineContext.get(Job.f33627d);
        if (job != null && !job.isActive()) {
            throw job.getCancellationException();
        }
    }
}
