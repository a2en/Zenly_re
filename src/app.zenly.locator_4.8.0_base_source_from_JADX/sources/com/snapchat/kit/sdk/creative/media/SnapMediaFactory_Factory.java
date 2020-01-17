package com.snapchat.kit.sdk.creative.media;

import com.snapchat.kit.sdk.creative.p331c.C11827c;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class SnapMediaFactory_Factory implements Factory<SnapMediaFactory> {

    /* renamed from: a */
    private final Provider<C11827c> f30613a;

    public SnapMediaFactory_Factory(Provider<C11827c> provider) {
        this.f30613a = provider;
    }

    public static Factory<SnapMediaFactory> create(Provider<C11827c> provider) {
        return new SnapMediaFactory_Factory(provider);
    }

    public static SnapMediaFactory newSnapMediaFactory(C11827c cVar) {
        return new SnapMediaFactory(cVar);
    }

    public SnapMediaFactory get() {
        return new SnapMediaFactory((C11827c) this.f30613a.get());
    }
}
