package com.google.android.libraries.places.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.libraries.places.internal.zzea.zza;

final class zzec implements Creator<zzea> {
    zzec() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new zzea((zza) parcel.readParcelable(zza.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzea[i];
    }
}
