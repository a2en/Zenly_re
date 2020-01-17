package com.google.android.libraries.places.internal;

import com.google.android.gms.tasks.C10693c;
import com.google.android.gms.tasks.Continuation;
import com.google.android.libraries.places.api.net.FetchPlaceRequest;

final /* synthetic */ class zzau implements Continuation {
    private final zzan zza;
    private final FetchPlaceRequest zzb;

    zzau(zzan zzan, FetchPlaceRequest fetchPlaceRequest) {
        this.zza = zzan;
        this.zzb = fetchPlaceRequest;
    }

    public final Object then(C10693c cVar) {
        return this.zza.zza(this.zzb, cVar);
    }
}
