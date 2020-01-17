package com.facebook.imageutils;

import android.graphics.ColorSpace;
import android.util.Pair;

/* renamed from: com.facebook.imageutils.b */
public class C9898b {

    /* renamed from: a */
    private final Pair<Integer, Integer> f26006a;

    /* renamed from: b */
    private final ColorSpace f26007b;

    public C9898b(int i, int i2, ColorSpace colorSpace) {
        this.f26006a = (i == -1 || i2 == -1) ? null : new Pair<>(Integer.valueOf(i), Integer.valueOf(i2));
        this.f26007b = colorSpace;
    }

    /* renamed from: a */
    public ColorSpace mo26763a() {
        return this.f26007b;
    }

    /* renamed from: b */
    public Pair<Integer, Integer> mo26764b() {
        return this.f26006a;
    }
}
