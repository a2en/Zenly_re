package p389io.reactivex.internal.operators.observable;

import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;
import p389io.reactivex.C12279e;
import p389io.reactivex.FlowableSubscriber;
import p389io.reactivex.Observer;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.p393i.p401d.C12456g;

/* renamed from: io.reactivex.internal.operators.observable.f0 */
public final class C12573f0<T> extends C12279e<T> {

    /* renamed from: e */
    final Publisher<? extends T> f32665e;

    /* renamed from: io.reactivex.internal.operators.observable.f0$a */
    static final class C12574a<T> implements FlowableSubscriber<T>, Disposable {

        /* renamed from: e */
        final Observer<? super T> f32666e;

        /* renamed from: f */
        Subscription f32667f;

        C12574a(Observer<? super T> observer) {
            this.f32666e = observer;
        }

        public void dispose() {
            this.f32667f.cancel();
            this.f32667f = C12456g.CANCELLED;
        }

        public boolean isDisposed() {
            return this.f32667f == C12456g.CANCELLED;
        }

        public void onComplete() {
            this.f32666e.onComplete();
        }

        public void onError(Throwable th) {
            this.f32666e.onError(th);
        }

        public void onNext(T t) {
            this.f32666e.onNext(t);
        }

        public void onSubscribe(Subscription subscription) {
            if (C12456g.m32970a(this.f32667f, subscription)) {
                this.f32667f = subscription;
                this.f32666e.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public C12573f0(Publisher<? extends T> publisher) {
        this.f32665e = publisher;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo35836a(Observer<? super T> observer) {
        this.f32665e.subscribe(new C12574a(observer));
    }
}
