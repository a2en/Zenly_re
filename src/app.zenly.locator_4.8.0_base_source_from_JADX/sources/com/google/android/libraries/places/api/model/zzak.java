package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class zzak implements Creator<zzah> {
    zzak() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new zzah(parcel.readInt(), parcel.readInt());
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzah[i];
    }
}
