package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.nio.charset.Charset;

class zzqk extends zzqh {
    protected final byte[] zzb;

    zzqk(byte[] bArr) {
        if (bArr != null) {
            this.zzb = bArr;
            return;
        }
        throw new NullPointerException();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzqa) || zza() != ((zzqa) obj).zza()) {
            return false;
        }
        if (zza() == 0) {
            return true;
        }
        if (!(obj instanceof zzqk)) {
            return obj.equals(this);
        }
        zzqk zzqk = (zzqk) obj;
        int zzd = zzd();
        int zzd2 = zzqk.zzd();
        if (zzd == 0 || zzd2 == 0 || zzd == zzd2) {
            return zza((zzqa) zzqk, 0, zza());
        }
        return false;
    }

    public byte zza(int i) {
        return this.zzb[i];
    }

    /* access modifiers changed from: 0000 */
    public byte zzb(int i) {
        return this.zzb[i];
    }

    public final boolean zzc() {
        int zze = zze();
        return zzua.zza(this.zzb, zze, zza() + zze);
    }

    /* access modifiers changed from: protected */
    public int zze() {
        return 0;
    }

    public int zza() {
        return this.zzb.length;
    }

    public final zzqa zza(int i, int i2) {
        int zzb2 = zzqa.zzb(0, i2, zza());
        if (zzb2 == 0) {
            return zzqa.zza;
        }
        return new zzqd(this.zzb, zze(), zzb2);
    }

    /* access modifiers changed from: 0000 */
    public final void zza(zzpx zzpx) throws IOException {
        zzpx.zza(this.zzb, zze(), zza());
    }

    /* access modifiers changed from: protected */
    public final String zza(Charset charset) {
        return new String(this.zzb, zze(), zza(), charset);
    }

    /* access modifiers changed from: 0000 */
    public final boolean zza(zzqa zzqa, int i, int i2) {
        if (i2 > zzqa.zza()) {
            int zza = zza();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(zza);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 > zzqa.zza()) {
            int zza2 = zzqa.zza();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(zza2);
            throw new IllegalArgumentException(sb2.toString());
        } else if (!(zzqa instanceof zzqk)) {
            return zzqa.zza(0, i2).equals(zza(0, i2));
        } else {
            zzqk zzqk = (zzqk) zzqa;
            byte[] bArr = this.zzb;
            byte[] bArr2 = zzqk.zzb;
            int zze = zze() + i2;
            int zze2 = zze();
            int zze3 = zzqk.zze();
            while (zze2 < zze) {
                if (bArr[zze2] != bArr2[zze3]) {
                    return false;
                }
                zze2++;
                zze3++;
            }
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public final int zza(int i, int i2, int i3) {
        return zzrd.zza(i, this.zzb, zze(), i3);
    }
}
