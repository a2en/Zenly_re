package com.snapchat.kit.sdk.core.security;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.snapchat.kit.sdk.core.security.b */
public final class C11811b implements Factory<Fingerprint> {

    /* renamed from: a */
    private final Provider<Context> f30592a;

    public C11811b(Provider<Context> provider) {
        this.f30592a = provider;
    }

    /* renamed from: a */
    public Fingerprint get() {
        return new Fingerprint((Context) this.f30592a.get());
    }

    /* renamed from: a */
    public static Factory<Fingerprint> m30999a(Provider<Context> provider) {
        return new C11811b(provider);
    }
}
