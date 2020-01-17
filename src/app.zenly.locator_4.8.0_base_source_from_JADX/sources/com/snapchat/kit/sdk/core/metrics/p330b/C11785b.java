package com.snapchat.kit.sdk.core.metrics.p330b;

import com.google.gson.C11125d;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.snapchat.kit.sdk.core.metrics.b.b */
public final class C11785b implements Factory<C11783a> {

    /* renamed from: a */
    private final Provider<C11125d> f30537a;

    public C11785b(Provider<C11125d> provider) {
        this.f30537a = provider;
    }

    /* renamed from: a */
    public C11783a get() {
        return new C11783a((C11125d) this.f30537a.get());
    }

    /* renamed from: a */
    public static Factory<C11783a> m30943a(Provider<C11125d> provider) {
        return new C11785b(provider);
    }
}
