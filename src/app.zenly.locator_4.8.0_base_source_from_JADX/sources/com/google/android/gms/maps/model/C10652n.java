package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.maps.model.n */
public final class C10652n implements Creator<GroundOverlayOptions> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = SafeParcelReader.m25542b(parcel);
        IBinder iBinder = null;
        LatLng latLng = null;
        LatLngBounds latLngBounds = null;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        boolean z = false;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m25536a(parcel);
            switch (SafeParcelReader.m25535a(a)) {
                case 2:
                    iBinder = SafeParcelReader.m25567x(parcel2, a);
                    break;
                case 3:
                    latLng = (LatLng) SafeParcelReader.m25537a(parcel2, a, LatLng.CREATOR);
                    break;
                case 4:
                    f = SafeParcelReader.m25565v(parcel2, a);
                    break;
                case 5:
                    f2 = SafeParcelReader.m25565v(parcel2, a);
                    break;
                case 6:
                    latLngBounds = (LatLngBounds) SafeParcelReader.m25537a(parcel2, a, LatLngBounds.CREATOR);
                    break;
                case 7:
                    f3 = SafeParcelReader.m25565v(parcel2, a);
                    break;
                case 8:
                    f4 = SafeParcelReader.m25565v(parcel2, a);
                    break;
                case 9:
                    z = SafeParcelReader.m25562s(parcel2, a);
                    break;
                case 10:
                    f5 = SafeParcelReader.m25565v(parcel2, a);
                    break;
                case 11:
                    f6 = SafeParcelReader.m25565v(parcel2, a);
                    break;
                case 12:
                    f7 = SafeParcelReader.m25565v(parcel2, a);
                    break;
                case 13:
                    z2 = SafeParcelReader.m25562s(parcel2, a);
                    break;
                default:
                    SafeParcelReader.m25534D(parcel2, a);
                    break;
            }
        }
        SafeParcelReader.m25561r(parcel2, b);
        GroundOverlayOptions groundOverlayOptions = new GroundOverlayOptions(iBinder, latLng, f, f2, latLngBounds, f3, f4, z, f5, f6, f7, z2);
        return groundOverlayOptions;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GroundOverlayOptions[i];
    }
}
