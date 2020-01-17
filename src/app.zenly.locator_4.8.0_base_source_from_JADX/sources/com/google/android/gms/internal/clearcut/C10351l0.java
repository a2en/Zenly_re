package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.C10273b1.C10278e;
import java.io.IOException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.clearcut.l0 */
final class C10351l0 implements C10435y3 {

    /* renamed from: a */
    private final zzbn f27131a;

    private C10351l0(zzbn zzbn) {
        C10292d1.m26020a(zzbn, "output");
        this.f27131a = zzbn;
    }

    /* renamed from: a */
    public static C10351l0 m26288a(zzbn zzbn) {
        C10351l0 l0Var = zzbn.f27347a;
        return l0Var != null ? l0Var : new C10351l0(zzbn);
    }

    /* renamed from: a */
    public final int mo28009a() {
        return C10278e.f26899k;
    }

    /* renamed from: a */
    public final void mo28010a(int i) throws IOException {
        this.f27131a.mo28228a(i, 4);
    }

    /* renamed from: a */
    public final void mo28011a(int i, int i2) throws IOException {
        this.f27131a.mo28240b(i, i2);
    }

    /* renamed from: a */
    public final void mo28012a(int i, long j) throws IOException {
        this.f27131a.mo28248c(i, j);
    }

    /* renamed from: a */
    public final void mo28013a(int i, C10431y yVar) throws IOException {
        this.f27131a.mo28230a(i, yVar);
    }

    /* renamed from: a */
    public final void mo28014a(int i, Object obj, C10359m2 m2Var) throws IOException {
        this.f27131a.mo28232a(i, (zzdo) obj, m2Var);
    }

