package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.C10273b1.C10276c;
import java.io.IOException;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.clearcut.q0 */
final class C10381q0 extends C10375p0<C10277d> {
    C10381q0() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo28074a(Entry<?, ?> entry) {
        return ((C10277d) entry.getKey()).f26887e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C10402t0<C10277d> mo28075a(Object obj) {
        return ((C10276c) obj).zzjv;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo28076a(C10435y3 y3Var, Entry<?, ?> entry) throws IOException {
        C10277d dVar = (C10277d) entry.getKey();
        switch (C10390r0.f27172a[dVar.f26888f.ordinal()]) {
            case 1:
                y3Var.zza(dVar.f26887e, ((Double) entry.getValue()).doubleValue());
                break;
            case 2:
                y3Var.zza(dVar.f26887e, ((Float) entry.getValue()).floatValue());
                return;
            case 3:
                y3Var.mo28019b(dVar.f26887e, ((Long) entry.getValue()).longValue());
                return;
            case 4:
                y3Var.zza(dVar.f26887e, ((Long) entry.getValue()).longValue());
                return;
            case 5:
                y3Var.zzc(dVar.f26887e, ((Integer) entry.getValue()).intValue());
                return;
            case 6:
                y3Var.zzc(dVar.f26887e, ((Long) entry.getValue()).longValue());
                return;
            case 7:
                y3Var.zzf(dVar.f26887e, ((Integer) entry.getValue()).intValue());
                return;
            case 8:
                y3Var.mo28016a(dVar.f26887e, ((Boolean) entry.getValue()).booleanValue());
                return;
            case 9:
                y3Var.zzd(dVar.f26887e, ((Integer) entry.getValue()).intValue());
                return;
            case 10:
                y3Var.mo28018b(dVar.f26887e, ((Integer) entry.getValue()).intValue());
                return;
            case 11:
                y3Var.mo28012a(dVar.f26887e, ((Long) entry.getValue()).longValue());
                return;
            case 12:
                y3Var.zze(dVar.f26887e, ((Integer) entry.getValue()).intValue());
                return;
            case 13:
                y3Var.zzb(dVar.f26887e, ((Long) entry.getValue()).longValue());
                return;
            case 14:
                y3Var.zzc(dVar.f26887e, ((Integer) entry.getValue()).intValue());
                return;
            case 15:
                y3Var.mo28013a(dVar.f26887e, (C10431y) entry.getValue());
                return;
            case 16:
                y3Var.zza(dVar.f26887e, (String) entry.getValue());
                return;
            case 17:
                y3Var.mo28020b(dVar.f26887e, entry.getValue(), C10321h2.m26127a().mo27925a(entry.getValue().getClass()));
                return;
            case 18:
                y3Var.mo28014a(dVar.f26887e, entry.getValue(), C10321h2.m26127a().mo27925a(entry.getValue().getClass()));
                break;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo28104a(Object obj, C10402t0<C10277d> t0Var) {
        ((C10276c) obj).zzjv = t0Var;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo28077a(zzdo zzdo) {
        return zzdo instanceof C10276c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final C10402t0<C10277d> mo28078b(Object obj) {
        C10402t0<C10277d> a = mo28075a(obj);
        if (!a.mo28130c()) {
            return a;
        }
        C10402t0<C10277d> t0Var = (C10402t0) a.clone();
        mo28104a(obj, t0Var);
        return t0Var;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo28079c(Object obj) {
        mo28075a(obj).mo28137h();
    }
}
