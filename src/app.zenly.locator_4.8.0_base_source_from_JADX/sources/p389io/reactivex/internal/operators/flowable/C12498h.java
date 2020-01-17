package p389io.reactivex.internal.operators.flowable;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import p389io.reactivex.C12272c;
import p389io.reactivex.FlowableSubscriber;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.exceptions.MissingBackpressureException;
import p389io.reactivex.functions.Function;
import p389io.reactivex.internal.fuseable.QueueSubscription;
import p389io.reactivex.internal.fuseable.SimplePlainQueue;
import p389io.reactivex.internal.fuseable.SimpleQueue;
import p389io.reactivex.internal.util.C12752b;
import p389io.reactivex.internal.util.C12753c;
import p389io.reactivex.internal.util.C12757g;
import p389io.reactivex.p393i.p394a.C12324b;
import p389io.reactivex.p393i.p400c.C12448b;
import p389io.reactivex.p393i.p400c.C12449c;
import p389io.reactivex.p393i.p401d.C12456g;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.internal.operators.flowable.h */
public final class C12498h<T, U> extends C12480a<T, U> {

    /* renamed from: g */
    final Function<? super T, ? extends Publisher<? extends U>> f32418g;

    /* renamed from: h */
    final boolean f32419h;

    /* renamed from: i */
    final int f32420i;

    /* renamed from: j */
    final int f32421j;

    /* renamed from: io.reactivex.internal.operators.flowable.h$a */
    static final class C12499a<T, U> extends AtomicReference<Subscription> implements FlowableSubscriber<U>, Disposable {
        private static final long serialVersionUID = -4606175640614850599L;

        /* renamed from: e */
        final long f32422e;

        /* renamed from: f */
        final C12500b<T, U> f32423f;

        /* renamed from: g */
        final int f32424g = (this.f32425h >> 2);

        /* renamed from: h */
        final int f32425h;

        /* renamed from: i */
        volatile boolean f32426i;

        /* renamed from: j */
        volatile SimpleQueue<U> f32427j;

        /* renamed from: k */
        long f32428k;

        /* renamed from: l */
        int f32429l;

