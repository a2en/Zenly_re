package p389io.reactivex.p393i.p401d;

import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Subscriber;
import p389io.reactivex.internal.fuseable.QueueSubscription;

/* renamed from: io.reactivex.i.d.e */
public final class C12454e<T> extends AtomicInteger implements QueueSubscription<T> {
    private static final long serialVersionUID = -3830916580126663321L;

    /* renamed from: e */
    final T f32301e;

    /* renamed from: f */
    final Subscriber<? super T> f32302f;

    public C12454e(Subscriber<? super T> subscriber, T t) {
        this.f32302f = subscriber;
        this.f32301e = t;
    }

    public void cancel() {
        lazySet(2);
    }

    public void clear() {
        lazySet(1);
    }

    public boolean isEmpty() {
        return get() != 0;
    }

    public boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public T poll() {
        if (get() != 0) {
            return null;
        }
        lazySet(1);
        return this.f32301e;
    }

    public void request(long j) {
        if (C12456g.m32971b(j) && compareAndSet(0, 1)) {
            Subscriber<? super T> subscriber = this.f32302f;
            subscriber.onNext(this.f32301e);
            if (get() != 2) {
                subscriber.onComplete();
            }
        }
    }

    public int requestFusion(int i) {
        return i & 1;
    }

    public boolean offer(T t, T t2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
