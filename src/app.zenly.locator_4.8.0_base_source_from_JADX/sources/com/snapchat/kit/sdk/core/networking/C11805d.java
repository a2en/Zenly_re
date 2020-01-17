package com.snapchat.kit.sdk.core.networking;

import com.snapchat.kit.sdk.OAuth2Manager;
import com.snapchat.kit.sdk.core.controller.C11766a;
import com.snapchat.kit.sdk.core.security.Fingerprint;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.snapchat.kit.sdk.core.networking.d */
public final class C11805d implements Factory<C11804c> {

    /* renamed from: a */
    private final Provider<OAuth2Manager> f30576a;

    /* renamed from: b */
    private final Provider<C11766a> f30577b;

    /* renamed from: c */
    private final Provider<String> f30578c;

    /* renamed from: d */
    private final Provider<Fingerprint> f30579d;

    public C11805d(Provider<OAuth2Manager> provider, Provider<C11766a> provider2, Provider<String> provider3, Provider<Fingerprint> provider4) {
        this.f30576a = provider;
        this.f30577b = provider2;
        this.f30578c = provider3;
        this.f30579d = provider4;
    }

    /* renamed from: a */
    public C11804c get() {
        return new C11804c((OAuth2Manager) this.f30576a.get(), (C11766a) this.f30577b.get(), (String) this.f30578c.get(), (Fingerprint) this.f30579d.get());
    }

    /* renamed from: a */
    public static Factory<C11804c> m30986a(Provider<OAuth2Manager> provider, Provider<C11766a> provider2, Provider<String> provider3, Provider<Fingerprint> provider4) {
        return new C11805d(provider, provider2, provider3, provider4);
    }
}
