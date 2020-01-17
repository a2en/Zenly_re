package p389io.reactivex.exceptions;

import p389io.reactivex.internal.util.C12757g;

/* renamed from: io.reactivex.exceptions.a */
public final class C12285a {
    /* renamed from: a */
    public static RuntimeException m32747a(Throwable th) {
        throw C12757g.m33354b(th);
    }

    /* renamed from: b */
    public static void m32748b(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        } else if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        } else if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }
}
