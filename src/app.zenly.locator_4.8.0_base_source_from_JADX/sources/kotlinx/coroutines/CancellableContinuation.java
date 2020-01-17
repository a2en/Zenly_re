package kotlinx.coroutines;

import kotlin.C12956q;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

public interface CancellableContinuation<T> extends Continuation<T> {
    boolean cancel(Throwable th);

    void completeResume(Object obj);

    /* synthetic */ void initCancellability();

    void invokeOnCancellation(Function1<? super Throwable, C12956q> function1);

    boolean isActive();

    boolean isCancelled();

    boolean isCompleted();

    void resume(T t, Function1<? super Throwable, C12956q> function1);

    void resumeUndispatched(C13128o oVar, T t);

    void resumeUndispatchedWithException(C13128o oVar, Throwable th);

    Object tryResume(T t, Object obj);

    Object tryResumeWithException(Throwable th);
}
