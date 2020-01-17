package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.maps.model.LatLng;

final class zzay implements Creator<zzav> {
    zzay() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new zzav((LatLng) parcel.readParcelable(LatLng.class.getClassLoader()), (LatLng) parcel.readParcelable(LatLng.class.getClassLoader()));
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzav[i];
    }
}
