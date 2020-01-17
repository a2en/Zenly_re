package p389io.reactivex.p404l;

import org.reactivestreams.Processor;
import p389io.reactivex.C12272c;
import p389io.reactivex.FlowableSubscriber;

/* renamed from: io.reactivex.l.a */
public abstract class C12769a<T> extends C12272c<T> implements Processor<T, T>, FlowableSubscriber<T> {
    /* renamed from: i */
    public final C12769a<T> mo36948i() {
        if (this instanceof C12770b) {
            return this;
        }
        return new C12770b(this);
    }
}
