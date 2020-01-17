package p389io.reactivex.p393i.p395b.p397b;

import p389io.reactivex.MaybeObserver;
import p389io.reactivex.MaybeSource;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.functions.Function;
import p389io.reactivex.internal.disposables.C12458b;
import p389io.reactivex.p393i.p394a.C12324b;

/* renamed from: io.reactivex.i.b.b.l */
public final class C12364l<T, R> extends C12346a<T, R> {

    /* renamed from: f */
    final Function<? super T, ? extends R> f32091f;

    /* renamed from: io.reactivex.i.b.b.l$a */
    static final class C12365a<T, R> implements MaybeObserver<T>, Disposable {

        /* renamed from: e */
        final MaybeObserver<? super R> f32092e;

        /* renamed from: f */
        final Function<? super T, ? extends R> f32093f;

        /* renamed from: g */
        Disposable f32094g;

        C12365a(MaybeObserver<? super R> maybeObserver, Function<? super T, ? extends R> function) {
            this.f32092e = maybeObserver;
            this.f32093f = function;
        }

        public void dispose() {
            Disposable disposable = this.f32094g;
            this.f32094g = C12458b.DISPOSED;
            disposable.dispose();
        }

        public boolean isDisposed() {
            return this.f32094g.isDisposed();
        }

        public void onComplete() {
            this.f32092e.onComplete();
        }

        public void onError(Throwable th) {
            this.f32092e.onError(th);
        }

        public void onSubscribe(Disposable disposable) {
            if (C12458b.m32974a(this.f32094g, disposable)) {
                this.f32094g = disposable;
                this.f32092e.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            try {
                Object apply = this.f32093f.apply(t);
                C12324b.m32836a(apply, "The mapper returned a null item");
                this.f32092e.onSuccess(apply);
            } catch (Throwable th) {
                C12285a.m32748b(th);
                this.f32092e.onError(th);
            }
        }
    }

    public C12364l(MaybeSource<T> maybeSource, Function<? super T, ? extends R> function) {
        super(maybeSource);
        this.f32091f = function;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36387a(MaybeObserver<? super R> maybeObserver) {
        this.f32051e.subscribe(new C12365a(maybeObserver, this.f32091f));
    }
}
