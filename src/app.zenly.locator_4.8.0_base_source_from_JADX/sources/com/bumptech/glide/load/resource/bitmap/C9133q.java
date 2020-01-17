package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.resource.bitmap.q */
public class C9133q extends C9110f {

    /* renamed from: b */
    private static final byte[] f23709b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(Key.f23163a);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Bitmap mo8554a(BitmapPool bitmapPool, Bitmap bitmap, int i, int i2) {
        return C9143y.m21899d(bitmapPool, bitmap, i, i2);
    }

    public boolean equals(Object obj) {
        return obj instanceof C9133q;
    }

    public int hashCode() {
        return "com.bumptech.glide.load.resource.bitmap.FitCenter".hashCode();
    }

    public void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(f23709b);
    }
}
