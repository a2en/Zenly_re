package com.snapchat.kit.sdk.core.controller;

import android.os.Handler;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.snapchat.kit.sdk.core.controller.b */
public final class C11771b implements Factory<C11766a> {

    /* renamed from: a */
    private final Provider<Handler> f30509a;

    public C11771b(Provider<Handler> provider) {
        this.f30509a = provider;
    }

    /* renamed from: a */
    public C11766a get() {
        return new C11766a((Handler) this.f30509a.get());
    }

    /* renamed from: a */
    public static Factory<C11766a> m30922a(Provider<Handler> provider) {
        return new C11771b(provider);
    }
}
