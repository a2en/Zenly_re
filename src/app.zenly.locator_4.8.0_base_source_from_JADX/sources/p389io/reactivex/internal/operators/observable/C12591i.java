package p389io.reactivex.internal.operators.observable;

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
import p389io.reactivex.internal.fuseable.SimpleQueue;
import p389io.reactivex.internal.util.C12752b;
import p389io.reactivex.internal.util.C12756f;
import p389io.reactivex.observers.C12800a;
import p389io.reactivex.p393i.p394a.C12324b;
import p389io.reactivex.p393i.p400c.C12449c;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.internal.operators.observable.i */
public final class C12591i<T, U> extends C12538a<T, U> {

    /* renamed from: f */
    final Function<? super T, ? extends ObservableSource<? extends U>> f32737f;

    /* renamed from: g */
    final int f32738g;

    /* renamed from: h */
    final C12756f f32739h;

    /* renamed from: io.reactivex.internal.operators.observable.i$a */
    static final class C12592a<T, R> extends AtomicInteger implements Observer<T>, Disposable {
        private static final long serialVersionUID = -6951100001833242599L;

        /* renamed from: e */
        final Observer<? super R> f32740e;

        /* renamed from: f */
        final Function<? super T, ? extends ObservableSource<? extends R>> f32741f;

        /* renamed from: g */
        final int f32742g;

        /* renamed from: h */
        final C12752b f32743h = new C12752b();

        /* renamed from: i */
        final C12593a<R> f32744i;

        /* renamed from: j */
        final boolean f32745j;

        /* renamed from: k */
        SimpleQueue<T> f32746k;

        /* renamed from: l */
        Disposable f32747l;

        /* renamed from: m */
        volatile boolean f32748m;

        /* renamed from: n */
        volatile boolean f32749n;

        /* renamed from: o */
        volatile boolean f32750o;

        /* renamed from: p */
        int f32751p;

        /* renamed from: io.reactivex.internal.operators.observable.i$a$a */
        static final class C12593a<R> extends AtomicReference<Disposable> implements Observer<R> {
            private static final long serialVersionUID = 2620149119579502636L;

            /* renamed from: e */
            final Observer<? super R> f32752e;

            /* renamed from: f */
            final C12592a<?, R> f32753f;

            C12593a(Observer<? super R> observer, C12592a<?, R> aVar) {
                this.f32752e = observer;
                this.f32753f = aVar;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public void mo36759a() {
                C12458b.m32975a((AtomicReference<Disposable>) this);
            }

            public void onComplete() {
                C12592a<?, R> aVar = this.f32753f;
                aVar.f32748m = false;
                aVar.mo36758a();
            }

            public void onError(Throwable th) {
                C12592a<?, R> aVar = this.f32753f;
                if (aVar.f32743h.mo36929a(th)) {
                    if (!aVar.f32745j) {
                        aVar.f32747l.dispose();
                    }
                    aVar.f32748m = false;
                    aVar.mo36758a();
                    return;
                }
                C12768a.m33415b(th);
            }

            public void onNext(R r) {
                this.f32752e.onNext(r);
            }

            public void onSubscribe(Disposable disposable) {
                C12458b.m32976a((AtomicReference<Disposable>) this, disposable);
            }
        }

