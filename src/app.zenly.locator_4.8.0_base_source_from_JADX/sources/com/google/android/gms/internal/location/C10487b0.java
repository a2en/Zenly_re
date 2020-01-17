package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.internal.location.b0 */
public final class C10487b0 implements Creator<zzbf> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m25542b(parcel);
        zzbd zzbd = null;
        IBinder iBinder = null;
        PendingIntent pendingIntent = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        int i = 1;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m25536a(parcel);
            switch (SafeParcelReader.m25535a(a)) {
                case 1:
                    i = SafeParcelReader.m25568y(parcel, a);
                    break;
                case 2:
                    zzbd = (zzbd) SafeParcelReader.m25537a(parcel, a, zzbd.CREATOR);
                    break;
                case 3:
                    iBinder = SafeParcelReader.m25567x(parcel, a);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) SafeParcelReader.m25537a(parcel, a, PendingIntent.CREATOR);
                    break;
                case 5:
                    iBinder2 = SafeParcelReader.m25567x(parcel, a);
                    break;
                case 6:
                    iBinder3 = SafeParcelReader.m25567x(parcel, a);
                    break;
                default:
                    SafeParcelReader.m25534D(parcel, a);
                    break;
            }
        }
        SafeParcelReader.m25561r(parcel, b);
        zzbf zzbf = new zzbf(i, zzbd, iBinder, pendingIntent, iBinder2, iBinder3);
        return zzbf;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbf[i];
    }
}
