package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import com.bumptech.glide.load.C9011f;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.resource.bitmap.h */
public final class C9112h implements ResourceDecoder<ByteBuffer, Bitmap> {

    /* renamed from: a */
    private final C9108d f23687a = new C9108d();

    /* renamed from: a */
    public Resource<Bitmap> decode(ByteBuffer byteBuffer, int i, int i2, C9011f fVar) throws IOException {
        return this.f23687a.decode(ImageDecoder.createSource(byteBuffer), i, i2, fVar);
    }

    /* renamed from: a */
    public boolean handles(ByteBuffer byteBuffer, C9011f fVar) throws IOException {
        return true;
    }
}
