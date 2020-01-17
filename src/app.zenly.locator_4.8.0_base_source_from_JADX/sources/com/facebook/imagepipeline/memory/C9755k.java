package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;

/* renamed from: com.facebook.imagepipeline.memory.k */
public class C9755k {

    /* renamed from: a */
    public static final int f25657a = Runtime.getRuntime().availableProcessors();

    /* renamed from: a */
    public static SparseIntArray m24217a(int i, int i2, int i3) {
        SparseIntArray sparseIntArray = new SparseIntArray();
        while (i <= i2) {
            sparseIntArray.put(i, i3);
            i *= 2;
        }
        return sparseIntArray;
    }

    /* renamed from: a */
    public static C9745c0 m24218a() {
        int i = f25657a;
        C9745c0 c0Var = new C9745c0(4194304, i * 4194304, m24217a(131072, 4194304, i), 131072, 4194304, f25657a);
        return c0Var;
    }
}
