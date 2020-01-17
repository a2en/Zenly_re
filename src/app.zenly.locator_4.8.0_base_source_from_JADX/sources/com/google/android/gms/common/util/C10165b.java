package com.google.android.gms.common.util;

import android.util.Base64;

/* renamed from: com.google.android.gms.common.util.b */
public final class C10165b {
    /* renamed from: a */
    public static String m25656a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 0);
    }

    /* renamed from: b */
    public static String m25657b(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 10);
    }
}
