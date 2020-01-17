package p389io.reactivex.internal.operators.observable;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.Observer;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.functions.Function;
import p389io.reactivex.internal.disposables.C12458b;
import p389io.reactivex.internal.fuseable.QueueDisposable;
import p389io.reactivex.internal.fuseable.SimplePlainQueue;
import p389io.reactivex.internal.fuseable.SimpleQueue;
import p389io.reactivex.internal.util.C12752b;
import p389io.reactivex.internal.util.C12757g;
import p389io.reactivex.p393i.p394a.C12324b;
import p389io.reactivex.p393i.p400c.C12448b;
import p389io.reactivex.p393i.p400c.C12449c;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.internal.operators.observable.x */
public final class C12701x<T, U> extends C12538a<T, U> {

    /* renamed from: f */
    final Function<? super T, ? extends ObservableSource<? extends U>> f33080f;

    /* renamed from: g */
    final boolean f33081g;

    /* renamed from: h */
    final int f33082h;

    /* renamed from: i */
    final int f33083i;

    /* renamed from: io.reactivex.internal.operators.observable.x$a */
    static final class C12702a<T, U> extends AtomicReference<Disposable> implements Observer<U> {
        private static final long serialVersionUID = -4606175640614850599L;

        /* renamed from: e */
        final long f33084e;

        /* renamed from: f */
        final C12703b<T, U> f33085f;

        /* renamed from: g */
        volatile boolean f33086g;

        /* renamed from: h */
        volatile SimpleQueue<U> f33087h;

        /* renamed from: i */
        int f33088i;

        C12702a(C12703b<T, U> bVar, long j) {
            this.f33084e = j;
            this.f33085f = bVar;
        }

        /* renamed from: a */
        public void mo36833a() {
            C12458b.m32975a((AtomicReference<Disposable>) this);
        }

        public void onComplete() {
            this.f33086g = true;
            this.f33085f.mo36841c();
        }

        public void onError(Throwable th) {
            if (this.f33085f.f33098l.mo36929a(th)) {
                C12703b<T, U> bVar = this.f33085f;
                if (!bVar.f33093g) {
                    bVar.mo36840b();
                }
                this.f33086g = true;
                this.f33085f.mo36841c();
                return;
            }
            C12768a.m33415b(th);
        }

        public void onNext(U u) {
            if (this.f33088i == 0) {
                this.f33085f.mo36835a(u, this);
            } else {
                this.f33085f.mo36841c();
            }
        }

