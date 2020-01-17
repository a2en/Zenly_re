package com.google.android.libraries.places.api.net;

import com.google.android.gms.tasks.C10689a;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder;

final class zzj extends Builder {
    private String zza;
    private LocationBias zzb;
    private LocationRestriction zzc;
    private String zzd;
    private AutocompleteSessionToken zze;
    private TypeFilter zzf;
    private C10689a zzg;

    zzj() {
    }

    public final FindAutocompletePredictionsRequest build() {
        zzh zzh = new zzh(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg);
        return zzh;
    }

    public final Builder setCancellationToken(C10689a aVar) {
        this.zzg = aVar;
        return this;
    }

    public final Builder setCountry(String str) {
        this.zzd = str;
        return this;
    }

    public final Builder setLocationBias(LocationBias locationBias) {
        this.zzb = locationBias;
        return this;
    }

    public final Builder setLocationRestriction(LocationRestriction locationRestriction) {
        this.zzc = locationRestriction;
        return this;
    }

    public final Builder setQuery(String str) {
        this.zza = str;
        return this;
    }

    public final Builder setSessionToken(AutocompleteSessionToken autocompleteSessionToken) {
        this.zze = autocompleteSessionToken;
        return this;
    }

    public final Builder setTypeFilter(TypeFilter typeFilter) {
        this.zzf = typeFilter;
        return this;
    }
}
