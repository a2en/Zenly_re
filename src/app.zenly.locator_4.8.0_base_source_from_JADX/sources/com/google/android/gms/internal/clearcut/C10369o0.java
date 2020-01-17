package com.google.android.gms.internal.clearcut;

import java.util.Collections;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.clearcut.o0 */
public final class C10369o0 {

    /* renamed from: a */
    static final C10369o0 f27155a = new C10369o0(true);

    static {
        m26359a();
    }

    C10369o0() {
        new HashMap();
    }

    private C10369o0(boolean z) {
        Collections.emptyMap();
    }

    /* renamed from: a */
    private static Class<?> m26359a() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static C10369o0 m26360b() {
        return C10363n0.m26347b();
    }
}
