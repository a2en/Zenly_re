package com.google.android.gms.signin;

import com.google.android.gms.common.api.Api.ApiOptions.Optional;
import com.google.android.gms.common.internal.C10120k;

/* renamed from: com.google.android.gms.signin.a */
public final class C10677a implements Optional {

    /* renamed from: n */
    public static final C10677a f27755n;

    /* renamed from: e */
    private final boolean f27756e = false;

    /* renamed from: f */
    private final boolean f27757f = false;

    /* renamed from: g */
    private final String f27758g = null;

    /* renamed from: h */
    private final boolean f27759h = false;

    /* renamed from: i */
    private final String f27760i = null;

    /* renamed from: j */
    private final String f27761j = null;

    /* renamed from: k */
    private final boolean f27762k = false;

    /* renamed from: l */
    private final Long f27763l = null;

    /* renamed from: m */
    private final Long f27764m = null;

    /* renamed from: com.google.android.gms.signin.a$a */
    public static final class C10678a {
    }

    static {
        new C10678a();
        C10677a aVar = new C10677a(false, false, null, false, null, null, false, null, null);
        f27755n = aVar;
    }

    private C10677a(boolean z, boolean z2, String str, boolean z3, String str2, String str3, boolean z4, Long l, Long l2) {
    }

    /* renamed from: a */
    public final Long mo29261a() {
        return this.f27763l;
    }

    /* renamed from: b */
    public final String mo29262b() {
        return this.f27760i;
    }

    /* renamed from: c */
    public final String mo29263c() {
        return this.f27761j;
    }

    /* renamed from: d */
    public final Long mo29264d() {
        return this.f27764m;
    }

    /* renamed from: e */
    public final String mo29265e() {
        return this.f27758g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10677a)) {
            return false;
        }
        C10677a aVar = (C10677a) obj;
        return this.f27756e == aVar.f27756e && this.f27757f == aVar.f27757f && C10120k.m25501a(this.f27758g, aVar.f27758g) && this.f27759h == aVar.f27759h && this.f27762k == aVar.f27762k && C10120k.m25501a(this.f27760i, aVar.f27760i) && C10120k.m25501a(this.f27761j, aVar.f27761j) && C10120k.m25501a(this.f27763l, aVar.f27763l) && C10120k.m25501a(this.f27764m, aVar.f27764m);
    }

    /* renamed from: f */
    public final boolean mo29267f() {
        return this.f27759h;
    }

    /* renamed from: g */
    public final boolean mo29268g() {
        return this.f27757f;
    }

    /* renamed from: h */
    public final boolean mo29269h() {
        return this.f27756e;
    }

    public final int hashCode() {
        return C10120k.m25499a(Boolean.valueOf(this.f27756e), Boolean.valueOf(this.f27757f), this.f27758g, Boolean.valueOf(this.f27759h), Boolean.valueOf(this.f27762k), this.f27760i, this.f27761j, this.f27763l, this.f27764m);
    }

    /* renamed from: i */
    public final boolean mo29271i() {
        return this.f27762k;
    }
}
