package p389io.reactivex.internal.operators.observable;

import p389io.reactivex.C12279e;
import p389io.reactivex.C12291g;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.Observer;
import p389io.reactivex.SingleObserver;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.internal.disposables.C12458b;
import p389io.reactivex.internal.fuseable.FuseToObservable;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.internal.operators.observable.k */
public final class C12606k<T> extends C12291g<Long> implements FuseToObservable<Long> {

    /* renamed from: e */
    final ObservableSource<T> f32782e;

    /* renamed from: io.reactivex.internal.operators.observable.k$a */
    static final class C12607a implements Observer<Object>, Disposable {

        /* renamed from: e */
        final SingleObserver<? super Long> f32783e;

        /* renamed from: f */
        Disposable f32784f;

        /* renamed from: g */
        long f32785g;

        C12607a(SingleObserver<? super Long> singleObserver) {
            this.f32783e = singleObserver;
        }

        public void dispose() {
            this.f32784f.dispose();
            this.f32784f = C12458b.DISPOSED;
        }

        public boolean isDisposed() {
            return this.f32784f.isDisposed();
        }

        public void onComplete() {
            this.f32784f = C12458b.DISPOSED;
            this.f32783e.onSuccess(Long.valueOf(this.f32785g));
        }

        public void onError(Throwable th) {
            this.f32784f = C12458b.DISPOSED;
            this.f32783e.onError(th);
        }

        public void onNext(Object obj) {
            this.f32785g++;
        }

        public void onSubscribe(Disposable disposable) {
            if (C12458b.m32974a(this.f32784f, disposable)) {
                this.f32784f = disposable;
                this.f32783e.onSubscribe(this);
            }
        }
    }

    public C12606k(ObservableSource<T> observableSource) {
        this.f32782e = observableSource;
    }

    /* renamed from: a */
    public void mo36541a(SingleObserver<? super Long> singleObserver) {
        this.f32782e.subscribe(new C12607a(singleObserver));
    }

    public C12279e<Long> fuseToObservable() {
        return C12768a.m33396a((C12279e<T>) new C12600j<T>(this.f32782e));
    }
}
