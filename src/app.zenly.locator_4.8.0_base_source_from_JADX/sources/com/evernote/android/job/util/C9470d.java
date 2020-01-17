package com.evernote.android.job.util;

import android.text.TextUtils;
import java.util.Locale;

/* renamed from: com.evernote.android.job.util.d */
public final class C9470d {
    /* renamed from: a */
    public static <T> T m23045a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    /* renamed from: b */
    public static long m23047b(long j, String str) {
        if (j > 0) {
            return j;
        }
        throw new IllegalArgumentException(str);
    }

    /* renamed from: a */
    public static <T> T m23046a(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: a */
    public static <T extends CharSequence> T m23044a(T t) {
        if (!TextUtils.isEmpty(t)) {
            return t;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public static int m23041a(int i, String str) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(str);
    }

    /* renamed from: a */
    public static long m23043a(long j, String str) {
        if (j >= 0) {
            return j;
        }
        throw new IllegalArgumentException(str);
    }

    /* renamed from: a */
    public static long m23042a(long j, long j2, long j3, String str) {
        if (j < j2) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", new Object[]{str, Long.valueOf(j2), Long.valueOf(j3)}));
        } else if (j <= j3) {
            return j;
        } else {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", new Object[]{str, Long.valueOf(j2), Long.valueOf(j3)}));
        }
    }
}