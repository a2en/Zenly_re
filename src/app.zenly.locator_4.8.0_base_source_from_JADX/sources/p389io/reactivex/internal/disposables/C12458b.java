package p389io.reactivex.internal.disposables;

import java.util.concurrent.atomic.AtomicReference;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.exceptions.ProtocolViolationException;
import p389io.reactivex.p393i.p394a.C12324b;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.internal.disposables.b */
public enum C12458b implements Disposable {
    DISPOSED;

    /* renamed from: a */
    public static boolean m32973a(Disposable disposable) {
        return disposable == DISPOSED;
    }

    /* renamed from: b */
    public static boolean m32977b(AtomicReference<Disposable> atomicReference, Disposable disposable) {
        Disposable disposable2;
        do {
            disposable2 = (Disposable) atomicReference.get();
            if (disposable2 == DISPOSED) {
                if (disposable != null) {
                    disposable.dispose();
                }
                return false;
            }
        } while (!atomicReference.compareAndSet(disposable2, disposable));
        if (disposable2 != null) {
            disposable2.dispose();
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m32978c(AtomicReference<Disposable> atomicReference, Disposable disposable) {
        C12324b.m32836a(disposable, "d is null");
        if (atomicReference.compareAndSet(null, disposable)) {
            return true;
        }
        disposable.dispose();
        if (atomicReference.get() != DISPOSED) {
            m32972a();
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m32979d(AtomicReference<Disposable> atomicReference, Disposable disposable) {
        if (atomicReference.compareAndSet(null, disposable)) {
            return true;
        }
        if (atomicReference.get() == DISPOSED) {
            disposable.dispose();
        }
        return false;
    }

    public void dispose() {
    }

    public boolean isDisposed() {
        return true;
    }

    /* renamed from: a */
    public static boolean m32976a(AtomicReference<Disposable> atomicReference, Disposable disposable) {
        Disposable disposable2;
        do {
            disposable2 = (Disposable) atomicReference.get();
            if (disposable2 == DISPOSED) {
                if (disposable != null) {
                    disposable.dispose();
                }
                return false;
            }
        } while (!atomicReference.compareAndSet(disposable2, disposable));
        return true;
    }

    /* renamed from: a */
    public static boolean m32975a(AtomicReference<Disposable> atomicReference) {
        Disposable disposable = (Disposable) atomicReference.get();
        C12458b bVar = DISPOSED;
        if (disposable != bVar) {
            Disposable disposable2 = (Disposable) atomicReference.getAndSet(bVar);
            if (disposable2 != bVar) {
                if (disposable2 != null) {
                    disposable2.dispose();
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m32974a(Disposable disposable, Disposable disposable2) {
        if (disposable2 == null) {
            C12768a.m33415b((Throwable) new NullPointerException("next is null"));
            return false;
        } else if (disposable == null) {
            return true;
        } else {
            disposable2.dispose();
            m32972a();
            return false;
        }
    }

    /* renamed from: a */
    public static void m32972a() {
        C12768a.m33415b((Throwable) new ProtocolViolationException("Disposable already set!"));
    }
}
