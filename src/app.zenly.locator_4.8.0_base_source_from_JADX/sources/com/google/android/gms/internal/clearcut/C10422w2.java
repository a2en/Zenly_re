package com.google.android.gms.internal.clearcut;

import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.clearcut.w2 */
final class C10422w2 implements Comparable<C10422w2>, Entry<K, V> {

    /* renamed from: e */
    private final K f27303e;

    /* renamed from: f */
    private V f27304f;

    /* renamed from: g */
    private final /* synthetic */ C10377p2 f27305g;

    C10422w2(C10377p2 p2Var, K k, V v) {
        this.f27305g = p2Var;
        this.f27303e = k;
        this.f27304f = v;
    }

    C10422w2(C10377p2 p2Var, Entry<K, V> entry) {
        this(p2Var, (Comparable) entry.getKey(), entry.getValue());
    }

    /* renamed from: a */
    private static boolean m26580a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((C10422w2) obj).getKey());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) obj;
        return m26580a(this.f27303e, entry.getKey()) && m26580a(this.f27304f, entry.getValue());
    }

    public final /* synthetic */ Object getKey() {
        return this.f27303e;
    }

    public final V getValue() {
        return this.f27304f;
    }

    public final int hashCode() {
        K k = this.f27303e;
        int i = 0;
        int hashCode = k == null ? 0 : k.hashCode();
        V v = this.f27304f;
        if (v != null) {
            i = v.hashCode();
        }
        return hashCode ^ i;
    }

    public final V setValue(V v) {
        this.f27305g.m26443f();
        V v2 = this.f27304f;
        this.f27304f = v;
        return v2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f27303e);
        String valueOf2 = String.valueOf(this.f27304f);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }
}
