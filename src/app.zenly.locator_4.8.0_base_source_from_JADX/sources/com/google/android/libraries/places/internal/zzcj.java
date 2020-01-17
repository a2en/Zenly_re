package com.google.android.libraries.places.internal;

import com.google.android.gms.tasks.C10693c;
import com.google.android.gms.tasks.C10694d;
import com.google.android.gms.tasks.OnCompleteListener;

final /* synthetic */ class zzcj implements OnCompleteListener {
    private final zzce zza;
    private final C10694d zzb;

    zzcj(zzce zzce, C10694d dVar) {
        this.zza = zzce;
        this.zzb = dVar;
    }

    public final void onComplete(C10693c cVar) {
        this.zza.zza(this.zzb, cVar);
    }
}
