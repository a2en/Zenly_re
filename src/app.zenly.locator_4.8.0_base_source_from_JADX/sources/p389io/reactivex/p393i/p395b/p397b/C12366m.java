package p389io.reactivex.p393i.p395b.p397b;

import java.util.concurrent.atomic.AtomicReference;
import p389io.reactivex.C12286f;
import p389io.reactivex.MaybeObserver;
import p389io.reactivex.MaybeSource;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.internal.disposables.C12458b;

/* renamed from: io.reactivex.i.b.b.m */
public final class C12366m<T> extends C12346a<T, T> {

    /* renamed from: f */
    final C12286f f32095f;

    /* renamed from: io.reactivex.i.b.b.m$a */
    static final class C12367a<T> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable, Runnable {
        private static final long serialVersionUID = 8571289934935992137L;

        /* renamed from: e */
        final MaybeObserver<? super T> f32096e;

        /* renamed from: f */
        final C12286f f32097f;

        /* renamed from: g */
        T f32098g;

        /* renamed from: h */
        Throwable f32099h;

        C12367a(MaybeObserver<? super T> maybeObserver, C12286f fVar) {
            this.f32096e = maybeObserver;
            this.f32097f = fVar;
        }

        public void dispose() {
            C12458b.m32975a((AtomicReference<Disposable>) this);
        }

        public boolean isDisposed() {
            return C12458b.m32973a((Disposable) get());
        }

        public void onComplete() {
            C12458b.m32976a((AtomicReference<Disposable>) this, this.f32097f.mo6570a(this));
        }

        public void onError(Throwable th) {
            this.f32099h = th;
            C12458b.m32976a((AtomicReference<Disposable>) this, this.f32097f.mo6570a(this));
        }

        public void onSubscribe(Disposable disposable) {
            if (C12458b.m32978c(this, disposable)) {
                this.f32096e.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            this.f32098g = t;
            C12458b.m32976a((AtomicReference<Disposable>) this, this.f32097f.mo6570a(this));
        }

        public void run() {
            Throwable th = this.f32099h;
            if (th != null) {
                this.f32099h = null;
                this.f32096e.onError(th);
                return;
            }
            T t = this.f32098g;
            if (t != null) {
                this.f32098g = null;
                this.f32096e.onSuccess(t);
                return;
            }
            this.f32096e.onComplete();
        }
    }

    public C12366m(MaybeSource<T> maybeSource, C12286f fVar) {
        super(maybeSource);
        this.f32095f = fVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36387a(MaybeObserver<? super T> maybeObserver) {
        this.f32051e.subscribe(new C12367a(maybeObserver, this.f32095f));
    }
}
