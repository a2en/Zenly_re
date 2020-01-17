package com.facebook.imagepipeline.platform;

import android.annotation.TargetApi;
import android.graphics.BitmapFactory.Options;
import androidx.core.util.C0606h;
import com.facebook.imagepipeline.memory.BitmapPool;
import com.facebook.imageutils.C9896a;

@TargetApi(21)
/* renamed from: com.facebook.imagepipeline.platform.a */
public class C9779a extends C9780b {
    public C9779a(BitmapPool bitmapPool, int i, C0606h hVar) {
        super(bitmapPool, i, hVar);
    }

    /* renamed from: a */
    public int mo26573a(int i, int i2, Options options) {
        return C9896a.m24731a(i, i2, options.inPreferredConfig);
    }
}
