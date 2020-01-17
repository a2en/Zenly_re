package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.libraries.places.api.model.Place.Type;

final class zzbd implements Creator<Type> {
    zzbd() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return Type.valueOf(parcel.readString());
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Type[i];
    }
}
