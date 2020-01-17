package com.snapchat.kit.sdk;

import dagger.internal.C12021c;
import dagger.internal.Factory;
import okhttp3.C13325v;

/* renamed from: com.snapchat.kit.sdk.k */
public final class C11836k implements Factory<C13325v> {

    /* renamed from: a */
    private final C11830e f30644a;

    public C11836k(C11830e eVar) {
        this.f30644a = eVar;
    }

    /* renamed from: a */
    public C13325v get() {
        C13325v g = this.f30644a.mo35001g();
        C12021c.m31671a(g, "Cannot return null from a non-@Nullable @Provides method");
        return g;
    }

    /* renamed from: a */
    public static Factory<C13325v> m31052a(C11830e eVar) {
        return new C11836k(eVar);
    }
}
