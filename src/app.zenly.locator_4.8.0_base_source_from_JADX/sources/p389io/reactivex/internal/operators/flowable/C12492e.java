package p389io.reactivex.internal.operators.flowable;

import org.reactivestreams.Subscription;
import p389io.reactivex.C12272c;
import p389io.reactivex.C12273d;
import p389io.reactivex.FlowableSubscriber;
import p389io.reactivex.MaybeObserver;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.internal.fuseable.FuseToFlowable;
import p389io.reactivex.p393i.p401d.C12456g;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.internal.operators.flowable.e */
public final class C12492e<T> extends C12273d<T> implements FuseToFlowable<T> {

    /* renamed from: e */
    final C12272c<T> f32407e;

    /* renamed from: f */
    final long f32408f;

    /* renamed from: io.reactivex.internal.operators.flowable.e$a */
    static final class C12493a<T> implements FlowableSubscriber<T>, Disposable {

        /* renamed from: e */
        final MaybeObserver<? super T> f32409e;

        /* renamed from: f */
        final long f32410f;

        /* renamed from: g */
        Subscription f32411g;

        /* renamed from: h */
        long f32412h;

        /* renamed from: i */
        boolean f32413i;

        C12493a(MaybeObserver<? super T> maybeObserver, long j) {
            this.f32409e = maybeObserver;
            this.f32410f = j;
        }

        public void dispose() {
            this.f32411g.cancel();
            this.f32411g = C12456g.CANCELLED;
        }

        public boolean isDisposed() {
            return this.f32411g == C12456g.CANCELLED;
        }

        public void onComplete() {
            this.f32411g = C12456g.CANCELLED;
            if (!this.f32413i) {
                this.f32413i = true;
                this.f32409e.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f32413i) {
                C12768a.m33415b(th);
                return;
            }
            this.f32413i = true;
            this.f32411g = C12456g.CANCELLED;
            this.f32409e.onError(th);
        }

        public void onNext(T t) {
            if (!this.f32413i) {
                long j = this.f32412h;
                if (j == this.f32410f) {
                    this.f32413i = true;
                    this.f32411g.cancel();
                    this.f32411g = C12456g.CANCELLED;
                    this.f32409e.onSuccess(t);
                    return;
                }
                this.f32412h = j + 1;
            }
        }

        public void onSubscribe(Subscription subscription) {
            if (C12456g.m32970a(this.f32411g, subscription)) {
                this.f32411g = subscription;
                this.f32409e.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public C12492e(C12272c<T> cVar, long j) {
        this.f32407e = cVar;
        this.f32408f = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36387a(MaybeObserver<? super T> maybeObserver) {
        this.f32407e.mo36364a((FlowableSubscriber<? super T>) new C12493a<Object>(maybeObserver, this.f32408f));
    }

    public C12272c<T> fuseToFlowable() {
        C12490d dVar = new C12490d(this.f32407e, this.f32408f, null, false);
        return C12768a.m33394a((C12272c<T>) dVar);
    }
}
