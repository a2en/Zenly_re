package com.google.android.libraries.places.internal;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C1076n;

final class zzdy extends C1076n {
    private final /* synthetic */ zzdn zza;

    zzdy(zzdn zzdn) {
        this.zza = zzdn;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        if (i == 1) {
            try {
                this.zza.zzh();
            } catch (Error | RuntimeException e) {
                zzdc.zza(e);
                throw e;
            }
        }
    }
}
