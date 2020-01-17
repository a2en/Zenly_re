package com.facebook.animated.webp;

import com.facebook.common.internal.C9527d;
import com.facebook.common.internal.C9536j;
import com.facebook.imagepipeline.animated.base.AnimatedImage;
import com.facebook.imagepipeline.animated.base.C9653a;
import com.facebook.imagepipeline.animated.base.C9653a.C9654a;
import com.facebook.imagepipeline.animated.base.C9653a.C9655b;
import com.facebook.imagepipeline.animated.factory.AnimatedImageDecoder;
import com.facebook.imagepipeline.nativecode.C9777e;
import java.nio.ByteBuffer;

@C9527d
public class WebPImage implements AnimatedImage, AnimatedImageDecoder {
    @C9527d
    private long mNativeContext;

    @C9527d
    public WebPImage() {
    }

    /* renamed from: a */
    public static WebPImage m23129a(ByteBuffer byteBuffer) {
        C9777e.m24274a();
        byteBuffer.rewind();
        return nativeCreateFromDirectByteBuffer(byteBuffer);
    }

    private static native WebPImage nativeCreateFromDirectByteBuffer(ByteBuffer byteBuffer);

    private static native WebPImage nativeCreateFromNativeMemory(long j, int i);

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDuration();

    private native WebPFrame nativeGetFrame(int i);

    private native int nativeGetFrameCount();

    private native int[] nativeGetFrameDurations();

    private native int nativeGetHeight();

    private native int nativeGetLoopCount();

    private native int nativeGetSizeInBytes();

    private native int nativeGetWidth();

    public AnimatedImage decode(long j, int i) {
        return m23128a(j, i);
    }

    public void dispose() {
        nativeDispose();
    }

    public boolean doesRenderSupportScaling() {
        return true;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        nativeFinalize();
    }

    public int getDuration() {
        return nativeGetDuration();
    }

    public int getFrameCount() {
        return nativeGetFrameCount();
    }

    public int[] getFrameDurations() {
        return nativeGetFrameDurations();
    }

    public C9653a getFrameInfo(int i) {
        WebPFrame frame = getFrame(i);
        try {
            C9653a aVar = new C9653a(i, frame.getXOffset(), frame.getYOffset(), frame.getWidth(), frame.getHeight(), frame.mo25470a() ? C9654a.BLEND_WITH_PREVIOUS : C9654a.NO_BLEND, frame.mo25471b() ? C9655b.DISPOSE_TO_BACKGROUND : C9655b.DISPOSE_DO_NOT);
            return aVar;
        } finally {
            frame.dispose();
        }
    }

    public int getHeight() {
        return nativeGetHeight();
    }

    public int getLoopCount() {
        return nativeGetLoopCount();
    }

    public int getSizeInBytes() {
        return nativeGetSizeInBytes();
    }

    public int getWidth() {
        return nativeGetWidth();
    }

    @C9527d
    WebPImage(long j) {
        this.mNativeContext = j;
    }

    public AnimatedImage decode(ByteBuffer byteBuffer) {
        return m23129a(byteBuffer);
    }

    public WebPFrame getFrame(int i) {
        return nativeGetFrame(i);
    }

    /* renamed from: a */
    public static WebPImage m23128a(long j, int i) {
        C9777e.m24274a();
        C9536j.m23275a(j != 0);
        return nativeCreateFromNativeMemory(j, i);
    }
}
