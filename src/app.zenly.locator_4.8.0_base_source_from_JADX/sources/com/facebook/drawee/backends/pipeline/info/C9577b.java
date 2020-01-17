package com.facebook.drawee.backends.pipeline.info;

import com.facebook.imagepipeline.listener.C9734a;

/* renamed from: com.facebook.drawee.backends.pipeline.info.b */
public class C9577b extends C9734a {

    /* renamed from: a */
    private String f24803a;

    /* renamed from: b */
    private final ImageOriginListener f24804b;

    public C9577b(String str, ImageOriginListener imageOriginListener) {
        this.f24804b = imageOriginListener;
        mo25786a(str);
    }

    /* renamed from: a */
    public void mo25786a(String str) {
        this.f24803a = str;
    }

    public void onUltimateProducerReached(String str, String str2, boolean z) {
        ImageOriginListener imageOriginListener = this.f24804b;
        if (imageOriginListener != null) {
            imageOriginListener.onImageLoaded(this.f24803a, C9578c.m23454a(str2), z, str2);
        }
    }
}
