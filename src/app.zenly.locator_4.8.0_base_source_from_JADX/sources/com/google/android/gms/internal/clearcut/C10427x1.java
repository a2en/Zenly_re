package com.google.android.gms.internal.clearcut;

/* renamed from: com.google.android.gms.internal.clearcut.x1 */
final class C10427x1 {

    /* renamed from: a */
    private static final C10415v1 f27311a = m26590c();

    /* renamed from: b */
    private static final C10415v1 f27312b = new C10421w1();

    /* renamed from: a */
    static C10415v1 m26588a() {
        return f27311a;
    }

    /* renamed from: b */
    static C10415v1 m26589b() {
        return f27312b;
    }

    /* renamed from: c */
    private static C10415v1 m26590c() {
        try {
            return (C10415v1) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
