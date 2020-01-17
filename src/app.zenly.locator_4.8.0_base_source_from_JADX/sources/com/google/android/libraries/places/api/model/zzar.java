package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class zzar extends zzt {
    public static final Creator<zzar> CREATOR = new zzau();

    zzar(Place place, double d) {
        super(place, d);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(getPlace(), i);
        parcel.writeDouble(getLikelihood());
    }
}