        C12592a(Observer<? super R> observer, Function<? super T, ? extends ObservableSource<? extends R>> function, int i, boolean z) {
            this.f32740e = observer;
            this.f32741f = function;
            this.f32742g = i;
            this.f32745j = z;
            this.f32744i = new C12593a<>(observer, this);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo36758a() {
            if (getAndIncrement() == 0) {
                Observer<? super R> observer = this.f32740e;
                SimpleQueue<T> simpleQueue = this.f32746k;
                C12752b bVar = this.f32743h;
                while (true) {
                    if (!this.f32748m) {
                        if (this.f32750o) {
                            simpleQueue.clear();
                            return;
                        } else if (this.f32745j || ((Throwable) bVar.get()) == null) {
                            boolean z = this.f32749n;
                            try {
                                Object poll = simpleQueue.poll();
                                boolean z2 = poll == null;
                                if (z && z2) {
                                    this.f32750o = true;
                                    Throwable a = bVar.mo36928a();
                                    if (a != null) {
                                        observer.onError(a);
                                    } else {
                                        observer.onComplete();
                                    }
                                    return;
                                } else if (!z2) {
                                    try {
                                        Object apply = this.f32741f.apply(poll);
                                        C12324b.m32836a(apply, "The mapper returned a null ObservableSource");
                                        ObservableSource observableSource = (ObservableSource) apply;
                                        if (observableSource instanceof Callable) {
                                            try {
                                                Object call = ((Callable) observableSource).call();
                                                if (call != null && !this.f32750o) {
                                                    observer.onNext(call);
                                                }
                                            } catch (Throwable th) {
                                                C12285a.m32748b(th);
                                                bVar.mo36929a(th);
                                            }
                                        } else {
                                            this.f32748m = true;
                                            observableSource.subscribe(this.f32744i);
                                        }
                                    } catch (Throwable th2) {
                                        C12285a.m32748b(th2);
                                        this.f32750o = true;
                                        this.f32747l.dispose();
                                        simpleQueue.clear();
                                        bVar.mo36929a(th2);
                                        observer.onError(bVar.mo36928a());
                                        return;
                                    }
                                }
                            } catch (Throwable th3) {
                                C12285a.m32748b(th3);
                                this.f32750o = true;
                                this.f32747l.dispose();
                                bVar.mo36929a(th3);
                                observer.onError(bVar.mo36928a());
                                return;
                            }
                        } else {
                            simpleQueue.clear();
                            this.f32750o = true;
                            observer.onError(bVar.mo36928a());
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        public void dispose() {
            this.f32750o = true;
            this.f32747l.dispose();
            this.f32744i.mo36759a();
        }

        public boolean isDisposed() {
            return this.f32750o;
        }

        public void onComplete() {
            this.f32749n = true;
            mo36758a();
        }

        public void onError(Throwable th) {
            if (this.f32743h.mo36929a(th)) {
                this.f32749n = true;
                mo36758a();
                return;
            }
            C12768a.m33415b(th);
        }

        public void onNext(T t) {
            if (this.f32751p == 0) {
                this.f32746k.offer(t);
            }
            mo36758a();
        }

        public void onSubscribe(Disposable disposable) {
            if (C12458b.m32974a(this.f32747l, disposable)) {
                this.f32747l = disposable;
                if (disposable instanceof QueueDisposable) {
                    QueueDisposable queueDisposable = (QueueDisposable) disposable;
                    int requestFusion = queueDisposable.requestFusion(3);
                    if (requestFusion == 1) {
                        this.f32751p = requestFusion;
                        this.f32746k = queueDisposable;
                        this.f32749n = true;
                        this.f32740e.onSubscribe(this);
                        mo36758a();
                        return;
                    } else if (requestFusion == 2) {
                        this.f32751p = requestFusion;
                        this.f32746k = queueDisposable;
                        this.f32740e.onSubscribe(this);
                        return;
                    }
                }
                this.f32746k = new C12449c(this.f32742g);
                this.f32740e.onSubscribe(this);
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.i$b */
    static final class C12594b<T, U> extends AtomicInteger implements Observer<T>, Disposable {
        private static final long serialVersionUID = 8828587559905699186L;

        /* renamed from: e */
        final Observer<? super U> f32754e;

        /* renamed from: f */
        final Function<? super T, ? extends ObservableSource<? extends U>> f32755f;

        /* renamed from: g */
        final C12595a<U> f32756g;

        /* renamed from: h */
        final int f32757h;

        /* renamed from: i */
        SimpleQueue<T> f32758i;

        /* renamed from: j */
        Disposable f32759j;

        /* renamed from: k */
        volatile boolean f32760k;

        /* renamed from: l */
        volatile boolean f32761l;

        /* renamed from: m */
        volatile boolean f32762m;

        /* renamed from: n */
        int f32763n;

        /* renamed from: io.reactivex.internal.operators.observable.i$b$a */
        static final class C12595a<U> extends AtomicReference<Disposable> implements Observer<U> {
            private static final long serialVersionUID = -7449079488798789337L;

            /* renamed from: e */
            final Observer<? super U> f32764e;

            /* renamed from: f */
            final C12594b<?, ?> f32765f;

            C12595a(Observer<? super U> observer, C12594b<?, ?> bVar) {
                this.f32764e = observer;
                this.f32765f = bVar;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public void mo36762a() {
                C12458b.m32975a((AtomicReference<Disposable>) this);
            }

            public void onComplete() {
                this.f32765f.mo36761b();
            }

            public void onError(Throwable th) {
                this.f32765f.dispose();
                this.f32764e.onError(th);
            }

            public void onNext(U u) {
                this.f32764e.onNext(u);
            }

            public void onSubscribe(Disposable disposable) {
                C12458b.m32976a((AtomicReference<Disposable>) this, disposable);
            }
        }

        C12594b(Observer<? super U> observer, Function<? super T, ? extends ObservableSource<? extends U>> function, int i) {
            this.f32754e = observer;
            this.f32755f = function;
            this.f32757h = i;
            this.f32756g = new C12595a<>(observer, this);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo36760a() {
            if (getAndIncrement() == 0) {
                while (!this.f32761l) {
                    if (!this.f32760k) {
                        boolean z = this.f32762m;
                        try {
                            Object poll = this.f32758i.poll();
                            boolean z2 = poll == null;
                            if (z && z2) {
                                this.f32761l = true;
                                this.f32754e.onComplete();
                                return;
                            } else if (!z2) {
                                try {
                                    Object apply = this.f32755f.apply(poll);
                                    C12324b.m32836a(apply, "The mapper returned a null ObservableSource");
                                    ObservableSource observableSource = (ObservableSource) apply;
                                    this.f32760k = true;
                                    observableSource.subscribe(this.f32756g);
                                } catch (Throwable th) {
                                    C12285a.m32748b(th);
                                    dispose();
                                    this.f32758i.clear();
                                    this.f32754e.onError(th);
                                    return;
                                }
                            }
                        } catch (Throwable th2) {
                            C12285a.m32748b(th2);
                            dispose();
                            this.f32758i.clear();
                            this.f32754e.onError(th2);
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
                this.f32758i.clear();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo36761b() {
            this.f32760k = false;
            mo36760a();
        }

        public void dispose() {
            this.f32761l = true;
            this.f32756g.mo36762a();
            this.f32759j.dispose();
            if (getAndIncrement() == 0) {
                this.f32758i.clear();
            }
        }

        public boolean isDisposed() {
            return this.f32761l;
        }

        public void onComplete() {
            if (!this.f32762m) {
                this.f32762m = true;
                mo36760a();
            }
        }

        public void onError(Throwable th) {
            if (this.f32762m) {
                C12768a.m33415b(th);
                return;
            }
            this.f32762m = true;
            dispose();
            this.f32754e.onError(th);
        }

        public void onNext(T t) {
            if (!this.f32762m) {
                if (this.f32763n == 0) {
                    this.f32758i.offer(t);
                }
                mo36760a();
            }
        }

        public void onSubscribe(Disposable disposable) {
            if (C12458b.m32974a(this.f32759j, disposable)) {
                this.f32759j = disposable;
                if (disposable instanceof QueueDisposable) {
                    QueueDisposable queueDisposable = (QueueDisposable) disposable;
                    int requestFusion = queueDisposable.requestFusion(3);
                    if (requestFusion == 1) {
                        this.f32763n = requestFusion;
                        this.f32758i = queueDisposable;
                        this.f32762m = true;
                        this.f32754e.onSubscribe(this);
                        mo36760a();
                        return;
                    } else if (requestFusion == 2) {
                        this.f32763n = requestFusion;
                        this.f32758i = queueDisposable;
                        this.f32754e.onSubscribe(this);
                        return;
                    }
                }
                this.f32758i = new C12449c(this.f32757h);
                this.f32754e.onSubscribe(this);
            }
        }
    }

    public C12591i(ObservableSource<T> observableSource, Function<? super T, ? extends ObservableSource<? extends U>> function, int i, C12756f fVar) {
        super(observableSource);
        this.f32737f = function;
        this.f32739h = fVar;
        this.f32738g = Math.max(8, i);
    }

    /* renamed from: a */
    public void mo35836a(Observer<? super U> observer) {
        if (!C12541a1.m33073a(this.f32549e, observer, this.f32737f)) {
            C12756f fVar = this.f32739h;
            if (fVar == C12756f.IMMEDIATE) {
                this.f32549e.subscribe(new C12594b(new C12800a(observer), this.f32737f, this.f32738g));
            } else {
                this.f32549e.subscribe(new C12592a(observer, this.f32737f, this.f32738g, fVar == C12756f.END));
            }
        }
    }
}
