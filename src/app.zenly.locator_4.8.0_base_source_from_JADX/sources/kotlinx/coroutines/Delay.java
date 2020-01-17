package kotlinx.coroutines;

import kotlin.C12956q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.C12889f;
import kotlin.jvm.internal.C12932j;

public interface Delay {

    /* renamed from: kotlinx.coroutines.Delay$a */
    public static final class C13047a {
        /* renamed from: a */
        public static Object m34056a(Delay delay, long j, Continuation<? super C12956q> continuation) {
            if (j <= 0) {
                return C12956q.f33541a;
            }
            C13070e eVar = new C13070e(C12877c.m33719a(continuation), 1);
            delay.scheduleResumeAfterDelay(j, eVar);
            Object c = eVar.mo37546c();
            if (c == C12882d.m33726a()) {
                C12889f.m33745c(continuation);
            }
            return c;
        }

        /* renamed from: a */
        public static DisposableHandle m34057a(Delay delay, long j, Runnable runnable) {
            C12932j.m33818b(runnable, "block");
            return C13155x.m34341a().invokeOnTimeout(j, runnable);
        }
    }

    Object delay(long j, Continuation<? super C12956q> continuation);

    DisposableHandle invokeOnTimeout(long j, Runnable runnable);

    void scheduleResumeAfterDelay(long j, CancellableContinuation<? super C12956q> cancellableContinuation);
}
