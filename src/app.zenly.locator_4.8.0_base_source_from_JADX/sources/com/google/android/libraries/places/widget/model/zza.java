package com.google.android.libraries.places.widget.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class zza implements Creator<AutocompleteActivityMode> {
    zza() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return AutocompleteActivityMode.valueOf(parcel.readString());
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AutocompleteActivityMode[i];
    }
}
