package p389io.reactivex.internal.operators.observable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p389io.reactivex.C12279e;
import p389io.reactivex.C12286f;
import p389io.reactivex.Observer;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.internal.disposables.C12458b;
import p389io.reactivex.internal.disposables.C12459c;

/* renamed from: io.reactivex.internal.operators.observable.p1 */
public final class C12647p1 extends C12279e<Long> {

    /* renamed from: e */
    final C12286f f32920e;

    /* renamed from: f */
    final long f32921f;

    /* renamed from: g */
    final TimeUnit f32922g;

    /* renamed from: io.reactivex.internal.operators.observable.p1$a */
    static final class C12648a extends AtomicReference<Disposable> implements Disposable, Runnable {
        private static final long serialVersionUID = -2809475196591179431L;

        /* renamed from: e */
        final Observer<? super Long> f32923e;

        C12648a(Observer<? super Long> observer) {
            this.f32923e = observer;
        }

        /* renamed from: a */
        public void mo36788a(Disposable disposable) {
            C12458b.m32979d(this, disposable);
        }

        public void dispose() {
            C12458b.m32975a((AtomicReference<Disposable>) this);
        }

        public boolean isDisposed() {
            return get() == C12458b.DISPOSED;
        }

        public void run() {
            if (!isDisposed()) {
                this.f32923e.onNext(Long.valueOf(0));
                lazySet(C12459c.INSTANCE);
                this.f32923e.onComplete();
            }
        }
    }

    public C12647p1(long j, TimeUnit timeUnit, C12286f fVar) {
        this.f32921f = j;
        this.f32922g = timeUnit;
        this.f32920e = fVar;
    }

    /* renamed from: a */
    public void mo35836a(Observer<? super Long> observer) {
        C12648a aVar = new C12648a(observer);
        observer.onSubscribe(aVar);
        aVar.mo36788a(this.f32920e.mo6572a(aVar, this.f32921f, this.f32922g));
    }
}
