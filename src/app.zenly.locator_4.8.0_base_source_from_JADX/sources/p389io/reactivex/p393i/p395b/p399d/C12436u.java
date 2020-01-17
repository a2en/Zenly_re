package p389io.reactivex.p393i.p395b.p399d;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p389io.reactivex.C12286f;
import p389io.reactivex.C12291g;
import p389io.reactivex.SingleObserver;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.internal.disposables.C12458b;

/* renamed from: io.reactivex.i.b.d.u */
public final class C12436u extends C12291g<Long> {

    /* renamed from: e */
    final long f32261e;

    /* renamed from: f */
    final TimeUnit f32262f;

    /* renamed from: g */
    final C12286f f32263g;

    /* renamed from: io.reactivex.i.b.d.u$a */
    static final class C12437a extends AtomicReference<Disposable> implements Disposable, Runnable {
        private static final long serialVersionUID = 8465401857522493082L;

        /* renamed from: e */
        final SingleObserver<? super Long> f32264e;

        C12437a(SingleObserver<? super Long> singleObserver) {
            this.f32264e = singleObserver;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo36617a(Disposable disposable) {
            C12458b.m32976a((AtomicReference<Disposable>) this, disposable);
        }

        public void dispose() {
            C12458b.m32975a((AtomicReference<Disposable>) this);
        }

        public boolean isDisposed() {
            return C12458b.m32973a((Disposable) get());
        }

        public void run() {
            this.f32264e.onSuccess(Long.valueOf(0));
        }
    }

    public C12436u(long j, TimeUnit timeUnit, C12286f fVar) {
        this.f32261e = j;
        this.f32262f = timeUnit;
        this.f32263g = fVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36541a(SingleObserver<? super Long> singleObserver) {
        C12437a aVar = new C12437a(singleObserver);
        singleObserver.onSubscribe(aVar);
        aVar.mo36617a(this.f32263g.mo6572a(aVar, this.f32261e, this.f32262f));
    }
}
