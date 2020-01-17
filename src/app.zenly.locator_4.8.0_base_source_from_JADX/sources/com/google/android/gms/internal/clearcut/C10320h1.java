package com.google.android.gms.internal.clearcut;

import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.clearcut.h1 */
final class C10320h1<K> implements Entry<K, Object> {

    /* renamed from: e */
    private Entry<K, C10306f1> f27008e;

    private C10320h1(Entry<K, C10306f1> entry) {
        this.f27008e = entry;
    }

    /* renamed from: a */
    public final C10306f1 mo27921a() {
        return (C10306f1) this.f27008e.getValue();
    }

    public final K getKey() {
        return this.f27008e.getKey();
    }

    public final Object getValue() {
        if (((C10306f1) this.f27008e.getValue()) == null) {
            return null;
        }
        C10306f1.m26088c();
        throw null;
    }

    public final Object setValue(Object obj) {
        if (obj instanceof zzdo) {
            return ((C10306f1) this.f27008e.getValue()).mo27954a((zzdo) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
