package p389io.reactivex.internal.observers;

import java.util.concurrent.atomic.AtomicReference;
import p389io.reactivex.CompletableObserver;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.exceptions.OnErrorNotImplementedException;
import p389io.reactivex.functions.Action;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.internal.disposables.C12458b;
import p389io.reactivex.observers.LambdaConsumerIntrospection;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.internal.observers.g */
public final class C12468g extends AtomicReference<Disposable> implements CompletableObserver, Disposable, Consumer<Throwable>, LambdaConsumerIntrospection {
    private static final long serialVersionUID = -4361286194466301354L;

    /* renamed from: e */
    final Consumer<? super Throwable> f32333e;

    /* renamed from: f */
    final Action f32334f;

    public C12468g(Action action) {
        this.f32333e = this;
        this.f32334f = action;
    }

    /* renamed from: a */
    public void accept(Throwable th) {
        C12768a.m33415b((Throwable) new OnErrorNotImplementedException(th));
    }

    public void dispose() {
        C12458b.m32975a((AtomicReference<Disposable>) this);
    }

    public boolean hasCustomOnError() {
        return this.f32333e != this;
    }

    public boolean isDisposed() {
        return get() == C12458b.DISPOSED;
    }

    public void onComplete() {
        try {
            this.f32334f.run();
        } catch (Throwable th) {
            C12285a.m32748b(th);
            C12768a.m33415b(th);
        }
        lazySet(C12458b.DISPOSED);
    }

    public void onError(Throwable th) {
        try {
            this.f32333e.accept(th);
        } catch (Throwable th2) {
            C12285a.m32748b(th2);
            C12768a.m33415b(th2);
        }
        lazySet(C12458b.DISPOSED);
    }

    public void onSubscribe(Disposable disposable) {
        C12458b.m32978c(this, disposable);
    }

    public C12468g(Consumer<? super Throwable> consumer, Action action) {
        this.f32333e = consumer;
        this.f32334f = action;
    }
}
