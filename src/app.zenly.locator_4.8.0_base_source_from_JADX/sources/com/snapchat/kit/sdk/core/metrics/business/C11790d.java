package com.snapchat.kit.sdk.core.metrics.business;

import com.snapchat.kit.sdk.core.metrics.C11772a;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.snapchat.kit.sdk.core.metrics.business.d */
public final class C11790d implements Factory<C11789c> {

    /* renamed from: a */
    private final Provider<C11794h> f30550a;

    /* renamed from: b */
    private final Provider<C11772a<ServerEvent>> f30551b;

    public C11790d(Provider<C11794h> provider, Provider<C11772a<ServerEvent>> provider2) {
        this.f30550a = provider;
        this.f30551b = provider2;
    }

    /* renamed from: a */
    public C11789c get() {
        return new C11789c((C11794h) this.f30550a.get(), (C11772a) this.f30551b.get());
    }

    /* renamed from: a */
    public static Factory<C11789c> m30950a(Provider<C11794h> provider, Provider<C11772a<ServerEvent>> provider2) {
        return new C11790d(provider, provider2);
    }
}
