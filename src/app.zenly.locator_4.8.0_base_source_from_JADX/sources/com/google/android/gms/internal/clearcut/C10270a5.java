package com.google.android.gms.internal.clearcut;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.clearcut.zzc;
import com.google.android.gms.clearcut.zze;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: com.google.android.gms.internal.clearcut.a5 */
public abstract class C10270a5 extends C10419w implements zzl {
    public C10270a5() {
        super("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo27797a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                zza((Status) C10414v0.m26556a(parcel, Status.CREATOR));
                break;
            case 2:
                zzb((Status) C10414v0.m26556a(parcel, Status.CREATOR));
                break;
            case 3:
                zza((Status) C10414v0.m26556a(parcel, Status.CREATOR), parcel.readLong());
                break;
            case 4:
                zzc((Status) C10414v0.m26556a(parcel, Status.CREATOR));
                break;
            case 5:
                zzb((Status) C10414v0.m26556a(parcel, Status.CREATOR), parcel.readLong());
                break;
            case 6:
                zza((Status) C10414v0.m26556a(parcel, Status.CREATOR), (zze[]) parcel.createTypedArray(zze.CREATOR));
                break;
            case 7:
                zza((DataHolder) C10414v0.m26556a(parcel, DataHolder.CREATOR));
                break;
            case 8:
                zza((Status) C10414v0.m26556a(parcel, Status.CREATOR), (zzc) C10414v0.m26556a(parcel, zzc.CREATOR));
                break;
            case 9:
                zzb((Status) C10414v0.m26556a(parcel, Status.CREATOR), (zzc) C10414v0.m26556a(parcel, zzc.CREATOR));
                break;
            default:
                return false;
        }
        return true;
    }
}
