package com.google.android.libraries.places.internal;

final class zzqd extends zzqk {
    private final int zzc;
    private final int zzd;

    zzqd(byte[] bArr, int i, int i2) {
        super(bArr);
        zzqa.zzb(i, i + i2, bArr.length);
        this.zzc = i;
        this.zzd = i2;
    }

    public final byte zza(int i) {
        int zza = zza();
        if (((zza - (i + 1)) | i) >= 0) {
            return this.zzb[this.zzc + i];
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(22);
            sb.append("Index < 0: ");
            sb.append(i);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Index > length: ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(zza);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    /* access modifiers changed from: 0000 */
    public final byte zzb(int i) {
        return this.zzb[this.zzc + i];
    }

    /* access modifiers changed from: protected */
    public final int zze() {
        return this.zzc;
    }

    public final int zza() {
        return this.zzd;
    }
}
