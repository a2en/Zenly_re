package p389io.reactivex.p393i.p401d;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;
import p389io.reactivex.exceptions.ProtocolViolationException;
import p389io.reactivex.internal.util.C12753c;
import p389io.reactivex.p393i.p394a.C12324b;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.i.d.g */
public enum C12456g implements Subscription {
    CANCELLED;

    /* renamed from: a */
    public static boolean m32970a(Subscription subscription, Subscription subscription2) {
        if (subscription2 == null) {
            C12768a.m33415b((Throwable) new NullPointerException("next is null"));
            return false;
        } else if (subscription == null) {
            return true;
        } else {
            subscription2.cancel();
            m32964a();
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m32971b(long j) {
        if (j > 0) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("n > 0 required but it was ");
        sb.append(j);
        C12768a.m33415b((Throwable) new IllegalArgumentException(sb.toString()));
        return false;
    }

    public void cancel() {
    }

    public void request(long j) {
    }

    /* renamed from: a */
    public static void m32964a() {
        C12768a.m33415b((Throwable) new ProtocolViolationException("Subscription already set!"));
    }

    /* renamed from: a */
    public static void m32965a(long j) {
        StringBuilder sb = new StringBuilder();
        sb.append("More produced than requested: ");
        sb.append(j);
        C12768a.m33415b((Throwable) new ProtocolViolationException(sb.toString()));
    }

    /* renamed from: a */
    public static boolean m32969a(AtomicReference<Subscription> atomicReference, Subscription subscription) {
        C12324b.m32836a(subscription, "s is null");
        if (atomicReference.compareAndSet(null, subscription)) {
            return true;
        }
        subscription.cancel();
        if (atomicReference.get() != CANCELLED) {
            m32964a();
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m32967a(AtomicReference<Subscription> atomicReference) {
        Subscription subscription = (Subscription) atomicReference.get();
        C12456g gVar = CANCELLED;
        if (subscription != gVar) {
            Subscription subscription2 = (Subscription) atomicReference.getAndSet(gVar);
            if (subscription2 != CANCELLED) {
                if (subscription2 != null) {
                    subscription2.cancel();
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m32968a(AtomicReference<Subscription> atomicReference, AtomicLong atomicLong, Subscription subscription) {
        if (!m32969a(atomicReference, subscription)) {
            return false;
        }
        long andSet = atomicLong.getAndSet(0);
        if (andSet != 0) {
            subscription.request(andSet);
        }
        return true;
    }

    /* renamed from: a */
    public static void m32966a(AtomicReference<Subscription> atomicReference, AtomicLong atomicLong, long j) {
        Subscription subscription = (Subscription) atomicReference.get();
        if (subscription != null) {
            subscription.request(j);
        } else if (m32971b(j)) {
            C12753c.m33346a(atomicLong, j);
            Subscription subscription2 = (Subscription) atomicReference.get();
            if (subscription2 != null) {
                long andSet = atomicLong.getAndSet(0);
                if (andSet != 0) {
                    subscription2.request(andSet);
                }
            }
        }
    }
}
