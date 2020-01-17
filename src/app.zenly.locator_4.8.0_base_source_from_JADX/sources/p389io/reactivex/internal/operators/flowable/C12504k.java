package p389io.reactivex.internal.operators.flowable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import p389io.reactivex.C12272c;
import p389io.reactivex.C12286f;
import p389io.reactivex.C12286f.C12289c;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.exceptions.MissingBackpressureException;
import p389io.reactivex.internal.disposables.C12458b;
import p389io.reactivex.internal.schedulers.C12741m;
import p389io.reactivex.internal.util.C12753c;
import p389io.reactivex.p393i.p401d.C12456g;

/* renamed from: io.reactivex.internal.operators.flowable.k */
public final class C12504k extends C12272c<Long> {

    /* renamed from: f */
    final C12286f f32454f;

    /* renamed from: g */
    final long f32455g;

    /* renamed from: h */
    final long f32456h;

    /* renamed from: i */
    final TimeUnit f32457i;

    /* renamed from: io.reactivex.internal.operators.flowable.k$a */
    static final class C12505a extends AtomicLong implements Subscription, Runnable {
        private static final long serialVersionUID = -2809475196591179431L;

        /* renamed from: e */
        final Subscriber<? super Long> f32458e;

        /* renamed from: f */
        long f32459f;

        /* renamed from: g */
        final AtomicReference<Disposable> f32460g = new AtomicReference<>();

        C12505a(Subscriber<? super Long> subscriber) {
            this.f32458e = subscriber;
        }

        /* renamed from: a */
        public void mo36709a(Disposable disposable) {
            C12458b.m32978c(this.f32460g, disposable);
        }

        public void cancel() {
            C12458b.m32975a(this.f32460g);
        }

        public void request(long j) {
            if (C12456g.m32971b(j)) {
                C12753c.m33346a((AtomicLong) this, j);
            }
        }

        public void run() {
            if (this.f32460g.get() == C12458b.DISPOSED) {
                return;
            }
            if (get() != 0) {
                Subscriber<? super Long> subscriber = this.f32458e;
                long j = this.f32459f;
                this.f32459f = j + 1;
                subscriber.onNext(Long.valueOf(j));
                C12753c.m33347b(this, 1);
                return;
            }
            Subscriber<? super Long> subscriber2 = this.f32458e;
            StringBuilder sb = new StringBuilder();
            sb.append("Can't deliver value ");
            sb.append(this.f32459f);
            sb.append(" due to lack of requests");
            subscriber2.onError(new MissingBackpressureException(sb.toString()));
            C12458b.m32975a(this.f32460g);
        }
    }

    public C12504k(long j, long j2, TimeUnit timeUnit, C12286f fVar) {
        this.f32455g = j;
        this.f32456h = j2;
        this.f32457i = timeUnit;
        this.f32454f = fVar;
    }

    /* renamed from: a */
    public void mo36365a(Subscriber<? super Long> subscriber) {
        C12505a aVar = new C12505a(subscriber);
        subscriber.onSubscribe(aVar);
        C12286f fVar = this.f32454f;
        if (fVar instanceof C12741m) {
            C12289c a = fVar.mo6573a();
            aVar.mo36709a(a);
            a.mo6575a(aVar, this.f32455g, this.f32456h, this.f32457i);
            return;
        }
        aVar.mo36709a(fVar.mo6571a(aVar, this.f32455g, this.f32456h, this.f32457i));
    }
}
