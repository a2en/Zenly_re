package com.google.android.libraries.places.internal;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView.C1085v;

public final class zzex extends C1085v {
    private int zza = -1;
    private boolean zzb = false;

    public zzex(View view) {
        super(view);
    }

    public final void zza(zzed zzed, int i, boolean z) {
        this.zza = i;
        this.zzb = z;
        zzed.zza(this.itemView, i);
        this.itemView.setOnClickListener(new zzfa(this, zzed, i));
    }

    public final boolean zzb() {
        return this.zzb;
    }

    public final int zza() {
        return this.zza;
    }
}
