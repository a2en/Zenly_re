package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.p301o.C9216j;
import com.bumptech.glide.p301o.C9217k;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.resource.bitmap.w */
public final class C9140w extends C9110f {

    /* renamed from: c */
    private static final byte[] f23728c = "com.bumptech.glide.load.resource.bitmap.RoundedCorners".getBytes(Key.f23163a);

    /* renamed from: b */
    private final int f23729b;

    public C9140w(int i) {
        C9216j.m22087a(i > 0, "roundingRadius must be greater than 0.");
        this.f23729b = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Bitmap mo8554a(BitmapPool bitmapPool, Bitmap bitmap, int i, int i2) {
        return C9143y.m21895b(bitmapPool, bitmap, this.f23729b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C9140w)) {
            return false;
        }
        if (this.f23729b == ((C9140w) obj).f23729b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C9217k.m22090a("com.bumptech.glide.load.resource.bitmap.RoundedCorners".hashCode(), C9217k.m22102b(this.f23729b));
    }

    public void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(f23728c);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f23729b).array());
    }
}
