package com.google.android.libraries.places.internal;

import android.graphics.Bitmap;
import com.android.volley.Response.Listener;
import com.google.android.gms.tasks.C10694d;

final /* synthetic */ class zzad implements Listener {
    private final zzao zza;
    private final C10694d zzb;

    zzad(zzao zzao, C10694d dVar) {
        this.zza = zzao;
        this.zzb = dVar;
    }

    public final void onResponse(Object obj) {
        zzao zzao = this.zza;
        C10694d dVar = this.zzb;
        try {
            zzao.zza((Bitmap) obj);
            dVar.mo29329b(zzao.zza());
        } catch (Error | RuntimeException e) {
            zzdc.zza(e);
            throw e;
        }
    }
}
