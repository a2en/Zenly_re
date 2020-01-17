package com.squareup.picasso;

/* renamed from: com.squareup.picasso.m */
public enum C11881m {
    NO_CACHE(1),
    NO_STORE(2);
    

    /* renamed from: e */
    final int f30789e;

    private C11881m(int i) {
        this.f30789e = i;
    }

    /* renamed from: a */
    static boolean m31202a(int i) {
        return (i & NO_CACHE.f30789e) == 0;
    }

    /* renamed from: b */
    static boolean m31203b(int i) {
        return (i & NO_STORE.f30789e) == 0;
    }
}
