package p389io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p389io.reactivex.C12279e;
import p389io.reactivex.MaybeObserver;
import p389io.reactivex.MaybeSource;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.Observer;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.functions.Function;
import p389io.reactivex.internal.disposables.C12458b;
import p389io.reactivex.internal.util.C12752b;
import p389io.reactivex.p393i.p394a.C12324b;
import p389io.reactivex.p393i.p400c.C12449c;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.internal.operators.observable.y */
public final class C12706y<T, R> extends C12538a<T, R> {

    /* renamed from: f */
    final Function<? super T, ? extends MaybeSource<? extends R>> f33113f;

    /* renamed from: g */
    final boolean f33114g;

    /* renamed from: io.reactivex.internal.operators.observable.y$a */
    static final class C12707a<T, R> extends AtomicInteger implements Observer<T>, Disposable {
        private static final long serialVersionUID = 8600231336733376951L;

        /* renamed from: e */
        final Observer<? super R> f33115e;

        /* renamed from: f */
        final boolean f33116f;

        /* renamed from: g */
        final C12275b f33117g = new C12275b();

        /* renamed from: h */
        final AtomicInteger f33118h = new AtomicInteger(1);

        /* renamed from: i */
        final C12752b f33119i = new C12752b();

        /* renamed from: j */
        final Function<? super T, ? extends MaybeSource<? extends R>> f33120j;

        /* renamed from: k */
        final AtomicReference<C12449c<R>> f33121k = new AtomicReference<>();

        /* renamed from: l */
        Disposable f33122l;

        /* renamed from: m */
        volatile boolean f33123m;

        /* renamed from: io.reactivex.internal.operators.observable.y$a$a */
        final class C12708a extends AtomicReference<Disposable> implements MaybeObserver<R>, Disposable {
            private static final long serialVersionUID = -502562646270949838L;

            C12708a() {
            }

            public void dispose() {
                C12458b.m32975a((AtomicReference<Disposable>) this);
            }

            public boolean isDisposed() {
                return C12458b.m32973a((Disposable) get());
            }

            public void onComplete() {
                C12707a.this.mo36845a(this);
            }

            public void onError(Throwable th) {
                C12707a.this.mo36847a(this, th);
            }

            public void onSubscribe(Disposable disposable) {
                C12458b.m32978c(this, disposable);
            }

            public void onSuccess(R r) {
                C12707a.this.mo36846a(this, r);
            }
        }

