package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class zzah extends zzj {
    public static final Creator<zzah> CREATOR = new zzak();

    zzah(int i, int i2) {
        super(i, i2);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(getHours());
        parcel.writeInt(getMinutes());
    }
}
