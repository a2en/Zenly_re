package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.maps.model.LatLng;

final class zzav extends zzu {
    public static final Creator<zzav> CREATOR = new zzay();

    zzav(LatLng latLng, LatLng latLng2) {
        super(latLng, latLng2);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(getSouthwest(), i);
        parcel.writeParcelable(getNortheast(), i);
    }
}
