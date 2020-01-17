package com.crashlytics.android.core;

import android.content.Context;
import android.os.Bundle;

/* renamed from: com.crashlytics.android.core.z */
class C9425z implements C9413t0 {

    /* renamed from: a */
    private final Context f24397a;

    /* renamed from: b */
    private final String f24398b;

    public C9425z(Context context, String str) {
        this.f24397a = context;
        this.f24398b = str;
    }

    /* renamed from: a */
    public String mo25217a() {
        try {
            Bundle bundle = this.f24397a.getPackageManager().getApplicationInfo(this.f24398b, 128).metaData;
            if (bundle != null) {
                return bundle.getString("io.fabric.unity.crashlytics.version");
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
