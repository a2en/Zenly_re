package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class zzau implements Creator<zzar> {
    zzau() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new zzar((Place) parcel.readParcelable(Place.class.getClassLoader()), parcel.readDouble());
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzar[i];
    }
}
