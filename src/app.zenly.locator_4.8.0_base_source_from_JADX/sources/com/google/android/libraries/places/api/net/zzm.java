package com.google.android.libraries.places.api.net;

import com.google.android.libraries.places.api.model.AutocompletePrediction;
import java.util.List;

final class zzm extends FindAutocompletePredictionsResponse {
    private final List<AutocompletePrediction> zza;

    zzm(List<AutocompletePrediction> list) {
        if (list != null) {
            this.zza = list;
            return;
        }
        throw new NullPointerException("Null autocompletePredictions");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FindAutocompletePredictionsResponse)) {
            return false;
        }
        return this.zza.equals(((FindAutocompletePredictionsResponse) obj).getAutocompletePredictions());
    }

    public final List<AutocompletePrediction> getAutocompletePredictions() {
        return this.zza;
    }

    public final int hashCode() {
        return this.zza.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 61);
        sb.append("FindAutocompletePredictionsResponse{autocompletePredictions=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
