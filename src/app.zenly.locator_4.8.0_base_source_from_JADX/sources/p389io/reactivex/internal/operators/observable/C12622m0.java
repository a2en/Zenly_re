package p389io.reactivex.internal.operators.observable;

import p389io.reactivex.C12273d;
import p389io.reactivex.MaybeObserver;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.Observer;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.internal.disposables.C12458b;

/* renamed from: io.reactivex.internal.operators.observable.m0 */
public final class C12622m0<T> extends C12273d<T> {

    /* renamed from: e */
    final ObservableSource<T> f32825e;

    /* renamed from: io.reactivex.internal.operators.observable.m0$a */
    static final class C12623a<T> implements Observer<T>, Disposable {

        /* renamed from: e */
        final MaybeObserver<? super T> f32826e;

        /* renamed from: f */
        Disposable f32827f;

        /* renamed from: g */
        T f32828g;

        C12623a(MaybeObserver<? super T> maybeObserver) {
            this.f32826e = maybeObserver;
        }

        public void dispose() {
            this.f32827f.dispose();
            this.f32827f = C12458b.DISPOSED;
        }

        public boolean isDisposed() {
            return this.f32827f == C12458b.DISPOSED;
        }

        public void onComplete() {
            this.f32827f = C12458b.DISPOSED;
            T t = this.f32828g;
            if (t != null) {
                this.f32828g = null;
                this.f32826e.onSuccess(t);
                return;
            }
            this.f32826e.onComplete();
        }

        public void onError(Throwable th) {
            this.f32827f = C12458b.DISPOSED;
            this.f32828g = null;
            this.f32826e.onError(th);
        }

        public void onNext(T t) {
            this.f32828g = t;
        }

        public void onSubscribe(Disposable disposable) {
            if (C12458b.m32974a(this.f32827f, disposable)) {
                this.f32827f = disposable;
                this.f32826e.onSubscribe(this);
            }
        }
    }

    public C12622m0(ObservableSource<T> observableSource) {
        this.f32825e = observableSource;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36387a(MaybeObserver<? super T> maybeObserver) {
        this.f32825e.subscribe(new C12623a(maybeObserver));
    }
}
