package com.bumptech.glide.load.resource.transcode;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.C9011f;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.C9109e;
import com.bumptech.glide.load.resource.gif.C9156c;

/* renamed from: com.bumptech.glide.load.resource.transcode.c */
public final class C9166c implements ResourceTranscoder<Drawable, byte[]> {

    /* renamed from: a */
    private final BitmapPool f23796a;

    /* renamed from: b */
    private final ResourceTranscoder<Bitmap, byte[]> f23797b;

    /* renamed from: c */
    private final ResourceTranscoder<C9156c, byte[]> f23798c;

    public C9166c(BitmapPool bitmapPool, ResourceTranscoder<Bitmap, byte[]> resourceTranscoder, ResourceTranscoder<C9156c, byte[]> resourceTranscoder2) {
        this.f23796a = bitmapPool;
        this.f23797b = resourceTranscoder;
        this.f23798c = resourceTranscoder2;
    }

    /* renamed from: a */
    private static Resource<C9156c> m21952a(Resource<Drawable> resource) {
        return resource;
    }

    public Resource<byte[]> transcode(Resource<Drawable> resource, C9011f fVar) {
        Drawable drawable = (Drawable) resource.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f23797b.transcode(C9109e.m21814a(((BitmapDrawable) drawable).getBitmap(), this.f23796a), fVar);
        }
        if (!(drawable instanceof C9156c)) {
            return null;
        }
        ResourceTranscoder<C9156c, byte[]> resourceTranscoder = this.f23798c;
        m21952a(resource);
        return resourceTranscoder.transcode(resource, fVar);
    }
}
