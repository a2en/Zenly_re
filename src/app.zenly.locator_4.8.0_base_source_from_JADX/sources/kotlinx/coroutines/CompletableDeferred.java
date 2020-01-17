package kotlinx.coroutines;

public interface CompletableDeferred<T> extends Deferred<T> {
    boolean complete(T t);

    boolean completeExceptionally(Throwable th);
}
