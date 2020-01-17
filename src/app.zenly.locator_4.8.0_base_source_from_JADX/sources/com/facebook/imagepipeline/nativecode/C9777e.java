package com.facebook.imagepipeline.nativecode;

import android.os.Build.VERSION;
import com.facebook.soloader.SoLoader;

/* renamed from: com.facebook.imagepipeline.nativecode.e */
public class C9777e {

    /* renamed from: a */
    private static boolean f25685a;

    /* renamed from: a */
    public static synchronized void m24274a() {
        synchronized (C9777e.class) {
            if (!f25685a) {
                if (VERSION.SDK_INT <= 16) {
                    try {
                        SoLoader.m24767a("fb_jpegturbo");
                    } catch (UnsatisfiedLinkError unused) {
                    }
                }
                SoLoader.m24767a("static-webp");
                f25685a = true;
            }
        }
    }
}
