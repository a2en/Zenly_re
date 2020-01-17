package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class zzag implements Creator<zzad> {
    zzag() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new zzad(parcel.readInt(), parcel.readInt());
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzad[i];
    }
}
