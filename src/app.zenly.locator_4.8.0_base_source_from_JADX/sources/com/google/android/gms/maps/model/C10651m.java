package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.List;

/* renamed from: com.google.android.gms.maps.model.m */
public final class C10651m implements Creator<CircleOptions> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = SafeParcelReader.m25542b(parcel);
        LatLng latLng = null;
        List list = null;
        double d = 0.0d;
        float f = 0.0f;
        int i = 0;
        int i2 = 0;
        float f2 = 0.0f;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m25536a(parcel);
            switch (SafeParcelReader.m25535a(a)) {
                case 2:
                    latLng = (LatLng) SafeParcelReader.m25537a(parcel2, a, LatLng.CREATOR);
                    break;
                case 3:
                    d = SafeParcelReader.m25564u(parcel2, a);
                    break;
                case 4:
                    f = SafeParcelReader.m25565v(parcel2, a);
                    break;
                case 5:
                    i = SafeParcelReader.m25568y(parcel2, a);
                    break;
                case 6:
                    i2 = SafeParcelReader.m25568y(parcel2, a);
                    break;
                case 7:
                    f2 = SafeParcelReader.m25565v(parcel2, a);
                    break;
                case 8:
                    z = SafeParcelReader.m25562s(parcel2, a);
                    break;
                case 9:
                    z2 = SafeParcelReader.m25562s(parcel2, a);
                    break;
                case 10:
                    list = SafeParcelReader.m25546c(parcel2, a, PatternItem.CREATOR);
                    break;
                default:
                    SafeParcelReader.m25534D(parcel2, a);
                    break;
            }
        }
        SafeParcelReader.m25561r(parcel2, b);
        CircleOptions circleOptions = new CircleOptions(latLng, d, f, i, i2, f2, z, z2, list);
        return circleOptions;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new CircleOptions[i];
    }
}
