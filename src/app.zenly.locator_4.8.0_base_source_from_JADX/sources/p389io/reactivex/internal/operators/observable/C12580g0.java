package p389io.reactivex.internal.operators.observable;

import p389io.reactivex.C12279e;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.Observer;

/* renamed from: io.reactivex.internal.operators.observable.g0 */
public final class C12580g0<T> extends C12279e<T> {

    /* renamed from: e */
    final ObservableSource<T> f32692e;

    public C12580g0(ObservableSource<T> observableSource) {
        this.f32692e = observableSource;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo35836a(Observer<? super T> observer) {
        this.f32692e.subscribe(observer);
    }
}
