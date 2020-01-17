package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import com.bumptech.glide.load.C9011f;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.p301o.C9203a;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.resource.bitmap.s */
public final class C9135s implements ResourceDecoder<InputStream, Bitmap> {

    /* renamed from: a */
    private final C9108d f23717a = new C9108d();

    /* renamed from: a */
    public Resource<Bitmap> decode(InputStream inputStream, int i, int i2, C9011f fVar) throws IOException {
        return this.f23717a.decode(ImageDecoder.createSource(C9203a.m22057a(inputStream)), i, i2, fVar);
    }

    /* renamed from: a */
    public boolean handles(InputStream inputStream, C9011f fVar) throws IOException {
        return true;
    }
}
