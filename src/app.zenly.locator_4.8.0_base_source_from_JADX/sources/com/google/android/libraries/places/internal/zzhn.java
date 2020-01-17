package com.google.android.libraries.places.internal;

import java.math.RoundingMode;
import java.util.Arrays;

final class zzhn {
    final int zza;
    final int zzb;
    final int zzc;
    final int zzd;
    private final String zze;
    /* access modifiers changed from: private */
    public final char[] zzf;
    private final byte[] zzg;
    private final boolean[] zzh;

    zzhn(String str, char[] cArr) {
        this.zze = (String) zzgg.zza(str);
        this.zzf = (char[]) zzgg.zza(cArr);
        try {
            this.zzb = zzpq.zza(cArr.length, RoundingMode.UNNECESSARY);
            int min = Math.min(8, Integer.lowestOneBit(this.zzb));
            try {
                this.zzc = 8 / min;
                this.zzd = this.zzb / min;
                this.zza = cArr.length - 1;
                byte[] bArr = new byte[128];
                Arrays.fill(bArr, -1);
                for (int i = 0; i < cArr.length; i++) {
                    char c = cArr[i];
                    zzgg.zza(c < 128, "Non-ASCII character: %s", c);
                    zzgg.zza(bArr[c] == -1, "Duplicate character: %s", c);
                    bArr[c] = (byte) i;
                }
                this.zzg = bArr;
                boolean[] zArr = new boolean[this.zzc];
                for (int i2 = 0; i2 < this.zzd; i2++) {
                    zArr[zzpq.zza(i2 << 3, this.zzb, RoundingMode.CEILING)] = true;
                }
                this.zzh = zArr;
            } catch (ArithmeticException e) {
                String str2 = "Illegal alphabet ";
                String str3 = new String(cArr);
                throw new IllegalArgumentException(str3.length() != 0 ? str2.concat(str3) : new String(str2), e);
            }
        } catch (ArithmeticException e2) {
            int length = cArr.length;
            StringBuilder sb = new StringBuilder(35);
            sb.append("Illegal alphabet length ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString(), e2);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhn)) {
            return false;
        }
        return Arrays.equals(this.zzf, ((zzhn) obj).zzf);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zzf);
    }

    public final String toString() {
        return this.zze;
    }

    /* access modifiers changed from: 0000 */
    public final char zza(int i) {
        return this.zzf[i];
    }

    public final boolean zza(char c) {
        byte[] bArr = this.zzg;
        return c < bArr.length && bArr[c] != -1;
    }
}
