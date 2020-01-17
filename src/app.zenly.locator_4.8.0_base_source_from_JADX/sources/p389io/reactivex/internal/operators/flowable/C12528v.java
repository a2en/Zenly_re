package p389io.reactivex.internal.operators.flowable;

import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import p389io.reactivex.C12272c;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.functions.Function;
import p389io.reactivex.p393i.p394a.C12324b;
import p389io.reactivex.p393i.p401d.C12453d;
import p389io.reactivex.p404l.C12769a;
import p389io.reactivex.p404l.C12771c;
import p389io.reactivex.p407o.C12799a;

/* renamed from: io.reactivex.internal.operators.flowable.v */
public final class C12528v<T> extends C12480a<T, T> {

    /* renamed from: g */
    final Function<? super C12272c<Throwable>, ? extends Publisher<?>> f32528g;

    /* renamed from: io.reactivex.internal.operators.flowable.v$a */
    static final class C12529a<T> extends C12527u<T, Throwable> {
        private static final long serialVersionUID = -2680129890138081029L;

        C12529a(Subscriber<? super T> subscriber, C12769a<Throwable> aVar, Subscription subscription) {
            super(subscriber, aVar, subscription);
        }

        public void onComplete() {
            this.f32526o.cancel();
            this.f32524m.onComplete();
        }

        public void onError(Throwable th) {
            mo36723a(th);
        }
    }

    public C12528v(C12272c<T> cVar, Function<? super C12272c<Throwable>, ? extends Publisher<?>> function) {
        super(cVar);
        this.f32528g = function;
    }

    /* renamed from: a */
    public void mo36365a(Subscriber<? super T> subscriber) {
        C12799a aVar = new C12799a(subscriber);
        C12769a i = C12771c.m33425a(8).mo36948i();
        try {
            Object apply = this.f32528g.apply(i);
            C12324b.m32836a(apply, "handler returned a null Publisher");
            Publisher publisher = (Publisher) apply;
            C12526t tVar = new C12526t(this.f32355f);
            C12529a aVar2 = new C12529a(aVar, i, tVar);
            tVar.f32523h = aVar2;
            subscriber.onSubscribe(aVar2);
            publisher.subscribe(tVar);
            tVar.onNext(Integer.valueOf(0));
        } catch (Throwable th) {
            C12285a.m32748b(th);
            C12453d.m32958a(th, subscriber);
        }
    }
}
