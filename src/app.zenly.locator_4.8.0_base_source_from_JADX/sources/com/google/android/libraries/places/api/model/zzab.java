package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.libraries.places.api.model.AutocompletePrediction.zza;
import com.google.android.libraries.places.api.model.Place.Type;
import java.util.List;

final class zzab extends zzc {
    public static final Creator<zzab> CREATOR = new zzae();

    zzab(String str, List<Type> list, String str2, String str3, String str4, List<zza> list2, List<zza> list3, List<zza> list4) {
        super(str, list, str2, str3, str4, list2, list3, list4);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(getPlaceId());
        parcel.writeList(getPlaceTypes());
        parcel.writeString(zza());
        parcel.writeString(zzb());
        parcel.writeString(zzc());
        parcel.writeList(zzd());
        parcel.writeList(zze());
        parcel.writeList(zzf());
    }
}
