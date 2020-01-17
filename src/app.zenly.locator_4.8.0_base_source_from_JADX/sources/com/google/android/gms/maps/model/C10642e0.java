package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.maps.model.e0 */
public final class C10642e0 implements Creator<TileOverlayOptions> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m25542b(parcel);
        IBinder iBinder = null;
        boolean z = false;
        float f = 0.0f;
        boolean z2 = true;
        float f2 = 0.0f;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m25536a(parcel);
            int a2 = SafeParcelReader.m25535a(a);
            if (a2 == 2) {
                iBinder = SafeParcelReader.m25567x(parcel, a);
            } else if (a2 == 3) {
                z = SafeParcelReader.m25562s(parcel, a);
            } else if (a2 == 4) {
                f = SafeParcelReader.m25565v(parcel, a);
            } else if (a2 == 5) {
                z2 = SafeParcelReader.m25562s(parcel, a);
            } else if (a2 != 6) {
                SafeParcelReader.m25534D(parcel, a);
            } else {
                f2 = SafeParcelReader.m25565v(parcel, a);
            }
        }
        SafeParcelReader.m25561r(parcel, b);
        TileOverlayOptions tileOverlayOptions = new TileOverlayOptions(iBinder, z, f, z2, f2);
        return tileOverlayOptions;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new TileOverlayOptions[i];
    }
}
