package p389io.reactivex.internal.operators.flowable;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import p389io.reactivex.C12272c;
import p389io.reactivex.FlowableSubscriber;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.functions.Function;
import p389io.reactivex.internal.fuseable.QueueSubscription;
import p389io.reactivex.internal.fuseable.SimpleQueue;
import p389io.reactivex.internal.util.C12752b;
import p389io.reactivex.internal.util.C12753c;
import p389io.reactivex.p393i.p394a.C12324b;
import p389io.reactivex.p393i.p400c.C12448b;
import p389io.reactivex.p393i.p401d.C12453d;
import p389io.reactivex.p393i.p401d.C12456g;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.internal.operators.flowable.a0 */
public final class C12481a0<T, R> extends C12272c<R> {

    /* renamed from: f */
    final Publisher<? extends T>[] f32356f;

    /* renamed from: g */
    final Iterable<? extends Publisher<? extends T>> f32357g;

    /* renamed from: h */
    final Function<? super Object[], ? extends R> f32358h;

    /* renamed from: i */
    final int f32359i;

    /* renamed from: j */
    final boolean f32360j;

    /* renamed from: io.reactivex.internal.operators.flowable.a0$a */
    static final class C12482a<T, R> extends AtomicInteger implements Subscription {
        private static final long serialVersionUID = -2434867452883857743L;

        /* renamed from: e */
        final Subscriber<? super R> f32361e;

        /* renamed from: f */
        final C12483b<T, R>[] f32362f;

        /* renamed from: g */
        final Function<? super Object[], ? extends R> f32363g;

        /* renamed from: h */
        final AtomicLong f32364h;

        /* renamed from: i */
        final C12752b f32365i;

        /* renamed from: j */
        final boolean f32366j;

        /* renamed from: k */
        volatile boolean f32367k;

        /* renamed from: l */
        final Object[] f32368l;

