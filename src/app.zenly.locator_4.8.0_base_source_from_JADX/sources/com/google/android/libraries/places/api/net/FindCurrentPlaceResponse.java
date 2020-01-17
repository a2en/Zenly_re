package com.google.android.libraries.places.api.net;

import com.google.android.libraries.places.api.model.PlaceLikelihood;
import com.google.android.libraries.places.internal.zzgv;
import java.util.Collection;
import java.util.List;

public abstract class FindCurrentPlaceResponse {
    public static FindCurrentPlaceResponse newInstance(List<PlaceLikelihood> list) {
        return new zzp(zzgv.zza((Collection<? extends E>) list));
    }

    public abstract List<PlaceLikelihood> getPlaceLikelihoods();
}
