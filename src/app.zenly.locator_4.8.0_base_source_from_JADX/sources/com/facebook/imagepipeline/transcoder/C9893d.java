package com.facebook.imagepipeline.transcoder;

import com.facebook.imageformat.ImageFormat;
import com.facebook.imagepipeline.nativecode.C9775c;

/* renamed from: com.facebook.imagepipeline.transcoder.d */
public class C9893d implements ImageTranscoderFactory {

    /* renamed from: a */
    private final int f25997a;

    /* renamed from: b */
    private final boolean f25998b;

    /* renamed from: c */
    private final ImageTranscoderFactory f25999c;

    /* renamed from: d */
    private final Integer f26000d;

    public C9893d(int i, boolean z, ImageTranscoderFactory imageTranscoderFactory, Integer num) {
        this.f25997a = i;
        this.f25998b = z;
        this.f25999c = imageTranscoderFactory;
        this.f26000d = num;
    }

    /* renamed from: a */
    private ImageTranscoder m24723a(ImageFormat imageFormat, boolean z) {
        ImageTranscoderFactory imageTranscoderFactory = this.f25999c;
        if (imageTranscoderFactory == null) {
            return null;
        }
        return imageTranscoderFactory.createImageTranscoder(imageFormat, z);
    }

    /* renamed from: b */
    private ImageTranscoder m24724b(ImageFormat imageFormat, boolean z) {
        Integer num = this.f26000d;
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return m24725c(imageFormat, z);
        }
        if (intValue == 1) {
            return m24726d(imageFormat, z);
        }
        throw new IllegalArgumentException("Invalid ImageTranscoderType");
    }

    /* renamed from: c */
    private ImageTranscoder m24725c(ImageFormat imageFormat, boolean z) {
        return C9775c.m24272a(this.f25997a, this.f25998b).createImageTranscoder(imageFormat, z);
    }

    /* renamed from: d */
    private ImageTranscoder m24726d(ImageFormat imageFormat, boolean z) {
        return new C9895f(this.f25997a).createImageTranscoder(imageFormat, z);
    }

    public ImageTranscoder createImageTranscoder(ImageFormat imageFormat, boolean z) {
        ImageTranscoder a = m24723a(imageFormat, z);
        if (a == null) {
            a = m24724b(imageFormat, z);
        }
        if (a == null) {
            a = m24725c(imageFormat, z);
        }
        return a == null ? m24726d(imageFormat, z) : a;
    }
}
