package com.facebook.imagepipeline.nativecode;

import com.facebook.common.internal.C9527d;
import com.facebook.imageformat.C9650b;
import com.facebook.imageformat.ImageFormat;
import com.facebook.imagepipeline.transcoder.ImageTranscoder;
import com.facebook.imagepipeline.transcoder.ImageTranscoderFactory;

@C9527d
public class NativeJpegTranscoderFactory implements ImageTranscoderFactory {

    /* renamed from: a */
    private final int f25682a;

    /* renamed from: b */
    private final boolean f25683b;

    @C9527d
    public NativeJpegTranscoderFactory(int i, boolean z) {
        this.f25682a = i;
        this.f25683b = z;
    }

    @C9527d
    public ImageTranscoder createImageTranscoder(ImageFormat imageFormat, boolean z) {
        if (imageFormat != C9650b.f25197a) {
            return null;
        }
        return new NativeJpegTranscoder(z, this.f25682a, this.f25683b);
    }
}
