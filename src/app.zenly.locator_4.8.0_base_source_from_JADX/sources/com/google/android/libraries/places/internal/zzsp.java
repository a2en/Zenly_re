package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map.Entry;

final class zzsp<T> implements zzsz<T> {
    private final zzsm zza;
    private final zztr<?, ?> zzb;
    private final boolean zzc;
    private final zzqr<?> zzd;

    private zzsp(zztr<?, ?> zztr, zzqr<?> zzqr, zzsm zzsm) {
        this.zzb = zztr;
        this.zzc = zzqr.zza(zzsm);
        this.zzd = zzqr;
        this.zza = zzsm;
    }

    static <T> zzsp<T> zza(zztr<?, ?> zztr, zzqr<?> zzqr, zzsm zzsm) {
        return new zzsp<>(zztr, zzqr, zzsm);
    }

    public final void zzb(T t, T t2) {
        zztb.zza(this.zzb, t, t2);
        if (this.zzc) {
            zztb.zza(this.zzd, t, t2);
        }
    }

    public final boolean zzc(T t) {
        return this.zzd.zza((Object) t).zzf();
    }

    public final int zzd(T t) {
        zztr<?, ?> zztr = this.zzb;
        int zzc2 = zztr.zzc(zztr.zza(t)) + 0;
        return this.zzc ? zzc2 + this.zzd.zza((Object) t).zzg() : zzc2;
    }

    public final boolean zza(T t, T t2) {
        if (!this.zzb.zza(t).equals(this.zzb.zza(t2))) {
            return false;
        }
        if (this.zzc) {
            return this.zzd.zza((Object) t).equals(this.zzd.zza((Object) t2));
        }
        return true;
    }

    public final void zzb(T t) {
        this.zzb.zzb(t);
        this.zzd.zzc(t);
    }

    public final int zza(T t) {
        int hashCode = this.zzb.zza(t).hashCode();
        return this.zzc ? (hashCode * 53) + this.zzd.zza((Object) t).hashCode() : hashCode;
    }

    public final void zza(T t, zzul zzul) throws IOException {
        Iterator zzd2 = this.zzd.zza((Object) t).zzd();
        while (zzd2.hasNext()) {
            Entry entry = (Entry) zzd2.next();
            zzqy zzqy = (zzqy) entry.getKey();
            if (zzqy.zzc() != zzum.MESSAGE || zzqy.zzd() || zzqy.zze()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (entry instanceof zzrs) {
                zzul.zza(zzqy.zza(), (Object) ((zzrs) entry).zza().zzc());
            } else {
                zzul.zza(zzqy.zza(), entry.getValue());
            }
        }
        zztr<?, ?> zztr = this.zzb;
        zztr.zzb(zztr.zza(t), zzul);
    }
}
