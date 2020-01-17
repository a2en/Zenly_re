package com.google.android.gms.internal.clearcut;

/* renamed from: com.google.android.gms.internal.clearcut.s1 */
final class C10397s1 implements C10439z1 {

    /* renamed from: a */
    private C10439z1[] f27182a;

    C10397s1(C10439z1... z1VarArr) {
        this.f27182a = z1VarArr;
    }

    public final boolean zza(Class<?> cls) {
        for (C10439z1 zza : this.f27182a) {
            if (zza.zza(cls)) {
                return true;
            }
        }
        return false;
    }

    public final C10433y1 zzb(Class<?> cls) {
        C10439z1[] z1VarArr;
        for (C10439z1 z1Var : this.f27182a) {
            if (z1Var.zza(cls)) {
                return z1Var.zzb(cls);
            }
        }
        String str = "No factory is available for message type: ";
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }
}
