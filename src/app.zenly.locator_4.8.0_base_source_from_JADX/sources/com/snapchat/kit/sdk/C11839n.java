package com.snapchat.kit.sdk;

import android.os.Handler;
import dagger.internal.C12021c;
import dagger.internal.Factory;

/* renamed from: com.snapchat.kit.sdk.n */
public final class C11839n implements Factory<Handler> {

    /* renamed from: a */
    private final C11830e f30649a;

    public C11839n(C11830e eVar) {
        this.f30649a = eVar;
    }

    /* renamed from: a */
    public Handler get() {
        Handler h = this.f30649a.mo35002h();
        C12021c.m31671a(h, "Cannot return null from a non-@Nullable @Provides method");
        return h;
    }

    /* renamed from: a */
    public static Factory<Handler> m31058a(C11830e eVar) {
        return new C11839n(eVar);
    }
}
