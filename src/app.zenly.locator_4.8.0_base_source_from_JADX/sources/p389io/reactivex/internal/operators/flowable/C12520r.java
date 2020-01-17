package p389io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import p389io.reactivex.C12272c;
import p389io.reactivex.FlowableSubscriber;
import p389io.reactivex.internal.util.C12753c;
import p389io.reactivex.p393i.p401d.C12456g;

/* renamed from: io.reactivex.internal.operators.flowable.r */
public final class C12520r<T> extends C12480a<T, T> {

    /* renamed from: io.reactivex.internal.operators.flowable.r$a */
    static final class C12521a<T> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {
        private static final long serialVersionUID = 163080509307634843L;

        /* renamed from: e */
        final Subscriber<? super T> f32506e;

        /* renamed from: f */
        Subscription f32507f;

        /* renamed from: g */
        volatile boolean f32508g;

        /* renamed from: h */
        Throwable f32509h;

        /* renamed from: i */
        volatile boolean f32510i;

        /* renamed from: j */
        final AtomicLong f32511j = new AtomicLong();

        /* renamed from: k */
        final AtomicReference<T> f32512k = new AtomicReference<>();

        C12521a(Subscriber<? super T> subscriber) {
            this.f32506e = subscriber;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo36719a() {
            boolean z;
            if (getAndIncrement() == 0) {
                Subscriber<? super T> subscriber = this.f32506e;
                AtomicLong atomicLong = this.f32511j;
                AtomicReference<T> atomicReference = this.f32512k;
                int i = 1;
                do {
                    long j = 0;
                    while (true) {
                        z = false;
                        if (j == atomicLong.get()) {
                            break;
                        }
                        boolean z2 = this.f32508g;
                        Object andSet = atomicReference.getAndSet(null);
                        boolean z3 = andSet == null;
                        if (!mo36720a(z2, z3, subscriber, atomicReference)) {
                            if (z3) {
                                break;
                            }
                            subscriber.onNext(andSet);
                            j++;
                        } else {
                            return;
                        }
                    }
                    if (j == atomicLong.get()) {
                        boolean z4 = this.f32508g;
                        if (atomicReference.get() == null) {
                            z = true;
                        }
                        if (mo36720a(z4, z, subscriber, atomicReference)) {
                            return;
                        }
                    }
                    if (j != 0) {
                        C12753c.m33347b(atomicLong, j);
                    }
                    i = addAndGet(-i);
                } while (i != 0);
            }
        }

        public void cancel() {
            if (!this.f32510i) {
                this.f32510i = true;
                this.f32507f.cancel();
                if (getAndIncrement() == 0) {
                    this.f32512k.lazySet(null);
                }
            }
        }

        public void onComplete() {
            this.f32508g = true;
            mo36719a();
        }

        public void onError(Throwable th) {
            this.f32509h = th;
            this.f32508g = true;
            mo36719a();
        }

        public void onNext(T t) {
            this.f32512k.lazySet(t);
            mo36719a();
        }

        public void onSubscribe(Subscription subscription) {
            if (C12456g.m32970a(this.f32507f, subscription)) {
                this.f32507f = subscription;
                this.f32506e.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        public void request(long j) {
            if (C12456g.m32971b(j)) {
                C12753c.m33346a(this.f32511j, j);
                mo36719a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo36720a(boolean z, boolean z2, Subscriber<?> subscriber, AtomicReference<T> atomicReference) {
            if (this.f32510i) {
                atomicReference.lazySet(null);
                return true;
            }
            if (z) {
                Throwable th = this.f32509h;
                if (th != null) {
                    atomicReference.lazySet(null);
                    subscriber.onError(th);
                    return true;
                } else if (z2) {
                    subscriber.onComplete();
                    return true;
                }
            }
            return false;
        }
    }

    public C12520r(C12272c<T> cVar) {
        super(cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36365a(Subscriber<? super T> subscriber) {
        this.f32355f.mo36364a((FlowableSubscriber<? super T>) new C12521a<Object>(subscriber));
    }
}
