package com.snapchat.kit.sdk.core.metrics;

import com.snapchat.kit.sdk.core.metrics.business.C11786a;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent;
import dagger.internal.C12021c;
import dagger.internal.Factory;
import java.util.concurrent.ScheduledExecutorService;
import javax.inject.Provider;

/* renamed from: com.snapchat.kit.sdk.core.metrics.e */
public final class C11797e implements Factory<C11772a<ServerEvent>> {

    /* renamed from: a */
    private final Provider<C11786a> f30559a;

    /* renamed from: b */
    private final Provider<ScheduledExecutorService> f30560b;

    public C11797e(Provider<C11786a> provider, Provider<ScheduledExecutorService> provider2) {
        this.f30559a = provider;
        this.f30560b = provider2;
    }

    /* renamed from: a */
    public C11772a<ServerEvent> get() {
        C11772a<ServerEvent> a = C11796d.m30969a((C11786a) this.f30559a.get(), (ScheduledExecutorService) this.f30560b.get());
        C12021c.m31671a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    /* renamed from: a */
    public static Factory<C11772a<ServerEvent>> m30972a(Provider<C11786a> provider, Provider<ScheduledExecutorService> provider2) {
        return new C11797e(provider, provider2);
    }
}
