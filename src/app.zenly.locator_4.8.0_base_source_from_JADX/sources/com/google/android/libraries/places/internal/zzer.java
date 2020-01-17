package com.google.android.libraries.places.internal;

import android.database.DataSetObserver;

final class zzer extends DataSetObserver {
    private final /* synthetic */ zzes zza;

    zzer(zzes zzes) {
        this.zza = zzes;
    }

    public final void onChanged() {
        try {
            this.zza.zzc = this.zza.zzd;
            this.zza.zzd = this.zza.zza.getCount();
        } catch (Error | RuntimeException e) {
            zzdc.zza(e);
            throw e;
        }
    }

    public final void onInvalidated() {
        zzes zzes = this.zza;
        zzes.zzc = zzes.zzd = 0;
    }
}
