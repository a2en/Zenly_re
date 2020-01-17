package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

final class zzy extends zzb {
    public static final Creator<zzy> CREATOR = new zzaa();

    zzy(String str, String str2, List<String> list) {
        super(str, str2, list);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(getName());
        if (getShortName() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getShortName());
        }
        parcel.writeList(getTypes());
    }
}
