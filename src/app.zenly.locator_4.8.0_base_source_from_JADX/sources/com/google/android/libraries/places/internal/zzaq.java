package com.google.android.libraries.places.internal;

import com.google.android.gms.tasks.C10693c;
import com.google.android.gms.tasks.Continuation;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest;

final /* synthetic */ class zzaq implements Continuation {
    private final zzan zza;
    private final FindAutocompletePredictionsRequest zzb;

    zzaq(zzan zzan, FindAutocompletePredictionsRequest findAutocompletePredictionsRequest) {
        this.zza = zzan;
        this.zzb = findAutocompletePredictionsRequest;
    }

    public final Object then(C10693c cVar) {
        return this.zza.zza(this.zzb, cVar);
    }
}
