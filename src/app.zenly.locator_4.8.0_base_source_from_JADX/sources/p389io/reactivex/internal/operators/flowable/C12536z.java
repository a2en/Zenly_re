package p389io.reactivex.internal.operators.flowable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import p389io.reactivex.C12272c;
import p389io.reactivex.C12286f;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.exceptions.MissingBackpressureException;
import p389io.reactivex.internal.disposables.C12458b;
import p389io.reactivex.internal.disposables.C12459c;
import p389io.reactivex.p393i.p401d.C12456g;

/* renamed from: io.reactivex.internal.operators.flowable.z */
public final class C12536z extends C12272c<Long> {

    /* renamed from: f */
    final C12286f f32544f;

    /* renamed from: g */
    final long f32545g;

    /* renamed from: h */
    final TimeUnit f32546h;

    /* renamed from: io.reactivex.internal.operators.flowable.z$a */
    static final class C12537a extends AtomicReference<Disposable> implements Subscription, Runnable {
        private static final long serialVersionUID = -2809475196591179431L;

        /* renamed from: e */
        final Subscriber<? super Long> f32547e;

        /* renamed from: f */
        volatile boolean f32548f;

        C12537a(Subscriber<? super Long> subscriber) {
            this.f32547e = subscriber;
        }

        /* renamed from: a */
        public void mo36724a(Disposable disposable) {
            C12458b.m32979d(this, disposable);
        }

        public void cancel() {
            C12458b.m32975a((AtomicReference<Disposable>) this);
        }

        public void request(long j) {
            if (C12456g.m32971b(j)) {
                this.f32548f = true;
            }
        }

        public void run() {
            if (get() == C12458b.DISPOSED) {
                return;
            }
            if (this.f32548f) {
                this.f32547e.onNext(Long.valueOf(0));
                lazySet(C12459c.INSTANCE);
                this.f32547e.onComplete();
                return;
            }
            lazySet(C12459c.INSTANCE);
            this.f32547e.onError(new MissingBackpressureException("Can't deliver value due to lack of requests"));
        }
    }

    public C12536z(long j, TimeUnit timeUnit, C12286f fVar) {
        this.f32545g = j;
        this.f32546h = timeUnit;
        this.f32544f = fVar;
    }

    /* renamed from: a */
    public void mo36365a(Subscriber<? super Long> subscriber) {
        C12537a aVar = new C12537a(subscriber);
        subscriber.onSubscribe(aVar);
        aVar.mo36724a(this.f32544f.mo6572a(aVar, this.f32545g, this.f32546h));
    }
}
