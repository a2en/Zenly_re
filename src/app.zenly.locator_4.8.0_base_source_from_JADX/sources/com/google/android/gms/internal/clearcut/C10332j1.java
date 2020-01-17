package com.google.android.gms.internal.clearcut;

/* renamed from: com.google.android.gms.internal.clearcut.j1 */
public class C10332j1 {

    /* renamed from: a */
    private volatile zzdo f27029a;

    /* renamed from: b */
    private volatile C10431y f27030b;

    static {
        C10369o0.m26360b();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0012 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.clearcut.zzdo m26141b(com.google.android.gms.internal.clearcut.zzdo r2) {
        /*
            r1 = this;
            com.google.android.gms.internal.clearcut.zzdo r0 = r1.f27029a
            if (r0 != 0) goto L_0x001c
            monitor-enter(r1)
            com.google.android.gms.internal.clearcut.zzdo r0 = r1.f27029a     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x000b
        L_0x0009:
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            goto L_0x001c
        L_0x000b:
            r1.f27029a = r2     // Catch:{ zzco -> 0x0012 }
            com.google.android.gms.internal.clearcut.y r0 = com.google.android.gms.internal.clearcut.C10431y.f27328f     // Catch:{ zzco -> 0x0012 }
            r1.f27030b = r0     // Catch:{ zzco -> 0x0012 }
            goto L_0x0009
        L_0x0012:
            r1.f27029a = r2     // Catch:{ all -> 0x0019 }
            com.google.android.gms.internal.clearcut.y r2 = com.google.android.gms.internal.clearcut.C10431y.f27328f     // Catch:{ all -> 0x0019 }
            r1.f27030b = r2     // Catch:{ all -> 0x0019 }
            goto L_0x0009
        L_0x0019:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            throw r2
        L_0x001c:
            com.google.android.gms.internal.clearcut.zzdo r2 = r1.f27029a
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.C10332j1.m26141b(com.google.android.gms.internal.clearcut.zzdo):com.google.android.gms.internal.clearcut.zzdo");
    }

    /* renamed from: a */
    public final int mo27953a() {
        if (this.f27030b != null) {
            return this.f27030b.size();
        }
        if (this.f27029a != null) {
            return this.f27029a.zzas();
        }
        return 0;
    }

    /* renamed from: a */
    public final zzdo mo27954a(zzdo zzdo) {
        zzdo zzdo2 = this.f27029a;
        this.f27030b = null;
        this.f27029a = zzdo;
        return zzdo2;
    }

    /* renamed from: b */
    public final C10431y mo27955b() {
        if (this.f27030b != null) {
            return this.f27030b;
        }
        synchronized (this) {
            if (this.f27030b != null) {
                C10431y yVar = this.f27030b;
                return yVar;
            }
            this.f27030b = this.f27029a == null ? C10431y.f27328f : this.f27029a.zzr();
            C10431y yVar2 = this.f27030b;
            return yVar2;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10332j1)) {
            return false;
        }
        C10332j1 j1Var = (C10332j1) obj;
        zzdo zzdo = this.f27029a;
        zzdo zzdo2 = j1Var.f27029a;
        return (zzdo == null && zzdo2 == null) ? mo27955b().equals(j1Var.mo27955b()) : (zzdo == null || zzdo2 == null) ? zzdo != null ? zzdo.equals(j1Var.m26141b(zzdo.zzbe())) : m26141b(zzdo2.zzbe()).equals(zzdo2) : zzdo.equals(zzdo2);
    }

    public int hashCode() {
        return 1;
    }
}
