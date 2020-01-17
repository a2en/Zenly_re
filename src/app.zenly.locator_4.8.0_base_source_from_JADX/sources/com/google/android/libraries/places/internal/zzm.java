package com.google.android.libraries.places.internal;

import com.google.android.gms.tasks.C10693c;
import com.google.android.gms.tasks.C10694d;
import com.google.android.gms.tasks.Continuation;

final /* synthetic */ class zzm implements Continuation {
    private final zzk zza;
    private final C10694d zzb;

    zzm(zzk zzk, C10694d dVar) {
        this.zza = zzk;
        this.zzb = dVar;
    }

    public final Object then(C10693c cVar) {
        return zzk.zza(this.zzb, cVar);
    }
}
