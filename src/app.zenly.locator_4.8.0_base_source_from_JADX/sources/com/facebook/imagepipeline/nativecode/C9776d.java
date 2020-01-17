package com.facebook.imagepipeline.nativecode;

import android.os.Build.VERSION;
import com.facebook.soloader.SoLoader;

/* renamed from: com.facebook.imagepipeline.nativecode.d */
public class C9776d {

    /* renamed from: a */
    private static boolean f25684a;

    /* renamed from: a */
    public static synchronized void m24273a() {
        synchronized (C9776d.class) {
            if (!f25684a) {
                if (VERSION.SDK_INT <= 16) {
                    try {
                        SoLoader.m24767a("fb_jpegturbo");
                    } catch (UnsatisfiedLinkError unused) {
                    }
                }
                SoLoader.m24767a("native-imagetranscoder");
                f25684a = true;
            }
        }
    }
}
