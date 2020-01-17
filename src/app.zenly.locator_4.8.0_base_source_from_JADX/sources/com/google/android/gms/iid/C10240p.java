package com.google.android.gms.iid;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: com.google.android.gms.iid.p */
final class C10240p implements Creator<MessengerCompat> {
    C10240p() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder != null) {
            return new MessengerCompat(readStrongBinder);
        }
        return null;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new MessengerCompat[i];
    }
}
