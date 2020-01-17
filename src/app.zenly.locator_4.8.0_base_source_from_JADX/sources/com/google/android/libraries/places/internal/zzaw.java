package com.google.android.libraries.places.internal;

import android.location.Location;
import com.google.android.gms.tasks.C10693c;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.libraries.places.api.net.FindCurrentPlaceRequest;

final /* synthetic */ class zzaw implements SuccessContinuation {
    private final zzan zza;
    private final FindCurrentPlaceRequest zzb;

    zzaw(zzan zzan, FindCurrentPlaceRequest findCurrentPlaceRequest) {
        this.zza = zzan;
        this.zzb = findCurrentPlaceRequest;
    }

    public final C10693c then(Object obj) {
        return this.zza.zza(this.zzb, (Location) obj);
    }
}
