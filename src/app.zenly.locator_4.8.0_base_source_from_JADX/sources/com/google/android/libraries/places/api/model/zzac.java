package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class zzac implements Creator<zzz> {
    zzac() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new zzz(parcel.readArrayList(AddressComponent.class.getClassLoader()));
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzz[i];
    }
}
