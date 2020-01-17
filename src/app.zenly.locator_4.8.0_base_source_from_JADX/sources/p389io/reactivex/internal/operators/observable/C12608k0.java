package p389io.reactivex.internal.operators.observable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p389io.reactivex.C12279e;
import p389io.reactivex.C12286f;
import p389io.reactivex.C12286f.C12289c;
import p389io.reactivex.Observer;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.internal.disposables.C12458b;
import p389io.reactivex.internal.schedulers.C12741m;

/* renamed from: io.reactivex.internal.operators.observable.k0 */
public final class C12608k0 extends C12279e<Long> {

    /* renamed from: e */
    final C12286f f32786e;

    /* renamed from: f */
    final long f32787f;

    /* renamed from: g */
    final long f32788g;

    /* renamed from: h */
    final TimeUnit f32789h;

    /* renamed from: io.reactivex.internal.operators.observable.k0$a */
    static final class C12609a extends AtomicReference<Disposable> implements Disposable, Runnable {
        private static final long serialVersionUID = 346773832286157679L;

        /* renamed from: e */
        final Observer<? super Long> f32790e;

        /* renamed from: f */
        long f32791f;

        C12609a(Observer<? super Long> observer) {
            this.f32790e = observer;
        }

        /* renamed from: a */
        public void mo36764a(Disposable disposable) {
            C12458b.m32978c(this, disposable);
        }

        public void dispose() {
            C12458b.m32975a((AtomicReference<Disposable>) this);
        }

        public boolean isDisposed() {
            return get() == C12458b.DISPOSED;
        }

        public void run() {
            if (get() != C12458b.DISPOSED) {
                Observer<? super Long> observer = this.f32790e;
                long j = this.f32791f;
                this.f32791f = 1 + j;
                observer.onNext(Long.valueOf(j));
            }
        }
    }

    public C12608k0(long j, long j2, TimeUnit timeUnit, C12286f fVar) {
        this.f32787f = j;
        this.f32788g = j2;
        this.f32789h = timeUnit;
        this.f32786e = fVar;
    }

    /* renamed from: a */
    public void mo35836a(Observer<? super Long> observer) {
        C12609a aVar = new C12609a(observer);
        observer.onSubscribe(aVar);
        C12286f fVar = this.f32786e;
        if (fVar instanceof C12741m) {
            C12289c a = fVar.mo6573a();
            aVar.mo36764a(a);
            a.mo6575a(aVar, this.f32787f, this.f32788g, this.f32789h);
            return;
        }
        aVar.mo36764a(fVar.mo6571a(aVar, this.f32787f, this.f32788g, this.f32789h));
    }
}
