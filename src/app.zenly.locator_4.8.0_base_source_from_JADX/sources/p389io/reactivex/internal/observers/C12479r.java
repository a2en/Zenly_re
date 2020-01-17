package p389io.reactivex.internal.observers;

import java.util.concurrent.atomic.AtomicReference;
import p389io.reactivex.SingleObserver;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.internal.disposables.C12458b;

/* renamed from: io.reactivex.internal.observers.r */
public final class C12479r<T> implements SingleObserver<T> {

    /* renamed from: e */
    final AtomicReference<Disposable> f32353e;

    /* renamed from: f */
    final SingleObserver<? super T> f32354f;

    public C12479r(AtomicReference<Disposable> atomicReference, SingleObserver<? super T> singleObserver) {
        this.f32353e = atomicReference;
        this.f32354f = singleObserver;
    }

    public void onError(Throwable th) {
        this.f32354f.onError(th);
    }

    public void onSubscribe(Disposable disposable) {
        C12458b.m32976a(this.f32353e, disposable);
    }

    public void onSuccess(T t) {
        this.f32354f.onSuccess(t);
    }
}
