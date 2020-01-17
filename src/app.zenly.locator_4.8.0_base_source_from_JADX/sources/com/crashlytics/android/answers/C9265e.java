package com.crashlytics.android.answers;

import java.util.Locale;
import java.util.Map;
import p389io.fabric.sdk.android.C12154c;

/* renamed from: com.crashlytics.android.answers.e */
class C9265e {

    /* renamed from: a */
    final int f24075a;

    /* renamed from: b */
    final int f24076b;

    /* renamed from: c */
    boolean f24077c;

    public C9265e(int i, int i2, boolean z) {
        this.f24075a = i;
        this.f24076b = i2;
        this.f24077c = z;
    }

    /* renamed from: a */
    public String mo24979a(String str) {
        int length = str.length();
        int i = this.f24076b;
        if (length <= i) {
            return str;
        }
        m22320a((RuntimeException) new IllegalArgumentException(String.format(Locale.US, "String is too long, truncating to %d characters", new Object[]{Integer.valueOf(i)})));
        return str.substring(0, this.f24076b);
    }

    /* renamed from: a */
    public boolean mo24980a(Object obj, String str) {
        if (obj != null) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" must not be null");
        m22320a((RuntimeException) new NullPointerException(sb.toString()));
        return true;
    }

    /* renamed from: a */
    public boolean mo24981a(Map<String, Object> map, String str) {
        if (map.size() < this.f24075a || map.containsKey(str)) {
            return false;
        }
        m22320a((RuntimeException) new IllegalArgumentException(String.format(Locale.US, "Limit of %d attributes reached, skipping attribute", new Object[]{Integer.valueOf(this.f24075a)})));
        return true;
    }

    /* renamed from: a */
    private void m22320a(RuntimeException runtimeException) {
        if (!this.f24077c) {
            C12154c.m32113f().mo35957e("Answers", "Invalid user input detected", runtimeException);
            return;
        }
        throw runtimeException;
    }
}
