package com.google.android.libraries.places.internal;

public enum zzpk implements zzrg {
    UNDEFINED(0),
    INFERRED_HOME(1),
    INFERRED_WORK(2);
    
    private static final zzrf<zzpk> zzd = null;
    private final int zze;

    static {
        zzd = new zzpj();
    }

    private zzpk(int i) {
        this.zze = i;
    }

    public static zzri zzb() {
        return zzpm.zza;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(zzpk.class.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" number=");
        sb.append(this.zze);
        sb.append(" name=");
        sb.append(name());
        sb.append('>');
        return sb.toString();
    }

    public final int zza() {
        return this.zze;
    }
}
