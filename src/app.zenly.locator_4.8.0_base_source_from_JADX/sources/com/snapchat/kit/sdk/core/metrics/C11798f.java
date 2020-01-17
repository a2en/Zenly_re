package com.snapchat.kit.sdk.core.metrics;

import com.snapchat.kit.sdk.core.networking.ClientFactory;
import dagger.internal.C12021c;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.snapchat.kit.sdk.core.metrics.f */
public final class C11798f implements Factory<MetricsClient> {

    /* renamed from: a */
    private final Provider<ClientFactory> f30561a;

    public C11798f(Provider<ClientFactory> provider) {
        this.f30561a = provider;
    }

    /* renamed from: a */
    public MetricsClient get() {
        MetricsClient a = C11796d.m30968a((ClientFactory) this.f30561a.get());
        C12021c.m31671a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    /* renamed from: a */
    public static Factory<MetricsClient> m30974a(Provider<ClientFactory> provider) {
        return new C11798f(provider);
    }
}
