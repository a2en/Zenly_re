package p389io.reactivex.internal.operators.flowable;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import p389io.reactivex.C12272c;
import p389io.reactivex.C12279e;
import p389io.reactivex.Observer;
import p389io.reactivex.disposables.Disposable;

/* renamed from: io.reactivex.internal.operators.flowable.i */
public final class C12501i<T> extends C12272c<T> {

    /* renamed from: f */
    private final C12279e<T> f32449f;

    /* renamed from: io.reactivex.internal.operators.flowable.i$a */
    static final class C12502a<T> implements Observer<T>, Subscription {

        /* renamed from: e */
        final Subscriber<? super T> f32450e;

        /* renamed from: f */
        Disposable f32451f;

        C12502a(Subscriber<? super T> subscriber) {
            this.f32450e = subscriber;
        }

        public void cancel() {
            this.f32451f.dispose();
        }

        public void onComplete() {
            this.f32450e.onComplete();
        }

        public void onError(Throwable th) {
            this.f32450e.onError(th);
        }

        public void onNext(T t) {
            this.f32450e.onNext(t);
        }

        public void onSubscribe(Disposable disposable) {
            this.f32451f = disposable;
            this.f32450e.onSubscribe(this);
        }

        public void request(long j) {
        }
    }

    public C12501i(C12279e<T> eVar) {
        this.f32449f = eVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36365a(Subscriber<? super T> subscriber) {
        this.f32449f.subscribe(new C12502a(subscriber));
    }
}
