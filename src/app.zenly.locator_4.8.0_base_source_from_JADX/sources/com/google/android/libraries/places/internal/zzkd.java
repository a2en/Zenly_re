package com.google.android.libraries.places.internal;

public enum zzkd implements zzrg {
    INVALID_STATE(0),
    NOT_INITIALIZED(1),
    NO_GEOFENCE(2),
    DISABLED(3),
    HAS_GEOFENCE(4),
    UNAVAILABLE_ACTIVITY(5),
    UNKNOWN_ACTIVITY(6),
    STILL_ACTIVITY(7),
    WALKING_ACTIVITY(8),
    FAST_MOVING_ACTIVITY(9),
    BACKGROUND_USER(10),
    CHRE_GEOFENCING(11);
    
    private static final zzrf<zzkd> zzm = null;
    private final int zzn;

    static {
        zzm = new zzkc();
    }

    private zzkd(int i) {
        this.zzn = i;
    }

    public static zzri zzb() {
        return zzke.zza;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(zzkd.class.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" number=");
        sb.append(this.zzn);
        sb.append(" name=");
        sb.append(name());
        sb.append('>');
        return sb.toString();
    }

    public final int zza() {
        return this.zzn;
    }
}
