package com.snapchat.kit.sdk.core.metrics;

import com.snapchat.kit.sdk.core.metrics.C11772a.C11780e;
import com.snapchat.kit.sdk.core.metrics.model.OpMetric;
import dagger.internal.C12021c;
import dagger.internal.Factory;
import java.util.concurrent.ScheduledExecutorService;
import javax.inject.Provider;

/* renamed from: com.snapchat.kit.sdk.core.metrics.g */
public final class C11799g implements Factory<MetricQueue<OpMetric>> {

    /* renamed from: a */
    private final Provider<C11780e> f30562a;

    /* renamed from: b */
    private final Provider<ScheduledExecutorService> f30563b;

    public C11799g(Provider<C11780e> provider, Provider<ScheduledExecutorService> provider2) {
        this.f30562a = provider;
        this.f30563b = provider2;
    }

    /* renamed from: a */
    public MetricQueue<OpMetric> get() {
        MetricQueue<OpMetric> a = C11796d.m30967a((C11780e) this.f30562a.get(), (ScheduledExecutorService) this.f30563b.get());
        C12021c.m31671a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    /* renamed from: a */
    public static Factory<MetricQueue<OpMetric>> m30976a(Provider<C11780e> provider, Provider<ScheduledExecutorService> provider2) {
        return new C11799g(provider, provider2);
    }
}
