package p389io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;
import p389io.reactivex.FlowableSubscriber;
import p389io.reactivex.p393i.p401d.C12456g;

/* renamed from: io.reactivex.internal.operators.flowable.t */
final class C12526t<T, U> extends AtomicInteger implements FlowableSubscriber<Object>, Subscription {
    private static final long serialVersionUID = 2827772011130406689L;

    /* renamed from: e */
    final Publisher<T> f32520e;

    /* renamed from: f */
    final AtomicReference<Subscription> f32521f = new AtomicReference<>();

    /* renamed from: g */
    final AtomicLong f32522g = new AtomicLong();

    /* renamed from: h */
    C12527u<T, U> f32523h;

    C12526t(Publisher<T> publisher) {
        this.f32520e = publisher;
    }

    public void cancel() {
        C12456g.m32967a(this.f32521f);
    }

    public void onComplete() {
        this.f32523h.cancel();
        this.f32523h.f32524m.onComplete();
    }

    public void onError(Throwable th) {
        this.f32523h.cancel();
        this.f32523h.f32524m.onError(th);
    }

    public void onNext(Object obj) {
        if (getAndIncrement() == 0) {
            while (this.f32521f.get() != C12456g.CANCELLED) {
                this.f32520e.subscribe(this.f32523h);
                if (decrementAndGet() == 0) {
                }
            }
        }
    }

    public void onSubscribe(Subscription subscription) {
        C12456g.m32968a(this.f32521f, this.f32522g, subscription);
    }

    public void request(long j) {
        C12456g.m32966a(this.f32521f, this.f32522g, j);
    }
}
