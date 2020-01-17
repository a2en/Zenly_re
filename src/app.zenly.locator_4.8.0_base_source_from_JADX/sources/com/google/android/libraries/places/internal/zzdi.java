package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.Place.Field;
import com.google.android.libraries.places.api.model.TypeFilter;

final class zzdi extends zzeq {
    private final zzgv<Field> zza;
    private final LocationBias zzb;
    private final LocationRestriction zzc;
    private final String zzd;
    private final TypeFilter zze;

    private zzdi(zzgv<Field> zzgv, LocationBias locationBias, LocationRestriction locationRestriction, String str, TypeFilter typeFilter) {
        this.zza = zzgv;
        this.zzb = locationBias;
        this.zzc = locationRestriction;
        this.zzd = str;
        this.zze = typeFilter;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzeq) {
            zzeq zzeq = (zzeq) obj;
            if (this.zza.equals(zzeq.zza())) {
                LocationBias locationBias = this.zzb;
                if (locationBias != null ? locationBias.equals(zzeq.zzb()) : zzeq.zzb() == null) {
                    LocationRestriction locationRestriction = this.zzc;
                    if (locationRestriction != null ? locationRestriction.equals(zzeq.zzc()) : zzeq.zzc() == null) {
                        String str = this.zzd;
                        if (str != null ? str.equals(zzeq.zzd()) : zzeq.zzd() == null) {
                            TypeFilter typeFilter = this.zze;
                            return typeFilter != null ? typeFilter.equals(zzeq.zze()) : zzeq.zze() == null;
                        }
                    }
                }
            }
        }
    }

    public final int hashCode() {
        int hashCode = (this.zza.hashCode() ^ 1000003) * 1000003;
        LocationBias locationBias = this.zzb;
        int i = 0;
        int hashCode2 = (hashCode ^ (locationBias == null ? 0 : locationBias.hashCode())) * 1000003;
        LocationRestriction locationRestriction = this.zzc;
        int hashCode3 = (hashCode2 ^ (locationRestriction == null ? 0 : locationRestriction.hashCode())) * 1000003;
        String str = this.zzd;
        int hashCode4 = (hashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        TypeFilter typeFilter = this.zze;
        if (typeFilter != null) {
            i = typeFilter.hashCode();
        }
        return hashCode4 ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        String valueOf2 = String.valueOf(this.zzb);
        String valueOf3 = String.valueOf(this.zzc);
        String str = this.zzd;
        String valueOf4 = String.valueOf(this.zze);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 93 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length() + String.valueOf(str).length() + String.valueOf(valueOf4).length());
        sb.append("AutocompleteOptions{placeFields=");
        sb.append(valueOf);
        sb.append(", locationBias=");
        sb.append(valueOf2);
        sb.append(", locationRestriction=");
        sb.append(valueOf3);
        sb.append(", country=");
        sb.append(str);
        sb.append(", typeFilter=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }

    public final zzgv<Field> zza() {
        return this.zza;
    }

    public final LocationBias zzb() {
        return this.zzb;
    }

    public final LocationRestriction zzc() {
        return this.zzc;
    }

    public final String zzd() {
        return this.zzd;
    }

    public final TypeFilter zze() {
        return this.zze;
    }
}
