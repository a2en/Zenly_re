package com.google.android.libraries.places.internal;

public enum zzmo implements zzrg {
    UNKNOWN(0),
    TYPE_ADD(1),
    TYPE_REMOVE(2);
    
    private static final zzrf<zzmo> zzd = null;
    private final int zze;

    static {
        zzd = new zzmn();
    }

    private zzmo(int i) {
        this.zze = i;
    }

    public static zzri zzb() {
        return zzmq.zza;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(zzmo.class.getName());
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
