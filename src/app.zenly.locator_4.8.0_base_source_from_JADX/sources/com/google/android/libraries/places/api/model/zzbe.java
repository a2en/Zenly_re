package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class zzbe implements Creator<TypeFilter> {
    zzbe() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return TypeFilter.valueOf(parcel.readString());
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new TypeFilter[i];
    }
}
