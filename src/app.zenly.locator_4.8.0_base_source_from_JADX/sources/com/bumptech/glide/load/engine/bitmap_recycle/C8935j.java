package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;

/* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.j */
interface C8935j {
    /* renamed from: a */
    String mo24326a(int i, int i2, Config config);

    /* renamed from: a */
    String mo24327a(Bitmap bitmap);

    /* renamed from: b */
    int mo24328b(Bitmap bitmap);

    Bitmap get(int i, int i2, Config config);

    void put(Bitmap bitmap);

    Bitmap removeLast();
}
