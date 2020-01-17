package com.snapchat.kit.sdk.core.security;

import android.content.SharedPreferences;
import com.google.gson.C11125d;
import com.google.gson.JsonParseException;

/* renamed from: com.snapchat.kit.sdk.core.security.g */
public class C11818g implements KeyValueStore {

    /* renamed from: a */
    private final SharedPreferences f30598a;

    /* renamed from: b */
    private final EncryptDecryptAlgorithm f30599b;

    /* renamed from: c */
    private final C11125d f30600c;

    public C11818g(SharedPreferences sharedPreferences, EncryptDecryptAlgorithm encryptDecryptAlgorithm, C11125d dVar) {
        this.f30598a = sharedPreferences;
        this.f30599b = encryptDecryptAlgorithm;
        this.f30600c = dVar;
    }

    public void clearEntry(String str) {
        this.f30598a.edit().remove(str).apply();
    }

    public <T> T get(String str, Class<T> cls) {
        String string = getString(str, null);
        if (string == null) {
            return null;
        }
        try {
            return this.f30600c.mo32457a(string, cls);
        } catch (JsonParseException unused) {
            clearEntry(str);
            return null;
        }
    }

    public String getString(String str, String str2) {
        String string = this.f30598a.getString(str, null);
        if (string == null) {
            return str2;
        }
        String decrypt = this.f30599b.decrypt(string);
        if (decrypt != null) {
            return decrypt;
        }
        clearEntry(str);
        return str2;
    }

    public void put(String str, Object obj) {
        putString(str, this.f30600c.mo32460a(obj));
    }

    public void putString(String str, String str2) {
        this.f30598a.edit().putString(str, str2 == null ? null : this.f30599b.encrypt(str2)).apply();
    }
}
