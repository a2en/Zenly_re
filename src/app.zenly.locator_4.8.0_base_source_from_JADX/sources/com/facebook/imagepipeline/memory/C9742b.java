package com.facebook.imagepipeline.memory;

/* renamed from: com.facebook.imagepipeline.memory.b */
public class C9742b {

    /* renamed from: a */
    public static final int f25625a = m24168b();

    /* renamed from: b */
    private static int f25626b = 384;

    /* renamed from: c */
    private static volatile C9737a f25627c;

    /* renamed from: a */
    public static C9737a m24167a() {
        if (f25627c == null) {
            synchronized (C9742b.class) {
                if (f25627c == null) {
                    f25627c = new C9737a(f25626b, f25625a);
                }
            }
        }
        return f25627c;
    }

    /* renamed from: b */
    private static int m24168b() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (((long) min) > 16777216) {
            return (min / 4) * 3;
        }
        return min / 2;
    }
}
