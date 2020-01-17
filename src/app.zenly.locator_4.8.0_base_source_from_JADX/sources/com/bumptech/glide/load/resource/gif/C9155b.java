package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.bumptech.glide.gifdecoder.GifDecoder.BitmapProvider;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;

/* renamed from: com.bumptech.glide.load.resource.gif.b */
public final class C9155b implements BitmapProvider {

    /* renamed from: a */
    private final BitmapPool f23772a;

    /* renamed from: b */
    private final ArrayPool f23773b;

    public C9155b(BitmapPool bitmapPool, ArrayPool arrayPool) {
        this.f23772a = bitmapPool;
        this.f23773b = arrayPool;
    }

    public Bitmap obtain(int i, int i2, Config config) {
        return this.f23772a.getDirty(i, i2, config);
    }

    public byte[] obtainByteArray(int i) {
        ArrayPool arrayPool = this.f23773b;
        if (arrayPool == null) {
            return new byte[i];
        }
        return (byte[]) arrayPool.get(i, byte[].class);
    }

    public int[] obtainIntArray(int i) {
        ArrayPool arrayPool = this.f23773b;
        if (arrayPool == null) {
            return new int[i];
        }
        return (int[]) arrayPool.get(i, int[].class);
    }

    public void release(Bitmap bitmap) {
        this.f23772a.put(bitmap);
    }

    public void release(byte[] bArr) {
        ArrayPool arrayPool = this.f23773b;
        if (arrayPool != null) {
            arrayPool.put(bArr);
        }
    }

    public void release(int[] iArr) {
        ArrayPool arrayPool = this.f23773b;
        if (arrayPool != null) {
            arrayPool.put(iArr);
        }
    }
}
