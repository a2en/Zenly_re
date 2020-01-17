package p389io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import p389io.reactivex.C12272c;
import p389io.reactivex.C12286f;
import p389io.reactivex.C12286f.C12289c;
import p389io.reactivex.FlowableSubscriber;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.exceptions.MissingBackpressureException;
import p389io.reactivex.internal.fuseable.ConditionalSubscriber;
import p389io.reactivex.internal.fuseable.QueueSubscription;
import p389io.reactivex.internal.fuseable.SimpleQueue;
import p389io.reactivex.internal.util.C12753c;
import p389io.reactivex.p393i.p400c.C12448b;
import p389io.reactivex.p393i.p401d.C12450a;
import p389io.reactivex.p393i.p401d.C12456g;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.internal.operators.flowable.n */
public final class C12510n<T> extends C12480a<T, T> {

    /* renamed from: g */
    final C12286f f32465g;

    /* renamed from: h */
    final boolean f32466h;

    /* renamed from: i */
    final int f32467i;

    /* renamed from: io.reactivex.internal.operators.flowable.n$a */
    static abstract class C12511a<T> extends C12450a<T> implements FlowableSubscriber<T>, Runnable {
        private static final long serialVersionUID = -8241002408341274697L;

        /* renamed from: e */
        final C12289c f32468e;

        /* renamed from: f */
        final boolean f32469f;

        /* renamed from: g */
        final int f32470g;

        /* renamed from: h */
        final int f32471h;

        /* renamed from: i */
        final AtomicLong f32472i = new AtomicLong();

        /* renamed from: j */
        Subscription f32473j;

        /* renamed from: k */
        SimpleQueue<T> f32474k;

        /* renamed from: l */
        volatile boolean f32475l;

        /* renamed from: m */
        volatile boolean f32476m;

        /* renamed from: n */
        Throwable f32477n;

        /* renamed from: o */
        int f32478o;

        /* renamed from: p */
        long f32479p;

        /* renamed from: q */
        boolean f32480q;

