package p389io.reactivex.internal.operators.observable;

import java.util.concurrent.Callable;
import p389io.reactivex.C12279e;
import p389io.reactivex.Observer;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.internal.observers.C12470i;
import p389io.reactivex.p393i.p394a.C12324b;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.internal.operators.observable.c0 */
public final class C12552c0<T> extends C12279e<T> implements Callable<T> {

    /* renamed from: e */
    final Callable<? extends T> f32582e;

    public C12552c0(Callable<? extends T> callable) {
        this.f32582e = callable;
    }

    /* renamed from: a */
    public void mo35836a(Observer<? super T> observer) {
        C12470i iVar = new C12470i(observer);
        observer.onSubscribe(iVar);
        if (!iVar.isDisposed()) {
            try {
                Object call = this.f32582e.call();
                C12324b.m32836a(call, "Callable returned null");
                iVar.mo36676a(call);
            } catch (Throwable th) {
                C12285a.m32748b(th);
                if (!iVar.isDisposed()) {
                    observer.onError(th);
                } else {
                    C12768a.m33415b(th);
                }
            }
        }
    }

    public T call() throws Exception {
        T call = this.f32582e.call();
        C12324b.m32836a(call, "The callable returned a null value");
        return call;
    }
}
