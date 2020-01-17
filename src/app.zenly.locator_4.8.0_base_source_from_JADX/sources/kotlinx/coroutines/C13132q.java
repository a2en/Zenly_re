package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C12932j;

/* renamed from: kotlinx.coroutines.q */
public final class C13132q {
    /* renamed from: a */
    public static final void m34262a(CoroutineContext coroutineContext, Throwable th) {
        C12932j.m33818b(coroutineContext, "context");
        C12932j.m33818b(th, "exception");
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) coroutineContext.get(CoroutineExceptionHandler.f33625c);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.handleException(coroutineContext, th);
            } else {
                C13130p.m34258a(coroutineContext, th);
            }
        } catch (Throwable th2) {
            C13130p.m34258a(coroutineContext, m34261a(th, th2));
        }
    }

    /* renamed from: a */
    public static final Throwable m34261a(Throwable th, Throwable th2) {
        C12932j.m33818b(th, "originalException");
        C12932j.m33818b(th2, "thrownException");
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        C12813b.m33495a(runtimeException, th);
        return runtimeException;
    }
}
