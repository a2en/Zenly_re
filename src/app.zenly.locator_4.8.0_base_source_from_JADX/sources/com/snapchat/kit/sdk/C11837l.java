package com.snapchat.kit.sdk;

import android.content.SharedPreferences;
import com.google.gson.C11125d;
import com.snapchat.kit.sdk.core.security.C11818g;
import dagger.internal.C12021c;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.snapchat.kit.sdk.l */
public final class C11837l implements Factory<C11818g> {

    /* renamed from: a */
    private final C11830e f30645a;

    /* renamed from: b */
    private final Provider<C11125d> f30646b;

    /* renamed from: c */
    private final Provider<SharedPreferences> f30647c;

    public C11837l(C11830e eVar, Provider<C11125d> provider, Provider<SharedPreferences> provider2) {
        this.f30645a = eVar;
        this.f30646b = provider;
        this.f30647c = provider2;
    }

    /* renamed from: a */
    public C11818g get() {
        C11818g a = this.f30645a.mo34995a((C11125d) this.f30646b.get(), (SharedPreferences) this.f30647c.get());
        C12021c.m31671a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    /* renamed from: a */
    public static Factory<C11818g> m31054a(C11830e eVar, Provider<C11125d> provider, Provider<SharedPreferences> provider2) {
        return new C11837l(eVar, provider, provider2);
    }
}
