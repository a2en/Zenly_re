package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import com.google.android.libraries.places.internal.zzgl;
import com.google.android.libraries.places.internal.zzhb;

public abstract class PlaceLikelihood implements Parcelable {
    public static final double LIKELIHOOD_MAX_VALUE = 1.0d;
    public static final double LIKELIHOOD_MIN_VALUE = 0.0d;

    public static PlaceLikelihood newInstance(Place place, double d) {
        Double valueOf = Double.valueOf(0.0d);
        Double valueOf2 = Double.valueOf(1.0d);
        boolean zzb = zzhb.zza(valueOf, valueOf2).zzb(Double.valueOf(d));
        Double valueOf3 = Double.valueOf(d);
        if (zzb) {
            return new zzar(place, d);
        }
        throw new IllegalArgumentException(zzgl.zza("Likelihood must not be out-of-range: %s to %s, but was: %s.", valueOf, valueOf2, valueOf3));
    }

    public abstract double getLikelihood();

    public abstract Place getPlace();
}
