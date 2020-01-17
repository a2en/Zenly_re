package p389io.reactivex.p393i.p395b.p397b;

import p389io.reactivex.MaybeObserver;
import p389io.reactivex.MaybeSource;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.exceptions.CompositeException;
import p389io.reactivex.functions.Function;
import p389io.reactivex.internal.disposables.C12458b;
import p389io.reactivex.p393i.p394a.C12324b;

/* renamed from: io.reactivex.i.b.b.n */
public final class C12368n<T> extends C12346a<T, T> {

    /* renamed from: f */
    final Function<? super Throwable, ? extends T> f32100f;

    /* renamed from: io.reactivex.i.b.b.n$a */
    static final class C12369a<T> implements MaybeObserver<T>, Disposable {

        /* renamed from: e */
        final MaybeObserver<? super T> f32101e;

        /* renamed from: f */
        final Function<? super Throwable, ? extends T> f32102f;

        /* renamed from: g */
        Disposable f32103g;

        C12369a(MaybeObserver<? super T> maybeObserver, Function<? super Throwable, ? extends T> function) {
            this.f32101e = maybeObserver;
            this.f32102f = function;
        }

        public void dispose() {
            this.f32103g.dispose();
        }

        public boolean isDisposed() {
            return this.f32103g.isDisposed();
        }

        public void onComplete() {
            this.f32101e.onComplete();
        }

        public void onError(Throwable th) {
            try {
                Object apply = this.f32102f.apply(th);
                C12324b.m32836a(apply, "The valueSupplier returned a null value");
                this.f32101e.onSuccess(apply);
            } catch (Throwable th2) {
                C12285a.m32748b(th2);
                this.f32101e.onError(new CompositeException(th, th2));
            }
        }

        public void onSubscribe(Disposable disposable) {
            if (C12458b.m32974a(this.f32103g, disposable)) {
                this.f32103g = disposable;
                this.f32101e.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            this.f32101e.onSuccess(t);
        }
    }

    public C12368n(MaybeSource<T> maybeSource, Function<? super Throwable, ? extends T> function) {
        super(maybeSource);
        this.f32100f = function;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36387a(MaybeObserver<? super T> maybeObserver) {
        this.f32051e.subscribe(new C12369a(maybeObserver, this.f32100f));
    }
}
