package p389io.reactivex.internal.observers;

import java.util.concurrent.atomic.AtomicReference;
import p389io.reactivex.SingleObserver;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.exceptions.CompositeException;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.internal.disposables.C12458b;
import p389io.reactivex.observers.LambdaConsumerIntrospection;
import p389io.reactivex.p393i.p394a.C12301a;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.internal.observers.h */
public final class C12469h<T> extends AtomicReference<Disposable> implements SingleObserver<T>, Disposable, LambdaConsumerIntrospection {
    private static final long serialVersionUID = -7012088219455310787L;

    /* renamed from: e */
    final Consumer<? super T> f32335e;

    /* renamed from: f */
    final Consumer<? super Throwable> f32336f;

    public C12469h(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2) {
        this.f32335e = consumer;
        this.f32336f = consumer2;
    }

    public void dispose() {
        C12458b.m32975a((AtomicReference<Disposable>) this);
    }

    public boolean hasCustomOnError() {
        return this.f32336f != C12301a.f31983e;
    }

    public boolean isDisposed() {
        return get() == C12458b.DISPOSED;
    }

    public void onError(Throwable th) {
        lazySet(C12458b.DISPOSED);
        try {
            this.f32336f.accept(th);
        } catch (Throwable th2) {
            C12285a.m32748b(th2);
            C12768a.m33415b((Throwable) new CompositeException(th, th2));
        }
    }

    public void onSubscribe(Disposable disposable) {
        C12458b.m32978c(this, disposable);
    }

    public void onSuccess(T t) {
        lazySet(C12458b.DISPOSED);
        try {
            this.f32335e.accept(t);
        } catch (Throwable th) {
            C12285a.m32748b(th);
            C12768a.m33415b(th);
        }
    }
}
