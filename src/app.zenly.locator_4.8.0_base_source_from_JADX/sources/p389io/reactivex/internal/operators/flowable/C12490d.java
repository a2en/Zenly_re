package p389io.reactivex.internal.operators.flowable;

import java.util.NoSuchElementException;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import p389io.reactivex.C12272c;
import p389io.reactivex.FlowableSubscriber;
import p389io.reactivex.p393i.p401d.C12452c;
import p389io.reactivex.p393i.p401d.C12456g;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.internal.operators.flowable.d */
public final class C12490d<T> extends C12480a<T, T> {

    /* renamed from: g */
    final long f32398g;

    /* renamed from: h */
    final T f32399h;

    /* renamed from: i */
    final boolean f32400i;

    /* renamed from: io.reactivex.internal.operators.flowable.d$a */
    static final class C12491a<T> extends C12452c<T> implements FlowableSubscriber<T> {
        private static final long serialVersionUID = 4066607327284737757L;

        /* renamed from: g */
        final long f32401g;

        /* renamed from: h */
        final T f32402h;

        /* renamed from: i */
        final boolean f32403i;

        /* renamed from: j */
        Subscription f32404j;

        /* renamed from: k */
        long f32405k;

        /* renamed from: l */
        boolean f32406l;

        C12491a(Subscriber<? super T> subscriber, long j, T t, boolean z) {
            super(subscriber);
            this.f32401g = j;
            this.f32402h = t;
            this.f32403i = z;
        }

        public void cancel() {
            super.cancel();
            this.f32404j.cancel();
        }

        public void onComplete() {
            if (!this.f32406l) {
                this.f32406l = true;
                T t = this.f32402h;
                if (t != null) {
                    mo36644a(t);
                } else if (this.f32403i) {
                    this.f32297e.onError(new NoSuchElementException());
                } else {
                    this.f32297e.onComplete();
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f32406l) {
                C12768a.m33415b(th);
                return;
            }
            this.f32406l = true;
            this.f32297e.onError(th);
        }

        public void onNext(T t) {
            if (!this.f32406l) {
                long j = this.f32405k;
                if (j == this.f32401g) {
                    this.f32406l = true;
                    this.f32404j.cancel();
                    mo36644a(t);
                    return;
                }
                this.f32405k = j + 1;
            }
        }

        public void onSubscribe(Subscription subscription) {
            if (C12456g.m32970a(this.f32404j, subscription)) {
                this.f32404j = subscription;
                this.f32297e.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public C12490d(C12272c<T> cVar, long j, T t, boolean z) {
        super(cVar);
        this.f32398g = j;
        this.f32399h = t;
        this.f32400i = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36365a(Subscriber<? super T> subscriber) {
        C12272c<T> cVar = this.f32355f;
        C12491a aVar = new C12491a(subscriber, this.f32398g, this.f32399h, this.f32400i);
        cVar.mo36364a((FlowableSubscriber<? super T>) aVar);
    }
}
