package com.google.android.gms.internal.clearcut;

/* renamed from: com.google.android.gms.internal.clearcut.n0 */
final class C10363n0 {

    /* renamed from: a */
    private static final Class<?> f27153a = m26346a();

    /* renamed from: a */
    private static Class<?> m26346a() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static C10369o0 m26347b() {
        Class<?> cls = f27153a;
        if (cls != null) {
            try {
                return (C10369o0) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
            } catch (Exception unused) {
            }
        }
        return C10369o0.f27155a;
    }
}
