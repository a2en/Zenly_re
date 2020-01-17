package com.google.android.libraries.places.internal;

import com.android.volley.toolbox.C8733j;
import com.google.android.gms.tasks.OnTokenCanceledListener;

final /* synthetic */ class zzaf implements OnTokenCanceledListener {
    private final C8733j zza;

    private zzaf(C8733j jVar) {
        this.zza = jVar;
    }

    static OnTokenCanceledListener zza(C8733j jVar) {
        return new zzaf(jVar);
    }

    public final void onCanceled() {
        this.zza.cancel();
    }
}
