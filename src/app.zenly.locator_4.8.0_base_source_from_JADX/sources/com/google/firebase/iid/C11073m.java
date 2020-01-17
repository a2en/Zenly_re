package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.util.C10174k;
import com.google.firebase.FirebaseApp;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

/* renamed from: com.google.firebase.iid.m */
public final class C11073m {

    /* renamed from: a */
    private final Context f28724a;

    /* renamed from: b */
    private String f28725b;

    /* renamed from: c */
    private String f28726c;

    /* renamed from: d */
    private int f28727d;

    /* renamed from: e */
    private int f28728e = 0;

    public C11073m(Context context) {
        this.f28724a = context;
    }

    /* renamed from: e */
    private final synchronized void m28509e() {
        PackageInfo a = m28506a(this.f28724a.getPackageName());
        if (a != null) {
            this.f28725b = Integer.toString(a.versionCode);
            this.f28726c = a.versionName;
        }
    }

    /* renamed from: a */
    public final synchronized int mo32301a() {
        if (this.f28728e != 0) {
            return this.f28728e;
        }
        PackageManager packageManager = this.f28724a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseInstanceId", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!C10174k.m25686i()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f28728e = 1;
                return this.f28728e;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
            Log.w("FirebaseInstanceId", "Failed to resolve IID implementation package, falling back");
            if (C10174k.m25686i()) {
                this.f28728e = 2;
            } else {
                this.f28728e = 1;
            }
            return this.f28728e;
        }
        this.f28728e = 2;
        return this.f28728e;
    }

    /* renamed from: b */
    public final synchronized String mo32302b() {
        if (this.f28725b == null) {
            m28509e();
        }
        return this.f28725b;
    }

    /* renamed from: c */
    public final synchronized String mo32303c() {
        if (this.f28726c == null) {
            m28509e();
        }
        return this.f28726c;
    }

    /* renamed from: d */
    public final synchronized int mo32304d() {
        if (this.f28727d == 0) {
            PackageInfo a = m28506a("com.google.android.gms");
            if (a != null) {
                this.f28727d = a.versionCode;
            }
        }
        return this.f28727d;
    }

    /* renamed from: a */
    public static String m28507a(FirebaseApp firebaseApp) {
        String b = firebaseApp.mo32138c().mo32164b();
        if (b != null) {
            return b;
        }
        String a = firebaseApp.mo32138c().mo32163a();
        if (!a.startsWith("1:")) {
            return a;
        }
        String[] split = a.split(":");
        if (split.length < 2) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    /* renamed from: a */
    public static String m28508a(KeyPair keyPair) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(keyPair.getPublic().getEncoded());
            digest[0] = (byte) ((digest[0] & 15) + 112);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("FirebaseInstanceId", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    /* renamed from: a */
    private final PackageInfo m28506a(String str) {
        try {
            return this.f28724a.getPackageManager().getPackageInfo(str, 0);
        } catch (NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb.append("Failed to find package ");
            sb.append(valueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }
}
