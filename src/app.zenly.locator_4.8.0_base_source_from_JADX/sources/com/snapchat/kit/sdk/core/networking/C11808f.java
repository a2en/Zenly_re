package com.snapchat.kit.sdk.core.networking;

import com.snapchat.kit.sdk.OAuth2Manager;
import com.snapchat.kit.sdk.core.controller.C11766a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.snapchat.kit.sdk.core.networking.f */
public final class C11808f implements Factory<C11806e> {

    /* renamed from: a */
    private final Provider<OAuth2Manager> f30584a;

    /* renamed from: b */
    private final Provider<C11766a> f30585b;

    /* renamed from: c */
    private final Provider<String> f30586c;

    public C11808f(Provider<OAuth2Manager> provider, Provider<C11766a> provider2, Provider<String> provider3) {
        this.f30584a = provider;
        this.f30585b = provider2;
        this.f30586c = provider3;
    }

    /* renamed from: a */
    public C11806e get() {
        return new C11806e((OAuth2Manager) this.f30584a.get(), (C11766a) this.f30585b.get(), (String) this.f30586c.get());
    }

    /* renamed from: a */
    public static Factory<C11806e> m30993a(Provider<OAuth2Manager> provider, Provider<C11766a> provider2, Provider<String> provider3) {
        return new C11808f(provider, provider2, provider3);
    }
}
