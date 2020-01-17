package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class zzad extends zze {
    public static final Creator<zzad> CREATOR = new zzag();

    zzad(int i, int i2) {
        super(i, i2);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(zza());
        parcel.writeInt(zzb());
    }
}
