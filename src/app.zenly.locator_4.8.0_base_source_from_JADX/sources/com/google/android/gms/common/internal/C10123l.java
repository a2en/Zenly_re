package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.util.C10181q;

/* renamed from: com.google.android.gms.common.internal.l */
public final class C10123l {
    /* renamed from: a */
    public static <T> T m25505a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException("null reference");
    }

    /* renamed from: b */
    public static String m25515b(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    /* renamed from: c */
    public static void m25519c(String str) {
        if (C10181q.m25694a()) {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: a */
    public static String m25507a(String str, Object obj) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    /* renamed from: b */
    public static void m25516b(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    public static <T> T m25506a(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: b */
    public static void m25517b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* renamed from: a */
    public static void m25513a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: b */
    public static void m25518b(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }

    /* renamed from: a */
    public static void m25514a(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    /* renamed from: a */
    public static void m25512a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    public static void m25511a(String str) {
        if (!C10181q.m25694a()) {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: a */
    public static void m25508a() {
        m25519c("Must not be called on the main application thread");
    }

    /* renamed from: a */
    public static void m25509a(Handler handler) {
        String name = Looper.myLooper() != null ? Looper.myLooper().getThread().getName() : "null current looper";
        String name2 = handler.getLooper().getThread().getName();
        StringBuilder sb = new StringBuilder(String.valueOf(name2).length() + 36 + String.valueOf(name).length());
        sb.append("Must be called on ");
        sb.append(name2);
        sb.append(" thread, but got ");
        sb.append(name);
        sb.append(".");
        m25510a(handler, sb.toString());
    }

    /* renamed from: a */
    public static void m25510a(Handler handler, String str) {
        if (Looper.myLooper() != handler.getLooper()) {
            throw new IllegalStateException(str);
        }
    }
}
