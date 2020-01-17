package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.internal.zzrb.zzc;

final class zzta implements zzsk {
    private final zzsm zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    zzta(zzsm zzsm, String str, Object[] objArr) {
        this.zza = zzsm;
        this.zzb = str;
        this.zzc = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.zzd = charAt;
            return;
        }
        char c = charAt & 8191;
        int i = 13;
        int i2 = 1;
        while (true) {
            int i3 = i2 + 1;
            char charAt2 = str.charAt(i2);
            if (charAt2 >= 55296) {
                c |= (charAt2 & 8191) << i;
                i += 13;
                i2 = i3;
            } else {
                this.zzd = c | (charAt2 << i);
                return;
            }
        }
    }

    public final int zza() {
        return (this.zzd & 1) == 1 ? zzc.zzh : zzc.zzi;
    }

    public final boolean zzb() {
        return (this.zzd & 2) == 2;
    }

    public final zzsm zzc() {
        return this.zza;
    }

    /* access modifiers changed from: 0000 */
    public final String zzd() {
        return this.zzb;
    }

    /* access modifiers changed from: 0000 */
    public final Object[] zze() {
        return this.zzc;
    }
}
