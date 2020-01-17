package com.android.installreferrer.api;

import android.os.Bundle;

/* renamed from: com.android.installreferrer.api.c */
public class C8701c {

    /* renamed from: a */
    private final Bundle f22395a;

    public C8701c(Bundle bundle) {
        this.f22395a = bundle;
    }

    /* renamed from: a */
    public long mo23486a() {
        return this.f22395a.getLong("install_begin_timestamp_seconds");
    }

    /* renamed from: b */
    public String mo23487b() {
        return this.f22395a.getString("install_referrer");
    }

    /* renamed from: c */
    public long mo23488c() {
        return this.f22395a.getLong("referrer_click_timestamp_seconds");
    }
}
