package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.location.l */
public abstract class C10506l extends C10527w implements zzam {
    public C10506l() {
        super("com.google.android.gms.location.internal.IGeofencerCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo28330a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zza(parcel.readInt(), parcel.createStringArray());
        } else if (i == 2) {
            zzb(parcel.readInt(), parcel.createStringArray());
        } else if (i != 3) {
            return false;
        } else {
            zza(parcel.readInt(), (PendingIntent) C10497g0.m26877a(parcel, PendingIntent.CREATOR));
        }
        return true;
    }
}
