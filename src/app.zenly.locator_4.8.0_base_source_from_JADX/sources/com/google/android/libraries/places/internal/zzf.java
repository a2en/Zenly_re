package com.google.android.libraries.places.internal;

public final class zzf {
    private static zzf zza;
    private final zze zzb;

    private zzf(zze zze) {
        this.zzb = zze;
    }

    public static zzf zza() {
        zzf zzf = zza;
        if (!(zzf != null && !(zzf.zzb instanceof zzc))) {
            zza = new zzf(new zzc());
        }
        return zza;
    }

    public final zzg zzb() {
        return this.zzb.zza();
    }

    public final void zzb(zzh zzh) {
        this.zzb.zzb(zzh);
    }

    public final void zza(zzg zzg, zzh zzh) {
        this.zzb.zza(zzg, zzh);
    }

    public final void zza(zzh zzh) {
        this.zzb.zza(zzh);
    }
}
