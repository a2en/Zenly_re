package com.google.android.libraries.places.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.libraries.places.internal.zzea.zza;

final class zzee implements Creator<zza> {
    zzee() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zza.valueOf(parcel.readString());
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zza[i];
    }
}
