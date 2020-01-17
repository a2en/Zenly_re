package p389io.reactivex.p393i.p395b.p399d;

import p389io.reactivex.C12291g;
import p389io.reactivex.SingleObserver;
import p389io.reactivex.disposables.C12276c;

/* renamed from: io.reactivex.i.b.d.n */
public final class C12423n<T> extends C12291g<T> {

    /* renamed from: e */
    final T f32227e;

    public C12423n(T t) {
        this.f32227e = t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36541a(SingleObserver<? super T> singleObserver) {
        singleObserver.onSubscribe(C12276c.m32592a());
        singleObserver.onSuccess(this.f32227e);
    }
}
