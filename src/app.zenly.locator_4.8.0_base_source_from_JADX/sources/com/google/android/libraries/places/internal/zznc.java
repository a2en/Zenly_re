package com.google.android.libraries.places.internal;

public enum zznc implements zzrg {
    OTHERS(0),
    NEARBY_ALERT(1),
    GET_CURRENT_PLACE(2),
    GEO_DATA_API(3);
    
    private static final zzrf<zznc> zze = null;
    private final int zzf;

    static {
        zze = new zznb();
    }

    private zznc(int i) {
        this.zzf = i;
    }

    public static zzri zzb() {
        return zznd.zza;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(zznc.class.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" number=");
        sb.append(this.zzf);
        sb.append(" name=");
        sb.append(name());
        sb.append('>');
        return sb.toString();
    }

    public final int zza() {
        return this.zzf;
    }
}
