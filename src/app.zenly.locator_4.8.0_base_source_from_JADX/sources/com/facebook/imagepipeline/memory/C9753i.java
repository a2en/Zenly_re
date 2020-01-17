package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;

/* renamed from: com.facebook.imagepipeline.memory.i */
public class C9753i {

    /* renamed from: a */
    private static final SparseIntArray f25656a = new SparseIntArray(0);

    /* renamed from: a */
    public static C9745c0 m24214a() {
        return new C9745c0(0, m24215b(), f25656a);
    }

    /* renamed from: b */
    private static int m24215b() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (min > 16777216) {
            return (min / 4) * 3;
        }
        return min / 2;
    }
}
