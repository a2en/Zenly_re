package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.api.net.FetchPlaceRequest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

final class zzbd extends zzbm<Object, FetchPlaceRequest> {
    zzbd(FetchPlaceRequest fetchPlaceRequest, Locale locale, String str, boolean z, zzcu zzcu) {
        super(fetchPlaceRequest, locale, str, z, zzcu);
    }

    public final Map<String, String> zze() {
        FetchPlaceRequest fetchPlaceRequest = (FetchPlaceRequest) zza();
        HashMap hashMap = new HashMap();
        zzbm.zza(hashMap, "placeid", fetchPlaceRequest.getPlaceId(), null);
        zzbm.zza(hashMap, "sessiontoken", fetchPlaceRequest.getSessionToken(), null);
        zzbm.zza(hashMap, "fields", zzcd.zzb(fetchPlaceRequest.getPlaceFields()), null);
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public final String zzf() {
        return "details/json";
    }
}
