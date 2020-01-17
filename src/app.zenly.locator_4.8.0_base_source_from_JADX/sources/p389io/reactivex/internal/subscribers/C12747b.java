package p389io.reactivex.internal.subscribers;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import p389io.reactivex.FlowableSubscriber;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.internal.fuseable.QueueSubscription;
import p389io.reactivex.p393i.p401d.C12456g;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.internal.subscribers.b */
public abstract class C12747b<T, R> implements FlowableSubscriber<T>, QueueSubscription<R> {

    /* renamed from: e */
    protected final Subscriber<? super R> f33244e;

    /* renamed from: f */
    protected Subscription f33245f;

    /* renamed from: g */
    protected QueueSubscription<T> f33246g;

    /* renamed from: h */
    protected boolean f33247h;

    /* renamed from: i */
    protected int f33248i;

    public C12747b(Subscriber<? super R> subscriber) {
        this.f33244e = subscriber;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36911a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo36912a(Throwable th) {
        C12285a.m32748b(th);
        this.f33245f.cancel();
        onError(th);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo36913b() {
        return true;
    }

    public void cancel() {
        this.f33245f.cancel();
    }

    public void clear() {
        this.f33246g.clear();
    }

    public boolean isEmpty() {
        return this.f33246g.isEmpty();
    }

    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public void onComplete() {
        if (!this.f33247h) {
            this.f33247h = true;
            this.f33244e.onComplete();
        }
    }

    public void onError(Throwable th) {
        if (this.f33247h) {
            C12768a.m33415b(th);
            return;
        }
        this.f33247h = true;
        this.f33244e.onError(th);
    }

    public final void onSubscribe(Subscription subscription) {
        if (C12456g.m32970a(this.f33245f, subscription)) {
            this.f33245f = subscription;
            if (subscription instanceof QueueSubscription) {
                this.f33246g = (QueueSubscription) subscription;
            }
            if (mo36913b()) {
                this.f33244e.onSubscribe(this);
                mo36911a();
            }
        }
    }

    public void request(long j) {
        this.f33245f.request(j);
    }

    public final boolean offer(R r, R r2) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo36910a(int i) {
        QueueSubscription<T> queueSubscription = this.f33246g;
        if (queueSubscription == null || (i & 4) != 0) {
            return 0;
        }
        int requestFusion = queueSubscription.requestFusion(i);
        if (requestFusion != 0) {
            this.f33248i = requestFusion;
        }
        return requestFusion;
    }
}
