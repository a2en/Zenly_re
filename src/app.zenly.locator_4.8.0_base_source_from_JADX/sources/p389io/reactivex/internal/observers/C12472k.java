package p389io.reactivex.internal.observers;

import java.util.concurrent.atomic.AtomicReference;
import p389io.reactivex.CompletableObserver;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.exceptions.OnErrorNotImplementedException;
import p389io.reactivex.internal.disposables.C12458b;
import p389io.reactivex.observers.LambdaConsumerIntrospection;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.internal.observers.k */
public final class C12472k extends AtomicReference<Disposable> implements CompletableObserver, Disposable, LambdaConsumerIntrospection {
    private static final long serialVersionUID = -7545121636549663526L;

    public void dispose() {
        C12458b.m32975a((AtomicReference<Disposable>) this);
    }

    public boolean hasCustomOnError() {
        return false;
    }

    public boolean isDisposed() {
        return get() == C12458b.DISPOSED;
    }

    public void onComplete() {
        lazySet(C12458b.DISPOSED);
    }

    public void onError(Throwable th) {
        lazySet(C12458b.DISPOSED);
        C12768a.m33415b((Throwable) new OnErrorNotImplementedException(th));
    }

    public void onSubscribe(Disposable disposable) {
        C12458b.m32978c(this, disposable);
    }
}
