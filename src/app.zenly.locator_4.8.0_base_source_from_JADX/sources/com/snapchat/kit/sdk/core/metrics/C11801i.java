package com.snapchat.kit.sdk.core.metrics;

import android.content.SharedPreferences;
import com.snapchat.kit.sdk.core.metrics.business.C11794h;
import dagger.internal.C12021c;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.snapchat.kit.sdk.core.metrics.i */
public final class C11801i implements Factory<C11794h> {

    /* renamed from: a */
    private final Provider<SharedPreferences> f30565a;

    public C11801i(Provider<SharedPreferences> provider) {
        this.f30565a = provider;
    }

    /* renamed from: a */
    public C11794h get() {
        C11794h a = C11796d.m30970a((SharedPreferences) this.f30565a.get());
        C12021c.m31671a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    /* renamed from: a */
    public static Factory<C11794h> m30980a(Provider<SharedPreferences> provider) {
        return new C11801i(provider);
    }
}
