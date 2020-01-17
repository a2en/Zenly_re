package com.snapchat.kit.sdk.core.metrics.business;

import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.snapchat.kit.sdk.core.metrics.business.g */
public final class C11793g implements Factory<KitEventBaseFactory> {

    /* renamed from: a */
    private final Provider<String> f30554a;

    public C11793g(Provider<String> provider) {
        this.f30554a = provider;
    }

    /* renamed from: a */
    public KitEventBaseFactory get() {
        return new KitEventBaseFactory((String) this.f30554a.get());
    }

    /* renamed from: a */
    public static Factory<KitEventBaseFactory> m30959a(Provider<String> provider) {
        return new C11793g(provider);
    }

    /* renamed from: a */
    public static KitEventBaseFactory m30958a(String str) {
        return new KitEventBaseFactory(str);
    }
}
