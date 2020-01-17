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
import p389io.reactivex.internal.fuseable.SimplePlainQueue;
import p389io.reactivex.internal.util.C12752b;
import p389io.reactivex.internal.util.C12756f;
import p389io.reactivex.p393i.p394a.C12324b;
import p389io.reactivex.p393i.p400c.C12449c;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.i.b.c.b */
public final class C12390b<T, R> extends C12279e<R> {

    /* renamed from: e */
    final C12279e<T> f32143e;

    /* renamed from: f */
    final Function<? super T, ? extends SingleSource<? extends R>> f32144f;

    /* renamed from: g */
    final C12756f f32145g;

    /* renamed from: h */
    final int f32146h;

    /* renamed from: io.reactivex.i.b.c.b$a */
    static final class C12391a<T, R> extends AtomicInteger implements Observer<T>, Disposable {
        private static final long serialVersionUID = -9140123220065488293L;

        /* renamed from: e */
        final Observer<? super R> f32147e;

        /* renamed from: f */
        final Function<? super T, ? extends SingleSource<? extends R>> f32148f;

        /* renamed from: g */
        final C12752b f32149g = new C12752b();

        /* renamed from: h */
        final C12392a<R> f32150h = new C12392a<>(this);

        /* renamed from: i */
        final SimplePlainQueue<T> f32151i;

        /* renamed from: j */
        final C12756f f32152j;

        /* renamed from: k */
        Disposable f32153k;

        /* renamed from: l */
        volatile boolean f32154l;

        /* renamed from: m */
        volatile boolean f32155m;

        /* renamed from: n */
        R f32156n;

        /* renamed from: o */
        volatile int f32157o;

        /* renamed from: io.reactivex.i.b.c.b$a$a */
        static final class C12392a<R> extends AtomicReference<Disposable> implements SingleObserver<R> {
            private static final long serialVersionUID = -3051469169682093892L;

            /* renamed from: e */
            final C12391a<?, R> f32158e;

            C12392a(C12391a<?, R> aVar) {
                this.f32158e = aVar;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public void mo36606a() {
                C12458b.m32975a((AtomicReference<Disposable>) this);
            }

            public void onError(Throwable th) {
                this.f32158e.mo36605a(th);
            }

            public void onSubscribe(Disposable disposable) {
                C12458b.m32976a((AtomicReference<Disposable>) this, disposable);
            }

            public void onSuccess(R r) {
                this.f32158e.mo36604a(r);
            }
        }

        C12391a(Observer<? super R> observer, Function<? super T, ? extends SingleSource<? extends R>> function, int i, C12756f fVar) {
            this.f32147e = observer;
            this.f32148f = function;
            this.f32152j = fVar;
            this.f32151i = new C12449c(i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo36604a(R r) {
            this.f32156n = r;
            this.f32157o = 2;
            mo36603a();
        }

        public void dispose() {
            this.f32155m = true;
            this.f32153k.dispose();
            this.f32150h.mo36606a();
            if (getAndIncrement() == 0) {
                this.f32151i.clear();
                this.f32156n = null;
            }
        }

        public boolean isDisposed() {
            return this.f32155m;
        }

        public void onComplete() {
            this.f32154l = true;
            mo36603a();
        }

        public void onError(Throwable th) {
            if (this.f32149g.mo36929a(th)) {
                if (this.f32152j == C12756f.IMMEDIATE) {
                    this.f32150h.mo36606a();
                }
                this.f32154l = true;
                mo36603a();
                return;
            }
            C12768a.m33415b(th);
        }

        public void onNext(T t) {
            this.f32151i.offer(t);
            mo36603a();
        }

        public void onSubscribe(Disposable disposable) {
            if (C12458b.m32974a(this.f32153k, disposable)) {
                this.f32153k = disposable;
                this.f32147e.onSubscribe(this);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo36605a(Throwable th) {
            if (this.f32149g.mo36929a(th)) {
                if (this.f32152j != C12756f.END) {
                    this.f32153k.dispose();
                }
                this.f32157o = 0;
                mo36603a();
                return;
            }
            C12768a.m33415b(th);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo36603a() {
            if (getAndIncrement() == 0) {
                Observer<? super R> observer = this.f32147e;
                C12756f fVar = this.f32152j;
                SimplePlainQueue<T> simplePlainQueue = this.f32151i;
                C12752b bVar = this.f32149g;
                int i = 1;
                while (true) {
                    if (this.f32155m) {
                        simplePlainQueue.clear();
                        this.f32156n = null;
                    } else {
                        int i2 = this.f32157o;
                        if (bVar.get() == null || !(fVar == C12756f.IMMEDIATE || (fVar == C12756f.BOUNDARY && i2 == 0))) {
                            boolean z = false;
                            if (i2 == 0) {
                                boolean z2 = this.f32154l;
                                Object poll = simplePlainQueue.poll();
                                if (poll == null) {
                                    z = true;
                                }
                                if (z2 && z) {
                                    Throwable a = bVar.mo36928a();
                                    if (a == null) {
                                        observer.onComplete();
                                    } else {
                                        observer.onError(a);
                                    }
                                    return;
                                } else if (!z) {
                                    try {
                                        Object apply = this.f32148f.apply(poll);
                                        C12324b.m32836a(apply, "The mapper returned a null SingleSource");
                                        SingleSource singleSource = (SingleSource) apply;
                                        this.f32157o = 1;
                                        singleSource.subscribe(this.f32150h);
                                    } catch (Throwable th) {
                                        C12285a.m32748b(th);
                                        this.f32153k.dispose();
                                        simplePlainQueue.clear();
                                        bVar.mo36929a(th);
                                        observer.onError(bVar.mo36928a());
                                        return;
                                    }
                                }
                            } else if (i2 == 2) {
                                R r = this.f32156n;
                                this.f32156n = null;
                                observer.onNext(r);
                                this.f32157o = 0;
                            }
                        }
                    }
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
                simplePlainQueue.clear();
                this.f32156n = null;
                observer.onError(bVar.mo36928a());
            }
        }
    }

    public C12390b(C12279e<T> eVar, Function<? super T, ? extends SingleSource<? extends R>> function, C12756f fVar, int i) {
        this.f32143e = eVar;
        this.f32144f = function;
        this.f32145g = fVar;
        this.f32146h = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo35836a(Observer<? super R> observer) {
        if (!C12396d.m32890a(this.f32143e, this.f32144f, observer)) {
            this.f32143e.subscribe(new C12391a(observer, this.f32144f, this.f32146h, this.f32145g));
        }
    }
}
