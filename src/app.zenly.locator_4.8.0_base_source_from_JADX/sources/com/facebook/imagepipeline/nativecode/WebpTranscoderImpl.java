package com.facebook.imagepipeline.nativecode;

import android.os.Build.VERSION;
import com.facebook.common.internal.C9527d;
import com.facebook.common.internal.C9536j;
import com.facebook.common.webp.C9560a;
import com.facebook.imageformat.C9650b;
import com.facebook.imageformat.ImageFormat;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@C9527d
public class WebpTranscoderImpl implements WebpTranscoder {
    @C9527d
    private static native void nativeTranscodeWebpToJpeg(InputStream inputStream, OutputStream outputStream, int i) throws IOException;

    @C9527d
    private static native void nativeTranscodeWebpToPng(InputStream inputStream, OutputStream outputStream) throws IOException;

    public boolean isWebpNativelySupported(ImageFormat imageFormat) {
        boolean z = false;
        if (imageFormat == C9650b.f25202f) {
            if (VERSION.SDK_INT >= 14) {
                z = true;
            }
            return z;
        } else if (imageFormat == C9650b.f25203g || imageFormat == C9650b.f25204h || imageFormat == C9650b.f25205i) {
            return C9560a.f24761b;
        } else {
            if (imageFormat == C9650b.f25206j) {
                return false;
            }
            throw new IllegalArgumentException("Image format is not a WebP.");
        }
    }

    public void transcodeWebpToJpeg(InputStream inputStream, OutputStream outputStream, int i) throws IOException {
        C9777e.m24274a();
        C9536j.m23271a(inputStream);
        InputStream inputStream2 = inputStream;
        C9536j.m23271a(outputStream);
        nativeTranscodeWebpToJpeg(inputStream2, outputStream, i);
    }

    public void transcodeWebpToPng(InputStream inputStream, OutputStream outputStream) throws IOException {
        C9777e.m24274a();
        C9536j.m23271a(inputStream);
        InputStream inputStream2 = inputStream;
        C9536j.m23271a(outputStream);
        nativeTranscodeWebpToPng(inputStream2, outputStream);
    }
}
