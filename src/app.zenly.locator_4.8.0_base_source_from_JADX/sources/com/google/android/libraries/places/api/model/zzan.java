package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class zzan extends zzp {
    public static final Creator<zzan> CREATOR = new zzaq();

    zzan(String str, int i, int i2, String str2) {
        super(str, i, i2, str2);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(getAttributions());
        parcel.writeInt(getHeight());
        parcel.writeInt(getWidth());
        parcel.writeString(zza());
    }
}
