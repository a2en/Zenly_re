package com.google.android.libraries.places.internal;

import com.google.android.gms.clearcut.ClearcutLogger;
import com.google.android.libraries.places.internal.zzmm.zzp;
import com.google.android.libraries.places.internal.zzmm.zzp.zza;
import com.google.android.libraries.places.internal.zzmm.zzp.zzc;
import com.google.android.libraries.places.internal.zzmm.zzp.zzd;
import com.google.android.libraries.places.internal.zzmm.zzs;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;

public final class zzez implements zzfn {
    private final ClearcutLogger zza;
    private final zzdb zzb;

    zzez(ClearcutLogger clearcutLogger, zzdb zzdb) {
        this.zza = clearcutLogger;
        this.zzb = zzdb;
    }

    public final void zza(zzfm zzfm) {
        zzc zzh = zzp.zza().zza(zzfm.zzc()).zzb(zzfm.zzd()).zzc(zzfm.zze()).zza(zzfm.zzf()).zzb(zzfm.zzg()).zzc(zzfm.zzh()).zzd(zzfm.zzi()).zze(zzfm.zzj().length()).zzf(zzfm.zzk()).zzg(zzfm.zzl()).zzd(zzfm.zzm()).zzh(zzfm.zzn());
        if (zzfm.zza() == zzdf.FRAGMENT) {
            zzh.zza(zzd.ANDROID_AUTOCOMPLETE_FRAGMENT);
        } else if (zzfm.zza() == zzdf.INTENT) {
            zzh.zza(zzd.ANDROID_AUTOCOMPLETE_MANUAL_LAUNCHER);
        } else {
            zzh.zza(zzd.UNKNOWN_ORIGIN);
        }
        if (zzfm.zzb() == AutocompleteActivityMode.FULLSCREEN) {
            zzh.zza(zza.FULLSCREEN);
        } else if (zzfm.zzb() == AutocompleteActivityMode.OVERLAY) {
            zzh.zza(zza.OVERLAY);
        }
        this.zza.mo26970a(zzda.zza((zzs) zzda.zza(this.zzb).zza(zzs.zzc.AUTOCOMPLETE_WIDGET_SESSION).zza((zzp) zzh.zzf()).zzf()).zzd()).mo26971a();
    }
}
