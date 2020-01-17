package com.google.android.libraries.places.api.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.libraries.places.api.model.Place.Type;

final class zzas implements Creator<zzap> {
    zzas() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        zzap zzap = new zzap(parcel.readInt() == 0 ? parcel.readString() : null, (AddressComponents) parcel2.readParcelable(AddressComponents.class.getClassLoader()), parcel2.readArrayList(String.class.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null, (LatLng) parcel2.readParcelable(LatLng.class.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null, (OpeningHours) parcel2.readParcelable(OpeningHours.class.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null, parcel2.readArrayList(PhotoMetadata.class.getClassLoader()), (PlusCode) parcel2.readParcelable(PlusCode.class.getClassLoader()), parcel.readInt() == 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() == 0 ? Double.valueOf(parcel.readDouble()) : null, parcel2.readArrayList(Type.class.getClassLoader()), parcel.readInt() == 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() == 0 ? Integer.valueOf(parcel.readInt()) : null, (LatLngBounds) parcel2.readParcelable(LatLngBounds.class.getClassLoader()), (Uri) parcel2.readParcelable(Uri.class.getClassLoader()));
        return zzap;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzap[i];
    }
}
