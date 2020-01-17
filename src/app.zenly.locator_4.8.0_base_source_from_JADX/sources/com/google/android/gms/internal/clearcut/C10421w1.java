package com.google.android.gms.internal.clearcut;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.clearcut.w1 */
final class C10421w1 implements C10415v1 {
    C10421w1() {
    }

    /* renamed from: a */
    public final int mo28162a(int i, Object obj, Object obj2) {
        C10409u1 u1Var = (C10409u1) obj;
        if (u1Var.isEmpty()) {
            return 0;
        }
        Iterator it = u1Var.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Entry entry = (Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }

    /* renamed from: a */
    public final C10403t1<?, ?> mo28163a(Object obj) {
        throw new NoSuchMethodError();
    }

    /* renamed from: b */
    public final Object mo28164b(Object obj) {
        return C10409u1.m26545d().mo28143b();
    }

    /* renamed from: c */
    public final Object mo28165c(Object obj) {
        ((C10409u1) obj).mo28144c();
        return obj;
    }

    /* renamed from: d */
    public final boolean mo28166d(Object obj) {
        return !((C10409u1) obj).mo28142a();
    }

    /* renamed from: e */
    public final Map<?, ?> mo28167e(Object obj) {
        return (C10409u1) obj;
    }

    /* renamed from: f */
    public final Map<?, ?> mo28168f(Object obj) {
        return (C10409u1) obj;
    }

    public final Object zzb(Object obj, Object obj2) {
        C10409u1 u1Var = (C10409u1) obj;
        C10409u1 u1Var2 = (C10409u1) obj2;
        if (!u1Var2.isEmpty()) {
            if (!u1Var.mo28142a()) {
                u1Var = u1Var.mo28143b();
            }
            u1Var.mo28141a(u1Var2);
        }
        return u1Var;
    }
}
