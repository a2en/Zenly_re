package com.android.volley;

import android.text.TextUtils;

/* renamed from: com.android.volley.d */
public final class C8713d {

    /* renamed from: a */
    private final String f22448a;

    /* renamed from: b */
    private final String f22449b;

    public C8713d(String str, String str2) {
        this.f22448a = str;
        this.f22449b = str2;
    }

    /* renamed from: a */
    public final String mo23571a() {
        return this.f22448a;
    }

    /* renamed from: b */
    public final String mo23572b() {
        return this.f22449b;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C8713d.class != obj.getClass()) {
            return false;
        }
        C8713d dVar = (C8713d) obj;
        if (!TextUtils.equals(this.f22448a, dVar.f22448a) || !TextUtils.equals(this.f22449b, dVar.f22449b)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return (this.f22448a.hashCode() * 31) + this.f22449b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Header[name=");
        sb.append(this.f22448a);
        sb.append(",value=");
        sb.append(this.f22449b);
        sb.append("]");
        return sb.toString();
    }
}
