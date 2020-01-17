package com.google.android.libraries.places.api.model;

import com.google.android.libraries.places.api.model.AutocompletePrediction.Builder;
import com.google.android.libraries.places.api.model.AutocompletePrediction.zza;
import com.google.android.libraries.places.api.model.Place.Type;
import java.util.List;

final class zzf extends Builder {
    private String zza;
    private List<Type> zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private List<zza> zzf;
    private List<zza> zzg;
    private List<zza> zzh;

    zzf() {
    }

    public final Builder setFullText(String str) {
        if (str != null) {
            this.zzc = str;
            return this;
        }
        throw new NullPointerException("Null fullText");
    }

    public final Builder setPlaceTypes(List<Type> list) {
        if (list != null) {
            this.zzb = list;
            return this;
        }
        throw new NullPointerException("Null placeTypes");
    }

    public final Builder setPrimaryText(String str) {
        if (str != null) {
            this.zzd = str;
            return this;
        }
        throw new NullPointerException("Null primaryText");
    }

    public final Builder setSecondaryText(String str) {
        if (str != null) {
            this.zze = str;
            return this;
        }
        throw new NullPointerException("Null secondaryText");
    }

    /* access modifiers changed from: 0000 */
    public final Builder zza(String str) {
        if (str != null) {
            this.zza = str;
            return this;
        }
        throw new NullPointerException("Null placeId");
    }

    public final Builder zzb(List<zza> list) {
        this.zzg = list;
        return this;
    }

    public final Builder zzc(List<zza> list) {
        this.zzh = list;
        return this;
    }

    public final Builder zza(List<zza> list) {
        this.zzf = list;
        return this;
    }

    /* access modifiers changed from: 0000 */
    public final AutocompletePrediction zza() {
        String str = "";
        if (this.zza == null) {
            str = str.concat(" placeId");
        }
        if (this.zzb == null) {
            str = String.valueOf(str).concat(" placeTypes");
        }
        if (this.zzc == null) {
            str = String.valueOf(str).concat(" fullText");
        }
        if (this.zzd == null) {
            str = String.valueOf(str).concat(" primaryText");
        }
        if (this.zze == null) {
            str = String.valueOf(str).concat(" secondaryText");
        }
        if (!str.isEmpty()) {
            String str2 = "Missing required properties:";
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
        zzab zzab = new zzab(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh);
        return zzab;
    }
}
