package com.zendesk.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

/* renamed from: com.zendesk.util.b */
public class C12012b {
    /* renamed from: a */
    public static String m31642a(String str) {
        return C12017g.m31658b(str) ? m31643a(m31644a("SHA-1", str)) : "";
    }

    /* renamed from: a */
    private static byte[] m31644a(String str, String str2) {
        if (!C12017g.m31658b(str) || !C12017g.m31658b(str2)) {
            return new byte[0];
        }
        try {
            MessageDigest instance = MessageDigest.getInstance(str);
            instance.update(str2.getBytes());
            return instance.digest();
        } catch (NoSuchAlgorithmException unused) {
            return new byte[0];
        }
    }

    /* renamed from: a */
    private static String m31643a(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            sb.append(String.format(Locale.US, "%02x", new Object[]{Integer.valueOf(b & 255)}));
        }
        return sb.toString();
    }
}
