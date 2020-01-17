package com.google.android.libraries.places.internal;

import com.google.android.gms.tasks.C10689a;
import com.google.android.gms.tasks.C10693c;
import com.google.android.gms.tasks.Continuation;

final /* synthetic */ class zzj implements Continuation {
    private final zzk zza;
    private final C10689a zzb;

    zzj(zzk zzk, C10689a aVar) {
        this.zza = zzk;
        this.zzb = aVar;
    }

    public final Object then(C10693c cVar) {
        return this.zza.zza(this.zzb, cVar);
    }
}