        C12707a(Observer<? super R> observer, Function<? super T, ? extends MaybeSource<? extends R>> function, boolean z) {
            this.f33115e = observer;
            this.f33120j = function;
            this.f33116f = z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo36846a(C12708a aVar, R r) {
            this.f33117g.delete(aVar);
            if (get() == 0) {
                boolean z = true;
                if (compareAndSet(0, 1)) {
                    this.f33115e.onNext(r);
                    if (this.f33118h.decrementAndGet() != 0) {
                        z = false;
                    }
                    C12449c cVar = (C12449c) this.f33121k.get();
                    if (!z || (cVar != null && !cVar.isEmpty())) {
                        if (decrementAndGet() == 0) {
                            return;
                        }
                        mo36849c();
                    }
                    Throwable a = this.f33119i.mo36928a();
                    if (a != null) {
                        this.f33115e.onError(a);
                    } else {
                        this.f33115e.onComplete();
                    }
                    return;
                }
            }
            C12449c d = mo36850d();
            synchronized (d) {
                d.offer(r);
            }
            this.f33118h.decrementAndGet();
            if (getAndIncrement() != 0) {
                return;
            }
            mo36849c();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo36848b() {
            if (getAndIncrement() == 0) {
                mo36849c();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo36849c() {
            Observer<? super R> observer = this.f33115e;
            AtomicInteger atomicInteger = this.f33118h;
            AtomicReference<C12449c<R>> atomicReference = this.f33121k;
            int i = 1;
            while (!this.f33123m) {
                if (this.f33116f || ((Throwable) this.f33119i.get()) == null) {
                    boolean z = false;
                    boolean z2 = atomicInteger.get() == 0;
                    C12449c cVar = (C12449c) atomicReference.get();
                    Object poll = cVar != null ? cVar.poll() : null;
                    if (poll == null) {
                        z = true;
                    }
                    if (z2 && z) {
                        Throwable a = this.f33119i.mo36928a();
                        if (a != null) {
                            observer.onError(a);
                        } else {
                            observer.onComplete();
                        }
                        return;
                    } else if (z) {
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        observer.onNext(poll);
                    }
                } else {
                    Throwable a2 = this.f33119i.mo36928a();
                    mo36844a();
                    observer.onError(a2);
                    return;
                }
            }
            mo36844a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public C12449c<R> mo36850d() {
            C12449c<R> cVar;
            do {
                C12449c<R> cVar2 = (C12449c) this.f33121k.get();
                if (cVar2 != null) {
                    return cVar2;
                }
                cVar = new C12449c<>(C12279e.m32632p());
            } while (!this.f33121k.compareAndSet(null, cVar));
            return cVar;
        }

        public void dispose() {
            this.f33123m = true;
            this.f33122l.dispose();
            this.f33117g.dispose();
        }

        public boolean isDisposed() {
            return this.f33123m;
        }

        public void onComplete() {
            this.f33118h.decrementAndGet();
            mo36848b();
        }

        public void onError(Throwable th) {
            this.f33118h.decrementAndGet();
            if (this.f33119i.mo36929a(th)) {
                if (!this.f33116f) {
                    this.f33117g.dispose();
                }
                mo36848b();
                return;
            }
            C12768a.m33415b(th);
        }

        public void onNext(T t) {
            try {
                Object apply = this.f33120j.apply(t);
                C12324b.m32836a(apply, "The mapper returned a null MaybeSource");
                MaybeSource maybeSource = (MaybeSource) apply;
                this.f33118h.getAndIncrement();
                C12708a aVar = new C12708a();
                if (!this.f33123m && this.f33117g.add(aVar)) {
                    maybeSource.subscribe(aVar);
                }
            } catch (Throwable th) {
                C12285a.m32748b(th);
                this.f33122l.dispose();
                onError(th);
            }
        }

        public void onSubscribe(Disposable disposable) {
            if (C12458b.m32974a(this.f33122l, disposable)) {
                this.f33122l = disposable;
                this.f33115e.onSubscribe(this);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo36847a(C12708a aVar, Throwable th) {
            this.f33117g.delete(aVar);
            if (this.f33119i.mo36929a(th)) {
                if (!this.f33116f) {
                    this.f33122l.dispose();
                    this.f33117g.dispose();
                }
                this.f33118h.decrementAndGet();
                mo36848b();
                return;
            }
            C12768a.m33415b(th);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo36845a(C12708a aVar) {
            this.f33117g.delete(aVar);
            if (get() == 0) {
                boolean z = true;
                if (compareAndSet(0, 1)) {
                    if (this.f33118h.decrementAndGet() != 0) {
                        z = false;
                    }
                    C12449c cVar = (C12449c) this.f33121k.get();
                    if (z && (cVar == null || cVar.isEmpty())) {
                        Throwable a = this.f33119i.mo36928a();
                        if (a != null) {
                            this.f33115e.onError(a);
                        } else {
                            this.f33115e.onComplete();
                        }
                        return;
                    } else if (decrementAndGet() != 0) {
                        mo36849c();
                    } else {
                        return;
                    }
                }
            }
            this.f33118h.decrementAndGet();
            mo36848b();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo36844a() {
            C12449c cVar = (C12449c) this.f33121k.get();
            if (cVar != null) {
                cVar.clear();
            }
        }
    }

    public C12706y(ObservableSource<T> observableSource, Function<? super T, ? extends MaybeSource<? extends R>> function, boolean z) {
        super(observableSource);
        this.f33113f = function;
        this.f33114g = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo35836a(Observer<? super R> observer) {
        this.f32549e.subscribe(new C12707a(observer, this.f33113f, this.f33114g));
    }
}
