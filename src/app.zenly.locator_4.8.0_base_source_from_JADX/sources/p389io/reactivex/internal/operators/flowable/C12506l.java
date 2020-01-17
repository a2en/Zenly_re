package p389io.reactivex.internal.operators.flowable;

import org.reactivestreams.Subscriber;
import p389io.reactivex.C12272c;
import p389io.reactivex.internal.fuseable.ScalarCallable;
import p389io.reactivex.p393i.p401d.C12454e;

/* renamed from: io.reactivex.internal.operators.flowable.l */
public final class C12506l<T> extends C12272c<T> implements ScalarCallable<T> {

    /* renamed from: f */
    private final T f32461f;

    public C12506l(T t) {
        this.f32461f = t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36365a(Subscriber<? super T> subscriber) {
        subscriber.onSubscribe(new C12454e(subscriber, this.f32461f));
    }

    public T call() {
        return this.f32461f;
    }
}
