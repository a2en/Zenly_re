package com.bumptech.glide.load.engine.bitmap_recycle;

/* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.g */
public final class C8928g implements C8919a<int[]> {
    /* renamed from: a */
    public int mo24322a() {
        return 4;
    }

    public String getTag() {
        return "IntegerArrayPool";
    }

    /* renamed from: a */
    public int mo24323a(int[] iArr) {
        return iArr.length;
    }

    public int[] newArray(int i) {
        return new int[i];
    }
}
