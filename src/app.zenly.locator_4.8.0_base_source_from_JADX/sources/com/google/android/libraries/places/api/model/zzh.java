package com.google.android.libraries.places.api.model;

import com.google.android.libraries.places.api.model.AutocompletePrediction.zza;
import com.google.android.libraries.places.api.model.AutocompletePrediction.zza.C13837zza;

final class zzh extends C13837zza {
    private Integer zza;
    private Integer zzb;

    zzh() {
    }

    public final C13837zza zza(int i) {
        this.zza = Integer.valueOf(i);
        return this;
    }

    public final C13837zza zzb(int i) {
        this.zzb = Integer.valueOf(i);
        return this;
    }

    public final zza zza() {
        String str = "";
        if (this.zza == null) {
            str = str.concat(" offset");
        }
        if (this.zzb == null) {
            str = String.valueOf(str).concat(" length");
        }
        if (str.isEmpty()) {
            return new zzad(this.zza.intValue(), this.zzb.intValue());
        }
        String str2 = "Missing required properties:";
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
    }
}