        C12482a(Subscriber<? super R> subscriber, Function<? super Object[], ? extends R> function, int i, int i2, boolean z) {
            this.f32361e = subscriber;
            this.f32363g = function;
            this.f32366j = z;
            C12483b<T, R>[] bVarArr = new C12483b[i];
            for (int i3 = 0; i3 < i; i3++) {
                bVarArr[i3] = new C12483b<>(this, i2);
            }
            this.f32368l = new Object[i];
            this.f32362f = bVarArr;
            this.f32364h = new AtomicLong();
            this.f32365i = new C12752b();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo36690a(Publisher<? extends T>[] publisherArr, int i) {
            C12483b<T, R>[] bVarArr = this.f32362f;
            int i2 = 0;
            while (i2 < i && !this.f32367k) {
                if (this.f32366j || this.f32365i.get() == null) {
                    publisherArr[i2].subscribe(bVarArr[i2]);
                    i2++;
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo36691b() {
            int i;
            if (getAndIncrement() == 0) {
                Subscriber<? super R> subscriber = this.f32361e;
                C12483b<T, R>[] bVarArr = this.f32362f;
                int length = bVarArr.length;
                Object[] objArr = this.f32368l;
                int i2 = 1;
                do {
                    long j = this.f32364h.get();
                    long j2 = 0;
                    while (true) {
                        i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
                        if (i == 0) {
                            break;
                        } else if (!this.f32367k) {
                            if (this.f32366j || this.f32365i.get() == null) {
                                boolean z = false;
                                for (int i3 = 0; i3 < length; i3++) {
                                    C12483b<T, R> bVar = bVarArr[i3];
                                    if (objArr[i3] == null) {
                                        try {
                                            boolean z2 = bVar.f32374j;
                                            SimpleQueue<T> simpleQueue = bVar.f32372h;
                                            Object poll = simpleQueue != null ? simpleQueue.poll() : null;
                                            boolean z3 = poll == null;
                                            if (!z2 || !z3) {
                                                if (!z3) {
                                                    objArr[i3] = poll;
                                                }
                                                z = true;
                                            } else {
                                                mo36688a();
                                                if (((Throwable) this.f32365i.get()) != null) {
                                                    subscriber.onError(this.f32365i.mo36928a());
                                                } else {
                                                    subscriber.onComplete();
                                                }
                                                return;
                                            }
                                        } catch (Throwable th) {
                                            C12285a.m32748b(th);
                                            this.f32365i.mo36929a(th);
                                            if (!this.f32366j) {
                                                mo36688a();
                                                subscriber.onError(this.f32365i.mo36928a());
                                                return;
                                            }
                                        }
                                    }
                                }
                                if (z) {
                                    break;
                                }
                                try {
                                    Object apply = this.f32363g.apply(objArr.clone());
                                    C12324b.m32836a(apply, "The zipper returned a null value");
                                    subscriber.onNext(apply);
                                    j2++;
                                    Arrays.fill(objArr, null);
                                } catch (Throwable th2) {
                                    C12285a.m32748b(th2);
                                    mo36688a();
                                    this.f32365i.mo36929a(th2);
                                    subscriber.onError(this.f32365i.mo36928a());
                                    return;
                                }
                            } else {
                                mo36688a();
                                subscriber.onError(this.f32365i.mo36928a());
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    if (i == 0) {
                        if (!this.f32367k) {
                            if (this.f32366j || this.f32365i.get() == null) {
                                for (int i4 = 0; i4 < length; i4++) {
                                    C12483b<T, R> bVar2 = bVarArr[i4];
                                    if (objArr[i4] == null) {
                                        try {
                                            boolean z4 = bVar2.f32374j;
                                            SimpleQueue<T> simpleQueue2 = bVar2.f32372h;
                                            Object poll2 = simpleQueue2 != null ? simpleQueue2.poll() : null;
                                            boolean z5 = poll2 == null;
                                            if (z4 && z5) {
                                                mo36688a();
                                                if (((Throwable) this.f32365i.get()) != null) {
                                                    subscriber.onError(this.f32365i.mo36928a());
                                                } else {
                                                    subscriber.onComplete();
                                                }
                                                return;
                                            } else if (!z5) {
                                                objArr[i4] = poll2;
                                            }
                                        } catch (Throwable th3) {
                                            C12285a.m32748b(th3);
                                            this.f32365i.mo36929a(th3);
                                            if (!this.f32366j) {
                                                mo36688a();
                                                subscriber.onError(this.f32365i.mo36928a());
                                                return;
                                            }
                                        }
                                    }
                                }
                            } else {
                                mo36688a();
                                subscriber.onError(this.f32365i.mo36928a());
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    if (j2 != 0) {
                        for (C12483b<T, R> request : bVarArr) {
                            request.request(j2);
                        }
                        if (j != Long.MAX_VALUE) {
                            this.f32364h.addAndGet(-j2);
                        }
                    }
                    i2 = addAndGet(-i2);
                } while (i2 != 0);
            }
        }

        public void cancel() {
            if (!this.f32367k) {
                this.f32367k = true;
                mo36688a();
            }
        }

        public void request(long j) {
            if (C12456g.m32971b(j)) {
                C12753c.m33346a(this.f32364h, j);
                mo36691b();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo36689a(C12483b<T, R> bVar, Throwable th) {
            if (this.f32365i.mo36929a(th)) {
                bVar.f32374j = true;
                mo36691b();
                return;
            }
            C12768a.m33415b(th);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo36688a() {
            for (C12483b<T, R> cancel : this.f32362f) {
                cancel.cancel();
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.a0$b */
    static final class C12483b<T, R> extends AtomicReference<Subscription> implements FlowableSubscriber<T>, Subscription {
        private static final long serialVersionUID = -4627193790118206028L;

        /* renamed from: e */
        final C12482a<T, R> f32369e;

        /* renamed from: f */
        final int f32370f;

        /* renamed from: g */
        final int f32371g;

        /* renamed from: h */
        SimpleQueue<T> f32372h;

        /* renamed from: i */
        long f32373i;

        /* renamed from: j */
        volatile boolean f32374j;

        /* renamed from: k */
        int f32375k;

        C12483b(C12482a<T, R> aVar, int i) {
            this.f32369e = aVar;
            this.f32370f = i;
            this.f32371g = i - (i >> 2);
        }

        public void cancel() {
            C12456g.m32967a((AtomicReference<Subscription>) this);
        }

        public void onComplete() {
            this.f32374j = true;
            this.f32369e.mo36691b();
        }

        public void onError(Throwable th) {
            this.f32369e.mo36689a(this, th);
        }

        public void onNext(T t) {
            if (this.f32375k != 2) {
                this.f32372h.offer(t);
            }
            this.f32369e.mo36691b();
        }

        public void onSubscribe(Subscription subscription) {
            if (C12456g.m32969a((AtomicReference<Subscription>) this, subscription)) {
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int requestFusion = queueSubscription.requestFusion(7);
                    if (requestFusion == 1) {
                        this.f32375k = requestFusion;
                        this.f32372h = queueSubscription;
                        this.f32374j = true;
                        this.f32369e.mo36691b();
                        return;
                    } else if (requestFusion == 2) {
                        this.f32375k = requestFusion;
                        this.f32372h = queueSubscription;
                        subscription.request((long) this.f32370f);
                        return;
                    }
                }
                this.f32372h = new C12448b(this.f32370f);
                subscription.request((long) this.f32370f);
            }
        }

        public void request(long j) {
            if (this.f32375k != 1) {
                long j2 = this.f32373i + j;
                if (j2 >= ((long) this.f32371g)) {
                    this.f32373i = 0;
                    ((Subscription) get()).request(j2);
                    return;
                }
                this.f32373i = j2;
            }
        }
    }

    public C12481a0(Publisher<? extends T>[] publisherArr, Iterable<? extends Publisher<? extends T>> iterable, Function<? super Object[], ? extends R> function, int i, boolean z) {
        this.f32356f = publisherArr;
        this.f32357g = iterable;
        this.f32358h = function;
        this.f32359i = i;
        this.f32360j = z;
    }

    /* renamed from: a */
    public void mo36365a(Subscriber<? super R> subscriber) {
        int i;
        Publisher<? extends T>[] publisherArr = this.f32356f;
        if (publisherArr == null) {
            publisherArr = new Publisher[8];
            i = 0;
            for (Publisher<? extends T> publisher : this.f32357g) {
                if (i == publisherArr.length) {
                    Publisher<? extends T>[] publisherArr2 = new Publisher[((i >> 2) + i)];
                    System.arraycopy(publisherArr, 0, publisherArr2, 0, i);
                    publisherArr = publisherArr2;
                }
                int i2 = i + 1;
                publisherArr[i] = publisher;
                i = i2;
            }
        } else {
            i = publisherArr.length;
        }
        if (i == 0) {
            C12453d.m32959a(subscriber);
            return;
        }
        C12482a aVar = new C12482a(subscriber, this.f32358h, i, this.f32359i, this.f32360j);
        subscriber.onSubscribe(aVar);
        aVar.mo36690a(publisherArr, i);
    }
}
