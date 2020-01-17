package com.facebook.animated.webp;

import android.graphics.Bitmap;
import com.facebook.common.internal.C9527d;
import com.facebook.imagepipeline.animated.base.AnimatedImageFrame;

public class WebPFrame implements AnimatedImageFrame {
    @C9527d
    private long mNativeContext;

    @C9527d
    WebPFrame(long j) {
        this.mNativeContext = j;
    }

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDurationMs();

    private native int nativeGetHeight();

    private native int nativeGetWidth();

    private native int nativeGetXOffset();

    private native int nativeGetYOffset();

    private native boolean nativeIsBlendWithPreviousFrame();

    private native void nativeRenderFrame(int i, int i2, Bitmap bitmap);

    private native boolean nativeShouldDisposeToBackgroundColor();

    /* renamed from: a */
    public boolean mo25470a() {
        return nativeIsBlendWithPreviousFrame();
    }

    /* renamed from: b */
    public boolean mo25471b() {
        return nativeShouldDisposeToBackgroundColor();
    }

    public void dispose() {
        nativeDispose();
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        nativeFinalize();
    }

    public int getDurationMs() {
        return nativeGetDurationMs();
    }

    public int getHeight() {
        return nativeGetHeight();
    }

    public int getWidth() {
        return nativeGetWidth();
    }

    public int getXOffset() {
        return nativeGetXOffset();
    }

    public int getYOffset() {
        return nativeGetYOffset();
    }

    public void renderFrame(int i, int i2, Bitmap bitmap) {
        nativeRenderFrame(i, i2, bitmap);
    }
}
