package p389io.reactivex.p393i.p395b.p399d;

import java.util.concurrent.atomic.AtomicReference;
import p389io.reactivex.C12286f;
import p389io.reactivex.C12291g;
import p389io.reactivex.SingleObserver;
import p389io.reactivex.SingleSource;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.internal.disposables.C12458b;

/* renamed from: io.reactivex.i.b.d.q */
public final class C12427q<T> extends C12291g<T> {

    /* renamed from: e */
    final SingleSource<T> f32233e;

    /* renamed from: f */
    final C12286f f32234f;

    /* renamed from: io.reactivex.i.b.d.q$a */
    static final class C12428a<T> extends AtomicReference<Disposable> implements SingleObserver<T>, Disposable, Runnable {
        private static final long serialVersionUID = 3528003840217436037L;

        /* renamed from: e */
        final SingleObserver<? super T> f32235e;

        /* renamed from: f */
        final C12286f f32236f;

        /* renamed from: g */
        T f32237g;

        /* renamed from: h */
        Throwable f32238h;

        C12428a(SingleObserver<? super T> singleObserver, C12286f fVar) {
            this.f32235e = singleObserver;
            this.f32236f = fVar;
        }

        public void dispose() {
            C12458b.m32975a((AtomicReference<Disposable>) this);
        }

        public boolean isDisposed() {
            return C12458b.m32973a((Disposable) get());
        }

        public void onError(Throwable th) {
            this.f32238h = th;
            C12458b.m32976a((AtomicReference<Disposable>) this, this.f32236f.mo6570a(this));
        }

        public void onSubscribe(Disposable disposable) {
            if (C12458b.m32978c(this, disposable)) {
                this.f32235e.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            this.f32237g = t;
            C12458b.m32976a((AtomicReference<Disposable>) this, this.f32236f.mo6570a(this));
        }

        public void run() {
            Throwable th = this.f32238h;
            if (th != null) {
                this.f32235e.onError(th);
            } else {
                this.f32235e.onSuccess(this.f32237g);
            }
        }
    }

    public C12427q(SingleSource<T> singleSource, C12286f fVar) {
        this.f32233e = singleSource;
        this.f32234f = fVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36541a(SingleObserver<? super T> singleObserver) {
        this.f32233e.subscribe(new C12428a(singleObserver, this.f32234f));
    }
}
