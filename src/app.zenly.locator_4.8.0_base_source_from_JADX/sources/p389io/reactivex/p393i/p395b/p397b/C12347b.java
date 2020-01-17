package p389io.reactivex.p393i.p395b.p397b;

import java.util.concurrent.atomic.AtomicReference;
import p389io.reactivex.MaybeObserver;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.exceptions.CompositeException;
import p389io.reactivex.functions.Action;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.internal.disposables.C12458b;
import p389io.reactivex.observers.LambdaConsumerIntrospection;
import p389io.reactivex.p393i.p394a.C12301a;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.i.b.b.b */
public final class C12347b<T> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable, LambdaConsumerIntrospection {
    private static final long serialVersionUID = -6076952298809384986L;

    /* renamed from: e */
    final Consumer<? super T> f32052e;

    /* renamed from: f */
    final Consumer<? super Throwable> f32053f;

    /* renamed from: g */
    final Action f32054g;

    public C12347b(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action) {
        this.f32052e = consumer;
        this.f32053f = consumer2;
        this.f32054g = action;
    }

    public void dispose() {
        C12458b.m32975a((AtomicReference<Disposable>) this);
    }

    public boolean hasCustomOnError() {
        return this.f32053f != C12301a.f31983e;
    }

    public boolean isDisposed() {
        return C12458b.m32973a((Disposable) get());
    }

    public void onComplete() {
        lazySet(C12458b.DISPOSED);
        try {
            this.f32054g.run();
        } catch (Throwable th) {
            C12285a.m32748b(th);
            C12768a.m33415b(th);
        }
    }

    public void onError(Throwable th) {
        lazySet(C12458b.DISPOSED);
        try {
            this.f32053f.accept(th);
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
            this.f32052e.accept(t);
        } catch (Throwable th) {
            C12285a.m32748b(th);
            C12768a.m33415b(th);
        }
    }
}
