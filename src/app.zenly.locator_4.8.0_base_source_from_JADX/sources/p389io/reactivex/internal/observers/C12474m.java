package p389io.reactivex.internal.observers;

import java.util.concurrent.atomic.AtomicReference;
import p389io.reactivex.Observer;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.exceptions.CompositeException;
import p389io.reactivex.functions.Action;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.internal.disposables.C12458b;
import p389io.reactivex.observers.LambdaConsumerIntrospection;
import p389io.reactivex.p393i.p394a.C12301a;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.internal.observers.m */
public final class C12474m<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable, LambdaConsumerIntrospection {
    private static final long serialVersionUID = -7251123623727029452L;

    /* renamed from: e */
    final Consumer<? super T> f32343e;

    /* renamed from: f */
    final Consumer<? super Throwable> f32344f;

    /* renamed from: g */
    final Action f32345g;

    /* renamed from: h */
    final Consumer<? super Disposable> f32346h;

    public C12474m(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action, Consumer<? super Disposable> consumer3) {
        this.f32343e = consumer;
        this.f32344f = consumer2;
        this.f32345g = action;
        this.f32346h = consumer3;
    }

    public void dispose() {
        C12458b.m32975a((AtomicReference<Disposable>) this);
    }

    public boolean hasCustomOnError() {
        return this.f32344f != C12301a.f31983e;
    }

    public boolean isDisposed() {
        return get() == C12458b.DISPOSED;
    }

    public void onComplete() {
        if (!isDisposed()) {
            lazySet(C12458b.DISPOSED);
            try {
                this.f32345g.run();
            } catch (Throwable th) {
                C12285a.m32748b(th);
                C12768a.m33415b(th);
            }
        }
    }

    public void onError(Throwable th) {
        if (!isDisposed()) {
            lazySet(C12458b.DISPOSED);
            try {
                this.f32344f.accept(th);
            } catch (Throwable th2) {
                C12285a.m32748b(th2);
                C12768a.m33415b((Throwable) new CompositeException(th, th2));
            }
        } else {
            C12768a.m33415b(th);
        }
    }

    public void onNext(T t) {
        if (!isDisposed()) {
            try {
                this.f32343e.accept(t);
            } catch (Throwable th) {
                C12285a.m32748b(th);
                ((Disposable) get()).dispose();
                onError(th);
            }
        }
    }

    public void onSubscribe(Disposable disposable) {
        if (C12458b.m32978c(this, disposable)) {
            try {
                this.f32346h.accept(this);
            } catch (Throwable th) {
                C12285a.m32748b(th);
                disposable.dispose();
                onError(th);
            }
        }
    }
}
