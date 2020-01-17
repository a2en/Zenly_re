package com.mapbox.mapboxsdk;

/* renamed from: com.mapbox.mapboxsdk.b */
public class C11445b {

    /* renamed from: a */
    private static volatile boolean f29620a;

    /* renamed from: a */
    public static synchronized void m29553a(boolean z) {
        synchronized (C11445b.class) {
            f29620a = z;
        }
    }

    /* renamed from: a */
    public static void m29550a(String str) {
        if (f29620a) {
            throw new C11446c(str);
        }
    }

    /* renamed from: a */
    public static void m29551a(String str, Throwable th) {
        if (f29620a) {
            throw new C11446c(String.format("%s - %s", new Object[]{str, th}));
        }
    }

    /* renamed from: a */
    public static void m29552a(Throwable th) {
        if (f29620a) {
            throw new C11446c(String.format("%s", new Object[]{th}));
        }
    }
}
