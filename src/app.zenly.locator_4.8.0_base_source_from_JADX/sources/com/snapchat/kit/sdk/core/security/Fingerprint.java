package com.snapchat.kit.sdk.core.security;

import android.content.Context;

public class Fingerprint {

    /* renamed from: a */
    private final String f30587a;

    public Fingerprint(Context context) {
        System.loadLibrary("pruneau");
        this.f30587a = context.getPackageName();
    }

    /* renamed from: b */
    private String m30995b() {
        return String.format("%s:%d", new Object[]{this.f30587a, Long.valueOf(System.currentTimeMillis())});
    }

    private native String sign(String str);

    /* renamed from: a */
    public synchronized String mo34945a() {
        return sign(m30995b());
    }
}
