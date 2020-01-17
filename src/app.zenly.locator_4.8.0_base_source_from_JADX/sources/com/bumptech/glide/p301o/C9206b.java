package com.bumptech.glide.p301o;

import p214e.p228e.C7571a;
import p214e.p228e.C7584g;

/* renamed from: com.bumptech.glide.o.b */
public final class C9206b<K, V> extends C7571a<K, V> {

    /* renamed from: m */
    private int f23869m;

    /* renamed from: a */
    public V mo19591a(int i, V v) {
        this.f23869m = 0;
        return super.mo19591a(i, v);
    }

    /* renamed from: c */
    public V mo19597c(int i) {
        this.f23869m = 0;
        return super.mo19597c(i);
    }

    public void clear() {
        this.f23869m = 0;
        super.clear();
    }

    public int hashCode() {
        if (this.f23869m == 0) {
            this.f23869m = super.hashCode();
        }
        return this.f23869m;
    }

    public V put(K k, V v) {
        this.f23869m = 0;
        return super.put(k, v);
    }

    /* renamed from: a */
    public void mo19593a(C7584g<? extends K, ? extends V> gVar) {
        this.f23869m = 0;
        super.mo19593a(gVar);
    }
}
