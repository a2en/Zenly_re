package com.google.android.libraries.places.internal;

import com.google.android.gms.tasks.C10691b;
import com.google.android.gms.tasks.C10693c;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest;

final /* synthetic */ class zzeh implements Runnable {
    private final zzei zza;
    private final CharSequence zzb;

    zzeh(zzei zzei, CharSequence charSequence) {
        this.zza = zzei;
        this.zzb = charSequence;
    }

    public final void run() {
        zzei zzei = this.zza;
        CharSequence charSequence = this.zzb;
        try {
            if (!zzei.zza.zzd()) {
                zzei.zza.zza = new C10691b();
                C10693c findAutocompletePredictions = zzei.zza.zzc.findAutocompletePredictions(FindAutocompletePredictionsRequest.builder().setQuery(charSequence.toString()).setLocationBias(zzei.zza.zzd.zzb()).setLocationRestriction(zzei.zza.zzd.zzc()).setCountry(zzei.zza.zzd.zzd()).setTypeFilter(zzei.zza.zzd.zze()).setSessionToken(zzei.zza.zzk).setCancellationToken(zzei.zza.zza.mo29323b()).build());
                findAutocompletePredictions.mo29301a((OnSuccessListener<? super TResult>) new zzek<Object>(zzei));
                findAutocompletePredictions.mo29300a((OnFailureListener) new zzej(zzei));
            }
        } catch (Error | RuntimeException e) {
            zzdc.zza(e);
            throw e;
        }
    }
}
