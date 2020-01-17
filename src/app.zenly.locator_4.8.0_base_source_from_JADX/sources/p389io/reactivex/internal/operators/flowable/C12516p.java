package p389io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import p389io.reactivex.C12272c;
import p389io.reactivex.FlowableSubscriber;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.internal.util.C12753c;
import p389io.reactivex.p393i.p401d.C12456g;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.internal.operators.flowable.p */
public final class C12516p<T> extends C12480a<T, T> implements Consumer<T> {

    /* renamed from: g */
    final Consumer<? super T> f32498g = this;

    /* renamed from: io.reactivex.internal.operators.flowable.p$a */
    static final class C12517a<T> extends AtomicLong implements FlowableSubscriber<T>, Subscription {
        private static final long serialVersionUID = -6246093802440953054L;

        /* renamed from: e */
        final Subscriber<? super T> f32499e;

        /* renamed from: f */
        final Consumer<? super T> f32500f;

        /* renamed from: g */
        Subscription f32501g;

        /* renamed from: h */
        boolean f32502h;

        C12517a(Subscriber<? super T> subscriber, Consumer<? super T> consumer) {
            this.f32499e = subscriber;
            this.f32500f = consumer;
        }

        public void cancel() {
            this.f32501g.cancel();
        }

        public void onComplete() {
            if (!this.f32502h) {
                this.f32502h = true;
                this.f32499e.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f32502h) {
                C12768a.m33415b(th);
                return;
            }
            this.f32502h = true;
            this.f32499e.onError(th);
        }

        public void onNext(T t) {
            if (!this.f32502h) {
                if (get() != 0) {
                    this.f32499e.onNext(t);
                    C12753c.m33347b(this, 1);
                } else {
                    try {
                        this.f32500f.accept(t);
                    } catch (Throwable th) {
                        C12285a.m32748b(th);
                        cancel();
                        onError(th);
                    }
                }
            }
        }

        public void onSubscribe(Subscription subscription) {
            if (C12456g.m32970a(this.f32501g, subscription)) {
                this.f32501g = subscription;
                this.f32499e.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        public void request(long j) {
            if (C12456g.m32971b(j)) {
                C12753c.m33346a((AtomicLong) this, j);
            }
        }
    }

    public C12516p(C12272c<T> cVar) {
        super(cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36365a(Subscriber<? super T> subscriber) {
        this.f32355f.mo36364a((FlowableSubscriber<? super T>) new C12517a<Object>(subscriber, this.f32498g));
    }

    public void accept(T t) {
    }
}
