package com.snapchat.kit.sdk.core.security;

import android.content.Context;
import android.security.KeyPairGeneratorSpec.Builder;
import android.util.Base64;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStore.PrivateKeyEntry;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableEntryException;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPublicKeySpec;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.security.auth.x500.X500Principal;

/* renamed from: com.snapchat.kit.sdk.core.security.d */
public class C11813d implements EncryptDecryptAlgorithm {

    /* renamed from: a */
    private final KeyPair f30593a;

    /* renamed from: com.snapchat.kit.sdk.core.security.d$b */
    public static class C11815b {

        /* renamed from: a */
        String f30594a;

        /* renamed from: b */
        String f30595b;

        public boolean equals(Object obj) {
            boolean z = false;
            if (!(obj instanceof C11815b)) {
                return false;
            }
            C11815b bVar = (C11815b) obj;
            if (Objects.equals(this.f30594a, bVar.f30594a) && Objects.equals(this.f30595b, bVar.f30595b)) {
                z = true;
            }
            return z;
        }

        private C11815b(String str, String str2) {
            this.f30594a = str;
            this.f30595b = str2;
        }
    }

    public C11813d(KeyStore keyStore, Context context, C11815b bVar) throws NoSuchAlgorithmException, NoSuchProviderException, UnrecoverableEntryException, InvalidAlgorithmParameterException, KeyStoreException {
        this.f30593a = m31002a(keyStore, context, bVar);
    }

    /* renamed from: b */
    private String m31003b(String str) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        Cipher instance = Cipher.getInstance("RSA/None/NoPadding");
        instance.init(2, this.f30593a.getPrivate());
        return new String(instance.doFinal(Base64.decode(str, 0)));
    }

    /* renamed from: a */
    public C11815b mo34952a() {
        RSAPublicKey rSAPublicKey = (RSAPublicKey) this.f30593a.getPublic();
        return new C11815b(rSAPublicKey.getModulus().toString(), rSAPublicKey.getPublicExponent().toString());
    }

    public String decrypt(String str) {
        if (str == null) {
            return null;
        }
        try {
            return m31003b(str);
        } catch (InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException unused) {
            return null;
        }
    }

    public String encrypt(String str) {
        if (str == null) {
            return null;
        }
        try {
            return m31001a(str);
        } catch (InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private String m31001a(String str) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        Cipher instance = Cipher.getInstance("RSA/None/NoPadding");
        instance.init(1, this.f30593a.getPublic());
        return Base64.encodeToString(instance.doFinal(str.getBytes()), 0);
    }

    /* renamed from: a */
    private static KeyPair m31002a(KeyStore keyStore, Context context, C11815b bVar) throws NoSuchAlgorithmException, NoSuchProviderException, UnrecoverableEntryException, InvalidAlgorithmParameterException, KeyStoreException {
        String str = "RSA";
        String str2 = "SnapConnectSDK.RSA";
        if (!(bVar == null || bVar.f30594a == null || bVar.f30595b == null || !keyStore.containsAlias(str2))) {
            try {
                return new KeyPair(KeyFactory.getInstance(str).generatePublic(new RSAPublicKeySpec(new BigInteger(bVar.f30594a), new BigInteger(bVar.f30595b))), ((PrivateKeyEntry) keyStore.getEntry(str2, null)).getPrivateKey());
            } catch (InvalidKeySpecException unused) {
            }
        }
        Calendar instance = Calendar.getInstance();
        Date time = instance.getTime();
        instance.add(1, 1);
        Date time2 = instance.getTime();
        KeyPairGenerator instance2 = KeyPairGenerator.getInstance(str, keyStore.getType());
        instance2.initialize(new Builder(context).setAlias(str2).setStartDate(time).setEndDate(time2).setSubject(new X500Principal("CN=SnapConnectSDK.RSA")).setSerialNumber(BigInteger.ONE).setKeySize(8192).build());
        return instance2.generateKeyPair();
    }
}
