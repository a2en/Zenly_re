package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.internal.zzrb.zzc;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

final class zzqq implements zzul {
    private final zzqn zza;

    private zzqq(zzqn zzqn) {
        this.zza = (zzqn) zzrd.zza(zzqn, "output");
    }

    public static zzqq zza(zzqn zzqn) {
        zzqq zzqq = zzqn.zza;
        if (zzqq != null) {
            return zzqq;
        }
        return new zzqq(zzqn);
    }

    public final void zzb(int i, long j) throws IOException {
        this.zza.zzc(i, j);
    }

    public final void zzc(int i, long j) throws IOException {
        this.zza.zza(i, j);
    }

    public final void zzd(int i, long j) throws IOException {
        this.zza.zzc(i, j);
    }

    public final void zze(int i, int i2) throws IOException {
        this.zza.zzc(i, i2);
    }

    public final void zzf(int i, int i2) throws IOException {
        this.zza.zzd(i, i2);
    }

    public final void zzg(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzqn.zzb(((Double) list.get(i4)).doubleValue());
            }
            this.zza.zzb(i3);
            while (i2 < list.size()) {
                this.zza.zza(((Double) list.get(i2)).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zza(i, ((Double) list.get(i2)).doubleValue());
            i2++;
        }
    }

    public final void zzh(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzqn.zzk(((Integer) list.get(i4)).intValue());
            }
            this.zza.zzb(i3);
            while (i2 < list.size()) {
                this.zza.zza(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzb(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void zzi(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzqn.zzb(((Boolean) list.get(i4)).booleanValue());
            }
            this.zza.zzb(i3);
            while (i2 < list.size()) {
                this.zza.zza(((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zza(i, ((Boolean) list.get(i2)).booleanValue());
            i2++;
        }
    }

    public final void zzj(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzqn.zzg(((Integer) list.get(i4)).intValue());
            }
            this.zza.zzb(i3);
            while (i2 < list.size()) {
                this.zza.zzb(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzc(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void zzk(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzqn.zzj(((Integer) list.get(i4)).intValue());
            }
            this.zza.zzb(i3);
            while (i2 < list.size()) {
                this.zza.zzd(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zze(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void zzl(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzqn.zzh(((Long) list.get(i4)).longValue());
            }
            this.zza.zzb(i3);
            while (i2 < list.size()) {
                this.zza.zzc(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzc(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public final void zzm(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzqn.zzh(((Integer) list.get(i4)).intValue());
            }
            this.zza.zzb(i3);
            while (i2 < list.size()) {
                this.zza.zzc(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzd(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void zzn(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzqn.zzf(((Long) list.get(i4)).longValue());
            }
            this.zza.zzb(i3);
            while (i2 < list.size()) {
                this.zza.zzb(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzb(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public final void zzc(int i, int i2) throws IOException {
        this.zza.zzb(i, i2);
    }

    public final void zzd(int i, int i2) throws IOException {
        this.zza.zze(i, i2);
    }

    public final void zze(int i, long j) throws IOException {
        this.zza.zzb(i, j);
    }

    public final void zzf(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzqn.zzb(((Float) list.get(i4)).floatValue());
            }
            this.zza.zzb(i3);
            while (i2 < list.size()) {
                this.zza.zza(((Float) list.get(i2)).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zza(i, ((Float) list.get(i2)).floatValue());
            i2++;
        }
    }

    public final int zza() {
        return zzc.zzj;
    }

    public final void zzb(int i, int i2) throws IOException {
        this.zza.zzb(i, i2);
    }

    public final void zzc(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzqn.zzd(((Long) list.get(i4)).longValue());
            }
            this.zza.zzb(i3);
            while (i2 < list.size()) {
                this.zza.zza(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zza(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public final void zzd(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzqn.zze(((Long) list.get(i4)).longValue());
            }
            this.zza.zzb(i3);
            while (i2 < list.size()) {
                this.zza.zza(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zza(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public final void zze(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzqn.zzg(((Long) list.get(i4)).longValue());
            }
            this.zza.zzb(i3);
            while (i2 < list.size()) {
                this.zza.zzc(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzc(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public final void zza(int i, int i2) throws IOException {
        this.zza.zze(i, i2);
    }

    public final void zzb(int i, Object obj, zzsz zzsz) throws IOException {
        zzqn zzqn = this.zza;
        zzsm zzsm = (zzsm) obj;
        zzqn.zza(i, 3);
        zzsz.zza(zzsm, (zzul) zzqn.zza);
        zzqn.zza(i, 4);
    }

    public final void zza(int i, long j) throws IOException {
        this.zza.zza(i, j);
    }

    public final void zza(int i, float f) throws IOException {
        this.zza.zza(i, f);
    }

    public final void zza(int i, double d) throws IOException {
        this.zza.zza(i, d);
    }

    public final void zzb(int i) throws IOException {
        this.zza.zza(i, 4);
    }

    public final void zza(int i, boolean z) throws IOException {
        this.zza.zza(i, z);
    }

    public final void zzb(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzqn.zzi(((Integer) list.get(i4)).intValue());
            }
            this.zza.zzb(i3);
            while (i2 < list.size()) {
                this.zza.zzd(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zze(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void zza(int i, String str) throws IOException {
        this.zza.zza(i, str);
    }

    public final void zza(int i, zzqa zzqa) throws IOException {
        this.zza.zza(i, zzqa);
    }

    public final void zza(int i, Object obj, zzsz zzsz) throws IOException {
        this.zza.zza(i, (zzsm) obj, zzsz);
    }

    public final void zza(int i) throws IOException {
        this.zza.zza(i, 3);
    }

    public final void zza(int i, Object obj) throws IOException {
        if (obj instanceof zzqa) {
            this.zza.zzb(i, (zzqa) obj);
        } else {
            this.zza.zza(i, (zzsm) obj);
        }
    }

    public final void zza(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzqn.zzf(((Integer) list.get(i4)).intValue());
            }
            this.zza.zzb(i3);
            while (i2 < list.size()) {
                this.zza.zza(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzb(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void zzb(int i, List<zzqa> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.zza.zza(i, (zzqa) list.get(i2));
        }
    }

    public final void zzb(int i, List<?> list, zzsz zzsz) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzb(i, list.get(i2), zzsz);
        }
    }

    public final void zza(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (list instanceof zzrw) {
            zzrw zzrw = (zzrw) list;
            while (i2 < list.size()) {
                Object zza2 = zzrw.zza(i2);
                if (zza2 instanceof String) {
                    this.zza.zza(i, (String) zza2);
                } else {
                    this.zza.zza(i, (zzqa) zza2);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zza(i, (String) list.get(i2));
            i2++;
        }
    }

    public final void zza(int i, List<?> list, zzsz zzsz) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            zza(i, list.get(i2), zzsz);
        }
    }

    public final <K, V> void zza(int i, zzsd<K, V> zzsd, Map<K, V> map) throws IOException {
        for (Entry entry : map.entrySet()) {
            this.zza.zza(i, 2);
            this.zza.zzb(zzqw.zza(zzsd.zza, 1, entry.getKey()) + zzqw.zza(zzsd.zzb, 2, entry.getValue()));
            zzqn zzqn = this.zza;
            Object key = entry.getKey();
            Object value = entry.getValue();
            zzqw.zza(zzqn, zzsd.zza, 1, key);
            zzqw.zza(zzqn, zzsd.zzb, 2, value);
        }
    }
}
