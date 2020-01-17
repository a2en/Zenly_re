package com.segment.analytics;

import android.content.SharedPreferences;

/* renamed from: com.segment.analytics.b */
public class C11620b {

    /* renamed from: a */
    private final SharedPreferences f30186a;

    /* renamed from: b */
    private final String f30187b;

    /* renamed from: c */
    private final boolean f30188c;

    public C11620b(SharedPreferences sharedPreferences, String str, boolean z) {
        this.f30186a = sharedPreferences;
        this.f30187b = str;
        this.f30188c = z;
    }

    /* renamed from: a */
    public boolean mo34281a() {
        return this.f30186a.getBoolean(this.f30187b, this.f30188c);
    }

    /* renamed from: a */
    public void mo34280a(boolean z) {
        this.f30186a.edit().putBoolean(this.f30187b, z).apply();
    }
}
