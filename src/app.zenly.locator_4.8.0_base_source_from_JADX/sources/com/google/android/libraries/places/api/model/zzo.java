package com.google.android.libraries.places.api.model;

import com.google.android.libraries.places.api.model.PhotoMetadata.Builder;

final class zzo extends Builder {
    private String zza;
    private Integer zzb;
    private Integer zzc;
    private String zzd;

    zzo() {
    }

    public final Builder setAttributions(String str) {
        if (str != null) {
            this.zza = str;
            return this;
        }
        throw new NullPointerException("Null attributions");
    }

    public final Builder setHeight(int i) {
        this.zzb = Integer.valueOf(i);
        return this;
    }

    public final Builder setWidth(int i) {
        this.zzc = Integer.valueOf(i);
        return this;
    }

    /* access modifiers changed from: 0000 */
    public final Builder zza(String str) {
        if (str != null) {
            this.zzd = str;
            return this;
        }
        throw new NullPointerException("Null photoReference");
    }

    /* access modifiers changed from: 0000 */
    public final PhotoMetadata zza() {
        String str = "";
        if (this.zza == null) {
            str = str.concat(" attributions");
        }
        if (this.zzb == null) {
            str = String.valueOf(str).concat(" height");
        }
        if (this.zzc == null) {
            str = String.valueOf(str).concat(" width");
        }
        if (this.zzd == null) {
            str = String.valueOf(str).concat(" photoReference");
        }
        if (str.isEmpty()) {
            return new zzan(this.zza, this.zzb.intValue(), this.zzc.intValue(), this.zzd);
        }
        String str2 = "Missing required properties:";
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
    }
}
