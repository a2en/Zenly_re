package com.bumptech.glide.load.p294h.p295d;

import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.p301o.C9216j;

/* renamed from: com.bumptech.glide.load.h.d.b */
public class C9020b implements Resource<byte[]> {

    /* renamed from: e */
    private final byte[] f23555e;

    public C9020b(byte[] bArr) {
        C9216j.m22083a(bArr);
        this.f23555e = bArr;
    }

    public Class<byte[]> getResourceClass() {
        return byte[].class;
    }

    public int getSize() {
        return this.f23555e.length;
    }

    public void recycle() {
    }

    public byte[] get() {
        return this.f23555e;
    }
}
