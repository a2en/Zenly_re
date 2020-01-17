package p389io.reactivex.internal.operators.flowable;

import org.reactivestreams.Publisher;
import p389io.reactivex.C12272c;
import p389io.reactivex.internal.fuseable.HasUpstreamPublisher;
import p389io.reactivex.p393i.p394a.C12324b;

/* renamed from: io.reactivex.internal.operators.flowable.a */
abstract class C12480a<T, R> extends C12272c<R> implements HasUpstreamPublisher<T> {

    /* renamed from: f */
    protected final C12272c<T> f32355f;

    C12480a(C12272c<T> cVar) {
        C12324b.m32836a(cVar, "source is null");
        this.f32355f = cVar;
    }

    public final Publisher<T> source() {
        return this.f32355f;
    }
}
