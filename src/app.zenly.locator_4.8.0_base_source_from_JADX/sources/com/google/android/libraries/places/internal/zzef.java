package com.google.android.libraries.places.internal;

import com.google.android.gms.tasks.OnFailureListener;

final /* synthetic */ class zzef implements OnFailureListener {
    private final zzed zza;

    zzef(zzed zzed) {
        this.zza = zzed;
    }

    public final void onFailure(Exception exc) {
        this.zza.zza(exc);
    }
}
