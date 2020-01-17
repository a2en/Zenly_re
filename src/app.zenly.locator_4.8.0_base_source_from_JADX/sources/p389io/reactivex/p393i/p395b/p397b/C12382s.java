package p389io.reactivex.p393i.p395b.p397b;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p389io.reactivex.C12273d;
import p389io.reactivex.C12286f;
import p389io.reactivex.MaybeObserver;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.internal.disposables.C12458b;

/* renamed from: io.reactivex.i.b.b.s */
public final class C12382s extends C12273d<Long> {

    /* renamed from: e */
    final long f32131e;

    /* renamed from: f */
    final TimeUnit f32132f;

    /* renamed from: g */
    final C12286f f32133g;

    /* renamed from: io.reactivex.i.b.b.s$a */
    static final class C12383a extends AtomicReference<Disposable> implements Disposable, Runnable {
        private static final long serialVersionUID = 2875964065294031672L;

        /* renamed from: e */
        final MaybeObserver<? super Long> f32134e;

        C12383a(MaybeObserver<? super Long> maybeObserver) {
            this.f32134e = maybeObserver;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo36601a(Disposable disposable) {
            C12458b.m32976a((AtomicReference<Disposable>) this, disposable);
        }

        public void dispose() {
            C12458b.m32975a((AtomicReference<Disposable>) this);
        }

        public boolean isDisposed() {
            return C12458b.m32973a((Disposable) get());
        }

        public void run() {
            this.f32134e.onSuccess(Long.valueOf(0));
        }
    }

    public C12382s(long j, TimeUnit timeUnit, C12286f fVar) {
        this.f32131e = j;
        this.f32132f = timeUnit;
        this.f32133g = fVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36387a(MaybeObserver<? super Long> maybeObserver) {
        C12383a aVar = new C12383a(maybeObserver);
        maybeObserver.onSubscribe(aVar);
        aVar.mo36601a(this.f32133g.mo6572a(aVar, this.f32131e, this.f32132f));
    }
}
