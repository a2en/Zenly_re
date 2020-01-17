package com.google.android.gms.internal.clearcut;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.clearcut.d1 */
public final class C10292d1 {

    /* renamed from: a */
    static final Charset f26951a = Charset.forName("UTF-8");

    /* renamed from: b */
    public static final byte[] f26952b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f26952b = bArr;
        ByteBuffer.wrap(bArr);
        byte[] bArr2 = f26952b;
        C10319h0.m26125a(bArr2, 0, bArr2.length, false);
    }

    /* renamed from: a */
    static int m26014a(int i, byte[] bArr, int i2, int i3) {
        int i4 = i;
        for (int i5 = i2; i5 < i2 + i3; i5++) {
            i4 = (i4 * 31) + bArr[i5];
        }
        return i4;
    }

    /* renamed from: a */
    public static int m26015a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: a */
    public static int m26016a(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: a */
    public static int m26017a(byte[] bArr) {
        int length = bArr.length;
        int a = m26014a(length, bArr, 0, length);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    /* renamed from: a */
    static <T> T m26018a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    static Object m26019a(Object obj, Object obj2) {
        return ((zzdo) obj).zzbc().zza((zzdo) obj2).zzbi();
    }

    /* renamed from: a */
    static <T> T m26020a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: a */
    static boolean m26021a(zzdo zzdo) {
        return false;
    }

    /* renamed from: b */
    public static boolean m26022b(byte[] bArr) {
        return C10360m3.m26328a(bArr);
    }

    /* renamed from: c */
    public static String m26023c(byte[] bArr) {
        return new String(bArr, f26951a);
    }
}
