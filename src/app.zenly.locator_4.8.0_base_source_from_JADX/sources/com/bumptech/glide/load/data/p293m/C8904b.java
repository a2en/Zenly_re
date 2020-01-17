package com.bumptech.glide.load.data.p293m;

import android.net.Uri;

/* renamed from: com.bumptech.glide.load.data.m.b */
public final class C8904b {
    /* renamed from: a */
    public static boolean m21370a(int i, int i2) {
        return i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && i <= 512 && i2 <= 384;
    }

    /* renamed from: a */
    public static boolean m21371a(Uri uri) {
        return m21372b(uri) && !m21374d(uri);
    }

    /* renamed from: b */
    public static boolean m21372b(Uri uri) {
        if (uri != null) {
            if ("content".equals(uri.getScheme())) {
                if ("media".equals(uri.getAuthority())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m21373c(Uri uri) {
        return m21372b(uri) && m21374d(uri);
    }

    /* renamed from: d */
    private static boolean m21374d(Uri uri) {
        return uri.getPathSegments().contains("video");
    }
}
