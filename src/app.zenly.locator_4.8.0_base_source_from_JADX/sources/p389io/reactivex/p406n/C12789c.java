package p389io.reactivex.p406n;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p389io.reactivex.Observer;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.p393i.p394a.C12324b;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.n.c */
public final class C12789c<T> extends C12798f<T> {

    /* renamed from: g */
    static final C12790a[] f33356g = new C12790a[0];

    /* renamed from: h */
    static final C12790a[] f33357h = new C12790a[0];

    /* renamed from: e */
    final AtomicReference<C12790a<T>[]> f33358e = new AtomicReference<>(f33357h);

    /* renamed from: f */
    Throwable f33359f;

    /* renamed from: io.reactivex.n.c$a */
    static final class C12790a<T> extends AtomicBoolean implements Disposable {
        private static final long serialVersionUID = 3562861878281475070L;

        /* renamed from: e */
        final Observer<? super T> f33360e;

        /* renamed from: f */
        final C12789c<T> f33361f;

        C12790a(Observer<? super T> observer, C12789c<T> cVar) {
            this.f33360e = observer;
            this.f33361f = cVar;
        }

        /* renamed from: a */
        public void mo36973a(T t) {
            if (!get()) {
                this.f33360e.onNext(t);
            }
        }

        public void dispose() {
            if (compareAndSet(false, true)) {
                this.f33361f.mo36971b(this);
            }
        }

        public boolean isDisposed() {
            return get();
        }

        /* renamed from: a */
        public void mo36974a(Throwable th) {
            if (get()) {
                C12768a.m33415b(th);
            } else {
                this.f33360e.onError(th);
            }
        }

        /* renamed from: a */
        public void mo36972a() {
            if (!get()) {
                this.f33360e.onComplete();
            }
        }
    }

    C12789c() {
    }

    /* renamed from: s */
    public static <T> C12789c<T> m33462s() {
        return new C12789c<>();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo35836a(Observer<? super T> observer) {
        C12790a aVar = new C12790a(observer, this);
        observer.onSubscribe(aVar);
        if (!mo36970a(aVar)) {
            Throwable th = this.f33359f;
            if (th != null) {
                observer.onError(th);
            } else {
                observer.onComplete();
            }
        } else if (aVar.isDisposed()) {
            mo36971b(aVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo36971b(C12790a<T> aVar) {
        C12790a<T>[] aVarArr;
        C12790a[] aVarArr2;
        do {
            aVarArr = (C12790a[]) this.f33358e.get();
            if (aVarArr != f33356g && aVarArr != f33357h) {
                int length = aVarArr.length;
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
                        aVarArr2 = f33357h;
                    } else {
                        C12790a[] aVarArr3 = new C12790a[(length - 1)];
                        System.arraycopy(aVarArr, 0, aVarArr3, 0, i);
                        System.arraycopy(aVarArr, i + 1, aVarArr3, i, (length - i) - 1);
                        aVarArr2 = aVarArr3;
                    }
                } else {
                    return;
                }
            }
        } while (!this.f33358e.compareAndSet(aVarArr, aVarArr2));
    }

    public void onComplete() {
        Object obj = this.f33358e.get();
        Object obj2 = f33356g;
        if (obj != obj2) {
            for (C12790a a : (C12790a[]) this.f33358e.getAndSet(obj2)) {
                a.mo36972a();
            }
        }
    }

    public void onError(Throwable th) {
        C12324b.m32836a(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        Object obj = this.f33358e.get();
        Object obj2 = f33356g;
        if (obj == obj2) {
            C12768a.m33415b(th);
            return;
        }
        this.f33359f = th;
        for (C12790a a : (C12790a[]) this.f33358e.getAndSet(obj2)) {
            a.mo36974a(th);
        }
    }

    public void onNext(T t) {
        C12324b.m32836a(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (C12790a a : (C12790a[]) this.f33358e.get()) {
            a.mo36973a(t);
        }
    }

    public void onSubscribe(Disposable disposable) {
        if (this.f33358e.get() == f33356g) {
            disposable.dispose();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo36970a(C12790a<T> aVar) {
        C12790a[] aVarArr;
        C12790a[] aVarArr2;
        do {
            aVarArr = (C12790a[]) this.f33358e.get();
            if (aVarArr == f33356g) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new C12790a[(length + 1)];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!this.f33358e.compareAndSet(aVarArr, aVarArr2));
        return true;
    }
}
