package com.google.android.libraries.places.internal;

final class zzqo extends zzqm {
    private final byte[] zza;
    private final boolean zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;

    private zzqo(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.zzg = Integer.MAX_VALUE;
        this.zza = bArr;
        this.zzc = i2 + i;
        this.zze = i;
        this.zzf = this.zze;
        this.zzb = z;
    }

    public final int zza(int i) throws zzrl {
        if (i >= 0) {
            int zza2 = i + zza();
            int i2 = this.zzg;
            if (zza2 <= i2) {
                this.zzg = zza2;
                this.zzc += this.zzd;
                int i3 = this.zzc;
                int i4 = i3 - this.zzf;
                int i5 = this.zzg;
                if (i4 > i5) {
                    this.zzd = i4 - i5;
                    this.zzc = i3 - this.zzd;
                } else {
                    this.zzd = 0;
                }
                return i2;
            }
            throw new zzrl("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new zzrl("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public final int zza() {
        return this.zze - this.zzf;
    }
}
