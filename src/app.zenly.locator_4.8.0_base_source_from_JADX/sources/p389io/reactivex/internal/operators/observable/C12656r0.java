package p389io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.Observer;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.internal.disposables.C12458b;
import p389io.reactivex.internal.fuseable.HasUpstreamObservableSource;
import p389io.reactivex.p402j.C12767a;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.internal.operators.observable.r0 */
public final class C12656r0<T> extends C12767a<T> implements HasUpstreamObservableSource<T>, ObservablePublishClassic<T> {

    /* renamed from: e */
    final ObservableSource<T> f32945e;

    /* renamed from: f */
    final AtomicReference<C12658b<T>> f32946f;

    /* renamed from: g */
    final ObservableSource<T> f32947g;

    /* renamed from: io.reactivex.internal.operators.observable.r0$a */
    static final class C12657a<T> extends AtomicReference<Object> implements Disposable {
        private static final long serialVersionUID = -1100270633763673112L;

        /* renamed from: e */
        final Observer<? super T> f32948e;

        C12657a(Observer<? super T> observer) {
            this.f32948e = observer;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo36791a(C12658b<T> bVar) {
            if (!compareAndSet(null, bVar)) {
                bVar.mo36793b(this);
            }
        }

        public void dispose() {
            Object andSet = getAndSet(this);
            if (andSet != null && andSet != this) {
                ((C12658b) andSet).mo36793b(this);
            }
        }

        public boolean isDisposed() {
            return get() == this;
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.r0$b */
    static final class C12658b<T> implements Observer<T>, Disposable {

        /* renamed from: i */
        static final C12657a[] f32949i = new C12657a[0];

        /* renamed from: j */
        static final C12657a[] f32950j = new C12657a[0];

        /* renamed from: e */
        final AtomicReference<C12658b<T>> f32951e;

        /* renamed from: f */
        final AtomicReference<C12657a<T>[]> f32952f = new AtomicReference<>(f32949i);

        /* renamed from: g */
        final AtomicBoolean f32953g;

        /* renamed from: h */
        final AtomicReference<Disposable> f32954h = new AtomicReference<>();

        C12658b(AtomicReference<C12658b<T>> atomicReference) {
            this.f32951e = atomicReference;
            this.f32953g = new AtomicBoolean();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo36792a(C12657a<T> aVar) {
            C12657a[] aVarArr;
            C12657a[] aVarArr2;
            do {
                aVarArr = (C12657a[]) this.f32952f.get();
                if (aVarArr == f32950j) {
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new C12657a[(length + 1)];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!this.f32952f.compareAndSet(aVarArr, aVarArr2));
            return true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo36793b(C12657a<T> aVar) {
            C12657a[] aVarArr;
            C12657a[] aVarArr2;
            do {
                aVarArr = (C12657a[]) this.f32952f.get();
                int length = aVarArr.length;
                if (length != 0) {
                    int i = -1;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        } else if (aVarArr[i2].equals(aVar)) {
                            i = i2;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (i >= 0) {
                        if (length == 1) {
                            aVarArr2 = f32949i;
                        } else {
                            C12657a[] aVarArr3 = new C12657a[(length - 1)];
                            System.arraycopy(aVarArr, 0, aVarArr3, 0, i);
                            System.arraycopy(aVarArr, i + 1, aVarArr3, i, (length - i) - 1);
                            aVarArr2 = aVarArr3;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } while (!this.f32952f.compareAndSet(aVarArr, aVarArr2));
        }

        public void dispose() {
            if (((C12657a[]) this.f32952f.getAndSet(f32950j)) != f32950j) {
                this.f32951e.compareAndSet(this, null);
                C12458b.m32975a(this.f32954h);
            }
        }

        public boolean isDisposed() {
            return this.f32952f.get() == f32950j;
        }

        public void onComplete() {
            this.f32951e.compareAndSet(this, null);
            for (C12657a aVar : (C12657a[]) this.f32952f.getAndSet(f32950j)) {
                aVar.f32948e.onComplete();
            }
        }

        public void onError(Throwable th) {
            this.f32951e.compareAndSet(this, null);
            C12657a[] aVarArr = (C12657a[]) this.f32952f.getAndSet(f32950j);
            if (aVarArr.length != 0) {
                for (C12657a aVar : aVarArr) {
                    aVar.f32948e.onError(th);
                }
                return;
            }
            C12768a.m33415b(th);
        }

        public void onNext(T t) {
            for (C12657a aVar : (C12657a[]) this.f32952f.get()) {
                aVar.f32948e.onNext(t);
            }
        }

        public void onSubscribe(Disposable disposable) {
            C12458b.m32978c(this.f32954h, disposable);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.r0$c */
    static final class C12659c<T> implements ObservableSource<T> {

        /* renamed from: e */
        private final AtomicReference<C12658b<T>> f32955e;

        C12659c(AtomicReference<C12658b<T>> atomicReference) {
            this.f32955e = atomicReference;
        }

        public void subscribe(Observer<? super T> observer) {
            C12657a aVar = new C12657a(observer);
            observer.onSubscribe(aVar);
            while (true) {
                C12658b bVar = (C12658b) this.f32955e.get();
                if (bVar == null || bVar.isDisposed()) {
                    C12658b bVar2 = new C12658b(this.f32955e);
                    if (!this.f32955e.compareAndSet(bVar, bVar2)) {
                        continue;
                    } else {
                        bVar = bVar2;
                    }
                }
                if (bVar.mo36792a(aVar)) {
                    aVar.mo36791a(bVar);
                    return;
                }
            }
        }
    }

    private C12656r0(ObservableSource<T> observableSource, ObservableSource<T> observableSource2, AtomicReference<C12658b<T>> atomicReference) {
        this.f32947g = observableSource;
        this.f32945e = observableSource2;
        this.f32946f = atomicReference;
    }

    /* renamed from: i */
    public static <T> C12767a<T> m33174i(ObservableSource<T> observableSource) {
        AtomicReference atomicReference = new AtomicReference();
        return C12768a.m33402a((C12767a<T>) new C12656r0<T>(new C12659c(atomicReference), observableSource, atomicReference));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo35836a(Observer<? super T> observer) {
        this.f32947g.subscribe(observer);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo36790e(p389io.reactivex.functions.Consumer<? super p389io.reactivex.disposables.Disposable> r5) {
        /*
            r4 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.r0$b<T>> r0 = r4.f32946f
            java.lang.Object r0 = r0.get()
            io.reactivex.internal.operators.observable.r0$b r0 = (p389io.reactivex.internal.operators.observable.C12656r0.C12658b) r0
            if (r0 == 0) goto L_0x0010
            boolean r1 = r0.isDisposed()
            if (r1 == 0) goto L_0x0021
        L_0x0010:
            io.reactivex.internal.operators.observable.r0$b r1 = new io.reactivex.internal.operators.observable.r0$b
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.r0$b<T>> r2 = r4.f32946f
            r1.<init>(r2)
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.r0$b<T>> r2 = r4.f32946f
            boolean r0 = r2.compareAndSet(r0, r1)
            if (r0 != 0) goto L_0x0020
            goto L_0x0000
        L_0x0020:
            r0 = r1
        L_0x0021:
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f32953g
            boolean r1 = r1.get()
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0034
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f32953g
            boolean r1 = r1.compareAndSet(r3, r2)
            if (r1 == 0) goto L_0x0034
            goto L_0x0035
        L_0x0034:
            r2 = 0
        L_0x0035:
            r5.accept(r0)     // Catch:{ all -> 0x0040 }
            if (r2 == 0) goto L_0x003f
            io.reactivex.ObservableSource<T> r5 = r4.f32945e
            r5.subscribe(r0)
        L_0x003f:
            return
        L_0x0040:
            r5 = move-exception
            p389io.reactivex.exceptions.C12285a.m32748b(r5)
            java.lang.RuntimeException r5 = p389io.reactivex.internal.util.C12757g.m33354b(r5)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p389io.reactivex.internal.operators.observable.C12656r0.mo36790e(io.reactivex.functions.Consumer):void");
    }

    public ObservableSource<T> publishSource() {
        return this.f32945e;
    }

    public ObservableSource<T> source() {
        return this.f32945e;
    }
}
