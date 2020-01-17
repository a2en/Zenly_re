package p389io.reactivex.p393i.p395b.p397b;

import java.util.concurrent.atomic.AtomicReference;
import p389io.reactivex.C12286f;
import p389io.reactivex.MaybeObserver;
import p389io.reactivex.MaybeSource;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.internal.disposables.C12458b;
import p389io.reactivex.internal.disposables.C12461e;

/* renamed from: io.reactivex.i.b.b.p */
public final class C12372p<T> extends C12346a<T, T> {

    /* renamed from: f */
    final C12286f f32113f;

    /* renamed from: io.reactivex.i.b.b.p$a */
    static final class C12373a<T> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable {
        private static final long serialVersionUID = 8571289934935992137L;

        /* renamed from: e */
        final C12461e f32114e = new C12461e();

        /* renamed from: f */
        final MaybeObserver<? super T> f32115f;

        C12373a(MaybeObserver<? super T> maybeObserver) {
            this.f32115f = maybeObserver;
        }

        public void dispose() {
            C12458b.m32975a((AtomicReference<Disposable>) this);
            this.f32114e.dispose();
        }

        public boolean isDisposed() {
            return C12458b.m32973a((Disposable) get());
        }

        public void onComplete() {
            this.f32115f.onComplete();
        }

        public void onError(Throwable th) {
            this.f32115f.onError(th);
        }

        public void onSubscribe(Disposable disposable) {
            C12458b.m32978c(this, disposable);
        }

        public void onSuccess(T t) {
            this.f32115f.onSuccess(t);
        }
    }

    /* renamed from: io.reactivex.i.b.b.p$b */
    static final class C12374b<T> implements Runnable {

        /* renamed from: e */
        final MaybeObserver<? super T> f32116e;

        /* renamed from: f */
        final MaybeSource<T> f32117f;

        C12374b(MaybeObserver<? super T> maybeObserver, MaybeSource<T> maybeSource) {
            this.f32116e = maybeObserver;
            this.f32117f = maybeSource;
        }

        public void run() {
            this.f32117f.subscribe(this.f32116e);
        }
    }

    public C12372p(MaybeSource<T> maybeSource, C12286f fVar) {
        super(maybeSource);
        this.f32113f = fVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36387a(MaybeObserver<? super T> maybeObserver) {
        C12373a aVar = new C12373a(maybeObserver);
        maybeObserver.onSubscribe(aVar);
        aVar.f32114e.mo36653a(this.f32113f.mo6570a(new C12374b(aVar, this.f32051e)));
    }
}
