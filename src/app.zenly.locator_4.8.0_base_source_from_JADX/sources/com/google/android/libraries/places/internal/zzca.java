package com.google.android.libraries.places.internal;

import android.location.Location;
import android.text.TextUtils;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.RectangularBounds;
import java.util.ArrayList;
import java.util.Locale;

public final class zzca {
    private static final zzha<zzp, String> zza = new zzgz().zza(zzp.NONE, "NONE").zza(zzp.PSK, "WPA_PSK").zza(zzp.EAP, "WPA_EAP").zza(zzp.OTHER, "SECURED_NONE").zza();

    public static String zza(zzgv<zzq> zzgv) {
        ArrayList arrayList = new ArrayList(zzgv.size());
        int size = zzgv.size();
        int i = 0;
        while (i < size) {
            Object obj = zzgv.get(i);
            i++;
            zzq zzq = (zzq) obj;
            String str = "strength_dbm";
            String str2 = "is_connected";
            String str3 = "frequency_mhz";
            zzha zza2 = new zzgz().zza("mac", zzq.zza()).zza(str, Integer.valueOf(zzq.zzb())).zza("wifi_auth_type", zza.get(zzq.zzc())).zza(str2, Boolean.valueOf(zzq.zzd())).zza(str3, Integer.valueOf(zzq.zze())).zza();
            arrayList.add(zzfz.zza(",").zzb("=").zza(new StringBuilder(), zza2.entrySet().iterator()).toString());
        }
        return zzfz.zza("|").zza().zza((Iterable<?>) arrayList);
    }

    public static String zzb(Location location) {
        if (location == null) {
            return null;
        }
        double latitude = location.getLatitude();
        double longitude = location.getLongitude();
        return String.format(Locale.US, "%.15f,%.15f", new Object[]{Double.valueOf(latitude), Double.valueOf(longitude)});
    }

    public static Integer zza(Location location) {
        if (location == null) {
            return null;
        }
        float accuracy = location.getAccuracy();
        if (!location.hasAccuracy() || accuracy <= 0.0f) {
            return null;
        }
        return Integer.valueOf(Math.round(accuracy * 100.0f));
    }

    public static String zza(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String str2 = "country:";
        String valueOf = String.valueOf(str);
        return valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2);
    }

    public static String zza(LocationBias locationBias) {
        if (locationBias == null) {
            return null;
        }
        if (locationBias instanceof RectangularBounds) {
            return zza((RectangularBounds) locationBias);
        }
        throw new AssertionError("Unknown LocationBias type.");
    }

    public static String zza(LocationRestriction locationRestriction) {
        if (locationRestriction == null) {
            return null;
        }
        if (locationRestriction instanceof RectangularBounds) {
            return zza((RectangularBounds) locationRestriction);
        }
        throw new AssertionError("Unknown LocationRestriction type.");
    }

    private static String zza(RectangularBounds rectangularBounds) {
        LatLng southwest = rectangularBounds.getSouthwest();
        double d = southwest.f27648e;
        double d2 = southwest.f27649f;
        LatLng northeast = rectangularBounds.getNortheast();
        double d3 = northeast.f27648e;
        double d4 = northeast.f27649f;
        return String.format(Locale.US, "rectangle:%.15f,%.15f|%.15f,%.15f", new Object[]{Double.valueOf(d), Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4)});
    }
}
