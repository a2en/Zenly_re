package p389io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import p389io.reactivex.C12272c;
import p389io.reactivex.FlowableSubscriber;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.exceptions.MissingBackpressureException;
import p389io.reactivex.functions.Action;
import p389io.reactivex.internal.fuseable.SimplePlainQueue;
import p389io.reactivex.internal.util.C12753c;
import p389io.reactivex.p393i.p400c.C12448b;
import p389io.reactivex.p393i.p400c.C12449c;
import p389io.reactivex.p393i.p401d.C12450a;
import p389io.reactivex.p393i.p401d.C12456g;

/* renamed from: io.reactivex.internal.operators.flowable.o */
public final class C12514o<T> extends C12480a<T, T> {

    /* renamed from: g */
    final int f32484g;

    /* renamed from: h */
    final boolean f32485h;

    /* renamed from: i */
    final boolean f32486i;

    /* renamed from: j */
    final Action f32487j;

    /* renamed from: io.reactivex.internal.operators.flowable.o$a */
    static final class C12515a<T> extends C12450a<T> implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -2514538129242366402L;

        /* renamed from: e */
        final Subscriber<? super T> f32488e;

        /* renamed from: f */
        final SimplePlainQueue<T> f32489f;

        /* renamed from: g */
        final boolean f32490g;

        /* renamed from: h */
        final Action f32491h;

        /* renamed from: i */
        Subscription f32492i;

        /* renamed from: j */
        volatile boolean f32493j;

        /* renamed from: k */
        volatile boolean f32494k;

        /* renamed from: l */
        Throwable f32495l;

        /* renamed from: m */
        final AtomicLong f32496m = new AtomicLong();

        /* renamed from: n */
        boolean f32497n;

        C12515a(Subscriber<? super T> subscriber, int i, boolean z, boolean z2, Action action) {
            SimplePlainQueue<T> simplePlainQueue;
            this.f32488e = subscriber;
            this.f32491h = action;
            this.f32490g = z2;
            if (z) {
                simplePlainQueue = new C12449c<>(i);
            } else {
                simplePlainQueue = new C12448b<>(i);
            }
            this.f32489f = simplePlainQueue;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo36717a() {
            int i;
            if (getAndIncrement() == 0) {
                SimplePlainQueue<T> simplePlainQueue = this.f32489f;
                Subscriber<? super T> subscriber = this.f32488e;
                int i2 = 1;
                while (!mo36718a(this.f32494k, simplePlainQueue.isEmpty(), subscriber)) {
                    long j = this.f32496m.get();
                    long j2 = 0;
                    while (true) {
                        i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
                        if (i == 0) {
                            break;
                        }
                        boolean z = this.f32494k;
                        Object poll = simplePlainQueue.poll();
                        boolean z2 = poll == null;
                        if (!mo36718a(z, z2, subscriber)) {
                            if (z2) {
                                break;
                            }
                            subscriber.onNext(poll);
                            j2++;
                        } else {
                            return;
                        }
                    }
                    if (i != 0 || !mo36718a(this.f32494k, simplePlainQueue.isEmpty(), subscriber)) {
                        if (!(j2 == 0 || j == Long.MAX_VALUE)) {
                            this.f32496m.addAndGet(-j2);
                        }
                        i2 = addAndGet(-i2);
                        if (i2 == 0) {
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        public void cancel() {
            if (!this.f32493j) {
                this.f32493j = true;
                this.f32492i.cancel();
                if (getAndIncrement() == 0) {
                    this.f32489f.clear();
                }
            }
        }

        public void clear() {
            this.f32489f.clear();
        }

        public boolean isEmpty() {
            return this.f32489f.isEmpty();
        }

        public void onComplete() {
            this.f32494k = true;
            if (this.f32497n) {
                this.f32488e.onComplete();
            } else {
                mo36717a();
            }
        }

        public void onError(Throwable th) {
            this.f32495l = th;
            this.f32494k = true;
            if (this.f32497n) {
                this.f32488e.onError(th);
            } else {
                mo36717a();
            }
        }

        public void onNext(T t) {
            if (!this.f32489f.offer(t)) {
                this.f32492i.cancel();
                MissingBackpressureException missingBackpressureException = new MissingBackpressureException("Buffer is full");
                try {
                    this.f32491h.run();
                } catch (Throwable th) {
                    C12285a.m32748b(th);
                    missingBackpressureException.initCause(th);
                }
                onError(missingBackpressureException);
                return;
            }
            if (this.f32497n) {
                this.f32488e.onNext(null);
            } else {
                mo36717a();
            }
        }

        public void onSubscribe(Subscription subscription) {
            if (C12456g.m32970a(this.f32492i, subscription)) {
                this.f32492i = subscription;
                this.f32488e.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        public T poll() throws Exception {
            return this.f32489f.poll();
        }

        public void request(long j) {
            if (!this.f32497n && C12456g.m32971b(j)) {
                C12753c.m33346a(this.f32496m, j);
                mo36717a();
            }
        }

        public int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.f32497n = true;
            return 2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo36718a(boolean z, boolean z2, Subscriber<? super T> subscriber) {
            if (this.f32493j) {
                this.f32489f.clear();
                return true;
            }
            if (z) {
                if (!this.f32490g) {
                    Throwable th = this.f32495l;
                    if (th != null) {
                        this.f32489f.clear();
                        subscriber.onError(th);
                        return true;
                    } else if (z2) {
                        subscriber.onComplete();
                        return true;
                    }
                } else if (z2) {
                    Throwable th2 = this.f32495l;
                    if (th2 != null) {
                        subscriber.onError(th2);
                    } else {
                        subscriber.onComplete();
                    }
                    return true;
                }
            }
            return false;
        }
    }

    public C12514o(C12272c<T> cVar, int i, boolean z, boolean z2, Action action) {
        super(cVar);
        this.f32484g = i;
        this.f32485h = z;
        this.f32486i = z2;
        this.f32487j = action;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36365a(Subscriber<? super T> subscriber) {
        C12272c<T> cVar = this.f32355f;
        C12515a aVar = new C12515a(subscriber, this.f32484g, this.f32485h, this.f32486i, this.f32487j);
        cVar.mo36364a((FlowableSubscriber<? super T>) aVar);
    }
}
