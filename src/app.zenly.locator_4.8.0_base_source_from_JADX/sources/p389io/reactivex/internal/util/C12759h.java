package p389io.reactivex.internal.util;

import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Subscriber;
import p389io.reactivex.Observer;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.internal.util.h */
public final class C12759h {
    /* renamed from: a */
    public static <T> void m33358a(Subscriber<? super T> subscriber, T t, AtomicInteger atomicInteger, C12752b bVar) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            subscriber.onNext(t);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable a = bVar.mo36928a();
                if (a != null) {
                    subscriber.onError(a);
                } else {
                    subscriber.onComplete();
                }
            }
        }
    }

    /* renamed from: a */
    public static void m33359a(Subscriber<?> subscriber, Throwable th, AtomicInteger atomicInteger, C12752b bVar) {
        if (!bVar.mo36929a(th)) {
            C12768a.m33415b(th);
        } else if (atomicInteger.getAndIncrement() == 0) {
            subscriber.onError(bVar.mo36928a());
        }
    }

    /* renamed from: a */
    public static void m33360a(Subscriber<?> subscriber, AtomicInteger atomicInteger, C12752b bVar) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable a = bVar.mo36928a();
            if (a != null) {
                subscriber.onError(a);
            } else {
                subscriber.onComplete();
            }
        }
    }

    /* renamed from: a */
    public static <T> void m33355a(Observer<? super T> observer, T t, AtomicInteger atomicInteger, C12752b bVar) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            observer.onNext(t);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable a = bVar.mo36928a();
                if (a != null) {
                    observer.onError(a);
                } else {
                    observer.onComplete();
                }
            }
        }
    }

    /* renamed from: a */
    public static void m33356a(Observer<?> observer, Throwable th, AtomicInteger atomicInteger, C12752b bVar) {
        if (!bVar.mo36929a(th)) {
            C12768a.m33415b(th);
        } else if (atomicInteger.getAndIncrement() == 0) {
            observer.onError(bVar.mo36928a());
        }
    }

    /* renamed from: a */
    public static void m33357a(Observer<?> observer, AtomicInteger atomicInteger, C12752b bVar) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable a = bVar.mo36928a();
            if (a != null) {
                observer.onError(a);
            } else {
                observer.onComplete();
            }
        }
    }
}
