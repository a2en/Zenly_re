package com.facebook.imagepipeline.nativecode;

/* renamed from: com.facebook.imagepipeline.nativecode.f */
public class C9778f {

    /* renamed from: a */
    private static WebpTranscoder f25686a;

    static {
        try {
            f25686a = (WebpTranscoder) Class.forName("com.facebook.imagepipeline.nativecode.WebpTranscoderImpl").newInstance();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static WebpTranscoder m24275a() {
        return f25686a;
    }
}
