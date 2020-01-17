package com.google.android.gms.internal.clearcut;

/* renamed from: com.google.android.gms.internal.clearcut.e1 */
public enum C10299e1 {
    VOID(Void.class, Void.class, null),
    INT(Integer.TYPE, Integer.class, Integer.valueOf(0)),
    LONG(Long.TYPE, Long.class, Long.valueOf(0)),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.valueOf(false)),
    STRING(String.class, String.class, ""),
    BYTE_STRING(C10431y.class, C10431y.class, C10431y.f27328f),
    ENUM(Integer.TYPE, Integer.class, null),
    MESSAGE(Object.class, Object.class, null);
    

    /* renamed from: e */
    private final Class<?> f26978e;

    private C10299e1(Class<?> cls, Class<?> cls2, Object obj) {
        this.f26978e = cls2;
    }

    /* renamed from: a */
    public final Class<?> mo27887a() {
        return this.f26978e;
    }
}
