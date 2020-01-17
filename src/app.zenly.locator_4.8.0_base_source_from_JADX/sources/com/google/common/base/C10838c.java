package com.google.common.base;

import java.io.Serializable;

/* renamed from: com.google.common.base.c */
public abstract class C10838c<T> {

    /* renamed from: com.google.common.base.c$a */
    static final class C10839a extends C10838c<Object> implements Serializable {

        /* renamed from: e */
        static final C10839a f28382e = new C10839a();
        private static final long serialVersionUID = 1;

        C10839a() {
        }

        private Object readResolve() {
            return f28382e;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo31463a(Object obj, Object obj2) {
            return obj.equals(obj2);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo31462a(Object obj) {
            return obj.hashCode();
        }
    }

    /* renamed from: com.google.common.base.c$b */
    static final class C10840b extends C10838c<Object> implements Serializable {

        /* renamed from: e */
        static final C10840b f28383e = new C10840b();
        private static final long serialVersionUID = 1;

        C10840b() {
        }

        private Object readResolve() {
            return f28383e;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo31462a(Object obj) {
            return System.identityHashCode(obj);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo31463a(Object obj, Object obj2) {
            return false;
        }
    }

    protected C10838c() {
    }

    /* renamed from: a */
    public static C10838c<Object> m27972a() {
        return C10839a.f28382e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo31462a(T t);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo31463a(T t, T t2);

    /* renamed from: b */
    public final boolean mo31465b(T t, T t2) {
        if (t == t2) {
            return true;
        }
        if (t == null || t2 == null) {
            return false;
        }
        return mo31463a(t, t2);
    }

    /* renamed from: b */
    public final int mo31464b(T t) {
        if (t == null) {
            return 0;
        }
        return mo31462a(t);
    }

    /* renamed from: b */
    public static C10838c<Object> m27973b() {
        return C10840b.f28383e;
    }
}
