package com.google.android.libraries.places.api.net;

import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.internal.zzgv;
import java.util.Collection;
import java.util.List;

public abstract class FindAutocompletePredictionsResponse {
    public static FindAutocompletePredictionsResponse newInstance(List<AutocompletePrediction> list) {
        return new zzm(zzgv.zza((Collection<? extends E>) list));
    }

    public abstract List<AutocompletePrediction> getAutocompletePredictions();
}
