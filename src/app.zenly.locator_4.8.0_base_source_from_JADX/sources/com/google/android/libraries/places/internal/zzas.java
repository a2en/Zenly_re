package com.google.android.libraries.places.internal;

import com.google.android.gms.tasks.C10693c;
import com.google.android.gms.tasks.Continuation;
import com.google.android.libraries.places.api.net.FetchPhotoRequest;

final /* synthetic */ class zzas implements Continuation {
    private final zzan zza;
    private final FetchPhotoRequest zzb;

    zzas(zzan zzan, FetchPhotoRequest fetchPhotoRequest) {
        this.zza = zzan;
        this.zzb = fetchPhotoRequest;
    }

    public final Object then(C10693c cVar) {
        return this.zza.zza(this.zzb, cVar);
    }
}
