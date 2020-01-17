package com.google.android.gms.internal.clearcut;

/* renamed from: com.google.android.gms.internal.clearcut.s0 */
final class C10396s0 {

    /* renamed from: a */
    private static final C10375p0<?> f27180a = new C10381q0();

    /* renamed from: b */
    private static final C10375p0<?> f27181b = m26494a();

    /* renamed from: a */
    private static C10375p0<?> m26494a() {
        try {
            return (C10375p0) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    static C10375p0<?> m26495b() {
        return f27180a;
    }

    /* renamed from: c */
    static C10375p0<?> m26496c() {
        C10375p0<?> p0Var = f27181b;
        if (p0Var != null) {
            return p0Var;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
