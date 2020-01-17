package com.google.common.base;

/* renamed from: com.google.common.base.a */
final class C10836a<T> extends C10849h<T> {

    /* renamed from: e */
    static final C10836a<Object> f28381e = new C10836a<>();
    private static final long serialVersionUID = 0;

    private C10836a() {
    }

    /* renamed from: b */
    static <T> C10849h<T> m27968b() {
        return f28381e;
    }

    private Object readResolve() {
        return f28381e;
    }

    /* renamed from: a */
    public T mo31458a(T t) {
        C10850i.m28005a(t, (Object) "use Optional.orNull() instead of Optional.or(null)");
        return t;
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public int hashCode() {
        return 2040732332;
    }

    public String toString() {
        return "Optional.absent()";
    }
}
