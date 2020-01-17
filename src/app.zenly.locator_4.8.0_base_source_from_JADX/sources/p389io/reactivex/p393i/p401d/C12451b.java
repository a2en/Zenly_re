package p389io.reactivex.p393i.p401d;

import java.util.concurrent.atomic.AtomicLong;
import p389io.reactivex.internal.fuseable.QueueSubscription;

/* renamed from: io.reactivex.i.d.b */
public abstract class C12451b<T> extends AtomicLong implements QueueSubscription<T> {
    private static final long serialVersionUID = -6671519529404341862L;

    public final boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public final boolean offer(T t, T t2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
