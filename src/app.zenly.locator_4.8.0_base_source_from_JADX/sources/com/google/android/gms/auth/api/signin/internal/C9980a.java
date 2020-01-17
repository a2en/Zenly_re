package com.google.android.gms.auth.api.signin.internal;

/* renamed from: com.google.android.gms.auth.api.signin.internal.a */
public class C9980a {

    /* renamed from: b */
    private static int f26215b = 31;

    /* renamed from: a */
    private int f26216a = 1;

    /* renamed from: a */
    public C9980a mo26965a(Object obj) {
        this.f26216a = (f26215b * this.f26216a) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    /* renamed from: a */
    public final C9980a mo26966a(boolean z) {
        this.f26216a = (f26215b * this.f26216a) + (z ? 1 : 0);
        return this;
    }

    /* renamed from: a */
    public int mo26964a() {
        return this.f26216a;
    }
}
