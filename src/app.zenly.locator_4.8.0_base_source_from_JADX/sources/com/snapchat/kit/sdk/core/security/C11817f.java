package com.snapchat.kit.sdk.core.security;

import android.annotation.TargetApi;
import android.content.SharedPreferences;
import android.security.keystore.KeyGenParameterSpec.Builder;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStore.SecretKeyEntry;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableEntryException;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.snapchat.kit.sdk.core.security.f */
public class C11817f {
    @TargetApi(23)
    /* renamed from: a */
    public static C11816e m31008a(KeyStore keyStore) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        String str = "SnapConnectSDK.AES";
        try {
            if (keyStore.containsAlias(str)) {
                return new C11816e(((SecretKeyEntry) keyStore.getEntry(str, null)).getSecretKey(), false);
            }
        } catch (KeyStoreException | UnrecoverableEntryException unused) {
        }
        KeyGenerator instance = KeyGenerator.getInstance("AES", keyStore.getType());
        instance.init(new Builder(str, 3).setBlockModes(new String[]{"GCM"}).setEncryptionPaddings(new String[]{"NoPadding"}).setKeySize(256).build());
        return new C11816e(instance.generateKey(), true);
    }

    /* renamed from: a */
    public static C11816e m31007a(SharedPreferences sharedPreferences, EncryptDecryptAlgorithm encryptDecryptAlgorithm, boolean z) throws NoSuchAlgorithmException {
        boolean z2;
        String str = "encoded_secret";
        SecretKey secretKey = null;
        if (!z) {
            String string = sharedPreferences.getString(str, null);
            if (string != null) {
                secretKey = m31011a(string, 32, encryptDecryptAlgorithm);
            }
        }
        if (secretKey == null) {
            z2 = true;
            secretKey = m31010a();
            sharedPreferences.edit().putString(str, m31009a(secretKey, encryptDecryptAlgorithm)).apply();
        } else {
            z2 = false;
        }
        return new C11816e(secretKey, z2);
    }

    /* renamed from: a */
    private static SecretKey m31010a() throws NoSuchAlgorithmException {
        KeyGenerator instance = KeyGenerator.getInstance("AES");
        instance.init(256);
        return instance.generateKey();
    }

    /* renamed from: a */
    private static String m31009a(SecretKey secretKey, EncryptDecryptAlgorithm encryptDecryptAlgorithm) {
        return encryptDecryptAlgorithm.encrypt(new String(secretKey.getEncoded()));
    }

    /* renamed from: a */
    private static SecretKey m31011a(String str, int i, EncryptDecryptAlgorithm encryptDecryptAlgorithm) {
        String decrypt = encryptDecryptAlgorithm.decrypt(str);
        if (decrypt == null) {
            return null;
        }
        return new SecretKeySpec(decrypt.getBytes(), decrypt.length() - i, i, "AES");
    }
}
