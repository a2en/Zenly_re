package com.google.android.gms.internal.clearcut;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.android.gms.internal.clearcut.h2 */
final class C10321h2 {

    /* renamed from: c */
    private static final C10321h2 f27009c = new C10321h2();

    /* renamed from: a */
    private final C10365n2 f27010a;

    /* renamed from: b */
    private final ConcurrentMap<Class<?>, C10359m2<?>> f27011b = new ConcurrentHashMap();

    private C10321h2() {
        String[] strArr = {"com.google.protobuf.AndroidProto3SchemaFactory"};
        C10365n2 n2Var = null;
        for (int i = 0; i <= 0; i++) {
            n2Var = m26128a(strArr[0]);
            if (n2Var != null) {
                break;
            }
        }
        if (n2Var == null) {
            n2Var = new C10382q1();
        }
        this.f27010a = n2Var;
    }

    /* renamed from: a */
    public static C10321h2 m26127a() {
        return f27009c;
    }

    /* renamed from: a */
    private static C10365n2 m26128a(String str) {
        try {
            return (C10365n2) Class.forName(str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final <T> C10359m2<T> mo27925a(Class<T> cls) {
        String str = "messageType";
        C10292d1.m26020a(cls, str);
        C10359m2<T> m2Var = (C10359m2) this.f27011b.get(cls);
        if (m2Var != null) {
            return m2Var;
        }
        C10359m2<T> a = this.f27010a.mo28066a(cls);
        C10292d1.m26020a(cls, str);
        C10292d1.m26020a(a, "schema");
        C10359m2 m2Var2 = (C10359m2) this.f27011b.putIfAbsent(cls, a);
        return m2Var2 != null ? m2Var2 : a;
    }

    /* renamed from: a */
    public final <T> C10359m2<T> mo27926a(T t) {
        return mo27925a(t.getClass());
    }
}
