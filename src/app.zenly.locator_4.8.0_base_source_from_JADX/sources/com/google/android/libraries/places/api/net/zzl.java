package com.google.android.libraries.places.api.net;

import com.google.android.gms.tasks.C10689a;
import com.google.android.libraries.places.api.model.Place.Field;
import java.util.List;

final class zzl extends FindCurrentPlaceRequest {
    private final List<Field> zza;
    private final C10689a zzb;

    private zzl(List<Field> list, C10689a aVar) {
        this.zza = list;
        this.zzb = aVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FindCurrentPlaceRequest) {
            FindCurrentPlaceRequest findCurrentPlaceRequest = (FindCurrentPlaceRequest) obj;
            if (this.zza.equals(findCurrentPlaceRequest.getPlaceFields())) {
                C10689a aVar = this.zzb;
                return aVar != null ? aVar.equals(findCurrentPlaceRequest.getCancellationToken()) : findCurrentPlaceRequest.getCancellationToken() == null;
            }
        }
    }

    public final C10689a getCancellationToken() {
        return this.zzb;
    }

    public final List<Field> getPlaceFields() {
        return this.zza;
    }

    public final int hashCode() {
        int hashCode = (this.zza.hashCode() ^ 1000003) * 1000003;
        C10689a aVar = this.zzb;
        return hashCode ^ (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        String valueOf2 = String.valueOf(this.zzb);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 57 + String.valueOf(valueOf2).length());
        sb.append("FindCurrentPlaceRequest{placeFields=");
        sb.append(valueOf);
        sb.append(", cancellationToken=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
