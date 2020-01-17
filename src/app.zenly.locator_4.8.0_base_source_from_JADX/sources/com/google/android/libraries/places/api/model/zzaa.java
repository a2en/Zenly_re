package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class zzaa implements Creator<zzy> {
    zzaa() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new zzy(parcel.readString(), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readArrayList(String.class.getClassLoader()));
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzy[i];
    }
}
