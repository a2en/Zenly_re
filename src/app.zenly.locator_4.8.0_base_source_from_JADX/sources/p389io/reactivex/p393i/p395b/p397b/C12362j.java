package p389io.reactivex.p393i.p395b.p397b;

import java.util.concurrent.Callable;
import p389io.reactivex.C12273d;
import p389io.reactivex.MaybeObserver;
import p389io.reactivex.disposables.C12276c;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.i.b.b.j */
public final class C12362j<T> extends C12273d<T> implements Callable<T> {

    /* renamed from: e */
    final Callable<? extends T> f32089e;

    public C12362j(Callable<? extends T> callable) {
        this.f32089e = callable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36387a(MaybeObserver<? super T> maybeObserver) {
        Disposable b = C12276c.m32595b();
        maybeObserver.onSubscribe(b);
        if (!b.isDisposed()) {
            try {
                Object call = this.f32089e.call();
                if (b.isDisposed()) {
                    return;
                }
                if (call == null) {
                    maybeObserver.onComplete();
                } else {
                    maybeObserver.onSuccess(call);
                }
            } catch (Throwable th) {
                C12285a.m32748b(th);
                if (!b.isDisposed()) {
                    maybeObserver.onError(th);
                } else {
                    C12768a.m33415b(th);
                }
            }
        }
    }

    public T call() throws Exception {
        return this.f32089e.call();
    }
}
