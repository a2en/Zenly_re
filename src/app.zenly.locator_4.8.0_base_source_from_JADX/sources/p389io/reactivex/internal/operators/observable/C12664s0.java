package p389io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.Observer;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.internal.disposables.C12458b;
import p389io.reactivex.internal.disposables.ResettableConnectable;
import p389io.reactivex.internal.fuseable.HasUpstreamObservableSource;
import p389io.reactivex.p402j.C12767a;

/* renamed from: io.reactivex.internal.operators.observable.s0 */
public final class C12664s0<T> extends C12767a<T> implements HasUpstreamObservableSource<T>, ResettableConnectable {

    /* renamed from: e */
    final ObservableSource<T> f32971e;

    /* renamed from: f */
    final AtomicReference<C12666b<T>> f32972f = new AtomicReference<>();

    /* renamed from: io.reactivex.internal.operators.observable.s0$a */
    static final class C12665a<T> extends AtomicReference<C12666b<T>> implements Disposable {
        private static final long serialVersionUID = 7463222674719692880L;

        /* renamed from: e */
        final Observer<? super T> f32973e;

        public C12665a(Observer<? super T> observer, C12666b<T> bVar) {
            this.f32973e = observer;
            lazySet(bVar);
        }

        public void dispose() {
            C12666b bVar = (C12666b) getAndSet(null);
            if (bVar != null) {
                bVar.mo36795b(this);
            }
        }

