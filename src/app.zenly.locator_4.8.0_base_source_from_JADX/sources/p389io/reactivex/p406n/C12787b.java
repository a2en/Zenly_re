package p389io.reactivex.p406n;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p389io.reactivex.C12271b;
import p389io.reactivex.CompletableObserver;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.p393i.p394a.C12324b;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.n.b */
public final class C12787b extends C12271b implements CompletableObserver {

    /* renamed from: h */
    static final C12788a[] f33350h = new C12788a[0];

    /* renamed from: i */
    static final C12788a[] f33351i = new C12788a[0];

    /* renamed from: e */
    final AtomicReference<C12788a[]> f33352e = new AtomicReference<>(f33350h);

    /* renamed from: f */
    final AtomicBoolean f33353f = new AtomicBoolean();

    /* renamed from: g */
    Throwable f33354g;

    /* renamed from: io.reactivex.n.b$a */
    static final class C12788a extends AtomicReference<C12787b> implements Disposable {
        private static final long serialVersionUID = -7650903191002190468L;

        /* renamed from: e */
        final CompletableObserver f33355e;

        C12788a(CompletableObserver completableObserver, C12787b bVar) {
            this.f33355e = completableObserver;
            lazySet(bVar);
        }

        public void dispose() {
            C12787b bVar = (C12787b) getAndSet(null);
            if (bVar != null) {
                bVar.mo36969b(this);
            }
        }

        public boolean isDisposed() {
            return get() == null;
        }
    }

    C12787b() {
    }

    /* renamed from: d */
    public static C12787b m33458d() {
        return new C12787b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36349a(CompletableObserver completableObserver) {
        C12788a aVar = new C12788a(completableObserver, this);
        completableObserver.onSubscribe(aVar);
        if (!mo36968a(aVar)) {
            Throwable th = this.f33354g;
            if (th != null) {
                completableObserver.onError(th);
            } else {
                completableObserver.onComplete();
            }
        } else if (aVar.isDisposed()) {
            mo36969b(aVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo36969b(C12788a aVar) {
        C12788a[] aVarArr;
        C12788a[] aVarArr2;
        do {
            aVarArr = (C12788a[]) this.f33352e.get();
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
                        aVarArr2 = f33350h;
                    } else {
                        C12788a[] aVarArr3 = new C12788a[(length - 1)];
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
        } while (!this.f33352e.compareAndSet(aVarArr, aVarArr2));
    }

    public void onComplete() {
        if (this.f33353f.compareAndSet(false, true)) {
            for (C12788a aVar : (C12788a[]) this.f33352e.getAndSet(f33351i)) {
                aVar.f33355e.onComplete();
            }
        }
    }

    public void onError(Throwable th) {
        C12324b.m32836a(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f33353f.compareAndSet(false, true)) {
            this.f33354g = th;
            for (C12788a aVar : (C12788a[]) this.f33352e.getAndSet(f33351i)) {
                aVar.f33355e.onError(th);
            }
            return;
        }
        C12768a.m33415b(th);
    }

    public void onSubscribe(Disposable disposable) {
        if (this.f33352e.get() == f33351i) {
            disposable.dispose();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo36968a(C12788a aVar) {
        C12788a[] aVarArr;
        C12788a[] aVarArr2;
        do {
            aVarArr = (C12788a[]) this.f33352e.get();
            if (aVarArr == f33351i) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new C12788a[(length + 1)];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!this.f33352e.compareAndSet(aVarArr, aVarArr2));
        return true;
    }
}
