package com.google.android.gms.internal.clearcut;

/* renamed from: com.google.android.gms.internal.clearcut.s */
final class C10395s {

    /* renamed from: a */
    private static final Class<?> f27178a = m26491a("libcore.io.Memory");

    /* renamed from: b */
    private static final boolean f27179b = (m26491a("org.robolectric.Robolectric") != null);

    /* renamed from: a */
    private static <T> Class<T> m26491a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    static boolean m26492a() {
        return f27178a != null && !f27179b;
    }

    /* renamed from: b */
    static Class<?> m26493b() {
        return f27178a;
    }
}
