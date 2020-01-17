package p389io.reactivex.internal.operators.observable;

import p389io.reactivex.C12279e;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.internal.fuseable.HasUpstreamObservableSource;

/* renamed from: io.reactivex.internal.operators.observable.a */
abstract class C12538a<T, U> extends C12279e<U> implements HasUpstreamObservableSource<T> {

    /* renamed from: e */
    protected final ObservableSource<T> f32549e;

    C12538a(ObservableSource<T> observableSource) {
        this.f32549e = observableSource;
    }

    public final ObservableSource<T> source() {
        return this.f32549e;
    }
}
