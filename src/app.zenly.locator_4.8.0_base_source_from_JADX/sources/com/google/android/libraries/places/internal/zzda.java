package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.internal.zzhr.zza.C13839zza;
import com.google.android.libraries.places.internal.zzmm.zzs;
import com.google.android.libraries.places.internal.zzmm.zzs.zza;
import com.google.android.libraries.places.internal.zzmm.zzs.zze;

public final class zzda {
    public static zza zza(zzdb zzdb) {
        zze zze;
        int i = zzcz.zza[zzdb.zzc().ordinal()];
        if (i == 1) {
            zze = zze.AUTOCOMPLETE_WIDGET;
        } else if (i != 2) {
            zze = zze.UNKNOWN_SOURCE;
        } else {
            zze = zze.PROGRAMMATIC_API;
        }
        return zzs.zza().zza((zzhx.zza) zzhx.zza.zza().zza(zzdb.zza()).zza(zzdb.zzb()).zzf()).zza(true).zza(zze).zzb("2.0.0");
    }

    public static zzhr.zza zza(zzs zzs) {
        return (zzhr.zza) zzhr.zza.zza().zza(C13839zza.PLACES).zza(zzs).zzf();
    }
}
