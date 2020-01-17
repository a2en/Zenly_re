package p389io.reactivex.p393i.p395b.p397b;

import p389io.reactivex.C12279e;
import p389io.reactivex.MaybeObserver;
import p389io.reactivex.MaybeSource;
import p389io.reactivex.Observer;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.internal.disposables.C12458b;
import p389io.reactivex.internal.fuseable.HasUpstreamMaybeSource;
import p389io.reactivex.internal.observers.C12470i;

/* renamed from: io.reactivex.i.b.b.u */
public final class C12386u<T> extends C12279e<T> implements HasUpstreamMaybeSource<T> {

    /* renamed from: e */
    final MaybeSource<T> f32137e;

    /* renamed from: io.reactivex.i.b.b.u$a */
    static final class C12387a<T> extends C12470i<T> implements MaybeObserver<T> {
        private static final long serialVersionUID = 7603343402964826922L;

        /* renamed from: g */
        Disposable f32138g;

        C12387a(Observer<? super T> observer) {
            super(observer);
        }

        public void dispose() {
            super.dispose();
            this.f32138g.dispose();
        }

        public void onComplete() {
            mo36675a();
        }

        public void onError(Throwable th) {
            mo36677a(th);
        }

        public void onSubscribe(Disposable disposable) {
            if (C12458b.m32974a(this.f32138g, disposable)) {
                this.f32138g = disposable;
                this.f32337e.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            mo36676a(t);
        }
    }

    public C12386u(MaybeSource<T> maybeSource) {
        this.f32137e = maybeSource;
    }

    /* renamed from: b */
    public static <T> MaybeObserver<T> m32877b(Observer<? super T> observer) {
        return new C12387a(observer);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo35836a(Observer<? super T> observer) {
        this.f32137e.subscribe(m32877b(observer));
    }

    public MaybeSource<T> source() {
        return this.f32137e;
    }
}
