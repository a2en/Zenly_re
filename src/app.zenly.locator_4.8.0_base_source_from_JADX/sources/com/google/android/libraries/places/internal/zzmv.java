package com.google.android.libraries.places.internal;

import com.android.volley.toolbox.C8733j;

public enum zzmv implements zzrg {
    SUCCESS(0),
    GEOFENCE_NOT_AVAILABLE(C8733j.DEFAULT_IMAGE_TIMEOUT_MS),
    GEOFENCE_TOO_MANY_GEOFENCES(1001),
    GEOFENCE_TOO_MANY_PENDING_INTENTS(1002),
    GEOFENCE_CURRENT_LOCATION_UNKNOWN(1003);
    
    private static final zzrf<zzmv> zzf = null;
    private final int zzg;

    static {
        zzf = new zzmx();
    }

    private zzmv(int i) {
        this.zzg = i;
    }

    public static zzri zzb() {
        return zzmw.zza;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(zzmv.class.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" number=");
        sb.append(this.zzg);
        sb.append(" name=");
        sb.append(name());
        sb.append('>');
        return sb.toString();
    }

    public final int zza() {
        return this.zzg;
    }
}
