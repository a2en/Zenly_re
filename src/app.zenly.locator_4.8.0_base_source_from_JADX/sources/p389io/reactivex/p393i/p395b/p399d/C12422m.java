package p389io.reactivex.p393i.p395b.p399d;

import java.util.concurrent.Callable;
import p389io.reactivex.C12291g;
import p389io.reactivex.SingleObserver;
import p389io.reactivex.disposables.C12276c;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.p393i.p394a.C12324b;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.i.b.d.m */
public final class C12422m<T> extends C12291g<T> {

    /* renamed from: e */
    final Callable<? extends T> f32226e;

    public C12422m(Callable<? extends T> callable) {
        this.f32226e = callable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36541a(SingleObserver<? super T> singleObserver) {
        Disposable b = C12276c.m32595b();
        singleObserver.onSubscribe(b);
        if (!b.isDisposed()) {
            try {
                Object call = this.f32226e.call();
                C12324b.m32836a(call, "The callable returned a null value");
                if (!b.isDisposed()) {
                    singleObserver.onSuccess(call);
                }
            } catch (Throwable th) {
                C12285a.m32748b(th);
                if (!b.isDisposed()) {
                    singleObserver.onError(th);
                } else {
                    C12768a.m33415b(th);
                }
            }
        }
    }
}
