package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.maps.model.u */
public final class C10659u implements Creator<PolygonOptions> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m25542b(parcel);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = null;
        List list = null;
        float f = 0.0f;
        int i = 0;
        int i2 = 0;
        float f2 = 0.0f;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m25536a(parcel);
            switch (SafeParcelReader.m25535a(a)) {
                case 2:
                    arrayList2 = SafeParcelReader.m25546c(parcel, a, LatLng.CREATOR);
                    break;
                case 3:
                    SafeParcelReader.m25541a(parcel, a, (List) arrayList, C10659u.class.getClassLoader());
                    break;
                case 4:
                    f = SafeParcelReader.m25565v(parcel, a);
                    break;
                case 5:
                    i = SafeParcelReader.m25568y(parcel, a);
                    break;
                case 6:
                    i2 = SafeParcelReader.m25568y(parcel, a);
                    break;
                case 7:
                    f2 = SafeParcelReader.m25565v(parcel, a);
                    break;
                case 8:
                    z = SafeParcelReader.m25562s(parcel, a);
                    break;
                case 9:
                    z2 = SafeParcelReader.m25562s(parcel, a);
                    break;
                case 10:
                    z3 = SafeParcelReader.m25562s(parcel, a);
                    break;
                case 11:
                    i3 = SafeParcelReader.m25568y(parcel, a);
                    break;
                case 12:
                    list = SafeParcelReader.m25546c(parcel, a, PatternItem.CREATOR);
                    break;
                default:
                    SafeParcelReader.m25534D(parcel, a);
                    break;
            }
        }
        SafeParcelReader.m25561r(parcel, b);
        PolygonOptions polygonOptions = new PolygonOptions(arrayList2, arrayList, f, i, i2, f2, z, z2, z3, i3, list);
        return polygonOptions;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PolygonOptions[i];
    }
}
