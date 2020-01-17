package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.zzj;
import java.util.List;

/* renamed from: com.google.android.gms.internal.location.j0 */
public final class C10503j0 implements Creator<zzm> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m25542b(parcel);
        zzj zzj = zzm.f27462i;
        List<ClientIdentity> list = zzm.f27461h;
        String str = null;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m25536a(parcel);
            int a2 = SafeParcelReader.m25535a(a);
            if (a2 == 1) {
                zzj = (zzj) SafeParcelReader.m25537a(parcel, a, zzj.CREATOR);
            } else if (a2 == 2) {
                list = SafeParcelReader.m25546c(parcel, a, ClientIdentity.CREATOR);
            } else if (a2 != 3) {
                SafeParcelReader.m25534D(parcel, a);
            } else {
                str = SafeParcelReader.m25558o(parcel, a);
            }
        }
        SafeParcelReader.m25561r(parcel, b);
        return new zzm(zzj, list, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzm[i];
    }
}
