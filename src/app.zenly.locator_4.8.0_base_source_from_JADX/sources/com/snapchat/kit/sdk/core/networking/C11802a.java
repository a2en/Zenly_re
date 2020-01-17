package com.snapchat.kit.sdk.core.networking;

import com.google.gson.C11125d;
import dagger.internal.Factory;
import javax.inject.Provider;
import okhttp3.C13204g;

/* renamed from: com.snapchat.kit.sdk.core.networking.a */
public final class C11802a implements Factory<ClientFactory> {

    /* renamed from: a */
    private final Provider<C13204g> f30570a;

    /* renamed from: b */
    private final Provider<C11125d> f30571b;

    /* renamed from: c */
    private final Provider<C11806e> f30572c;

    /* renamed from: d */
    private final Provider<C11804c> f30573d;

    public C11802a(Provider<C13204g> provider, Provider<C11125d> provider2, Provider<C11806e> provider3, Provider<C11804c> provider4) {
        this.f30570a = provider;
        this.f30571b = provider2;
        this.f30572c = provider3;
        this.f30573d = provider4;
    }

    /* renamed from: a */
    public ClientFactory get() {
        return new ClientFactory((C13204g) this.f30570a.get(), (C11125d) this.f30571b.get(), (C11806e) this.f30572c.get(), (C11804c) this.f30573d.get());
    }

    /* renamed from: a */
    public static Factory<ClientFactory> m30983a(Provider<C13204g> provider, Provider<C11125d> provider2, Provider<C11806e> provider3, Provider<C11804c> provider4) {
        return new C11802a(provider, provider2, provider3, provider4);
    }
}
