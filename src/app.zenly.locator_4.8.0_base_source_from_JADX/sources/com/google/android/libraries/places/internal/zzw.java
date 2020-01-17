package com.google.android.libraries.places.internal;

import com.android.volley.AuthFailureError;
import com.android.volley.C8715f;
import com.android.volley.NetworkError;
import com.android.volley.ParseError;
import com.android.volley.ServerError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.api.net.PlacesStatusCodes;

final class zzw {
    static ApiException zza(VolleyError volleyError) {
        int i = volleyError instanceof NetworkError ? 7 : volleyError instanceof TimeoutError ? 15 : ((volleyError instanceof ServerError) || (volleyError instanceof ParseError)) ? 8 : volleyError instanceof AuthFailureError ? PlacesStatusCodes.REQUEST_DENIED : 13;
        C8715f fVar = volleyError.f22427e;
        return new ApiException(new Status(i, String.format("Unexpected server error (HTTP Code: %s. Message: %s.)", new Object[]{fVar == null ? "N/A" : String.valueOf(fVar.f22455a), volleyError})));
    }
}
