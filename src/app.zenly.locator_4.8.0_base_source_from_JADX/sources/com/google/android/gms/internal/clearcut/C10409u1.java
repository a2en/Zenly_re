package com.google.android.gms.internal.clearcut;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.clearcut.u1 */
public final class C10409u1<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: f */
    private static final C10409u1 f27224f;

    /* renamed from: e */
    private boolean f27225e = true;

    static {
        C10409u1 u1Var = new C10409u1();
        f27224f = u1Var;
        u1Var.f27225e = false;
    }

    private C10409u1() {
    }

    private C10409u1(Map<K, V> map) {
        super(map);
    }

    /* renamed from: b */
    private static int m26544b(Object obj) {
        if (obj instanceof byte[]) {
            return C10292d1.m26017a((byte[]) obj);
        }
        if (!(obj instanceof zzcj)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public static <K, V> C10409u1<K, V> m26545d() {
        return f27224f;
    }

    /* renamed from: e */
    private final void m26546e() {
        if (!this.f27225e) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: a */
    public final void mo28141a(C10409u1<K, V> u1Var) {
        m26546e();
        if (!u1Var.isEmpty()) {
            putAll(u1Var);
        }
    }

    /* renamed from: a */
    public final boolean mo28142a() {
        return this.f27225e;
    }

    /* renamed from: b */
    public final C10409u1<K, V> mo28143b() {
        return isEmpty() ? new C10409u1<>() : new C10409u1<>(this);
    }

    /* renamed from: c */
    public final void mo28144c() {
        this.f27225e = false;
    }

    public final void clear() {
        m26546e();
        super.clear();
    }

    public final Set<Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x005c A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof java.util.Map
            r1 = 0
            if (r0 == 0) goto L_0x005d
            java.util.Map r7 = (java.util.Map) r7
            r0 = 1
            if (r6 == r7) goto L_0x0059
            int r2 = r6.size()
            int r3 = r7.size()
            if (r2 == r3) goto L_0x0016
        L_0x0014:
            r7 = 0
            goto L_0x005a
        L_0x0016:
            java.util.Set r2 = r6.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x001e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0059
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            boolean r4 = r7.containsKey(r4)
            if (r4 != 0) goto L_0x0035
            goto L_0x0014
        L_0x0035:
            java.lang.Object r4 = r3.getValue()
            java.lang.Object r3 = r3.getKey()
            java.lang.Object r3 = r7.get(r3)
            boolean r5 = r4 instanceof byte[]
            if (r5 == 0) goto L_0x0052
            boolean r5 = r3 instanceof byte[]
            if (r5 == 0) goto L_0x0052
            byte[] r4 = (byte[]) r4
            byte[] r3 = (byte[]) r3
            boolean r3 = java.util.Arrays.equals(r4, r3)
            goto L_0x0056
        L_0x0052:
            boolean r3 = r4.equals(r3)
        L_0x0056:
            if (r3 != 0) goto L_0x001e
            goto L_0x0014
        L_0x0059:
            r7 = 1
        L_0x005a:
            if (r7 == 0) goto L_0x005d
            return r0
        L_0x005d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.C10409u1.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = 0;
        for (Entry entry : entrySet()) {
            i += m26544b(entry.getValue()) ^ m26544b(entry.getKey());
        }
        return i;
    }

    public final V put(K k, V v) {
        m26546e();
        C10292d1.m26018a(k);
        C10292d1.m26018a(v);
        return super.put(k, v);
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        m26546e();
        for (Object next : map.keySet()) {
            C10292d1.m26018a(next);
            C10292d1.m26018a(map.get(next));
        }
        super.putAll(map);
    }

    public final V remove(Object obj) {
        m26546e();
        return super.remove(obj);
    }
}
