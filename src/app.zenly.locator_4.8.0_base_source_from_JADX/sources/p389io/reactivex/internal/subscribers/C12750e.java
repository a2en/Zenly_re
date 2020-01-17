package p389io.reactivex.internal.subscribers;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import p389io.reactivex.FlowableSubscriber;
import p389io.reactivex.internal.util.C12752b;
import p389io.reactivex.internal.util.C12759h;
import p389io.reactivex.p393i.p401d.C12456g;

/* renamed from: io.reactivex.internal.subscribers.e */
public class C12750e<T> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {
    private static final long serialVersionUID = -4945028590049415624L;

    /* renamed from: e */
    final Subscriber<? super T> f33253e;

    /* renamed from: f */
    final C12752b f33254f = new C12752b();

    /* renamed from: g */
    final AtomicLong f33255g = new AtomicLong();

    /* renamed from: h */
    final AtomicReference<Subscription> f33256h = new AtomicReference<>();

    /* renamed from: i */
    final AtomicBoolean f33257i = new AtomicBoolean();

    /* renamed from: j */
    volatile boolean f33258j;

    public C12750e(Subscriber<? super T> subscriber) {
        this.f33253e = subscriber;
    }

    public void cancel() {
        if (!this.f33258j) {
            C12456g.m32967a(this.f33256h);
        }
    }

    public void onComplete() {
        this.f33258j = true;
        C12759h.m33360a(this.f33253e, (AtomicInteger) this, this.f33254f);
    }

    public void onError(Throwable th) {
        this.f33258j = true;
        C12759h.m33359a(this.f33253e, th, (AtomicInteger) this, this.f33254f);
    }

    public void onNext(T t) {
        C12759h.m33358a(this.f33253e, t, (AtomicInteger) this, this.f33254f);
    }

    public void onSubscribe(Subscription subscription) {
        if (this.f33257i.compareAndSet(false, true)) {
            this.f33253e.onSubscribe(this);
            C12456g.m32968a(this.f33256h, this.f33255g, subscription);
            return;
        }
        subscription.cancel();
        cancel();
        onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
    }

    public void request(long j) {
        if (j <= 0) {
            cancel();
            StringBuilder sb = new StringBuilder();
            sb.append("§3.9 violated: positive request amount required but it was ");
            sb.append(j);
            onError(new IllegalArgumentException(sb.toString()));
            return;
        }
        C12456g.m32966a(this.f33256h, this.f33255g, j);
    }
}
