package com.google.android.libraries.places.internal;

import com.google.android.gms.tasks.C10693c;
import com.google.android.gms.tasks.Continuation;

final /* synthetic */ class zzbw implements Continuation {
    private final zzbo zza;
    private final long zzb;

    zzbw(zzbo zzbo, long j) {
        this.zza = zzbo;
        this.zzb = j;
    }

    public final Object then(C10693c cVar) {
        return this.zza.zza(this.zzb, cVar);
    }
}
