package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;

class zzhs extends zzho {
    final zzhn zza;
    private final Character zzb;

    zzhs(String str, String str2, Character ch) {
        this(new zzhn(str, str2.toCharArray()), ch);
    }

    public boolean equals(Object obj) {
        if (obj instanceof zzhs) {
            zzhs zzhs = (zzhs) obj;
            if (this.zza.equals(zzhs.zza) && zzgd.zza(this.zzb, zzhs.zzb)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.zza.hashCode() ^ Arrays.hashCode(new Object[]{this.zzb});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        sb.append(this.zza.toString());
        if (8 % this.zza.zzb != 0) {
            if (this.zzb == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(this.zzb);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    public final int zza(int i) {
        zzhn zzhn = this.zza;
        return zzhn.zzc * zzpq.zza(i, zzhn.zzd, RoundingMode.CEILING);
    }

    /* access modifiers changed from: 0000 */
    public final void zzb(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        zzgg.zza(appendable);
        zzgg.zza(i, i + i2, bArr.length);
        int i3 = 0;
        zzgg.zza(i2 <= this.zza.zzd);
        long j = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            j = (j | ((long) (bArr[i + i4] & 255))) << 8;
        }
        int i5 = ((i2 + 1) << 3) - this.zza.zzb;
        while (i3 < (i2 << 3)) {
            int i6 = (int) (j >>> (i5 - i3));
            zzhn zzhn = this.zza;
            appendable.append(zzhn.zza(i6 & zzhn.zza));
            i3 += this.zza.zzb;
        }
        if (this.zzb != null) {
            while (i3 < (this.zza.zzd << 3)) {
                appendable.append(this.zzb.charValue());
                i3 += this.zza.zzb;
            }
        }
    }

    zzhs(zzhn zzhn, Character ch) {
        this.zza = (zzhn) zzgg.zza(zzhn);
        if (ch == null || !zzhn.zza(ch.charValue())) {
            this.zzb = ch;
            return;
        }
        throw new IllegalArgumentException(zzgl.zza("Padding character %s was already in alphabet", ch));
    }

    /* access modifiers changed from: 0000 */
    public void zza(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        zzgg.zza(appendable);
        int i3 = 0;
        zzgg.zza(0, i2 + 0, bArr.length);
        while (i3 < i2) {
            zzb(appendable, bArr, i3 + 0, Math.min(this.zza.zzd, i2 - i3));
            i3 += this.zza.zzd;
        }
    }
}
