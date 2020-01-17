package p389io.reactivex.p393i.p395b.p396a;

import java.util.concurrent.Callable;
import p389io.reactivex.C12271b;
import p389io.reactivex.CompletableObserver;
import p389io.reactivex.disposables.C12276c;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.i.b.a.g */
public final class C12337g extends C12271b {

    /* renamed from: e */
    final Callable<?> f32025e;

    public C12337g(Callable<?> callable) {
        this.f32025e = callable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36349a(CompletableObserver completableObserver) {
        Disposable b = C12276c.m32595b();
        completableObserver.onSubscribe(b);
        try {
            this.f32025e.call();
            if (!b.isDisposed()) {
                completableObserver.onComplete();
            }
        } catch (Throwable th) {
            C12285a.m32748b(th);
            if (!b.isDisposed()) {
                completableObserver.onError(th);
            } else {
                C12768a.m33415b(th);
            }
        }
    }
}
