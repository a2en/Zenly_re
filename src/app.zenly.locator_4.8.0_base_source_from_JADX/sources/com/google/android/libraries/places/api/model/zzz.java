package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

final class zzz extends zzd {
    public static final Creator<zzz> CREATOR = new zzac();

    zzz(List<AddressComponent> list) {
        super(list);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(asList());
    }
}
