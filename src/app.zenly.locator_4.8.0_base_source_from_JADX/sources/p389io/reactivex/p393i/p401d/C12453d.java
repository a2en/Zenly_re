package p389io.reactivex.p393i.p401d;

import org.reactivestreams.Subscriber;
import p389io.reactivex.internal.fuseable.QueueSubscription;

/* renamed from: io.reactivex.i.d.d */
public enum C12453d implements QueueSubscription<Object> {
    INSTANCE;

    /* renamed from: a */
    public static void m32958a(Throwable th, Subscriber<?> subscriber) {
        subscriber.onSubscribe(INSTANCE);
        subscriber.onError(th);
    }

    public void cancel() {
    }

    public void clear() {
    }

    public boolean isEmpty() {
        return true;
    }

    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public Object poll() {
        return null;
    }

    public void request(long j) {
        C12456g.m32971b(j);
    }

    public int requestFusion(int i) {
        return i & 2;
    }

    public String toString() {
        return "EmptySubscription";
    }

    public boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    /* renamed from: a */
    public static void m32959a(Subscriber<?> subscriber) {
        subscriber.onSubscribe(INSTANCE);
        subscriber.onComplete();
    }
}
