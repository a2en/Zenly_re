package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.facebook.common.internal.C9536j;
import com.facebook.common.memory.C9545a;

/* renamed from: com.facebook.imagepipeline.memory.m */
public class C9757m implements BitmapPool {
    /* renamed from: a */
    public void release(Bitmap bitmap) {
        C9536j.m23271a(bitmap);
        bitmap.recycle();
    }

    public void trim(C9545a aVar) {
    }

    public Bitmap get(int i) {
        return Bitmap.createBitmap(1, (int) Math.ceil(((double) i) / 2.0d), Config.RGB_565);
    }
}
