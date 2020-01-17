package com.snapchat.kit.sdk.core.metrics.business;

import android.content.SharedPreferences;

/* renamed from: com.snapchat.kit.sdk.core.metrics.business.h */
public class C11794h {

    /* renamed from: a */
    private final SharedPreferences f30555a;

    /* renamed from: b */
    private long f30556b = 0;

    public C11794h(SharedPreferences sharedPreferences) {
        this.f30555a = sharedPreferences;
    }

    /* renamed from: a */
    public void mo34664a() {
        this.f30556b = this.f30555a.getLong("sequence_id_max", 0);
    }

    /* renamed from: b */
    public long mo34665b() {
        long j = this.f30556b + 1;
        this.f30556b = j;
        this.f30555a.edit().putLong("sequence_id_max", this.f30556b).apply();
        return j;
    }

    /* renamed from: c */
    public long mo34666c() {
        return this.f30556b;
    }
}
