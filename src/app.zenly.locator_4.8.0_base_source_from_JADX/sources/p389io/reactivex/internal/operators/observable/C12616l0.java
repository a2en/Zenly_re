package p389io.reactivex.internal.operators.observable;

import p389io.reactivex.C12279e;
import p389io.reactivex.Observer;
import p389io.reactivex.internal.fuseable.ScalarCallable;
import p389io.reactivex.internal.operators.observable.C12541a1.C12542a;

/* renamed from: io.reactivex.internal.operators.observable.l0 */
public final class C12616l0<T> extends C12279e<T> implements ScalarCallable<T> {

    /* renamed from: e */
    private final T f32804e;

    public C12616l0(T t) {
        this.f32804e = t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo35836a(Observer<? super T> observer) {
        C12542a aVar = new C12542a(observer, this.f32804e);
        observer.onSubscribe(aVar);
        aVar.run();
    }

    public T call() {
        return this.f32804e;
    }
}
