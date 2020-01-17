package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.zzal;

/* renamed from: com.google.android.gms.internal.location.m */
public final class C10508m extends C10484a implements zzao {
    C10508m(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    public final Location zza(String str) throws RemoteException {
        Parcel a = mo28309a();
        a.writeString(str);
        Parcel a2 = mo28310a(21, a);
        Location location = (Location) C10497g0.m26877a(a2, Location.CREATOR);
        a2.recycle();
        return location;
    }

    public final void zza(long j, boolean z, PendingIntent pendingIntent) throws RemoteException {
        Parcel a = mo28309a();
        a.writeLong(j);
        C10497g0.m26880a(a, true);
        C10497g0.m26879a(a, (Parcelable) pendingIntent);
        mo28312b(5, a);
    }

    public final void zza(PendingIntent pendingIntent, IStatusCallback iStatusCallback) throws RemoteException {
        Parcel a = mo28309a();
        C10497g0.m26879a(a, (Parcelable) pendingIntent);
        C10497g0.m26878a(a, (IInterface) iStatusCallback);
        mo28312b(73, a);
    }

    public final void zza(Location location) throws RemoteException {
        Parcel a = mo28309a();
        C10497g0.m26879a(a, (Parcelable) location);
        mo28312b(13, a);
    }

    public final void zza(zzaj zzaj) throws RemoteException {
        Parcel a = mo28309a();
        C10497g0.m26878a(a, (IInterface) zzaj);
        mo28312b(67, a);
    }

    public final void zza(zzbf zzbf) throws RemoteException {
        Parcel a = mo28309a();
        C10497g0.m26879a(a, (Parcelable) zzbf);
        mo28312b(59, a);
    }

    public final void zza(zzo zzo) throws RemoteException {
        Parcel a = mo28309a();
        C10497g0.m26879a(a, (Parcelable) zzo);
        mo28312b(75, a);
    }

    public final void zza(ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent, IStatusCallback iStatusCallback) throws RemoteException {
        Parcel a = mo28309a();
        C10497g0.m26879a(a, (Parcelable) activityTransitionRequest);
        C10497g0.m26879a(a, (Parcelable) pendingIntent);
        C10497g0.m26878a(a, (IInterface) iStatusCallback);
        mo28312b(72, a);
    }

    public final void zza(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, zzam zzam) throws RemoteException {
        Parcel a = mo28309a();
        C10497g0.m26879a(a, (Parcelable) geofencingRequest);
        C10497g0.m26879a(a, (Parcelable) pendingIntent);
        C10497g0.m26878a(a, (IInterface) zzam);
        mo28312b(57, a);
    }

    public final void zza(LocationSettingsRequest locationSettingsRequest, zzaq zzaq, String str) throws RemoteException {
        Parcel a = mo28309a();
        C10497g0.m26879a(a, (Parcelable) locationSettingsRequest);
        C10497g0.m26878a(a, (IInterface) zzaq);
        a.writeString(str);
        mo28312b(63, a);
    }

    public final void zza(zzal zzal, zzam zzam) throws RemoteException {
        Parcel a = mo28309a();
        C10497g0.m26879a(a, (Parcelable) zzal);
        C10497g0.m26878a(a, (IInterface) zzam);
        mo28312b(74, a);
    }

    public final void zza(boolean z) throws RemoteException {
        Parcel a = mo28309a();
        C10497g0.m26880a(a, z);
        mo28312b(12, a);
    }

    public final LocationAvailability zzb(String str) throws RemoteException {
        Parcel a = mo28309a();
        a.writeString(str);
        Parcel a2 = mo28310a(34, a);
        LocationAvailability locationAvailability = (LocationAvailability) C10497g0.m26877a(a2, LocationAvailability.CREATOR);
        a2.recycle();
        return locationAvailability;
    }

    public final void zzb(PendingIntent pendingIntent) throws RemoteException {
        Parcel a = mo28309a();
        C10497g0.m26879a(a, (Parcelable) pendingIntent);
        mo28312b(6, a);
    }
}
