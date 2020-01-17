package com.google.android.libraries.places.internal;

import com.google.android.gms.tasks.C10693c;
import com.google.android.gms.tasks.C10694d;
import com.google.android.gms.tasks.Continuation;

final /* synthetic */ class zzcg implements Continuation {
    private final zzce zza;
    private final C10694d zzb;

    zzcg(zzce zzce, C10694d dVar) {
        this.zza = zzce;
        this.zzb = dVar;
    }

    public final Object then(C10693c cVar) {
        C10694d dVar = this.zzb;
        if (cVar.mo29320e()) {
            dVar.mo29327a(cVar.mo29315b());
        } else if (!cVar.mo29318c() && cVar.mo29309a() != null) {
            dVar.mo29326a(cVar.mo29309a());
        }
        return dVar.mo29325a();
    }
}
