package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.C10123l;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* renamed from: com.google.android.gms.auth.api.signin.internal.b */
public class C9981b {

    /* renamed from: c */
    private static final Lock f26217c = new ReentrantLock();

    /* renamed from: d */
    private static C9981b f26218d;

    /* renamed from: a */
    private final Lock f26219a = new ReentrantLock();

    /* renamed from: b */
    private final SharedPreferences f26220b;

    private C9981b(Context context) {
        this.f26220b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    /* renamed from: a */
    public static C9981b m25009a(Context context) {
        C10123l.m25505a(context);
        f26217c.lock();
        try {
            if (f26218d == null) {
                f26218d = new C9981b(context.getApplicationContext());
            }
            return f26218d;
        } finally {
            f26217c.unlock();
        }
    }

    /* renamed from: b */
    private final String m25011b(String str) {
        this.f26219a.lock();
        try {
            return this.f26220b.getString(str, null);
        } finally {
            this.f26219a.unlock();
        }
    }

    /* renamed from: a */
    public GoogleSignInAccount mo26967a() {
        return m25008a(m25011b("defaultGoogleSignInAccount"));
    }

    /* renamed from: a */
    private final GoogleSignInAccount m25008a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String b = m25011b(m25010a("googleSignInAccount", str));
        if (b != null) {
            try {
                return GoogleSignInAccount.m24979a(b);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    private static String m25010a(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }
}
