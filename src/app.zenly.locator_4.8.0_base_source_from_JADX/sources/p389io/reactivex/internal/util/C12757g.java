package p389io.reactivex.internal.util;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p389io.reactivex.exceptions.CompositeException;

/* renamed from: io.reactivex.internal.util.g */
public final class C12757g {

    /* renamed from: a */
    public static final Throwable f33270a = new C12758a();

    /* renamed from: io.reactivex.internal.util.g$a */
    static final class C12758a extends Throwable {
        private static final long serialVersionUID = -4649703670690200604L;

        C12758a() {
            super("No further exceptions");
        }

        public Throwable fillInStackTrace() {
            return this;
        }
    }

    /* renamed from: a */
    public static <T> boolean m33353a(AtomicReference<Throwable> atomicReference, Throwable th) {
        Throwable th2;
        Throwable th3;
        do {
            th2 = (Throwable) atomicReference.get();
            if (th2 == f33270a) {
                return false;
            }
            if (th2 == null) {
                th3 = th;
            } else {
                th3 = new CompositeException(th2, th);
            }
        } while (!atomicReference.compareAndSet(th2, th3));
        return true;
    }

    /* renamed from: b */
    public static RuntimeException m33354b(Throwable th) {
        if (th instanceof Error) {
            throw ((Error) th);
        } else if (th instanceof RuntimeException) {
            return (RuntimeException) th;
        } else {
            return new RuntimeException(th);
        }
    }

    /* renamed from: a */
    public static <T> Throwable m33352a(AtomicReference<Throwable> atomicReference) {
        Throwable th = (Throwable) atomicReference.get();
        Throwable th2 = f33270a;
        return th != th2 ? (Throwable) atomicReference.getAndSet(th2) : th;
    }

    /* renamed from: a */
    public static <E extends Throwable> Exception m33350a(Throwable th) throws Throwable {
        if (th instanceof Exception) {
            return (Exception) th;
        }
        throw th;
    }

    /* renamed from: a */
    public static String m33351a(long j, TimeUnit timeUnit) {
        StringBuilder sb = new StringBuilder();
        sb.append("The source did not signal an event for ");
        sb.append(j);
        sb.append(" ");
        sb.append(timeUnit.toString().toLowerCase());
        sb.append(" and has been terminated.");
        return sb.toString();
    }
}
