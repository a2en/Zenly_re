package com.snapchat.kit.sdk.creative.p331c;

import com.snapchat.kit.sdk.core.metrics.MetricQueue;
import com.snapchat.kit.sdk.core.metrics.model.OpMetric;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.snapchat.kit.sdk.creative.c.d */
public final class C11828d implements Factory<C11827c> {

    /* renamed from: a */
    private final Provider<MetricQueue<OpMetric>> f30611a;

    public C11828d(Provider<MetricQueue<OpMetric>> provider) {
        this.f30611a = provider;
    }

    /* renamed from: a */
    public C11827c get() {
        return new C11827c((MetricQueue) this.f30611a.get());
    }

    /* renamed from: a */
    public static Factory<C11827c> m31027a(Provider<MetricQueue<OpMetric>> provider) {
        return new C11828d(provider);
    }
}
