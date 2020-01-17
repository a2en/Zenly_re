package com.google.android.libraries.places.internal;

import com.android.volley.Response.ErrorListener;
import com.android.volley.VolleyError;
import com.google.android.gms.tasks.C10694d;

final /* synthetic */ class zzaa implements ErrorListener {
    private final C10694d zza;

    zzaa(C10694d dVar) {
        this.zza = dVar;
    }

    public final void onErrorResponse(VolleyError volleyError) {
        try {
            this.zza.mo29328b((Exception) zzw.zza(volleyError));
        } catch (Error | RuntimeException e) {
            zzdc.zza(e);
            throw e;
        }
    }
}
