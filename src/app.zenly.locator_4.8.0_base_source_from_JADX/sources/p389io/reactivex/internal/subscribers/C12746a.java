package p389io.reactivex.internal.subscribers;

import org.reactivestreams.Subscription;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.internal.fuseable.ConditionalSubscriber;
import p389io.reactivex.internal.fuseable.QueueSubscription;
import p389io.reactivex.p393i.p401d.C12456g;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.internal.subscribers.a */
public abstract class C12746a<T, R> implements ConditionalSubscriber<T>, QueueSubscription<R> {

    /* renamed from: e */
    protected final ConditionalSubscriber<? super R> f33239e;

    /* renamed from: f */
    protected Subscription f33240f;

    /* renamed from: g */
    protected QueueSubscription<T> f33241g;

    /* renamed from: h */
    protected boolean f33242h;

    /* renamed from: i */
    protected int f33243i;

    public C12746a(ConditionalSubscriber<? super R> conditionalSubscriber) {
        this.f33239e = conditionalSubscriber;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36907a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo36908a(Throwable th) {
        C12285a.m32748b(th);
        this.f33240f.cancel();
        onError(th);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo36909b() {
        return true;
    }

    public void cancel() {
        this.f33240f.cancel();
    }

    public void clear() {
        this.f33241g.clear();
    }

    public boolean isEmpty() {
        return this.f33241g.isEmpty();
    }

    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public void onComplete() {
        if (!this.f33242h) {
            this.f33242h = true;
            this.f33239e.onComplete();
        }
    }

    public void onError(Throwable th) {
        if (this.f33242h) {
            C12768a.m33415b(th);
            return;
        }
        this.f33242h = true;
        this.f33239e.onError(th);
    }

    public final void onSubscribe(Subscription subscription) {
        if (C12456g.m32970a(this.f33240f, subscription)) {
            this.f33240f = subscription;
            if (subscription instanceof QueueSubscription) {
                this.f33241g = (QueueSubscription) subscription;
            }
            if (mo36909b()) {
                this.f33239e.onSubscribe(this);
                mo36907a();
            }
        }
    }

    public void request(long j) {
        this.f33240f.request(j);
    }

    public final boolean offer(R r, R r2) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo36906a(int i) {
        QueueSubscription<T> queueSubscription = this.f33241g;
        if (queueSubscription == null || (i & 4) != 0) {
            return 0;
        }
        int requestFusion = queueSubscription.requestFusion(i);
        if (requestFusion != 0) {
            this.f33243i = requestFusion;
        }
        return requestFusion;
    }
}
