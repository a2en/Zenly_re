package com.google.android.gms.iid;

/* renamed from: com.google.android.gms.iid.f */
public abstract class C10230f {

    /* renamed from: a */
    private static C10230f f26835a;

    /* renamed from: a */
    public static synchronized C10230f m25856a() {
        C10230f fVar;
        synchronized (C10230f.class) {
            if (f26835a == null) {
                f26835a = new C10226b();
            }
            fVar = f26835a;
        }
        return fVar;
    }

    /* renamed from: a */
    public abstract zzaj<Boolean> mo27736a(String str, boolean z);
}
