package p389io.reactivex.internal.observers;

/* renamed from: io.reactivex.internal.observers.InnerQueuedObserverSupport */
public interface InnerQueuedObserverSupport<T> {
    void drain();

    void innerComplete(C12473l<T> lVar);

    void innerError(C12473l<T> lVar, Throwable th);

    void innerNext(C12473l<T> lVar, T t);
}
