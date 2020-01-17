package com.google.android.libraries.places.internal;

import android.database.DataSetObserver;
import androidx.recyclerview.widget.RecyclerView.C1071i;

final class zzeu extends DataSetObserver {
    private final /* synthetic */ C1071i zza;

    zzeu(zzes zzes, C1071i iVar) {
        this.zza = iVar;
    }

    public final void onChanged() {
        try {
            this.zza.mo5419a();
        } catch (Error | RuntimeException e) {
            zzdc.zza(e);
            throw e;
        }
    }

    public final void onInvalidated() {
        try {
            this.zza.mo5419a();
        } catch (Error | RuntimeException e) {
            zzdc.zza(e);
            throw e;
        }
    }
}
