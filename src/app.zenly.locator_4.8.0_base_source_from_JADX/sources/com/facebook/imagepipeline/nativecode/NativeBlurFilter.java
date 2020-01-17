package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import com.facebook.common.internal.C9527d;

@C9527d
public class NativeBlurFilter {
    static {
        C9774b.m24271a();
    }

    @C9527d
    private static native void nativeIterativeBoxBlur(Bitmap bitmap, int i, int i2);
}
