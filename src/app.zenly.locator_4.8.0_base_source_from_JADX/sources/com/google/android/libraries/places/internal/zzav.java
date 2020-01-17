package com.google.android.libraries.places.internal;

import com.google.android.gms.tasks.C10693c;
import com.google.android.gms.tasks.Continuation;
import com.google.android.libraries.places.api.net.FindCurrentPlaceRequest;

final /* synthetic */ class zzav implements Continuation {
    private final zzan zza;
    private final FindCurrentPlaceRequest zzb;
    private final long zzc;
    private final zzg zzd;

    zzav(zzan zzan, FindCurrentPlaceRequest findCurrentPlaceRequest, long j, zzg zzg) {
        this.zza = zzan;
        this.zzb = findCurrentPlaceRequest;
        this.zzc = j;
        this.zzd = zzg;
    }

    public final Object then(C10693c cVar) {
        return this.zza.zza(this.zzb, this.zzc, this.zzd, cVar);
    }
}
