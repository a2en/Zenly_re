package com.appsflyer.internal;

/* renamed from: com.appsflyer.internal.ag */
public class C8759ag {
    /* renamed from: ˎ */
    public static void m20699(byte[] bArr, byte b, long j) {
        for (int i = 0; i < bArr.length; i++) {
            if (((1 << i) & j) != 0) {
                bArr[i] = (byte) (bArr[i] ^ b);
            }
        }
    }
}
