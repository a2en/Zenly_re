package p389io.reactivex.internal.observers;

import java.util.concurrent.atomic.AtomicInteger;
import p389io.reactivex.internal.fuseable.QueueDisposable;

/* renamed from: io.reactivex.internal.observers.b */
public abstract class C12463b<T> extends AtomicInteger implements QueueDisposable<T> {
    private static final long serialVersionUID = -1001730202384742097L;

    public final boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called");
    }

    public final boolean offer(T t, T t2) {
        throw new UnsupportedOperationException("Should not be called");
    }
}
