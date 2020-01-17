package com.bumptech.glide.load.engine.bitmap_recycle;

/* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.e */
public final class C8925e implements C8919a<byte[]> {
    /* renamed from: a */
    public int mo24322a() {
        return 1;
    }

    public String getTag() {
        return "ByteArrayPool";
    }

    /* renamed from: a */
    public int mo24323a(byte[] bArr) {
        return bArr.length;
    }

    public byte[] newArray(int i) {
        return new byte[i];
    }
}