        public boolean isDisposed() {
            return get() == null;
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.s0$b */
    static final class C12666b<T> extends AtomicReference<C12665a<T>[]> implements Observer<T>, Disposable {

        /* renamed from: i */
        static final C12665a[] f32974i = new C12665a[0];

        /* renamed from: j */
        static final C12665a[] f32975j = new C12665a[0];
        private static final long serialVersionUID = -3251430252873581268L;

        /* renamed from: e */
        final AtomicBoolean f32976e = new AtomicBoolean();

        /* renamed from: f */
        final AtomicReference<C12666b<T>> f32977f;

        /* renamed from: g */
        final AtomicReference<Disposable> f32978g;

        /* renamed from: h */
        Throwable f32979h;

        public C12666b(AtomicReference<C12666b<T>> atomicReference) {
            this.f32977f = atomicReference;
            this.f32978g = new AtomicReference<>();
            lazySet(f32974i);
        }

        /* renamed from: a */
        public boolean mo36794a(C12665a<T> aVar) {
            C12665a[] aVarArr;
            C12665a[] aVarArr2;
            do {
                aVarArr = (C12665a[]) get();
                if (aVarArr == f32975j) {
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new C12665a[(length + 1)];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!compareAndSet(aVarArr, aVarArr2));
            return true;
        }

        /* renamed from: b */
        public void mo36795b(C12665a<T> aVar) {
            C12665a<T>[] aVarArr;
            C12665a[] aVarArr2;
            do {
                aVarArr = (C12665a[]) get();
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
                        aVarArr2 = f32974i;
                        if (length != 1) {
                            aVarArr2 = new C12665a[(length - 1)];
                            System.arraycopy(aVarArr, 0, aVarArr2, 0, i);
                            System.arraycopy(aVarArr, i + 1, aVarArr2, i, (length - i) - 1);
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } while (!compareAndSet(aVarArr, aVarArr2));
        }

        public void dispose() {
            getAndSet(f32975j);
            this.f32977f.compareAndSet(this, null);
            C12458b.m32975a(this.f32978g);
        }

        public boolean isDisposed() {
            return get() == f32975j;
        }

        public void onComplete() {
            this.f32978g.lazySet(C12458b.DISPOSED);
            for (C12665a aVar : (C12665a[]) getAndSet(f32975j)) {
                aVar.f32973e.onComplete();
            }
        }

        public void onError(Throwable th) {
            this.f32979h = th;
            this.f32978g.lazySet(C12458b.DISPOSED);
            for (C12665a aVar : (C12665a[]) getAndSet(f32975j)) {
                aVar.f32973e.onError(th);
            }
        }

        public void onNext(T t) {
            for (C12665a aVar : (C12665a[]) get()) {
                aVar.f32973e.onNext(t);
            }
        }

        public void onSubscribe(Disposable disposable) {
            C12458b.m32978c(this.f32978g, disposable);
        }
    }

    public C12664s0(ObservableSource<T> observableSource) {
        this.f32971e = observableSource;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo35836a(p389io.reactivex.Observer<? super T> r4) {
        /*
            r3 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.s0$b<T>> r0 = r3.f32972f
            java.lang.Object r0 = r0.get()
            io.reactivex.internal.operators.observable.s0$b r0 = (p389io.reactivex.internal.operators.observable.C12664s0.C12666b) r0
            if (r0 != 0) goto L_0x001b
            io.reactivex.internal.operators.observable.s0$b r1 = new io.reactivex.internal.operators.observable.s0$b
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.s0$b<T>> r2 = r3.f32972f
            r1.<init>(r2)
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.s0$b<T>> r2 = r3.f32972f
            boolean r0 = r2.compareAndSet(r0, r1)
            if (r0 != 0) goto L_0x001a
            goto L_0x0000
        L_0x001a:
            r0 = r1
        L_0x001b:
            io.reactivex.internal.operators.observable.s0$a r1 = new io.reactivex.internal.operators.observable.s0$a
            r1.<init>(r4, r0)
            r4.onSubscribe(r1)
            boolean r2 = r0.mo36794a(r1)
            if (r2 == 0) goto L_0x0033
            boolean r4 = r1.isDisposed()
            if (r4 == 0) goto L_0x0032
            r0.mo36795b(r1)
        L_0x0032:
            return
        L_0x0033:
            java.lang.Throwable r0 = r0.f32979h
            if (r0 == 0) goto L_0x003b
            r4.onError(r0)
            goto L_0x003e
        L_0x003b:
            r4.onComplete()
        L_0x003e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p389io.reactivex.internal.operators.observable.C12664s0.mo35836a(io.reactivex.Observer):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo36790e(p389io.reactivex.functions.Consumer<? super p389io.reactivex.disposables.Disposable> r5) {
        /*
            r4 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.s0$b<T>> r0 = r4.f32972f
            java.lang.Object r0 = r0.get()
            io.reactivex.internal.operators.observable.s0$b r0 = (p389io.reactivex.internal.operators.observable.C12664s0.C12666b) r0
            if (r0 == 0) goto L_0x0010
            boolean r1 = r0.isDisposed()
            if (r1 == 0) goto L_0x0021
        L_0x0010:
            io.reactivex.internal.operators.observable.s0$b r1 = new io.reactivex.internal.operators.observable.s0$b
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.s0$b<T>> r2 = r4.f32972f
            r1.<init>(r2)
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.s0$b<T>> r2 = r4.f32972f
            boolean r0 = r2.compareAndSet(r0, r1)
            if (r0 != 0) goto L_0x0020
            goto L_0x0000
        L_0x0020:
            r0 = r1
        L_0x0021:
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f32976e
            boolean r1 = r1.get()
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0034
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f32976e
            boolean r1 = r1.compareAndSet(r3, r2)
            if (r1 == 0) goto L_0x0034
            goto L_0x0035
        L_0x0034:
            r2 = 0
        L_0x0035:
            r5.accept(r0)     // Catch:{ all -> 0x0040 }
            if (r2 == 0) goto L_0x003f
            io.reactivex.ObservableSource<T> r5 = r4.f32971e
            r5.subscribe(r0)
        L_0x003f:
            return
        L_0x0040:
            r5 = move-exception
            p389io.reactivex.exceptions.C12285a.m32748b(r5)
            java.lang.RuntimeException r5 = p389io.reactivex.internal.util.C12757g.m33354b(r5)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p389io.reactivex.internal.operators.observable.C12664s0.mo36790e(io.reactivex.functions.Consumer):void");
    }

    public void resetIf(Disposable disposable) {
        this.f32972f.compareAndSet((C12666b) disposable, null);
    }

    public ObservableSource<T> source() {
        return this.f32971e;
    }
}
