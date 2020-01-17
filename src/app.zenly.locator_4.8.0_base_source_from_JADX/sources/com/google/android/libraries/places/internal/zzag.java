package com.google.android.libraries.places.internal;

import com.android.volley.Response.ErrorListener;
import com.android.volley.VolleyError;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.C10694d;
import com.google.android.libraries.places.api.net.PlacesStatusCodes;

final /* synthetic */ class zzag implements ErrorListener {
    private final C10694d zza;

    zzag(C10694d dVar) {
        this.zza = dVar;
    }

    public final void onErrorResponse(VolleyError volleyError) {
        ApiException apiException;
        C10694d dVar = this.zza;
        try {
            if (volleyError.f22427e != null) {
                int i = volleyError.f22427e.f22455a;
                if (i == 400) {
                    apiException = new ApiException(new Status(PlacesStatusCodes.INVALID_REQUEST, "The provided parameters are invalid (did you include a max width or height?)."));
                } else if (i == 403) {
                    apiException = new ApiException(new Status(PlacesStatusCodes.REQUEST_DENIED, "The provided API key is invalid."));
                }
                dVar.mo29328b((Exception) apiException);
            }
            apiException = zzw.zza(volleyError);
            dVar.mo29328b((Exception) apiException);
        } catch (Error | RuntimeException e) {
            zzdc.zza(e);
            throw e;
        }
    }
}
