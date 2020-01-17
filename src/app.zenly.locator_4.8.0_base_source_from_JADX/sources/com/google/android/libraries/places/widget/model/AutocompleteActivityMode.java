package com.google.android.libraries.places.widget.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public enum AutocompleteActivityMode implements Parcelable {
    FULLSCREEN,
    OVERLAY;
    
    public static final Creator<AutocompleteActivityMode> CREATOR = null;

    static {
        CREATOR = new zza();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
