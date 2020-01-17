package p389io.reactivex;

import org.reactivestreams.Publisher;

/* renamed from: io.reactivex.FlowableTransformer */
public interface FlowableTransformer<Upstream, Downstream> {
    Publisher<Downstream> apply(C12272c<Upstream> cVar);
}
