package p389io.reactivex.p393i.p395b.p397b;

import p389io.reactivex.C12273d;
import p389io.reactivex.MaybeObserver;
import p389io.reactivex.disposables.C12276c;
import p389io.reactivex.internal.fuseable.ScalarCallable;

/* renamed from: io.reactivex.i.b.b.k */
public final class C12363k<T> extends C12273d<T> implements ScalarCallable<T> {

    /* renamed from: e */
    final T f32090e;

    public C12363k(T t) {
        this.f32090e = t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36387a(MaybeObserver<? super T> maybeObserver) {
        maybeObserver.onSubscribe(C12276c.m32592a());
        maybeObserver.onSuccess(this.f32090e);
    }

    public T call() {
        return this.f32090e;
    }
}
