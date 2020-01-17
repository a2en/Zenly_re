package p389io.reactivex.p393i.p395b.p399d;

import java.util.concurrent.Callable;
import p389io.reactivex.C12291g;
import p389io.reactivex.SingleObserver;
import p389io.reactivex.SingleSource;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.internal.disposables.C12459c;
import p389io.reactivex.p393i.p394a.C12324b;

/* renamed from: io.reactivex.i.b.d.c */
public final class C12403c<T> extends C12291g<T> {

    /* renamed from: e */
    final Callable<? extends SingleSource<? extends T>> f32188e;

    public C12403c(Callable<? extends SingleSource<? extends T>> callable) {
        this.f32188e = callable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36541a(SingleObserver<? super T> singleObserver) {
        try {
            Object call = this.f32188e.call();
            C12324b.m32836a(call, "The singleSupplier returned a null SingleSource");
            ((SingleSource) call).subscribe(singleObserver);
        } catch (Throwable th) {
            C12285a.m32748b(th);
            C12459c.m32986a(th, singleObserver);
        }
    }
}
