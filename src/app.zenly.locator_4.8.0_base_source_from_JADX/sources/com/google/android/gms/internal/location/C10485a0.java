package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.LocationRequest;
import java.util.List;

/* renamed from: com.google.android.gms.internal.location.a0 */
public final class C10485a0 implements Creator<zzbd> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m25542b(parcel);
        List<ClientIdentity> list = zzbd.f27438l;
        LocationRequest locationRequest = null;
        String str = null;
        String str2 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m25536a(parcel);
            int a2 = SafeParcelReader.m25535a(a);
            if (a2 != 1) {
                switch (a2) {
                    case 5:
                        list = SafeParcelReader.m25546c(parcel, a, ClientIdentity.CREATOR);
                        break;
                    case 6:
                        str = SafeParcelReader.m25558o(parcel, a);
                        break;
                    case 7:
                        z = SafeParcelReader.m25562s(parcel, a);
                        break;
                    case 8:
                        z2 = SafeParcelReader.m25562s(parcel, a);
                        break;
                    case 9:
                        z3 = SafeParcelReader.m25562s(parcel, a);
                        break;
                    case 10:
                        str2 = SafeParcelReader.m25558o(parcel, a);
                        break;
                    default:
                        SafeParcelReader.m25534D(parcel, a);
                        break;
                }
            } else {
                locationRequest = (LocationRequest) SafeParcelReader.m25537a(parcel, a, LocationRequest.CREATOR);
            }
        }
        SafeParcelReader.m25561r(parcel, b);
        zzbd zzbd = new zzbd(locationRequest, list, str, z, z2, z3, str2);
        return zzbd;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbd[i];
    }
}
