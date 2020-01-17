package p389io.reactivex.p393i.p395b.p398c;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p389io.reactivex.C12279e;
import p389io.reactivex.Observer;
import p389io.reactivex.SingleObserver;
import p389io.reactivex.SingleSource;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.functions.Function;
import p389io.reactivex.internal.disposables.C12458b;
import p389io.reactivex.internal.util.C12752b;
import p389io.reactivex.p393i.p394a.C12324b;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.i.b.c.c */
public final class C12393c<T, R> extends C12279e<R> {

    /* renamed from: e */
    final C12279e<T> f32159e;

    /* renamed from: f */
    final Function<? super T, ? extends SingleSource<? extends R>> f32160f;

    /* renamed from: g */
    final boolean f32161g;

    /* renamed from: io.reactivex.i.b.c.c$a */
    static final class C12394a<T, R> extends AtomicInteger implements Observer<T>, Disposable {

        /* renamed from: m */
        static final C12395a<Object> f32162m = new C12395a<>(null);
        private static final long serialVersionUID = -5402190102429853762L;

        /* renamed from: e */
        final Observer<? super R> f32163e;

        /* renamed from: f */
        final Function<? super T, ? extends SingleSource<? extends R>> f32164f;

        /* renamed from: g */
        final boolean f32165g;

        /* renamed from: h */
        final C12752b f32166h = new C12752b();

        /* renamed from: i */
        final AtomicReference<C12395a<R>> f32167i = new AtomicReference<>();

        /* renamed from: j */
        Disposable f32168j;

        /* renamed from: k */
        volatile boolean f32169k;

        /* renamed from: l */
        volatile boolean f32170l;

        /* renamed from: io.reactivex.i.b.c.c$a$a */
        static final class C12395a<R> extends AtomicReference<Disposable> implements SingleObserver<R> {
            private static final long serialVersionUID = 8042919737683345351L;

            /* renamed from: e */
            final C12394a<?, R> f32171e;

            /* renamed from: f */
            volatile R f32172f;

            C12395a(C12394a<?, R> aVar) {
                this.f32171e = aVar;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public void mo36610a() {
                C12458b.m32975a((AtomicReference<Disposable>) this);
            }

            public void onError(Throwable th) {
                this.f32171e.mo36608a(this, th);
            }

            public void onSubscribe(Disposable disposable) {
                C12458b.m32978c(this, disposable);
            }

            public void onSuccess(R r) {
                this.f32172f = r;
                this.f32171e.mo36609b();
            }
        }

        C12394a(Observer<? super R> observer, Function<? super T, ? extends SingleSource<? extends R>> function, boolean z) {
            this.f32163e = observer;
            this.f32164f = function;
            this.f32165g = z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo36607a() {
            C12395a<Object> aVar = (C12395a) this.f32167i.getAndSet(f32162m);
            if (aVar != null && aVar != f32162m) {
                aVar.mo36610a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo36609b() {
            if (getAndIncrement() == 0) {
                Observer<? super R> observer = this.f32163e;
                C12752b bVar = this.f32166h;
                AtomicReference<C12395a<R>> atomicReference = this.f32167i;
                int i = 1;
                while (!this.f32170l) {
                    if (bVar.get() == null || this.f32165g) {
                        boolean z = this.f32169k;
                        C12395a aVar = (C12395a) atomicReference.get();
                        boolean z2 = aVar == null;
                        if (z && z2) {
                            Throwable a = bVar.mo36928a();
                            if (a != null) {
                                observer.onError(a);
                            } else {
                                observer.onComplete();
                            }
                            return;
                        } else if (z2 || aVar.f32172f == null) {
                            i = addAndGet(-i);
                            if (i == 0) {
                                return;
                            }
                        } else {
                            atomicReference.compareAndSet(aVar, null);
                            observer.onNext(aVar.f32172f);
                        }
                    } else {
                        observer.onError(bVar.mo36928a());
                        return;
                    }
                }
            }
        }

        public void dispose() {
            this.f32170l = true;
            this.f32168j.dispose();
            mo36607a();
        }

        public boolean isDisposed() {
            return this.f32170l;
        }

        public void onComplete() {
            this.f32169k = true;
            mo36609b();
        }

        public void onError(Throwable th) {
            if (this.f32166h.mo36929a(th)) {
                if (!this.f32165g) {
                    mo36607a();
                }
                this.f32169k = true;
                mo36609b();
                return;
            }
            C12768a.m33415b(th);
        }

        public void onNext(T t) {
            C12395a aVar = (C12395a) this.f32167i.get();
            if (aVar != null) {
                aVar.mo36610a();
            }
            try {
                Object apply = this.f32164f.apply(t);
                C12324b.m32836a(apply, "The mapper returned a null SingleSource");
                SingleSource singleSource = (SingleSource) apply;
                C12395a aVar2 = new C12395a(this);
                while (true) {
                    C12395a<Object> aVar3 = (C12395a) this.f32167i.get();
                    if (aVar3 != f32162m) {
                        if (this.f32167i.compareAndSet(aVar3, aVar2)) {
                            singleSource.subscribe(aVar2);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            } catch (Throwable th) {
                C12285a.m32748b(th);
                this.f32168j.dispose();
                this.f32167i.getAndSet(f32162m);
                onError(th);
            }
        }

        public void onSubscribe(Disposable disposable) {
            if (C12458b.m32974a(this.f32168j, disposable)) {
                this.f32168j = disposable;
                this.f32163e.onSubscribe(this);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo36608a(C12395a<R> aVar, Throwable th) {
            if (!this.f32167i.compareAndSet(aVar, null) || !this.f32166h.mo36929a(th)) {
                C12768a.m33415b(th);
                return;
            }
            if (!this.f32165g) {
                this.f32168j.dispose();
                mo36607a();
            }
            mo36609b();
        }
    }

    public C12393c(C12279e<T> eVar, Function<? super T, ? extends SingleSource<? extends R>> function, boolean z) {
        this.f32159e = eVar;
        this.f32160f = function;
        this.f32161g = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo35836a(Observer<? super R> observer) {
        if (!C12396d.m32890a(this.f32159e, this.f32160f, observer)) {
            this.f32159e.subscribe(new C12394a(observer, this.f32160f, this.f32161g));
        }
    }
}
