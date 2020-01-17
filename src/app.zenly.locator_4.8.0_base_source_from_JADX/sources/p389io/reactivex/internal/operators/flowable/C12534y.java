package p389io.reactivex.internal.operators.flowable;

import java.util.NoSuchElementException;
import org.reactivestreams.Subscription;
import p389io.reactivex.C12272c;
import p389io.reactivex.C12291g;
import p389io.reactivex.FlowableSubscriber;
import p389io.reactivex.SingleObserver;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.internal.fuseable.FuseToFlowable;
import p389io.reactivex.p393i.p401d.C12456g;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.internal.operators.flowable.y */
public final class C12534y<T> extends C12291g<T> implements FuseToFlowable<T> {

    /* renamed from: e */
    final C12272c<T> f32537e;

    /* renamed from: f */
    final T f32538f;

    /* renamed from: io.reactivex.internal.operators.flowable.y$a */
    static final class C12535a<T> implements FlowableSubscriber<T>, Disposable {

        /* renamed from: e */
        final SingleObserver<? super T> f32539e;

        /* renamed from: f */
        final T f32540f;

        /* renamed from: g */
        Subscription f32541g;

        /* renamed from: h */
        boolean f32542h;

        /* renamed from: i */
        T f32543i;

        C12535a(SingleObserver<? super T> singleObserver, T t) {
            this.f32539e = singleObserver;
            this.f32540f = t;
        }

        public void dispose() {
            this.f32541g.cancel();
            this.f32541g = C12456g.CANCELLED;
        }

        public boolean isDisposed() {
            return this.f32541g == C12456g.CANCELLED;
        }

        public void onComplete() {
            if (!this.f32542h) {
                this.f32542h = true;
                this.f32541g = C12456g.CANCELLED;
                T t = this.f32543i;
                this.f32543i = null;
                if (t == null) {
                    t = this.f32540f;
                }
                if (t != null) {
                    this.f32539e.onSuccess(t);
                } else {
                    this.f32539e.onError(new NoSuchElementException());
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f32542h) {
                C12768a.m33415b(th);
                return;
            }
            this.f32542h = true;
            this.f32541g = C12456g.CANCELLED;
            this.f32539e.onError(th);
        }

        public void onNext(T t) {
            if (!this.f32542h) {
                if (this.f32543i != null) {
                    this.f32542h = true;
                    this.f32541g.cancel();
                    this.f32541g = C12456g.CANCELLED;
                    this.f32539e.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                    return;
                }
                this.f32543i = t;
            }
        }

        public void onSubscribe(Subscription subscription) {
            if (C12456g.m32970a(this.f32541g, subscription)) {
                this.f32541g = subscription;
                this.f32539e.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public C12534y(C12272c<T> cVar, T t) {
        this.f32537e = cVar;
        this.f32538f = t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36541a(SingleObserver<? super T> singleObserver) {
        this.f32537e.mo36364a((FlowableSubscriber<? super T>) new C12535a<Object>(singleObserver, this.f32538f));
    }

    public C12272c<T> fuseToFlowable() {
        return C12768a.m33394a((C12272c<T>) new C12532x<T>(this.f32537e, this.f32538f, true));
    }
}
