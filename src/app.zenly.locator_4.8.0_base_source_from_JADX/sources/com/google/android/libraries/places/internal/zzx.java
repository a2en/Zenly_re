package com.google.android.libraries.places.internal;

import com.android.volley.Response.Listener;
import com.google.android.gms.tasks.C10694d;
import org.json.JSONObject;

final /* synthetic */ class zzx implements Listener {
    private final zzy zza;
    private final Class zzb;
    private final C10694d zzc;

    zzx(zzy zzy, Class cls, C10694d dVar) {
        this.zza = zzy;
        this.zzb = cls;
        this.zzc = dVar;
    }

    public final void onResponse(Object obj) {
        this.zza.zza(this.zzb, this.zzc, (JSONObject) obj);
    }
}