    /* renamed from: a */
    public final void mo28015a(int i, List<?> list, C10359m2 m2Var) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo28020b(i, list.get(i2), m2Var);
        }
    }

    /* renamed from: a */
    public final void mo28016a(int i, boolean z) throws IOException {
        this.f27131a.mo28234a(i, z);
    }

    /* renamed from: b */
    public final void mo28017b(int i) throws IOException {
        this.f27131a.mo28228a(i, 3);
    }

    /* renamed from: b */
    public final void mo28018b(int i, int i2) throws IOException {
        this.f27131a.mo28252e(i, i2);
    }

    /* renamed from: b */
    public final void mo28019b(int i, long j) throws IOException {
        this.f27131a.mo28229a(i, j);
    }

    /* renamed from: b */
    public final void mo28020b(int i, Object obj, C10359m2 m2Var) throws IOException {
        zzbn zzbn = this.f27131a;
        zzdo zzdo = (zzdo) obj;
        zzbn.mo28228a(i, 3);
        m2Var.mo27830a(zzdo, (C10435y3) zzbn.f27347a);
        zzbn.mo28228a(i, 4);
    }

    /* renamed from: b */
    public final void mo28021b(int i, List<?> list, C10359m2 m2Var) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo28014a(i, list.get(i2), m2Var);
        }
    }

    public final void zza(int i, double d) throws IOException {
        this.f27131a.mo28226a(i, d);
    }

    public final void zza(int i, float f) throws IOException {
        this.f27131a.mo28227a(i, f);
    }

    public final void zza(int i, long j) throws IOException {
        this.f27131a.mo28229a(i, j);
    }

    public final void zza(int i, Object obj) throws IOException {
        if (obj instanceof C10431y) {
            this.f27131a.mo28242b(i, (C10431y) obj);
        } else {
            this.f27131a.mo28243b(i, (zzdo) obj);
        }
    }

    public final void zza(int i, String str) throws IOException {
        this.f27131a.mo28233a(i, str);
    }

    public final void zza(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (list instanceof zzcx) {
            zzcx zzcx = (zzcx) list;
            while (i2 < list.size()) {
                Object raw = zzcx.getRaw(i2);
                if (raw instanceof String) {
                    this.f27131a.mo28233a(i, (String) raw);
                } else {
                    this.f27131a.mo28230a(i, (C10431y) raw);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f27131a.mo28233a(i, (String) list.get(i2));
            i2++;
        }
    }

    public final void zza(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f27131a.mo28228a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbn.m26692f(((Integer) list.get(i4)).intValue());
            }
            this.f27131a.mo28239b(i3);
            while (i2 < list.size()) {
                this.f27131a.mo28225a(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f27131a.mo28240b(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void zzb(int i, long j) throws IOException {
        this.f27131a.mo28241b(i, j);
    }

    public final void zzb(int i, List<C10431y> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f27131a.mo28230a(i, (C10431y) list.get(i2));
        }
    }

    public final void zzb(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f27131a.mo28228a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbn.m26704i(((Integer) list.get(i4)).intValue());
            }
            this.f27131a.mo28239b(i3);
            while (i2 < list.size()) {
                this.f27131a.mo28250d(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f27131a.mo28252e(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void zzc(int i, int i2) throws IOException {
        this.f27131a.mo28240b(i, i2);
    }

    public final void zzc(int i, long j) throws IOException {
        this.f27131a.mo28248c(i, j);
    }

    public final void zzc(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f27131a.mo28228a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbn.m26688d(((Long) list.get(i4)).longValue());
            }
            this.f27131a.mo28239b(i3);
            while (i2 < list.size()) {
                this.f27131a.mo28235a(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f27131a.mo28229a(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public final void zzd(int i, int i2) throws IOException {
        this.f27131a.mo28247c(i, i2);
    }

    public final void zzd(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f27131a.mo28228a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbn.m26691e(((Long) list.get(i4)).longValue());
            }
            this.f27131a.mo28239b(i3);
            while (i2 < list.size()) {
                this.f27131a.mo28235a(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f27131a.mo28229a(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public final void zze(int i, int i2) throws IOException {
        this.f27131a.mo28251d(i, i2);
    }

    public final void zze(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f27131a.mo28228a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbn.m26699g(((Long) list.get(i4)).longValue());
            }
            this.f27131a.mo28239b(i3);
            while (i2 < list.size()) {
                this.f27131a.mo28249c(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f27131a.mo28248c(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public final void zzf(int i, int i2) throws IOException {
        this.f27131a.mo28252e(i, i2);
    }

    public final void zzf(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f27131a.mo28228a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbn.m26671b(((Float) list.get(i4)).floatValue());
            }
            this.f27131a.mo28239b(i3);
            while (i2 < list.size()) {
                this.f27131a.mo28224a(((Float) list.get(i2)).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f27131a.mo28227a(i, ((Float) list.get(i2)).floatValue());
            i2++;
        }
    }

    public final void zzg(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f27131a.mo28228a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbn.m26670b(((Double) list.get(i4)).doubleValue());
            }
            this.f27131a.mo28239b(i3);
            while (i2 < list.size()) {
                this.f27131a.mo28223a(((Double) list.get(i2)).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f27131a.mo28226a(i, ((Double) list.get(i2)).doubleValue());
            i2++;
        }
    }

    public final void zzh(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f27131a.mo28228a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbn.m26709k(((Integer) list.get(i4)).intValue());
            }
            this.f27131a.mo28239b(i3);
            while (i2 < list.size()) {
                this.f27131a.mo28225a(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f27131a.mo28240b(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void zzi(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f27131a.mo28228a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbn.m26679b(((Boolean) list.get(i4)).booleanValue());
            }
            this.f27131a.mo28239b(i3);
            while (i2 < list.size()) {
                this.f27131a.mo28237a(((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f27131a.mo28234a(i, ((Boolean) list.get(i2)).booleanValue());
            i2++;
        }
    }

    public final void zzj(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f27131a.mo28228a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbn.m26696g(((Integer) list.get(i4)).intValue());
            }
            this.f27131a.mo28239b(i3);
            while (i2 < list.size()) {
                this.f27131a.mo28239b(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f27131a.mo28247c(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void zzk(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f27131a.mo28228a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbn.m26707j(((Integer) list.get(i4)).intValue());
            }
            this.f27131a.mo28239b(i3);
            while (i2 < list.size()) {
                this.f27131a.mo28250d(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f27131a.mo28252e(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void zzl(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f27131a.mo28228a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbn.m26703h(((Long) list.get(i4)).longValue());
            }
            this.f27131a.mo28239b(i3);
            while (i2 < list.size()) {
                this.f27131a.mo28249c(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f27131a.mo28248c(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public final void zzm(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f27131a.mo28228a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbn.m26700h(((Integer) list.get(i4)).intValue());
            }
            this.f27131a.mo28239b(i3);
            while (i2 < list.size()) {
                this.f27131a.mo28246c(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f27131a.mo28251d(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void zzn(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f27131a.mo28228a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbn.m26695f(((Long) list.get(i4)).longValue());
            }
            this.f27131a.mo28239b(i3);
            while (i2 < list.size()) {
                this.f27131a.mo28244b(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f27131a.mo28241b(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }
}
