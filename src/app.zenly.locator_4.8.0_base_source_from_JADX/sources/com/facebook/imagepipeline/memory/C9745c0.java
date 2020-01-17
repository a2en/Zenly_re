package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import com.facebook.common.internal.C9536j;

/* renamed from: com.facebook.imagepipeline.memory.c0 */
public class C9745c0 {

    /* renamed from: a */
    public final int f25636a;

    /* renamed from: b */
    public final int f25637b;

    /* renamed from: c */
    public final SparseIntArray f25638c;

    /* renamed from: d */
    public boolean f25639d;

    /* renamed from: e */
    public final int f25640e;

    public C9745c0(int i, int i2, SparseIntArray sparseIntArray) {
        this(i, i2, sparseIntArray, 0, Integer.MAX_VALUE, -1);
    }

    public C9745c0(int i, int i2, SparseIntArray sparseIntArray, int i3, int i4, int i5) {
        C9536j.m23279b(i >= 0 && i2 >= i);
        this.f25637b = i;
        this.f25636a = i2;
        this.f25638c = sparseIntArray;
        this.f25640e = i5;
    }
}
