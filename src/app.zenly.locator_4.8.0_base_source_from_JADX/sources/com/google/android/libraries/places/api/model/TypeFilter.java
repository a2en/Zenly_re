package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public enum TypeFilter implements Parcelable {
    ADDRESS,
    CITIES,
    ESTABLISHMENT,
    GEOCODE,
    REGIONS;
    
    public static final Creator<TypeFilter> CREATOR = null;

    static {
        CREATOR = new zzbe();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
