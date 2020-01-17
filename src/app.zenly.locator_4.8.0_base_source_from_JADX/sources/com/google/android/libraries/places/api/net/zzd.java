package com.google.android.libraries.places.api.net;

import com.google.android.gms.tasks.C10689a;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.Place.Field;
import java.util.List;

final class zzd extends FetchPlaceRequest {
    private final String zza;
    private final List<Field> zzb;
    private final AutocompleteSessionToken zzc;
    private final C10689a zzd;

    private zzd(String str, List<Field> list, AutocompleteSessionToken autocompleteSessionToken, C10689a aVar) {
        this.zza = str;
        this.zzb = list;
        this.zzc = autocompleteSessionToken;
        this.zzd = aVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FetchPlaceRequest) {
            FetchPlaceRequest fetchPlaceRequest = (FetchPlaceRequest) obj;
            if (this.zza.equals(fetchPlaceRequest.getPlaceId()) && this.zzb.equals(fetchPlaceRequest.getPlaceFields())) {
                AutocompleteSessionToken autocompleteSessionToken = this.zzc;
                if (autocompleteSessionToken != null ? autocompleteSessionToken.equals(fetchPlaceRequest.getSessionToken()) : fetchPlaceRequest.getSessionToken() == null) {
                    C10689a aVar = this.zzd;
                    return aVar != null ? aVar.equals(fetchPlaceRequest.getCancellationToken()) : fetchPlaceRequest.getCancellationToken() == null;
                }
            }
        }
    }

    public final C10689a getCancellationToken() {
        return this.zzd;
    }

    public final List<Field> getPlaceFields() {
        return this.zzb;
    }

    public final String getPlaceId() {
        return this.zza;
    }

    public final AutocompleteSessionToken getSessionToken() {
        return this.zzc;
    }

    public final int hashCode() {
        int hashCode = (((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode()) * 1000003;
        AutocompleteSessionToken autocompleteSessionToken = this.zzc;
        int i = 0;
        int hashCode2 = (hashCode ^ (autocompleteSessionToken == null ? 0 : autocompleteSessionToken.hashCode())) * 1000003;
        C10689a aVar = this.zzd;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode2 ^ i;
    }

    public final String toString() {
        String str = this.zza;
        String valueOf = String.valueOf(this.zzb);
        String valueOf2 = String.valueOf(this.zzc);
        String valueOf3 = String.valueOf(this.zzd);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 76 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("FetchPlaceRequest{placeId=");
        sb.append(str);
        sb.append(", placeFields=");
        sb.append(valueOf);
        sb.append(", sessionToken=");
        sb.append(valueOf2);
        sb.append(", cancellationToken=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
