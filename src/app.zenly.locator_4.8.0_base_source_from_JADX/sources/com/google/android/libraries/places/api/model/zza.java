package com.google.android.libraries.places.api.model;

import com.google.android.libraries.places.api.model.AddressComponent.Builder;
import java.util.List;

final class zza extends Builder {
    private String zza;
    private String zzb;
    private List<String> zzc;

    zza() {
    }

    public final Builder setShortName(String str) {
        this.zzb = str;
        return this;
    }

    /* access modifiers changed from: 0000 */
    public final Builder zza(String str) {
        if (str != null) {
            this.zza = str;
            return this;
        }
        throw new NullPointerException("Null name");
    }

    /* access modifiers changed from: 0000 */
    public final Builder zza(List<String> list) {
        if (list != null) {
            this.zzc = list;
            return this;
        }
        throw new NullPointerException("Null types");
    }

    /* access modifiers changed from: 0000 */
    public final AddressComponent zza() {
        String str = "";
        if (this.zza == null) {
            str = str.concat(" name");
        }
        if (this.zzc == null) {
            str = String.valueOf(str).concat(" types");
        }
        if (str.isEmpty()) {
            return new zzy(this.zza, this.zzb, this.zzc);
        }
        String str2 = "Missing required properties:";
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
    }
}
