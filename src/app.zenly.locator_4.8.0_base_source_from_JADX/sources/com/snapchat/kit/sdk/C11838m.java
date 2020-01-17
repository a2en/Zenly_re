package com.snapchat.kit.sdk;

import android.content.SharedPreferences;
import dagger.internal.C12021c;
import dagger.internal.Factory;

/* renamed from: com.snapchat.kit.sdk.m */
public final class C11838m implements Factory<SharedPreferences> {

    /* renamed from: a */
    private final C11830e f30648a;

    public C11838m(C11830e eVar) {
        this.f30648a = eVar;
    }

    /* renamed from: a */
    public SharedPreferences get() {
        SharedPreferences e = this.f30648a.mo34999e();
        C12021c.m31671a(e, "Cannot return null from a non-@Nullable @Provides method");
        return e;
    }

    /* renamed from: a */
    public static Factory<SharedPreferences> m31056a(C11830e eVar) {
        return new C11838m(eVar);
    }
}
