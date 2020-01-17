package p389io.reactivex.internal.operators.flowable;

import java.util.concurrent.Callable;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import p389io.reactivex.C12272c;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.functions.Function;
import p389io.reactivex.p393i.p394a.C12324b;
import p389io.reactivex.p393i.p401d.C12453d;
import p389io.reactivex.p393i.p401d.C12454e;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.internal.operators.flowable.w */
public final class C12530w {

    /* renamed from: io.reactivex.internal.operators.flowable.w$a */
    static final class C12531a<T, R> extends C12272c<R> {

        /* renamed from: f */
        final T f32529f;

        /* renamed from: g */
        final Function<? super T, ? extends Publisher<? extends R>> f32530g;

        C12531a(T t, Function<? super T, ? extends Publisher<? extends R>> function) {
            this.f32529f = t;
            this.f32530g = function;
        }

        /* renamed from: a */
        public void mo36365a(Subscriber<? super R> subscriber) {
            try {
                Object apply = this.f32530g.apply(this.f32529f);
                C12324b.m32836a(apply, "The mapper returned a null Publisher");
                Publisher publisher = (Publisher) apply;
                if (publisher instanceof Callable) {
                    try {
                        Object call = ((Callable) publisher).call();
                        if (call == null) {
                            C12453d.m32959a(subscriber);
                            return;
                        }
                        subscriber.onSubscribe(new C12454e(subscriber, call));
                    } catch (Throwable th) {
                        C12285a.m32748b(th);
                        C12453d.m32958a(th, subscriber);
                    }
                } else {
                    publisher.subscribe(subscriber);
                }
            } catch (Throwable th2) {
                C12453d.m32958a(th2, subscriber);
            }
        }
    }

    /* renamed from: a */
    public static <T, R> boolean m33065a(Publisher<T> publisher, Subscriber<? super R> subscriber, Function<? super T, ? extends Publisher<? extends R>> function) {
        if (!(publisher instanceof Callable)) {
            return false;
        }
        try {
            Object call = ((Callable) publisher).call();
            if (call == null) {
                C12453d.m32959a(subscriber);
                return true;
            }
            try {
                Object apply = function.apply(call);
                C12324b.m32836a(apply, "The mapper returned a null Publisher");
                Publisher publisher2 = (Publisher) apply;
                if (publisher2 instanceof Callable) {
                    try {
                        Object call2 = ((Callable) publisher2).call();
                        if (call2 == null) {
                            C12453d.m32959a(subscriber);
                            return true;
                        }
                        subscriber.onSubscribe(new C12454e(subscriber, call2));
                    } catch (Throwable th) {
                        C12285a.m32748b(th);
                        C12453d.m32958a(th, subscriber);
                        return true;
                    }
                } else {
                    publisher2.subscribe(subscriber);
                }
                return true;
            } catch (Throwable th2) {
                C12285a.m32748b(th2);
                C12453d.m32958a(th2, subscriber);
                return true;
            }
        } catch (Throwable th3) {
            C12285a.m32748b(th3);
            C12453d.m32958a(th3, subscriber);
            return true;
        }
    }

    /* renamed from: a */
    public static <T, U> C12272c<U> m33064a(T t, Function<? super T, ? extends Publisher<? extends U>> function) {
        return C12768a.m33394a((C12272c<T>) new C12531a<T>(t, function));
    }
}
