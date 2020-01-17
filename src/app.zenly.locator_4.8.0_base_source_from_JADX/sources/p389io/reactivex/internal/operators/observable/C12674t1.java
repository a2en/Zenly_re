package p389io.reactivex.internal.operators.observable;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p389io.reactivex.C12279e;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.Observer;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.functions.Function;
import p389io.reactivex.internal.disposables.C12458b;
import p389io.reactivex.internal.disposables.C12459c;
import p389io.reactivex.p393i.p394a.C12324b;
import p389io.reactivex.p393i.p400c.C12449c;

/* renamed from: io.reactivex.internal.operators.observable.t1 */
public final class C12674t1<T, R> extends C12279e<R> {

    /* renamed from: e */
    final ObservableSource<? extends T>[] f33001e;

    /* renamed from: f */
    final Iterable<? extends ObservableSource<? extends T>> f33002f;

    /* renamed from: g */
    final Function<? super Object[], ? extends R> f33003g;

    /* renamed from: h */
    final int f33004h;

    /* renamed from: i */
    final boolean f33005i;

    /* renamed from: io.reactivex.internal.operators.observable.t1$a */
    static final class C12675a<T, R> extends AtomicInteger implements Disposable {
        private static final long serialVersionUID = 2983708048395377667L;

        /* renamed from: e */
        final Observer<? super R> f33006e;

        /* renamed from: f */
        final Function<? super Object[], ? extends R> f33007f;

        /* renamed from: g */
        final C12676b<T, R>[] f33008g;

        /* renamed from: h */
        final T[] f33009h;

        /* renamed from: i */
        final boolean f33010i;

        /* renamed from: j */
        volatile boolean f33011j;

        C12675a(Observer<? super R> observer, Function<? super Object[], ? extends R> function, int i, boolean z) {
            this.f33006e = observer;
            this.f33007f = function;
            this.f33008g = new C12676b[i];
            this.f33009h = new Object[i];
            this.f33010i = z;
        }

