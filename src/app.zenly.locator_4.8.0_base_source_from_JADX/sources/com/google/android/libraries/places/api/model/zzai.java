package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable.Creator;

final class zzai implements Creator<zzaf> {
    zzai() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new zzaf((ParcelUuid) parcel.readParcelable(ParcelUuid.class.getClassLoader()));
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaf[i];
    }
}
