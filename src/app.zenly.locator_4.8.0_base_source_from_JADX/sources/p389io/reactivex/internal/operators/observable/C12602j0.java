package p389io.reactivex.internal.operators.observable;

import p389io.reactivex.C12271b;
import p389io.reactivex.C12279e;
import p389io.reactivex.CompletableObserver;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.Observer;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.internal.fuseable.FuseToObservable;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.internal.operators.observable.j0 */
public final class C12602j0<T> extends C12271b implements FuseToObservable<T> {

    /* renamed from: e */
    final ObservableSource<T> f32776e;

    /* renamed from: io.reactivex.internal.operators.observable.j0$a */
    static final class C12603a<T> implements Observer<T>, Disposable {

        /* renamed from: e */
        final CompletableObserver f32777e;

        /* renamed from: f */
        Disposable f32778f;

        C12603a(CompletableObserver completableObserver) {
            this.f32777e = completableObserver;
        }

        public void dispose() {
            this.f32778f.dispose();
        }

        public boolean isDisposed() {
            return this.f32778f.isDisposed();
        }

        public void onComplete() {
            this.f32777e.onComplete();
        }

        public void onError(Throwable th) {
            this.f32777e.onError(th);
        }

        public void onNext(T t) {
        }

        public void onSubscribe(Disposable disposable) {
            this.f32778f = disposable;
            this.f32777e.onSubscribe(this);
        }
    }

    public C12602j0(ObservableSource<T> observableSource) {
        this.f32776e = observableSource;
    }

    /* renamed from: a */
    public void mo36349a(CompletableObserver completableObserver) {
        this.f32776e.subscribe(new C12603a(completableObserver));
    }

    public C12279e<T> fuseToObservable() {
        return C12768a.m33396a((C12279e<T>) new C12596i0<T>(this.f32776e));
    }
}
