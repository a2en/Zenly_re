package p389io.reactivex.p393i.p395b.p397b;

import p389io.reactivex.C12273d;
import p389io.reactivex.MaybeObserver;
import p389io.reactivex.SingleObserver;
import p389io.reactivex.SingleSource;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.functions.Predicate;
import p389io.reactivex.internal.disposables.C12458b;

/* renamed from: io.reactivex.i.b.b.h */
public final class C12357h<T> extends C12273d<T> {

    /* renamed from: e */
    final SingleSource<T> f32079e;

    /* renamed from: f */
    final Predicate<? super T> f32080f;

    /* renamed from: io.reactivex.i.b.b.h$a */
    static final class C12358a<T> implements SingleObserver<T>, Disposable {

        /* renamed from: e */
        final MaybeObserver<? super T> f32081e;

        /* renamed from: f */
        final Predicate<? super T> f32082f;

        /* renamed from: g */
        Disposable f32083g;

        C12358a(MaybeObserver<? super T> maybeObserver, Predicate<? super T> predicate) {
            this.f32081e = maybeObserver;
            this.f32082f = predicate;
        }

        public void dispose() {
            Disposable disposable = this.f32083g;
            this.f32083g = C12458b.DISPOSED;
            disposable.dispose();
        }

        public boolean isDisposed() {
            return this.f32083g.isDisposed();
        }

        public void onError(Throwable th) {
            this.f32081e.onError(th);
        }

        public void onSubscribe(Disposable disposable) {
            if (C12458b.m32974a(this.f32083g, disposable)) {
                this.f32083g = disposable;
                this.f32081e.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            try {
                if (this.f32082f.test(t)) {
                    this.f32081e.onSuccess(t);
                } else {
                    this.f32081e.onComplete();
                }
            } catch (Throwable th) {
                C12285a.m32748b(th);
                this.f32081e.onError(th);
            }
        }
    }

    public C12357h(SingleSource<T> singleSource, Predicate<? super T> predicate) {
        this.f32079e = singleSource;
        this.f32080f = predicate;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36387a(MaybeObserver<? super T> maybeObserver) {
        this.f32079e.subscribe(new C12358a(maybeObserver, this.f32080f));
    }
}
