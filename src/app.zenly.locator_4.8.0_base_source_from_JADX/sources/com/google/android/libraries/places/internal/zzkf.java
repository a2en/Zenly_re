package com.google.android.libraries.places.internal;

public enum zzkf implements zzrg {
    INVALID_MOVEMENT(0),
    UNKNOWN_MOVEMENT(1),
    STILL_MOVEMENT(2),
    WALKING_MOVEMENT(3),
    FAST_MOVING_MOVEMENT(4);
    
    private static final zzrf<zzkf> zzf = null;
    private final int zzg;

    static {
        zzf = new zzkh();
    }

    private zzkf(int i) {
        this.zzg = i;
    }

    public static zzri zzb() {
        return zzkg.zza;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(zzkf.class.getName());
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
