package kotlin.coroutines.experimental;

public interface Continuation<T> {
    CoroutineContext getContext();

    void resume(T t);

    void resumeWithException(Throwable th);
}
