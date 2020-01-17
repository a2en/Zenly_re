package p389io.reactivex.p393i.p395b.p399d;

import java.util.concurrent.Callable;
import p389io.reactivex.C12291g;
import p389io.reactivex.SingleObserver;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.internal.disposables.C12459c;
import p389io.reactivex.p393i.p394a.C12324b;

/* renamed from: io.reactivex.i.b.d.j */
public final class C12416j<T> extends C12291g<T> {

    /* renamed from: e */
    final Callable<? extends Throwable> f32215e;

    public C12416j(Callable<? extends Throwable> callable) {
        this.f32215e = callable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36541a(SingleObserver<? super T> singleObserver) {
        try {
            Object call = this.f32215e.call();
            C12324b.m32836a(call, "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
            th = (Throwable) call;
        } catch (Throwable th) {
            th = th;
            C12285a.m32748b(th);
        }
        C12459c.m32986a(th, singleObserver);
    }
}
