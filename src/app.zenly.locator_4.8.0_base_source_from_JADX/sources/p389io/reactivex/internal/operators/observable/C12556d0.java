package p389io.reactivex.internal.operators.observable;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import p389io.reactivex.C12279e;
import p389io.reactivex.Observer;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.internal.observers.C12470i;
import p389io.reactivex.p393i.p394a.C12324b;

/* renamed from: io.reactivex.internal.operators.observable.d0 */
public final class C12556d0<T> extends C12279e<T> {

    /* renamed from: e */
    final Future<? extends T> f32594e;

    /* renamed from: f */
    final long f32595f;

    /* renamed from: g */
    final TimeUnit f32596g;

    public C12556d0(Future<? extends T> future, long j, TimeUnit timeUnit) {
        this.f32594e = future;
        this.f32595f = j;
        this.f32596g = timeUnit;
    }

    /* renamed from: a */
    public void mo35836a(Observer<? super T> observer) {
        C12470i iVar = new C12470i(observer);
        observer.onSubscribe(iVar);
        if (!iVar.isDisposed()) {
            try {
                Object obj = this.f32596g != null ? this.f32594e.get(this.f32595f, this.f32596g) : this.f32594e.get();
                C12324b.m32836a(obj, "Future returned null");
                iVar.mo36676a(obj);
            } catch (Throwable th) {
                C12285a.m32748b(th);
                if (!iVar.isDisposed()) {
                    observer.onError(th);
                }
            }
        }
    }
}
