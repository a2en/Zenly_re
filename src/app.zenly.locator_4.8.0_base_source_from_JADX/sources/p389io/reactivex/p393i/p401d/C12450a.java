package p389io.reactivex.p393i.p401d;

import java.util.concurrent.atomic.AtomicInteger;
import p389io.reactivex.internal.fuseable.QueueSubscription;

/* renamed from: io.reactivex.i.d.a */
public abstract class C12450a<T> extends AtomicInteger implements QueueSubscription<T> {
    private static final long serialVersionUID = -6671519529404341862L;

    public final boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public final boolean offer(T t, T t2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
