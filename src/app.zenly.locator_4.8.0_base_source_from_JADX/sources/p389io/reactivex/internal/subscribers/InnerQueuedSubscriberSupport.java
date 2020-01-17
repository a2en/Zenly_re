package p389io.reactivex.internal.subscribers;

/* renamed from: io.reactivex.internal.subscribers.InnerQueuedSubscriberSupport */
public interface InnerQueuedSubscriberSupport<T> {
    void drain();

    void innerComplete(C12748c<T> cVar);

    void innerError(C12748c<T> cVar, Throwable th);

    void innerNext(C12748c<T> cVar, T t);
}
