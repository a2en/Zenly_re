package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable.Creator;

final class zzaf extends zzg {
    public static final Creator<zzaf> CREATOR = new zzai();

    zzaf(ParcelUuid parcelUuid) {
        super(parcelUuid);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(zza(), i);
    }
}
