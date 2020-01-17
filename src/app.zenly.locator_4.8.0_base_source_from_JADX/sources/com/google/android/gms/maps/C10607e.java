package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;

/* renamed from: com.google.android.gms.maps.e */
public final class C10607e implements Creator<GoogleMapOptions> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = SafeParcelReader.m25542b(parcel);
        CameraPosition cameraPosition = null;
        Float f = null;
        Float f2 = null;
        LatLngBounds latLngBounds = null;
        byte b2 = -1;
        byte b3 = -1;
        int i = 0;
        byte b4 = -1;
        byte b5 = -1;
        byte b6 = -1;
        byte b7 = -1;
        byte b8 = -1;
        byte b9 = -1;
        byte b10 = -1;
        byte b11 = -1;
        byte b12 = -1;
        byte b13 = -1;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m25536a(parcel);
            switch (SafeParcelReader.m25535a(a)) {
                case 2:
                    b2 = SafeParcelReader.m25563t(parcel2, a);
                    break;
                case 3:
                    b3 = SafeParcelReader.m25563t(parcel2, a);
                    break;
                case 4:
                    i = SafeParcelReader.m25568y(parcel2, a);
                    break;
                case 5:
                    cameraPosition = (CameraPosition) SafeParcelReader.m25537a(parcel2, a, CameraPosition.CREATOR);
                    break;
                case 6:
                    b4 = SafeParcelReader.m25563t(parcel2, a);
                    break;
                case 7:
                    b5 = SafeParcelReader.m25563t(parcel2, a);
                    break;
                case 8:
                    b6 = SafeParcelReader.m25563t(parcel2, a);
                    break;
                case 9:
                    b7 = SafeParcelReader.m25563t(parcel2, a);
                    break;
                case 10:
                    b8 = SafeParcelReader.m25563t(parcel2, a);
                    break;
                case 11:
                    b9 = SafeParcelReader.m25563t(parcel2, a);
                    break;
                case 12:
                    b10 = SafeParcelReader.m25563t(parcel2, a);
                    break;
                case 14:
                    b11 = SafeParcelReader.m25563t(parcel2, a);
                    break;
                case 15:
                    b12 = SafeParcelReader.m25563t(parcel2, a);
                    break;
                case 16:
                    f = SafeParcelReader.m25566w(parcel2, a);
                    break;
                case 17:
                    f2 = SafeParcelReader.m25566w(parcel2, a);
                    break;
                case 18:
                    latLngBounds = (LatLngBounds) SafeParcelReader.m25537a(parcel2, a, LatLngBounds.CREATOR);
                    break;
                case 19:
                    b13 = SafeParcelReader.m25563t(parcel2, a);
                    break;
                default:
                    SafeParcelReader.m25534D(parcel2, a);
                    break;
            }
        }
        SafeParcelReader.m25561r(parcel2, b);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions(b2, b3, i, cameraPosition, b4, b5, b6, b7, b8, b9, b10, b11, b12, f, f2, latLngBounds, b13);
        return googleMapOptions;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleMapOptions[i];
    }
}