        public void onSubscribe(Disposable disposable) {
            if (C12458b.m32978c(this, disposable) && (disposable instanceof QueueDisposable)) {
                QueueDisposable queueDisposable = (QueueDisposable) disposable;
                int requestFusion = queueDisposable.requestFusion(7);
                if (requestFusion == 1) {
                    this.f33088i = requestFusion;
                    this.f33087h = queueDisposable;
                    this.f33086g = true;
                    this.f33085f.mo36841c();
                } else if (requestFusion == 2) {
                    this.f33088i = requestFusion;
                    this.f33087h = queueDisposable;
                }
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.x$b */
    static final class C12703b<T, U> extends AtomicInteger implements Disposable, Observer<T> {
        private static final long serialVersionUID = -2117620485640801370L;

        /* renamed from: u */
        static final C12702a<?, ?>[] f33089u = new C12702a[0];

        /* renamed from: v */
        static final C12702a<?, ?>[] f33090v = new C12702a[0];

        /* renamed from: e */
        final Observer<? super U> f33091e;

        /* renamed from: f */
        final Function<? super T, ? extends ObservableSource<? extends U>> f33092f;

        /* renamed from: g */
        final boolean f33093g;

        /* renamed from: h */
        final int f33094h;

        /* renamed from: i */
        final int f33095i;

        /* renamed from: j */
        volatile SimplePlainQueue<U> f33096j;

        /* renamed from: k */
        volatile boolean f33097k;

        /* renamed from: l */
        final C12752b f33098l = new C12752b();

        /* renamed from: m */
        volatile boolean f33099m;

        /* renamed from: n */
        final AtomicReference<C12702a<?, ?>[]> f33100n;

        /* renamed from: o */
        Disposable f33101o;

        /* renamed from: p */
        long f33102p;

        /* renamed from: q */
        long f33103q;

        /* renamed from: r */
        int f33104r;

        /* renamed from: s */
        Queue<ObservableSource<? extends U>> f33105s;

        /* renamed from: t */
        int f33106t;

        C12703b(Observer<? super U> observer, Function<? super T, ? extends ObservableSource<? extends U>> function, boolean z, int i, int i2) {
            this.f33091e = observer;
            this.f33092f = function;
            this.f33093g = z;
            this.f33094h = i;
            this.f33095i = i2;
            if (i != Integer.MAX_VALUE) {
                this.f33105s = new ArrayDeque(i);
            }
            this.f33100n = new AtomicReference<>(f33089u);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo36834a(ObservableSource<? extends U> observableSource) {
            ObservableSource<? extends U> observableSource2;
            while (observableSource instanceof Callable) {
                if (mo36838a((Callable) observableSource) && this.f33094h != Integer.MAX_VALUE) {
                    boolean z = false;
                    synchronized (this) {
                        observableSource2 = (ObservableSource) this.f33105s.poll();
                        if (observableSource2 == null) {
                            this.f33106t--;
                            z = true;
                        }
                    }
                    if (z) {
                        mo36841c();
                        return;
                    }
                    observableSource = observableSource2;
                } else {
                    return;
                }
            }
            long j = this.f33102p;
            this.f33102p = 1 + j;
            C12702a aVar = new C12702a(this, j);
            if (mo36837a(aVar)) {
                observableSource.subscribe(aVar);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo36839b(C12702a<T, U> aVar) {
            C12702a<T, U>[] aVarArr;
            Object obj;
            do {
                aVarArr = (C12702a[]) this.f33100n.get();
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
                            obj = f33089u;
                        } else {
                            C12702a[] aVarArr2 = new C12702a[(length - 1)];
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
            } while (!this.f33100n.compareAndSet(aVarArr, obj));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo36841c() {
            if (getAndIncrement() == 0) {
                mo36842d();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo36842d() {
            int i;
            int i2;
            int i3;
            Observer<? super U> observer = this.f33091e;
            int i4 = 1;
            while (!mo36836a()) {
                SimplePlainQueue<U> simplePlainQueue = this.f33096j;
                if (simplePlainQueue != null) {
                    while (!mo36836a()) {
                        Object poll = simplePlainQueue.poll();
                        if (poll != null) {
                            observer.onNext(poll);
                        }
                    }
                    return;
                }
                boolean z = this.f33097k;
                SimplePlainQueue<U> simplePlainQueue2 = this.f33096j;
                C12702a[] aVarArr = (C12702a[]) this.f33100n.get();
                int length = aVarArr.length;
                if (this.f33094h != Integer.MAX_VALUE) {
                    synchronized (this) {
                        i = this.f33105s.size();
                    }
                } else {
                    i = 0;
                }
                if (!z || !((simplePlainQueue2 == null || simplePlainQueue2.isEmpty()) && length == 0 && i == 0)) {
                    if (length != 0) {
                        long j = this.f33103q;
                        int i5 = this.f33104r;
                        if (length <= i5 || aVarArr[i5].f33084e != j) {
                            if (length <= i5) {
                                i5 = 0;
                            }
                            int i6 = i5;
                            for (int i7 = 0; i7 < length && aVarArr[i6].f33084e != j; i7++) {
                                i6++;
                                if (i6 == length) {
                                    i6 = 0;
                                }
                            }
                            this.f33104r = i6;
                            this.f33103q = aVarArr[i6].f33084e;
                            i5 = i6;
                        }
                        int i8 = 0;
                        i2 = 0;
                        while (i8 < length) {
                            if (!mo36836a()) {
                                C12702a aVar = aVarArr[i3];
                                SimpleQueue<U> simpleQueue = aVar.f33087h;
                                if (simpleQueue != null) {
                                    while (true) {
                                        try {
                                            Object poll2 = simpleQueue.poll();
                                            if (poll2 == null) {
                                                break;
                                            }
                                            observer.onNext(poll2);
                                            if (mo36836a()) {
                                                return;
                                            }
                                        } catch (Throwable th) {
                                            C12285a.m32748b(th);
                                            aVar.mo36833a();
                                            this.f33098l.mo36929a(th);
                                            if (!mo36836a()) {
                                                mo36839b(aVar);
                                                i2++;
                                                i3++;
                                                if (i3 != length) {
                                                }
                                            } else {
                                                return;
                                            }
                                        }
                                    }
                                }
                                boolean z2 = aVar.f33086g;
                                SimpleQueue<U> simpleQueue2 = aVar.f33087h;
                                if (z2 && (simpleQueue2 == null || simpleQueue2.isEmpty())) {
                                    mo36839b(aVar);
                                    if (!mo36836a()) {
                                        i2++;
                                    } else {
                                        return;
                                    }
                                }
                                i3++;
                                if (i3 != length) {
                                    i8++;
                                }
                                i3 = 0;
                                i8++;
                            } else {
                                return;
                            }
                        }
                        this.f33104r = i3;
                        this.f33103q = aVarArr[i3].f33084e;
                    } else {
                        i2 = 0;
                    }
                    if (i2 == 0) {
                        i4 = addAndGet(-i4);
                        if (i4 == 0) {
                            return;
                        }
                    } else if (this.f33094h != Integer.MAX_VALUE) {
                        while (true) {
                            int i9 = i2 - 1;
                            if (i2 == 0) {
                                continue;
                                break;
                            }
                            synchronized (this) {
                                ObservableSource observableSource = (ObservableSource) this.f33105s.poll();
                                if (observableSource == null) {
                                    this.f33106t--;
                                } else {
                                    mo36834a(observableSource);
                                }
                            }
                            i2 = i9;
                        }
                        while (true) {
                        }
                    } else {
                        continue;
                    }
                } else {
                    Throwable a = this.f33098l.mo36928a();
                    if (a != C12757g.f33270a) {
                        if (a == null) {
                            observer.onComplete();
                        } else {
                            observer.onError(a);
                        }
                    }
                    return;
                }
            }
        }

        public void dispose() {
            if (!this.f33099m) {
                this.f33099m = true;
                if (mo36840b()) {
                    Throwable a = this.f33098l.mo36928a();
                    if (a != null && a != C12757g.f33270a) {
                        C12768a.m33415b(a);
                    }
                }
            }
        }

        public boolean isDisposed() {
            return this.f33099m;
        }

        public void onComplete() {
            if (!this.f33097k) {
                this.f33097k = true;
                mo36841c();
            }
        }

        public void onError(Throwable th) {
            if (this.f33097k) {
                C12768a.m33415b(th);
                return;
            }
            if (this.f33098l.mo36929a(th)) {
                this.f33097k = true;
                mo36841c();
            } else {
                C12768a.m33415b(th);
            }
        }

        public void onNext(T t) {
            if (!this.f33097k) {
                try {
                    Object apply = this.f33092f.apply(t);
                    C12324b.m32836a(apply, "The mapper returned a null ObservableSource");
                    ObservableSource observableSource = (ObservableSource) apply;
                    if (this.f33094h != Integer.MAX_VALUE) {
                        synchronized (this) {
                            if (this.f33106t == this.f33094h) {
                                this.f33105s.offer(observableSource);
                                return;
                            }
                            this.f33106t++;
                        }
                    }
                    mo36834a(observableSource);
                } catch (Throwable th) {
                    C12285a.m32748b(th);
                    this.f33101o.dispose();
                    onError(th);
                }
            }
        }

        public void onSubscribe(Disposable disposable) {
            if (C12458b.m32974a(this.f33101o, disposable)) {
                this.f33101o = disposable;
                this.f33091e.onSubscribe(this);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public boolean mo36840b() {
            this.f33101o.dispose();
            C12702a<?, ?>[] aVarArr = (C12702a[]) this.f33100n.get();
            C12702a<?, ?>[] aVarArr2 = f33090v;
            if (aVarArr != aVarArr2) {
                C12702a<?, ?>[] aVarArr3 = (C12702a[]) this.f33100n.getAndSet(aVarArr2);
                if (aVarArr3 != f33090v) {
                    for (C12702a<?, ?> a : aVarArr3) {
                        a.mo36833a();
                    }
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo36837a(C12702a<T, U> aVar) {
            C12702a<?, ?>[] aVarArr;
            C12702a[] aVarArr2;
            do {
                aVarArr = (C12702a[]) this.f33100n.get();
                if (aVarArr == f33090v) {
                    aVar.mo36833a();
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new C12702a[(length + 1)];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!this.f33100n.compareAndSet(aVarArr, aVarArr2));
            return true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo36838a(Callable<? extends U> callable) {
            try {
                Object call = callable.call();
                if (call == null) {
                    return true;
                }
                if (get() != 0 || !compareAndSet(0, 1)) {
                    SimplePlainQueue<U> simplePlainQueue = this.f33096j;
                    if (simplePlainQueue == null) {
                        int i = this.f33094h;
                        if (i == Integer.MAX_VALUE) {
                            simplePlainQueue = new C12449c<>(this.f33095i);
                        } else {
                            simplePlainQueue = new C12448b<>(i);
                        }
                        this.f33096j = simplePlainQueue;
                    }
                    if (!simplePlainQueue.offer(call)) {
                        onError(new IllegalStateException("Scalar queue full?!"));
                        return true;
                    } else if (getAndIncrement() != 0) {
                        return false;
                    }
                } else {
                    this.f33091e.onNext(call);
                    if (decrementAndGet() == 0) {
                        return true;
                    }
                }
                mo36842d();
                return true;
            } catch (Throwable th) {
                C12285a.m32748b(th);
                this.f33098l.mo36929a(th);
                mo36841c();
                return true;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo36835a(U u, C12702a<T, U> aVar) {
            if (get() != 0 || !compareAndSet(0, 1)) {
                SimpleQueue simpleQueue = aVar.f33087h;
                if (simpleQueue == null) {
                    simpleQueue = new C12449c(this.f33095i);
                    aVar.f33087h = simpleQueue;
                }
                simpleQueue.offer(u);
                if (getAndIncrement() != 0) {
                    return;
                }
            } else {
                this.f33091e.onNext(u);
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            mo36842d();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo36836a() {
            if (this.f33099m) {
                return true;
            }
            Throwable th = (Throwable) this.f33098l.get();
            if (this.f33093g || th == null) {
                return false;
            }
            mo36840b();
            Throwable a = this.f33098l.mo36928a();
            if (a != C12757g.f33270a) {
                this.f33091e.onError(a);
            }
            return true;
        }
    }

    public C12701x(ObservableSource<T> observableSource, Function<? super T, ? extends ObservableSource<? extends U>> function, boolean z, int i, int i2) {
        super(observableSource);
        this.f33080f = function;
        this.f33081g = z;
        this.f33082h = i;
        this.f33083i = i2;
    }

    /* renamed from: a */
    public void mo35836a(Observer<? super U> observer) {
        if (!C12541a1.m33073a(this.f32549e, observer, this.f33080f)) {
            ObservableSource<T> observableSource = this.f32549e;
            C12703b bVar = new C12703b(observer, this.f33080f, this.f33081g, this.f33082h, this.f33083i);
            observableSource.subscribe(bVar);
        }
    }
}