        /* renamed from: a */
        public void mo36799a(ObservableSource<? extends T>[] observableSourceArr, int i) {
            C12676b<T, R>[] bVarArr = this.f33008g;
            int length = bVarArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                bVarArr[i2] = new C12676b<>(this, i);
            }
            lazySet(0);
            this.f33006e.onSubscribe(this);
            for (int i3 = 0; i3 < length && !this.f33011j; i3++) {
                observableSourceArr[i3].subscribe(bVarArr[i3]);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo36801b() {
            for (C12676b<T, R> a : this.f33008g) {
                a.mo36804a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo36802c() {
            for (C12676b<T, R> bVar : this.f33008g) {
                bVar.f33013f.clear();
            }
        }

        /* renamed from: d */
        public void mo36803d() {
            if (getAndIncrement() == 0) {
                C12676b<T, R>[] bVarArr = this.f33008g;
                Observer<? super R> observer = this.f33006e;
                T[] tArr = this.f33009h;
                boolean z = this.f33010i;
                int i = 1;
                while (true) {
                    int i2 = 0;
                    int i3 = 0;
                    for (C12676b<T, R> bVar : bVarArr) {
                        if (tArr[i3] == null) {
                            boolean z2 = bVar.f33014g;
                            T poll = bVar.f33013f.poll();
                            boolean z3 = poll == null;
                            if (!mo36800a(z2, z3, observer, z, bVar)) {
                                if (!z3) {
                                    tArr[i3] = poll;
                                } else {
                                    i2++;
                                }
                            } else {
                                return;
                            }
                        } else if (bVar.f33014g && !z) {
                            Throwable th = bVar.f33015h;
                            if (th != null) {
                                this.f33011j = true;
                                mo36798a();
                                observer.onError(th);
                                return;
                            }
                        }
                        i3++;
                    }
                    if (i2 != 0) {
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        try {
                            Object apply = this.f33007f.apply(tArr.clone());
                            C12324b.m32836a(apply, "The zipper returned a null value");
                            observer.onNext(apply);
                            Arrays.fill(tArr, null);
                        } catch (Throwable th2) {
                            C12285a.m32748b(th2);
                            mo36798a();
                            observer.onError(th2);
                            return;
                        }
                    }
                }
            }
        }

        public void dispose() {
            if (!this.f33011j) {
                this.f33011j = true;
                mo36801b();
                if (getAndIncrement() == 0) {
                    mo36802c();
                }
            }
        }

        public boolean isDisposed() {
            return this.f33011j;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo36798a() {
            mo36802c();
            mo36801b();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo36800a(boolean z, boolean z2, Observer<? super R> observer, boolean z3, C12676b<?, ?> bVar) {
            if (this.f33011j) {
                mo36798a();
                return true;
            }
            if (z) {
                if (!z3) {
                    Throwable th = bVar.f33015h;
                    if (th != null) {
                        this.f33011j = true;
                        mo36798a();
                        observer.onError(th);
                        return true;
                    } else if (z2) {
                        this.f33011j = true;
                        mo36798a();
                        observer.onComplete();
                        return true;
                    }
                } else if (z2) {
                    Throwable th2 = bVar.f33015h;
                    this.f33011j = true;
                    mo36798a();
                    if (th2 != null) {
                        observer.onError(th2);
                    } else {
                        observer.onComplete();
                    }
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.t1$b */
    static final class C12676b<T, R> implements Observer<T> {

        /* renamed from: e */
        final C12675a<T, R> f33012e;

        /* renamed from: f */
        final C12449c<T> f33013f;

        /* renamed from: g */
        volatile boolean f33014g;

        /* renamed from: h */
        Throwable f33015h;

        /* renamed from: i */
        final AtomicReference<Disposable> f33016i = new AtomicReference<>();

        C12676b(C12675a<T, R> aVar, int i) {
            this.f33012e = aVar;
            this.f33013f = new C12449c<>(i);
        }

        /* renamed from: a */
        public void mo36804a() {
            C12458b.m32975a(this.f33016i);
        }

        public void onComplete() {
            this.f33014g = true;
            this.f33012e.mo36803d();
        }

        public void onError(Throwable th) {
            this.f33015h = th;
            this.f33014g = true;
            this.f33012e.mo36803d();
        }

        public void onNext(T t) {
            this.f33013f.offer(t);
            this.f33012e.mo36803d();
        }

        public void onSubscribe(Disposable disposable) {
            C12458b.m32978c(this.f33016i, disposable);
        }
    }

    public C12674t1(ObservableSource<? extends T>[] observableSourceArr, Iterable<? extends ObservableSource<? extends T>> iterable, Function<? super Object[], ? extends R> function, int i, boolean z) {
        this.f33001e = observableSourceArr;
        this.f33002f = iterable;
        this.f33003g = function;
        this.f33004h = i;
        this.f33005i = z;
    }

    /* renamed from: a */
    public void mo35836a(Observer<? super R> observer) {
        int i;
        ObservableSource<? extends T>[] observableSourceArr = this.f33001e;
        if (observableSourceArr == null) {
            observableSourceArr = new C12279e[8];
            i = 0;
            for (ObservableSource<? extends T> observableSource : this.f33002f) {
                if (i == observableSourceArr.length) {
                    ObservableSource<? extends T>[] observableSourceArr2 = new ObservableSource[((i >> 2) + i)];
                    System.arraycopy(observableSourceArr, 0, observableSourceArr2, 0, i);
                    observableSourceArr = observableSourceArr2;
                }
                int i2 = i + 1;
                observableSourceArr[i] = observableSource;
                i = i2;
            }
        } else {
            i = observableSourceArr.length;
        }
        if (i == 0) {
            C12459c.m32982a(observer);
        } else {
            new C12675a(observer, this.f33003g, i, this.f33005i).mo36799a(observableSourceArr, this.f33004h);
        }
    }
}
