package kotlin.p409io;

import java.io.Closeable;

/* renamed from: kotlin.io.b */
public final class C12901b {
    /* renamed from: a */
    public static final void m33759a(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                C12813b.m33495a(th, th2);
            }
        }
    }
}
