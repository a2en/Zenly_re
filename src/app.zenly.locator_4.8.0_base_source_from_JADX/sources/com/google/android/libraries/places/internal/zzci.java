package com.google.android.libraries.places.internal;

import android.content.Context;
import android.net.wifi.WifiManager;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.C8737n;
import com.google.android.gms.location.C10559a;
import com.google.android.gms.location.C10568e;
import com.google.android.libraries.places.api.net.PlacesClient;

public final class zzci implements zzcn {
    private final zzco zza;
    private final Context zzb;
    private final zzdb zzc;

    private zzci(Context context, zzco zzco, zzdb zzdb) {
        this.zza = zzco;
        this.zzb = context;
        this.zzc = zzdb;
    }

    public static zzcm zza() {
        return new zzck();
    }

    private final RequestQueue zzc() {
        return (RequestQueue) zzun.zza(C8737n.m20573a(zzcw.zza(this.zzb)), "Cannot return null from a non-@Nullable @Provides method");
    }

    private final zzu zzd() {
        return zzt.zza(zzct.zza(zzcw.zza(this.zzb)), this.zzc, this.zza);
    }

    public final PlacesClient zzb() {
        return zzax.zza(zzbv.zza(this.zza, new zzcu(this.zzb), zzab.zza(zzc(), new zzbj()), zzah.zza(zzc()), zzd(), zza.zza()), zzn.zza((C10559a) zzun.zza(C10568e.m27017a(zzcw.zza(this.zzb)), "Cannot return null from a non-@Nullable @Provides method"), new zzce(new zzcf())), zzr.zza((WifiManager) zzcw.zza(this.zzb).getSystemService("wifi"), zza.zza()), zzd(), zza.zza());
    }
}
