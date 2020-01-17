package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class zzaq implements Creator<zzan> {
    zzaq() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new zzan(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString());
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzan[i];
    }
}
