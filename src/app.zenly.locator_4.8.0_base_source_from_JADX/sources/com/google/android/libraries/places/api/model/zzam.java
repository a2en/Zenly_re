package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class zzam implements Creator<zzaj> {
    zzam() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new zzaj(parcel.readArrayList(Period.class.getClassLoader()), parcel.readArrayList(String.class.getClassLoader()));
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaj[i];
    }
}
