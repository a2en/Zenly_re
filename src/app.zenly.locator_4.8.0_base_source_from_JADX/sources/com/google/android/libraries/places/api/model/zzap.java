package com.google.android.libraries.places.api.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.libraries.places.api.model.Place.Type;
import java.util.List;

final class zzap extends zzr {
    public static final Creator<zzap> CREATOR = new zzas();

    zzap(String str, AddressComponents addressComponents, List<String> list, String str2, LatLng latLng, String str3, OpeningHours openingHours, String str4, List<PhotoMetadata> list2, PlusCode plusCode, Integer num, Double d, List<Type> list3, Integer num2, Integer num3, LatLngBounds latLngBounds, Uri uri) {
        super(str, addressComponents, list, str2, latLng, str3, openingHours, str4, list2, plusCode, num, d, list3, num2, num3, latLngBounds, uri);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (getAddress() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getAddress());
        }
        parcel.writeParcelable(getAddressComponents(), i);
        parcel.writeList(getAttributions());
        if (getId() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getId());
        }
        parcel.writeParcelable(getLatLng(), i);
        if (getName() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getName());
        }
        parcel.writeParcelable(getOpeningHours(), i);
        if (getPhoneNumber() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getPhoneNumber());
        }
        parcel.writeList(getPhotoMetadatas());
        parcel.writeParcelable(getPlusCode(), i);
        if (getPriceLevel() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(getPriceLevel().intValue());
        }
        if (getRating() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeDouble(getRating().doubleValue());
        }
        parcel.writeList(getTypes());
        if (getUserRatingsTotal() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(getUserRatingsTotal().intValue());
        }
        if (getUtcOffsetMinutes() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(getUtcOffsetMinutes().intValue());
        }
        parcel.writeParcelable(getViewport(), i);
        parcel.writeParcelable(getWebsiteUri(), i);
    }
}
