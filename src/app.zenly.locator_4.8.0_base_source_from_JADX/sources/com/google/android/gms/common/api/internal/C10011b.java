package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.internal.C10120k;

/* renamed from: com.google.android.gms.common.api.internal.b */
public final class C10011b<O extends ApiOptions> {

    /* renamed from: a */
    private final boolean f26329a = false;

    /* renamed from: b */
    private final int f26330b;

    /* renamed from: c */
    private final Api<O> f26331c;

    /* renamed from: d */
    private final O f26332d;

    private C10011b(Api<O> api, O o) {
        this.f26331c = api;
        this.f26332d = o;
        this.f26330b = C10120k.m25499a(this.f26331c, this.f26332d);
    }

    /* renamed from: a */
    public static <O extends ApiOptions> C10011b<O> m25110a(Api<O> api, O o) {
        return new C10011b<>(api, o);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10011b)) {
            return false;
        }
        C10011b bVar = (C10011b) obj;
        return !this.f26329a && !bVar.f26329a && C10120k.m25501a(this.f26331c, bVar.f26331c) && C10120k.m25501a(this.f26332d, bVar.f26332d);
    }

    public final int hashCode() {
        return this.f26330b;
    }

    /* renamed from: a */
    public final String mo27147a() {
        return this.f26331c.mo27008b();
    }
}
