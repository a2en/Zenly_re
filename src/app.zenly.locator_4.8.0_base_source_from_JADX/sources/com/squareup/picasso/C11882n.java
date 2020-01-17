package com.squareup.picasso;

/* renamed from: com.squareup.picasso.n */
public enum C11882n {
    NO_CACHE(1),
    NO_STORE(2),
    OFFLINE(4);
    

    /* renamed from: e */
    final int f30794e;

    private C11882n(int i) {
        this.f30794e = i;
    }

    /* renamed from: a */
    public static boolean m31204a(int i) {
        return (i & OFFLINE.f30794e) != 0;
    }

    /* renamed from: b */
    public static boolean m31205b(int i) {
        return (i & NO_CACHE.f30794e) == 0;
    }

    /* renamed from: c */
    public static boolean m31206c(int i) {
        return (i & NO_STORE.f30794e) == 0;
    }
}
