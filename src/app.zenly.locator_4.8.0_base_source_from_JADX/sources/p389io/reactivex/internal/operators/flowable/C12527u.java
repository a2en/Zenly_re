package p389io.reactivex.internal.operators.flowable;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import p389io.reactivex.FlowableSubscriber;
import p389io.reactivex.p393i.p401d.C12453d;
import p389io.reactivex.p393i.p401d.C12455f;
import p389io.reactivex.p404l.C12769a;

/* renamed from: io.reactivex.internal.operators.flowable.u */
abstract class C12527u<T, U> extends C12455f implements FlowableSubscriber<T> {
    private static final long serialVersionUID = -5604623027276966720L;

    /* renamed from: m */
    protected final Subscriber<? super T> f32524m;

    /* renamed from: n */
    protected final C12769a<U> f32525n;

    /* renamed from: o */
    protected final Subscription f32526o;

    /* renamed from: p */
    private long f32527p;

    C12527u(Subscriber<? super T> subscriber, C12769a<U> aVar, Subscription subscription) {
        super(false);
        this.f32524m = subscriber;
        this.f32525n = aVar;
        this.f32526o = subscription;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo36723a(U u) {
        mo36649a((Subscription) C12453d.INSTANCE);
        long j = this.f32527p;
        if (j != 0) {
            this.f32527p = 0;
            mo36648a(j);
        }
        this.f32526o.request(1);
        this.f32525n.onNext(u);
    }

    public final void cancel() {
        super.cancel();
        this.f32526o.cancel();
    }

    public final void onNext(T t) {
        this.f32527p++;
        this.f32524m.onNext(t);
    }

    public final void onSubscribe(Subscription subscription) {
        mo36649a(subscription);
    }
}
