package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.C9011f;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.p301o.C9203a;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.resource.bitmap.g */
public class C9111g implements ResourceDecoder<ByteBuffer, Bitmap> {

    /* renamed from: a */
    private final Downsampler f23686a;

    public C9111g(Downsampler downsampler) {
        this.f23686a = downsampler;
    }

    /* renamed from: a */
    public boolean handles(ByteBuffer byteBuffer, C9011f fVar) {
        return this.f23686a.mo24614a(byteBuffer);
    }

    /* renamed from: a */
    public Resource<Bitmap> decode(ByteBuffer byteBuffer, int i, int i2, C9011f fVar) throws IOException {
        return this.f23686a.mo24611a(C9203a.m22060c(byteBuffer), i, i2, fVar);
    }
}
