package com.google.android.libraries.places.internal;

import java.io.IOException;

final class zzhp extends zzhs {
    zzhp(String str, String str2, Character ch) {
        this(new zzhn(str, str2.toCharArray()), ch);
    }

    /* access modifiers changed from: 0000 */
    public final void zza(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        zzgg.zza(appendable);
        int i3 = i2 + 0;
        int i4 = 0;
        zzgg.zza(0, i3, bArr.length);
        while (i2 >= 3) {
            int i5 = i4 + 1;
            int i6 = i5 + 1;
            byte b = ((bArr[i5] & 255) << 8) | ((bArr[i4] & 255) << 16);
            i4 = i6 + 1;
            byte b2 = b | (bArr[i6] & 255);
            appendable.append(this.zza.zza(b2 >>> 18));
            appendable.append(this.zza.zza((b2 >>> 12) & 63));
            appendable.append(this.zza.zza((b2 >>> 6) & 63));
            appendable.append(this.zza.zza((int) b2 & 63));
            i2 -= 3;
        }
        if (i4 < i3) {
            zzb(appendable, bArr, i4, i3 - i4);
        }
    }

    private zzhp(zzhn zzhn, Character ch) {
        super(zzhn, ch);
        zzgg.zza(zzhn.zzf.length == 64);
    }
}
