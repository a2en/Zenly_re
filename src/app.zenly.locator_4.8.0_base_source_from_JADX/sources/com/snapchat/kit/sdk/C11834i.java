package com.snapchat.kit.sdk;

import com.google.gson.C11125d;
import dagger.internal.C12021c;
import dagger.internal.Factory;

/* renamed from: com.snapchat.kit.sdk.i */
public final class C11834i implements Factory<C11125d> {

    /* renamed from: a */
    private final C11830e f30635a;

    public C11834i(C11830e eVar) {
        this.f30635a = eVar;
    }

    /* renamed from: a */
    public C11125d get() {
        C11125d d = this.f30635a.mo34998d();
        C12021c.m31671a(d, "Cannot return null from a non-@Nullable @Provides method");
        return d;
    }

    /* renamed from: a */
    public static Factory<C11125d> m31048a(C11830e eVar) {
        return new C11834i(eVar);
    }
}
