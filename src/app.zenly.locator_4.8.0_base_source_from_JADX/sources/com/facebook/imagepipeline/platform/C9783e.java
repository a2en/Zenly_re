package com.facebook.imagepipeline.platform;

import android.annotation.TargetApi;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory.Options;
import android.graphics.ColorSpace;
import androidx.core.util.C0606h;
import com.facebook.imagepipeline.memory.BitmapPool;
import com.facebook.imageutils.C9896a;

@TargetApi(26)
/* renamed from: com.facebook.imagepipeline.platform.e */
public class C9783e extends C9780b {
    public C9783e(BitmapPool bitmapPool, int i, C0606h hVar) {
        super(bitmapPool, i, hVar);
    }

    /* renamed from: a */
    public int mo26573a(int i, int i2, Options options) {
        if (m24289a(options)) {
            return i * i2 * 8;
        }
        return C9896a.m24731a(i, i2, options.inPreferredConfig);
    }

    /* renamed from: a */
    private static boolean m24289a(Options options) {
        ColorSpace colorSpace = options.outColorSpace;
        return (colorSpace == null || !colorSpace.isWideGamut() || options.inPreferredConfig == Config.RGBA_F16) ? false : true;
    }
}
