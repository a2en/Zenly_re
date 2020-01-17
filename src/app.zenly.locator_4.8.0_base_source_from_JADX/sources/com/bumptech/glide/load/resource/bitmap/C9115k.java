package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.resource.bitmap.k */
public class C9115k extends C9110f {

    /* renamed from: b */
    private static final byte[] f23690b = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1".getBytes(Key.f23163a);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Bitmap mo8554a(BitmapPool bitmapPool, Bitmap bitmap, int i, int i2) {
        return C9143y.m21898c(bitmapPool, bitmap, i, i2);
    }

    public boolean equals(Object obj) {
        return obj instanceof C9115k;
    }

    public int hashCode() {
        return "com.bumptech.glide.load.resource.bitmap.CircleCrop.1".hashCode();
    }

    public void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(f23690b);
    }
}
