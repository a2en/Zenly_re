package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.libraries.places.api.model.Place.Field;

final class zzbc implements Creator<Field> {
    zzbc() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return Field.valueOf(parcel.readString());
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Field[i];
    }
}
