package com.snapchat.kit.sdk;

import dagger.internal.C12021c;
import dagger.internal.Factory;

/* renamed from: com.snapchat.kit.sdk.g */
public final class C11832g implements Factory<String> {

    /* renamed from: a */
    private final C11830e f30633a;

    public C11832g(C11830e eVar) {
        this.f30633a = eVar;
    }

    /* renamed from: a */
    public String get() {
        String b = this.f30633a.mo34996b();
        C12021c.m31671a(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }

    /* renamed from: a */
    public static Factory<String> m31044a(C11830e eVar) {
        return new C11832g(eVar);
    }
}
