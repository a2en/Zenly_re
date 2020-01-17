package p389io.reactivex.p393i.p395b.p397b;

import p389io.reactivex.MaybeObserver;
import p389io.reactivex.MaybeSource;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.functions.Predicate;
import p389io.reactivex.internal.disposables.C12458b;

/* renamed from: io.reactivex.i.b.b.g */
public final class C12355g<T> extends C12346a<T, T> {

    /* renamed from: f */
    final Predicate<? super T> f32075f;

    /* renamed from: io.reactivex.i.b.b.g$a */
    static final class C12356a<T> implements MaybeObserver<T>, Disposable {

        /* renamed from: e */
        final MaybeObserver<? super T> f32076e;

        /* renamed from: f */
        final Predicate<? super T> f32077f;

        /* renamed from: g */
        Disposable f32078g;

        C12356a(MaybeObserver<? super T> maybeObserver, Predicate<? super T> predicate) {
            this.f32076e = maybeObserver;
            this.f32077f = predicate;
        }

        public void dispose() {
            Disposable disposable = this.f32078g;
            this.f32078g = C12458b.DISPOSED;
            disposable.dispose();
        }

        public boolean isDisposed() {
            return this.f32078g.isDisposed();
        }

        public void onComplete() {
            this.f32076e.onComplete();
        }

        public void onError(Throwable th) {
            this.f32076e.onError(th);
        }

        public void onSubscribe(Disposable disposable) {
            if (C12458b.m32974a(this.f32078g, disposable)) {
                this.f32078g = disposable;
                this.f32076e.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            try {
                if (this.f32077f.test(t)) {
                    this.f32076e.onSuccess(t);
                } else {
                    this.f32076e.onComplete();
                }
            } catch (Throwable th) {
                C12285a.m32748b(th);
                this.f32076e.onError(th);
            }
        }
    }

    public C12355g(MaybeSource<T> maybeSource, Predicate<? super T> predicate) {
        super(maybeSource);
        this.f32075f = predicate;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36387a(MaybeObserver<? super T> maybeObserver) {
        this.f32051e.subscribe(new C12356a(maybeObserver, this.f32075f));
    }
}