        C12511a(C12289c cVar, boolean z, int i) {
            this.f32468e = cVar;
            this.f32469f = z;
            this.f32470g = i;
            this.f32471h = i - (i >> 2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo36711a();

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo36712a(boolean z, boolean z2, Subscriber<?> subscriber) {
            if (this.f32475l) {
                clear();
                return true;
            }
            if (z) {
                if (!this.f32469f) {
                    Throwable th = this.f32477n;
                    if (th != null) {
                        this.f32475l = true;
                        clear();
                        subscriber.onError(th);
                        this.f32468e.dispose();
                        return true;
                    } else if (z2) {
                        this.f32475l = true;
                        subscriber.onComplete();
                        this.f32468e.dispose();
                        return true;
                    }
                } else if (z2) {
                    this.f32475l = true;
                    Throwable th2 = this.f32477n;
                    if (th2 != null) {
                        subscriber.onError(th2);
                    } else {
                        subscriber.onComplete();
                    }
                    this.f32468e.dispose();
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public abstract void mo36713b();

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public abstract void mo36714c();

        public final void cancel() {
            if (!this.f32475l) {
                this.f32475l = true;
                this.f32473j.cancel();
                this.f32468e.dispose();
                if (getAndIncrement() == 0) {
                    this.f32474k.clear();
                }
            }
        }

        public final void clear() {
            this.f32474k.clear();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public final void mo36715d() {
            if (getAndIncrement() == 0) {
                this.f32468e.mo6574a((Runnable) this);
            }
        }

        public final boolean isEmpty() {
            return this.f32474k.isEmpty();
        }

        public final void onComplete() {
            if (!this.f32476m) {
                this.f32476m = true;
                mo36715d();
            }
        }

        public final void onError(Throwable th) {
            if (this.f32476m) {
                C12768a.m33415b(th);
                return;
            }
            this.f32477n = th;
            this.f32476m = true;
            mo36715d();
        }

        public final void onNext(T t) {
            if (!this.f32476m) {
                if (this.f32478o == 2) {
                    mo36715d();
                    return;
                }
                if (!this.f32474k.offer(t)) {
                    this.f32473j.cancel();
                    this.f32477n = new MissingBackpressureException("Queue is full?!");
                    this.f32476m = true;
                }
                mo36715d();
            }
        }

        public final void request(long j) {
            if (C12456g.m32971b(j)) {
                C12753c.m33346a(this.f32472i, j);
                mo36715d();
            }
        }

        public final int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.f32480q = true;
            return 2;
        }

        public final void run() {
            if (this.f32480q) {
                mo36713b();
            } else if (this.f32478o == 1) {
                mo36714c();
            } else {
                mo36711a();
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.n$b */
    static final class C12512b<T> extends C12511a<T> {
        private static final long serialVersionUID = 644624475404284533L;

        /* renamed from: r */
        final ConditionalSubscriber<? super T> f32481r;

        /* renamed from: s */
        long f32482s;

        C12512b(ConditionalSubscriber<? super T> conditionalSubscriber, C12289c cVar, boolean z, int i) {
            super(cVar, z, i);
            this.f32481r = conditionalSubscriber;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo36711a() {
            int i;
            ConditionalSubscriber<? super T> conditionalSubscriber = this.f32481r;
            SimpleQueue<T> simpleQueue = this.f32474k;
            long j = this.f32479p;
            long j2 = this.f32482s;
            int i2 = 1;
            while (true) {
                long j3 = this.f32472i.get();
                while (true) {
                    i = (j > j3 ? 1 : (j == j3 ? 0 : -1));
                    if (i == 0) {
                        break;
                    }
                    boolean z = this.f32476m;
                    try {
                        Object poll = simpleQueue.poll();
                        boolean z2 = poll == null;
                        if (!mo36712a(z, z2, conditionalSubscriber)) {
                            if (z2) {
                                break;
                            }
                            if (conditionalSubscriber.tryOnNext(poll)) {
                                j++;
                            }
                            j2++;
                            if (j2 == ((long) this.f32471h)) {
                                this.f32473j.request(j2);
                                j2 = 0;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        C12285a.m32748b(th);
                        this.f32475l = true;
                        this.f32473j.cancel();
                        simpleQueue.clear();
                        conditionalSubscriber.onError(th);
                        this.f32468e.dispose();
                        return;
                    }
                }
                if (i != 0 || !mo36712a(this.f32476m, simpleQueue.isEmpty(), conditionalSubscriber)) {
                    int i3 = get();
                    if (i2 == i3) {
                        this.f32479p = j;
                        this.f32482s = j2;
                        i2 = addAndGet(-i2);
                        if (i2 == 0) {
                            return;
                        }
                    } else {
                        i2 = i3;
                    }
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo36713b() {
            int i = 1;
            while (!this.f32475l) {
                boolean z = this.f32476m;
                this.f32481r.onNext(null);
                if (z) {
                    this.f32475l = true;
                    Throwable th = this.f32477n;
                    if (th != null) {
                        this.f32481r.onError(th);
                    } else {
                        this.f32481r.onComplete();
                    }
                    this.f32468e.dispose();
                    return;
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo36714c() {
            ConditionalSubscriber<? super T> conditionalSubscriber = this.f32481r;
            SimpleQueue<T> simpleQueue = this.f32474k;
            long j = this.f32479p;
            int i = 1;
            while (true) {
                long j2 = this.f32472i.get();
                while (j != j2) {
                    try {
                        Object poll = simpleQueue.poll();
                        if (!this.f32475l) {
                            if (poll == null) {
                                this.f32475l = true;
                                conditionalSubscriber.onComplete();
                                this.f32468e.dispose();
                                return;
                            } else if (conditionalSubscriber.tryOnNext(poll)) {
                                j++;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        C12285a.m32748b(th);
                        this.f32475l = true;
                        this.f32473j.cancel();
                        conditionalSubscriber.onError(th);
                        this.f32468e.dispose();
                        return;
                    }
                }
                if (!this.f32475l) {
                    if (simpleQueue.isEmpty()) {
                        this.f32475l = true;
                        conditionalSubscriber.onComplete();
                        this.f32468e.dispose();
                        return;
                    }
                    int i2 = get();
                    if (i == i2) {
                        this.f32479p = j;
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        i = i2;
                    }
                } else {
                    return;
                }
            }
        }

        public void onSubscribe(Subscription subscription) {
            if (C12456g.m32970a(this.f32473j, subscription)) {
                this.f32473j = subscription;
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int requestFusion = queueSubscription.requestFusion(7);
                    if (requestFusion == 1) {
                        this.f32478o = 1;
                        this.f32474k = queueSubscription;
                        this.f32476m = true;
                        this.f32481r.onSubscribe(this);
                        return;
                    } else if (requestFusion == 2) {
                        this.f32478o = 2;
                        this.f32474k = queueSubscription;
                        this.f32481r.onSubscribe(this);
                        subscription.request((long) this.f32470g);
                        return;
                    }
                }
                this.f32474k = new C12448b(this.f32470g);
                this.f32481r.onSubscribe(this);
                subscription.request((long) this.f32470g);
            }
        }

        public T poll() throws Exception {
            T poll = this.f32474k.poll();
            if (!(poll == null || this.f32478o == 1)) {
                long j = this.f32482s + 1;
                if (j == ((long) this.f32471h)) {
                    this.f32482s = 0;
                    this.f32473j.request(j);
                } else {
                    this.f32482s = j;
                }
            }
            return poll;
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.n$c */
    static final class C12513c<T> extends C12511a<T> implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -4547113800637756442L;

        /* renamed from: r */
        final Subscriber<? super T> f32483r;

        C12513c(Subscriber<? super T> subscriber, C12289c cVar, boolean z, int i) {
            super(cVar, z, i);
            this.f32483r = subscriber;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo36711a() {
            int i;
            Subscriber<? super T> subscriber = this.f32483r;
            SimpleQueue<T> simpleQueue = this.f32474k;
            long j = this.f32479p;
            int i2 = 1;
            while (true) {
                long j2 = this.f32472i.get();
                while (true) {
                    i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
                    if (i == 0) {
                        break;
                    }
                    boolean z = this.f32476m;
                    try {
                        Object poll = simpleQueue.poll();
                        boolean z2 = poll == null;
                        if (!mo36712a(z, z2, subscriber)) {
                            if (z2) {
                                break;
                            }
                            subscriber.onNext(poll);
                            j++;
                            if (j == ((long) this.f32471h)) {
                                if (j2 != Long.MAX_VALUE) {
                                    j2 = this.f32472i.addAndGet(-j);
                                }
                                this.f32473j.request(j);
                                j = 0;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        C12285a.m32748b(th);
                        this.f32475l = true;
                        this.f32473j.cancel();
                        simpleQueue.clear();
                        subscriber.onError(th);
                        this.f32468e.dispose();
                        return;
                    }
                }
                if (i != 0 || !mo36712a(this.f32476m, simpleQueue.isEmpty(), subscriber)) {
                    int i3 = get();
                    if (i2 == i3) {
                        this.f32479p = j;
                        i2 = addAndGet(-i2);
                        if (i2 == 0) {
                            return;
                        }
                    } else {
                        i2 = i3;
                    }
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo36713b() {
            int i = 1;
            while (!this.f32475l) {
                boolean z = this.f32476m;
                this.f32483r.onNext(null);
                if (z) {
                    this.f32475l = true;
                    Throwable th = this.f32477n;
                    if (th != null) {
                        this.f32483r.onError(th);
                    } else {
                        this.f32483r.onComplete();
                    }
                    this.f32468e.dispose();
                    return;
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo36714c() {
            Subscriber<? super T> subscriber = this.f32483r;
            SimpleQueue<T> simpleQueue = this.f32474k;
            long j = this.f32479p;
            int i = 1;
            while (true) {
                long j2 = this.f32472i.get();
                while (j != j2) {
                    try {
                        Object poll = simpleQueue.poll();
                        if (!this.f32475l) {
                            if (poll == null) {
                                this.f32475l = true;
                                subscriber.onComplete();
                                this.f32468e.dispose();
                                return;
                            }
                            subscriber.onNext(poll);
                            j++;
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        C12285a.m32748b(th);
                        this.f32475l = true;
                        this.f32473j.cancel();
                        subscriber.onError(th);
                        this.f32468e.dispose();
                        return;
                    }
                }
                if (!this.f32475l) {
                    if (simpleQueue.isEmpty()) {
                        this.f32475l = true;
                        subscriber.onComplete();
                        this.f32468e.dispose();
                        return;
                    }
                    int i2 = get();
                    if (i == i2) {
                        this.f32479p = j;
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        i = i2;
                    }
                } else {
                    return;
                }
            }
        }

        public void onSubscribe(Subscription subscription) {
            if (C12456g.m32970a(this.f32473j, subscription)) {
                this.f32473j = subscription;
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int requestFusion = queueSubscription.requestFusion(7);
                    if (requestFusion == 1) {
                        this.f32478o = 1;
                        this.f32474k = queueSubscription;
                        this.f32476m = true;
                        this.f32483r.onSubscribe(this);
                        return;
                    } else if (requestFusion == 2) {
                        this.f32478o = 2;
                        this.f32474k = queueSubscription;
                        this.f32483r.onSubscribe(this);
                        subscription.request((long) this.f32470g);
                        return;
                    }
                }
                this.f32474k = new C12448b(this.f32470g);
                this.f32483r.onSubscribe(this);
                subscription.request((long) this.f32470g);
            }
        }

        public T poll() throws Exception {
            T poll = this.f32474k.poll();
            if (!(poll == null || this.f32478o == 1)) {
                long j = this.f32479p + 1;
                if (j == ((long) this.f32471h)) {
                    this.f32479p = 0;
                    this.f32473j.request(j);
                } else {
                    this.f32479p = j;
                }
            }
            return poll;
        }
    }

    public C12510n(C12272c<T> cVar, C12286f fVar, boolean z, int i) {
        super(cVar);
        this.f32465g = fVar;
        this.f32466h = z;
        this.f32467i = i;
    }

    /* renamed from: a */
    public void mo36365a(Subscriber<? super T> subscriber) {
        C12289c a = this.f32465g.mo6573a();
        if (subscriber instanceof ConditionalSubscriber) {
            this.f32355f.mo36364a((FlowableSubscriber<? super T>) new C12512b<Object>((ConditionalSubscriber) subscriber, a, this.f32466h, this.f32467i));
        } else {
            this.f32355f.mo36364a((FlowableSubscriber<? super T>) new C12513c<Object>(subscriber, a, this.f32466h, this.f32467i));
        }
    }
}
