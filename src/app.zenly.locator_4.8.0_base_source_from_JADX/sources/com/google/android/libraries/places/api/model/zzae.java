package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.libraries.places.api.model.AutocompletePrediction.zza;
import com.google.android.libraries.places.api.model.Place.Type;

final class zzae implements Creator<zzab> {
    zzae() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        zzab zzab = new zzab(parcel.readString(), parcel.readArrayList(Type.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readArrayList(zza.class.getClassLoader()), parcel.readArrayList(zza.class.getClassLoader()), parcel.readArrayList(zza.class.getClassLoader()));
        return zzab;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzab[i];
    }
}
