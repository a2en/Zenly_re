package com.facebook.imagepipeline.memory;

import com.facebook.common.internal.C9536j;

/* renamed from: com.facebook.imagepipeline.memory.t */
public class C9766t {
    /* renamed from: a */
    static int m24251a(int i, int i2, int i3) {
        return Math.min(Math.max(0, i3 - i), i2);
    }

    /* renamed from: a */
    static void m24252a(int i, int i2, int i3, int i4, int i5) {
        boolean z = true;
        C9536j.m23275a(i4 >= 0);
        C9536j.m23275a(i >= 0);
        C9536j.m23275a(i3 >= 0);
        C9536j.m23275a(i + i4 <= i5);
        if (i3 + i4 > i2) {
            z = false;
        }
        C9536j.m23275a(z);
    }
}
