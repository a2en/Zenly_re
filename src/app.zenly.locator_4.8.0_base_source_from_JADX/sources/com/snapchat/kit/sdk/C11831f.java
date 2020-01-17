package com.snapchat.kit.sdk;

import dagger.internal.C12021c;
import dagger.internal.Factory;
import okhttp3.C13204g;

/* renamed from: com.snapchat.kit.sdk.f */
public final class C11831f implements Factory<C13204g> {

    /* renamed from: a */
    private final C11830e f30632a;

    public C11831f(C11830e eVar) {
        this.f30632a = eVar;
    }

    /* renamed from: a */
    public C13204g get() {
        C13204g f = this.f30632a.mo35000f();
        C12021c.m31671a(f, "Cannot return null from a non-@Nullable @Provides method");
        return f;
    }

    /* renamed from: a */
    public static Factory<C13204g> m31042a(C11830e eVar) {
        return new C11831f(eVar);
    }
}
