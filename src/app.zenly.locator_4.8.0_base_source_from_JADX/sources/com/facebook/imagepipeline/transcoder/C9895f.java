package com.facebook.imagepipeline.transcoder;

import com.facebook.imageformat.ImageFormat;

/* renamed from: com.facebook.imagepipeline.transcoder.f */
public class C9895f implements ImageTranscoderFactory {

    /* renamed from: a */
    private final int f26003a;

    public C9895f(int i) {
        this.f26003a = i;
    }

    public ImageTranscoder createImageTranscoder(ImageFormat imageFormat, boolean z) {
        return new C9894e(z, this.f26003a);
    }
}
