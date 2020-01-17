package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import com.bumptech.glide.gifdecoder.GifDecoder;
import com.bumptech.glide.load.C9011f;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.C9109e;

/* renamed from: com.bumptech.glide.load.resource.gif.g */
public final class C9161g implements ResourceDecoder<GifDecoder, Bitmap> {

    /* renamed from: a */
    private final BitmapPool f23787a;

    public C9161g(BitmapPool bitmapPool) {
        this.f23787a = bitmapPool;
    }

    /* renamed from: a */
    public Resource<Bitmap> decode(GifDecoder gifDecoder, int i, int i2, C9011f fVar) {
        return C9109e.m21814a(gifDecoder.getNextFrame(), this.f23787a);
    }

    /* renamed from: a */
    public boolean handles(GifDecoder gifDecoder, C9011f fVar) {
        return true;
    }
}
