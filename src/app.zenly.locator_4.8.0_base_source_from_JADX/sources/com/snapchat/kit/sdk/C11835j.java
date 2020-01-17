package com.snapchat.kit.sdk;

import com.google.gson.C11125d;
import com.snapchat.kit.sdk.core.controller.C11766a;
import com.snapchat.kit.sdk.core.metrics.MetricQueue;
import com.snapchat.kit.sdk.core.metrics.business.C11791e;
import com.snapchat.kit.sdk.core.metrics.model.OpMetric;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent;
import com.snapchat.kit.sdk.core.security.C11818g;
import dagger.internal.C12020b;
import dagger.internal.C12021c;
import dagger.internal.Factory;
import javax.inject.Provider;
import okhttp3.C13325v;

/* renamed from: com.snapchat.kit.sdk.j */
public final class C11835j implements Factory<OAuth2Manager> {

    /* renamed from: a */
    private final C11830e f30636a;

    /* renamed from: b */
    private final Provider<C11818g> f30637b;

    /* renamed from: c */
    private final Provider<C11766a> f30638c;

    /* renamed from: d */
    private final Provider<C13325v> f30639d;

    /* renamed from: e */
    private final Provider<C11125d> f30640e;

    /* renamed from: f */
    private final Provider<MetricQueue<ServerEvent>> f30641f;

    /* renamed from: g */
    private final Provider<C11791e> f30642g;

    /* renamed from: h */
    private final Provider<MetricQueue<OpMetric>> f30643h;

    public C11835j(C11830e eVar, Provider<C11818g> provider, Provider<C11766a> provider2, Provider<C13325v> provider3, Provider<C11125d> provider4, Provider<MetricQueue<ServerEvent>> provider5, Provider<C11791e> provider6, Provider<MetricQueue<OpMetric>> provider7) {
        this.f30636a = eVar;
        this.f30637b = provider;
        this.f30638c = provider2;
        this.f30639d = provider3;
        this.f30640e = provider4;
        this.f30641f = provider5;
        this.f30642g = provider6;
        this.f30643h = provider7;
    }

    /* renamed from: a */
    public OAuth2Manager get() {
        OAuth2Manager a = this.f30636a.mo34992a((C11818g) this.f30637b.get(), (C11766a) this.f30638c.get(), (C13325v) this.f30639d.get(), (C11125d) this.f30640e.get(), C12020b.m31668a(this.f30641f), (C11791e) this.f30642g.get(), C12020b.m31668a(this.f30643h));
        C12021c.m31671a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    /* renamed from: a */
    public static Factory<OAuth2Manager> m31050a(C11830e eVar, Provider<C11818g> provider, Provider<C11766a> provider2, Provider<C13325v> provider3, Provider<C11125d> provider4, Provider<MetricQueue<ServerEvent>> provider5, Provider<C11791e> provider6, Provider<MetricQueue<OpMetric>> provider7) {
        C11835j jVar = new C11835j(eVar, provider, provider2, provider3, provider4, provider5, provider6, provider7);
        return jVar;
    }
}
