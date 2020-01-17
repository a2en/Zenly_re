package com.google.android.libraries.places.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.C10694d;

final /* synthetic */ class zzch implements Runnable {
    private final C10694d zza;
    private final String zzb;

    zzch(C10694d dVar, String str) {
        this.zza = dVar;
        this.zzb = str;
    }

    public final void run() {
        this.zza.mo29328b((Exception) new ApiException(new Status(15, this.zzb)));
    }
}
