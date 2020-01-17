package com.bumptech.glide.p301o;

import android.text.TextUtils;
import java.util.Collection;

/* renamed from: com.bumptech.glide.o.j */
public final class C9216j {
    /* renamed from: a */
    public static void m22087a(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: a */
    public static <T> T m22083a(T t) {
        m22084a(t, "Argument must not be null");
        return t;
    }

    /* renamed from: a */
    public static <T> T m22084a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: a */
    public static String m22085a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    /* renamed from: a */
    public static <T extends Collection<Y>, Y> T m22086a(T t) {
        if (!t.isEmpty()) {
            return t;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }
}
