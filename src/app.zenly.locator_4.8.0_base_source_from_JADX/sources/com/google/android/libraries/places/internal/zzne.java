package com.google.android.libraries.places.internal;

public enum zzne implements zzrg {
    TYPE_UNSPECIFIED(0),
    ENTER(1),
    EXIT(2),
    DWELL_DEPRECATED(3),
    DWELL(4);
    
    private static final zzrf<zzne> zzf = null;
    private final int zzg;

    static {
        zzf = new zzng();
    }

    private zzne(int i) {
        this.zzg = i;
    }

    public static zzri zzb() {
        return zznf.zza;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(zzne.class.getName());
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
