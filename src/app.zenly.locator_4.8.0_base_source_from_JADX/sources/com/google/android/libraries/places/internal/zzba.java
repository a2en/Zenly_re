package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.api.model.PhotoMetadata;
import com.google.android.libraries.places.api.net.FetchPhotoRequest;
import java.util.HashMap;
import java.util.Map;

final class zzba extends zzbm<Object, FetchPhotoRequest> {
    zzba(FetchPhotoRequest fetchPhotoRequest, String str, boolean z, zzcu zzcu) {
        super(fetchPhotoRequest, null, str, z, zzcu);
    }

    public final Map<String, String> zze() {
        FetchPhotoRequest fetchPhotoRequest = (FetchPhotoRequest) zza();
        PhotoMetadata photoMetadata = fetchPhotoRequest.getPhotoMetadata();
        HashMap hashMap = new HashMap();
        zzbm.zza(hashMap, "maxheight", fetchPhotoRequest.getMaxHeight(), null);
        zzbm.zza(hashMap, "maxwidth", fetchPhotoRequest.getMaxWidth(), null);
        hashMap.put("photoreference", photoMetadata.zza());
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public final String zzf() {
        return "photo";
    }
}
