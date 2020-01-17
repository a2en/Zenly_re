package com.google.android.libraries.places.internal;

import com.google.android.gms.tasks.OnFailureListener;

final /* synthetic */ class zzej implements OnFailureListener {
    private final zzei zza;

    zzej(zzei zzei) {
        this.zza = zzei;
    }

    public final void onFailure(Exception exc) {
        zzed zzed = this.zza.zza;
        zzed.zza = null;
        zzel zzel = new zzel(3, zzed.zzb(exc), zzgv.zza(), -1, null);
        zzed.zza(zzel);
    }
}
