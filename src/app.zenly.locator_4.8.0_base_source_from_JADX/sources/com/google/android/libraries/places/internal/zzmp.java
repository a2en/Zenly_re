package com.google.android.libraries.places.internal;

public enum zzmp implements zzrg {
    HOME(0),
    WORK(1),
    NICKNAME(2);
    
    private static final zzrf<zzmp> zzd = null;
    private final int zze;

    static {
        zzd = new zzms();
    }

    private zzmp(int i) {
        this.zze = i;
    }

    public static zzri zzb() {
        return zzmr.zza;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(zzmp.class.getName());
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
