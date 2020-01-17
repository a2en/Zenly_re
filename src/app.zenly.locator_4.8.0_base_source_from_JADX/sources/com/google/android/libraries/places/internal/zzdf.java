package com.google.android.libraries.places.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public enum zzdf implements Parcelable {
    FRAGMENT,
    INTENT;
    
    public static final Creator<zzdf> CREATOR = null;

    static {
        CREATOR = new zzdh();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
