package com.snapchat.kit.sdk.core.metrics.business;

import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.snapchat.kit.sdk.core.metrics.business.f */
public final class C11792f implements Factory<C11791e> {

    /* renamed from: a */
    private final Provider<KitEventBaseFactory> f30553a;

    public C11792f(Provider<KitEventBaseFactory> provider) {
        this.f30553a = provider;
    }

    /* renamed from: a */
    public C11791e get() {
        return new C11791e((KitEventBaseFactory) this.f30553a.get());
    }

    /* renamed from: a */
    public static Factory<C11791e> m30956a(Provider<KitEventBaseFactory> provider) {
        return new C11792f(provider);
    }
}
