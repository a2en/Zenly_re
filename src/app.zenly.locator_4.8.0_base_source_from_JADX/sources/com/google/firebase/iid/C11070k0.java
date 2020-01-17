package com.google.firebase.iid;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: com.google.firebase.iid.k0 */
final class C11070k0 implements Creator<zzm> {
    C11070k0() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder != null) {
            return new zzm(readStrongBinder);
        }
        return null;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzm[i];
    }
}
