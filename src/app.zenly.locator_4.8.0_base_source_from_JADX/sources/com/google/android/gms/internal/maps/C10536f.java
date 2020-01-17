package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.Tile;

/* renamed from: com.google.android.gms.internal.maps.f */
public abstract class C10536f extends C10538h implements zzaf {
    public C10536f() {
        super("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
    }

    /* renamed from: a */
    public static zzaf m26940a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
        if (queryLocalInterface instanceof zzaf) {
            return (zzaf) queryLocalInterface;
        }
        return new C10537g(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo28456a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        Tile tile = getTile(parcel.readInt(), parcel.readInt(), parcel.readInt());
        parcel2.writeNoException();
        C10539i.m26949b(parcel2, tile);
        return true;
    }
}
