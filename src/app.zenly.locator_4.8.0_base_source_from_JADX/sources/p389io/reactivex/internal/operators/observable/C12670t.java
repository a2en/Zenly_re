package p389io.reactivex.internal.operators.observable;

import p389io.reactivex.C12273d;
import p389io.reactivex.C12279e;
import p389io.reactivex.MaybeObserver;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.Observer;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.internal.disposables.C12458b;
import p389io.reactivex.internal.fuseable.FuseToObservable;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.internal.operators.observable.t */
public final class C12670t<T> extends C12273d<T> implements FuseToObservable<T> {

    /* renamed from: e */
    final ObservableSource<T> f32987e;

    /* renamed from: f */
    final long f32988f;

    /* renamed from: io.reactivex.internal.operators.observable.t$a */
    static final class C12671a<T> implements Observer<T>, Disposable {

        /* renamed from: e */
        final MaybeObserver<? super T> f32989e;

        /* renamed from: f */
        final long f32990f;

        /* renamed from: g */
        Disposable f32991g;

        /* renamed from: h */
        long f32992h;

        /* renamed from: i */
        boolean f32993i;

        C12671a(MaybeObserver<? super T> maybeObserver, long j) {
            this.f32989e = maybeObserver;
            this.f32990f = j;
        }

        public void dispose() {
            this.f32991g.dispose();
        }

        public boolean isDisposed() {
            return this.f32991g.isDisposed();
        }

        public void onComplete() {
            if (!this.f32993i) {
                this.f32993i = true;
                this.f32989e.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f32993i) {
                C12768a.m33415b(th);
                return;
            }
            this.f32993i = true;
            this.f32989e.onError(th);
        }

        public void onNext(T t) {
            if (!this.f32993i) {
                long j = this.f32992h;
                if (j == this.f32990f) {
                    this.f32993i = true;
                    this.f32991g.dispose();
                    this.f32989e.onSuccess(t);
                    return;
                }
                this.f32992h = j + 1;
            }
        }

        public void onSubscribe(Disposable disposable) {
            if (C12458b.m32974a(this.f32991g, disposable)) {
                this.f32991g = disposable;
                this.f32989e.onSubscribe(this);
            }
        }
    }

    public C12670t(ObservableSource<T> observableSource, long j) {
        this.f32987e = observableSource;
        this.f32988f = j;
    }

    /* renamed from: a */
    public void mo36387a(MaybeObserver<? super T> maybeObserver) {
        this.f32987e.subscribe(new C12671a(maybeObserver, this.f32988f));
    }

    public C12279e<T> fuseToObservable() {
        C12662s sVar = new C12662s(this.f32987e, this.f32988f, null, false);
        return C12768a.m33396a((C12279e<T>) sVar);
    }
}
