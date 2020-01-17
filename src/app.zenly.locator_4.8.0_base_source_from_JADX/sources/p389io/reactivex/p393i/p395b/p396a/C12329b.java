package p389io.reactivex.p393i.p395b.p396a;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p389io.reactivex.C12271b;
import p389io.reactivex.CompletableObserver;
import p389io.reactivex.CompletableSource;
import p389io.reactivex.disposables.Disposable;

/* renamed from: io.reactivex.i.b.a.b */
public final class C12329b extends C12271b implements CompletableObserver {

    /* renamed from: i */
    static final C12330a[] f32002i = new C12330a[0];

    /* renamed from: j */
    static final C12330a[] f32003j = new C12330a[0];

    /* renamed from: e */
    final CompletableSource f32004e;

    /* renamed from: f */
    final AtomicReference<C12330a[]> f32005f = new AtomicReference<>(f32002i);

    /* renamed from: g */
    final AtomicBoolean f32006g = new AtomicBoolean();

    /* renamed from: h */
    Throwable f32007h;

    /* renamed from: io.reactivex.i.b.a.b$a */
    final class C12330a extends AtomicBoolean implements Disposable {
        private static final long serialVersionUID = 8943152917179642732L;

        /* renamed from: e */
        final CompletableObserver f32008e;

        C12330a(CompletableObserver completableObserver) {
            this.f32008e = completableObserver;
        }

        public void dispose() {
            if (compareAndSet(false, true)) {
                C12329b.this.mo36579b(this);
            }
        }

        public boolean isDisposed() {
            return get();
        }
    }

    public C12329b(CompletableSource completableSource) {
        this.f32004e = completableSource;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36349a(CompletableObserver completableObserver) {
        C12330a aVar = new C12330a(completableObserver);
        completableObserver.onSubscribe(aVar);
        if (mo36578a(aVar)) {
            if (aVar.isDisposed()) {
                mo36579b(aVar);
            }
            if (this.f32006g.compareAndSet(false, true)) {
                this.f32004e.subscribe(this);
                return;
            }
            return;
        }
        Throwable th = this.f32007h;
        if (th != null) {
            completableObserver.onError(th);
        } else {
            completableObserver.onComplete();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo36579b(C12330a aVar) {
        C12330a[] aVarArr;
        C12330a[] aVarArr2;
        do {
            aVarArr = (C12330a[]) this.f32005f.get();
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
                        aVarArr2 = f32002i;
                    } else {
                        C12330a[] aVarArr3 = new C12330a[(length - 1)];
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
        } while (!this.f32005f.compareAndSet(aVarArr, aVarArr2));
    }

    public void onComplete() {
        C12330a[] aVarArr;
        for (C12330a aVar : (C12330a[]) this.f32005f.getAndSet(f32003j)) {
            if (!aVar.get()) {
                aVar.f32008e.onComplete();
            }
        }
    }

    public void onError(Throwable th) {
        C12330a[] aVarArr;
        this.f32007h = th;
        for (C12330a aVar : (C12330a[]) this.f32005f.getAndSet(f32003j)) {
            if (!aVar.get()) {
                aVar.f32008e.onError(th);
            }
        }
    }

    public void onSubscribe(Disposable disposable) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo36578a(C12330a aVar) {
        C12330a[] aVarArr;
        C12330a[] aVarArr2;
        do {
            aVarArr = (C12330a[]) this.f32005f.get();
            if (aVarArr == f32003j) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new C12330a[(length + 1)];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!this.f32005f.compareAndSet(aVarArr, aVarArr2));
        return true;
    }
}
