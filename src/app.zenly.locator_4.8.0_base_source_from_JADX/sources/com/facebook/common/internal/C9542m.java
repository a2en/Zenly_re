package com.facebook.common.internal;

/* renamed from: com.facebook.common.internal.m */
public final class C9542m {
    /* renamed from: a */
    public static <X extends Throwable> void m23286a(Throwable th, Class<X> cls) throws Throwable {
        if (th != null && cls.isInstance(th)) {
            throw ((Throwable) cls.cast(th));
        }
    }

    /* renamed from: b */
    public static void m23287b(Throwable th) {
        m23286a(th, Error.class);
        m23286a(th, RuntimeException.class);
    }

    /* renamed from: a */
    public static RuntimeException m23285a(Throwable th) {
        C9536j.m23271a(th);
        m23287b(th);
        throw new RuntimeException(th);
    }
}
