package com.google.android.libraries.places.internal;

import android.view.View;
import android.view.View.OnClickListener;

final /* synthetic */ class zzfa implements OnClickListener {
    private final zzex zza;
    private final zzed zzb;
    private final int zzc;

    zzfa(zzex zzex, zzed zzed, int i) {
        this.zza = zzex;
        this.zzb = zzed;
        this.zzc = i;
    }

    public final void onClick(View view) {
        zzex zzex = this.zza;
        zzed zzed = this.zzb;
        int i = this.zzc;
        try {
            zzed.onItemClick(null, zzex.itemView, i, (long) i);
        } catch (Error | RuntimeException e) {
            zzdc.zza(e);
            throw e;
        }
    }
}
