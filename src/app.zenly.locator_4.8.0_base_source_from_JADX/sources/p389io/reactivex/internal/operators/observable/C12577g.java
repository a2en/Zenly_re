package p389io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p389io.reactivex.C12279e;
import p389io.reactivex.Observer;
import p389io.reactivex.disposables.Disposable;

/* renamed from: io.reactivex.internal.operators.observable.g */
public final class C12577g<T> extends C12538a<T, T> implements Observer<T> {

    /* renamed from: o */
    static final C12578a[] f32673o = new C12578a[0];

    /* renamed from: p */
    static final C12578a[] f32674p = new C12578a[0];

    /* renamed from: f */
    final AtomicBoolean f32675f = new AtomicBoolean();

    /* renamed from: g */
    final int f32676g;

    /* renamed from: h */
    final AtomicReference<C12578a<T>[]> f32677h;

    /* renamed from: i */
    volatile long f32678i;

    /* renamed from: j */
    final C12579b<T> f32679j;

    /* renamed from: k */
    C12579b<T> f32680k;

    /* renamed from: l */
    int f32681l;

    /* renamed from: m */
    Throwable f32682m;

    /* renamed from: n */
    volatile boolean f32683n;

    /* renamed from: io.reactivex.internal.operators.observable.g$a */
    static final class C12578a<T> extends AtomicInteger implements Disposable {
        private static final long serialVersionUID = 6770240836423125754L;

        /* renamed from: e */
        final Observer<? super T> f32684e;

        /* renamed from: f */
        final C12577g<T> f32685f;

        /* renamed from: g */
        C12579b<T> f32686g;

        /* renamed from: h */
        int f32687h;

        /* renamed from: i */
        long f32688i;

        /* renamed from: j */
        volatile boolean f32689j;

        C12578a(Observer<? super T> observer, C12577g<T> gVar) {
            this.f32684e = observer;
            this.f32685f = gVar;
            this.f32686g = gVar.f32679j;
        }

        public void dispose() {
            if (!this.f32689j) {
                this.f32689j = true;
                this.f32685f.mo36744b(this);
            }
        }

        public boolean isDisposed() {
            return this.f32689j;
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.g$b */
    static final class C12579b<T> {

        /* renamed from: a */
        final T[] f32690a;

        /* renamed from: b */
        volatile C12579b<T> f32691b;

        C12579b(int i) {
            this.f32690a = new Object[i];
        }
    }

    public C12577g(C12279e<T> eVar, int i) {
        super(eVar);
        this.f32676g = i;
        C12579b<T> bVar = new C12579b<>(i);
        this.f32679j = bVar;
        this.f32680k = bVar;
        this.f32677h = new AtomicReference<>(f32673o);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo35836a(Observer<? super T> observer) {
        C12578a aVar = new C12578a(observer, this);
        observer.onSubscribe(aVar);
        mo36743a(aVar);
        if (this.f32675f.get() || !this.f32675f.compareAndSet(false, true)) {
            mo36745c(aVar);
        } else {
            this.f32549e.subscribe(this);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo36744b(C12578a<T> aVar) {
        C12578a<T>[] aVarArr;
        C12578a[] aVarArr2;
        do {
            aVarArr = (C12578a[]) this.f32677h.get();
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
                        aVarArr2 = f32673o;
                    } else {
                        C12578a[] aVarArr3 = new C12578a[(length - 1)];
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
        } while (!this.f32677h.compareAndSet(aVarArr, aVarArr2));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo36745c(C12578a<T> aVar) {
        if (aVar.getAndIncrement() == 0) {
            long j = aVar.f32688i;
            int i = aVar.f32687h;
            C12579b<T> bVar = aVar.f32686g;
            Observer<? super T> observer = aVar.f32684e;
            int i2 = this.f32676g;
            int i3 = 1;
            while (!aVar.f32689j) {
                boolean z = this.f32683n;
                boolean z2 = this.f32678i == j;
                if (z && z2) {
                    aVar.f32686g = null;
                    Throwable th = this.f32682m;
                    if (th != null) {
                        observer.onError(th);
                    } else {
                        observer.onComplete();
                    }
                    return;
                } else if (!z2) {
                    if (i == i2) {
                        bVar = bVar.f32691b;
                        i = 0;
                    }
                    observer.onNext(bVar.f32690a[i]);
                    i++;
                    j++;
                } else {
                    aVar.f32688i = j;
                    aVar.f32687h = i;
                    aVar.f32686g = bVar;
                    i3 = aVar.addAndGet(-i3);
                    if (i3 == 0) {
                        return;
                    }
                }
            }
            aVar.f32686g = null;
        }
    }

    public void onComplete() {
        this.f32683n = true;
        for (C12578a c : (C12578a[]) this.f32677h.getAndSet(f32674p)) {
            mo36745c(c);
        }
    }

    public void onError(Throwable th) {
        this.f32682m = th;
        this.f32683n = true;
        for (C12578a c : (C12578a[]) this.f32677h.getAndSet(f32674p)) {
            mo36745c(c);
        }
    }

    public void onNext(T t) {
        int i = this.f32681l;
        if (i == this.f32676g) {
            C12579b<T> bVar = new C12579b<>(i);
            bVar.f32690a[0] = t;
            this.f32681l = 1;
            this.f32680k.f32691b = bVar;
            this.f32680k = bVar;
        } else {
            this.f32680k.f32690a[i] = t;
            this.f32681l = i + 1;
        }
        this.f32678i++;
        for (C12578a c : (C12578a[]) this.f32677h.get()) {
            mo36745c(c);
        }
    }

    public void onSubscribe(Disposable disposable) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo36743a(C12578a<T> aVar) {
        C12578a[] aVarArr;
        C12578a[] aVarArr2;
        do {
            aVarArr = (C12578a[]) this.f32677h.get();
            if (aVarArr != f32674p) {
                int length = aVarArr.length;
                aVarArr2 = new C12578a[(length + 1)];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } else {
                return;
            }
        } while (!this.f32677h.compareAndSet(aVarArr, aVarArr2));
    }
}
