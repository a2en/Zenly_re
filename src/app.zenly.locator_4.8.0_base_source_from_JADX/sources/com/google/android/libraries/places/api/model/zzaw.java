package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class zzaw implements Creator<zzat> {
    zzaw() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        String str = null;
        String readString = parcel.readInt() == 0 ? parcel.readString() : null;
        if (parcel.readInt() == 0) {
            str = parcel.readString();
        }
        return new zzat(readString, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzat[i];
    }
}
