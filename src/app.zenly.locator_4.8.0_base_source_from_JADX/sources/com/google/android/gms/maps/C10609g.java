package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewSource;

/* renamed from: com.google.android.gms.maps.g */
public final class C10609g implements Creator<StreetViewPanoramaOptions> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m25542b(parcel);
        StreetViewPanoramaCamera streetViewPanoramaCamera = null;
        String str = null;
        LatLng latLng = null;
        Integer num = null;
        StreetViewSource streetViewSource = null;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        byte b5 = 0;
        byte b6 = 0;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m25536a(parcel);
            switch (SafeParcelReader.m25535a(a)) {
                case 2:
                    streetViewPanoramaCamera = (StreetViewPanoramaCamera) SafeParcelReader.m25537a(parcel, a, StreetViewPanoramaCamera.CREATOR);
                    break;
                case 3:
                    str = SafeParcelReader.m25558o(parcel, a);
                    break;
                case 4:
                    latLng = (LatLng) SafeParcelReader.m25537a(parcel, a, LatLng.CREATOR);
                    break;
                case 5:
                    num = SafeParcelReader.m25569z(parcel, a);
                    break;
                case 6:
                    b2 = SafeParcelReader.m25563t(parcel, a);
                    break;
                case 7:
                    b3 = SafeParcelReader.m25563t(parcel, a);
                    break;
                case 8:
                    b4 = SafeParcelReader.m25563t(parcel, a);
                    break;
                case 9:
                    b5 = SafeParcelReader.m25563t(parcel, a);
                    break;
                case 10:
                    b6 = SafeParcelReader.m25563t(parcel, a);
                    break;
                case 11:
                    streetViewSource = (StreetViewSource) SafeParcelReader.m25537a(parcel, a, StreetViewSource.CREATOR);
                    break;
                default:
                    SafeParcelReader.m25534D(parcel, a);
                    break;
            }
        }
        SafeParcelReader.m25561r(parcel, b);
        StreetViewPanoramaOptions streetViewPanoramaOptions = new StreetViewPanoramaOptions(streetViewPanoramaCamera, str, latLng, num, b2, b3, b4, b5, b6, streetViewSource);
        return streetViewPanoramaOptions;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new StreetViewPanoramaOptions[i];
    }
}
