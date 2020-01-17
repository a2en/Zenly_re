package com.google.android.libraries.places.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class zzdh implements Creator<zzdf> {
    zzdh() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzdf.valueOf(parcel.readString());
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzdf[i];
    }
}
