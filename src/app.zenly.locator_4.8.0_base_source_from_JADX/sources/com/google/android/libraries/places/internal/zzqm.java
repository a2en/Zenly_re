package com.google.android.libraries.places.internal;

public abstract class zzqm {
    private int zza;
    private int zzb;
    private boolean zzc;

    private zzqm() {
        this.zza = 100;
        this.zzb = Integer.MAX_VALUE;
        this.zzc = false;
    }

    static zzqm zza(byte[] bArr, int i, int i2, boolean z) {
        zzqo zzqo = new zzqo(bArr, 0, i2, false);
        try {
            zzqo.zza(i2);
            return zzqo;
        } catch (zzrl e) {
            throw new IllegalArgumentException(e);
        }
    }

    public abstract int zza();

    public abstract int zza(int i) throws zzrl;
}
