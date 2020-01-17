package p389io.reactivex.internal.operators.flowable;

import org.reactivestreams.Subscription;
import p389io.reactivex.functions.Consumer;

/* renamed from: io.reactivex.internal.operators.flowable.j */
public enum C12503j implements Consumer<Subscription> {
    INSTANCE;

    /* renamed from: a */
    public void accept(Subscription subscription) throws Exception {
        subscription.request(Long.MAX_VALUE);
    }
}
