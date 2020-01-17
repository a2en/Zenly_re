package com.google.android.libraries.places.internal;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse;

final /* synthetic */ class zzek implements OnSuccessListener {
    private final zzei zza;

    zzek(zzei zzei) {
        this.zza = zzei;
    }

    public final void onSuccess(Object obj) {
        FindAutocompletePredictionsResponse findAutocompletePredictionsResponse = (FindAutocompletePredictionsResponse) obj;
        zzed zzed = this.zza.zza;
        zzed.zza = null;
        zzed.zza(zzel.zza(findAutocompletePredictionsResponse.getAutocompletePredictions()));
    }
}
