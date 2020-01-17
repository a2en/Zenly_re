package com.snapchat.kit.sdk.core.security;

import android.util.Base64;
import com.google.gson.C11125d;
import com.google.gson.JsonParseException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* renamed from: com.snapchat.kit.sdk.core.security.a */
public class C11809a implements EncryptDecryptAlgorithm {

    /* renamed from: a */
    private final SecretKey f30588a;

    /* renamed from: b */
    private final C11125d f30589b;

    /* renamed from: com.snapchat.kit.sdk.core.security.a$a */
    private static class C11810a {

        /* renamed from: a */
        String f30590a;

        /* renamed from: b */
        String f30591b;

        C11810a(String str, String str2) {
            this.f30590a = str;
            this.f30591b = str2;
        }
    }

    public C11809a(SecretKey secretKey, C11125d dVar) {
        this.f30588a = secretKey;
        this.f30589b = dVar;
    }

    /* renamed from: a */
    private C11810a m30997a(String str) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {
        Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
        instance.init(1, this.f30588a);
        return new C11810a(Base64.encodeToString(instance.getIV(), 0), Base64.encodeToString(instance.doFinal(str.getBytes()), 0));
    }

    public String decrypt(String str) {
        C11810a aVar;
        try {
            aVar = (C11810a) this.f30589b.mo32457a(str, C11810a.class);
        } catch (JsonParseException unused) {
            aVar = null;
        }
        if (!(aVar == null || aVar.f30591b == null || aVar.f30590a == null)) {
            try {
                return m30998a(aVar);
            } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException unused2) {
            }
        }
        return null;
    }

    public String encrypt(String str) {
        if (str == null) {
            return null;
        }
        try {
            return this.f30589b.mo32460a((Object) m30997a(str));
        } catch (JsonParseException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private String m30998a(C11810a aVar) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {
        byte[] decode = Base64.decode(aVar.f30590a, 0);
        byte[] decode2 = Base64.decode(aVar.f30591b, 0);
        Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
        instance.init(2, this.f30588a, new GCMParameterSpec(128, decode));
        return new String(instance.doFinal(decode2));
    }
}
