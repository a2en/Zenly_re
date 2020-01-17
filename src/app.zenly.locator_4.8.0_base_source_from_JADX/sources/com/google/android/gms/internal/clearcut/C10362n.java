package com.google.android.gms.internal.clearcut;

import android.net.Uri;

/* renamed from: com.google.android.gms.internal.clearcut.n */
public final class C10362n {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final String f27147a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Uri f27148b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final String f27149c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final String f27150d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final boolean f27151e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final boolean f27152f;

    public C10362n(Uri uri) {
        this(null, uri, "", "", false, false);
    }

    private C10362n(String str, Uri uri, String str2, String str3, boolean z, boolean z2) {
        this.f27147a = str;
        this.f27148b = uri;
        this.f27149c = str2;
        this.f27150d = str3;
        this.f27151e = z;
        this.f27152f = z2;
    }

    /* renamed from: a */
    public final <T> C10297e<T> mo28061a(String str, T t, zzan<T> zzan) {
        return C10297e.m26040a(this, str, t, zzan);
    }

    /* renamed from: a */
    public final C10297e<String> mo28062a(String str, String str2) {
        return C10297e.m26041a(this, str, (String) null);
    }

    /* renamed from: a */
    public final C10297e<Boolean> mo28063a(String str, boolean z) {
        return C10297e.m26042a(this, str, false);
    }

    /* renamed from: a */
    public final C10362n mo28064a(String str) {
        boolean z = this.f27151e;
        if (!z) {
            C10362n nVar = new C10362n(this.f27147a, this.f27148b, str, this.f27150d, z, this.f27152f);
            return nVar;
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    /* renamed from: b */
    public final C10362n mo28065b(String str) {
        C10362n nVar = new C10362n(this.f27147a, this.f27148b, this.f27149c, str, this.f27151e, this.f27152f);
        return nVar;
    }
}
