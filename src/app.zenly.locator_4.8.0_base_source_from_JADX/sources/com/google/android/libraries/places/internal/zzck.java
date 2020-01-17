package com.google.android.libraries.places.internal;

import android.content.Context;

final class zzck implements zzcm {
    private Context zza;
    private zzco zzb;
    private zzdb zzc;

    private zzck() {
    }

    public final zzcn zza() {
        zzun.zza(this.zza, Context.class);
        zzun.zza(this.zzb, zzco.class);
        zzun.zza(this.zzc, zzdb.class);
        return new zzci(this.zza, this.zzb, this.zzc);
    }

    public final /* synthetic */ zzcm zza(zzdb zzdb) {
        this.zzc = (zzdb) zzun.zza(zzdb);
        return this;
    }

    public final /* synthetic */ zzcm zza(zzco zzco) {
        this.zzb = (zzco) zzun.zza(zzco);
        return this;
    }

    public final /* synthetic */ zzcm zza(Context context) {
        this.zza = (Context) zzun.zza(context);
        return this;
    }
}
