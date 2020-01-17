package com.google.android.gms.internal.clearcut;

/* renamed from: com.google.android.gms.internal.clearcut.d0 */
final class C10291d0 {

    /* renamed from: a */
    private final zzbn f26949a;

    /* renamed from: b */
    private final byte[] f26950b;

    private C10291d0(int i) {
        this.f26950b = new byte[i];
        this.f26949a = zzbn.m26669a(this.f26950b);
    }

    /* synthetic */ C10291d0(int i, C10437z zVar) {
        this(i);
    }

    /* renamed from: a */
    public final C10431y mo27863a() {
        if (this.f26949a.mo28238b() == 0) {
            return new C10305f0(this.f26950b);
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }

    /* renamed from: b */
    public final zzbn mo27864b() {
        return this.f26949a;
    }
}
