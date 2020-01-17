package com.google.android.libraries.places.api.net;

import com.google.android.libraries.places.api.model.Place;

final class zzi extends FetchPlaceResponse {
    private final Place zza;

    zzi(Place place) {
        if (place != null) {
            this.zza = place;
            return;
        }
        throw new NullPointerException("Null place");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FetchPlaceResponse)) {
            return false;
        }
        return this.zza.equals(((FetchPlaceResponse) obj).getPlace());
    }

    public final Place getPlace() {
        return this.zza;
    }

    public final int hashCode() {
        return this.zza.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
        sb.append("FetchPlaceResponse{place=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
