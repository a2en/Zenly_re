package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.Tile;

/* renamed from: com.google.android.gms.internal.maps.g */
public final class C10537g extends C10531a implements zzaf {
    C10537g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.ITileProviderDelegate");
    }

    public final Tile getTile(int i, int i2, int i3) throws RemoteException {
        Parcel a = mo28411a();
        a.writeInt(i);
        a.writeInt(i2);
        a.writeInt(i3);
        Parcel a2 = mo28412a(1, a);
        Tile tile = (Tile) C10539i.m26943a(a2, Tile.CREATOR);
        a2.recycle();
        return tile;
    }
}
