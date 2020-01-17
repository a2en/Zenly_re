package p389io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import p389io.reactivex.C12272c;
import p389io.reactivex.FlowableSubscriber;
import p389io.reactivex.exceptions.MissingBackpressureException;
import p389io.reactivex.internal.util.C12753c;
import p389io.reactivex.p393i.p401d.C12456g;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.internal.operators.flowable.q */
public final class C12518q<T> extends C12480a<T, T> {

    /* renamed from: io.reactivex.internal.operators.flowable.q$a */
    static final class C12519a<T> extends AtomicLong implements FlowableSubscriber<T>, Subscription {
        private static final long serialVersionUID = -3176480756392482682L;

        /* renamed from: e */
        final Subscriber<? super T> f32503e;

        /* renamed from: f */
        Subscription f32504f;

        /* renamed from: g */
        boolean f32505g;

        C12519a(Subscriber<? super T> subscriber) {
            this.f32503e = subscriber;
        }

        public void cancel() {
            this.f32504f.cancel();
        }

        public void onComplete() {
            if (!this.f32505g) {
                this.f32505g = true;
                this.f32503e.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f32505g) {
                C12768a.m33415b(th);
                return;
            }
            this.f32505g = true;
            this.f32503e.onError(th);
        }

        public void onNext(T t) {
            if (!this.f32505g) {
                if (get() != 0) {
                    this.f32503e.onNext(t);
                    C12753c.m33347b(this, 1);
                } else {
                    onError(new MissingBackpressureException("could not emit value due to lack of requests"));
                }
            }
        }

        public void onSubscribe(Subscription subscription) {
            if (C12456g.m32970a(this.f32504f, subscription)) {
                this.f32504f = subscription;
                this.f32503e.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        public void request(long j) {
            if (C12456g.m32971b(j)) {
                C12753c.m33346a((AtomicLong) this, j);
            }
        }
    }

    public C12518q(C12272c<T> cVar) {
        super(cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36365a(Subscriber<? super T> subscriber) {
        this.f32355f.mo36364a((FlowableSubscriber<? super T>) new C12519a<Object>(subscriber));
    }
}
