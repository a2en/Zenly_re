package com.google.android.libraries.places.internal;

public enum zzlj implements zzrg {
    UNKNOWN_MODEL_VERSION(0),
    SIMPLE_TENSOR_FLOW_TWO_PASS_V1(1),
    DEFAULT_MODEL_V1(2),
    SIMPLE_TENSOR_FLOW_TWO_PASS_V2(3);
    
    private static final zzrf<zzlj> zze = null;
    private final int zzf;

    static {
        zze = new zzli();
    }

    private zzlj(int i) {
        this.zzf = i;
    }

    public static zzri zzb() {
        return zzlk.zza;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(zzlj.class.getName());
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