        C12499a(C12500b<T, U> bVar, long j) {
            this.f32422e = j;
            this.f32423f = bVar;
            this.f32425h = bVar.f32436i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo36695a(long j) {
            if (this.f32429l != 1) {
                long j2 = this.f32428k + j;
                if (j2 >= ((long) this.f32424g)) {
                    this.f32428k = 0;
                    ((Subscription) get()).request(j2);
                    return;
                }
                this.f32428k = j2;
            }
        }

        public void dispose() {
            C12456g.m32967a((AtomicReference<Subscription>) this);
        }

        public boolean isDisposed() {
            return get() == C12456g.CANCELLED;
        }

        public void onComplete() {
            this.f32426i = true;
            this.f32423f.mo36705d();
        }

        public void onError(Throwable th) {
            lazySet(C12456g.CANCELLED);
            this.f32423f.mo36696a(this, th);
        }

        public void onNext(U u) {
            if (this.f32429l != 2) {
                this.f32423f.mo36698a(u, this);
            } else {
                this.f32423f.mo36705d();
            }
        }

        public void onSubscribe(Subscription subscription) {
            if (C12456g.m32969a((AtomicReference<Subscription>) this, subscription)) {
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int requestFusion = queueSubscription.requestFusion(7);
                    if (requestFusion == 1) {
                        this.f32429l = requestFusion;
                        this.f32427j = queueSubscription;
                        this.f32426i = true;
                        this.f32423f.mo36705d();
                        return;
                    } else if (requestFusion == 2) {
                        this.f32429l = requestFusion;
                        this.f32427j = queueSubscription;
                    }
                }
                subscription.request((long) this.f32425h);
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.h$b */
    static final class C12500b<T, U> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {
        private static final long serialVersionUID = -2117620485640801370L;

        /* renamed from: v */
        static final C12499a<?, ?>[] f32430v = new C12499a[0];

        /* renamed from: w */
        static final C12499a<?, ?>[] f32431w = new C12499a[0];

        /* renamed from: e */
        final Subscriber<? super U> f32432e;

        /* renamed from: f */
        final Function<? super T, ? extends Publisher<? extends U>> f32433f;

        /* renamed from: g */
        final boolean f32434g;

        /* renamed from: h */
        final int f32435h;

        /* renamed from: i */
        final int f32436i;

        /* renamed from: j */
        volatile SimplePlainQueue<U> f32437j;

        /* renamed from: k */
        volatile boolean f32438k;

        /* renamed from: l */
        final C12752b f32439l = new C12752b();

        /* renamed from: m */
        volatile boolean f32440m;

        /* renamed from: n */
        final AtomicReference<C12499a<?, ?>[]> f32441n = new AtomicReference<>();

        /* renamed from: o */
        final AtomicLong f32442o = new AtomicLong();

        /* renamed from: p */
        Subscription f32443p;

        /* renamed from: q */
        long f32444q;

        /* renamed from: r */
        long f32445r;

        /* renamed from: s */
        int f32446s;

        /* renamed from: t */
        int f32447t;

        /* renamed from: u */
        final int f32448u;

        C12500b(Subscriber<? super U> subscriber, Function<? super T, ? extends Publisher<? extends U>> function, boolean z, int i, int i2) {
            this.f32432e = subscriber;
            this.f32433f = function;
            this.f32434g = z;
            this.f32435h = i;
            this.f32436i = i2;
            this.f32448u = Math.max(1, i >> 1);
            this.f32441n.lazySet(f32430v);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo36700a(C12499a<T, U> aVar) {
            C12499a<?, ?>[] aVarArr;
            C12499a[] aVarArr2;
            do {
                aVarArr = (C12499a[]) this.f32441n.get();
                if (aVarArr == f32431w) {
                    aVar.dispose();
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new C12499a[(length + 1)];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!this.f32441n.compareAndSet(aVarArr, aVarArr2));
            return true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public SimpleQueue<U> mo36701b(C12499a<T, U> aVar) {
            SimpleQueue<U> simpleQueue = aVar.f32427j;
            if (simpleQueue != null) {
                return simpleQueue;
            }
            C12448b bVar = new C12448b(this.f32436i);
            aVar.f32427j = bVar;
            return bVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo36704c(C12499a<T, U> aVar) {
            C12499a<T, U>[] aVarArr;
            Object obj;
            do {
                aVarArr = (C12499a[]) this.f32441n.get();
                int length = aVarArr.length;
                if (length != 0) {
                    int i = -1;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        } else if (aVarArr[i2] == aVar) {
                            i = i2;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (i >= 0) {
                        if (length == 1) {
                            obj = f32430v;
                        } else {
                            C12499a[] aVarArr2 = new C12499a[(length - 1)];
                            System.arraycopy(aVarArr, 0, aVarArr2, 0, i);
                            System.arraycopy(aVarArr, i + 1, aVarArr2, i, (length - i) - 1);
                            obj = aVarArr2;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } while (!this.f32441n.compareAndSet(aVarArr, obj));
        }

        public void cancel() {
            if (!this.f32440m) {
                this.f32440m = true;
                this.f32443p.cancel();
                mo36703c();
                if (getAndIncrement() == 0) {
                    SimplePlainQueue<U> simplePlainQueue = this.f32437j;
                    if (simplePlainQueue != null) {
                        simplePlainQueue.clear();
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo36705d() {
            if (getAndIncrement() == 0) {
                mo36706e();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo36706e() {
            long j;
            long j2;
            long j3;
            boolean z;
            C12499a[] aVarArr;
            int i;
            long j4;
            Subscriber<? super U> subscriber = this.f32432e;
            int i2 = 1;
            while (!mo36699a()) {
                SimplePlainQueue<U> simplePlainQueue = this.f32437j;
                long j5 = this.f32442o.get();
                boolean z2 = j5 == Long.MAX_VALUE;
                long j6 = 0;
                long j7 = 0;
                if (simplePlainQueue != null) {
                    while (true) {
                        long j8 = 0;
                        Object obj = null;
                        while (true) {
                            if (j5 == 0) {
                                break;
                            }
                            Object poll = simplePlainQueue.poll();
                            if (!mo36699a()) {
                                if (poll == null) {
                                    obj = poll;
                                    break;
                                }
                                subscriber.onNext(poll);
                                j7++;
                                j8++;
                                j5--;
                                obj = poll;
                            } else {
                                return;
                            }
                        }
                        if (j8 != 0) {
                            if (z2) {
                                j5 = Long.MAX_VALUE;
                            } else {
                                j5 = this.f32442o.addAndGet(-j8);
                            }
                        }
                        if (j5 == 0 || obj == null) {
                            break;
                        }
                    }
                }
                boolean z3 = this.f32438k;
                SimplePlainQueue<U> simplePlainQueue2 = this.f32437j;
                C12499a[] aVarArr2 = (C12499a[]) this.f32441n.get();
                int length = aVarArr2.length;
                if (!z3 || ((simplePlainQueue2 != null && !simplePlainQueue2.isEmpty()) || length != 0)) {
                    int i3 = i2;
                    if (length != 0) {
                        long j9 = this.f32445r;
                        int i4 = this.f32446s;
                        if (length <= i4 || aVarArr2[i4].f32422e != j9) {
                            if (length <= i4) {
                                i4 = 0;
                            }
                            int i5 = i4;
                            for (int i6 = 0; i6 < length && aVarArr2[i5].f32422e != j9; i6++) {
                                i5++;
                                if (i5 == length) {
                                    i5 = 0;
                                }
                            }
                            this.f32446s = i5;
                            this.f32445r = aVarArr2[i5].f32422e;
                            i4 = i5;
                        }
                        int i7 = i4;
                        z = false;
                        int i8 = 0;
                        while (true) {
                            if (i8 >= length) {
                                aVarArr = aVarArr2;
                                break;
                            } else if (!mo36699a()) {
                                C12499a aVar = aVarArr2[i7];
                                Object obj2 = null;
                                while (!mo36699a()) {
                                    SimpleQueue<U> simpleQueue = aVar.f32427j;
                                    if (simpleQueue == null) {
                                        aVarArr = aVarArr2;
                                        i = length;
                                    } else {
                                        i = length;
                                        Object obj3 = obj2;
                                        aVarArr = aVarArr2;
                                        long j10 = j6;
                                        while (true) {
                                            if (j == j6) {
                                                break;
                                            }
                                            try {
                                                Object poll2 = simpleQueue.poll();
                                                if (poll2 == null) {
                                                    obj3 = poll2;
                                                    j6 = 0;
                                                    break;
                                                }
                                                subscriber.onNext(poll2);
                                                if (!mo36699a()) {
                                                    j--;
                                                    j10++;
                                                    obj3 = poll2;
                                                    j6 = 0;
                                                } else {
                                                    return;
                                                }
                                            } catch (Throwable th) {
                                                Throwable th2 = th;
                                                C12285a.m32748b(th2);
                                                aVar.dispose();
                                                this.f32439l.mo36929a(th2);
                                                if (!this.f32434g) {
                                                    this.f32443p.cancel();
                                                }
                                                if (!mo36699a()) {
                                                    mo36704c(aVar);
                                                    i8++;
                                                    z = true;
                                                } else {
                                                    return;
                                                }
                                            }
                                        }
                                        if (j10 != j6) {
                                            j = !z2 ? this.f32442o.addAndGet(-j10) : Long.MAX_VALUE;
                                            aVar.mo36695a(j10);
                                            j4 = 0;
                                        } else {
                                            j4 = j6;
                                        }
                                        if (!(j == j4 || obj3 == null)) {
                                            aVarArr2 = aVarArr;
                                            length = i;
                                            obj2 = obj3;
                                            j6 = 0;
                                        }
                                    }
                                    boolean z4 = aVar.f32426i;
                                    SimpleQueue<U> simpleQueue2 = aVar.f32427j;
                                    if (z4 && (simpleQueue2 == null || simpleQueue2.isEmpty())) {
                                        mo36704c(aVar);
                                        if (!mo36699a()) {
                                            j7++;
                                            z = true;
                                        } else {
                                            return;
                                        }
                                    }
                                    if (j == 0) {
                                        break;
                                    }
                                    int i9 = i7 + 1;
                                    i7 = i9 == i ? 0 : i9;
                                    i8++;
                                    aVarArr2 = aVarArr;
                                    length = i;
                                    j6 = 0;
                                }
                                return;
                            } else {
                                return;
                            }
                        }
                        this.f32446s = i7;
                        this.f32445r = aVarArr[i7].f32422e;
                        j3 = j7;
                        j2 = 0;
                    } else {
                        j2 = 0;
                        j3 = j7;
                        z = false;
                    }
                    if (j3 != j2 && !this.f32440m) {
                        this.f32443p.request(j3);
                    }
                    if (z) {
                        i2 = i3;
                    } else {
                        i2 = addAndGet(-i3);
                        if (i2 == 0) {
                            return;
                        }
                    }
                } else {
                    Throwable a = this.f32439l.mo36928a();
                    if (a != C12757g.f33270a) {
                        if (a == null) {
                            subscriber.onComplete();
                        } else {
                            subscriber.onError(a);
                        }
                    }
                    return;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public SimpleQueue<U> mo36707f() {
            SimplePlainQueue<U> simplePlainQueue = this.f32437j;
            if (simplePlainQueue == null) {
                int i = this.f32435h;
                if (i == Integer.MAX_VALUE) {
                    simplePlainQueue = new C12449c<>(this.f32436i);
                } else {
                    simplePlainQueue = new C12448b<>(i);
                }
                this.f32437j = simplePlainQueue;
            }
            return simplePlainQueue;
        }

        public void onComplete() {
            if (!this.f32438k) {
                this.f32438k = true;
                mo36705d();
            }
        }

        public void onError(Throwable th) {
            if (this.f32438k) {
                C12768a.m33415b(th);
                return;
            }
            if (this.f32439l.mo36929a(th)) {
                this.f32438k = true;
                mo36705d();
            } else {
                C12768a.m33415b(th);
            }
        }

        public void onNext(T t) {
            if (!this.f32438k) {
                try {
                    Publisher publisher = (Publisher) C12324b.m32836a(this.f32433f.apply(t), "The mapper returned a null Publisher");
                    if (publisher instanceof Callable) {
                        try {
                            Object call = ((Callable) publisher).call();
                            if (call != null) {
                                mo36697a((U) call);
                            } else if (this.f32435h != Integer.MAX_VALUE && !this.f32440m) {
                                int i = this.f32447t + 1;
                                this.f32447t = i;
                                int i2 = this.f32448u;
                                if (i == i2) {
                                    this.f32447t = 0;
                                    this.f32443p.request((long) i2);
                                }
                            }
                        } catch (Throwable th) {
                            C12285a.m32748b(th);
                            this.f32439l.mo36929a(th);
                            mo36705d();
                        }
                    } else {
                        long j = this.f32444q;
                        this.f32444q = 1 + j;
                        C12499a aVar = new C12499a(this, j);
                        if (mo36700a(aVar)) {
                            publisher.subscribe(aVar);
                        }
                    }
                } catch (Throwable th2) {
                    C12285a.m32748b(th2);
                    this.f32443p.cancel();
                    onError(th2);
                }
            }
        }

        public void onSubscribe(Subscription subscription) {
            if (C12456g.m32970a(this.f32443p, subscription)) {
                this.f32443p = subscription;
                this.f32432e.onSubscribe(this);
                if (!this.f32440m) {
                    int i = this.f32435h;
                    if (i == Integer.MAX_VALUE) {
                        subscription.request(Long.MAX_VALUE);
                    } else {
                        subscription.request((long) i);
                    }
                }
            }
        }

        public void request(long j) {
            if (C12456g.m32971b(j)) {
                C12753c.m33346a(this.f32442o, j);
                mo36705d();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo36702b() {
            SimplePlainQueue<U> simplePlainQueue = this.f32437j;
            if (simplePlainQueue != null) {
                simplePlainQueue.clear();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo36697a(U u) {
            String str = "Scalar queue full?!";
            if (get() == 0 && compareAndSet(0, 1)) {
                long j = this.f32442o.get();
                SimpleQueue simpleQueue = this.f32437j;
                if (j == 0 || (simpleQueue != null && !simpleQueue.isEmpty())) {
                    if (simpleQueue == null) {
                        simpleQueue = mo36707f();
                    }
                    if (!simpleQueue.offer(u)) {
                        onError(new IllegalStateException(str));
                        return;
                    }
                } else {
                    this.f32432e.onNext(u);
                    if (j != Long.MAX_VALUE) {
                        this.f32442o.decrementAndGet();
                    }
                    if (this.f32435h != Integer.MAX_VALUE && !this.f32440m) {
                        int i = this.f32447t + 1;
                        this.f32447t = i;
                        int i2 = this.f32448u;
                        if (i == i2) {
                            this.f32447t = 0;
                            this.f32443p.request((long) i2);
                        }
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else if (!mo36707f().offer(u)) {
                onError(new IllegalStateException(str));
                return;
            } else if (getAndIncrement() != 0) {
                return;
            }
            mo36706e();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo36703c() {
            C12499a<?, ?>[] aVarArr = (C12499a[]) this.f32441n.get();
            C12499a<?, ?>[] aVarArr2 = f32431w;
            if (aVarArr != aVarArr2) {
                C12499a<?, ?>[] aVarArr3 = (C12499a[]) this.f32441n.getAndSet(aVarArr2);
                if (aVarArr3 != f32431w) {
                    for (C12499a<?, ?> dispose : aVarArr3) {
                        dispose.dispose();
                    }
                    Throwable a = this.f32439l.mo36928a();
                    if (a != null && a != C12757g.f33270a) {
                        C12768a.m33415b(a);
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo36698a(U u, C12499a<T, U> aVar) {
            String str = "Inner queue full?!";
            if (get() != 0 || !compareAndSet(0, 1)) {
                SimpleQueue simpleQueue = aVar.f32427j;
                if (simpleQueue == null) {
                    simpleQueue = new C12448b(this.f32436i);
                    aVar.f32427j = simpleQueue;
                }
                if (!simpleQueue.offer(u)) {
                    onError(new MissingBackpressureException(str));
                    return;
                } else if (getAndIncrement() != 0) {
                    return;
                }
            } else {
                long j = this.f32442o.get();
                SimpleQueue<U> simpleQueue2 = aVar.f32427j;
                if (j == 0 || (simpleQueue2 != null && !simpleQueue2.isEmpty())) {
                    if (simpleQueue2 == null) {
                        simpleQueue2 = mo36701b(aVar);
                    }
                    if (!simpleQueue2.offer(u)) {
                        onError(new MissingBackpressureException(str));
                        return;
                    }
                } else {
                    this.f32432e.onNext(u);
                    if (j != Long.MAX_VALUE) {
                        this.f32442o.decrementAndGet();
                    }
                    aVar.mo36695a(1);
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            mo36706e();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo36699a() {
            if (this.f32440m) {
                mo36702b();
                return true;
            } else if (this.f32434g || this.f32439l.get() == null) {
                return false;
            } else {
                mo36702b();
                Throwable a = this.f32439l.mo36928a();
                if (a != C12757g.f33270a) {
                    this.f32432e.onError(a);
                }
                return true;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo36696a(C12499a<T, U> aVar, Throwable th) {
            if (this.f32439l.mo36929a(th)) {
                aVar.f32426i = true;
                if (!this.f32434g) {
                    this.f32443p.cancel();
                    for (C12499a dispose : (C12499a[]) this.f32441n.getAndSet(f32431w)) {
                        dispose.dispose();
                    }
                }
                mo36705d();
                return;
            }
            C12768a.m33415b(th);
        }
    }

    public C12498h(C12272c<T> cVar, Function<? super T, ? extends Publisher<? extends U>> function, boolean z, int i, int i2) {
        super(cVar);
        this.f32418g = function;
        this.f32419h = z;
        this.f32420i = i;
        this.f32421j = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36365a(Subscriber<? super U> subscriber) {
        if (!C12530w.m33065a(this.f32355f, subscriber, this.f32418g)) {
            this.f32355f.mo36364a(m33014a(subscriber, this.f32418g, this.f32419h, this.f32420i, this.f32421j));
        }
    }

    /* renamed from: a */
    public static <T, U> FlowableSubscriber<T> m33014a(Subscriber<? super U> subscriber, Function<? super T, ? extends Publisher<? extends U>> function, boolean z, int i, int i2) {
        C12500b bVar = new C12500b(subscriber, function, z, i, i2);
        return bVar;
    }
}
