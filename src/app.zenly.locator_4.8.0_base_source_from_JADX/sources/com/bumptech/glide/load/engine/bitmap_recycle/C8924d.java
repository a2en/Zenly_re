package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;

/* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.d */
public class C8924d implements BitmapPool {
    public void clearMemory() {
    }

    public Bitmap get(int i, int i2, Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    public Bitmap getDirty(int i, int i2, Config config) {
        return get(i, i2, config);
    }

    public long getMaxSize() {
        return 0;
    }

    public void put(Bitmap bitmap) {
        bitmap.recycle();
    }

    public void setSizeMultiplier(float f) {
    }

    public void trimMemory(int i) {
    }
}
