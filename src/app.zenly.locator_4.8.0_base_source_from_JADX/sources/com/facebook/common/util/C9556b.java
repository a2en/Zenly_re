package com.facebook.common.util;

import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.facebook.common.util.b */
public class C9556b {
    /* renamed from: a */
    public static String m23380a(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-1");
            instance.update(bArr, 0, bArr.length);
            return Base64.encodeToString(instance.digest(), 11);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
