package com.google.android.gms.internal.clearcut;

/* renamed from: com.google.android.gms.internal.clearcut.f2 */
final class C10307f2 {

    /* renamed from: a */
    private static final C10293d2 f26989a = m26091c();

    /* renamed from: b */
    private static final C10293d2 f26990b = new C10300e2();

    /* renamed from: a */
    static C10293d2 m26089a() {
        return f26989a;
    }

    /* renamed from: b */
    static C10293d2 m26090b() {
        return f26990b;
    }

    /* renamed from: c */
    private static C10293d2 m26091c() {
        try {
            return (C10293d2) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
