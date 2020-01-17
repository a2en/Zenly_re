package com.google.android.libraries.places.internal;

import android.location.Location;
import com.google.android.libraries.places.api.net.FindCurrentPlaceRequest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

final class zzbh extends zzbm<Object, FindCurrentPlaceRequest> {
    private final Location zza;
    private final zzgv<zzq> zzb;

    zzbh(FindCurrentPlaceRequest findCurrentPlaceRequest, Location location, zzgv<zzq> zzgv, Locale locale, String str, boolean z, zzcu zzcu) {
        super(findCurrentPlaceRequest, locale, str, z, zzcu);
        this.zza = location;
        this.zzb = zzgv;
    }

    public final Map<String, String> zze() {
        FindCurrentPlaceRequest findCurrentPlaceRequest = (FindCurrentPlaceRequest) zza();
        HashMap hashMap = new HashMap();
        zzbm.zza(hashMap, "location", zzca.zzb(this.zza), null);
        zzbm.zza(hashMap, "wifiaccesspoints", zzca.zza(this.zzb), null);
        zzbm.zza(hashMap, "precision", zzca.zza(this.zza), null);
        zzbm.zza(hashMap, "timestamp", Long.valueOf(this.zza.getTime()), null);
        zzbm.zza(hashMap, "fields", zzcd.zzb(findCurrentPlaceRequest.getPlaceFields()), null);
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public final String zzf() {
        return "findplacefromuserlocation/json";
    }
}
