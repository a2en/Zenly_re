package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

final class zzbf extends zzbm<Object, FindAutocompletePredictionsRequest> {
    zzbf(FindAutocompletePredictionsRequest findAutocompletePredictionsRequest, Locale locale, String str, boolean z, zzcu zzcu) {
        super(findAutocompletePredictionsRequest, locale, str, z, zzcu);
    }

    public final Map<String, String> zze() {
        Object obj;
        FindAutocompletePredictionsRequest findAutocompletePredictionsRequest = (FindAutocompletePredictionsRequest) zza();
        HashMap hashMap = new HashMap();
        String query = findAutocompletePredictionsRequest.getQuery();
        if (query == null) {
            obj = null;
        } else {
            obj = query.replaceFirst("^\\s+", "").replaceFirst("\\s+$", " ");
        }
        zzbm.zza(hashMap, "input", obj, null);
        zzbm.zza(hashMap, "types", zzcc.zza(findAutocompletePredictionsRequest.getTypeFilter()), null);
        zzbm.zza(hashMap, "sessiontoken", findAutocompletePredictionsRequest.getSessionToken(), null);
        zzbm.zza(hashMap, "locationbias", zzca.zza(findAutocompletePredictionsRequest.getLocationBias()), null);
        zzbm.zza(hashMap, "locationrestriction", zzca.zza(findAutocompletePredictionsRequest.getLocationRestriction()), null);
        zzbm.zza(hashMap, "components", zzca.zza(findAutocompletePredictionsRequest.getCountry()), null);
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public final String zzf() {
        return "autocomplete/json";
    }
}
