package com.google.android.gms.gcm;

import android.os.Bundle;

/* renamed from: com.google.android.gms.gcm.k */
public final class C10220k {

    /* renamed from: d */
    public static final C10220k f26820d = new C10220k(0, 30, 3600);

    /* renamed from: a */
    private final int f26821a;

    /* renamed from: b */
    private final int f26822b = 30;

    /* renamed from: c */
    private final int f26823c = 3600;

    static {
        new C10220k(1, 30, 3600);
    }

    private C10220k(int i, int i2, int i3) {
        this.f26821a = i;
    }

    /* renamed from: a */
    public final int mo27720a() {
        return this.f26821a;
    }

    /* renamed from: b */
    public final int mo27722b() {
        return this.f26822b;
    }

    /* renamed from: c */
    public final int mo27723c() {
        return this.f26823c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10220k)) {
            return false;
        }
        C10220k kVar = (C10220k) obj;
        return kVar.f26821a == this.f26821a && kVar.f26822b == this.f26822b && kVar.f26823c == this.f26823c;
    }

    public final int hashCode() {
        return (((((this.f26821a + 1) ^ 1000003) * 1000003) ^ this.f26822b) * 1000003) ^ this.f26823c;
    }

    public final String toString() {
        int i = this.f26821a;
        int i2 = this.f26822b;
        int i3 = this.f26823c;
        StringBuilder sb = new StringBuilder(74);
        sb.append("policy=");
        sb.append(i);
        sb.append(" initial_backoff=");
        sb.append(i2);
        sb.append(" maximum_backoff=");
        sb.append(i3);
        return sb.toString();
    }

    /* renamed from: a */
    public final Bundle mo27721a(Bundle bundle) {
        bundle.putInt("retry_policy", this.f26821a);
        bundle.putInt("initial_backoff_seconds", this.f26822b);
        bundle.putInt("maximum_backoff_seconds", this.f26823c);
        return bundle;
    }
}
