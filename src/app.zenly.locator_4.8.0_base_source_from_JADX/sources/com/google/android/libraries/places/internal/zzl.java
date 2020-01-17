package com.google.android.libraries.places.internal;

import com.google.android.gms.location.C10566d;
import com.google.android.gms.tasks.C10693c;
import com.google.android.gms.tasks.C10694d;
import com.google.android.gms.tasks.OnCompleteListener;

final /* synthetic */ class zzl implements OnCompleteListener {
    private final zzk zza;
    private final C10566d zzb;
    private final C10694d zzc;

    zzl(zzk zzk, C10566d dVar, C10694d dVar2) {
        this.zza = zzk;
        this.zzb = dVar;
        this.zzc = dVar2;
    }

    public final void onComplete(C10693c cVar) {
        this.zza.zza(this.zzb, this.zzc, cVar);
    }
}
