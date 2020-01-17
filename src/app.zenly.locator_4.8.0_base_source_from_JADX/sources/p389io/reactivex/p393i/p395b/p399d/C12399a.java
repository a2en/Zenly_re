package p389io.reactivex.p393i.p395b.p399d;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p389io.reactivex.C12291g;
import p389io.reactivex.SingleObserver;
import p389io.reactivex.SingleSource;
import p389io.reactivex.disposables.Disposable;

/* renamed from: io.reactivex.i.b.d.a */
public final class C12399a<T> extends C12291g<T> implements SingleObserver<T> {

    /* renamed from: j */
    static final C12400a[] f32177j = new C12400a[0];

    /* renamed from: k */
    static final C12400a[] f32178k = new C12400a[0];

    /* renamed from: e */
    final SingleSource<? extends T> f32179e;

    /* renamed from: f */
    final AtomicInteger f32180f = new AtomicInteger();

    /* renamed from: g */
    final AtomicReference<C12400a<T>[]> f32181g = new AtomicReference<>(f32177j);

    /* renamed from: h */
    T f32182h;

    /* renamed from: i */
    Throwable f32183i;

    /* renamed from: io.reactivex.i.b.d.a$a */
    static final class C12400a<T> extends AtomicBoolean implements Disposable {
        private static final long serialVersionUID = 7514387411091976596L;

        /* renamed from: e */
        final SingleObserver<? super T> f32184e;

        /* renamed from: f */
        final C12399a<T> f32185f;

        C12400a(SingleObserver<? super T> singleObserver, C12399a<T> aVar) {
            this.f32184e = singleObserver;
            this.f32185f = aVar;
        }

        public void dispose() {
            if (compareAndSet(false, true)) {
                this.f32185f.mo36612b(this);
            }
        }

        public boolean isDisposed() {
            return get();
        }
    }

    public C12399a(SingleSource<? extends T> singleSource) {
        this.f32179e = singleSource;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36541a(SingleObserver<? super T> singleObserver) {
        C12400a aVar = new C12400a(singleObserver, this);
        singleObserver.onSubscribe(aVar);
        if (mo36611a(aVar)) {
            if (aVar.isDisposed()) {
                mo36612b(aVar);
            }
            if (this.f32180f.getAndIncrement() == 0) {
                this.f32179e.subscribe(this);
            }
            return;
        }
        Throwable th = this.f32183i;
        if (th != null) {
            singleObserver.onError(th);
        } else {
            singleObserver.onSuccess(this.f32182h);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo36612b(C12400a<T> aVar) {
        C12400a<T>[] aVarArr;
        C12400a[] aVarArr2;
        do {
            aVarArr = (C12400a[]) this.f32181g.get();
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
                        aVarArr2 = f32177j;
                    } else {
                        C12400a[] aVarArr3 = new C12400a[(length - 1)];
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
        } while (!this.f32181g.compareAndSet(aVarArr, aVarArr2));
    }

    public void onError(Throwable th) {
        C12400a[] aVarArr;
        this.f32183i = th;
        for (C12400a aVar : (C12400a[]) this.f32181g.getAndSet(f32178k)) {
            if (!aVar.isDisposed()) {
                aVar.f32184e.onError(th);
            }
        }
    }

    public void onSubscribe(Disposable disposable) {
    }

    public void onSuccess(T t) {
        C12400a[] aVarArr;
        this.f32182h = t;
        for (C12400a aVar : (C12400a[]) this.f32181g.getAndSet(f32178k)) {
            if (!aVar.isDisposed()) {
                aVar.f32184e.onSuccess(t);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo36611a(C12400a<T> aVar) {
        C12400a[] aVarArr;
        C12400a[] aVarArr2;
        do {
            aVarArr = (C12400a[]) this.f32181g.get();
            if (aVarArr == f32178k) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new C12400a[(length + 1)];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!this.f32181g.compareAndSet(aVarArr, aVarArr2));
        return true;
    }
}
