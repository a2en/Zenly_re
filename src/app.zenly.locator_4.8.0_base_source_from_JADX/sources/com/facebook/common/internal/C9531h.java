package com.facebook.common.internal;

/* renamed from: com.facebook.common.internal.h */
public class C9531h {
    /* renamed from: a */
    public static int m23260a(int... iArr) {
        C9536j.m23275a(iArr.length > 0);
        int i = iArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            if (iArr[i2] > i) {
                i = iArr[i2];
            }
        }
        return i;
    }
}
