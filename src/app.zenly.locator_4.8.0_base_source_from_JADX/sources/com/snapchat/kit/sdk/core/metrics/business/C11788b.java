package com.snapchat.kit.sdk.core.metrics.business;

import android.content.SharedPreferences;
import com.snapchat.kit.sdk.core.metrics.MetricsClient;
import com.snapchat.kit.sdk.core.metrics.p330b.C11783a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.snapchat.kit.sdk.core.metrics.business.b */
public final class C11788b implements Factory<C11786a> {

    /* renamed from: a */
    private final Provider<SharedPreferences> f30544a;

    /* renamed from: b */
    private final Provider<C11794h> f30545b;

    /* renamed from: c */
    private final Provider<MetricsClient> f30546c;

    /* renamed from: d */
    private final Provider<C11783a> f30547d;

    public C11788b(Provider<SharedPreferences> provider, Provider<C11794h> provider2, Provider<MetricsClient> provider3, Provider<C11783a> provider4) {
        this.f30544a = provider;
        this.f30545b = provider2;
        this.f30546c = provider3;
        this.f30547d = provider4;
    }

    /* renamed from: a */
    public C11786a get() {
        return new C11786a((SharedPreferences) this.f30544a.get(), (C11794h) this.f30545b.get(), (MetricsClient) this.f30546c.get(), (C11783a) this.f30547d.get());
    }

    /* renamed from: a */
    public static Factory<C11786a> m30947a(Provider<SharedPreferences> provider, Provider<C11794h> provider2, Provider<MetricsClient> provider3, Provider<C11783a> provider4) {
        return new C11788b(provider, provider2, provider3, provider4);
    }
}
