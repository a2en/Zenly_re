package p389io.reactivex.internal.operators.flowable;

import java.util.NoSuchElementException;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import p389io.reactivex.C12272c;
import p389io.reactivex.FlowableSubscriber;
import p389io.reactivex.p393i.p401d.C12452c;
import p389io.reactivex.p393i.p401d.C12456g;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.internal.operators.flowable.x */
public final class C12532x<T> extends C12480a<T, T> {

    /* renamed from: g */
    final T f32531g;

    /* renamed from: h */
    final boolean f32532h;

    /* renamed from: io.reactivex.internal.operators.flowable.x$a */
    static final class C12533a<T> extends C12452c<T> implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -5526049321428043809L;

        /* renamed from: g */
        final T f32533g;

        /* renamed from: h */
        final boolean f32534h;

        /* renamed from: i */
        Subscription f32535i;

        /* renamed from: j */
        boolean f32536j;

        C12533a(Subscriber<? super T> subscriber, T t, boolean z) {
            super(subscriber);
            this.f32533g = t;
            this.f32534h = z;
        }

        public void cancel() {
            super.cancel();
            this.f32535i.cancel();
        }

        public void onComplete() {
            if (!this.f32536j) {
                this.f32536j = true;
                T t = this.f32298f;
                this.f32298f = null;
                if (t == null) {
                    t = this.f32533g;
                }
                if (t != null) {
                    mo36644a(t);
                } else if (this.f32534h) {
                    this.f32297e.onError(new NoSuchElementException());
                } else {
                    this.f32297e.onComplete();
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f32536j) {
                C12768a.m33415b(th);
                return;
            }
            this.f32536j = true;
            this.f32297e.onError(th);
        }

        public void onNext(T t) {
            if (!this.f32536j) {
                if (this.f32298f != null) {
                    this.f32536j = true;
                    this.f32535i.cancel();
                    this.f32297e.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                    return;
                }
                this.f32298f = t;
            }
        }

        public void onSubscribe(Subscription subscription) {
            if (C12456g.m32970a(this.f32535i, subscription)) {
                this.f32535i = subscription;
                this.f32297e.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public C12532x(C12272c<T> cVar, T t, boolean z) {
        super(cVar);
        this.f32531g = t;
        this.f32532h = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36365a(Subscriber<? super T> subscriber) {
        this.f32355f.mo36364a((FlowableSubscriber<? super T>) new C12533a<Object>(subscriber, this.f32531g, this.f32532h));
    }
}
