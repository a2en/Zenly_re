package com.google.android.gms.internal.clearcut;

/* renamed from: com.google.android.gms.internal.clearcut.h0 */
public abstract class C10319h0 {
    private C10319h0() {
    }

    /* renamed from: a */
    public static int m26123a(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* renamed from: a */
    public static long m26124a(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* renamed from: a */
    static C10319h0 m26125a(byte[] bArr, int i, int i2, boolean z) {
        C10331j0 j0Var = new C10331j0(bArr, 0, i2, false);
        try {
            j0Var.mo27952b(i2);
            return j0Var;
        } catch (zzco e) {
            throw new IllegalArgumentException(e);
        }
    }
}
