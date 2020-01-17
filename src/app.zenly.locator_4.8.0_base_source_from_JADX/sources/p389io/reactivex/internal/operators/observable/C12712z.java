package p389io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p389io.reactivex.C12279e;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.Observer;
import p389io.reactivex.SingleObserver;
import p389io.reactivex.SingleSource;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.functions.Function;
import p389io.reactivex.internal.disposables.C12458b;
import p389io.reactivex.internal.util.C12752b;
import p389io.reactivex.p393i.p394a.C12324b;
import p389io.reactivex.p393i.p400c.C12449c;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.internal.operators.observable.z */
public final class C12712z<T, R> extends C12538a<T, R> {

    /* renamed from: f */
    final Function<? super T, ? extends SingleSource<? extends R>> f33135f;

    /* renamed from: g */
    final boolean f33136g;

    /* renamed from: io.reactivex.internal.operators.observable.z$a */
    static final class C12713a<T, R> extends AtomicInteger implements Observer<T>, Disposable {
        private static final long serialVersionUID = 8600231336733376951L;

        /* renamed from: e */
        final Observer<? super R> f33137e;

        /* renamed from: f */
        final boolean f33138f;

        /* renamed from: g */
        final C12275b f33139g = new C12275b();

        /* renamed from: h */
        final AtomicInteger f33140h = new AtomicInteger(1);

        /* renamed from: i */
        final C12752b f33141i = new C12752b();

        /* renamed from: j */
        final Function<? super T, ? extends SingleSource<? extends R>> f33142j;

        /* renamed from: k */
        final AtomicReference<C12449c<R>> f33143k = new AtomicReference<>();

        /* renamed from: l */
        Disposable f33144l;

        /* renamed from: m */
        volatile boolean f33145m;

        /* renamed from: io.reactivex.internal.operators.observable.z$a$a */
        final class C12714a extends AtomicReference<Disposable> implements SingleObserver<R>, Disposable {
            private static final long serialVersionUID = -502562646270949838L;

            C12714a() {
            }

            public void dispose() {
                C12458b.m32975a((AtomicReference<Disposable>) this);
            }

            public boolean isDisposed() {
                return C12458b.m32973a((Disposable) get());
            }

            public void onError(Throwable th) {
                C12713a.this.mo36857a(this, th);
            }

            public void onSubscribe(Disposable disposable) {
                C12458b.m32978c(this, disposable);
            }

            public void onSuccess(R r) {
                C12713a.this.mo36856a(this, r);
            }
        }

        C12713a(Observer<? super R> observer, Function<? super T, ? extends SingleSource<? extends R>> function, boolean z) {
            this.f33137e = observer;
            this.f33142j = function;
            this.f33138f = z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo36856a(C12714a aVar, R r) {
            this.f33139g.delete(aVar);
            if (get() == 0) {
                boolean z = true;
                if (compareAndSet(0, 1)) {
                    this.f33137e.onNext(r);
                    if (this.f33140h.decrementAndGet() != 0) {
                        z = false;
                    }
                    C12449c cVar = (C12449c) this.f33143k.get();
                    if (!z || (cVar != null && !cVar.isEmpty())) {
                        if (decrementAndGet() == 0) {
                            return;
                        }
                        mo36859c();
                    }
                    Throwable a = this.f33141i.mo36928a();
                    if (a != null) {
                        this.f33137e.onError(a);
                    } else {
                        this.f33137e.onComplete();
                    }
                    return;
                }
            }
            C12449c d = mo36860d();
            synchronized (d) {
                d.offer(r);
            }
            this.f33140h.decrementAndGet();
            if (getAndIncrement() != 0) {
                return;
            }
            mo36859c();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo36858b() {
            if (getAndIncrement() == 0) {
                mo36859c();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo36859c() {
            Observer<? super R> observer = this.f33137e;
            AtomicInteger atomicInteger = this.f33140h;
            AtomicReference<C12449c<R>> atomicReference = this.f33143k;
            int i = 1;
            while (!this.f33145m) {
                if (this.f33138f || ((Throwable) this.f33141i.get()) == null) {
                    boolean z = false;
                    boolean z2 = atomicInteger.get() == 0;
                    C12449c cVar = (C12449c) atomicReference.get();
                    Object poll = cVar != null ? cVar.poll() : null;
                    if (poll == null) {
                        z = true;
                    }
                    if (z2 && z) {
                        Throwable a = this.f33141i.mo36928a();
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
                    Throwable a2 = this.f33141i.mo36928a();
                    mo36855a();
                    observer.onError(a2);
                    return;
                }
            }
            mo36855a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public C12449c<R> mo36860d() {
            C12449c<R> cVar;
            do {
                C12449c<R> cVar2 = (C12449c) this.f33143k.get();
                if (cVar2 != null) {
                    return cVar2;
                }
                cVar = new C12449c<>(C12279e.m32632p());
            } while (!this.f33143k.compareAndSet(null, cVar));
            return cVar;
        }

        public void dispose() {
            this.f33145m = true;
            this.f33144l.dispose();
            this.f33139g.dispose();
        }

        public boolean isDisposed() {
            return this.f33145m;
        }

        public void onComplete() {
            this.f33140h.decrementAndGet();
            mo36858b();
        }

        public void onError(Throwable th) {
            this.f33140h.decrementAndGet();
            if (this.f33141i.mo36929a(th)) {
                if (!this.f33138f) {
                    this.f33139g.dispose();
                }
                mo36858b();
                return;
            }
            C12768a.m33415b(th);
        }

        public void onNext(T t) {
            try {
                Object apply = this.f33142j.apply(t);
                C12324b.m32836a(apply, "The mapper returned a null SingleSource");
                SingleSource singleSource = (SingleSource) apply;
                this.f33140h.getAndIncrement();
                C12714a aVar = new C12714a();
                if (!this.f33145m && this.f33139g.add(aVar)) {
                    singleSource.subscribe(aVar);
                }
            } catch (Throwable th) {
                C12285a.m32748b(th);
                this.f33144l.dispose();
                onError(th);
            }
        }

        public void onSubscribe(Disposable disposable) {
            if (C12458b.m32974a(this.f33144l, disposable)) {
                this.f33144l = disposable;
                this.f33137e.onSubscribe(this);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo36857a(C12714a aVar, Throwable th) {
            this.f33139g.delete(aVar);
            if (this.f33141i.mo36929a(th)) {
                if (!this.f33138f) {
                    this.f33144l.dispose();
                    this.f33139g.dispose();
                }
                this.f33140h.decrementAndGet();
                mo36858b();
                return;
            }
            C12768a.m33415b(th);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo36855a() {
            C12449c cVar = (C12449c) this.f33143k.get();
            if (cVar != null) {
                cVar.clear();
            }
        }
    }

    public C12712z(ObservableSource<T> observableSource, Function<? super T, ? extends SingleSource<? extends R>> function, boolean z) {
        super(observableSource);
        this.f33135f = function;
        this.f33136g = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo35836a(Observer<? super R> observer) {
        this.f32549e.subscribe(new C12713a(observer, this.f33135f, this.f33136g));
    }
}
