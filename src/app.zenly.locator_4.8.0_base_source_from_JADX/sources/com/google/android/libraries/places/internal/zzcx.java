package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.internal.zzdb.zza;
import com.google.android.libraries.places.internal.zzdb.zzb;

final class zzcx extends zza {
    private String zza;
    private Integer zzb;
    private zzb zzc;

    zzcx() {
    }

    /* access modifiers changed from: 0000 */
    public final zza zza(String str) {
        if (str != null) {
            this.zza = str;
            return this;
        }
        throw new NullPointerException("Null packageName");
    }

    /* access modifiers changed from: 0000 */
    public final zza zza(int i) {
        this.zzb = Integer.valueOf(i);
        return this;
    }

    public final zza zza(zzb zzb2) {
        if (zzb2 != null) {
            this.zzc = zzb2;
            return this;
        }
        throw new NullPointerException("Null requestSource");
    }

    /* access modifiers changed from: 0000 */
    public final zzdb zza() {
        String str = "";
        if (this.zza == null) {
            str = str.concat(" packageName");
        }
        if (this.zzb == null) {
            str = String.valueOf(str).concat(" versionCode");
        }
        if (this.zzc == null) {
            str = String.valueOf(str).concat(" requestSource");
        }
        if (str.isEmpty()) {
            return new zzcv(this.zza, this.zzb.intValue(), this.zzc);
        }
        String str2 = "Missing required properties:";
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
    }
}
