package com.google.android.libraries.places.api.net;

import com.google.android.gms.tasks.C10689a;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.TypeFilter;

final class zzh extends FindAutocompletePredictionsRequest {
    private final String zza;
    private final LocationBias zzb;
    private final LocationRestriction zzc;
    private final String zzd;
    private final AutocompleteSessionToken zze;
    private final TypeFilter zzf;
    private final C10689a zzg;

    private zzh(String str, LocationBias locationBias, LocationRestriction locationRestriction, String str2, AutocompleteSessionToken autocompleteSessionToken, TypeFilter typeFilter, C10689a aVar) {
        this.zza = str;
        this.zzb = locationBias;
        this.zzc = locationRestriction;
        this.zzd = str2;
        this.zze = autocompleteSessionToken;
        this.zzf = typeFilter;
        this.zzg = aVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FindAutocompletePredictionsRequest) {
            FindAutocompletePredictionsRequest findAutocompletePredictionsRequest = (FindAutocompletePredictionsRequest) obj;
            String str = this.zza;
            if (str != null ? str.equals(findAutocompletePredictionsRequest.getQuery()) : findAutocompletePredictionsRequest.getQuery() == null) {
                LocationBias locationBias = this.zzb;
                if (locationBias != null ? locationBias.equals(findAutocompletePredictionsRequest.getLocationBias()) : findAutocompletePredictionsRequest.getLocationBias() == null) {
                    LocationRestriction locationRestriction = this.zzc;
                    if (locationRestriction != null ? locationRestriction.equals(findAutocompletePredictionsRequest.getLocationRestriction()) : findAutocompletePredictionsRequest.getLocationRestriction() == null) {
                        String str2 = this.zzd;
                        if (str2 != null ? str2.equals(findAutocompletePredictionsRequest.getCountry()) : findAutocompletePredictionsRequest.getCountry() == null) {
                            AutocompleteSessionToken autocompleteSessionToken = this.zze;
                            if (autocompleteSessionToken != null ? autocompleteSessionToken.equals(findAutocompletePredictionsRequest.getSessionToken()) : findAutocompletePredictionsRequest.getSessionToken() == null) {
                                TypeFilter typeFilter = this.zzf;
                                if (typeFilter != null ? typeFilter.equals(findAutocompletePredictionsRequest.getTypeFilter()) : findAutocompletePredictionsRequest.getTypeFilter() == null) {
                                    C10689a aVar = this.zzg;
                                    return aVar != null ? aVar.equals(findAutocompletePredictionsRequest.getCancellationToken()) : findAutocompletePredictionsRequest.getCancellationToken() == null;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final C10689a getCancellationToken() {
        return this.zzg;
    }

    public final String getCountry() {
        return this.zzd;
    }

    public final LocationBias getLocationBias() {
        return this.zzb;
    }

    public final LocationRestriction getLocationRestriction() {
        return this.zzc;
    }

    public final String getQuery() {
        return this.zza;
    }

    public final AutocompleteSessionToken getSessionToken() {
        return this.zze;
    }

    public final TypeFilter getTypeFilter() {
        return this.zzf;
    }

    public final int hashCode() {
        String str = this.zza;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        LocationBias locationBias = this.zzb;
        int hashCode2 = (hashCode ^ (locationBias == null ? 0 : locationBias.hashCode())) * 1000003;
        LocationRestriction locationRestriction = this.zzc;
        int hashCode3 = (hashCode2 ^ (locationRestriction == null ? 0 : locationRestriction.hashCode())) * 1000003;
        String str2 = this.zzd;
        int hashCode4 = (hashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        AutocompleteSessionToken autocompleteSessionToken = this.zze;
        int hashCode5 = (hashCode4 ^ (autocompleteSessionToken == null ? 0 : autocompleteSessionToken.hashCode())) * 1000003;
        TypeFilter typeFilter = this.zzf;
        int hashCode6 = (hashCode5 ^ (typeFilter == null ? 0 : typeFilter.hashCode())) * 1000003;
        C10689a aVar = this.zzg;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode6 ^ i;
    }

    public final String toString() {
        String str = this.zza;
        String valueOf = String.valueOf(this.zzb);
        String valueOf2 = String.valueOf(this.zzc);
        String str2 = this.zzd;
        String valueOf3 = String.valueOf(this.zze);
        String valueOf4 = String.valueOf(this.zzf);
        String valueOf5 = String.valueOf(this.zzg);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 137 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length() + String.valueOf(str2).length() + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("FindAutocompletePredictionsRequest{query=");
        sb.append(str);
        sb.append(", locationBias=");
        sb.append(valueOf);
        sb.append(", locationRestriction=");
        sb.append(valueOf2);
        sb.append(", country=");
        sb.append(str2);
        sb.append(", sessionToken=");
        sb.append(valueOf3);
        sb.append(", typeFilter=");
        sb.append(valueOf4);
        sb.append(", cancellationToken=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }
}
