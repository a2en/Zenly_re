package com.google.android.libraries.places.internal;

import com.android.volley.toolbox.C8734k;
import com.google.android.gms.tasks.OnTokenCanceledListener;

final /* synthetic */ class zzz implements OnTokenCanceledListener {
    private final C8734k zza;

    private zzz(C8734k kVar) {
        this.zza = kVar;
    }

    static OnTokenCanceledListener zza(C8734k kVar) {
        return new zzz(kVar);
    }

    public final void onCanceled() {
        this.zza.cancel();
    }
}
