package com.snapchat.kit.sdk;

import android.content.Context;
import dagger.internal.C12021c;
import dagger.internal.Factory;

/* renamed from: com.snapchat.kit.sdk.h */
public final class C11833h implements Factory<Context> {

    /* renamed from: a */
    private final C11830e f30634a;

    public C11833h(C11830e eVar) {
        this.f30634a = eVar;
    }

    /* renamed from: a */
    public Context get() {
        Context a = this.f30634a.mo34991a();
        C12021c.m31671a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    /* renamed from: a */
    public static Factory<Context> m31046a(C11830e eVar) {
        return new C11833h(eVar);
    }
}
