package com.google.android.libraries.places.internal;

import java.io.Serializable;
import java.lang.Comparable;

public final class zzhb<C extends Comparable> extends zzhe implements Serializable {
    private static final zzhb<Comparable> zza = new zzhb<>(zzgr.zzb, zzgp.zzb);
    private final zzgq<C> zzb;
    private final zzgq<C> zzc;

    private zzhb(zzgq<C> zzgq, zzgq<C> zzgq2) {
        this.zzb = (zzgq) zzgg.zza(zzgq);
        this.zzc = (zzgq) zzgg.zza(zzgq2);
        if (zzgq.compareTo(zzgq2) > 0 || zzgq == zzgp.zzb || zzgq2 == zzgr.zzb) {
            String str = "Invalid range: ";
            String valueOf = String.valueOf(zzb(zzgq, zzgq2));
            throw new IllegalArgumentException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
    }

    private static <C extends Comparable<?>> zzhb<C> zza(zzgq<C> zzgq, zzgq<C> zzgq2) {
        return new zzhb<>(zzgq, zzgq2);
    }

    public static <C extends Comparable<?>> zzhb<C> zzb(C c, C c2) {
        return zza(zzgq.zzb(c), zzgq.zzb(c2));
    }

    static int zzc(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzhb) {
            zzhb zzhb = (zzhb) obj;
            if (this.zzb.equals(zzhb.zzb) && this.zzc.equals(zzhb.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.zzb.hashCode() * 31) + this.zzc.hashCode();
    }

    public final String toString() {
        return zzb(this.zzb, this.zzc);
    }

    public static <C extends Comparable<?>> zzhb<C> zza(C c, C c2) {
        return zza(zzgq.zzb(c), (zzgq<C>) new zzgs<C>(c2));
    }

    public final boolean zzb(C c) {
        zzgg.zza(c);
        return this.zzb.zza(c) && !this.zzc.zza(c);
    }

    private static String zzb(zzgq<?> zzgq, zzgq<?> zzgq2) {
        StringBuilder sb = new StringBuilder(16);
        zzgq.zza(sb);
        sb.append("..");
        zzgq2.zzb(sb);
        return sb.toString();
    }

    public static <C extends Comparable<?>> zzhb<C> zza(C c) {
        return zza(zzgq.zzb(c), (zzgq<C>) zzgp.zzb);
    }
}
